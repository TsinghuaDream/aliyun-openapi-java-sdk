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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeRefreshQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRefreshQuotaResponse extends AcsResponse {

	private String preloadRemain;

	private String blockRemain;

	private String regexRemain;

	private String urlRemain;

	private String dirRemain;

	private String urlQuota;

	private String blockQuota;

	private String requestId;

	private String dirQuota;

	private String preloadEdgeQuota;

	private String preloadEdgeRemain;

	private String preloadQuota;

	private String regexQuota;

	public String getPreloadRemain() {
		return this.preloadRemain;
	}

	public void setPreloadRemain(String preloadRemain) {
		this.preloadRemain = preloadRemain;
	}

	public String getBlockRemain() {
		return this.blockRemain;
	}

	public void setBlockRemain(String blockRemain) {
		this.blockRemain = blockRemain;
	}

	public String getRegexRemain() {
		return this.regexRemain;
	}

	public void setRegexRemain(String regexRemain) {
		this.regexRemain = regexRemain;
	}

	public String getUrlRemain() {
		return this.urlRemain;
	}

	public void setUrlRemain(String urlRemain) {
		this.urlRemain = urlRemain;
	}

	public String getDirRemain() {
		return this.dirRemain;
	}

	public void setDirRemain(String dirRemain) {
		this.dirRemain = dirRemain;
	}

	public String getUrlQuota() {
		return this.urlQuota;
	}

	public void setUrlQuota(String urlQuota) {
		this.urlQuota = urlQuota;
	}

	public String getBlockQuota() {
		return this.blockQuota;
	}

	public void setBlockQuota(String blockQuota) {
		this.blockQuota = blockQuota;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDirQuota() {
		return this.dirQuota;
	}

	public void setDirQuota(String dirQuota) {
		this.dirQuota = dirQuota;
	}

	public String getPreloadEdgeQuota() {
		return this.preloadEdgeQuota;
	}

	public void setPreloadEdgeQuota(String preloadEdgeQuota) {
		this.preloadEdgeQuota = preloadEdgeQuota;
	}

	public String getPreloadEdgeRemain() {
		return this.preloadEdgeRemain;
	}

	public void setPreloadEdgeRemain(String preloadEdgeRemain) {
		this.preloadEdgeRemain = preloadEdgeRemain;
	}

	public String getPreloadQuota() {
		return this.preloadQuota;
	}

	public void setPreloadQuota(String preloadQuota) {
		this.preloadQuota = preloadQuota;
	}

	public String getRegexQuota() {
		return this.regexQuota;
	}

	public void setRegexQuota(String regexQuota) {
		this.regexQuota = regexQuota;
	}

	@Override
	public DescribeRefreshQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeRefreshQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}
