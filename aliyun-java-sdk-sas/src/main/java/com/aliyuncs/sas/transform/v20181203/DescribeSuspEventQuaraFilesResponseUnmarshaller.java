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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSuspEventQuaraFilesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventQuaraFilesResponse.QuaraFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventQuaraFilesResponseUnmarshaller {

	public static DescribeSuspEventQuaraFilesResponse unmarshall(DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFilesResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventQuaraFilesResponse.setRequestId(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.RequestId"));
		describeSuspEventQuaraFilesResponse.setCurrentPage(_ctx.integerValue("DescribeSuspEventQuaraFilesResponse.CurrentPage"));
		describeSuspEventQuaraFilesResponse.setPageSize(_ctx.integerValue("DescribeSuspEventQuaraFilesResponse.PageSize"));
		describeSuspEventQuaraFilesResponse.setTotalCount(_ctx.integerValue("DescribeSuspEventQuaraFilesResponse.TotalCount"));
		describeSuspEventQuaraFilesResponse.setCount(_ctx.integerValue("DescribeSuspEventQuaraFilesResponse.Count"));

		List<QuaraFile> quaraFiles = new ArrayList<QuaraFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles.Length"); i++) {
			QuaraFile quaraFile = new QuaraFile();
			quaraFile.setLink(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Link"));
			quaraFile.setStatus(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Status"));
			quaraFile.setEventName(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].EventName"));
			quaraFile.setInternetIp(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].InternetIp"));
			quaraFile.setIp(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Ip"));
			quaraFile.setTag(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Tag"));
			quaraFile.setInstanceId(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].InstanceId"));
			quaraFile.setUuid(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Uuid"));
			quaraFile.setEventType(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].EventType"));
			quaraFile.setInstanceName(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].InstanceName"));
			quaraFile.setPath(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Path"));
			quaraFile.setMd5(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Md5"));
			quaraFile.setId(_ctx.integerValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Id"));
			quaraFile.setModifyTime(_ctx.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].ModifyTime"));

			quaraFiles.add(quaraFile);
		}
		describeSuspEventQuaraFilesResponse.setQuaraFiles(quaraFiles);
	 
	 	return describeSuspEventQuaraFilesResponse;
	}
}