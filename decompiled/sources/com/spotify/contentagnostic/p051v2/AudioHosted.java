package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gva;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioHosted extends AbstractC0269h implements sre0 {
    public static final int AUDIO_ID_FIELD_NUMBER = 2;
    private static final AudioHosted DEFAULT_INSTANCE;
    public static final int FILES_FIELD_NUMBER = 1;
    public static final int FILE_NORM_FIELD_NUMBER = 3;
    public static final int GROUP_NORM_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private NormalizationParams fileNorm_;
    private NormalizationParams groupNorm_;
    private ae50 files_ = AbstractC0269h.emptyProtobufList();
    private gva audioId_ = gva.f84678b;

    static {
        AudioHosted audioHosted = new AudioHosted();
        DEFAULT_INSTANCE = audioHosted;
        AbstractC0269h.registerDefaultInstance(AudioHosted.class, audioHosted);
    }

    private AudioHosted() {
    }

    /* JADX INFO: renamed from: o */
    public static AudioHosted m7763o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\n\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "files_", AudioFile.class, "audioId_", "fileNorm_", "groupNorm_"});
        }
        if (iOrdinal == 3) {
            return new AudioHosted();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 16);
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
        synchronized (AudioHosted.class) {
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
    public final gva m7764n() {
        return this.audioId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
