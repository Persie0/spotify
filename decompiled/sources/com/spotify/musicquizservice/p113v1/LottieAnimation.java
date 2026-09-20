package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.g8b0;
import p204p.gsa0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LottieAnimation extends AbstractC0269h implements sre0 {
    private static final LottieAnimation DEFAULT_INSTANCE;
    public static final int IMAGE_MAPPINGS_FIELD_NUMBER = 2;
    public static final int LOTTIE_ANIMATION_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 imageMappings_ = ihc0.f102235b;
    private String lottieAnimationUrl_ = "";

    static {
        LottieAnimation lottieAnimation = new LottieAnimation();
        DEFAULT_INSTANCE = lottieAnimation;
        AbstractC0269h.registerDefaultInstance(LottieAnimation.class, lottieAnimation);
    }

    private LottieAnimation() {
    }

    /* JADX INFO: renamed from: n */
    public static LottieAnimation m15862n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"lottieAnimationUrl_", "imageMappings_", g8b0.f77450a});
        }
        if (iOrdinal == 3) {
            return new LottieAnimation();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 5);
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
        synchronized (LottieAnimation.class) {
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

    /* JADX INFO: renamed from: o */
    public final Map m15863o() {
        return Collections.unmodifiableMap(this.imageMappings_);
    }

    /* JADX INFO: renamed from: p */
    public final String m15864p() {
        return this.lottieAnimationUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
