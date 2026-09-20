package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tcf;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Comment extends AbstractC0269h implements sre0 {
    public static final int COMMENT_STR_FIELD_NUMBER = 3;
    public static final int COMMENT_URI_FIELD_NUMBER = 1;
    public static final int COVER_IMAGE_URLS_REACTED_FIELD_NUMBER = 6;
    public static final int COVER_IMAGE_URLS_REPLIED_FIELD_NUMBER = 7;
    public static final int CREATE_DATE_FIELD_NUMBER = 2;
    private static final Comment DEFAULT_INSTANCE;
    public static final int HAS_USER_REACHED_REPLY_LIMIT_FIELD_NUMBER = 15;
    public static final int IS_PENDING_REVIEW_FIELD_NUMBER = 10;
    public static final int IS_PINNED_FIELD_NUMBER = 16;
    public static final int IS_SENSITIVE_FIELD_NUMBER = 11;
    public static final int NUMBER_OF_REACTIONS_FIELD_NUMBER = 8;
    public static final int NUMBER_OF_REPLIES_FIELD_NUMBER = 9;
    public static final int NUMBER_OF_REPLIES_WITH_THREADS_FIELD_NUMBER = 14;
    private static volatile r2n0 PARSER = null;
    public static final int REACTIONS_ROW_FIELD_NUMBER = 12;
    public static final int SHOW_AUTHOR_METADATA_FIELD_NUMBER = 5;
    public static final int TIMESTAMPS_FIELD_NUMBER = 17;
    public static final int TOP_REPLIES_AUTHOR_METADATA_FIELD_NUMBER = 13;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 4;
    private Object authorMetadata_;
    private int bitField0_;
    private long createDate_;
    private boolean hasUserReachedReplyLimit_;
    private boolean isPendingReview_;
    private boolean isPinned_;
    private boolean isSensitive_;
    private int numberOfReactions_;
    private int numberOfRepliesWithThreads_;
    private int numberOfReplies_;
    private ReactionsRow reactionsRow_;
    private int authorMetadataCase_ = 0;
    private String commentUri_ = "";
    private String commentStr_ = "";
    private ae50 coverImageUrlsReacted_ = AbstractC0269h.emptyProtobufList();
    private ae50 coverImageUrlsReplied_ = AbstractC0269h.emptyProtobufList();
    private ae50 topRepliesAuthorMetadata_ = AbstractC0269h.emptyProtobufList();
    private ae50 timestamps_ = AbstractC0269h.emptyProtobufList();

    static {
        Comment comment = new Comment();
        DEFAULT_INSTANCE = comment;
        AbstractC0269h.registerDefaultInstance(Comment.class, comment);
    }

    private Comment() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22131n(Comment comment, Iterable iterable) {
        ae50 ae50Var = comment.topRepliesAuthorMetadata_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            comment.topRepliesAuthorMetadata_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, comment.topRepliesAuthorMetadata_);
    }

    /* JADX INFO: renamed from: o */
    public static void m22132o(Comment comment) {
        comment.getClass();
        comment.topRepliesAuthorMetadata_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: renamed from: p */
    public static void m22133p(Comment comment, boolean z) {
        comment.hasUserReachedReplyLimit_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22134q(Comment comment, int i) {
        comment.numberOfRepliesWithThreads_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m22135r(Comment comment, ReactionsRow reactionsRow) {
        comment.getClass();
        reactionsRow.getClass();
        comment.reactionsRow_ = reactionsRow;
        comment.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: x */
    public static Comment m22136x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m22137A() {
        return this.isPinned_;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m22138B() {
        return this.isSensitive_;
    }

    /* JADX INFO: renamed from: C */
    public final int m22139C() {
        return this.numberOfRepliesWithThreads_;
    }

    /* JADX INFO: renamed from: D */
    public final ReactionsRow m22140D() {
        ReactionsRow reactionsRow = this.reactionsRow_;
        return reactionsRow == null ? ReactionsRow.m22231p() : reactionsRow;
    }

    /* JADX INFO: renamed from: E */
    public final ShowAuthorMetadata m22141E() {
        return this.authorMetadataCase_ == 5 ? (ShowAuthorMetadata) this.authorMetadata_ : ShowAuthorMetadata.m22254n();
    }

    /* JADX INFO: renamed from: F */
    public final ae50 m22142F() {
        return this.timestamps_;
    }

    /* JADX INFO: renamed from: G */
    public final ae50 m22143G() {
        return this.topRepliesAuthorMetadata_;
    }

    /* JADX INFO: renamed from: H */
    public final UserAuthorMetadata m22144H() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0001\u0001\u0011\u0011\u0000\u0004\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006Ț\u0007Ț\b\u0004\t\u0004\n\u0007\u000b\u0007\fဉ\u0000\r\u001b\u000e\u0004\u000f\u0007\u0010\u0007\u0011\u001b", new Object[]{"authorMetadata_", "authorMetadataCase_", "bitField0_", "commentUri_", "createDate_", "commentStr_", UserAuthorMetadata.class, ShowAuthorMetadata.class, "coverImageUrlsReacted_", "coverImageUrlsReplied_", "numberOfReactions_", "numberOfReplies_", "isPendingReview_", "isSensitive_", "reactionsRow_", "topRepliesAuthorMetadata_", AuthorMetadata.class, "numberOfRepliesWithThreads_", "hasUserReachedReplyLimit_", "isPinned_", "timestamps_", Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new Comment();
        }
        if (iOrdinal == 4) {
            return new tcf(DEFAULT_INSTANCE);
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
        synchronized (Comment.class) {
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

    /* JADX INFO: renamed from: s */
    public final int m22145s() {
        int i = this.authorMetadataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: t */
    public final String m22146t() {
        return this.commentStr_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m22147u() {
        return this.commentUri_;
    }

    /* JADX INFO: renamed from: v */
    public final ae50 m22148v() {
        return this.coverImageUrlsReacted_;
    }

    /* JADX INFO: renamed from: w */
    public final long m22149w() {
        return this.createDate_;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m22150y() {
        return this.hasUserReachedReplyLimit_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m22151z() {
        return this.isPendingReview_;
    }
}
