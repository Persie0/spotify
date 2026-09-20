package com.spotify.extendedmetadata.extensions.videothumbnailimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Preview extends AbstractC0269h implements sre0 {
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 3;
    private static final Preview DEFAULT_INSTANCE;
    public static final int IMAGE_PREVIEW_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 5;
    public static final int VIDEO_PREVIEW_FIELD_NUMBER = 1;
    private int origin_;
    private int previewCase_ = 0;
    private String previewId_ = "";
    private Object preview_;

    static {
        Preview preview = new Preview();
        DEFAULT_INSTANCE = preview;
        AbstractC0269h.registerDefaultInstance(Preview.class, preview);
    }

    private Preview() {
    }

    /* JADX INFO: renamed from: n */
    public static Preview m10513n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\f\u0005Ȉ", new Object[]{"preview_", "previewCase_", Video.class, Image.class, Audio.class, "origin_", "previewId_"});
        }
        if (iOrdinal == 3) {
            return new Preview();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 29);
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
        synchronized (Preview.class) {
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
    public final Image m10514o() {
        return this.previewCase_ == 2 ? (Image) this.preview_ : Image.m10511n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
