package com.spotify.player.model;

import java.util.Map;
import p204p.edb;
import p204p.klh;
import p204p.xf40;
import p204p.y85;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_ContextTrack extends ContextTrack {
    private final xf40 metadata;
    private final String provider;
    private final String uid;
    private final String uri;

    public static final class Builder extends ContextTrack.Builder {
        private xf40 metadata;
        private String provider;
        private String uid;
        private String uri;

        public Builder() {
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack build() {
            if (this.uri != null && this.uid != null && this.metadata != null && this.provider != null) {
                return new AutoValue_ContextTrack(this.uri, this.uid, this.metadata, this.provider, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.uri == null) {
                sb.append(" uri");
            }
            if (this.uid == null) {
                sb.append(" uid");
            }
            if (this.metadata == null) {
                sb.append(" metadata");
            }
            if (this.provider == null) {
                sb.append(" provider");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder metadata(Map<String, String> map) {
            this.metadata = xf40.m90451c(map);
            return this;
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder provider(String str) {
            if (str == null) {
                throw new NullPointerException("Null provider");
            }
            this.provider = str;
            return this;
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder uid(String str) {
            if (str == null) {
                throw new NullPointerException("Null uid");
            }
            this.uid = str;
            return this;
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder uri(String str) {
            if (str == null) {
                throw new NullPointerException("Null uri");
            }
            this.uri = str;
            return this;
        }

        public Builder(ContextTrack contextTrack) {
            this.uri = contextTrack.uri();
            this.uid = contextTrack.uid();
            this.metadata = contextTrack.metadata();
            this.provider = contextTrack.provider();
        }
    }

    public /* synthetic */ AutoValue_ContextTrack(String str, String str2, xf40 xf40Var, String str3, int i) {
        this(str, str2, xf40Var, str3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextTrack) {
            ContextTrack contextTrack = (ContextTrack) obj;
            if (this.uri.equals(contextTrack.uri()) && this.uid.equals(contextTrack.uid())) {
                xf40 xf40Var = this.metadata;
                xf40 xf40VarMetadata = contextTrack.metadata();
                xf40Var.getClass();
                if (y85.m93065j(xf40VarMetadata, xf40Var) && this.provider.equals(contextTrack.provider())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.uid.hashCode()) * 1000003) ^ this.metadata.hashCode()) * 1000003) ^ this.provider.hashCode();
    }

    @Override // com.spotify.player.model.ContextTrack
    public xf40 metadata() {
        return this.metadata;
    }

    @Override // com.spotify.player.model.ContextTrack
    public String provider() {
        return this.provider;
    }

    @Override // com.spotify.player.model.ContextTrack
    public ContextTrack.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.uri;
        String str2 = this.uid;
        return klh.m56837i(edb.m38573v("ContextTrack{uri=", str, ", uid=", str2, ", metadata="), String.valueOf(this.metadata), ", provider=", this.provider, "}");
    }

    @Override // com.spotify.player.model.ContextTrack
    public String uid() {
        return this.uid;
    }

    @Override // com.spotify.player.model.ContextTrack
    public String uri() {
        return this.uri;
    }

    private AutoValue_ContextTrack(String str, String str2, xf40 xf40Var, String str3) {
        this.uri = str;
        this.uid = str2;
        this.metadata = xf40Var;
        this.provider = str3;
    }
}
