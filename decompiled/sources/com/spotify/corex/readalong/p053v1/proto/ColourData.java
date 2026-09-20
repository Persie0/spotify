package com.spotify.corex.readalong.p053v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes6.dex */
public final class ColourData extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final ColourData DEFAULT_INSTANCE;
    public static final int HIGHLIGHT_TEXT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int background_;
    private int highlightText_;
    private int text_;

    static {
        ColourData colourData = new ColourData();
        DEFAULT_INSTANCE = colourData;
        AbstractC0269h.registerDefaultInstance(ColourData.class, colourData);
    }

    private ColourData() {
    }

    /* JADX INFO: renamed from: o */
    public static ColourData m8045o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"background_", "text_", "highlightText_"});
        }
        if (iOrdinal == 3) {
            return new ColourData();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 25);
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
        synchronized (ColourData.class) {
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
    public final int m8046n() {
        return this.background_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m8047p() {
        return this.highlightText_;
    }

    /* JADX INFO: renamed from: q */
    public final int m8048q() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
