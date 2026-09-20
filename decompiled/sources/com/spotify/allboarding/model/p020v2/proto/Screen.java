package com.spotify.allboarding.model.p020v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.six0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class Screen extends AbstractC0269h implements sre0 {
    public static final int CAROUSEL_FIELD_NUMBER = 7;
    public static final int CONTENT_PICKER_FIELD_NUMBER = 2;
    public static final int CONTEXTUAL_AUDIO_FIELD_NUMBER = 4;
    private static final Screen DEFAULT_INSTANCE;
    public static final int LOADING_FIELD_NUMBER = 1;
    public static final int LOADING_WITH_IMAGE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PUSH_OPT_IN_FIELD_NUMBER = 3;
    public static final int SINGLE_ITEM_PICKER_FIELD_NUMBER = 6;
    private int screenCase_ = 0;
    private Object screen_;

    static {
        Screen screen = new Screen();
        DEFAULT_INSTANCE = screen;
        AbstractC0269h.registerDefaultInstance(Screen.class, screen);
    }

    private Screen() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Screen m3202q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"screen_", "screenCase_", Loading.class, ContentPicker.class, PushOptIn.class, ContextualAudio.class, LoadingWithImage.class, SingleItemPicker.class, Carousel.class});
        }
        if (iOrdinal == 3) {
            return new Screen();
        }
        if (iOrdinal == 4) {
            return new six0(DEFAULT_INSTANCE, 18);
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
        synchronized (Screen.class) {
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

    /* JADX INFO: renamed from: n */
    public final Carousel m3203n() {
        return this.screenCase_ == 7 ? (Carousel) this.screen_ : Carousel.m3178p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ContentPicker m3204o() {
        return this.screenCase_ == 2 ? (ContentPicker) this.screen_ : ContentPicker.m3185n();
    }

    /* JADX INFO: renamed from: p */
    public final ContextualAudio m3205p() {
        return this.screenCase_ == 4 ? (ContextualAudio) this.screen_ : ContextualAudio.m3193n();
    }

    /* JADX INFO: renamed from: r */
    public final Loading m3206r() {
        return this.screenCase_ == 1 ? (Loading) this.screen_ : Loading.m3194n();
    }

    /* JADX INFO: renamed from: s */
    public final void m3207s() {
        if (this.screenCase_ == 3) {
        } else {
            int i = PushOptIn.f2915a;
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m3208t() {
        switch (this.screenCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
