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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeSubDomainRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubDomainRecordsResponse extends AcsResponse {

	private Long totalCount;

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private List<Record> domainRecords;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Record> getDomainRecords() {
		return this.domainRecords;
	}

	public void setDomainRecords(List<Record> domainRecords) {
		this.domainRecords = domainRecords;
	}

	public static class Record {

		private String status;

		private String type;

		private Integer weight;

		private String value;

		private Long tTL;

		private String line;

		private String recordId;

		private Long priority;

		private String rR;

		private String domainName;

		private Boolean locked;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Long getTTL() {
			return this.tTL;
		}

		public void setTTL(Long tTL) {
			this.tTL = tTL;
		}

		public String getLine() {
			return this.line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public String getRR() {
			return this.rR;
		}

		public void setRR(String rR) {
			this.rR = rR;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Boolean getLocked() {
			return this.locked;
		}

		public void setLocked(Boolean locked) {
			this.locked = locked;
		}
	}

	@Override
	public DescribeSubDomainRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSubDomainRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
