package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.n350;
import p204p.oje;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.uib;
import p204p.vd50;
import p204p.z110;
import p204p.zy5;

/* JADX INFO: loaded from: classes.dex */
public final class CampaignRoutingCardRequest extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_ROUTING_FIELD_NUMBER = 1;
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final CampaignRoutingCardRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new zy5(2);
    private int bitField0_;
    private CampaignRouting campaignRouting_;
    private int capabilitiesMemoizedSerializedSize;
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();

    static {
        CampaignRoutingCardRequest campaignRoutingCardRequest = new CampaignRoutingCardRequest();
        DEFAULT_INSTANCE = campaignRoutingCardRequest;
        AbstractC0269h.registerDefaultInstance(CampaignRoutingCardRequest.class, campaignRoutingCardRequest);
    }

    private CampaignRoutingCardRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m6958n(CampaignRoutingCardRequest campaignRoutingCardRequest) {
        campaignRoutingCardRequest.getClass();
        ud50 ud50Var = campaignRoutingCardRequest.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            campaignRoutingCardRequest.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) campaignRoutingCardRequest.capabilities_).m63581b(oje.CAMPAIGN_CARD_RESERVED_SHARE_V1.getNumber());
    }

    /* JADX INFO: renamed from: o */
    public static void m6959o(CampaignRoutingCardRequest campaignRoutingCardRequest, CampaignRouting campaignRouting) {
        campaignRoutingCardRequest.getClass();
        campaignRoutingCardRequest.campaignRouting_ = campaignRouting;
        campaignRoutingCardRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static uib m6961q() {
        return (uib) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002,", new Object[]{"bitField0_", "campaignRouting_", "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new CampaignRoutingCardRequest();
        }
        if (iOrdinal == 4) {
            return new uib();
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
        synchronized (CampaignRoutingCardRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
