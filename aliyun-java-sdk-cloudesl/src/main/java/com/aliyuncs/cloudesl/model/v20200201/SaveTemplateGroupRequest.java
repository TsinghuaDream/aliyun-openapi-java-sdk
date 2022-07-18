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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveTemplateGroupRequest extends RpcAcsRequest<SaveTemplateGroupResponse> {
	   

	private String templateVersion;

	private String eslModelId;

	private String groupId;

	private Integer widthPx;

	private String groupName;

	private Integer heightPx;
	public SaveTemplateGroupRequest() {
		super("cloudesl", "2020-02-01", "SaveTemplateGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		if(templateVersion != null){
			putBodyParameter("TemplateVersion", templateVersion);
		}
	}

	public String getEslModelId() {
		return this.eslModelId;
	}

	public void setEslModelId(String eslModelId) {
		this.eslModelId = eslModelId;
		if(eslModelId != null){
			putBodyParameter("EslModelId", eslModelId);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	public Integer getWidthPx() {
		return this.widthPx;
	}

	public void setWidthPx(Integer widthPx) {
		this.widthPx = widthPx;
		if(widthPx != null){
			putBodyParameter("WidthPx", widthPx.toString());
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putBodyParameter("GroupName", groupName);
		}
	}

	public Integer getHeightPx() {
		return this.heightPx;
	}

	public void setHeightPx(Integer heightPx) {
		this.heightPx = heightPx;
		if(heightPx != null){
			putBodyParameter("HeightPx", heightPx.toString());
		}
	}

	@Override
	public Class<SaveTemplateGroupResponse> getResponseClass() {
		return SaveTemplateGroupResponse.class;
	}

}
