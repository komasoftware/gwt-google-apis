/**
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.visualization.client;

/**
 * Name/value map with additional properties.
 */
public class Properties extends com.google.gwt.ajaxloader.client.Properties {
  protected Properties() {
  }

  /**
   * @deprecated 
   * Use {@link com.google.gwt.ajaxloader.client.Properties#getNumber(String)} 
   * instead.
   */
  @Deprecated
  public final native int getInt(String name) /*-{
    return this[name];
  }-*/;
}
