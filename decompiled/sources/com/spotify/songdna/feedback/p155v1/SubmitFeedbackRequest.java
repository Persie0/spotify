package com.spotify.songdna.feedback.p155v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cl31;
import p204p.nky;
import p204p.ore0;
import p204p.os51;
import p204p.pre0;
import p204p.r110;
import p204p.r1y0;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SubmitFeedbackRequest extends AbstractC0269h implements sre0 {
    public static final int ADDITIONAL_DETAILS_FIELD_NUMBER = 5;
    public static final int CATEGORY_FIELD_NUMBER = 2;
    private static final SubmitFeedbackRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SAMPLES_OR_COVERS_ISSUE_FIELD_NUMBER = 4;
    public static final int SONG_CREDITS_ISSUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int category_;
    private Object issue_;
    private int issueCase_ = 0;
    private String entityUri_ = "";
    private String additionalDetails_ = "";

    static {
        SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest();
        DEFAULT_INSTANCE = submitFeedbackRequest;
        AbstractC0269h.registerDefaultInstance(SubmitFeedbackRequest.class, submitFeedbackRequest);
    }

    private SubmitFeedbackRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21481n(SubmitFeedbackRequest submitFeedbackRequest, String str) {
        submitFeedbackRequest.getClass();
        str.getClass();
        submitFeedbackRequest.bitField0_ |= 1;
        submitFeedbackRequest.additionalDetails_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21482o(SubmitFeedbackRequest submitFeedbackRequest, nky nkyVar) {
        submitFeedbackRequest.getClass();
        submitFeedbackRequest.category_ = nkyVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m21483p(SubmitFeedbackRequest submitFeedbackRequest, String str) {
        submitFeedbackRequest.getClass();
        str.getClass();
        submitFeedbackRequest.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21484q(SubmitFeedbackRequest submitFeedbackRequest, r1y0 r1y0Var) {
        submitFeedbackRequest.getClass();
        submitFeedbackRequest.issue_ = Integer.valueOf(r1y0Var.getNumber());
        submitFeedbackRequest.issueCase_ = 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m21485r(SubmitFeedbackRequest submitFeedbackRequest, cl31 cl31Var) {
        submitFeedbackRequest.getClass();
        submitFeedbackRequest.issue_ = Integer.valueOf(cl31Var.getNumber());
        submitFeedbackRequest.issueCase_ = 3;
    }

    /* JADX INFO: renamed from: s */
    public static os51 m21486s() {
        return (os51) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003?\u0000\u0004?\u0000\u0005ለ\u0000", new Object[]{"issue_", "issueCase_", "bitField0_", "entityUri_", "category_", "additionalDetails_"});
        }
        if (iOrdinal == 3) {
            return new SubmitFeedbackRequest();
        }
        if (iOrdinal == 4) {
            return new os51(DEFAULT_INSTANCE);
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
        synchronized (SubmitFeedbackRequest.class) {
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
