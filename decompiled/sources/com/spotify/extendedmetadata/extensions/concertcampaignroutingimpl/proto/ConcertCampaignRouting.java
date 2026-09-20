package com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcertCampaignRouting extends AbstractC0269h implements sre0 {
    private static final ConcertCampaignRouting DEFAULT_INSTANCE;
    public static final int FIRST_CONCERT_DATE_FIELD_NUMBER = 2;
    public static final int LAST_CONCERT_DATE_FIELD_NUMBER = 3;
    public static final int LOCATIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int ROUTING_DETAILS_FIELD_NUMBER = 4;
    private int bitField0_;
    private DateWithOffset firstConcertDate_;
    private DateWithOffset lastConcertDate_;
    private ae50 locations_ = AbstractC0269h.emptyProtobufList();
    private ae50 routingDetails_ = AbstractC0269h.emptyProtobufList();

    static {
        ConcertCampaignRouting concertCampaignRouting = new ConcertCampaignRouting();
        DEFAULT_INSTANCE = concertCampaignRouting;
        AbstractC0269h.registerDefaultInstance(ConcertCampaignRouting.class, concertCampaignRouting);
    }

    private ConcertCampaignRouting() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static ConcertCampaignRouting m9984t(byte[] bArr) {
        return (ConcertCampaignRouting) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "locations_", Location.class, "firstConcertDate_", "lastConcertDate_", "routingDetails_", RoutingDetail.class});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignRouting();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 2);
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
        synchronized (ConcertCampaignRouting.class) {
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
    public final DateWithOffset m9985n() {
        DateWithOffset dateWithOffset = this.firstConcertDate_;
        return dateWithOffset == null ? DateWithOffset.m9991o() : dateWithOffset;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DateWithOffset m9986o() {
        DateWithOffset dateWithOffset = this.lastConcertDate_;
        return dateWithOffset == null ? DateWithOffset.m9991o() : dateWithOffset;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m9987p() {
        return this.locations_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m9988q() {
        return this.routingDetails_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9989r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m9990s() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
