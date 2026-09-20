package com.spotify.watchfeed.component.content.p183v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.BackgroundAudioPreview;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import com.spotify.watchfeed.component.model.p187v1.proto.TranscriptFile;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ReadAlongContent extends AbstractC0269h implements sre0 {
    public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 3;
    public static final int BACKGROUND_AUDIO_PREVIEW_FIELD_NUMBER = 2;
    public static final int COVER_IMAGE_FIELD_NUMBER = 6;
    private static final ReadAlongContent DEFAULT_INSTANCE;
    public static final int HIGHLIGHTCOLOR_FIELD_NUMBER = 4;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSCRIPT_FILE_FIELD_NUMBER = 1;
    private BackgroundAudioPreview backgroundAudioPreview_;
    private int bitField0_;
    private Image coverImage_;
    private boolean increaseVolumeGradually_;
    private TranscriptFile transcriptFile_;
    private String backgroundColor_ = "";
    private String highlightColor_ = "";

    static {
        ReadAlongContent readAlongContent = new ReadAlongContent();
        DEFAULT_INSTANCE = readAlongContent;
        AbstractC0269h.registerDefaultInstance(ReadAlongContent.class, readAlongContent);
    }

    private ReadAlongContent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static ReadAlongContent m22532s(gva gvaVar) {
        return (ReadAlongContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006ဉ\u0002", new Object[]{"bitField0_", "transcriptFile_", "backgroundAudioPreview_", "backgroundColor_", "highlightColor_", "increaseVolumeGradually_", "coverImage_"});
        }
        if (iOrdinal == 3) {
            return new ReadAlongContent();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 10);
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
        synchronized (ReadAlongContent.class) {
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
    public final BackgroundAudioPreview m22533n() {
        BackgroundAudioPreview backgroundAudioPreview = this.backgroundAudioPreview_;
        return backgroundAudioPreview == null ? BackgroundAudioPreview.m22888o() : backgroundAudioPreview;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22534o() {
        return this.backgroundColor_;
    }

    /* JADX INFO: renamed from: p */
    public final Image m22535p() {
        Image image = this.coverImage_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: q */
    public final String m22536q() {
        return this.highlightColor_;
    }

    /* JADX INFO: renamed from: r */
    public final TranscriptFile m22537r() {
        TranscriptFile transcriptFile = this.transcriptFile_;
        return transcriptFile == null ? TranscriptFile.m22920n() : transcriptFile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
