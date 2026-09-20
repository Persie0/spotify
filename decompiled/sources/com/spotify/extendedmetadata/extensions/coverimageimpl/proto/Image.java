package com.spotify.extendedmetadata.extensions.coverimageimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.gva;
import p204p.ore0;
import p204p.pc40;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Image extends AbstractC0269h implements sre0 {
    private static final Image DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 1;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private gva fileId_ = gva.f84678b;
    private int height_;
    private int size_;
    private int width_;

    static {
        Image image = new Image();
        DEFAULT_INSTANCE = image;
        AbstractC0269h.registerDefaultInstance(Image.class, image);
    }

    private Image() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\f\u0003\u0004\u0004\u0004", new Object[]{"fileId_", "size_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 26);
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
        synchronized (Image.class) {
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
    public final gva m10084n() {
        return this.fileId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final pc40 m10085o() {
        pc40 pc40Var;
        int i = this.size_;
        if (i == 0) {
            pc40Var = pc40.IMAGE_SIZE_UNSPECIFIED;
        } else if (i == 1) {
            pc40Var = pc40.IMAGE_SIZE_DEFAULT;
        } else if (i == 2) {
            pc40Var = pc40.IMAGE_SIZE_SMALL;
        } else if (i != 3) {
            pc40Var = i != 4 ? null : pc40.IMAGE_SIZE_XLARGE;
        } else {
            pc40Var = pc40.IMAGE_SIZE_LARGE;
        }
        return pc40Var == null ? pc40.UNRECOGNIZED : pc40Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
