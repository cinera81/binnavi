/*
Copyright 2014 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.Debug;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({com.google.security.zynamics.binnavi.Gui.Debug.Bookmarks.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.BreakpointTable.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.DebuggerMainPanel.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.EventLists.AllTests.class, com.google.security.zynamics.binnavi.Gui.Debug.History.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.RegisterPanel.AllTests.class, com.google.security.zynamics.binnavi.Gui.Debug.RemoteBrowser.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.StackPanel.AllTests.class, com.google.security.zynamics.binnavi.Gui.Debug.MemoryPanel.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.MemorySectionPanel.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.MemoryRefreshButton.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.ModulesPanel.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.ThreadInformationPanel.AllTests.class})
public final class AllTests {
}
