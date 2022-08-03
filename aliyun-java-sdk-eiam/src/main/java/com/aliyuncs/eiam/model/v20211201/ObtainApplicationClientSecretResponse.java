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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ObtainApplicationClientSecretResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ObtainApplicationClientSecretResponse extends AcsResponse {

	private String requestId;

	private ApplicationClientSecret applicationClientSecret;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationClientSecret getApplicationClientSecret() {
		return this.applicationClientSecret;
	}

	public void setApplicationClientSecret(ApplicationClientSecret applicationClientSecret) {
		this.applicationClientSecret = applicationClientSecret;
	}

	public static class ApplicationClientSecret {

		private String instanceId;

		private String applicationId;

		private String clientId;

		private String secretId;

		private String clientSecret;

		private String status;

		private Long lastUsedTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getSecretId() {
			return this.secretId;
		}

		public void setSecretId(String secretId) {
			this.secretId = secretId;
		}

		public String getClientSecret() {
			return this.clientSecret;
		}

		public void setClientSecret(String clientSecret) {
			this.clientSecret = clientSecret;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getLastUsedTime() {
			return this.lastUsedTime;
		}

		public void setLastUsedTime(Long lastUsedTime) {
			this.lastUsedTime = lastUsedTime;
		}
	}

	@Override
	public ObtainApplicationClientSecretResponse getInstance(UnmarshallerContext context) {
		return	ObtainApplicationClientSecretResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
