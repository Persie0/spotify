package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.LatLng;
import p204p.ae50;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class MapRow extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int ATTRIBUTION_FIELD_NUMBER = 5;
    public static final int COORDINATES_FIELD_NUMBER = 3;
    private static final MapRow DEFAULT_INSTANCE;
    public static final int MAP_LINKS_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private Attribution attribution_;
    private int bitField0_;
    private LatLng coordinates_;
    private String name_ = "";
    private String address_ = "";
    private ae50 mapLinks_ = AbstractC0269h.emptyProtobufList();

    static {
        MapRow mapRow = new MapRow();
        DEFAULT_INSTANCE = mapRow;
        AbstractC0269h.registerDefaultInstance(MapRow.class, mapRow);
    }

    private MapRow() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static MapRow m22308q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005ဉ\u0001", new Object[]{"bitField0_", "name_", "address_", "coordinates_", "mapLinks_", MapLink.class, "attribution_"});
        }
        if (iOrdinal == 3) {
            return new MapRow();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 19);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (MapRow.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22309n() {
        return this.address_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Attribution m22310o() {
        Attribution attribution = this.attribution_;
        return attribution == null ? Attribution.m22274n() : attribution;
    }

    /* JADX INFO: renamed from: p */
    public final LatLng m22311p() {
        LatLng latLng = this.coordinates_;
        return latLng == null ? LatLng.m2214n() : latLng;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22312r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
