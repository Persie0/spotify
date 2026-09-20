package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ijl;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CreatorBio extends AbstractC0269h implements sre0 {
    public static final int CREATOR_URI_FIELD_NUMBER = 1;
    private static final CreatorBio DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String creatorUri_ = "";
    private String title_ = "";

    static {
        CreatorBio creatorBio = new CreatorBio();
        DEFAULT_INSTANCE = creatorBio;
        AbstractC0269h.registerDefaultInstance(CreatorBio.class, creatorBio);
    }

    private CreatorBio() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20463n(CreatorBio creatorBio, String str) {
        creatorBio.getClass();
        creatorBio.creatorUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20464o(CreatorBio creatorBio, String str) {
        creatorBio.getClass();
        creatorBio.title_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static CreatorBio m20465q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static ijl m20466r() {
        return (ijl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"creatorUri_", "title_"});
        }
        if (iOrdinal == 3) {
            return new CreatorBio();
        }
        if (iOrdinal == 4) {
            return new ijl(DEFAULT_INSTANCE);
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
        synchronized (CreatorBio.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m20467p() {
        return this.creatorUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
