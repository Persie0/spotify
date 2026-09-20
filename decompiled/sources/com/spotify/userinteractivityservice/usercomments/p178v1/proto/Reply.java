package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.fnw0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Reply extends AbstractC0269h implements sre0 {
    public static final int COMMENT_URI_FIELD_NUMBER = 1;
    public static final int CREATE_DATE_FIELD_NUMBER = 2;
    private static final Reply DEFAULT_INSTANCE;
    public static final int IS_PENDING_REVIEW_FIELD_NUMBER = 7;
    public static final int IS_SENSITIVE_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int REACTIONS_ROW_FIELD_NUMBER = 6;
    public static final int REPLY_STR_FIELD_NUMBER = 3;
    public static final int SHOW_AUTHOR_METADATA_FIELD_NUMBER = 5;
    public static final int TIMESTAMPS_FIELD_NUMBER = 9;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 4;
    private Object authorMetadata_;
    private int bitField0_;
    private long createDate_;
    private boolean isPendingReview_;
    private boolean isSensitive_;
    private ReactionsRow reactionsRow_;
    private int authorMetadataCase_ = 0;
    private String commentUri_ = "";
    private String replyStr_ = "";
    private ae50 timestamps_ = AbstractC0269h.emptyProtobufList();

    static {
        Reply reply = new Reply();
        DEFAULT_INSTANCE = reply;
        AbstractC0269h.registerDefaultInstance(Reply.class, reply);
    }

    private Reply() {
    }

    /* JADX INFO: renamed from: E */
    public static fnw0 m22236E() {
        return (fnw0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m22237n(Reply reply, String str) {
        reply.getClass();
        reply.commentUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22238o(Reply reply, long j) {
        reply.createDate_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m22239p(Reply reply) {
        reply.isPendingReview_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22240q(Reply reply, ReactionsRow reactionsRow) {
        reply.getClass();
        reply.reactionsRow_ = reactionsRow;
        reply.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m22241r(Reply reply, String str) {
        reply.getClass();
        str.getClass();
        reply.replyStr_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m22242s(Reply reply, UserAuthorMetadata userAuthorMetadata) {
        reply.getClass();
        userAuthorMetadata.getClass();
        reply.authorMetadata_ = userAuthorMetadata;
        reply.authorMetadataCase_ = 4;
    }

    /* JADX INFO: renamed from: w */
    public static Reply m22243w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m22244A() {
        return this.replyStr_;
    }

    /* JADX INFO: renamed from: B */
    public final ShowAuthorMetadata m22245B() {
        return this.authorMetadataCase_ == 5 ? (ShowAuthorMetadata) this.authorMetadata_ : ShowAuthorMetadata.m22254n();
    }

    /* JADX INFO: renamed from: C */
    public final ae50 m22246C() {
        return this.timestamps_;
    }

    /* JADX INFO: renamed from: D */
    public final UserAuthorMetadata m22247D() {
        return this.authorMetadataCase_ == 4 ? (UserAuthorMetadata) this.authorMetadata_ : UserAuthorMetadata.m22266q();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006ဉ\u0000\u0007\u0007\b\u0007\t\u001b", new Object[]{"authorMetadata_", "authorMetadataCase_", "bitField0_", "commentUri_", "createDate_", "replyStr_", UserAuthorMetadata.class, ShowAuthorMetadata.class, "reactionsRow_", "isPendingReview_", "isSensitive_", "timestamps_", Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new Reply();
        }
        if (iOrdinal == 4) {
            return new fnw0(DEFAULT_INSTANCE);
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
        synchronized (Reply.class) {
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

    /* JADX INFO: renamed from: t */
    public final int m22248t() {
        int i = this.authorMetadataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m22249u() {
        return this.commentUri_;
    }

    /* JADX INFO: renamed from: v */
    public final long m22250v() {
        return this.createDate_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m22251x() {
        return this.isPendingReview_;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m22252y() {
        return this.isSensitive_;
    }

    /* JADX INFO: renamed from: z */
    public final ReactionsRow m22253z() {
        ReactionsRow reactionsRow = this.reactionsRow_;
        return reactionsRow == null ? ReactionsRow.m22231p() : reactionsRow;
    }
}
