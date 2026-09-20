package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class LoopingVideoSection extends AbstractC0269h implements sre0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int CAPTION_FIELD_NUMBER = 3;
    private static final LoopingVideoSection DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_URL_FIELD_NUMBER = 1;
    private double aspectRatio_;
    private int bitField0_;
    private String videoUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";

    static {
        LoopingVideoSection loopingVideoSection = new LoopingVideoSection();
        DEFAULT_INSTANCE = loopingVideoSection;
        AbstractC0269h.registerDefaultInstance(LoopingVideoSection.class, loopingVideoSection);
    }

    private LoopingVideoSection() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static LoopingVideoSection m8086q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004က\u0001", new Object[]{"bitField0_", "videoUrl_", "altText_", "caption_", "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new LoopingVideoSection();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 4);
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
        synchronized (LoopingVideoSection.class) {
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
    public final String m8087n() {
        return this.altText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final double m8088o() {
        return this.aspectRatio_;
    }

    /* JADX INFO: renamed from: p */
    public final String m8089p() {
        return this.caption_;
    }

    /* JADX INFO: renamed from: r */
    public final String m8090r() {
        return this.videoUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8091s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8092t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
