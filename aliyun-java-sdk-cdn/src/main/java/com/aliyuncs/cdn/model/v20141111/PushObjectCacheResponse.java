/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.PushObjectCacheResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PushObjectCacheResponse extends AcsResponse {

	private String pushTaskId;

	private String requestId;

	public String getPushTaskId() {
		return this.pushTaskId;
	}

	public void setPushTaskId(String pushTaskId) {
		this.pushTaskId = pushTaskId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public PushObjectCacheResponse getInstance(UnmarshallerContext context) {
		return	PushObjectCacheResponseUnmarshaller.unmarshall(this, context);
	}
}
