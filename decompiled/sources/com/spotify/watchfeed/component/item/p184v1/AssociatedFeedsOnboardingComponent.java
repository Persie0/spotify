package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AssociatedFeedsOnboardingComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    private static final AssociatedFeedsOnboardingComponent DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 2;
    public static final int FORCE_SHOW_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_SWIPES_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_DURATION_MS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private long delayMs_;
    private boolean forceShow_;
    private long numberOfSwipes_;
    private long showDurationMs_;
    private String title_ = "";
    private String accessibilityText_ = "";

    static {
        AssociatedFeedsOnboardingComponent associatedFeedsOnboardingComponent = new AssociatedFeedsOnboardingComponent();
        DEFAULT_INSTANCE = associatedFeedsOnboardingComponent;
        AbstractC0269h.registerDefaultInstance(AssociatedFeedsOnboardingComponent.class, associatedFeedsOnboardingComponent);
    }

    private AssociatedFeedsOnboardingComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static AssociatedFeedsOnboardingComponent m22572s(gva gvaVar) {
        return (AssociatedFeedsOnboardingComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0007\u0006Ȉ", new Object[]{"title_", "delayMs_", "showDurationMs_", "numberOfSwipes_", "forceShow_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new AssociatedFeedsOnboardingComponent();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 19);
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
        synchronized (AssociatedFeedsOnboardingComponent.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22573n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m22574o() {
        return this.delayMs_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22575p() {
        return this.forceShow_;
    }

    /* JADX INFO: renamed from: q */
    public final long m22576q() {
        return this.numberOfSwipes_;
    }

    /* JADX INFO: renamed from: r */
    public final long m22577r() {
        return this.showDurationMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
