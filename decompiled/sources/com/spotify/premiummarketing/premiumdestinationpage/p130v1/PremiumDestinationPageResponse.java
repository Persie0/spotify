package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ilq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumDestinationPageResponse extends AbstractC0269h implements sre0 {
    public static final int BODY_COMPONENTS_FIELD_NUMBER = 3;
    private static final PremiumDestinationPageResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private PDPComponent header_;
    private String id_ = "";
    private ae50 bodyComponents_ = AbstractC0269h.emptyProtobufList();

    static {
        PremiumDestinationPageResponse premiumDestinationPageResponse = new PremiumDestinationPageResponse();
        DEFAULT_INSTANCE = premiumDestinationPageResponse;
        AbstractC0269h.registerDefaultInstance(PremiumDestinationPageResponse.class, premiumDestinationPageResponse);
    }

    private PremiumDestinationPageResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19646n(PremiumDestinationPageResponse premiumDestinationPageResponse, List list) {
        ae50 ae50Var = premiumDestinationPageResponse.bodyComponents_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            premiumDestinationPageResponse.bodyComponents_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, premiumDestinationPageResponse.bodyComponents_);
    }

    /* JADX INFO: renamed from: o */
    public static void m19647o(PremiumDestinationPageResponse premiumDestinationPageResponse, PDPComponent pDPComponent) {
        premiumDestinationPageResponse.getClass();
        pDPComponent.getClass();
        ae50 ae50Var = premiumDestinationPageResponse.bodyComponents_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            premiumDestinationPageResponse.bodyComponents_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        premiumDestinationPageResponse.bodyComponents_.add(pDPComponent);
    }

    /* JADX INFO: renamed from: p */
    public static void m19648p(PremiumDestinationPageResponse premiumDestinationPageResponse, PDPComponent pDPComponent) {
        premiumDestinationPageResponse.getClass();
        pDPComponent.getClass();
        premiumDestinationPageResponse.header_ = pDPComponent;
        premiumDestinationPageResponse.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19649q(PremiumDestinationPageResponse premiumDestinationPageResponse) {
        premiumDestinationPageResponse.getClass();
        premiumDestinationPageResponse.id_ = "062fc1e5aabad5-7e415b-5642-a9b1-377134bb";
    }

    /* JADX INFO: renamed from: s */
    public static PremiumDestinationPageResponse m19650s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static ilq0 m19651u() {
        return (ilq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "id_", "header_", "bodyComponents_", PDPComponent.class});
        }
        if (iOrdinal == 3) {
            return new PremiumDestinationPageResponse();
        }
        if (iOrdinal == 4) {
            return new ilq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumDestinationPageResponse.class) {
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

    public final String getId() {
        return this.id_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m19652r() {
        return this.bodyComponents_;
    }

    /* JADX INFO: renamed from: t */
    public final PDPComponent m19653t() {
        PDPComponent pDPComponent = this.header_;
        return pDPComponent == null ? PDPComponent.m19600y() : pDPComponent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
