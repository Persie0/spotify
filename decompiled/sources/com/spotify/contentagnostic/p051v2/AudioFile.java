package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioFile extends AbstractC0269h implements sre0 {
    public static final int AVERAGE_BITRATE_FIELD_NUMBER = 3;
    private static final AudioFile DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int averageBitrate_;
    private gva fileId_ = gva.f84678b;

    static {
        AudioFile audioFile = new AudioFile();
        DEFAULT_INSTANCE = audioFile;
        AbstractC0269h.registerDefaultInstance(AudioFile.class, audioFile);
    }

    private AudioFile() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\n\u0003\u0004", new Object[]{"fileId_", "averageBitrate_"});
        }
        if (iOrdinal == 3) {
            return new AudioFile();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 15);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
