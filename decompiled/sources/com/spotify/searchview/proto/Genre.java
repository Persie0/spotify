package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f410;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Genre extends AbstractC0269h implements sre0 {
    private static final Genre DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTIFY_BRANDED_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean spotifyBranded_;
    private int type_;

    static {
        Genre genre = new Genre();
        DEFAULT_INSTANCE = genre;
        AbstractC0269h.registerDefaultInstance(Genre.class, genre);
    }

    private Genre() {
    }

    /* JADX INFO: renamed from: n */
    public static Genre m20852n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"type_", "spotifyBranded_"});
        }
        if (iOrdinal == 3) {
            return new Genre();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 17);
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
        synchronized (Genre.class) {
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
    public final boolean m20853o() {
        return this.spotifyBranded_;
    }

    /* JADX INFO: renamed from: p */
    public final f410 m20854p() {
        f410 f410Var;
        int i = this.type_;
        if (i == 0) {
            f410Var = f410.UNKNOWN;
        } else if (i != 1) {
            f410Var = i != 2 ? null : f410.CONTENT;
        } else {
            f410Var = f410.DEFAULT;
        }
        return f410Var == null ? f410.UNRECOGNIZED : f410Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
