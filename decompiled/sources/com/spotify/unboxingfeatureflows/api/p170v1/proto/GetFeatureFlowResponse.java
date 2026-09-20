package com.spotify.unboxingfeatureflows.api.p170v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetFeatureFlowResponse extends AbstractC0269h implements sre0 {
    private static final GetFeatureFlowResponse DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    public static final int FLOW_STEPS_FIELD_NUMBER = 3;
    public static final int HEADER_TEXT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String featureId_ = "";
    private String headerText_ = "";
    private ae50 flowSteps_ = AbstractC0269h.emptyProtobufList();

    static {
        GetFeatureFlowResponse getFeatureFlowResponse = new GetFeatureFlowResponse();
        DEFAULT_INSTANCE = getFeatureFlowResponse;
        AbstractC0269h.registerDefaultInstance(GetFeatureFlowResponse.class, getFeatureFlowResponse);
    }

    private GetFeatureFlowResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"featureId_", "headerText_", "flowSteps_", FlowStep.class});
        }
        if (iOrdinal == 3) {
            return new GetFeatureFlowResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 3);
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
        synchronized (GetFeatureFlowResponse.class) {
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
    public final String m21949n() {
        return this.featureId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m21950o() {
        return this.flowSteps_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21951p() {
        return this.headerText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
