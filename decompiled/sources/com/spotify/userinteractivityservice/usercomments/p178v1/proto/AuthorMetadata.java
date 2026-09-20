package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vo7;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AuthorMetadata extends AbstractC0269h implements sre0 {
    private static final AuthorMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_AUTHOR_METADATA_FIELD_NUMBER = 2;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 1;
    private int authorMetadataCase_ = 0;
    private Object authorMetadata_;

    static {
        AuthorMetadata authorMetadata = new AuthorMetadata();
        DEFAULT_INSTANCE = authorMetadata;
        AbstractC0269h.registerDefaultInstance(AuthorMetadata.class, authorMetadata);
    }

    private AuthorMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22126n(AuthorMetadata authorMetadata, UserAuthorMetadata userAuthorMetadata) {
        authorMetadata.getClass();
        userAuthorMetadata.getClass();
        authorMetadata.authorMetadata_ = userAuthorMetadata;
        authorMetadata.authorMetadataCase_ = 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static vo7 m22127r() {
        return (vo7) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"authorMetadata_", "authorMetadataCase_", UserAuthorMetadata.class, ShowAuthorMetadata.class});
        }
        if (iOrdinal == 3) {
            return new AuthorMetadata();
        }
        if (iOrdinal == 4) {
            return new vo7(DEFAULT_INSTANCE);
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
        synchronized (AuthorMetadata.class) {
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
    public final int m22128o() {
        int i = this.authorMetadataCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final ShowAuthorMetadata m22129p() {
        return this.authorMetadataCase_ == 2 ? (ShowAuthorMetadata) this.authorMetadata_ : ShowAuthorMetadata.m22254n();
    }

    /* JADX INFO: renamed from: q */
    public final UserAuthorMetadata m22130q() {
        return this.authorMetadataCase_ == 1 ? (UserAuthorMetadata) this.authorMetadata_ : UserAuthorMetadata.m22266q();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
