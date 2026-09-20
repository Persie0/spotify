package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.DateTime;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VenueInfoRow extends AbstractC0269h implements sre0 {
    public static final int ADDITIONAL_INFORMATION_FIELD_NUMBER = 3;
    public static final int CONCERT_START_FIELD_NUMBER = 1;
    private static final VenueInfoRow DEFAULT_INSTANCE;
    public static final int DOORS_OPEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String additionalInformation_ = "";
    private int bitField0_;
    private DateTime concertStart_;
    private DateTime doorsOpen_;

    static {
        VenueInfoRow venueInfoRow = new VenueInfoRow();
        DEFAULT_INSTANCE = venueInfoRow;
        AbstractC0269h.registerDefaultInstance(VenueInfoRow.class, venueInfoRow);
    }

    private VenueInfoRow() {
    }

    /* JADX INFO: renamed from: p */
    public static VenueInfoRow m7193p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "concertStart_", "doorsOpen_", "additionalInformation_"});
        }
        if (iOrdinal == 3) {
            return new VenueInfoRow();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 10);
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
        synchronized (VenueInfoRow.class) {
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
    public final String m7194n() {
        return this.additionalInformation_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DateTime m7195o() {
        DateTime dateTime = this.concertStart_;
        return dateTime == null ? DateTime.m2198o() : dateTime;
    }

    /* JADX INFO: renamed from: q */
    public final DateTime m7196q() {
        DateTime dateTime = this.doorsOpen_;
        return dateTime == null ? DateTime.m2198o() : dateTime;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7197r() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7198s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7199t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
