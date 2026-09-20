package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class QuizEntityWithOverlay extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_ENTITY_URI_FIELD_NUMBER = 1;
    private static final QuizEntityWithOverlay DEFAULT_INSTANCE;
    public static final int OVERLAY_ENTITY_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String backgroundEntityUri_ = "";
    private String overlayEntityUri_ = "";

    static {
        QuizEntityWithOverlay quizEntityWithOverlay = new QuizEntityWithOverlay();
        DEFAULT_INSTANCE = quizEntityWithOverlay;
        AbstractC0269h.registerDefaultInstance(QuizEntityWithOverlay.class, quizEntityWithOverlay);
    }

    private QuizEntityWithOverlay() {
    }

    /* JADX INFO: renamed from: o */
    public static QuizEntityWithOverlay m20568o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"backgroundEntityUri_", "overlayEntityUri_"});
        }
        if (iOrdinal == 3) {
            return new QuizEntityWithOverlay();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 22);
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
        synchronized (QuizEntityWithOverlay.class) {
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
    public final String m20569n() {
        return this.backgroundEntityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m20570p() {
        return this.overlayEntityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
