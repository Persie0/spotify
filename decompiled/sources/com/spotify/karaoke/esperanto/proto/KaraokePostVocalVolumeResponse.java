package com.spotify.karaoke.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dv50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class KaraokePostVocalVolumeResponse extends AbstractC0269h implements sre0 {
    private static final KaraokePostVocalVolumeResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;

    static {
        KaraokePostVocalVolumeResponse karaokePostVocalVolumeResponse = new KaraokePostVocalVolumeResponse();
        DEFAULT_INSTANCE = karaokePostVocalVolumeResponse;
        AbstractC0269h.registerDefaultInstance(KaraokePostVocalVolumeResponse.class, karaokePostVocalVolumeResponse);
    }

    private KaraokePostVocalVolumeResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static KaraokePostVocalVolumeResponse m12067n(byte[] bArr) {
        return (KaraokePostVocalVolumeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"success_"});
        }
        if (iOrdinal == 3) {
            return new KaraokePostVocalVolumeResponse();
        }
        if (iOrdinal == 4) {
            return new dv50(DEFAULT_INSTANCE, 7);
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
        synchronized (KaraokePostVocalVolumeResponse.class) {
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
