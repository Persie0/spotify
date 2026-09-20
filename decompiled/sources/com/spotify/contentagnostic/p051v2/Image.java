package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.k1d0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Image extends AbstractC0269h implements sre0 {
    private static final Image DEFAULT_INSTANCE;
    public static final int EXTRACTED_COLOR_SET_FIELD_NUMBER = 2;
    public static final int INSTANCES_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ColorSetContrastOptions extractedColorSet_;
    private ae50 instances_ = AbstractC0269h.emptyProtobufList();
    private int mask_;

    static {
        Image image = new Image();
        DEFAULT_INSTANCE = image;
        AbstractC0269h.registerDefaultInstance(Image.class, image);
    }

    private Image() {
    }

    /* JADX INFO: renamed from: o */
    public static Image m7874o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"bitField0_", "instances_", ImageInstance.class, "extractedColorSet_", "mask_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new r240(7);
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

    /* JADX INFO: renamed from: p */
    public final ColorSetContrastOptions m7875p() {
        ColorSetContrastOptions colorSetContrastOptions = this.extractedColorSet_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.m7804o() : colorSetContrastOptions;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m7876q() {
        return this.instances_;
    }

    /* JADX INFO: renamed from: r */
    public final k1d0 m7877r() {
        k1d0 k1d0Var;
        int i = this.mask_;
        if (i != 0) {
            k1d0Var = i != 1 ? null : k1d0.MASK_CIRCULAR;
        } else {
            k1d0Var = k1d0.MASK_UNSPECIFIED;
        }
        return k1d0Var == null ? k1d0.UNRECOGNIZED : k1d0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
