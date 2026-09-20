package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class BackgroundAudioPreview extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FILE_FIELD_NUMBER = 1;
    private static final BackgroundAudioPreview DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 3;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 2;
    private AudioFile audioFile_;
    private int bitField0_;
    private String entityUri_ = "";
    private String entrypointUri_ = "";
    private boolean shouldLoop_;

    static {
        BackgroundAudioPreview backgroundAudioPreview = new BackgroundAudioPreview();
        DEFAULT_INSTANCE = backgroundAudioPreview;
        AbstractC0269h.registerDefaultInstance(BackgroundAudioPreview.class, backgroundAudioPreview);
    }

    private BackgroundAudioPreview() {
    }

    /* JADX INFO: renamed from: o */
    public static BackgroundAudioPreview m22888o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "audioFile_", "shouldLoop_", "entityUri_", "entrypointUri_"});
        }
        if (iOrdinal == 3) {
            return new BackgroundAudioPreview();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 8);
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
        synchronized (BackgroundAudioPreview.class) {
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
    public final AudioFile m22889n() {
        AudioFile audioFile = this.audioFile_;
        return audioFile == null ? AudioFile.m22881o() : audioFile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m22890p() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22891q() {
        return this.entrypointUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22892r() {
        return this.shouldLoop_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
