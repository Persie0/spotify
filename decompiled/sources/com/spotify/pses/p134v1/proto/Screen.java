package com.spotify.pses.p134v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.diy0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Screen extends AbstractC0269h implements sre0 {
    private static final Screen DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RESOLUTION_FIELD_NUMBER = 4;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int height_;
    private float resolution_;
    private int width_;

    static {
        Screen screen = new Screen();
        DEFAULT_INSTANCE = screen;
        AbstractC0269h.registerDefaultInstance(Screen.class, screen);
    }

    private Screen() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19988n(Screen screen, int i) {
        screen.height_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m19989o(Screen screen, float f) {
        screen.resolution_ = f;
    }

    /* JADX INFO: renamed from: p */
    public static void m19990p(Screen screen, int i) {
        screen.width_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static diy0 m19991q() {
        return (diy0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0004\u0001", new Object[]{"width_", "height_", "resolution_"});
        }
        if (iOrdinal == 3) {
            return new Screen();
        }
        if (iOrdinal == 4) {
            return new diy0(DEFAULT_INSTANCE);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
