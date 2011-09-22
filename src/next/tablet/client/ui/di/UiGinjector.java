/*
 * Copyright 2011 Vancouver Ywebb Consulting Ltd
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
package next.tablet.client.ui.di;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * A Dependency Injection holding tablet IOC classes.
 * <p>
 * 
 * @author Atanas Roussev
 */
@GinModules(UiGinModule.class)
public interface UiGinjector extends Ginjector {

  public final static UiGinjector INSTANCE = GWT.create(UiGinjector.class);

  UiSingleton getUiSingleton();

  TabletEventBus getEventBus();

//  TabletPanel getTabletPanel();

}
