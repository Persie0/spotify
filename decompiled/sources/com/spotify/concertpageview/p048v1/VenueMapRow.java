package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.LatLng;
import p204p.ae50;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VenueMapRow extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTION_FIELD_NUMBER = 3;
    public static final int COORDINATES_FIELD_NUMBER = 1;
    private static final VenueMapRow DEFAULT_INSTANCE;
    public static final int MAP_LINKS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private Attribution attribution_;
    private int bitField0_;
    private LatLng coordinates_;
    private ae50 mapLinks_ = AbstractC0269h.emptyProtobufList();

    static {
        VenueMapRow venueMapRow = new VenueMapRow();
        DEFAULT_INSTANCE = venueMapRow;
        AbstractC0269h.registerDefaultInstance(VenueMapRow.class, venueMapRow);
    }

    private VenueMapRow() {
    }

    /* JADX INFO: renamed from: p */
    public static VenueMapRow m7205p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "coordinates_", "mapLinks_", VenueMapLink.class, "attribution_"});
        }
        if (iOrdinal == 3) {
            return new VenueMapRow();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 14);
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
        synchronized (VenueMapRow.class) {
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

    /* JADX INFO: renamed from: n */
    public final Attribution m7206n() {
        Attribution attribution = this.attribution_;
        return attribution == null ? Attribution.m7022n() : attribution;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final LatLng m7207o() {
        LatLng latLng = this.coordinates_;
        return latLng == null ? LatLng.m2214n() : latLng;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m7208q() {
        return this.mapLinks_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7209r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
