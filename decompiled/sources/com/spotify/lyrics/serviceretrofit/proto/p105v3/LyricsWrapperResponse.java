package com.spotify.lyrics.serviceretrofit.proto.p105v3;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LyricsWrapperResponse extends AbstractC0269h implements sre0 {
    private static final LyricsWrapperResponse DEFAULT_INSTANCE;
    public static final int HAS_VOCAL_REMOVAL_FIELD_NUMBER = 2;
    public static final int LYRICS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean hasVocalRemoval_;
    private LyricsV3Response lyrics_;

    static {
        LyricsWrapperResponse lyricsWrapperResponse = new LyricsWrapperResponse();
        DEFAULT_INSTANCE = lyricsWrapperResponse;
        AbstractC0269h.registerDefaultInstance(LyricsWrapperResponse.class, lyricsWrapperResponse);
    }

    private LyricsWrapperResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007", new Object[]{"bitField0_", "lyrics_", "hasVocalRemoval_"});
        }
        if (iOrdinal == 3) {
            return new LyricsWrapperResponse();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 11);
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
        synchronized (LyricsWrapperResponse.class) {
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
    public final boolean m13374n() {
        return this.hasVocalRemoval_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final LyricsV3Response m13375o() {
        LyricsV3Response lyricsV3Response = this.lyrics_;
        return lyricsV3Response == null ? LyricsV3Response.m13354o() : lyricsV3Response;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
