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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListFilesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListFilesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListFilesResponse.Data.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFilesResponseUnmarshaller {

	public static ListFilesResponse unmarshall(ListFilesResponse listFilesResponse, UnmarshallerContext _ctx) {
		
		listFilesResponse.setRequestId(_ctx.stringValue("ListFilesResponse.RequestId"));
		listFilesResponse.setHttpStatusCode(_ctx.integerValue("ListFilesResponse.HttpStatusCode"));
		listFilesResponse.setErrorMessage(_ctx.stringValue("ListFilesResponse.ErrorMessage"));
		listFilesResponse.setErrorCode(_ctx.stringValue("ListFilesResponse.ErrorCode"));
		listFilesResponse.setSuccess(_ctx.booleanValue("ListFilesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListFilesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListFilesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListFilesResponse.Data.TotalCount"));

		List<File> files = new ArrayList<File>();
		for (int i = 0; i < _ctx.lengthValue("ListFilesResponse.Data.Files.Length"); i++) {
			File file = new File();
			file.setCommitStatus(_ctx.integerValue("ListFilesResponse.Data.Files["+ i +"].CommitStatus"));
			file.setAutoParsing(_ctx.booleanValue("ListFilesResponse.Data.Files["+ i +"].AutoParsing"));
			file.setOwner(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].Owner"));
			file.setCreateTime(_ctx.longValue("ListFilesResponse.Data.Files["+ i +"].CreateTime"));
			file.setFileType(_ctx.integerValue("ListFilesResponse.Data.Files["+ i +"].FileType"));
			file.setCurrentVersion(_ctx.integerValue("ListFilesResponse.Data.Files["+ i +"].CurrentVersion"));
			file.setBizId(_ctx.longValue("ListFilesResponse.Data.Files["+ i +"].BizId"));
			file.setLastEditUser(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].LastEditUser"));
			file.setFileName(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].FileName"));
			file.setConnectionName(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].ConnectionName"));
			file.setUseType(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].UseType"));
			file.setFileFolderId(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].FileFolderId"));
			file.setFileId(_ctx.longValue("ListFilesResponse.Data.Files["+ i +"].FileId"));
			file.setParentId(_ctx.longValue("ListFilesResponse.Data.Files["+ i +"].ParentId"));
			file.setCreateUser(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].CreateUser"));
			file.setIsMaxCompute(_ctx.booleanValue("ListFilesResponse.Data.Files["+ i +"].IsMaxCompute"));
			file.setBusinessId(_ctx.longValue("ListFilesResponse.Data.Files["+ i +"].BusinessId"));
			file.setFileDescription(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].FileDescription"));
			file.setLastEditTime(_ctx.longValue("ListFilesResponse.Data.Files["+ i +"].LastEditTime"));
			file.setContent(_ctx.stringValue("ListFilesResponse.Data.Files["+ i +"].Content"));
			file.setNodeId(_ctx.longValue("ListFilesResponse.Data.Files["+ i +"].NodeId"));

			files.add(file);
		}
		data.setFiles(files);
		listFilesResponse.setData(data);
	 
	 	return listFilesResponse;
	}
}