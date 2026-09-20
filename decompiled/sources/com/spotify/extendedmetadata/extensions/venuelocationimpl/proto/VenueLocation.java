package com.spotify.extendedmetadata.extensions.venuelocationimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VenueLocation extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_FIELD_NUMBER = 1;
    public static final int CITY_FIELD_NUMBER = 2;
    public static final int COUNTRY_FIELD_NUMBER = 3;
    private static final VenueLocation DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 6;
    public static final int LONGITUDE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int POSTALCODE_FIELD_NUMBER = 8;
    public static final int REGION_FIELD_NUMBER = 5;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TIMEZONE_FIELD_NUMBER = 9;
    private double latitude_;
    private double longitude_;
    private String address_ = "";
    private String city_ = "";
    private String country_ = "";
    private String region_ = "";
    private String state_ = "";
    private String postalcode_ = "";
    private String timezone_ = "";

    static {
        VenueLocation venueLocation = new VenueLocation();
        DEFAULT_INSTANCE = venueLocation;
        AbstractC0269h.registerDefaultInstance(VenueLocation.class, venueLocation);
    }

    private VenueLocation() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static VenueLocation m10498w(byte[] bArr) {
        return (VenueLocation) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0000\u0007\u0000\bȈ\tȈ", new Object[]{"address_", "city_", "country_", "state_", "region_", "latitude_", "longitude_", "postalcode_", "timezone_"});
        }
        if (iOrdinal == 3) {
            return new VenueLocation();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 12);
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
        synchronized (VenueLocation.class) {
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
    public final String m10499n() {
        return this.address_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10500o() {
        return this.city_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10501p() {
        return this.country_;
    }

    /* JADX INFO: renamed from: q */
    public final double m10502q() {
        return this.latitude_;
    }

    /* JADX INFO: renamed from: r */
    public final double m10503r() {
        return this.longitude_;
    }

    /* JADX INFO: renamed from: s */
    public final String m10504s() {
        return this.postalcode_;
    }

    /* JADX INFO: renamed from: t */
    public final String m10505t() {
        return this.region_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m10506u() {
        return this.state_;
    }

    /* JADX INFO: renamed from: v */
    public final String m10507v() {
        return this.timezone_;
    }
}
