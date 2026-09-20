package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.gjb;
import p204p.ihc0;
import p204p.ore0;
import p204p.p7c;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class CarouselScreen extends AbstractC0269h implements sre0 {
    private static final CarouselScreen DEFAULT_INSTANCE;
    public static final int IMAGE_MAPPINGS_FIELD_NUMBER = 4;
    public static final int LOTTIE_ANIMATION_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private ihc0 imageMappings_ = ihc0.f102235b;
    private String title_ = "";
    private String subtitle_ = "";
    private String lottieAnimationUrl_ = "";

    static {
        CarouselScreen carouselScreen = new CarouselScreen();
        DEFAULT_INSTANCE = carouselScreen;
        AbstractC0269h.registerDefaultInstance(CarouselScreen.class, carouselScreen);
    }

    private CarouselScreen() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"title_", "subtitle_", "lottieAnimationUrl_", "imageMappings_", p7c.f174643a});
        }
        if (iOrdinal == 3) {
            return new CarouselScreen();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 22);
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
        synchronized (CarouselScreen.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final Map m15794n() {
        return Collections.unmodifiableMap(this.imageMappings_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m15795o() {
        return this.lottieAnimationUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
