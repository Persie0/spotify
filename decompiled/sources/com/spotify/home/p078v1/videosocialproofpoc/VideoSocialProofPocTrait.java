package com.spotify.home.p078v1.videosocialproofpoc;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoSocialProofPocTrait extends AbstractC0269h implements sre0 {
    private static final VideoSocialProofPocTrait DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STARTS_COUNT_FIELD_NUMBER = 2;
    private long startsCount_;

    static {
        VideoSocialProofPocTrait videoSocialProofPocTrait = new VideoSocialProofPocTrait();
        DEFAULT_INSTANCE = videoSocialProofPocTrait;
        AbstractC0269h.registerDefaultInstance(VideoSocialProofPocTrait.class, videoSocialProofPocTrait);
    }

    private VideoSocialProofPocTrait() {
    }

    /* JADX INFO: renamed from: o */
    public static VideoSocialProofPocTrait m11839o(byte[] bArr) {
        return (VideoSocialProofPocTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"startsCount_"});
        }
        if (iOrdinal == 3) {
            return new VideoSocialProofPocTrait();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 26);
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
        synchronized (VideoSocialProofPocTrait.class) {
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
    public final long m11840n() {
        return this.startsCount_;
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
