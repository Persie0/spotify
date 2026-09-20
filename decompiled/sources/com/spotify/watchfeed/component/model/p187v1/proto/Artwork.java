package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p96;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Artwork extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_TYPE_FIELD_NUMBER = 2;
    private static final Artwork DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int artworkType_;
    private String uri_ = "";

    static {
        Artwork artwork = new Artwork();
        DEFAULT_INSTANCE = artwork;
        AbstractC0269h.registerDefaultInstance(Artwork.class, artwork);
    }

    private Artwork() {
    }

    /* JADX INFO: renamed from: o */
    public static Artwork m22879o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"uri_", "artworkType_"});
        }
        if (iOrdinal == 3) {
            return new Artwork();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 15);
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
        synchronized (Artwork.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final p96 m22880n() {
        p96 p96Var;
        int i = this.artworkType_;
        if (i == 0) {
            p96Var = p96.DEFAULT;
        } else if (i == 1) {
            p96Var = p96.ARTIST;
        } else if (i != 2) {
            p96Var = i != 3 ? null : p96.USER;
        } else {
            p96Var = p96.SHOW;
        }
        return p96Var == null ? p96.UNRECOGNIZED : p96Var;
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
