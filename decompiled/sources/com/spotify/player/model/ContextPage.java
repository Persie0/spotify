package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p204p.pf40;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class ContextPage {
    public static final ContextPage EMPTY = builder().build();

    /* JADX INFO: loaded from: classes9.dex */
    public static abstract class Builder {
        public static Builder builder() {
            return ContextPage.builder();
        }

        public abstract ContextPage build();

        public abstract Builder metadata(Map<String, String> map);

        public abstract Builder nextPageUrl(String str);

        public abstract Builder pageUrl(String str);

        public Builder tracks(List<ContextTrack> list) {
            return tracks(pf40.m69791p(list));
        }

        public abstract Builder tracks(pf40 pf40Var);
    }

    public static Builder builder() {
        return new AutoValue_ContextPage.Builder().pageUrl("").nextPageUrl("").metadata(Collections.EMPTY_MAP);
    }

    public abstract xf40 metadata();

    public abstract String nextPageUrl();

    public abstract String pageUrl();

    public abstract Builder toBuilder();

    public abstract xul0 tracks();
}
