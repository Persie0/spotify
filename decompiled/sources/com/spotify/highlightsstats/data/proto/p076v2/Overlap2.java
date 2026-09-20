package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.EntityImage;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Overlap2 extends AbstractC0269h implements sre0 {
    private static final Overlap2 DEFAULT_INSTANCE;
    public static final int IMAGE_1_FIELD_NUMBER = 1;
    public static final int IMAGE_2_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EntityImage image1_;
    private EntityImage image2_;

    static {
        Overlap2 overlap2 = new Overlap2();
        DEFAULT_INSTANCE = overlap2;
        AbstractC0269h.registerDefaultInstance(Overlap2.class, overlap2);
    }

    private Overlap2() {
    }

    /* JADX INFO: renamed from: n */
    public static Overlap2 m11560n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "image1_", "image2_"});
        }
        if (iOrdinal == 3) {
            return new Overlap2();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 12);
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
        synchronized (Overlap2.class) {
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
    public final EntityImage m11561o() {
        EntityImage entityImage = this.image1_;
        return entityImage == null ? EntityImage.m11281n() : entityImage;
    }

    /* JADX INFO: renamed from: p */
    public final EntityImage m11562p() {
        EntityImage entityImage = this.image2_;
        return entityImage == null ? EntityImage.m11281n() : entityImage;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
