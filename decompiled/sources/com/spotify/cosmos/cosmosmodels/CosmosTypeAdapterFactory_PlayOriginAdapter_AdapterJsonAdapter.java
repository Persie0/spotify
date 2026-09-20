package com.spotify.cosmos.cosmosmodels;

import java.util.Set;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory_PlayOriginAdapter_AdapterJsonAdapter;", "Lp/hk60;", "Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "", "toString", "()Ljava/lang/String;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter;", "Lp/rm60;", "writer", "value_", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter;)V", "Lp/xl60$b;", "options", "Lp/xl60$b;", "nullableStringAdapter", "Lp/hk60;", "", "nullableSetOfStringAdapter", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosTypeAdapterFactory_PlayOriginAdapter_AdapterJsonAdapter extends hk60<CosmosTypeAdapterFactory.PlayOriginAdapter.Adapter> {
    private final hk60<Set<String>> nullableSetOfStringAdapter;
    private final hk60<String> nullableStringAdapter;
    private final xl60.C2578b options = xl60.C2578b.m91389a("feature_identifier", "feature_version", "view_uri", "external_referrer", "referrer_identifier", "device_identifier", "feature_classes");

    public CosmosTypeAdapterFactory_PlayOriginAdapter_AdapterJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.nullableStringAdapter = p0i0Var.m68706f(String.class, gbuVar, "featureIdentifier");
        this.nullableSetOfStringAdapter = p0i0Var.m68706f(mp91.m62457j(Set.class, String.class), gbuVar, "featureClasses");
    }

    public String toString() {
        return ydj.m93450i(72, "GeneratedJsonAdapter(CosmosTypeAdapterFactory.PlayOriginAdapter.Adapter)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    public CosmosTypeAdapterFactory.PlayOriginAdapter.Adapter fromJson(xl60 reader) {
        reader.mo51076c();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        Set<String> setFromJson = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String strFromJson6 = null;
        while (reader.mo51079i()) {
            boolean z8 = z;
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
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    z = z8;
                    z2 = true;
                    continue;
                case 2:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    z = z8;
                    z3 = true;
                    continue;
                case 3:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    z = z8;
                    z4 = true;
                    continue;
                case 4:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    z = z8;
                    z5 = true;
                    continue;
                case 5:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    z = z8;
                    z6 = true;
                    continue;
                case 6:
                    setFromJson = this.nullableSetOfStringAdapter.fromJson(reader);
                    z = z8;
                    z7 = true;
                    continue;
            }
            z = z8;
        }
        boolean z9 = z;
        reader.mo51078f();
        CosmosTypeAdapterFactory.PlayOriginAdapter.Adapter adapter = new CosmosTypeAdapterFactory.PlayOriginAdapter.Adapter();
        if (z9) {
            adapter.setFeatureIdentifier(strFromJson);
        }
        if (z2) {
            adapter.setFeatureVersion(strFromJson6);
        }
        if (z3) {
            adapter.setViewUri(strFromJson2);
        }
        if (z4) {
            adapter.setExternalReferrer(strFromJson3);
        }
        if (z5) {
            adapter.setReferrerIdentifier(strFromJson4);
        }
        if (z6) {
            adapter.setDeviceIdentifier(strFromJson5);
        }
        if (z7) {
            adapter.setFeatureClasses(setFromJson);
        }
        return adapter;
    }

    @Override // p204p.hk60
    public void toJson(rm60 writer, CosmosTypeAdapterFactory.PlayOriginAdapter.Adapter value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo56891e();
        writer.mo56894s("feature_identifier");
        this.nullableStringAdapter.toJson(writer, value_.getFeatureIdentifier());
        writer.mo56894s("feature_version");
        this.nullableStringAdapter.toJson(writer, value_.getFeatureVersion());
        writer.mo56894s("view_uri");
        this.nullableStringAdapter.toJson(writer, value_.getViewUri());
        writer.mo56894s("external_referrer");
        this.nullableStringAdapter.toJson(writer, value_.getExternalReferrer());
        writer.mo56894s("referrer_identifier");
        this.nullableStringAdapter.toJson(writer, value_.getReferrerIdentifier());
        writer.mo56894s("device_identifier");
        this.nullableStringAdapter.toJson(writer, value_.getDeviceIdentifier());
        writer.mo56894s("feature_classes");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getFeatureClasses());
        writer.mo56893i();
    }
}
