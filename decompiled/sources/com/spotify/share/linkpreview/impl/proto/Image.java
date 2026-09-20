package com.spotify.share.linkpreview.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.av30;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t240;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Image extends AbstractC0269h implements sre0 {
    private static final Image DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 2;
    public static final int IMAGE_BYTES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int format_;
    private gva imageBytes_ = gva.f84678b;

    static {
        Image image = new Image();
        DEFAULT_INSTANCE = image;
        AbstractC0269h.registerDefaultInstance(Image.class, image);
    }

    private Image() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21062n(Image image, av30 av30Var) {
        image.getClass();
        image.format_ = av30Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m21063o(Image image, cva cvaVar) {
        image.getClass();
        image.imageBytes_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static t240 m21064p() {
        return (t240) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\f", new Object[]{"imageBytes_", "format_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new t240(DEFAULT_INSTANCE);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
