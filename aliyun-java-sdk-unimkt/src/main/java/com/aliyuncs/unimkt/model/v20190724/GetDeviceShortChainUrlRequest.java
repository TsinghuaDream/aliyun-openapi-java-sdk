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

package com.aliyuncs.unimkt.model.v20190724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceShortChainUrlRequest extends RpcAcsRequest<GetDeviceShortChainUrlResponse> {
	   

	private Boolean longterm;

	private String url;
	public GetDeviceShortChainUrlRequest() {
		super("UniMkt", "2019-07-24", "GetDeviceShortChainUrl", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getLongterm() {
		return this.longterm;
	}

	public void setLongterm(Boolean longterm) {
		this.longterm = longterm;
		if(longterm != null){
			putBodyParameter("Longterm", longterm.toString());
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	@Override
	public Class<GetDeviceShortChainUrlResponse> getResponseClass() {
		return GetDeviceShortChainUrlResponse.class;
	}

}
