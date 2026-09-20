package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeassociationsResponse$Album extends AbstractC0269h implements sre0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 1;
    private static final EpisodeassociationsResponse$Album DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private ae50 artistName_ = AbstractC0269h.emptyProtobufList();
    private int type_;

    static {
        EpisodeassociationsResponse$Album episodeassociationsResponse$Album = new EpisodeassociationsResponse$Album();
        DEFAULT_INSTANCE = episodeassociationsResponse$Album;
        AbstractC0269h.registerDefaultInstance(EpisodeassociationsResponse$Album.class, episodeassociationsResponse$Album);
    }

    private EpisodeassociationsResponse$Album() {
    }

    /* JADX INFO: renamed from: o */
    public static EpisodeassociationsResponse$Album m9697o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"artistName_", "type_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$Album();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 26);
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
        synchronized (EpisodeassociationsResponse$Album.class) {
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
    public final ae50 m9698n() {
        return this.artistName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final cbw m9699p() {
        cbw cbwVar;
        int i = this.type_;
        if (i == 0) {
            cbwVar = cbw.ALBUM_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            cbwVar = cbw.ALBUM_TYPE_ALBUM;
        } else if (i != 2) {
            cbwVar = i != 3 ? null : cbw.ALBUM_TYPE_EP;
        } else {
            cbwVar = cbw.ALBUM_TYPE_SINGLE;
        }
        return cbwVar == null ? cbw.UNRECOGNIZED : cbwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
