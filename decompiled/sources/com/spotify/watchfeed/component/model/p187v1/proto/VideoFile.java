package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.gub1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoFile extends AbstractC0269h implements sre0 {
    private static final VideoFile DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    public static final int FEATURE_UUID_FIELD_NUMBER = 5;
    public static final int IS_EXTRACTED_SEPARATE_MEDIA_FILE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private long endTime_;
    private boolean isExtractedSeparateMediaFile_;
    private long startTime_;
    private int type_;
    private String uri_ = "";
    private String featureUuid_ = "";

    static {
        VideoFile videoFile = new VideoFile();
        DEFAULT_INSTANCE = videoFile;
        AbstractC0269h.registerDefaultInstance(VideoFile.class, videoFile);
    }

    private VideoFile() {
    }

    /* JADX INFO: renamed from: n */
    public static VideoFile m22923n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\u0002\u0005Ȉ\u0006\u0007", new Object[]{"uri_", "type_", "startTime_", "endTime_", "featureUuid_", "isExtractedSeparateMediaFile_"});
        }
        if (iOrdinal == 3) {
            return new VideoFile();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 16);
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
        synchronized (VideoFile.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m22924o() {
        return this.endTime_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22925p() {
        return this.featureUuid_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22926q() {
        return this.isExtractedSeparateMediaFile_;
    }

    /* JADX INFO: renamed from: r */
    public final long m22927r() {
        return this.startTime_;
    }

    /* JADX INFO: renamed from: s */
    public final gub1 m22928s() {
        gub1 gub1Var;
        int i = this.type_;
        if (i != 0) {
            gub1Var = i != 1 ? null : gub1.MANIFEST_ID;
        } else {
            gub1Var = gub1.URL;
        }
        return gub1Var == null ? gub1.UNRECOGNIZED : gub1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
