/*
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.config;

import com.streamsets.pipeline.api.GenerateResourceBundle;
import com.streamsets.pipeline.api.Label;

@GenerateResourceBundle
public enum LogMode implements Label {

  COMMON_LOG_FORMAT("Common Log Format"),
  COMBINED_LOG_FORMAT("Combined Log Format"),
  APACHE_ERROR_LOG_FORMAT("Apache Error Log Format"),
  APACHE_CUSTOM_LOG_FORMAT("Apache Access Log Custom Format"),
  REGEX("Regular Expression"),
  GROK("Grok Pattern"),
  LOG4J("Log4j")
  ;

  private final String label;

  LogMode(String label) {
    this.label = label;

  }

  @Override
  public String getLabel() {
    return label;
  }

}
