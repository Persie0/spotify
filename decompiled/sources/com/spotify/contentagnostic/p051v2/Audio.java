package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Audio extends AbstractC0269h implements sre0 {
    public static final int ASSET_FIELD_NUMBER = 3;
    private static final Audio DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSCRIPT_FIELD_NUMBER = 2;
    private AudioAsset asset_;
    private int bitField0_;
    private Transcript transcript_;

    static {
        Audio audio = new Audio();
        DEFAULT_INSTANCE = audio;
        AbstractC0269h.registerDefaultInstance(Audio.class, audio);
    }

    private Audio() {
    }

    /* JADX INFO: renamed from: p */
    public static Audio m7757p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0000", new Object[]{"bitField0_", "transcript_", "asset_"});
        }
        if (iOrdinal == 3) {
            return new Audio();
        }
        if (iOrdinal == 4) {
            return new hr6(9);
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
        synchronized (Audio.class) {
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
    public final AudioAsset m7758o() {
        AudioAsset audioAsset = this.asset_;
        return audioAsset == null ? AudioAsset.m7761o() : audioAsset;
    }

    /* JADX INFO: renamed from: q */
    public final Transcript m7759q() {
        Transcript transcript = this.transcript_;
        return transcript == null ? Transcript.m7946o() : transcript;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
