package com.spotify.upcomingreleases.p172v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Prerelease extends AbstractC0269h implements sre0 {
    public static final int ALBUM_URI_FIELD_NUMBER = 2;
    public static final int ARTISTS_FIELD_NUMBER = 6;
    public static final int COVER_URL_FIELD_NUMBER = 3;
    private static final Prerelease DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABLE_TRACK_URIS_FIELD_NUMBER = 7;
    public static final int PRESAVE_COUNT_FIELD_NUMBER = 8;
    public static final int RELEASE_DATE_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long presaveCount_;
    private Timestamp releaseDate_;
    private String uri_ = "";
    private String albumUri_ = "";
    private String coverUrl_ = "";
    private String name_ = "";
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();
    private ae50 playableTrackUris_ = AbstractC0269h.emptyProtobufList();

    static {
        Prerelease prerelease = new Prerelease();
        DEFAULT_INSTANCE = prerelease;
        AbstractC0269h.registerDefaultInstance(Prerelease.class, prerelease);
    }

    private Prerelease() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007Ț\bဂ\u0001", new Object[]{"bitField0_", "uri_", "albumUri_", "coverUrl_", "name_", "releaseDate_", "artists_", Artist.class, "playableTrackUris_", "presaveCount_"});
        }
        if (iOrdinal == 3) {
            return new Prerelease();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 21);
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
        synchronized (Prerelease.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22016n() {
        return this.albumUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22017o() {
        return this.coverUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m22018p() {
        return this.playableTrackUris_;
    }

    /* JADX INFO: renamed from: q */
    public final long m22019q() {
        return this.presaveCount_;
    }

    /* JADX INFO: renamed from: r */
    public final Timestamp m22020r() {
        Timestamp timestamp = this.releaseDate_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
