package com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class RoutingDetail extends AbstractC0269h implements sre0 {
    public static final int CONCERT_URI_FIELD_NUMBER = 1;
    private static final RoutingDetail DEFAULT_INSTANCE;
    public static final int EVENT_DATE_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 4;
    public static final int OFFER_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private DateWithOffset eventDate_;
    private Location location_;
    private String concertUri_ = "";
    private String offerId_ = "";

    static {
        RoutingDetail routingDetail = new RoutingDetail();
        DEFAULT_INSTANCE = routingDetail;
        AbstractC0269h.registerDefaultInstance(RoutingDetail.class, routingDetail);
    }

    private RoutingDetail() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "concertUri_", "offerId_", "eventDate_", "location_"});
        }
        if (iOrdinal == 3) {
            return new RoutingDetail();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 6);
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
        synchronized (RoutingDetail.class) {
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
    public final String m10005n() {
        return this.concertUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DateWithOffset m10006o() {
        DateWithOffset dateWithOffset = this.eventDate_;
        return dateWithOffset == null ? DateWithOffset.m9991o() : dateWithOffset;
    }

    /* JADX INFO: renamed from: p */
    public final Location m10007p() {
        Location location = this.location_;
        return location == null ? Location.m9997n() : location;
    }

    /* JADX INFO: renamed from: q */
    public final String m10008q() {
        return this.offerId_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10009r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m10010s() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
