package com.spotify.prereleases.extension;

import com.google.protobuf.AbstractC0269h;
import p204p.lrk;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Copyright extends AbstractC0269h implements sre0 {
    private static final Copyright DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private int type_;

    static {
        Copyright copyright = new Copyright();
        DEFAULT_INSTANCE = copyright;
        AbstractC0269h.registerDefaultInstance(Copyright.class, copyright);
    }

    private Copyright() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "text_"});
        }
        if (iOrdinal == 3) {
            return new Copyright();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 14);
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
        synchronized (Copyright.class) {
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
    public final String m19743n() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final lrk m19744o() {
        lrk lrkVar;
        int i = this.type_;
        if (i == 0) {
            lrkVar = lrk.COPYRIGHT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            lrkVar = i != 2 ? null : lrk.COPYRIGHT_TYPE_C;
        } else {
            lrkVar = lrk.COPYRIGHT_TYPE_P;
        }
        return lrkVar == null ? lrk.UNRECOGNIZED : lrkVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
