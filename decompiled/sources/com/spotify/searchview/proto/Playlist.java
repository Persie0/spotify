package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Playlist extends AbstractC0269h implements sre0 {
    private static final Playlist DEFAULT_INSTANCE;
    public static final int FOLLOWERSCOUNT_FIELD_NUMBER = 4;
    public static final int MATS_FIELD_NUMBER = 7;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 3;
    public static final int OWNED_BY_SPOTIFY_FIELD_NUMBER = 2;
    public static final int OWNER_NAME_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PERSONALIZED_FIELD_NUMBER = 1;
    public static final int PROMPTED_FIELD_NUMBER = 8;
    public static final int TAGS_FIELD_NUMBER = 6;
    private long followersCount_;
    private boolean mats_;
    private int numberOfTracks_;
    private boolean ownedBySpotify_;
    private boolean personalized_;
    private boolean prompted_;
    private String ownerName_ = "";
    private ae50 tags_ = AbstractC0269h.emptyProtobufList();

    static {
        Playlist playlist = new Playlist();
        DEFAULT_INSTANCE = playlist;
        AbstractC0269h.registerDefaultInstance(Playlist.class, playlist);
    }

    private Playlist() {
    }

    /* JADX INFO: renamed from: n */
    public static Playlist m20876n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0002\u0005Ȉ\u0006Ț\u0007\u0007\b\u0007", new Object[]{"personalized_", "ownedBySpotify_", "numberOfTracks_", "followersCount_", "ownerName_", "tags_", "mats_", "prompted_"});
        }
        if (iOrdinal == 3) {
            return new Playlist();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 14);
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
        synchronized (Playlist.class) {
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
    public final long m20877o() {
        return this.followersCount_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20878p() {
        return this.mats_;
    }

    /* JADX INFO: renamed from: q */
    public final int m20879q() {
        return this.numberOfTracks_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20880r() {
        return this.ownedBySpotify_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m20881s() {
        return this.personalized_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m20882t() {
        return this.prompted_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final List m20883u() {
        return this.tags_;
    }
}
