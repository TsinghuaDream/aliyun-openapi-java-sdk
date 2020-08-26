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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryAIJobsResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryAIJobsResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryAIJobsResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAIJobsResponseUnmarshaller {

	public static QueryAIJobsResponse unmarshall(QueryAIJobsResponse queryAIJobsResponse, UnmarshallerContext _ctx) {
		
		queryAIJobsResponse.setRequestId(_ctx.stringValue("QueryAIJobsResponse.RequestId"));
		queryAIJobsResponse.setSuccess(_ctx.booleanValue("QueryAIJobsResponse.Success"));
		queryAIJobsResponse.setErrorMessage(_ctx.stringValue("QueryAIJobsResponse.ErrorMessage"));
		queryAIJobsResponse.setCode(_ctx.stringValue("QueryAIJobsResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("QueryAIJobsResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryAIJobsResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryAIJobsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryAIJobsResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAIJobsResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setJobId(_ctx.stringValue("QueryAIJobsResponse.Data.List["+ i +"].JobId"));
			listItem.setActionId(_ctx.stringValue("QueryAIJobsResponse.Data.List["+ i +"].ActionId"));
			listItem.setStatus(_ctx.integerValue("QueryAIJobsResponse.Data.List["+ i +"].Status"));
			listItem.setIotId(_ctx.stringValue("QueryAIJobsResponse.Data.List["+ i +"].IotId"));

			list.add(listItem);
		}
		data.setList(list);
		queryAIJobsResponse.setData(data);
	 
	 	return queryAIJobsResponse;
	}
}