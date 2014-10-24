/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.restapi.configuration;

import com.streamsets.pipeline.stagelibrary.StageLibrary;
import org.glassfish.hk2.api.Factory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

public class StageLibraryInjector implements Factory<StageLibrary> {
  public static final String STAGE_LIBRARY = "stage-library";

  private StageLibrary library;

  @Inject
  public StageLibraryInjector(HttpServletRequest request) {
    library = (StageLibrary) request.getServletContext().getAttribute(STAGE_LIBRARY);
  }

  @Override
  public StageLibrary provide() {
    return library;
  }

  @Override
  public void dispose(StageLibrary library) {
  }

}
