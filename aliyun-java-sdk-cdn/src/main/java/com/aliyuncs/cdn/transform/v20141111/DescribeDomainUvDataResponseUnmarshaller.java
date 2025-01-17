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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainUvDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainUvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainUvDataResponseUnmarshaller {

	public static DescribeDomainUvDataResponse unmarshall(DescribeDomainUvDataResponse describeDomainUvDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainUvDataResponse.setRequestId(_ctx.stringValue("DescribeDomainUvDataResponse.RequestId"));
		describeDomainUvDataResponse.setEndTime(_ctx.stringValue("DescribeDomainUvDataResponse.EndTime"));
		describeDomainUvDataResponse.setStartTime(_ctx.stringValue("DescribeDomainUvDataResponse.StartTime"));
		describeDomainUvDataResponse.setDomainName(_ctx.stringValue("DescribeDomainUvDataResponse.DomainName"));
		describeDomainUvDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainUvDataResponse.DataInterval"));

		List<UsageData> uvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainUvDataResponse.UvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setValue(_ctx.stringValue("DescribeDomainUvDataResponse.UvDataInterval["+ i +"].Value"));
			usageData.setTimeStamp(_ctx.stringValue("DescribeDomainUvDataResponse.UvDataInterval["+ i +"].TimeStamp"));

			uvDataInterval.add(usageData);
		}
		describeDomainUvDataResponse.setUvDataInterval(uvDataInterval);
	 
	 	return describeDomainUvDataResponse;
	}
}