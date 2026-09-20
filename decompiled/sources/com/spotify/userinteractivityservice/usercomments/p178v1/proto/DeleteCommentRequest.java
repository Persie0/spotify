package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.inq;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class DeleteCommentRequest extends AbstractC0269h implements sre0 {
    public static final int COMMENT_URI_FIELD_NUMBER = 1;
    private static final DeleteCommentRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String commentUri_ = "";

    static {
        DeleteCommentRequest deleteCommentRequest = new DeleteCommentRequest();
        DEFAULT_INSTANCE = deleteCommentRequest;
        AbstractC0269h.registerDefaultInstance(DeleteCommentRequest.class, deleteCommentRequest);
    }

    private DeleteCommentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22164n(DeleteCommentRequest deleteCommentRequest, String str) {
        deleteCommentRequest.getClass();
        str.getClass();
        deleteCommentRequest.commentUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static inq m22166p() {
        return (inq) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"commentUri_"});
        }
        if (iOrdinal == 3) {
            return new DeleteCommentRequest();
        }
        if (iOrdinal == 4) {
            return new inq();
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
        synchronized (DeleteCommentRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
