package com.spotify.home.explicitfeedback.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.fly;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class FeedbackList extends AbstractC0269h implements sre0 {
    private static final FeedbackList DEFAULT_INSTANCE;
    public static final int FEEDBACKS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 feedbacks_ = AbstractC0269h.emptyProtobufList();

    static {
        FeedbackList feedbackList = new FeedbackList();
        DEFAULT_INSTANCE = feedbackList;
        AbstractC0269h.registerDefaultInstance(FeedbackList.class, feedbackList);
    }

    private FeedbackList() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11794n(FeedbackList feedbackList, List list) {
        ae50 ae50Var = feedbackList.feedbacks_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            feedbackList.feedbacks_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, feedbackList.feedbacks_);
    }

    /* JADX INFO: renamed from: p */
    public static FeedbackList m11796p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static fly m11797r() {
        return (fly) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: s */
    public static FeedbackList m11798s(byte[] bArr) {
        return (FeedbackList) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"feedbacks_", Feedback.class});
        }
        if (iOrdinal == 3) {
            return new FeedbackList();
        }
        if (iOrdinal == 4) {
            return new fly();
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
        synchronized (FeedbackList.class) {
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

    /* JADX INFO: renamed from: q */
    public final ae50 m11799q() {
        return this.feedbacks_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
