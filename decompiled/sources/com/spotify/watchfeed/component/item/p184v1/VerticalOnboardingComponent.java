package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class VerticalOnboardingComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int ANIMATION_URL_FIELD_NUMBER = 8;
    private static final VerticalOnboardingComponent DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 2;
    public static final int FORCE_SHOW_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REPLAY_MS_FIELD_NUMBER = 5;
    public static final int SHOW_DURATION_MS_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private long delayMs_;
    private boolean forceShow_;
    private long replayMs_;
    private long showDurationMs_;
    private String title_ = "";
    private String accessibilityText_ = "";
    private String animationUrl_ = "";

    static {
        VerticalOnboardingComponent verticalOnboardingComponent = new VerticalOnboardingComponent();
        DEFAULT_INSTANCE = verticalOnboardingComponent;
        AbstractC0269h.registerDefaultInstance(VerticalOnboardingComponent.class, verticalOnboardingComponent);
    }

    private VerticalOnboardingComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static VerticalOnboardingComponent m22741t(gva gvaVar) {
        return (VerticalOnboardingComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0007\u0004\u0002\u0005\u0002\u0007Ȉ\bȈ", new Object[]{"title_", "delayMs_", "forceShow_", "showDurationMs_", "replayMs_", "accessibilityText_", "animationUrl_"});
        }
        if (iOrdinal == 3) {
            return new VerticalOnboardingComponent();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 27);
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
        synchronized (VerticalOnboardingComponent.class) {
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
    public final String m22742n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22743o() {
        return this.animationUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final long m22744p() {
        return this.delayMs_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22745q() {
        return this.forceShow_;
    }

    /* JADX INFO: renamed from: r */
    public final long m22746r() {
        return this.replayMs_;
    }

    /* JADX INFO: renamed from: s */
    public final long m22747s() {
        return this.showDurationMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
