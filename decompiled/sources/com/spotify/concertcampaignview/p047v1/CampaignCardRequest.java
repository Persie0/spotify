package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ehb;
import p204p.ly5;
import p204p.n350;
import p204p.oje;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CampaignCardRequest extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    public static final int CONCERT_CAMPAIGN_URI_FIELD_NUMBER = 1;
    private static final CampaignCardRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new ly5(2);
    private int capabilitiesMemoizedSerializedSize;
    private String concertCampaignUri_ = "";
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();

    static {
        CampaignCardRequest campaignCardRequest = new CampaignCardRequest();
        DEFAULT_INSTANCE = campaignCardRequest;
        AbstractC0269h.registerDefaultInstance(CampaignCardRequest.class, campaignCardRequest);
    }

    private CampaignCardRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m6945n(CampaignCardRequest campaignCardRequest) {
        campaignCardRequest.getClass();
        ud50 ud50Var = campaignCardRequest.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            campaignCardRequest.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) campaignCardRequest.capabilities_).m63581b(oje.CAMPAIGN_CARD_RESERVED_SHARE_V1.getNumber());
    }

    /* JADX INFO: renamed from: o */
    public static void m6946o(CampaignCardRequest campaignCardRequest, String str) {
        campaignCardRequest.getClass();
        str.getClass();
        campaignCardRequest.concertCampaignUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ehb m6948q() {
        return (ehb) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"concertCampaignUri_", "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new CampaignCardRequest();
        }
        if (iOrdinal == 4) {
            return new ehb();
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
        synchronized (CampaignCardRequest.class) {
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
