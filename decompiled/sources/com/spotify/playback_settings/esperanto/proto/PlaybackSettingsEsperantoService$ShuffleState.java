package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bvo0;
import p204p.ore0;
import p204p.p2p0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$ShuffleState extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_ENHANCEMENT_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$ShuffleState DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHUFFLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int contextEnhancement_;
    private boolean shuffle_;

    static {
        PlaybackSettingsEsperantoService$ShuffleState playbackSettingsEsperantoService$ShuffleState = new PlaybackSettingsEsperantoService$ShuffleState();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$ShuffleState;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$ShuffleState.class, playbackSettingsEsperantoService$ShuffleState);
    }

    private PlaybackSettingsEsperantoService$ShuffleState() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static PlaybackSettingsEsperantoService$ShuffleState m17605r(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$ShuffleState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "shuffle_", "contextEnhancement_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$ShuffleState();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 9);
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
        synchronized (PlaybackSettingsEsperantoService$ShuffleState.class) {
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
    public final p2p0 m17606n() {
        p2p0 p2p0Var;
        int i = this.contextEnhancement_;
        if (i != 0) {
            p2p0Var = i != 1 ? null : p2p0.RECOMMENDATION;
        } else {
            p2p0Var = p2p0.NOT_ENHANCED;
        }
        return p2p0Var == null ? p2p0.UNRECOGNIZED : p2p0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17607o() {
        return this.shuffle_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m17608p() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17609q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
