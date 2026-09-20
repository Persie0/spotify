package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes6.dex */
public final class ColorExtraction extends AbstractC0269h implements sre0 {
    public static final int COLOR_DARK_FIELD_NUMBER = 3;
    public static final int COLOR_LIGHT_FIELD_NUMBER = 2;
    public static final int COLOR_RAW_FIELD_NUMBER = 1;
    private static final ColorExtraction DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int colorDark_;
    private int colorLight_;
    private int colorRaw_;

    static {
        ColorExtraction colorExtraction = new ColorExtraction();
        DEFAULT_INSTANCE = colorExtraction;
        AbstractC0269h.registerDefaultInstance(ColorExtraction.class, colorExtraction);
    }

    private ColorExtraction() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ColorExtraction m9928q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"colorRaw_", "colorLight_", "colorDark_"});
        }
        if (iOrdinal == 3) {
            return new ColorExtraction();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 17);
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
        synchronized (ColorExtraction.class) {
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
    public final int m9929n() {
        return this.colorDark_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m9930o() {
        return this.colorLight_;
    }

    /* JADX INFO: renamed from: p */
    public final int m9931p() {
        return this.colorRaw_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
