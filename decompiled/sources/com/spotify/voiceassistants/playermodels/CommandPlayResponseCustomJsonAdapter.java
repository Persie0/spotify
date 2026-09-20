package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.be00;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.jx71;
import p204p.lau;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/CommandPlayResponseCustomJsonAdapter;", "Lp/hk60;", "Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "", "toString", "()Ljava/lang/String;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "Lp/rm60;", "writer", "value_", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;)V", "Lp/p0i0;", "getMoshi", "()Lp/p0i0;", "Lp/xl60$b;", "options", "Lp/xl60$b;", "nullableStringAdapter", "Lp/hk60;", "stringAdapter", "", "", "listAdapter", "Lcom/spotify/voiceassistants/playermodels/ContextJsonAdapter;", "contextAdapter", "Lcom/spotify/voiceassistants/playermodels/ContextJsonAdapter;", "Lcom/spotify/voiceassistants/playermodels/PreparePlayOptionsJsonAdapter;", "preparePlayOptionsAdapter", "Lcom/spotify/voiceassistants/playermodels/PreparePlayOptionsJsonAdapter;", "Lcom/spotify/voiceassistants/playermodels/PlayOriginJsonAdapter;", "playOriginAdapter", "Lcom/spotify/voiceassistants/playermodels/PlayOriginJsonAdapter;", "Lcom/spotify/voiceassistants/playermodels/LoggingParamsJsonAdapter;", "loggingParamsAdapter", "Lcom/spotify/voiceassistants/playermodels/LoggingParamsJsonAdapter;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CommandPlayResponseCustomJsonAdapter extends hk60<CommandPlayResponse> {
    private final ContextJsonAdapter contextAdapter;
    private final hk60<List<Integer>> listAdapter;
    private final LoggingParamsJsonAdapter loggingParamsAdapter;
    private final p0i0 moshi;
    private final hk60<String> nullableStringAdapter;
    private final xl60.C2578b options;
    private final PlayOriginJsonAdapter playOriginAdapter;
    private final PreparePlayOptionsJsonAdapter preparePlayOptionsAdapter;
    private final hk60<String> stringAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public CommandPlayResponseCustomJsonAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final p0i0 getMoshi() {
        return this.moshi;
    }

    public String toString() {
        return ydj.m93450i(41, "GeneratedJsonAdapter(CommandPlayResponse)");
    }

    public CommandPlayResponseCustomJsonAdapter(p0i0 p0i0Var) {
        this.moshi = p0i0Var;
        this.options = xl60.C2578b.m91389a("req_id", "error", "endpoint", "context", "options", "play_origin", "logging_params", "playback_readiness", "retry_delay_ms");
        gbu gbuVar = gbu.f78413a;
        this.nullableStringAdapter = p0i0Var.m68706f(String.class, gbuVar, "requestId");
        this.stringAdapter = p0i0Var.m68706f(String.class, gbuVar, "endpoint");
        this.listAdapter = p0i0Var.m68706f(mp91.m62457j(List.class, Integer.class), gbuVar, "retry_delay_ms");
        this.contextAdapter = new ContextJsonAdapter();
        this.preparePlayOptionsAdapter = new PreparePlayOptionsJsonAdapter();
        this.playOriginAdapter = new PlayOriginJsonAdapter();
        this.loggingParamsAdapter = new LoggingParamsJsonAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    @be00
    public CommandPlayResponse fromJson(xl60 reader) {
        reader.mo51076c();
        lau lauVar = lau.f131415a;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Context contextFromJson = null;
        PreparePlayOptions preparePlayOptionsFromJson = null;
        PlayOrigin playOriginFromJson = null;
        LoggingParams loggingParamsFromJson = null;
        String strFromJson4 = null;
        while (true) {
            List<Integer> list = lauVar;
            while (true) {
                if (!reader.mo51079i()) {
                    reader.mo51078f();
                    if (strFromJson3 != null) {
                        return new CommandPlayResponse(strFromJson, strFromJson2, strFromJson3, contextFromJson, preparePlayOptionsFromJson, playOriginFromJson, loggingParamsFromJson, strFromJson4, list);
                    }
                    throw f0b1.m40461o("endpoint", "endpoint", reader);
                }
                switch (reader.mo51071K(this.options)) {
                    case -1:
                        reader.mo51073P();
                        reader.mo51074Q();
                        break;
                    case 0:
                        strFromJson = this.nullableStringAdapter.fromJson(reader);
                        break;
                    case 1:
                        strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                        break;
                    case 2:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            throw f0b1.m40470x("endpoint", "endpoint", reader);
                        }
                        break;
                        break;
                    case 3:
                        contextFromJson = this.contextAdapter.nullSafe().fromJson(reader);
                        break;
                    case 4:
                        preparePlayOptionsFromJson = this.preparePlayOptionsAdapter.nullSafe().fromJson(reader);
                        break;
                    case 5:
                        playOriginFromJson = this.playOriginAdapter.nullSafe().fromJson(reader);
                        break;
                    case 6:
                        loggingParamsFromJson = this.loggingParamsAdapter.nullSafe().fromJson(reader);
                        break;
                    case 7:
                        strFromJson4 = this.nullableStringAdapter.nullSafe().fromJson(reader);
                        break;
                    case 8:
                        List<Integer> listFromJson = this.listAdapter.nullSafe().fromJson(reader);
                        if (listFromJson != null) {
                            list = listFromJson;
                        }
                        break;
                }
            }
        }
    }

    @Override // p204p.hk60
    @jx71
    public void toJson(rm60 writer, CommandPlayResponse value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo56891e();
        writer.mo56894s("req_id");
        this.nullableStringAdapter.toJson(writer, value_.getRequestId());
        writer.mo56894s("error");
        this.nullableStringAdapter.toJson(writer, value_.getError());
        writer.mo56894s("endpoint");
        this.stringAdapter.toJson(writer, value_.getEndpoint());
        writer.mo56894s("context");
        this.contextAdapter.toJson(writer, value_.getContext());
        writer.mo56894s("options");
        this.preparePlayOptionsAdapter.toJson(writer, value_.getPlayOptions());
        writer.mo56894s("play_origin");
        this.playOriginAdapter.toJson(writer, value_.getPlayOrigin());
        writer.mo56894s("logging_params");
        this.loggingParamsAdapter.toJson(writer, value_.getLoggingParams());
        writer.mo56894s("playback_readiness");
        this.nullableStringAdapter.toJson(writer, value_.getPlaybackReadiness());
        writer.mo56894s("retry_delay_ms");
        this.listAdapter.toJson(writer, value_.getRetryDelayMs());
        writer.mo56893i();
    }

    public /* synthetic */ CommandPlayResponseCustomJsonAdapter(p0i0 p0i0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new p0i0.C2237b().m68713e() : p0i0Var);
    }
}
