package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p204p.ftv0;
import p204p.hg40;
import p204p.nhg1;
import p204p.xul0;
import p204p.zh21;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class LoggingParams {
    public static final LoggingParams EMPTY = builder().build();

    /* JADX INFO: loaded from: classes9.dex */
    public static abstract class Builder {
        public Builder() {
            int i = hg40.f91023c;
            ftv0 ftv0Var = ftv0.f73317t;
            pageInstanceIds(ftv0Var);
            interactionIds(ftv0Var);
        }

        public static Builder builder() {
            return LoggingParams.builder();
        }

        public abstract LoggingParams build();

        public abstract Builder commandId(String str);

        public abstract Builder commandInitiatedTime(Long l);

        public abstract Builder commandReceivedTime(Long l);

        public Builder interactionId(String str) {
            int i = hg40.f91023c;
            return interactionIds(new zh21(str));
        }

        public abstract Builder interactionIds(hg40 hg40Var);

        public Builder pageInstanceId(String str) {
            int i = hg40.f91023c;
            return pageInstanceIds(new zh21(str));
        }

        public abstract Builder pageInstanceIds(hg40 hg40Var);
    }

    public static Builder builder() {
        return new AutoValue_LoggingParams.Builder();
    }

    public abstract xul0 commandId();

    public abstract xul0 commandInitiatedTime();

    public abstract xul0 commandReceivedTime();

    public xul0 interactionId() {
        return xul0.m92200a((String) nhg1.m64501u(interactionIds()));
    }

    public abstract hg40 interactionIds();

    public xul0 pageInstanceId() {
        return xul0.m92200a((String) nhg1.m64501u(pageInstanceIds()));
    }

    public abstract hg40 pageInstanceIds();

    public abstract Builder toBuilder();
}
