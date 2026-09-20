package com.spotify.extendedmetadata.extensions.concertmarketingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.b340;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Image extends AbstractC0269h implements sre0 {
    private static final Image DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PIXEL_HEIGHT_FIELD_NUMBER = 4;
    public static final int PIXEL_WIDTH_FIELD_NUMBER = 3;
    public static final int SIZE_FIELD_NUMBER = 2;
    private int bitField0_;
    private gva fileId_ = gva.f84678b;
    private int pixelHeight_;
    private int pixelWidth_;
    private int size_;

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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\f\u0003င\u0000\u0004င\u0001", new Object[]{"bitField0_", "fileId_", "size_", "pixelWidth_", "pixelHeight_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 25);
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
    public final gva m10056n() {
        return this.fileId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final b340 m10057o() {
        b340 b340Var;
        int i = this.size_;
        if (i == 0) {
            b340Var = b340.SIZE_UNKNOWN;
        } else if (i == 1) {
            b340Var = b340.SIZE_DEFAULT;
        } else if (i == 2) {
            b340Var = b340.SIZE_SMALL;
        } else if (i != 3) {
            b340Var = i != 4 ? null : b340.SIZE_XLARGE;
        } else {
            b340Var = b340.SIZE_LARGE;
        }
        return b340Var == null ? b340.UNRECOGNIZED : b340Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
