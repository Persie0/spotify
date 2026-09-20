package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.rc40;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ImageInstance extends AbstractC0269h implements sre0 {
    private static final ImageInstance DEFAULT_INSTANCE;
    public static final int FLAT_FILE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    private int bitField0_;
    private FlatFile flatFile_;
    private int size_;

    static {
        ImageInstance imageInstance = new ImageInstance();
        DEFAULT_INSTANCE = imageInstance;
        AbstractC0269h.registerDefaultInstance(ImageInstance.class, imageInstance);
    }

    private ImageInstance() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "flatFile_", "size_"});
        }
        if (iOrdinal == 3) {
            return new ImageInstance();
        }
        if (iOrdinal == 4) {
            return new r240(24);
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
        synchronized (ImageInstance.class) {
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

    /* JADX INFO: renamed from: o */
    public final FlatFile m7879o() {
        FlatFile flatFile = this.flatFile_;
        return flatFile == null ? FlatFile.m7855p() : flatFile;
    }

    /* JADX INFO: renamed from: p */
    public final rc40 m7880p() {
        rc40 rc40Var;
        int i = this.size_;
        if (i == 0) {
            rc40Var = rc40.IMAGE_SIZE_UNSPECIFIED;
        } else if (i == 1) {
            rc40Var = rc40.IMAGE_SIZE_SMALL;
        } else if (i == 2) {
            rc40Var = rc40.IMAGE_SIZE_DEFAULT;
        } else if (i == 3) {
            rc40Var = rc40.IMAGE_SIZE_LARGE;
        } else if (i != 4) {
            rc40Var = i != 5 ? null : rc40.IMAGE_SIZE_XXLARGE;
        } else {
            rc40Var = rc40.IMAGE_SIZE_XLARGE;
        }
        return rc40Var == null ? rc40.UNRECOGNIZED : rc40Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
