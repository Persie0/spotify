package com.spotify.playlistmixing.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.smx;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ExplicitFeedbackSubmission extends AbstractC0269h implements sre0 {
    private static final ExplicitFeedbackSubmission DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRESENTED_TRANSITIONS_FIELD_NUMBER = 4;
    public static final int SELECTED_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int TRACK_A_URI_FIELD_NUMBER = 1;
    public static final int TRACK_B_URI_FIELD_NUMBER = 2;
    private String trackAUri_ = "";
    private String trackBUri_ = "";
    private String selectedIdentifier_ = "";
    private ae50 presentedTransitions_ = AbstractC0269h.emptyProtobufList();

    static {
        ExplicitFeedbackSubmission explicitFeedbackSubmission = new ExplicitFeedbackSubmission();
        DEFAULT_INSTANCE = explicitFeedbackSubmission;
        AbstractC0269h.registerDefaultInstance(ExplicitFeedbackSubmission.class, explicitFeedbackSubmission);
    }

    private ExplicitFeedbackSubmission() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19388n(ExplicitFeedbackSubmission explicitFeedbackSubmission, ArrayList arrayList) {
        ae50 ae50Var = explicitFeedbackSubmission.presentedTransitions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            explicitFeedbackSubmission.presentedTransitions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, explicitFeedbackSubmission.presentedTransitions_);
    }

    /* JADX INFO: renamed from: o */
    public static void m19389o(ExplicitFeedbackSubmission explicitFeedbackSubmission, String str) {
        explicitFeedbackSubmission.getClass();
        str.getClass();
        explicitFeedbackSubmission.selectedIdentifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19390p(ExplicitFeedbackSubmission explicitFeedbackSubmission, String str) {
        explicitFeedbackSubmission.getClass();
        str.getClass();
        explicitFeedbackSubmission.trackAUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19391q(ExplicitFeedbackSubmission explicitFeedbackSubmission, String str) {
        explicitFeedbackSubmission.getClass();
        str.getClass();
        explicitFeedbackSubmission.trackBUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static smx m19392r() {
        return (smx) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"trackAUri_", "trackBUri_", "selectedIdentifier_", "presentedTransitions_", PresentedTransition.class});
        }
        if (iOrdinal == 3) {
            return new ExplicitFeedbackSubmission();
        }
        if (iOrdinal == 4) {
            return new smx(DEFAULT_INSTANCE);
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
        synchronized (ExplicitFeedbackSubmission.class) {
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
