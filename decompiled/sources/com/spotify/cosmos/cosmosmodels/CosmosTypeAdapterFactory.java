package com.spotify.cosmos.cosmosmodels;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PrefetchLevel;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.gbu;
import p204p.gk60;
import p204p.hk60;
import p204p.lau;
import p204p.mp91;
import p204p.nau;
import p204p.ok60;
import p204p.p0i0;
import p204p.rm60;
import p204p.wj50;
import p204p.xf40;
import p204p.xl60;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory;", "Lp/hk60$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lp/p0i0;", "moshi", "Lp/hk60;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lp/p0i0;)Lp/hk60;", "ContextAdapter", "RestrictionsAdapter", "ContextPageAdapter", "ContextTrackAdapter", "PreparePlayOptionsAdapter", "SkipToTrackAdapter", "ModelAudioStreamAdapter", "PlayerOptionOverridesAdapter", "SuppressionsAdapter", "PlayOriginAdapter", "PrefetchLevelAdapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosTypeAdapterFactory implements hk60.InterfaceC1945e {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/Context;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/Context;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/Context;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class ContextAdapter extends hk60<Context> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR2\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR,\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextAdapter$Adapter;", "", "<init>", "()V", "uri", "", "getUri$annotations", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "url", "getUrl$annotations", "getUrl", "setUrl", "metadata", "", "getMetadata$annotations", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "restrictions", "Lcom/spotify/player/model/Restrictions;", "getRestrictions$annotations", "getRestrictions", "()Lcom/spotify/player/model/Restrictions;", "setRestrictions", "(Lcom/spotify/player/model/Restrictions;)V", "pages", "", "Lcom/spotify/player/model/ContextPage;", "getPages$annotations", "getPages", "()Ljava/util/List;", "setPages", "(Ljava/util/List;)V", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Map<String, String> metadata;
            private List<? extends ContextPage> pages;
            private Restrictions restrictions;
            private String uri;
            private String url;

            @gk60(name = "metadata")
            public static /* synthetic */ void getMetadata$annotations() {
            }

            @gk60(name = "pages")
            public static /* synthetic */ void getPages$annotations() {
            }

            @gk60(name = "restrictions")
            public static /* synthetic */ void getRestrictions$annotations() {
            }

            @gk60(name = "uri")
            public static /* synthetic */ void getUri$annotations() {
            }

            @gk60(name = "url")
            public static /* synthetic */ void getUrl$annotations() {
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final List<ContextPage> getPages() {
                return this.pages;
            }

            public final Restrictions getRestrictions() {
                return this.restrictions;
            }

            public final String getUri() {
                return this.uri;
            }

            public final String getUrl() {
                return this.url;
            }

            public final void setMetadata(Map<String, String> map) {
                this.metadata = map;
            }

            public final void setPages(List<? extends ContextPage> list) {
                this.pages = list;
            }

            public final void setRestrictions(Restrictions restrictions) {
                this.restrictions = restrictions;
            }

            public final void setUri(String str) {
                this.uri = str;
            }

            public final void setUrl(String str) {
                this.url = str;
            }
        }

        public ContextAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public Context fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Adapter adapter = (Adapter) objFromJson;
            String uri = adapter.getUri();
            if (uri == null) {
                uri = "";
            }
            Context.Builder builder = Context.builder(uri);
            String url = adapter.getUrl();
            Context.Builder builderUrl = builder.url(url != null ? url : "");
            Map<String, String> metadata = adapter.getMetadata();
            if (metadata == null) {
                metadata = nau.f152117a;
            }
            Context.Builder builderMetadata = builderUrl.metadata(metadata);
            if (adapter.getPages() != null) {
                builderMetadata.pages(adapter.getPages());
            }
            if (adapter.getRestrictions() != null) {
                builderMetadata.restrictions(adapter.getRestrictions());
            }
            return builderMetadata.build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, Context value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setUri(value.uri());
            adapter.setUrl(value.url());
            adapter.setMetadata(value.metadata());
            adapter.setRestrictions((Restrictions) value.restrictions().mo49283h());
            adapter.setPages((List) value.pages().mo49283h());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextPageAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/ContextPage;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/ContextPage;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/ContextPage;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class ContextPageAdapter extends hk60<ContextPage> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR,\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R2\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextPageAdapter$Adapter;", "", "<init>", "()V", "pageUrl", "", "getPageUrl$annotations", "getPageUrl", "()Ljava/lang/String;", "setPageUrl", "(Ljava/lang/String;)V", "nextPageUrl", "getNextPageUrl$annotations", "getNextPageUrl", "setNextPageUrl", "tracks", "", "Lcom/spotify/player/model/ContextTrack;", "getTracks$annotations", "getTracks", "()Ljava/util/List;", "setTracks", "(Ljava/util/List;)V", "metadata", "", "getMetadata$annotations", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Map<String, String> metadata;
            private String nextPageUrl;
            private String pageUrl;
            private List<? extends ContextTrack> tracks;

            @gk60(name = "metadata")
            public static /* synthetic */ void getMetadata$annotations() {
            }

            @gk60(name = "next_page_url")
            public static /* synthetic */ void getNextPageUrl$annotations() {
            }

            @gk60(name = "page_url")
            public static /* synthetic */ void getPageUrl$annotations() {
            }

            @gk60(name = "tracks")
            public static /* synthetic */ void getTracks$annotations() {
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getNextPageUrl() {
                return this.nextPageUrl;
            }

            public final String getPageUrl() {
                return this.pageUrl;
            }

            public final List<ContextTrack> getTracks() {
                return this.tracks;
            }

            public final void setMetadata(Map<String, String> map) {
                this.metadata = map;
            }

            public final void setNextPageUrl(String str) {
                this.nextPageUrl = str;
            }

            public final void setPageUrl(String str) {
                this.pageUrl = str;
            }

            public final void setTracks(List<? extends ContextTrack> list) {
                this.tracks = list;
            }
        }

        public ContextPageAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public ContextPage fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Adapter adapter = (Adapter) objFromJson;
            ContextPage.Builder builder = ContextPage.builder();
            String pageUrl = adapter.getPageUrl();
            if (pageUrl == null) {
                pageUrl = "";
            }
            ContextPage.Builder builderPageUrl = builder.pageUrl(pageUrl);
            String nextPageUrl = adapter.getNextPageUrl();
            ContextPage.Builder builderNextPageUrl = builderPageUrl.nextPageUrl(nextPageUrl != null ? nextPageUrl : "");
            List<ContextTrack> tracks = adapter.getTracks();
            if (tracks == null) {
                tracks = lau.f131415a;
            }
            ContextPage.Builder builderTracks = builderNextPageUrl.tracks(tracks);
            Map<String, String> metadata = adapter.getMetadata();
            if (metadata == null) {
                metadata = nau.f152117a;
            }
            return builderTracks.metadata(metadata).build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, ContextPage value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setPageUrl(value.pageUrl());
            adapter.setNextPageUrl(value.nextPageUrl());
            adapter.setTracks((List) value.tracks().mo49283h());
            adapter.setMetadata(value.metadata());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextTrackAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/ContextTrack;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/ContextTrack;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/ContextTrack;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class ContextTrackAdapter extends hk60<ContextTrack> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR2\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter;", "", "<init>", "()V", "uri", "", "getUri$annotations", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "uid", "getUid$annotations", "getUid", "setUid", "metadata", "", "getMetadata$annotations", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", ContextTrack.Metadata.KEY_PROVIDER, "getProvider$annotations", "getProvider", "setProvider", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Map<String, String> metadata;
            private String provider;
            private String uid;
            private String uri;

            @gk60(name = "metadata")
            public static /* synthetic */ void getMetadata$annotations() {
            }

            @gk60(name = ContextTrack.Metadata.KEY_PROVIDER)
            public static /* synthetic */ void getProvider$annotations() {
            }

            @gk60(name = "uid")
            public static /* synthetic */ void getUid$annotations() {
            }

            @gk60(name = "uri")
            public static /* synthetic */ void getUri$annotations() {
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getProvider() {
                return this.provider;
            }

            public final String getUid() {
                return this.uid;
            }

            public final String getUri() {
                return this.uri;
            }

            public final void setMetadata(Map<String, String> map) {
                this.metadata = map;
            }

            public final void setProvider(String str) {
                this.provider = str;
            }

            public final void setUid(String str) {
                this.uid = str;
            }

            public final void setUri(String str) {
                this.uri = str;
            }
        }

        public ContextTrackAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public ContextTrack fromJson(xl60 reader) {
            ContextTrack.Builder builder = ContextTrack.builder("");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            reader.mo51076c();
            while (reader.mo51079i()) {
                String strMo51084s = reader.mo51084s();
                if (strMo51084s.equals("uri")) {
                    builder.uri(reader.mo51087y());
                } else if (strMo51084s.equals("uid")) {
                    builder.uid(reader.mo51087y());
                } else if (strMo51084s.equals(ContextTrack.Metadata.KEY_PROVIDER)) {
                    builder.provider(reader.mo51087y());
                } else if (strMo51084s.equals(ContextTrack.Metadata.KEY_ALBUM_URI)) {
                    linkedHashMap.put(ContextTrack.Metadata.KEY_ALBUM_URI, reader.mo51087y());
                } else if (strMo51084s.equals(ContextTrack.Metadata.KEY_ARTIST_URI)) {
                    linkedHashMap.put(ContextTrack.Metadata.KEY_ARTIST_URI, reader.mo51087y());
                } else if (strMo51084s.equals("metadata")) {
                    Map<? extends String, ? extends String> map = (Map) this.moshi.m68703c(Map.class).fromJson(reader);
                    if (map == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    linkedHashMap.putAll(map);
                } else {
                    reader.mo51074Q();
                }
            }
            reader.mo51078f();
            builder.metadata(linkedHashMap);
            return builder.build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, ContextTrack value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setUri(value.uri());
            adapter.setUid(value.uid());
            adapter.setMetadata(value.metadata());
            adapter.setProvider(value.provider());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ModelAudioStreamAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/AudioStream;", "<init>", "()V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/AudioStream;)V", "", "s", "fromString$src_main_java_com_spotify_cosmos_cosmosmodels_cosmosmodels", "(Ljava/lang/String;)Lcom/spotify/player/model/AudioStream;", "fromString", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/AudioStream;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class ModelAudioStreamAdapter extends hk60<AudioStream> {

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AudioStream.values().length];
                try {
                    iArr[AudioStream.ALARM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AudioStream.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: renamed from: fromString$src_main_java_com_spotify_cosmos_cosmosmodels_cosmosmodels */
        public final AudioStream m8159x19d32908(String s) {
            if (wj50.m88271j(s, "alarm")) {
                return AudioStream.ALARM;
            }
            return wj50.m88271j(s, "default") ? AudioStream.DEFAULT : AudioStream.DEFAULT;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public AudioStream fromJson(xl60 reader) {
            return m8159x19d32908(reader.mo51087y());
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, AudioStream value) {
            int i = value == null ? -1 : WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    writer.mo56887N("alarm");
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    writer.mo56887N("default");
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayOriginAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/PlayOrigin;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/PlayOrigin;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/PlayOrigin;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class PlayOriginAdapter extends hk60<PlayOrigin> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR&\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR&\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR&\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR&\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR,\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter;", "", "<init>", "()V", "featureIdentifier", "", "getFeatureIdentifier$annotations", "getFeatureIdentifier", "()Ljava/lang/String;", "setFeatureIdentifier", "(Ljava/lang/String;)V", "featureVersion", "getFeatureVersion$annotations", "getFeatureVersion", "setFeatureVersion", "viewUri", "getViewUri$annotations", "getViewUri", "setViewUri", "externalReferrer", "getExternalReferrer$annotations", "getExternalReferrer", "setExternalReferrer", "referrerIdentifier", "getReferrerIdentifier$annotations", "getReferrerIdentifier", "setReferrerIdentifier", "deviceIdentifier", "getDeviceIdentifier$annotations", "getDeviceIdentifier", "setDeviceIdentifier", "featureClasses", "", "getFeatureClasses$annotations", "getFeatureClasses", "()Ljava/util/Set;", "setFeatureClasses", "(Ljava/util/Set;)V", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private String deviceIdentifier;
            private String externalReferrer;
            private Set<String> featureClasses;
            private String featureIdentifier;
            private String featureVersion;
            private String referrerIdentifier;
            private String viewUri;

            @gk60(name = "device_identifier")
            public static /* synthetic */ void getDeviceIdentifier$annotations() {
            }

            @gk60(name = "external_referrer")
            public static /* synthetic */ void getExternalReferrer$annotations() {
            }

            @gk60(name = "feature_classes")
            public static /* synthetic */ void getFeatureClasses$annotations() {
            }

            @gk60(name = "feature_identifier")
            public static /* synthetic */ void getFeatureIdentifier$annotations() {
            }

            @gk60(name = "feature_version")
            public static /* synthetic */ void getFeatureVersion$annotations() {
            }

            @gk60(name = "referrer_identifier")
            public static /* synthetic */ void getReferrerIdentifier$annotations() {
            }

            @gk60(name = "view_uri")
            public static /* synthetic */ void getViewUri$annotations() {
            }

            public final String getDeviceIdentifier() {
                return this.deviceIdentifier;
            }

            public final String getExternalReferrer() {
                return this.externalReferrer;
            }

            public final Set<String> getFeatureClasses() {
                return this.featureClasses;
            }

            public final String getFeatureIdentifier() {
                return this.featureIdentifier;
            }

            public final String getFeatureVersion() {
                return this.featureVersion;
            }

            public final String getReferrerIdentifier() {
                return this.referrerIdentifier;
            }

            public final String getViewUri() {
                return this.viewUri;
            }

            public final void setDeviceIdentifier(String str) {
                this.deviceIdentifier = str;
            }

            public final void setExternalReferrer(String str) {
                this.externalReferrer = str;
            }

            public final void setFeatureClasses(Set<String> set) {
                this.featureClasses = set;
            }

            public final void setFeatureIdentifier(String str) {
                this.featureIdentifier = str;
            }

            public final void setFeatureVersion(String str) {
                this.featureVersion = str;
            }

            public final void setReferrerIdentifier(String str) {
                this.referrerIdentifier = str;
            }

            public final void setViewUri(String str) {
                this.viewUri = str;
            }
        }

        public PlayOriginAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public PlayOrigin fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Adapter adapter = (Adapter) objFromJson;
            String featureIdentifier = adapter.getFeatureIdentifier();
            if (featureIdentifier == null) {
                throw new IllegalStateException("Required value was null.");
            }
            PlayOrigin.Builder builder = PlayOrigin.builder(featureIdentifier);
            String featureVersion = adapter.getFeatureVersion();
            if (featureVersion == null) {
                featureVersion = "";
            }
            PlayOrigin.Builder builderFeatureVersion = builder.featureVersion(featureVersion);
            String viewUri = adapter.getViewUri();
            if (viewUri == null) {
                viewUri = "";
            }
            PlayOrigin.Builder builderViewUri = builderFeatureVersion.viewUri(viewUri);
            String externalReferrer = adapter.getExternalReferrer();
            if (externalReferrer == null) {
                externalReferrer = "";
            }
            PlayOrigin.Builder builderExternalReferrer = builderViewUri.externalReferrer(externalReferrer);
            String referrerIdentifier = adapter.getReferrerIdentifier();
            if (referrerIdentifier == null) {
                referrerIdentifier = "";
            }
            PlayOrigin.Builder builderReferrerIdentifier = builderExternalReferrer.referrerIdentifier(referrerIdentifier);
            String deviceIdentifier = adapter.getDeviceIdentifier();
            PlayOrigin.Builder builderDeviceIdentifier = builderReferrerIdentifier.deviceIdentifier(deviceIdentifier != null ? deviceIdentifier : "");
            Set<String> featureClasses = adapter.getFeatureClasses();
            if (featureClasses == null) {
                featureClasses = gbu.f78413a;
            }
            return builderDeviceIdentifier.featureClasses(featureClasses).build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, PlayOrigin value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setFeatureIdentifier(value.featureIdentifier());
            adapter.setFeatureVersion(value.featureVersion());
            adapter.setViewUri(value.viewUri());
            adapter.setExternalReferrer(value.externalReferrer());
            adapter.setReferrerIdentifier(value.referrerIdentifier());
            adapter.setDeviceIdentifier(value.deviceIdentifier());
            adapter.setFeatureClasses(value.featureClasses());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/command/options/PlayerOptionOverrides;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/command/options/PlayerOptionOverrides;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/command/options/PlayerOptionOverrides;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class PlayerOptionOverridesAdapter extends hk60<PlayerOptionOverrides> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u000b\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u000b\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR(\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u000b\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter;", "", "<init>", "()V", "shufflingContext", "", "getShufflingContext$annotations", "getShufflingContext", "()Ljava/lang/Boolean;", "setShufflingContext", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "repeatingContext", "getRepeatingContext$annotations", "getRepeatingContext", "setRepeatingContext", "repeatingTrack", "getRepeatingTrack$annotations", "getRepeatingTrack", "setRepeatingTrack", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Boolean repeatingContext;
            private Boolean repeatingTrack;
            private Boolean shufflingContext;

            @gk60(name = "repeating_context")
            public static /* synthetic */ void getRepeatingContext$annotations() {
            }

            @gk60(name = "repeating_track")
            public static /* synthetic */ void getRepeatingTrack$annotations() {
            }

            @gk60(name = "shuffling_context")
            public static /* synthetic */ void getShufflingContext$annotations() {
            }

            public final Boolean getRepeatingContext() {
                return this.repeatingContext;
            }

            public final Boolean getRepeatingTrack() {
                return this.repeatingTrack;
            }

            public final Boolean getShufflingContext() {
                return this.shufflingContext;
            }

            public final void setRepeatingContext(Boolean bool) {
                this.repeatingContext = bool;
            }

            public final void setRepeatingTrack(Boolean bool) {
                this.repeatingTrack = bool;
            }

            public final void setShufflingContext(Boolean bool) {
                this.shufflingContext = bool;
            }
        }

        public PlayerOptionOverridesAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public PlayerOptionOverrides fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Adapter adapter = (Adapter) objFromJson;
            PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
            Boolean shufflingContext = adapter.getShufflingContext();
            PlayerOptionOverrides.Builder builderShufflingContext = builder.shufflingContext(Boolean.valueOf(shufflingContext != null ? shufflingContext.booleanValue() : false));
            Boolean repeatingContext = adapter.getRepeatingContext();
            PlayerOptionOverrides.Builder builderRepeatingContext = builderShufflingContext.repeatingContext(Boolean.valueOf(repeatingContext != null ? repeatingContext.booleanValue() : false));
            Boolean repeatingTrack = adapter.getRepeatingTrack();
            return builderRepeatingContext.repeatingTrack(Boolean.valueOf(repeatingTrack != null ? repeatingTrack.booleanValue() : false)).build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, PlayerOptionOverrides value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setShufflingContext((Boolean) value.shufflingContext().mo49283h());
            adapter.setRepeatingContext((Boolean) value.repeatingContext().mo49283h());
            adapter.setRepeatingTrack((Boolean) value.repeatingTrack().mo49283h());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PrefetchLevelAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/command/options/PrefetchLevel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/command/options/PrefetchLevel;)V", "", "s", "fromString$src_main_java_com_spotify_cosmos_cosmosmodels_cosmosmodels", "(Ljava/lang/String;)Lcom/spotify/player/model/command/options/PrefetchLevel;", "fromString", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/command/options/PrefetchLevel;", "Lp/p0i0;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class PrefetchLevelAdapter extends hk60<PrefetchLevel> {
        private final p0i0 moshi;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PrefetchLevel.values().length];
                try {
                    iArr[PrefetchLevel.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PrefetchLevel.MEDIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public PrefetchLevelAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX INFO: renamed from: fromString$src_main_java_com_spotify_cosmos_cosmosmodels_cosmosmodels */
        public final PrefetchLevel m8160x19d32908(String s) {
            if (wj50.m88271j(s, "none")) {
                return PrefetchLevel.NONE;
            }
            return wj50.m88271j(s, "media") ? PrefetchLevel.MEDIA : PrefetchLevel.NONE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public PrefetchLevel fromJson(xl60 reader) {
            return m8160x19d32908(reader.mo51087y());
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, PrefetchLevel value) {
            int i = value == null ? -1 : WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    writer.mo56887N("none");
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    writer.mo56887N("media");
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PreparePlayOptionsAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/command/options/PreparePlayOptions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/command/options/PreparePlayOptions;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/command/options/PreparePlayOptions;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class PreparePlayOptionsAdapter extends hk60<PreparePlayOptions> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010!\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R(\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b'\u0010\u0003\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R&\u0010*\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u0003\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R&\u00101\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b3\u0010\u0003\u001a\u0004\b4\u00105\"\u0004\b6\u00107R&\u00108\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b:\u0010\u0003\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R&\u0010?\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bA\u0010\u0003\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER&\u0010F\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\u0003\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR&\u0010J\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bK\u0010\u0003\u001a\u0004\bL\u0010\b\"\u0004\bM\u0010\nR2\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010O8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bP\u0010\u0003\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006U"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter;", "", "<init>", "()V", "playbackId", "", "getPlaybackId$annotations", "getPlaybackId", "()Ljava/lang/String;", "setPlaybackId", "(Ljava/lang/String;)V", "alwaysPlaySomething", "", "getAlwaysPlaySomething$annotations", "getAlwaysPlaySomething", "()Ljava/lang/Boolean;", "setAlwaysPlaySomething", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "skipTo", "Lcom/spotify/player/model/command/options/SkipToTrack;", "getSkipTo$annotations", "getSkipTo", "()Lcom/spotify/player/model/command/options/SkipToTrack;", "setSkipTo", "(Lcom/spotify/player/model/command/options/SkipToTrack;)V", "seekTo", "", "getSeekTo$annotations", "getSeekTo", "()Ljava/lang/Long;", "setSeekTo", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "initiallyPaused", "getInitiallyPaused$annotations", "getInitiallyPaused", "setInitiallyPaused", "systemInitiated", "getSystemInitiated$annotations", "getSystemInitiated", "setSystemInitiated", "playerOptionsOverride", "Lcom/spotify/player/model/command/options/PlayerOptionOverrides;", "getPlayerOptionsOverride$annotations", "getPlayerOptionsOverride", "()Lcom/spotify/player/model/command/options/PlayerOptionOverrides;", "setPlayerOptionsOverride", "(Lcom/spotify/player/model/command/options/PlayerOptionOverrides;)V", "suppressions", "Lcom/spotify/player/model/Suppressions;", "getSuppressions$annotations", "getSuppressions", "()Lcom/spotify/player/model/Suppressions;", "setSuppressions", "(Lcom/spotify/player/model/Suppressions;)V", "prefetchLevel", "Lcom/spotify/player/model/command/options/PrefetchLevel;", "getPrefetchLevel$annotations", "getPrefetchLevel", "()Lcom/spotify/player/model/command/options/PrefetchLevel;", "setPrefetchLevel", "(Lcom/spotify/player/model/command/options/PrefetchLevel;)V", "audioStream", "Lcom/spotify/player/model/AudioStream;", "getAudioStream$annotations", "getAudioStream", "()Lcom/spotify/player/model/AudioStream;", "setAudioStream", "(Lcom/spotify/player/model/AudioStream;)V", "sessionId", "getSessionId$annotations", "getSessionId", "setSessionId", Context.Metadata.KEY_LICENSE, "getLicense$annotations", "getLicense", "setLicense", "configurationOverride", "", "getConfigurationOverride$annotations", "getConfigurationOverride", "()Ljava/util/Map;", "setConfigurationOverride", "(Ljava/util/Map;)V", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Boolean alwaysPlaySomething;
            private AudioStream audioStream;
            private Map<String, ? extends Object> configurationOverride;
            private Boolean initiallyPaused;
            private String license;
            private String playbackId;
            private PlayerOptionOverrides playerOptionsOverride;
            private PrefetchLevel prefetchLevel;
            private Long seekTo;
            private String sessionId;
            private SkipToTrack skipTo;
            private Suppressions suppressions;
            private Boolean systemInitiated;

            @gk60(name = "always_play_something")
            public static /* synthetic */ void getAlwaysPlaySomething$annotations() {
            }

            @gk60(name = "audio_stream")
            public static /* synthetic */ void getAudioStream$annotations() {
            }

            @gk60(name = "configuration_override")
            public static /* synthetic */ void getConfigurationOverride$annotations() {
            }

            @gk60(name = "initially_paused")
            public static /* synthetic */ void getInitiallyPaused$annotations() {
            }

            @gk60(name = Context.Metadata.KEY_LICENSE)
            public static /* synthetic */ void getLicense$annotations() {
            }

            @gk60(name = "playback_id")
            public static /* synthetic */ void getPlaybackId$annotations() {
            }

            @gk60(name = "player_options_override")
            public static /* synthetic */ void getPlayerOptionsOverride$annotations() {
            }

            @gk60(name = "prefetch_level")
            public static /* synthetic */ void getPrefetchLevel$annotations() {
            }

            @gk60(name = "seek_to")
            public static /* synthetic */ void getSeekTo$annotations() {
            }

            @gk60(name = "session_id")
            public static /* synthetic */ void getSessionId$annotations() {
            }

            @gk60(name = "skip_to")
            public static /* synthetic */ void getSkipTo$annotations() {
            }

            @gk60(name = "suppressions")
            public static /* synthetic */ void getSuppressions$annotations() {
            }

            @gk60(name = "system_initiated")
            public static /* synthetic */ void getSystemInitiated$annotations() {
            }

            public final Boolean getAlwaysPlaySomething() {
                return this.alwaysPlaySomething;
            }

            public final AudioStream getAudioStream() {
                return this.audioStream;
            }

            public final Map<String, Object> getConfigurationOverride() {
                return this.configurationOverride;
            }

            public final Boolean getInitiallyPaused() {
                return this.initiallyPaused;
            }

            public final String getLicense() {
                return this.license;
            }

            public final String getPlaybackId() {
                return this.playbackId;
            }

            public final PlayerOptionOverrides getPlayerOptionsOverride() {
                return this.playerOptionsOverride;
            }

            public final PrefetchLevel getPrefetchLevel() {
                return this.prefetchLevel;
            }

            public final Long getSeekTo() {
                return this.seekTo;
            }

            public final String getSessionId() {
                return this.sessionId;
            }

            public final SkipToTrack getSkipTo() {
                return this.skipTo;
            }

            public final Suppressions getSuppressions() {
                return this.suppressions;
            }

            public final Boolean getSystemInitiated() {
                return this.systemInitiated;
            }

            public final void setAlwaysPlaySomething(Boolean bool) {
                this.alwaysPlaySomething = bool;
            }

            public final void setAudioStream(AudioStream audioStream) {
                this.audioStream = audioStream;
            }

            public final void setConfigurationOverride(Map<String, ? extends Object> map) {
                this.configurationOverride = map;
            }

            public final void setInitiallyPaused(Boolean bool) {
                this.initiallyPaused = bool;
            }

            public final void setLicense(String str) {
                this.license = str;
            }

            public final void setPlaybackId(String str) {
                this.playbackId = str;
            }

            public final void setPlayerOptionsOverride(PlayerOptionOverrides playerOptionOverrides) {
                this.playerOptionsOverride = playerOptionOverrides;
            }

            public final void setPrefetchLevel(PrefetchLevel prefetchLevel) {
                this.prefetchLevel = prefetchLevel;
            }

            public final void setSeekTo(Long l) {
                this.seekTo = l;
            }

            public final void setSessionId(String str) {
                this.sessionId = str;
            }

            public final void setSkipTo(SkipToTrack skipToTrack) {
                this.skipTo = skipToTrack;
            }

            public final void setSuppressions(Suppressions suppressions) {
                this.suppressions = suppressions;
            }

            public final void setSystemInitiated(Boolean bool) {
                this.systemInitiated = bool;
            }
        }

        public PreparePlayOptionsAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public PreparePlayOptions fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Adapter adapter = (Adapter) objFromJson;
            PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
            String playbackId = adapter.getPlaybackId();
            if (playbackId == null) {
                playbackId = "";
            }
            PreparePlayOptions.Builder builderPlaybackId = builder.playbackId(playbackId);
            Boolean alwaysPlaySomething = adapter.getAlwaysPlaySomething();
            PreparePlayOptions.Builder builderAlwaysPlaySomething = builderPlaybackId.alwaysPlaySomething(alwaysPlaySomething != null ? alwaysPlaySomething.booleanValue() : false);
            SkipToTrack skipTo = adapter.getSkipTo();
            if (skipTo == null) {
                skipTo = SkipToTrack.EMPTY;
            }
            PreparePlayOptions.Builder builderSkipTo = builderAlwaysPlaySomething.skipTo(skipTo);
            Long seekTo = adapter.getSeekTo();
            PreparePlayOptions.Builder builderSeekTo = builderSkipTo.seekTo(Long.valueOf(seekTo != null ? seekTo.longValue() : 0L));
            Boolean initiallyPaused = adapter.getInitiallyPaused();
            PreparePlayOptions.Builder builderInitiallyPaused = builderSeekTo.initiallyPaused(initiallyPaused != null ? initiallyPaused.booleanValue() : false);
            Boolean systemInitiated = adapter.getSystemInitiated();
            PreparePlayOptions.Builder builderSystemInitiated = builderInitiallyPaused.systemInitiated(systemInitiated != null ? systemInitiated.booleanValue() : false);
            PlayerOptionOverrides playerOptionsOverride = adapter.getPlayerOptionsOverride();
            if (playerOptionsOverride == null) {
                playerOptionsOverride = PlayerOptionOverrides.EMPTY;
            }
            PreparePlayOptions.Builder builderPlayerOptionsOverride = builderSystemInitiated.playerOptionsOverride(playerOptionsOverride);
            Suppressions suppressions = adapter.getSuppressions();
            if (suppressions == null) {
                suppressions = Suppressions.EMPTY;
            }
            PreparePlayOptions.Builder builderSuppressions = builderPlayerOptionsOverride.suppressions(suppressions);
            PrefetchLevel prefetchLevel = adapter.getPrefetchLevel();
            if (prefetchLevel == null) {
                prefetchLevel = PrefetchLevel.NONE;
            }
            PreparePlayOptions.Builder builderPrefetchLevel = builderSuppressions.prefetchLevel(prefetchLevel);
            AudioStream audioStream = adapter.getAudioStream();
            if (audioStream == null) {
                audioStream = AudioStream.DEFAULT;
            }
            PreparePlayOptions.Builder builderAudioStream = builderPrefetchLevel.audioStream(audioStream);
            String sessionId = adapter.getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            PreparePlayOptions.Builder builderSessionId = builderAudioStream.sessionId(sessionId);
            String license = adapter.getLicense();
            builderSessionId.license(license != null ? license : "");
            if (adapter.getConfigurationOverride() != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> configurationOverride = adapter.getConfigurationOverride();
                if (configurationOverride != null) {
                    for (Map.Entry<String, Object> entry : configurationOverride.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Double) {
                            try {
                                linkedHashMap.put(key, String.valueOf((int) ((Number) value).doubleValue()));
                            } catch (NumberFormatException unused) {
                                linkedHashMap.put(key, String.valueOf(((Number) value).doubleValue()));
                            }
                        } else {
                            linkedHashMap.put(key, value.toString());
                        }
                    }
                }
                builder.configurationOverride(xf40.m90451c(linkedHashMap));
            }
            return builder.build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, PreparePlayOptions value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setPlaybackId((String) value.playbackId().mo49283h());
            adapter.setAlwaysPlaySomething((Boolean) value.alwaysPlaySomething().mo49283h());
            adapter.setSkipTo((SkipToTrack) value.skipTo().mo49283h());
            adapter.setSeekTo((Long) value.seekTo().mo49283h());
            adapter.setInitiallyPaused((Boolean) value.initiallyPaused().mo49283h());
            adapter.setSystemInitiated((Boolean) value.systemInitiated().mo49283h());
            adapter.setPlayerOptionsOverride((PlayerOptionOverrides) value.playerOptionsOverride().mo49283h());
            adapter.setSuppressions((Suppressions) value.suppressions().mo49283h());
            adapter.setPrefetchLevel((PrefetchLevel) value.prefetchLevel().mo49283h());
            adapter.setAudioStream((AudioStream) value.audioStream().mo49283h());
            adapter.setSessionId((String) value.sessionId().mo49283h());
            adapter.setLicense((String) value.license().mo49283h());
            adapter.setConfigurationOverride(value.configurationOverride());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$RestrictionsAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/Restrictions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/Restrictions;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/Restrictions;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class RestrictionsAdapter extends hk60<Restrictions> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\bZ\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR,\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR,\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR,\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR,\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR,\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR,\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR,\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b%\u0010\u0003\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010\u000bR,\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u0003\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR,\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b-\u0010\u0003\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR,\u00100\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010\u0003\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR,\u00104\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b5\u0010\u0003\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR,\u00108\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0003\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR,\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b=\u0010\u0003\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000bR,\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bA\u0010\u0003\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010\u000bR,\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bE\u0010\u0003\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR,\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bI\u0010\u0003\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000bR,\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bM\u0010\u0003\u001a\u0004\bN\u0010\t\"\u0004\bO\u0010\u000bR,\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bQ\u0010\u0003\u001a\u0004\bR\u0010\t\"\u0004\bS\u0010\u000bR,\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bU\u0010\u0003\u001a\u0004\bV\u0010\t\"\u0004\bW\u0010\u000bR,\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bY\u0010\u0003\u001a\u0004\bZ\u0010\t\"\u0004\b[\u0010\u000bR,\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b]\u0010\u0003\u001a\u0004\b^\u0010\t\"\u0004\b_\u0010\u000b¨\u0006`"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter;", "", "<init>", "()V", "disallowPeekingPrevReasons", "", "", "getDisallowPeekingPrevReasons$annotations", "getDisallowPeekingPrevReasons", "()Ljava/util/Set;", "setDisallowPeekingPrevReasons", "(Ljava/util/Set;)V", "disallowPeekingNextReasons", "getDisallowPeekingNextReasons$annotations", "getDisallowPeekingNextReasons", "setDisallowPeekingNextReasons", "disallowSkippingPrevReasons", "getDisallowSkippingPrevReasons$annotations", "getDisallowSkippingPrevReasons", "setDisallowSkippingPrevReasons", "disallowSkippingNextReasons", "getDisallowSkippingNextReasons$annotations", "getDisallowSkippingNextReasons", "setDisallowSkippingNextReasons", "disallowPausingReasons", "getDisallowPausingReasons$annotations", "getDisallowPausingReasons", "setDisallowPausingReasons", "disallowResumingReasons", "getDisallowResumingReasons$annotations", "getDisallowResumingReasons", "setDisallowResumingReasons", "disallowTogglingRepeatContextReasons", "getDisallowTogglingRepeatContextReasons$annotations", "getDisallowTogglingRepeatContextReasons", "setDisallowTogglingRepeatContextReasons", "disallowTogglingRepeatTrackReasons", "getDisallowTogglingRepeatTrackReasons$annotations", "getDisallowTogglingRepeatTrackReasons", "setDisallowTogglingRepeatTrackReasons", "disallowTogglingShuffleReasons", "getDisallowTogglingShuffleReasons$annotations", "getDisallowTogglingShuffleReasons", "setDisallowTogglingShuffleReasons", "disallowSeekingReasons", "getDisallowSeekingReasons$annotations", "getDisallowSeekingReasons", "setDisallowSeekingReasons", "disallowTransferringPlaybackReasons", "getDisallowTransferringPlaybackReasons$annotations", "getDisallowTransferringPlaybackReasons", "setDisallowTransferringPlaybackReasons", "disallowRemoteControlReasons", "getDisallowRemoteControlReasons$annotations", "getDisallowRemoteControlReasons", "setDisallowRemoteControlReasons", "disallowInsertingIntoNextTracksReasons", "getDisallowInsertingIntoNextTracksReasons$annotations", "getDisallowInsertingIntoNextTracksReasons", "setDisallowInsertingIntoNextTracksReasons", "disallowInsertingIntoContextTracksReasons", "getDisallowInsertingIntoContextTracksReasons$annotations", "getDisallowInsertingIntoContextTracksReasons", "setDisallowInsertingIntoContextTracksReasons", "disallowReorderingInNextTracksReasons", "getDisallowReorderingInNextTracksReasons$annotations", "getDisallowReorderingInNextTracksReasons", "setDisallowReorderingInNextTracksReasons", "disallowReorderingInContextTracksReasons", "getDisallowReorderingInContextTracksReasons$annotations", "getDisallowReorderingInContextTracksReasons", "setDisallowReorderingInContextTracksReasons", "disallowRemovingFromNextTracksReasons", "getDisallowRemovingFromNextTracksReasons$annotations", "getDisallowRemovingFromNextTracksReasons", "setDisallowRemovingFromNextTracksReasons", "disallowRemovingFromContextTracksReasons", "getDisallowRemovingFromContextTracksReasons$annotations", "getDisallowRemovingFromContextTracksReasons", "setDisallowRemovingFromContextTracksReasons", "disallowUpdatingContextReasons", "getDisallowUpdatingContextReasons$annotations", "getDisallowUpdatingContextReasons", "setDisallowUpdatingContextReasons", "disallowSetQueueReasons", "getDisallowSetQueueReasons$annotations", "getDisallowSetQueueReasons", "setDisallowSetQueueReasons", "disallowAddToQueueReasons", "getDisallowAddToQueueReasons$annotations", "getDisallowAddToQueueReasons", "setDisallowAddToQueueReasons", "disallowInterruptingPlaybackReasons", "getDisallowInterruptingPlaybackReasons$annotations", "getDisallowInterruptingPlaybackReasons", "setDisallowInterruptingPlaybackReasons", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Set<String> disallowAddToQueueReasons;
            private Set<String> disallowInsertingIntoContextTracksReasons;
            private Set<String> disallowInsertingIntoNextTracksReasons;
            private Set<String> disallowInterruptingPlaybackReasons;
            private Set<String> disallowPausingReasons;
            private Set<String> disallowPeekingNextReasons;
            private Set<String> disallowPeekingPrevReasons;
            private Set<String> disallowRemoteControlReasons;
            private Set<String> disallowRemovingFromContextTracksReasons;
            private Set<String> disallowRemovingFromNextTracksReasons;
            private Set<String> disallowReorderingInContextTracksReasons;
            private Set<String> disallowReorderingInNextTracksReasons;
            private Set<String> disallowResumingReasons;
            private Set<String> disallowSeekingReasons;
            private Set<String> disallowSetQueueReasons;
            private Set<String> disallowSkippingNextReasons;
            private Set<String> disallowSkippingPrevReasons;
            private Set<String> disallowTogglingRepeatContextReasons;
            private Set<String> disallowTogglingRepeatTrackReasons;
            private Set<String> disallowTogglingShuffleReasons;
            private Set<String> disallowTransferringPlaybackReasons;
            private Set<String> disallowUpdatingContextReasons;

            @gk60(name = "disallow_add_to_queue_reasons")
            public static /* synthetic */ void getDisallowAddToQueueReasons$annotations() {
            }

            @gk60(name = "disallow_inserting_into_context_tracks_reasons")
            public static /* synthetic */ void getDisallowInsertingIntoContextTracksReasons$annotations() {
            }

            @gk60(name = "disallow_inserting_into_next_tracks_reasons")
            public static /* synthetic */ void getDisallowInsertingIntoNextTracksReasons$annotations() {
            }

            @gk60(name = "disallow_interrupting_playback_reasons")
            public static /* synthetic */ void getDisallowInterruptingPlaybackReasons$annotations() {
            }

            @gk60(name = "disallow_pausing_reasons")
            public static /* synthetic */ void getDisallowPausingReasons$annotations() {
            }

            @gk60(name = "disallow_peeking_next_reasons")
            public static /* synthetic */ void getDisallowPeekingNextReasons$annotations() {
            }

            @gk60(name = "disallow_peeking_prev_reasons")
            public static /* synthetic */ void getDisallowPeekingPrevReasons$annotations() {
            }

            @gk60(name = "disallow_remote_control_reasons")
            public static /* synthetic */ void getDisallowRemoteControlReasons$annotations() {
            }

            @gk60(name = "disallow_removing_from_context_tracks_reasons")
            public static /* synthetic */ void getDisallowRemovingFromContextTracksReasons$annotations() {
            }

            @gk60(name = "disallow_removing_from_next_tracks_reasons")
            public static /* synthetic */ void getDisallowRemovingFromNextTracksReasons$annotations() {
            }

            @gk60(name = "disallow_reordering_in_context_tracks_reasons")
            public static /* synthetic */ void getDisallowReorderingInContextTracksReasons$annotations() {
            }

            @gk60(name = "disallow_reordering_in_next_tracks_reasons")
            public static /* synthetic */ void getDisallowReorderingInNextTracksReasons$annotations() {
            }

            @gk60(name = "disallow_resuming_reasons")
            public static /* synthetic */ void getDisallowResumingReasons$annotations() {
            }

            @gk60(name = "disallow_seeking_reasons")
            public static /* synthetic */ void getDisallowSeekingReasons$annotations() {
            }

            @gk60(name = "disallow_set_queue_reasons")
            public static /* synthetic */ void getDisallowSetQueueReasons$annotations() {
            }

            @gk60(name = "disallow_skipping_next_reasons")
            public static /* synthetic */ void getDisallowSkippingNextReasons$annotations() {
            }

            @gk60(name = "disallow_skipping_prev_reasons")
            public static /* synthetic */ void getDisallowSkippingPrevReasons$annotations() {
            }

            @gk60(name = "disallow_toggling_repeat_context_reasons")
            public static /* synthetic */ void getDisallowTogglingRepeatContextReasons$annotations() {
            }

            @gk60(name = "disallow_toggling_repeat_track_reasons")
            public static /* synthetic */ void getDisallowTogglingRepeatTrackReasons$annotations() {
            }

            @gk60(name = "disallow_toggling_shuffle_reasons")
            public static /* synthetic */ void getDisallowTogglingShuffleReasons$annotations() {
            }

            @gk60(name = "disallow_transferring_playback_reasons")
            public static /* synthetic */ void getDisallowTransferringPlaybackReasons$annotations() {
            }

            @gk60(name = "disallow_updating_context_reasons")
            public static /* synthetic */ void getDisallowUpdatingContextReasons$annotations() {
            }

            public final Set<String> getDisallowAddToQueueReasons() {
                return this.disallowAddToQueueReasons;
            }

            public final Set<String> getDisallowInsertingIntoContextTracksReasons() {
                return this.disallowInsertingIntoContextTracksReasons;
            }

            public final Set<String> getDisallowInsertingIntoNextTracksReasons() {
                return this.disallowInsertingIntoNextTracksReasons;
            }

            public final Set<String> getDisallowInterruptingPlaybackReasons() {
                return this.disallowInterruptingPlaybackReasons;
            }

            public final Set<String> getDisallowPausingReasons() {
                return this.disallowPausingReasons;
            }

            public final Set<String> getDisallowPeekingNextReasons() {
                return this.disallowPeekingNextReasons;
            }

            public final Set<String> getDisallowPeekingPrevReasons() {
                return this.disallowPeekingPrevReasons;
            }

            public final Set<String> getDisallowRemoteControlReasons() {
                return this.disallowRemoteControlReasons;
            }

            public final Set<String> getDisallowRemovingFromContextTracksReasons() {
                return this.disallowRemovingFromContextTracksReasons;
            }

            public final Set<String> getDisallowRemovingFromNextTracksReasons() {
                return this.disallowRemovingFromNextTracksReasons;
            }

            public final Set<String> getDisallowReorderingInContextTracksReasons() {
                return this.disallowReorderingInContextTracksReasons;
            }

            public final Set<String> getDisallowReorderingInNextTracksReasons() {
                return this.disallowReorderingInNextTracksReasons;
            }

            public final Set<String> getDisallowResumingReasons() {
                return this.disallowResumingReasons;
            }

            public final Set<String> getDisallowSeekingReasons() {
                return this.disallowSeekingReasons;
            }

            public final Set<String> getDisallowSetQueueReasons() {
                return this.disallowSetQueueReasons;
            }

            public final Set<String> getDisallowSkippingNextReasons() {
                return this.disallowSkippingNextReasons;
            }

            public final Set<String> getDisallowSkippingPrevReasons() {
                return this.disallowSkippingPrevReasons;
            }

            public final Set<String> getDisallowTogglingRepeatContextReasons() {
                return this.disallowTogglingRepeatContextReasons;
            }

            public final Set<String> getDisallowTogglingRepeatTrackReasons() {
                return this.disallowTogglingRepeatTrackReasons;
            }

            public final Set<String> getDisallowTogglingShuffleReasons() {
                return this.disallowTogglingShuffleReasons;
            }

            public final Set<String> getDisallowTransferringPlaybackReasons() {
                return this.disallowTransferringPlaybackReasons;
            }

            public final Set<String> getDisallowUpdatingContextReasons() {
                return this.disallowUpdatingContextReasons;
            }

            public final void setDisallowAddToQueueReasons(Set<String> set) {
                this.disallowAddToQueueReasons = set;
            }

            public final void setDisallowInsertingIntoContextTracksReasons(Set<String> set) {
                this.disallowInsertingIntoContextTracksReasons = set;
            }

            public final void setDisallowInsertingIntoNextTracksReasons(Set<String> set) {
                this.disallowInsertingIntoNextTracksReasons = set;
            }

            public final void setDisallowInterruptingPlaybackReasons(Set<String> set) {
                this.disallowInterruptingPlaybackReasons = set;
            }

            public final void setDisallowPausingReasons(Set<String> set) {
                this.disallowPausingReasons = set;
            }

            public final void setDisallowPeekingNextReasons(Set<String> set) {
                this.disallowPeekingNextReasons = set;
            }

            public final void setDisallowPeekingPrevReasons(Set<String> set) {
                this.disallowPeekingPrevReasons = set;
            }

            public final void setDisallowRemoteControlReasons(Set<String> set) {
                this.disallowRemoteControlReasons = set;
            }

            public final void setDisallowRemovingFromContextTracksReasons(Set<String> set) {
                this.disallowRemovingFromContextTracksReasons = set;
            }

            public final void setDisallowRemovingFromNextTracksReasons(Set<String> set) {
                this.disallowRemovingFromNextTracksReasons = set;
            }

            public final void setDisallowReorderingInContextTracksReasons(Set<String> set) {
                this.disallowReorderingInContextTracksReasons = set;
            }

            public final void setDisallowReorderingInNextTracksReasons(Set<String> set) {
                this.disallowReorderingInNextTracksReasons = set;
            }

            public final void setDisallowResumingReasons(Set<String> set) {
                this.disallowResumingReasons = set;
            }

            public final void setDisallowSeekingReasons(Set<String> set) {
                this.disallowSeekingReasons = set;
            }

            public final void setDisallowSetQueueReasons(Set<String> set) {
                this.disallowSetQueueReasons = set;
            }

            public final void setDisallowSkippingNextReasons(Set<String> set) {
                this.disallowSkippingNextReasons = set;
            }

            public final void setDisallowSkippingPrevReasons(Set<String> set) {
                this.disallowSkippingPrevReasons = set;
            }

            public final void setDisallowTogglingRepeatContextReasons(Set<String> set) {
                this.disallowTogglingRepeatContextReasons = set;
            }

            public final void setDisallowTogglingRepeatTrackReasons(Set<String> set) {
                this.disallowTogglingRepeatTrackReasons = set;
            }

            public final void setDisallowTogglingShuffleReasons(Set<String> set) {
                this.disallowTogglingShuffleReasons = set;
            }

            public final void setDisallowTransferringPlaybackReasons(Set<String> set) {
                this.disallowTransferringPlaybackReasons = set;
            }

            public final void setDisallowUpdatingContextReasons(Set<String> set) {
                this.disallowUpdatingContextReasons = set;
            }
        }

        public RestrictionsAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public Restrictions fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Adapter adapter = (Adapter) objFromJson;
            return Restrictions.builder().disallowPausingReasons(adapter.getDisallowPausingReasons()).disallowResumingReasons(adapter.getDisallowResumingReasons()).disallowSeekingReasons(adapter.getDisallowSeekingReasons()).disallowPeekingPrevReasons(adapter.getDisallowPeekingPrevReasons()).disallowPeekingNextReasons(adapter.getDisallowPeekingNextReasons()).disallowSkippingPrevReasons(adapter.getDisallowSkippingPrevReasons()).disallowSkippingNextReasons(adapter.getDisallowSkippingNextReasons()).disallowTogglingRepeatContextReasons(adapter.getDisallowTogglingRepeatContextReasons()).disallowTogglingRepeatTrackReasons(adapter.getDisallowTogglingRepeatTrackReasons()).disallowTogglingShuffleReasons(adapter.getDisallowTogglingShuffleReasons()).disallowSetQueueReasons(adapter.getDisallowSetQueueReasons()).disallowAddToQueueReasons(adapter.getDisallowAddToQueueReasons()).disallowInterruptingPlaybackReasons(adapter.getDisallowInterruptingPlaybackReasons()).disallowTransferringPlaybackReasons(adapter.getDisallowTransferringPlaybackReasons()).disallowRemoteControlReasons(adapter.getDisallowRemoteControlReasons()).disallowInsertingIntoNextTracksReasons(adapter.getDisallowInsertingIntoNextTracksReasons()).disallowInsertingIntoContextTracksReasons(adapter.getDisallowInsertingIntoContextTracksReasons()).disallowReorderingInNextTracksReasons(adapter.getDisallowReorderingInNextTracksReasons()).disallowReorderingInContextTracksReasons(adapter.getDisallowReorderingInContextTracksReasons()).disallowRemovingFromNextTracksReasons(adapter.getDisallowRemovingFromNextTracksReasons()).disallowUpdatingContextReasons(adapter.getDisallowUpdatingContextReasons()).disallowRemovingFromContextTracksReasons(adapter.getDisallowRemovingFromContextTracksReasons()).build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, Restrictions value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setDisallowPausingReasons(value.disallowPausingReasons());
            adapter.setDisallowResumingReasons(value.disallowResumingReasons());
            adapter.setDisallowSeekingReasons(value.disallowSeekingReasons());
            adapter.setDisallowPeekingPrevReasons(value.disallowPeekingPrevReasons());
            adapter.setDisallowPeekingNextReasons(value.disallowPeekingNextReasons());
            adapter.setDisallowSkippingPrevReasons(value.disallowSkippingPrevReasons());
            adapter.setDisallowSkippingNextReasons(value.disallowSkippingNextReasons());
            adapter.setDisallowTogglingRepeatContextReasons(value.disallowTogglingRepeatContextReasons());
            adapter.setDisallowTogglingRepeatTrackReasons(value.disallowTogglingRepeatTrackReasons());
            adapter.setDisallowTogglingShuffleReasons(value.disallowTogglingShuffleReasons());
            adapter.setDisallowSetQueueReasons(value.disallowSetQueueReasons());
            adapter.setDisallowAddToQueueReasons(value.disallowAddToQueueReasons());
            adapter.setDisallowInterruptingPlaybackReasons(value.disallowInterruptingPlaybackReasons());
            adapter.setDisallowTransferringPlaybackReasons(value.disallowTransferringPlaybackReasons());
            adapter.setDisallowRemoteControlReasons(value.disallowRemoteControlReasons());
            adapter.setDisallowInsertingIntoNextTracksReasons(value.disallowInsertingIntoNextTracksReasons());
            adapter.setDisallowInsertingIntoContextTracksReasons(value.disallowInsertingIntoContextTracksReasons());
            adapter.setDisallowReorderingInNextTracksReasons(value.disallowReorderingInNextTracksReasons());
            adapter.setDisallowReorderingInContextTracksReasons(value.disallowReorderingInContextTracksReasons());
            adapter.setDisallowRemovingFromNextTracksReasons(value.disallowRemovingFromNextTracksReasons());
            adapter.setDisallowUpdatingContextReasons(value.disallowUpdatingContextReasons());
            adapter.setDisallowRemovingFromContextTracksReasons(value.disallowRemovingFromContextTracksReasons());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$SkipToTrackAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/command/options/SkipToTrack;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/command/options/SkipToTrack;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/command/options/SkipToTrack;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class SkipToTrackAdapter extends hk60<SkipToTrack> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR&\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR(\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter;", "", "<init>", "()V", "pageUrl", "", "getPageUrl$annotations", "getPageUrl", "()Ljava/lang/String;", "setPageUrl", "(Ljava/lang/String;)V", "pageIndex", "", "getPageIndex$annotations", "getPageIndex", "()Ljava/lang/Long;", "setPageIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "trackUid", "getTrackUid$annotations", "getTrackUid", "setTrackUid", "trackUri", "getTrackUri$annotations", "getTrackUri", "setTrackUri", "trackIndex", "getTrackIndex$annotations", "getTrackIndex", "setTrackIndex", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Long pageIndex;
            private String pageUrl;
            private Long trackIndex;
            private String trackUid;
            private String trackUri;

            @gk60(name = "page_index")
            public static /* synthetic */ void getPageIndex$annotations() {
            }

            @gk60(name = "page_url")
            public static /* synthetic */ void getPageUrl$annotations() {
            }

            @gk60(name = "track_index")
            public static /* synthetic */ void getTrackIndex$annotations() {
            }

            @gk60(name = "track_uid")
            public static /* synthetic */ void getTrackUid$annotations() {
            }

            @gk60(name = "track_uri")
            public static /* synthetic */ void getTrackUri$annotations() {
            }

            public final Long getPageIndex() {
                return this.pageIndex;
            }

            public final String getPageUrl() {
                return this.pageUrl;
            }

            public final Long getTrackIndex() {
                return this.trackIndex;
            }

            public final String getTrackUid() {
                return this.trackUid;
            }

            public final String getTrackUri() {
                return this.trackUri;
            }

            public final void setPageIndex(Long l) {
                this.pageIndex = l;
            }

            public final void setPageUrl(String str) {
                this.pageUrl = str;
            }

            public final void setTrackIndex(Long l) {
                this.trackIndex = l;
            }

            public final void setTrackUid(String str) {
                this.trackUid = str;
            }

            public final void setTrackUri(String str) {
                this.trackUri = str;
            }
        }

        public SkipToTrackAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public SkipToTrack fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Adapter adapter = (Adapter) objFromJson;
            SkipToTrack.Builder builder = SkipToTrack.builder();
            String pageUrl = adapter.getPageUrl();
            if (pageUrl == null) {
                pageUrl = "";
            }
            SkipToTrack.Builder builderPageUrl = builder.pageUrl(pageUrl);
            Long pageIndex = adapter.getPageIndex();
            SkipToTrack.Builder builderPageIndex = builderPageUrl.pageIndex(Long.valueOf(pageIndex != null ? pageIndex.longValue() : 0L));
            String trackUid = adapter.getTrackUid();
            if (trackUid == null) {
                trackUid = "";
            }
            SkipToTrack.Builder builderTrackUid = builderPageIndex.trackUid(trackUid);
            String trackUri = adapter.getTrackUri();
            SkipToTrack.Builder builderTrackUri = builderTrackUid.trackUri(trackUri != null ? trackUri : "");
            Long trackIndex = adapter.getTrackIndex();
            return builderTrackUri.trackIndex(Long.valueOf(trackIndex != null ? trackIndex.longValue() : 0L)).build();
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, SkipToTrack value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setPageUrl((String) value.pageUrl().mo49283h());
            adapter.setPageIndex((Long) value.pageIndex().mo49283h());
            adapter.setTrackUid((String) value.trackUid().mo49283h());
            adapter.setTrackUri((String) value.trackUri().mo49283h());
            adapter.setTrackIndex((Long) value.trackIndex().mo49283h());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$SuppressionsAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/Suppressions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/Suppressions;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/Suppressions;", "Lp/p0i0;", "Adapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class SuppressionsAdapter extends hk60<Suppressions> {
        private final p0i0 moshi;

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$SuppressionsAdapter$Adapter;", "", "<init>", "()V", "providers", "", "", "getProviders$annotations", "getProviders", "()Ljava/util/Set;", "setProviders", "(Ljava/util/Set;)V", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        @ok60(generateAdapter = true)
        public static final class Adapter {
            private Set<String> providers;

            @gk60(name = "providers")
            public static /* synthetic */ void getProviders$annotations() {
            }

            public final Set<String> getProviders() {
                return this.providers;
            }

            public final void setProviders(Set<String> set) {
                this.providers = set;
            }
        }

        public SuppressionsAdapter(p0i0 p0i0Var) {
            this.moshi = p0i0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p204p.hk60
        public Suppressions fromJson(xl60 reader) {
            Object objFromJson = this.moshi.m68703c(Adapter.class).fromJson(reader);
            if (objFromJson != null) {
                return Suppressions.create(((Adapter) objFromJson).getProviders());
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // p204p.hk60
        public void toJson(rm60 writer, Suppressions value) {
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Adapter adapter = new Adapter();
            adapter.setProviders(value.providers());
            this.moshi.m68703c(Adapter.class).toJson(writer, adapter);
        }
    }

    @Override // p204p.hk60.InterfaceC1945e
    public hk60<?> create(Type type, Set<? extends Annotation> annotations, p0i0 moshi) {
        hk60 prefetchLevelAdapter;
        Class<?> clsM62454g = mp91.m62454g(type);
        if (Context.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new ContextAdapter(moshi);
        } else if (Restrictions.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new RestrictionsAdapter(moshi);
        } else if (ContextPage.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new ContextPageAdapter(moshi);
        } else if (ContextTrack.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new ContextTrackAdapter(moshi);
        } else if (PreparePlayOptions.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new PreparePlayOptionsAdapter(moshi);
        } else if (SkipToTrack.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new SkipToTrackAdapter(moshi);
        } else if (AudioStream.class.equals(clsM62454g)) {
            prefetchLevelAdapter = new ModelAudioStreamAdapter();
        } else if (PlayerOptionOverrides.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new PlayerOptionOverridesAdapter(moshi);
        } else if (Suppressions.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new SuppressionsAdapter(moshi);
        } else if (PlayOrigin.class.isAssignableFrom(clsM62454g)) {
            prefetchLevelAdapter = new PlayOriginAdapter(moshi);
        } else {
            prefetchLevelAdapter = PrefetchLevel.class.isAssignableFrom(clsM62454g) ? new PrefetchLevelAdapter(moshi) : null;
        }
        if (prefetchLevelAdapter != null) {
            return prefetchLevelAdapter.nullSafe();
        }
        return null;
    }
}
