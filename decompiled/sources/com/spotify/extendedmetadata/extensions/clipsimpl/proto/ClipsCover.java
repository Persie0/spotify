package com.spotify.extendedmetadata.extensions.clipsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ClipsCover extends AbstractC0269h implements sre0 {
    private static final ClipsCover DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_SOURCE_ID_FIELD_NUMBER = 2;
    public static final int VIDEO_SOURCE_URL_FIELD_NUMBER = 3;
    private String imageUrl_ = "";
    private String videoSourceId_ = "";
    private String videoSourceUrl_ = "";

    static {
        ClipsCover clipsCover = new ClipsCover();
        DEFAULT_INSTANCE = clipsCover;
        AbstractC0269h.registerDefaultInstance(ClipsCover.class, clipsCover);
    }

    private ClipsCover() {
    }

    /* JADX INFO: renamed from: p */
    public static ClipsCover m9925p(byte[] bArr) {
        return (ClipsCover) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"imageUrl_", "videoSourceId_", "videoSourceUrl_"});
        }
        if (iOrdinal == 3) {
            return new ClipsCover();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 24);
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
        synchronized (ClipsCover.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: n */
    public final String m9926n() {
        return this.videoSourceId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9927o() {
        return this.videoSourceUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
