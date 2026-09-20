package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.dhx0;
import p204p.h4x0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class RiveAnimation extends AbstractC0269h implements sre0 {
    private static final RiveAnimation DEFAULT_INSTANCE;
    public static final int EXPECTED_FONTS_FIELD_NUMBER = 4;
    public static final int NAMETOIMAGEMAP_FIELD_NUMBER = 2;
    public static final int ON_INIT_INPUTS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private ihc0 nameToImageMap_ = ihc0.f102235b;
    private String url_ = "";
    private ae50 onInitInputs_ = AbstractC0269h.emptyProtobufList();
    private ae50 expectedFonts_ = AbstractC0269h.emptyProtobufList();

    static {
        RiveAnimation riveAnimation = new RiveAnimation();
        DEFAULT_INSTANCE = riveAnimation;
        AbstractC0269h.registerDefaultInstance(RiveAnimation.class, riveAnimation);
    }

    private RiveAnimation() {
    }

    /* JADX INFO: renamed from: n */
    public static RiveAnimation m23206n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0002\u0000\u0001Ȉ\u00022\u0003\u001b\u0004\u001b", new Object[]{"url_", "nameToImageMap_", dhx0.f49187a, "onInitInputs_", RiveAnimationInput.class, "expectedFonts_", RiveFont.class});
        }
        if (iOrdinal == 3) {
            return new RiveAnimation();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 25);
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
        synchronized (RiveAnimation.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m23207o() {
        return this.expectedFonts_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m23208p() {
        return this.onInitInputs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
