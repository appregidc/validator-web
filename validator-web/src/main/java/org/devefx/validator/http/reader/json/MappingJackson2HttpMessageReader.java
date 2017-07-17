/*
 * Copyright 2016-2017, Youqian Yue (devefx@163.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.devefx.validator.http.reader.json;

import org.devefx.validator.http.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MappingJackson2HttpMessageReader extends AbstractJackson2HttpMessageReader {

	public MappingJackson2HttpMessageReader() {
		this(new ObjectMapper());
	}

	public MappingJackson2HttpMessageReader(ObjectMapper objectMapper) {
		super(objectMapper, new MediaType("application", "json", DEFAULT_CHARSET),
				new MediaType("application", "*+json", DEFAULT_CHARSET));
	}
}