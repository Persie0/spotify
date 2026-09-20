package com.spotify.analyzer_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class LoudnessResponseOuterClass$LoudnessResponse extends AbstractC0269h implements sre0 {
    private static final LoudnessResponseOuterClass$LoudnessResponse DEFAULT_INSTANCE;
    public static final int LOUDNESS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int POSITION_FIELD_NUMBER = 3;
    private int loudnessMemoizedSerializedSize = -1;
    private ud50 loudness_ = AbstractC0269h.emptyIntList();
    private String playbackId_ = "";
    private long position_;

    static {
        LoudnessResponseOuterClass$LoudnessResponse loudnessResponseOuterClass$LoudnessResponse = new LoudnessResponseOuterClass$LoudnessResponse();
        DEFAULT_INSTANCE = loudnessResponseOuterClass$LoudnessResponse;
        AbstractC0269h.registerDefaultInstance(LoudnessResponseOuterClass$LoudnessResponse.class, loudnessResponseOuterClass$LoudnessResponse);
    }

    private LoudnessResponseOuterClass$LoudnessResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static LoudnessResponseOuterClass$LoudnessResponse m3251q(byte[] bArr) {
        return (LoudnessResponseOuterClass$LoudnessResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001'\u0002Ȉ\u0003\u0003", new Object[]{"loudness_", "playbackId_", "position_"});
        }
        if (iOrdinal == 3) {
            return new LoudnessResponseOuterClass$LoudnessResponse();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 8);
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
        synchronized (LoudnessResponseOuterClass$LoudnessResponse.class) {
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
    public final ud50 m3252n() {
        return this.loudness_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3253o() {
        return this.playbackId_;
    }

    /* JADX INFO: renamed from: p */
    public final long m3254p() {
        return this.position_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
