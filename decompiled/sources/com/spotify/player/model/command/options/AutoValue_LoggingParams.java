package com.spotify.player.model.command.options;

import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.hg40;
import p204p.klh;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_LoggingParams extends LoggingParams {
    private final xul0 commandId;
    private final xul0 commandInitiatedTime;
    private final xul0 commandReceivedTime;
    private final hg40 interactionIds;
    private final hg40 pageInstanceIds;

    public /* synthetic */ AutoValue_LoggingParams(xul0 xul0Var, xul0 xul0Var2, hg40 hg40Var, hg40 hg40Var2, xul0 xul0Var3, int i) {
        this(xul0Var, xul0Var2, hg40Var, hg40Var2, xul0Var3);
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    public xul0 commandId() {
        return this.commandId;
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    public xul0 commandInitiatedTime() {
        return this.commandInitiatedTime;
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    public xul0 commandReceivedTime() {
        return this.commandReceivedTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoggingParams) {
            LoggingParams loggingParams = (LoggingParams) obj;
            if (this.commandInitiatedTime.equals(loggingParams.commandInitiatedTime()) && this.commandReceivedTime.equals(loggingParams.commandReceivedTime()) && this.pageInstanceIds.equals(loggingParams.pageInstanceIds()) && this.interactionIds.equals(loggingParams.interactionIds()) && this.commandId.equals(loggingParams.commandId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.commandInitiatedTime.hashCode() ^ 1000003) * 1000003) ^ this.commandReceivedTime.hashCode()) * 1000003) ^ this.pageInstanceIds.hashCode()) * 1000003) ^ this.interactionIds.hashCode()) * 1000003) ^ this.commandId.hashCode();
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    public hg40 interactionIds() {
        return this.interactionIds;
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    public hg40 pageInstanceIds() {
        return this.pageInstanceIds;
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    public LoggingParams.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.commandInitiatedTime);
        String strValueOf2 = String.valueOf(this.commandReceivedTime);
        String strValueOf3 = String.valueOf(this.pageInstanceIds);
        String strValueOf4 = String.valueOf(this.interactionIds);
        String strValueOf5 = String.valueOf(this.commandId);
        StringBuilder sbM38573v = edb.m38573v("LoggingParams{commandInitiatedTime=", strValueOf, ", commandReceivedTime=", strValueOf2, ", pageInstanceIds=");
        klh.m56844p(sbM38573v, strValueOf3, ", interactionIds=", strValueOf4, ", commandId=");
        return dq60.m36616p(strValueOf5, "}", sbM38573v);
    }

    private AutoValue_LoggingParams(xul0 xul0Var, xul0 xul0Var2, hg40 hg40Var, hg40 hg40Var2, xul0 xul0Var3) {
        this.commandInitiatedTime = xul0Var;
        this.commandReceivedTime = xul0Var2;
        this.pageInstanceIds = hg40Var;
        this.interactionIds = hg40Var2;
        this.commandId = xul0Var3;
    }

    public static final class Builder extends LoggingParams.Builder {
        private xul0 commandId;
        private xul0 commandInitiatedTime;
        private xul0 commandReceivedTime;
        private hg40 interactionIds;
        private hg40 pageInstanceIds;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.commandInitiatedTime = c2244p5;
            this.commandReceivedTime = c2244p5;
            this.commandId = c2244p5;
        }

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams build() {
            if (this.pageInstanceIds != null && this.interactionIds != null) {
                return new AutoValue_LoggingParams(this.commandInitiatedTime, this.commandReceivedTime, this.pageInstanceIds, this.interactionIds, this.commandId, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.pageInstanceIds == null) {
                sb.append(" pageInstanceIds");
            }
            if (this.interactionIds == null) {
                sb.append(" interactionIds");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder commandId(String str) {
            this.commandId = xul0.m92201d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder commandInitiatedTime(Long l) {
            this.commandInitiatedTime = xul0.m92201d(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder commandReceivedTime(Long l) {
            this.commandReceivedTime = xul0.m92201d(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder interactionIds(hg40 hg40Var) {
            if (hg40Var == null) {
                throw new NullPointerException("Null interactionIds");
            }
            this.interactionIds = hg40Var;
            return this;
        }

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder pageInstanceIds(hg40 hg40Var) {
            if (hg40Var == null) {
                throw new NullPointerException("Null pageInstanceIds");
            }
            this.pageInstanceIds = hg40Var;
            return this;
        }

        public Builder(LoggingParams loggingParams) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.commandInitiatedTime = c2244p5;
            this.commandReceivedTime = c2244p5;
            this.commandId = c2244p5;
            this.commandInitiatedTime = loggingParams.commandInitiatedTime();
            this.commandReceivedTime = loggingParams.commandReceivedTime();
            this.pageInstanceIds = loggingParams.pageInstanceIds();
            this.interactionIds = loggingParams.interactionIds();
            this.commandId = loggingParams.commandId();
        }
    }
}
