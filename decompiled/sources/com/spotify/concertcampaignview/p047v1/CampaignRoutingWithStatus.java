package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignRoutingWithStatus extends AbstractC0269h implements sre0 {
    private static final CampaignRoutingWithStatus DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int ROUTING_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private CampaignRouting routing_;
    private CampaignStatusCard status_;

    static {
        CampaignRoutingWithStatus campaignRoutingWithStatus = new CampaignRoutingWithStatus();
        DEFAULT_INSTANCE = campaignRoutingWithStatus;
        AbstractC0269h.registerDefaultInstance(CampaignRoutingWithStatus.class, campaignRoutingWithStatus);
    }

    private CampaignRoutingWithStatus() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "routing_", "status_"});
        }
        if (iOrdinal == 3) {
            return new CampaignRoutingWithStatus();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 19);
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
        synchronized (CampaignRoutingWithStatus.class) {
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

    public final boolean hasStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final CampaignRouting m6962n() {
        CampaignRouting campaignRouting = this.routing_;
        return campaignRouting == null ? CampaignRouting.m6955r() : campaignRouting;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CampaignStatusCard m6963o() {
        CampaignStatusCard campaignStatusCard = this.status_;
        return campaignStatusCard == null ? CampaignStatusCard.m6964n() : campaignStatusCard;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
