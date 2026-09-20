package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Background extends AbstractC0269h implements sre0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final Background DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private Object format_;
    private int formatCase_ = 0;
    private String aspectRatio_ = "";

    static {
        Background background = new Background();
        DEFAULT_INSTANCE = background;
        AbstractC0269h.registerDefaultInstance(Background.class, background);
    }

    private Background() {
    }

    /* JADX INFO: renamed from: p */
    public static Background m21125p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"format_", "formatCase_", Color.class, Video.class, Image.class, "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new Background();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 6);
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
        synchronized (Background.class) {
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

    public final boolean hasColor() {
        return this.formatCase_ == 1;
    }

    /* JADX INFO: renamed from: n */
    public final String m21126n() {
        return this.aspectRatio_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Color m21127o() {
        return this.formatCase_ == 1 ? (Color) this.format_ : Color.m21142p();
    }

    /* JADX INFO: renamed from: q */
    public final Image m21128q() {
        return this.formatCase_ == 3 ? (Image) this.format_ : Image.m21147o();
    }

    /* JADX INFO: renamed from: r */
    public final Video m21129r() {
        return this.formatCase_ == 2 ? (Video) this.format_ : Video.m21187o();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21130s() {
        return this.formatCase_ == 3;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m21131t() {
        return this.formatCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
