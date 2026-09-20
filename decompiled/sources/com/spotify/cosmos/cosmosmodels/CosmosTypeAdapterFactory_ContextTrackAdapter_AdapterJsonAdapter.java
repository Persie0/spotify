package com.spotify.cosmos.cosmosmodels;

import com.spotify.player.model.ContextTrack;
import java.util.Map;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory_ContextTrackAdapter_AdapterJsonAdapter;", "Lp/hk60;", "Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "", "toString", "()Ljava/lang/String;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter;", "Lp/rm60;", "writer", "value_", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter;)V", "Lp/xl60$b;", "options", "Lp/xl60$b;", "nullableStringAdapter", "Lp/hk60;", "", "nullableMapOfStringStringAdapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosTypeAdapterFactory_ContextTrackAdapter_AdapterJsonAdapter extends hk60<CosmosTypeAdapterFactory.ContextTrackAdapter.Adapter> {
    private final hk60<Map<String, String>> nullableMapOfStringStringAdapter;
    private final hk60<String> nullableStringAdapter;
    private final xl60.C2578b options = xl60.C2578b.m91389a("uri", "uid", "metadata", ContextTrack.Metadata.KEY_PROVIDER);

    public CosmosTypeAdapterFactory_ContextTrackAdapter_AdapterJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.nullableStringAdapter = p0i0Var.m68706f(String.class, gbuVar, "uri");
        this.nullableMapOfStringStringAdapter = p0i0Var.m68706f(mp91.m62457j(Map.class, String.class, String.class), gbuVar, "metadata");
    }

    public String toString() {
        return ydj.m93450i(74, "GeneratedJsonAdapter(CosmosTypeAdapterFactory.ContextTrackAdapter.Adapter)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    public CosmosTypeAdapterFactory.ContextTrackAdapter.Adapter fromJson(xl60 reader) {
        reader.mo51076c();
        String strFromJson = null;
        Map<String, String> mapFromJson = null;
        String strFromJson2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String strFromJson3 = null;
        while (reader.mo51079i()) {
            int iMo51071K = reader.mo51071K(this.options);
            if (iMo51071K == -1) {
                reader.mo51073P();
                reader.mo51074Q();
            } else if (iMo51071K == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                z = true;
            } else if (iMo51071K == 1) {
                strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                z2 = true;
            } else if (iMo51071K == 2) {
                mapFromJson = this.nullableMapOfStringStringAdapter.fromJson(reader);
                z3 = true;
            } else if (iMo51071K == 3) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                z4 = true;
            }
        }
        reader.mo51078f();
        CosmosTypeAdapterFactory.ContextTrackAdapter.Adapter adapter = new CosmosTypeAdapterFactory.ContextTrackAdapter.Adapter();
        if (z) {
            adapter.setUri(strFromJson);
        }
        if (z2) {
            adapter.setUid(strFromJson3);
        }
        if (z3) {
            adapter.setMetadata(mapFromJson);
        }
        if (z4) {
            adapter.setProvider(strFromJson2);
        }
        return adapter;
    }

    @Override // p204p.hk60
    public void toJson(rm60 writer, CosmosTypeAdapterFactory.ContextTrackAdapter.Adapter value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo56891e();
        writer.mo56894s("uri");
        this.nullableStringAdapter.toJson(writer, value_.getUri());
        writer.mo56894s("uid");
        this.nullableStringAdapter.toJson(writer, value_.getUid());
        writer.mo56894s("metadata");
        this.nullableMapOfStringStringAdapter.toJson(writer, value_.getMetadata());
        writer.mo56894s(ContextTrack.Metadata.KEY_PROVIDER);
        this.nullableStringAdapter.toJson(writer, value_.getProvider());
        writer.mo56893i();
    }
}
