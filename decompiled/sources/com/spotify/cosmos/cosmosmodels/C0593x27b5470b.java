package com.spotify.cosmos.cosmosmodels;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Context;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PrefetchLevel;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.Map;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: renamed from: com.spotify.cosmos.cosmosmodels.CosmosTypeAdapterFactory_PreparePlayOptionsAdapter_AdapterJsonAdapter */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018¨\u0006*"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory_PreparePlayOptionsAdapter_AdapterJsonAdapter;", "Lp/hk60;", "Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "", "toString", "()Ljava/lang/String;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter;", "Lp/rm60;", "writer", "value_", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter;)V", "Lp/xl60$b;", "options", "Lp/xl60$b;", "nullableStringAdapter", "Lp/hk60;", "", "nullableBooleanAdapter", "Lcom/spotify/player/model/command/options/SkipToTrack;", "nullableSkipToTrackAdapter", "", "nullableLongAdapter", "Lcom/spotify/player/model/command/options/PlayerOptionOverrides;", "nullablePlayerOptionOverridesAdapter", "Lcom/spotify/player/model/Suppressions;", "nullableSuppressionsAdapter", "Lcom/spotify/player/model/command/options/PrefetchLevel;", "nullablePrefetchLevelAdapter", "Lcom/spotify/player/model/AudioStream;", "nullableAudioStreamAdapter", "", "", "nullableMapOfStringAnyAdapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class C0593x27b5470b extends hk60<CosmosTypeAdapterFactory.PreparePlayOptionsAdapter.Adapter> {
    private final hk60<AudioStream> nullableAudioStreamAdapter;
    private final hk60<Boolean> nullableBooleanAdapter;
    private final hk60<Long> nullableLongAdapter;
    private final hk60<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final hk60<PlayerOptionOverrides> nullablePlayerOptionOverridesAdapter;
    private final hk60<PrefetchLevel> nullablePrefetchLevelAdapter;
    private final hk60<SkipToTrack> nullableSkipToTrackAdapter;
    private final hk60<String> nullableStringAdapter;
    private final hk60<Suppressions> nullableSuppressionsAdapter;
    private final xl60.C2578b options = xl60.C2578b.m91389a("playback_id", "always_play_something", "skip_to", "seek_to", "initially_paused", "system_initiated", "player_options_override", "suppressions", "prefetch_level", "audio_stream", "session_id", Context.Metadata.KEY_LICENSE, "configuration_override");

    public C0593x27b5470b(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.nullableStringAdapter = p0i0Var.m68706f(String.class, gbuVar, "playbackId");
        this.nullableBooleanAdapter = p0i0Var.m68706f(Boolean.class, gbuVar, "alwaysPlaySomething");
        this.nullableSkipToTrackAdapter = p0i0Var.m68706f(SkipToTrack.class, gbuVar, "skipTo");
        this.nullableLongAdapter = p0i0Var.m68706f(Long.class, gbuVar, "seekTo");
        this.nullablePlayerOptionOverridesAdapter = p0i0Var.m68706f(PlayerOptionOverrides.class, gbuVar, "playerOptionsOverride");
        this.nullableSuppressionsAdapter = p0i0Var.m68706f(Suppressions.class, gbuVar, "suppressions");
        this.nullablePrefetchLevelAdapter = p0i0Var.m68706f(PrefetchLevel.class, gbuVar, "prefetchLevel");
        this.nullableAudioStreamAdapter = p0i0Var.m68706f(AudioStream.class, gbuVar, "audioStream");
        this.nullableMapOfStringAnyAdapter = p0i0Var.m68706f(mp91.m62457j(Map.class, String.class, Object.class), gbuVar, "configurationOverride");
    }

    public String toString() {
        return ydj.m93450i(80, "GeneratedJsonAdapter(CosmosTypeAdapterFactory.PreparePlayOptionsAdapter.Adapter)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    public CosmosTypeAdapterFactory.PreparePlayOptionsAdapter.Adapter fromJson(xl60 reader) {
        reader.mo51076c();
        String strFromJson = null;
        SkipToTrack skipToTrackFromJson = null;
        Long lFromJson = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        PlayerOptionOverrides playerOptionOverridesFromJson = null;
        Suppressions suppressionsFromJson = null;
        PrefetchLevel prefetchLevelFromJson = null;
        AudioStream audioStreamFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Map<String, ? extends Object> map = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        Boolean boolFromJson3 = null;
        while (reader.mo51079i()) {
            boolean z14 = z;
            switch (reader.mo51071K(this.options)) {
                case -1:
                    reader.mo51073P();
                    reader.mo51074Q();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    z = true;
                    continue;
                case 1:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    z = z14;
                    z2 = true;
                    continue;
                case 2:
                    skipToTrackFromJson = this.nullableSkipToTrackAdapter.fromJson(reader);
                    z = z14;
                    z3 = true;
                    continue;
                case 3:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    z = z14;
                    z4 = true;
                    continue;
                case 4:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    z = z14;
                    z5 = true;
                    continue;
                case 5:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    z = z14;
                    z6 = true;
                    continue;
                case 6:
                    playerOptionOverridesFromJson = this.nullablePlayerOptionOverridesAdapter.fromJson(reader);
                    z = z14;
                    z7 = true;
                    continue;
                case 7:
                    suppressionsFromJson = this.nullableSuppressionsAdapter.fromJson(reader);
                    z = z14;
                    z8 = true;
                    continue;
                case 8:
                    prefetchLevelFromJson = this.nullablePrefetchLevelAdapter.fromJson(reader);
                    z = z14;
                    z9 = true;
                    continue;
                case 9:
                    audioStreamFromJson = this.nullableAudioStreamAdapter.fromJson(reader);
                    z = z14;
                    z10 = true;
                    continue;
                case 10:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    z = z14;
                    z11 = true;
                    continue;
                case 11:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    z = z14;
                    z12 = true;
                    continue;
                case 12:
                    map = (Map) this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    z = z14;
                    z13 = true;
                    continue;
            }
            z = z14;
        }
        boolean z15 = z;
        reader.mo51078f();
        CosmosTypeAdapterFactory.PreparePlayOptionsAdapter.Adapter adapter = new CosmosTypeAdapterFactory.PreparePlayOptionsAdapter.Adapter();
        if (z15) {
            adapter.setPlaybackId(strFromJson);
        }
        if (z2) {
            adapter.setAlwaysPlaySomething(boolFromJson3);
        }
        if (z3) {
            adapter.setSkipTo(skipToTrackFromJson);
        }
        if (z4) {
            adapter.setSeekTo(lFromJson);
        }
        if (z5) {
            adapter.setInitiallyPaused(boolFromJson);
        }
        if (z6) {
            adapter.setSystemInitiated(boolFromJson2);
        }
        if (z7) {
            adapter.setPlayerOptionsOverride(playerOptionOverridesFromJson);
        }
        if (z8) {
            adapter.setSuppressions(suppressionsFromJson);
        }
        if (z9) {
            adapter.setPrefetchLevel(prefetchLevelFromJson);
        }
        if (z10) {
            adapter.setAudioStream(audioStreamFromJson);
        }
        if (z11) {
            adapter.setSessionId(strFromJson2);
        }
        if (z12) {
            adapter.setLicense(strFromJson3);
        }
        if (z13) {
            adapter.setConfigurationOverride(map);
        }
        return adapter;
    }

    @Override // p204p.hk60
    public void toJson(rm60 writer, CosmosTypeAdapterFactory.PreparePlayOptionsAdapter.Adapter value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo56891e();
        writer.mo56894s("playback_id");
        this.nullableStringAdapter.toJson(writer, value_.getPlaybackId());
        writer.mo56894s("always_play_something");
        this.nullableBooleanAdapter.toJson(writer, value_.getAlwaysPlaySomething());
        writer.mo56894s("skip_to");
        this.nullableSkipToTrackAdapter.toJson(writer, value_.getSkipTo());
        writer.mo56894s("seek_to");
        this.nullableLongAdapter.toJson(writer, value_.getSeekTo());
        writer.mo56894s("initially_paused");
        this.nullableBooleanAdapter.toJson(writer, value_.getInitiallyPaused());
        writer.mo56894s("system_initiated");
        this.nullableBooleanAdapter.toJson(writer, value_.getSystemInitiated());
        writer.mo56894s("player_options_override");
        this.nullablePlayerOptionOverridesAdapter.toJson(writer, value_.getPlayerOptionsOverride());
        writer.mo56894s("suppressions");
        this.nullableSuppressionsAdapter.toJson(writer, value_.getSuppressions());
        writer.mo56894s("prefetch_level");
        this.nullablePrefetchLevelAdapter.toJson(writer, value_.getPrefetchLevel());
        writer.mo56894s("audio_stream");
        this.nullableAudioStreamAdapter.toJson(writer, value_.getAudioStream());
        writer.mo56894s("session_id");
        this.nullableStringAdapter.toJson(writer, value_.getSessionId());
        writer.mo56894s(Context.Metadata.KEY_LICENSE);
        this.nullableStringAdapter.toJson(writer, value_.getLicense());
        writer.mo56894s("configuration_override");
        this.nullableMapOfStringAnyAdapter.toJson(writer, value_.getConfigurationOverride());
        writer.mo56893i();
    }
}
