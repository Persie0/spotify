package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.myt;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ListCommentsResponse extends AbstractC0269h implements sre0 {
    public static final int COMMENTS_FIELD_NUMBER = 2;
    private static final ListCommentsResponse DEFAULT_INSTANCE;
    public static final int ELIGIBILITY_STATUS_FIELD_NUMBER = 4;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_COMMENTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int ROOT_COMMENTS_FIELD_NUMBER = 5;
    private int eligibilityStatus_;
    private int numberOfComments_;
    private ae50 comments_ = AbstractC0269h.emptyProtobufList();
    private String nextPageToken_ = "";
    private ae50 rootComments_ = AbstractC0269h.emptyProtobufList();

    static {
        ListCommentsResponse listCommentsResponse = new ListCommentsResponse();
        DEFAULT_INSTANCE = listCommentsResponse;
        AbstractC0269h.registerDefaultInstance(ListCommentsResponse.class, listCommentsResponse);
    }

    private ListCommentsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"numberOfComments_", "comments_", CommentListDisplay.class, "nextPageToken_", "eligibilityStatus_", "rootComments_", Comment.class});
        }
        if (iOrdinal == 3) {
            return new ListCommentsResponse();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 6);
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
        synchronized (ListCommentsResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    /* JADX INFO: renamed from: n */
    public final myt m22194n() {
        myt mytVarM63209a = myt.m63209a(this.eligibilityStatus_);
        return mytVarM63209a == null ? myt.UNRECOGNIZED : mytVarM63209a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m22195o() {
        return this.numberOfComments_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m22196p() {
        return this.rootComments_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
