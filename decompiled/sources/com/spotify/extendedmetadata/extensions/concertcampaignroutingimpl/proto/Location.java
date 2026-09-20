package com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Location extends AbstractC0269h implements sre0 {
    private static final Location DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PHYSICAL_LOCATION_FIELD_NUMBER = 4;
    public static final int VENUE_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object details_;
    private int detailsCase_ = 0;
    private String venueUri_ = "";
    private String name_ = "";

    static {
        Location location = new Location();
        DEFAULT_INSTANCE = location;
        AbstractC0269h.registerDefaultInstance(Location.class, location);
    }

    private Location() {
    }

    /* JADX INFO: renamed from: n */
    public static Location m9997n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0004<\u0000", new Object[]{"details_", "detailsCase_", "bitField0_", "venueUri_", "name_", PhysicalLocation.class});
        }
        if (iOrdinal == 3) {
            return new Location();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 19);
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
        synchronized (Location.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m9998o() {
        int i = this.detailsCase_;
        if (i != 0) {
            return i != 4 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: p */
    public final PhysicalLocation m9999p() {
        return this.detailsCase_ == 4 ? (PhysicalLocation) this.details_ : PhysicalLocation.m10002o();
    }

    /* JADX INFO: renamed from: q */
    public final String m10000q() {
        return this.venueUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10001r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
