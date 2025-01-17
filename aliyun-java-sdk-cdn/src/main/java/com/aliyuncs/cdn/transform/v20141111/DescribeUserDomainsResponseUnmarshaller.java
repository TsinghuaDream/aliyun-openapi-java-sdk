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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeUserDomainsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeUserDomainsResponse.PageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserDomainsResponseUnmarshaller {

	public static DescribeUserDomainsResponse unmarshall(DescribeUserDomainsResponse describeUserDomainsResponse, UnmarshallerContext _ctx) {
		
		describeUserDomainsResponse.setRequestId(_ctx.stringValue("DescribeUserDomainsResponse.RequestId"));
		describeUserDomainsResponse.setPageNumber(_ctx.longValue("DescribeUserDomainsResponse.PageNumber"));
		describeUserDomainsResponse.setPageSize(_ctx.longValue("DescribeUserDomainsResponse.PageSize"));
		describeUserDomainsResponse.setTotalCount(_ctx.longValue("DescribeUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setGmtCreated(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setSslProtocol(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].SslProtocol"));
			pageData.setDescription(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setResourceGroupId(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSourceType(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].SourceType"));
			pageData.setSandbox(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].Sandbox"));
			pageData.setDomainStatus(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setCname(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setGmtModified(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setCdnType(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].CdnType"));
			pageData.setDomainName(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].DomainName"));

			List<String> sources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				sources.add(_ctx.stringValue("DescribeUserDomainsResponse.Domains["+ i +"].Sources["+ j +"]"));
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeUserDomainsResponse.setDomains(domains);
	 
	 	return describeUserDomainsResponse;
	}
}