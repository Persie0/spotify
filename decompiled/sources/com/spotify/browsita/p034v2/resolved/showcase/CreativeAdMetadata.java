package com.spotify.browsita.p034v2.resolved.showcase;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.xu11;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CreativeAdMetadata extends AbstractC0269h implements sre0 {
    public static final int COMPANION_MUSIC_VIDEO_FIELD_NUMBER = 3;
    public static final int COMPANION_VIDEO_FIELD_NUMBER = 2;
    private static final CreativeAdMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private CompanionMusicVideo companionMusicVideo_;
    private CompanionVideo companionVideo_;
    private int type_;

    static {
        CreativeAdMetadata creativeAdMetadata = new CreativeAdMetadata();
        DEFAULT_INSTANCE = creativeAdMetadata;
        AbstractC0269h.registerDefaultInstance(CreativeAdMetadata.class, creativeAdMetadata);
    }

    private CreativeAdMetadata() {
    }

    /* JADX INFO: renamed from: o */
    public static CreativeAdMetadata m4180o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "type_", "companionVideo_", "companionMusicVideo_"});
        }
        if (iOrdinal == 3) {
            return new CreativeAdMetadata();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 6);
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
        synchronized (CreativeAdMetadata.class) {
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
    public final CompanionMusicVideo m4181n() {
        CompanionMusicVideo companionMusicVideo = this.companionMusicVideo_;
        return companionMusicVideo == null ? CompanionMusicVideo.m4178o() : companionMusicVideo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final xu11 m4182p() {
        xu11 xu11Var;
        int i = this.type_;
        if (i == 0) {
            xu11Var = xu11.UNSET;
        } else if (i == 1) {
            xu11Var = xu11.SHOWCASE_DEFAULT;
        } else if (i == 2) {
            xu11Var = xu11.SHOWCASE_VIDEO;
        } else if (i != 3) {
            xu11Var = i != 4 ? null : xu11.SHOWCASE_MUSIC_VIDEO;
        } else {
            xu11Var = xu11.SHOWCASE_PRERELEASE;
        }
        return xu11Var == null ? xu11.UNRECOGNIZED : xu11Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4183q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
