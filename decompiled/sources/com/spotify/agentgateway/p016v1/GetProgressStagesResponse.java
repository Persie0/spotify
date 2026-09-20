package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ca10;
import p204p.ihc0;
import p204p.la10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetProgressStagesResponse extends AbstractC0269h implements sre0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DEBUG_INFO_FIELD_NUMBER = 4;
    private static final GetProgressStagesResponse DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_STAGES_FIELD_NUMBER = 3;
    private ihc0 debugInfo_ = ihc0.f102235b;
    private String contentType_ = "";
    private String label_ = "";
    private ae50 progressStages_ = AbstractC0269h.emptyProtobufList();

    static {
        GetProgressStagesResponse getProgressStagesResponse = new GetProgressStagesResponse();
        DEFAULT_INSTANCE = getProgressStagesResponse;
        AbstractC0269h.registerDefaultInstance(GetProgressStagesResponse.class, getProgressStagesResponse);
    }

    private GetProgressStagesResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u00042", new Object[]{"contentType_", "label_", "progressStages_", ProgressStage.class, "debugInfo_", la10.f131217a});
        }
        if (iOrdinal == 3) {
            return new GetProgressStagesResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 8);
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
        synchronized (GetProgressStagesResponse.class) {
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
    public final String m2936n() {
        return this.contentType_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m2937o() {
        return this.label_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m2938p() {
        return this.progressStages_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
