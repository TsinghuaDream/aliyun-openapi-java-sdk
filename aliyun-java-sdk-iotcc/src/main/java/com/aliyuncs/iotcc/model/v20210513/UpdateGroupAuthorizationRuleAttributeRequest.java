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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateGroupAuthorizationRuleAttributeRequest extends RpcAcsRequest<UpdateGroupAuthorizationRuleAttributeResponse> {
	   

	private String clientToken;

	private String destinationType;

	private String destination;

	private String protocol;

	private String authorizationRuleDescription;

	private String policy;

	private String ioTCloudConnectorGroupId;

	private Boolean dryRun;

	private List<String> sourceCidrss;

	private String authorizationRuleName;

	private String authorizationRuleId;

	private String destinationPort;
	public UpdateGroupAuthorizationRuleAttributeRequest() {
		super("IoTCC", "2021-05-13", "UpdateGroupAuthorizationRuleAttribute", "IoTCC");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDestinationType() {
		return this.destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
		if(destinationType != null){
			putQueryParameter("DestinationType", destinationType);
		}
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
		if(destination != null){
			putQueryParameter("Destination", destination);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getAuthorizationRuleDescription() {
		return this.authorizationRuleDescription;
	}

	public void setAuthorizationRuleDescription(String authorizationRuleDescription) {
		this.authorizationRuleDescription = authorizationRuleDescription;
		if(authorizationRuleDescription != null){
			putQueryParameter("AuthorizationRuleDescription", authorizationRuleDescription);
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public String getIoTCloudConnectorGroupId() {
		return this.ioTCloudConnectorGroupId;
	}

	public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
		this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		if(ioTCloudConnectorGroupId != null){
			putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<String> getSourceCidrss() {
		return this.sourceCidrss;
	}

	public void setSourceCidrss(List<String> sourceCidrss) {
		this.sourceCidrss = sourceCidrss;	
		if (sourceCidrss != null) {
			for (int i = 0; i < sourceCidrss.size(); i++) {
				putQueryParameter("SourceCidrs." + (i + 1) , sourceCidrss.get(i));
			}
		}	
	}

	public String getAuthorizationRuleName() {
		return this.authorizationRuleName;
	}

	public void setAuthorizationRuleName(String authorizationRuleName) {
		this.authorizationRuleName = authorizationRuleName;
		if(authorizationRuleName != null){
			putQueryParameter("AuthorizationRuleName", authorizationRuleName);
		}
	}

	public String getAuthorizationRuleId() {
		return this.authorizationRuleId;
	}

	public void setAuthorizationRuleId(String authorizationRuleId) {
		this.authorizationRuleId = authorizationRuleId;
		if(authorizationRuleId != null){
			putQueryParameter("AuthorizationRuleId", authorizationRuleId);
		}
	}

	public String getDestinationPort() {
		return this.destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
		if(destinationPort != null){
			putQueryParameter("DestinationPort", destinationPort);
		}
	}

	@Override
	public Class<UpdateGroupAuthorizationRuleAttributeResponse> getResponseClass() {
		return UpdateGroupAuthorizationRuleAttributeResponse.class;
	}

}
