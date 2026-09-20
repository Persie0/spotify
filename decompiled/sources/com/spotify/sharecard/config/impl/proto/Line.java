package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uj80;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Line extends AbstractC0269h implements sre0 {
    private static final Line DEFAULT_INSTANCE;
    public static final int ORIGINAL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSLATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String original_ = "";
    private String translation_ = "";

    static {
        Line line = new Line();
        DEFAULT_INSTANCE = line;
        AbstractC0269h.registerDefaultInstance(Line.class, line);
    }

    private Line() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21152n(Line line, String str) {
        line.getClass();
        str.getClass();
        line.original_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21153o(Line line, String str) {
        line.getClass();
        str.getClass();
        line.bitField0_ |= 1;
        line.translation_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static uj80 m21154r() {
        return (uj80) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "original_", "translation_"});
        }
        if (iOrdinal == 3) {
            return new Line();
        }
        if (iOrdinal == 4) {
            return new uj80(DEFAULT_INSTANCE);
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
        synchronized (Line.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m21155p() {
        return this.original_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21156q() {
        return this.translation_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
