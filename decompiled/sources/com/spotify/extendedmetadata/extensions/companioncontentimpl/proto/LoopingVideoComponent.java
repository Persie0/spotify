package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.i4b0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class LoopingVideoComponent extends AbstractC0269h implements sre0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int CAPTION_FIELD_NUMBER = 3;
    private static final LoopingVideoComponent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_URL_FIELD_NUMBER = 1;
    public static final int VIEW_MODE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int viewMode_;
    private String videoUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";

    static {
        LoopingVideoComponent loopingVideoComponent = new LoopingVideoComponent();
        DEFAULT_INSTANCE = loopingVideoComponent;
        AbstractC0269h.registerDefaultInstance(LoopingVideoComponent.class, loopingVideoComponent);
    }

    private LoopingVideoComponent() {
    }

    /* JADX INFO: renamed from: p */
    public static LoopingVideoComponent m9965p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\f", new Object[]{"bitField0_", "videoUrl_", "altText_", "caption_", "viewMode_"});
        }
        if (iOrdinal == 3) {
            return new LoopingVideoComponent();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 3);
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
        synchronized (LoopingVideoComponent.class) {
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
    public final String m9966n() {
        return this.altText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9967o() {
        return this.caption_;
    }

    /* JADX INFO: renamed from: q */
    public final String m9968q() {
        return this.videoUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final i4b0 m9969r() {
        i4b0 i4b0Var;
        int i = this.viewMode_;
        if (i == 0) {
            i4b0Var = i4b0.UNSPECIFIED;
        } else if (i != 1) {
            i4b0Var = i != 2 ? null : i4b0.FULL_SCREEN;
        } else {
            i4b0Var = i4b0.ARTWORK;
        }
        return i4b0Var == null ? i4b0.UNRECOGNIZED : i4b0Var;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m9970s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
