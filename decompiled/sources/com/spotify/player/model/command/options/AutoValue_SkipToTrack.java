package com.spotify.player.model.command.options;

import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.klh;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SkipToTrack extends SkipToTrack {
    private final xul0 pageIndex;
    private final xul0 pageUrl;
    private final xul0 trackIndex;
    private final xul0 trackUid;
    private final xul0 trackUri;

    public /* synthetic */ AutoValue_SkipToTrack(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, xul0 xul0Var5, int i) {
        this(xul0Var, xul0Var2, xul0Var3, xul0Var4, xul0Var5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToTrack) {
            SkipToTrack skipToTrack = (SkipToTrack) obj;
            if (this.pageUrl.equals(skipToTrack.pageUrl()) && this.pageIndex.equals(skipToTrack.pageIndex()) && this.trackUid.equals(skipToTrack.trackUid()) && this.trackUri.equals(skipToTrack.trackUri()) && this.trackIndex.equals(skipToTrack.trackIndex())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.pageUrl.hashCode() ^ 1000003) * 1000003) ^ this.pageIndex.hashCode()) * 1000003) ^ this.trackUid.hashCode()) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.trackIndex.hashCode();
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    public xul0 pageIndex() {
        return this.pageIndex;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    public xul0 pageUrl() {
        return this.pageUrl;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    public SkipToTrack.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.pageUrl);
        String strValueOf2 = String.valueOf(this.pageIndex);
        String strValueOf3 = String.valueOf(this.trackUid);
        String strValueOf4 = String.valueOf(this.trackUri);
        String strValueOf5 = String.valueOf(this.trackIndex);
        StringBuilder sbM38573v = edb.m38573v("SkipToTrack{pageUrl=", strValueOf, ", pageIndex=", strValueOf2, ", trackUid=");
        klh.m56844p(sbM38573v, strValueOf3, ", trackUri=", strValueOf4, ", trackIndex=");
        return dq60.m36616p(strValueOf5, "}", sbM38573v);
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    public xul0 trackIndex() {
        return this.trackIndex;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    public xul0 trackUid() {
        return this.trackUid;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    public xul0 trackUri() {
        return this.trackUri;
    }

    private AutoValue_SkipToTrack(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, xul0 xul0Var5) {
        this.pageUrl = xul0Var;
        this.pageIndex = xul0Var2;
        this.trackUid = xul0Var3;
        this.trackUri = xul0Var4;
        this.trackIndex = xul0Var5;
    }

    public static final class Builder extends SkipToTrack.Builder {
        private xul0 pageIndex;
        private xul0 pageUrl;
        private xul0 trackIndex;
        private xul0 trackUid;
        private xul0 trackUri;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.pageUrl = c2244p5;
            this.pageIndex = c2244p5;
            this.trackUid = c2244p5;
            this.trackUri = c2244p5;
            this.trackIndex = c2244p5;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack build() {
            return new AutoValue_SkipToTrack(this.pageUrl, this.pageIndex, this.trackUid, this.trackUri, this.trackIndex, 0);
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder pageIndex(Long l) {
            this.pageIndex = xul0.m92201d(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder pageUrl(String str) {
            this.pageUrl = xul0.m92201d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder trackIndex(Long l) {
            this.trackIndex = xul0.m92201d(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder trackUid(String str) {
            this.trackUid = xul0.m92201d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder trackUri(String str) {
            this.trackUri = xul0.m92201d(str);
            return this;
        }

        public Builder(SkipToTrack skipToTrack) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.pageUrl = c2244p5;
            this.pageIndex = c2244p5;
            this.trackUid = c2244p5;
            this.trackUri = c2244p5;
            this.trackIndex = c2244p5;
            this.pageUrl = skipToTrack.pageUrl();
            this.pageIndex = skipToTrack.pageIndex();
            this.trackUid = skipToTrack.trackUid();
            this.trackUri = skipToTrack.trackUri();
            this.trackIndex = skipToTrack.trackIndex();
        }
    }
}
