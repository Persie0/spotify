package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SharedAudio extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FILE_FIELD_NUMBER = 3;
    public static final int DECISION_ID_FIELD_NUMBER = 4;
    private static final SharedAudio DEFAULT_INSTANCE;
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHOULD_AUTO_START_FIELD_NUMBER = 5;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private AudioFile audioFile_;
    private int bitField0_;
    private boolean shouldAutoStart_;
    private String groupId_ = "";
    private String trackUri_ = "";
    private String decisionId_ = "";

    static {
        SharedAudio sharedAudio = new SharedAudio();
        DEFAULT_INSTANCE = sharedAudio;
        AbstractC0269h.registerDefaultInstance(SharedAudio.class, sharedAudio);
    }

    private SharedAudio() {
    }

    /* JADX INFO: renamed from: o */
    public static SharedAudio m22911o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005\u0007", new Object[]{"bitField0_", "groupId_", "trackUri_", "audioFile_", "decisionId_", "shouldAutoStart_"});
        }
        if (iOrdinal == 3) {
            return new SharedAudio();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 23);
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
        synchronized (SharedAudio.class) {
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
    public final AudioFile m22912n() {
        AudioFile audioFile = this.audioFile_;
        return audioFile == null ? AudioFile.m22881o() : audioFile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m22913p() {
        return this.groupId_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22914q() {
        return this.shouldAutoStart_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
