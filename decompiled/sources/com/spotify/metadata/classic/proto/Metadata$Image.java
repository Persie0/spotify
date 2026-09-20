package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.n5f0;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.w5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$Image extends AbstractC0269h implements sre0 {
    private static final Metadata$Image DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 1;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private int bitField0_;
    private gva fileId_ = gva.f84678b;
    private int height_;
    private int size_;
    private int width_;

    static {
        Metadata$Image metadata$Image = new Metadata$Image();
        DEFAULT_INSTANCE = metadata$Image;
        AbstractC0269h.registerDefaultInstance(Metadata$Image.class, metadata$Image);
    }

    private Metadata$Image() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001\u0003ဏ\u0002\u0004ဏ\u0003", new Object[]{"bitField0_", "fileId_", "size_", nq6.f157166w, "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Image();
        }
        if (iOrdinal == 4) {
            return new n5f0(DEFAULT_INSTANCE, 25);
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
        synchronized (Metadata$Image.class) {
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
    public final gva m15381n() {
        return this.fileId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final w5f0 m15382o() {
        w5f0 w5f0VarM87244a = w5f0.m87244a(this.size_);
        return w5f0VarM87244a == null ? w5f0.DEFAULT : w5f0VarM87244a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
