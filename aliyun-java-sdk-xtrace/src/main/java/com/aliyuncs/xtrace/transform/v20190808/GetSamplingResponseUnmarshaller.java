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

package com.aliyuncs.xtrace.transform.v20190808;

import com.aliyuncs.xtrace.model.v20190808.GetSamplingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSamplingResponseUnmarshaller {

	public static GetSamplingResponse unmarshall(GetSamplingResponse getSamplingResponse, UnmarshallerContext _ctx) {
		
		getSamplingResponse.setRequestId(_ctx.stringValue("GetSamplingResponse.RequestId"));
		getSamplingResponse.setData(_ctx.stringValue("GetSamplingResponse.Data"));
	 
	 	return getSamplingResponse;
	}
}