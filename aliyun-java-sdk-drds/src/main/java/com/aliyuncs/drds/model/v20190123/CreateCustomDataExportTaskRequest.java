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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCustomDataExportTaskRequest extends RpcAcsRequest<CreateCustomDataExportTaskResponse> {
	   

	private String exportParam;
	public CreateCustomDataExportTaskRequest() {
		super("Drds", "2019-01-23", "CreateCustomDataExportTask", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExportParam() {
		return this.exportParam;
	}

	public void setExportParam(String exportParam) {
		this.exportParam = exportParam;
		if(exportParam != null){
			putQueryParameter("ExportParam", exportParam);
		}
	}

	@Override
	public Class<CreateCustomDataExportTaskResponse> getResponseClass() {
		return CreateCustomDataExportTaskResponse.class;
	}

}