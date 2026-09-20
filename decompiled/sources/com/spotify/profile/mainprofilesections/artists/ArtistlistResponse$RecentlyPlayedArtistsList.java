package com.spotify.profile.mainprofilesections.artists;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistlistResponse$RecentlyPlayedArtistsList extends AbstractC0269h implements sre0 {
    public static final int ARTISTS_FIELD_NUMBER = 1;
    private static final ArtistlistResponse$RecentlyPlayedArtistsList DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();

    static {
        ArtistlistResponse$RecentlyPlayedArtistsList artistlistResponse$RecentlyPlayedArtistsList = new ArtistlistResponse$RecentlyPlayedArtistsList();
        DEFAULT_INSTANCE = artistlistResponse$RecentlyPlayedArtistsList;
        AbstractC0269h.registerDefaultInstance(ArtistlistResponse$RecentlyPlayedArtistsList.class, artistlistResponse$RecentlyPlayedArtistsList);
    }

    private ArtistlistResponse$RecentlyPlayedArtistsList() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"artists_", ArtistlistResponse$RecentlyPlayedArtist.class});
        }
        if (iOrdinal == 3) {
            return new ArtistlistResponse$RecentlyPlayedArtistsList();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 12);
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
        synchronized (ArtistlistResponse$RecentlyPlayedArtistsList.class) {
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

    public final List getArtistsList() {
        return this.artists_;
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
