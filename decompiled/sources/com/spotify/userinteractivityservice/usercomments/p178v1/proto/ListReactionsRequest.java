package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r290;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ListReactionsRequest extends AbstractC0269h implements sre0 {
    public static final int COMMENT_URI_FIELD_NUMBER = 1;
    private static final ListReactionsRequest DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REACTION_UNICODE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String commentUri_ = "";
    private String reactionUnicode_ = "";
    private String pageToken_ = "";

    static {
        ListReactionsRequest listReactionsRequest = new ListReactionsRequest();
        DEFAULT_INSTANCE = listReactionsRequest;
        AbstractC0269h.registerDefaultInstance(ListReactionsRequest.class, listReactionsRequest);
    }

    private ListReactionsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22197n(ListReactionsRequest listReactionsRequest, String str) {
        listReactionsRequest.getClass();
        str.getClass();
        listReactionsRequest.commentUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22198o(ListReactionsRequest listReactionsRequest, String str) {
        listReactionsRequest.getClass();
        str.getClass();
        listReactionsRequest.bitField0_ |= 2;
        listReactionsRequest.pageToken_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m22199p(ListReactionsRequest listReactionsRequest, String str) {
        listReactionsRequest.getClass();
        str.getClass();
        listReactionsRequest.bitField0_ |= 1;
        listReactionsRequest.reactionUnicode_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static r290 m22201r() {
        return (r290) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "commentUri_", "reactionUnicode_", "pageToken_"});
        }
        if (iOrdinal == 3) {
            return new ListReactionsRequest();
        }
        if (iOrdinal == 4) {
            return new r290();
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
        synchronized (ListReactionsRequest.class) {
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
