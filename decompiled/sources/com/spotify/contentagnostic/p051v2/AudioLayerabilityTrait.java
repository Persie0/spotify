package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gva;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.pz8;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioLayerabilityTrait extends AbstractC0269h implements sre0 {
    public static final int AUDIO_TRACKS_IN_BASE_LAYER_FIELD_NUMBER = 3;
    public static final int BASE_LAYER_TYPE_FIELD_NUMBER = 2;
    public static final int BASE_LAYER_VIDEO_ID_FIELD_NUMBER = 1;
    private static final AudioLayerabilityTrait DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int baseLayerType_;
    private gva baseLayerVideoId_ = gva.f84678b;
    private ae50 audioTracksInBaseLayer_ = AbstractC0269h.emptyProtobufList();

    static {
        AudioLayerabilityTrait audioLayerabilityTrait = new AudioLayerabilityTrait();
        DEFAULT_INSTANCE = audioLayerabilityTrait;
        AbstractC0269h.registerDefaultInstance(AudioLayerabilityTrait.class, audioLayerabilityTrait);
    }

    private AudioLayerabilityTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static AudioLayerabilityTrait m7765q(byte[] bArr) {
        return (AudioLayerabilityTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\f\u0003\u001b", new Object[]{"baseLayerVideoId_", "baseLayerType_", "audioTracksInBaseLayer_", AudioLayerableTrackInfo.class});
        }
        if (iOrdinal == 3) {
            return new AudioLayerabilityTrait();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 17);
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
        synchronized (AudioLayerabilityTrait.class) {
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
    public final ae50 m7766n() {
        return this.audioTracksInBaseLayer_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final pz8 m7767o() {
        pz8 pz8Var;
        int i = this.baseLayerType_;
        if (i == 0) {
            pz8Var = pz8.BASE_LAYER_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            pz8Var = i != 2 ? null : pz8.BASE_LAYER_TYPE_MUSIC;
        } else {
            pz8Var = pz8.BASE_LAYER_TYPE_TALK;
        }
        return pz8Var == null ? pz8.UNRECOGNIZED : pz8Var;
    }

    /* JADX INFO: renamed from: p */
    public final gva m7768p() {
        return this.baseLayerVideoId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
