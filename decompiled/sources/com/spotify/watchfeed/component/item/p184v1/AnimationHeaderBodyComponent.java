package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.aw2;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AnimationHeaderBodyComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    public static final int ANIMATION_DURATION_FIELD_NUMBER = 5;
    private static final AnimationHeaderBodyComponent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int LOGO_FIELD_NUMBER = 1;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    private int animationDuration_;
    private String logo_ = "";
    private String subtitle_ = "";
    private String navigationUri_ = "";
    private String icon_ = "";
    private String accessibilityText_ = "";

    static {
        AnimationHeaderBodyComponent animationHeaderBodyComponent = new AnimationHeaderBodyComponent();
        DEFAULT_INSTANCE = animationHeaderBodyComponent;
        AbstractC0269h.registerDefaultInstance(AnimationHeaderBodyComponent.class, animationHeaderBodyComponent);
    }

    private AnimationHeaderBodyComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static AnimationHeaderBodyComponent m22566s(gva gvaVar) {
        return (AnimationHeaderBodyComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006Ȉ", new Object[]{"logo_", "subtitle_", "navigationUri_", "icon_", "animationDuration_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new AnimationHeaderBodyComponent();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 13);
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
        synchronized (AnimationHeaderBodyComponent.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22567n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m22568o() {
        return this.animationDuration_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22569p() {
        return this.icon_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22570q() {
        return this.logo_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22571r() {
        return this.navigationUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
