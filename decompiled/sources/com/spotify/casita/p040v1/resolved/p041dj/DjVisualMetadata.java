package com.spotify.casita.p040v1.resolved.p041dj;

import com.google.protobuf.AbstractC0269h;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class DjVisualMetadata extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
    public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 2;
    private static final DjVisualMetadata DEFAULT_INSTANCE;
    public static final int JELLYFISH_BOTTOM_COLOR_FIELD_NUMBER = 5;
    public static final int JELLYFISH_MID_COLOR_FIELD_NUMBER = 4;
    public static final int JELLYFISH_TOP_COLOR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TAG_COLOR_FIELD_NUMBER = 6;
    public static final int TEXT_COLOR_FIELD_NUMBER = 7;
    private String backgroundColor_ = "";
    private String backgroundImage_ = "";
    private String jellyfishTopColor_ = "";
    private String jellyfishMidColor_ = "";
    private String jellyfishBottomColor_ = "";
    private String tagColor_ = "";
    private String textColor_ = "";

    static {
        DjVisualMetadata djVisualMetadata = new DjVisualMetadata();
        DEFAULT_INSTANCE = djVisualMetadata;
        AbstractC0269h.registerDefaultInstance(DjVisualMetadata.class, djVisualMetadata);
    }

    private DjVisualMetadata() {
    }

    /* JADX INFO: renamed from: p */
    public static DjVisualMetadata m5891p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"backgroundColor_", "backgroundImage_", "jellyfishTopColor_", "jellyfishMidColor_", "jellyfishBottomColor_", "tagColor_", "textColor_"});
        }
        if (iOrdinal == 3) {
            return new DjVisualMetadata();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 10);
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
        synchronized (DjVisualMetadata.class) {
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
    public final String m5892n() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m5893o() {
        return this.backgroundImage_;
    }

    /* JADX INFO: renamed from: q */
    public final String m5894q() {
        return this.textColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
