package com.spotify.artistfacts.p023v1;

import com.google.protobuf.AbstractC0269h;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ArtistFact extends AbstractC0269h implements sre0 {
    public static final int AI_PERSONA_FIELD_NUMBER = 7;
    private static final ArtistFact DEFAULT_INSTANCE;
    public static final int EDITORIAL_PLAYLIST_PLACEMENTS_FIELD_NUMBER = 1;
    public static final int FRESH_FINDS_FORWARD_FIELD_NUMBER = 8;
    public static final int LOCALIZED_FACT_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int REGISTERED_IN_SPOTIFY_FIELD_NUMBER = 2;
    public static final int RELEASES_FIELD_NUMBER = 3;
    public static final int TOURS_FIELD_NUMBER = 4;
    public static final int VERIFIED_BY_SPOTIFY_FIELD_NUMBER = 5;
    private Object fact_;
    private int factCase_ = 0;
    private String localizedFact_ = "";

    static {
        ArtistFact artistFact = new ArtistFact();
        DEFAULT_INSTANCE = artistFact;
        AbstractC0269h.registerDefaultInstance(ArtistFact.class, artistFact);
    }

    private ArtistFact() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002:\u0000\u0003<\u0000\u0004<\u0000\u0005:\u0000\u0006Ȉ\u0007<\u0000\b<\u0000", new Object[]{"fact_", "factCase_", EditorialPlaylistPlacements.class, ReleaseFacts.class, TourFacts.class, "localizedFact_", AiPersonaFact.class, FreshFindsForwardFact.class});
        }
        if (iOrdinal == 3) {
            return new ArtistFact();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 29);
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
        synchronized (ArtistFact.class) {
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
    public final AiPersonaFact m3311n() {
        return this.factCase_ == 7 ? (AiPersonaFact) this.fact_ : AiPersonaFact.m3309o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EditorialPlaylistPlacements m3312o() {
        return this.factCase_ == 1 ? (EditorialPlaylistPlacements) this.fact_ : EditorialPlaylistPlacements.m3317n();
    }

    /* JADX INFO: renamed from: p */
    public final int m3313p() {
        switch (this.factCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
            default:
                return 0;
            case 7:
                return 6;
            case 8:
                return 7;
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m3314q() {
        return this.localizedFact_;
    }

    /* JADX INFO: renamed from: r */
    public final ReleaseFacts m3315r() {
        return this.factCase_ == 3 ? (ReleaseFacts) this.fact_ : ReleaseFacts.m3321n();
    }

    /* JADX INFO: renamed from: s */
    public final TourFacts m3316s() {
        return this.factCase_ == 4 ? (TourFacts) this.fact_ : TourFacts.m3324n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
