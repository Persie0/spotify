package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ReactionUserAuthorMetadata extends AbstractC0269h implements sre0 {
    private static final ReactionUserAuthorMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_COVER_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int USER_FULL_NAME_FIELD_NUMBER = 2;
    private String username_ = "";
    private String userFullName_ = "";
    private String userCoverImageUrl_ = "";

    static {
        ReactionUserAuthorMetadata reactionUserAuthorMetadata = new ReactionUserAuthorMetadata();
        DEFAULT_INSTANCE = reactionUserAuthorMetadata;
        AbstractC0269h.registerDefaultInstance(ReactionUserAuthorMetadata.class, reactionUserAuthorMetadata);
    }

    private ReactionUserAuthorMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static ReactionUserAuthorMetadata m22226n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"username_", "userFullName_", "userCoverImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ReactionUserAuthorMetadata();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 7);
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
        synchronized (ReactionUserAuthorMetadata.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22227o() {
        return this.userCoverImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22228p() {
        return this.userFullName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
