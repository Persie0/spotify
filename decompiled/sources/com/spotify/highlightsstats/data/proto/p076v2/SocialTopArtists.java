package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Person;
import p204p.ae50;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialTopArtists extends AbstractC0269h implements sre0 {
    private static final SocialTopArtists DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PERSONS_FIELD_NUMBER = 2;
    public static final int TOP_ARTIST_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 persons_ = AbstractC0269h.emptyProtobufList();
    private TopArtist topArtist_;

    static {
        SocialTopArtists socialTopArtists = new SocialTopArtists();
        DEFAULT_INSTANCE = socialTopArtists;
        AbstractC0269h.registerDefaultInstance(SocialTopArtists.class, socialTopArtists);
    }

    private SocialTopArtists() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "topArtist_", "persons_", Person.class});
        }
        if (iOrdinal == 3) {
            return new SocialTopArtists();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 17);
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
        synchronized (SocialTopArtists.class) {
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
    public final ae50 m11633n() {
        return this.persons_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TopArtist m11634o() {
        TopArtist topArtist = this.topArtist_;
        return topArtist == null ? TopArtist.m11711p() : topArtist;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
