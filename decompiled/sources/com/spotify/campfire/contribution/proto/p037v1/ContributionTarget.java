package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ajk;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ContributionTarget extends AbstractC0269h implements sre0 {
    public static final int CONTEXTUAL_TARGET_FIELD_NUMBER = 2;
    public static final int CONTRIBUTION_TARGET_FIELD_NUMBER = 3;
    private static final ContributionTarget DEFAULT_INSTANCE;
    public static final int ENTITY_TARGET_FIELD_NUMBER = 1;
    public static final int LISTENING_ACTIVITY_TARGET_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private int targetCase_ = 0;
    private Object target_;

    static {
        ContributionTarget contributionTarget = new ContributionTarget();
        DEFAULT_INSTANCE = contributionTarget;
        AbstractC0269h.registerDefaultInstance(ContributionTarget.class, contributionTarget);
    }

    private ContributionTarget() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4293n(ContributionTarget contributionTarget, ContextualTarget contextualTarget) {
        contributionTarget.getClass();
        contextualTarget.getClass();
        contributionTarget.target_ = contextualTarget;
        contributionTarget.targetCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m4294o(ContributionTarget contributionTarget, ContributionReference contributionReference) {
        contributionTarget.getClass();
        contributionReference.getClass();
        contributionTarget.target_ = contributionReference;
        contributionTarget.targetCase_ = 3;
    }

    /* JADX INFO: renamed from: p */
    public static void m4295p(ContributionTarget contributionTarget, EntityTarget entityTarget) {
        contributionTarget.getClass();
        entityTarget.getClass();
        contributionTarget.target_ = entityTarget;
        contributionTarget.targetCase_ = 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m4296q(ContributionTarget contributionTarget, ListeningActivityTarget listeningActivityTarget) {
        contributionTarget.getClass();
        listeningActivityTarget.getClass();
        contributionTarget.target_ = listeningActivityTarget;
        contributionTarget.targetCase_ = 4;
    }

    /* JADX INFO: renamed from: t */
    public static ContributionTarget m4297t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static ajk m4298x() {
        return (ajk) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"target_", "targetCase_", EntityTarget.class, ContextualTarget.class, ContributionReference.class, ListeningActivityTarget.class});
        }
        if (iOrdinal == 3) {
            return new ContributionTarget();
        }
        if (iOrdinal == 4) {
            return new ajk(DEFAULT_INSTANCE);
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
        synchronized (ContributionTarget.class) {
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

    /* JADX INFO: renamed from: r */
    public final ContextualTarget m4299r() {
        return this.targetCase_ == 2 ? (ContextualTarget) this.target_ : ContextualTarget.m4246r();
    }

    /* JADX INFO: renamed from: s */
    public final ContributionReference m4300s() {
        return this.targetCase_ == 3 ? (ContributionReference) this.target_ : ContributionReference.m4290p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final EntityTarget m4301u() {
        return this.targetCase_ == 1 ? (EntityTarget) this.target_ : EntityTarget.m4319o();
    }

    /* JADX INFO: renamed from: v */
    public final ListeningActivityTarget m4302v() {
        return this.targetCase_ == 4 ? (ListeningActivityTarget) this.target_ : ListeningActivityTarget.m4343s();
    }

    /* JADX INFO: renamed from: w */
    public final int m4303w() {
        int i = this.targetCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
