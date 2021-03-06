/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jenkins.x.client.kube;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PipelineActivityStep implements Serializable {
    private String kind;
    private StageActivityStep stage;
    private PromoteActivityStep promote;
    private PreviewActivityStep preview;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public StageActivityStep getStage() {
        return stage;
    }

    public void setStage(StageActivityStep stage) {
        this.stage = stage;
    }

    public PromoteActivityStep getPromote() {
        return promote;
    }

    public void setPromote(PromoteActivityStep promote) {
        this.promote = promote;
    }

    public PreviewActivityStep getPreview() {
        return preview;
    }

    public void setPreview(PreviewActivityStep preview) {
        this.preview = preview;
    }
}
