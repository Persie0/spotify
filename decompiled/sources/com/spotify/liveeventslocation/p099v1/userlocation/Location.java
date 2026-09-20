package com.spotify.liveeventslocation.p099v1.userlocation;

import com.google.protobuf.AbstractC0269h;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Location extends AbstractC0269h implements sre0 {
    public static final int COORDINATES_FIELD_NUMBER = 5;
    public static final int COUNTRY_FIELD_NUMBER = 2;
    private static final Location DEFAULT_INSTANCE;
    public static final int GEOHASH_FIELD_NUMBER = 4;
    public static final int GEONAME_ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Coordinates coordinates_;
    private String geonameId_ = "";
    private String country_ = "";
    private String name_ = "";
    private String geohash_ = "";

    static {
        Location location = new Location();
        DEFAULT_INSTANCE = location;
        AbstractC0269h.registerDefaultInstance(Location.class, location);
    }

    private Location() {
    }

    /* JADX INFO: renamed from: n */
    public static Location m13056n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "geonameId_", "country_", "name_", "geohash_", "coordinates_"});
        }
        if (iOrdinal == 3) {
            return new Location();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 21);
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
    public final String m13057o() {
        return this.geonameId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
