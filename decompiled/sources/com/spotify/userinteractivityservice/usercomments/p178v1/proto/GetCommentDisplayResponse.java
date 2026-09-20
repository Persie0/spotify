package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.myt;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class GetCommentDisplayResponse extends AbstractC0269h implements sre0 {
    public static final int COMMENT_FIELD_NUMBER = 1;
    private static final GetCommentDisplayResponse DEFAULT_INSTANCE;
    public static final int ELIGIBILITY_STATUS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 3;
    private int bitField0_;
    private Comment comment_;
    private int eligibilityStatus_;
    private Reply reply_;

    static {
        GetCommentDisplayResponse getCommentDisplayResponse = new GetCommentDisplayResponse();
        DEFAULT_INSTANCE = getCommentDisplayResponse;
        AbstractC0269h.registerDefaultInstance(GetCommentDisplayResponse.class, getCommentDisplayResponse);
    }

    private GetCommentDisplayResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "comment_", "eligibilityStatus_", "reply_"});
        }
        if (iOrdinal == 3) {
            return new GetCommentDisplayResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 13);
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
        synchronized (GetCommentDisplayResponse.class) {
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
    public final Comment m22183n() {
        Comment comment = this.comment_;
        return comment == null ? Comment.m22136x() : comment;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final myt m22184o() {
        myt mytVarM63209a = myt.m63209a(this.eligibilityStatus_);
        return mytVarM63209a == null ? myt.UNRECOGNIZED : mytVarM63209a;
    }

    /* JADX INFO: renamed from: p */
    public final Reply m22185p() {
        Reply reply = this.reply_;
        return reply == null ? Reply.m22243w() : reply;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
