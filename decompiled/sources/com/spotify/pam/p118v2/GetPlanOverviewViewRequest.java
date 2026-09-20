package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.fa10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetPlanOverviewViewRequest extends AbstractC0269h implements sre0 {
    private static final GetPlanOverviewViewRequest DEFAULT_INSTANCE;
    public static final int MUP_ENTRY_CARD_V2_ENABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private boolean mupEntryCardV2Enabled_;
    private String payload_ = "";

    static {
        GetPlanOverviewViewRequest getPlanOverviewViewRequest = new GetPlanOverviewViewRequest();
        DEFAULT_INSTANCE = getPlanOverviewViewRequest;
        AbstractC0269h.registerDefaultInstance(GetPlanOverviewViewRequest.class, getPlanOverviewViewRequest);
    }

    private GetPlanOverviewViewRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16506n(GetPlanOverviewViewRequest getPlanOverviewViewRequest, boolean z) {
        getPlanOverviewViewRequest.mupEntryCardV2Enabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m16507o(GetPlanOverviewViewRequest getPlanOverviewViewRequest) {
        getPlanOverviewViewRequest.getClass();
        getPlanOverviewViewRequest.payload_ = "yeet";
    }

    /* JADX INFO: renamed from: p */
    public static fa10 m16508p() {
        return (fa10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"payload_", "mupEntryCardV2Enabled_"});
        }
        if (iOrdinal == 3) {
            return new GetPlanOverviewViewRequest();
        }
        if (iOrdinal == 4) {
            return new fa10(DEFAULT_INSTANCE);
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
        synchronized (GetPlanOverviewViewRequest.class) {
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
