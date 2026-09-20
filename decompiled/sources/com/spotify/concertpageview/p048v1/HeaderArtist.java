package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.iw10;
import p204p.nf20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class HeaderArtist extends AbstractC0269h implements sre0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 3;
    private static final HeaderArtist DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int ROLE_FIELD_NUMBER = 4;
    private int role_;
    private String name_ = "";
    private String imageUrl_ = "";
    private String artistUri_ = "";

    static {
        HeaderArtist headerArtist = new HeaderArtist();
        DEFAULT_INSTANCE = headerArtist;
        AbstractC0269h.registerDefaultInstance(HeaderArtist.class, headerArtist);
    }

    private HeaderArtist() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"name_", "imageUrl_", "artistUri_", "role_"});
        }
        if (iOrdinal == 3) {
            return new HeaderArtist();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 28);
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
        synchronized (HeaderArtist.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m7053n() {
        return this.artistUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final nf20 m7054o() {
        nf20 nf20Var;
        int i = this.role_;
        if (i == 0) {
            nf20Var = nf20.HEADER_ARTIST_ROLE_UNSPECIFIED;
        } else if (i != 1) {
            nf20Var = i != 2 ? null : nf20.HEADER_ARTIST_ROLE_SUPPORTING;
        } else {
            nf20Var = nf20.HEADER_ARTIST_ROLE_HEADLINER;
        }
        return nf20Var == null ? nf20.UNRECOGNIZED : nf20Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
