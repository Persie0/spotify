package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Artwork extends AbstractC0269h implements sre0 {
    private static final Artwork DEFAULT_INSTANCE;
    public static final int GRID3_FIELD_NUMBER = 1;
    public static final int OVERLAP2_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SINGLE_FIELD_NUMBER = 2;
    public static final int TILTED_OVERLAP2_FIELD_NUMBER = 4;
    public static final int TILTED_OVERLAP3_FIELD_NUMBER = 5;
    private int artworkCase_ = 0;
    private Object artwork_;

    static {
        Artwork artwork = new Artwork();
        DEFAULT_INSTANCE = artwork;
        AbstractC0269h.registerDefaultInstance(Artwork.class, artwork);
    }

    private Artwork() {
    }

    /* JADX INFO: renamed from: o */
    public static Artwork m11504o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"artwork_", "artworkCase_", Grid3.class, Single.class, Overlap2.class, TiltedOverlap2.class, TiltedOverlap3.class});
        }
        if (iOrdinal == 3) {
            return new Artwork();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 16);
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
        synchronized (Artwork.class) {
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
    public final int m11505n() {
        int i = this.artworkCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Grid3 m11506p() {
        return this.artworkCase_ == 1 ? (Grid3) this.artwork_ : Grid3.m11522n();
    }

    /* JADX INFO: renamed from: q */
    public final Overlap2 m11507q() {
        return this.artworkCase_ == 3 ? (Overlap2) this.artwork_ : Overlap2.m11560n();
    }

    /* JADX INFO: renamed from: r */
    public final Single m11508r() {
        return this.artworkCase_ == 2 ? (Single) this.artwork_ : Single.m11605n();
    }

    /* JADX INFO: renamed from: s */
    public final TiltedOverlap2 m11509s() {
        return this.artworkCase_ == 4 ? (TiltedOverlap2) this.artwork_ : TiltedOverlap2.m11704n();
    }

    /* JADX INFO: renamed from: t */
    public final TiltedOverlap3 m11510t() {
        return this.artworkCase_ == 5 ? (TiltedOverlap3) this.artwork_ : TiltedOverlap3.m11707n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
