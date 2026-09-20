package com.spotify.cosmos.cosmosmodels;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: renamed from: com.spotify.cosmos.cosmosmodels.CosmosTypeAdapterFactory_PlayerOptionOverridesAdapter_AdapterJsonAdapter */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory_PlayerOptionOverridesAdapter_AdapterJsonAdapter;", "Lp/hk60;", "Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "", "toString", "()Ljava/lang/String;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter;", "Lp/rm60;", "writer", "value_", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter;)V", "Lp/xl60$b;", "options", "Lp/xl60$b;", "", "nullableBooleanAdapter", "Lp/hk60;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class C0592xd95ad899 extends hk60<CosmosTypeAdapterFactory.PlayerOptionOverridesAdapter.Adapter> {
    private final hk60<Boolean> nullableBooleanAdapter;
    private final xl60.C2578b options = xl60.C2578b.m91389a("shuffling_context", "repeating_context", "repeating_track");

    public C0592xd95ad899(p0i0 p0i0Var) {
        this.nullableBooleanAdapter = p0i0Var.m68706f(Boolean.class, gbu.f78413a, "shufflingContext");
    }

    public String toString() {
        return ydj.m93450i(83, "GeneratedJsonAdapter(CosmosTypeAdapterFactory.PlayerOptionOverridesAdapter.Adapter)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    public CosmosTypeAdapterFactory.PlayerOptionOverridesAdapter.Adapter fromJson(xl60 reader) {
        reader.mo51076c();
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Boolean boolFromJson3 = null;
        while (reader.mo51079i()) {
            int iMo51071K = reader.mo51071K(this.options);
            if (iMo51071K == -1) {
                reader.mo51073P();
                reader.mo51074Q();
            } else if (iMo51071K == 0) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                z = true;
            } else if (iMo51071K == 1) {
                boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                z2 = true;
            } else if (iMo51071K == 2) {
                boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                z3 = true;
            }
        }
        reader.mo51078f();
        CosmosTypeAdapterFactory.PlayerOptionOverridesAdapter.Adapter adapter = new CosmosTypeAdapterFactory.PlayerOptionOverridesAdapter.Adapter();
        if (z) {
            adapter.setShufflingContext(boolFromJson);
        }
        if (z2) {
            adapter.setRepeatingContext(boolFromJson3);
        }
        if (z3) {
            adapter.setRepeatingTrack(boolFromJson2);
        }
        return adapter;
    }

    @Override // p204p.hk60
    public void toJson(rm60 writer, CosmosTypeAdapterFactory.PlayerOptionOverridesAdapter.Adapter value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo56891e();
        writer.mo56894s("shuffling_context");
        this.nullableBooleanAdapter.toJson(writer, value_.getShufflingContext());
        writer.mo56894s("repeating_context");
        this.nullableBooleanAdapter.toJson(writer, value_.getRepeatingContext());
        writer.mo56894s("repeating_track");
        this.nullableBooleanAdapter.toJson(writer, value_.getRepeatingTrack());
        writer.mo56893i();
    }
}
