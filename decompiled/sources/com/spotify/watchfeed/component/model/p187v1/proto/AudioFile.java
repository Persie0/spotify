package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AudioFile extends AbstractC0269h implements sre0 {
    public static final int CDN_URL_FIELD_NUMBER = 1;
    private static final AudioFile DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    public static final int FEATURE_UUID_FIELD_NUMBER = 5;
    public static final int FILE_ID_FIELD_NUMBER = 2;
    public static final int IS_EXTRACTED_SEPARATE_MEDIA_FILE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 3;
    private long endTime_;
    private boolean isExtractedSeparateMediaFile_;
    private long startTime_;
    private String cdnUrl_ = "";
    private String fileId_ = "";
    private String featureUuid_ = "";

    static {
        AudioFile audioFile = new AudioFile();
        DEFAULT_INSTANCE = audioFile;
        AbstractC0269h.registerDefaultInstance(AudioFile.class, audioFile);
    }

    private AudioFile() {
    }

    /* JADX INFO: renamed from: o */
    public static AudioFile m22881o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006\u0007", new Object[]{"cdnUrl_", "fileId_", "startTime_", "endTime_", "featureUuid_", "isExtractedSeparateMediaFile_"});
        }
        if (iOrdinal == 3) {
            return new AudioFile();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 14);
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
        synchronized (AudioFile.class) {
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
    public final String m22882n() {
        return this.cdnUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final long m22883p() {
        return this.endTime_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22884q() {
        return this.featureUuid_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22885r() {
        return this.fileId_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22886s() {
        return this.isExtractedSeparateMediaFile_;
    }

    /* JADX INFO: renamed from: t */
    public final long m22887t() {
        return this.startTime_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
