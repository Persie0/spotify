package com.spotify.extendedmetadata.extensions.artistconcertsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ArtistConcertsResponse extends AbstractC0269h implements sre0 {
    public static final int CONCERT_URIS_FIELD_NUMBER = 1;
    private static final ArtistConcertsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 concertUris_ = AbstractC0269h.emptyProtobufList();

    static {
        ArtistConcertsResponse artistConcertsResponse = new ArtistConcertsResponse();
        DEFAULT_INSTANCE = artistConcertsResponse;
        AbstractC0269h.registerDefaultInstance(ArtistConcertsResponse.class, artistConcertsResponse);
    }

    private ArtistConcertsResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static ArtistConcertsResponse m9824o(byte[] bArr) {
        return (ArtistConcertsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"concertUris_"});
        }
        if (iOrdinal == 3) {
            return new ArtistConcertsResponse();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 26);
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
        synchronized (ArtistConcertsResponse.class) {
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
    public final ae50 m9825n() {
        return this.concertUris_;
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
