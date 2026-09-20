package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zo80;

/* JADX INFO: loaded from: classes2.dex */
public final class ListCommentsRequest extends AbstractC0269h implements sre0 {
    private static final ListCommentsRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String entityUri_ = "";
    private String pageToken_ = "";

    static {
        ListCommentsRequest listCommentsRequest = new ListCommentsRequest();
        DEFAULT_INSTANCE = listCommentsRequest;
        AbstractC0269h.registerDefaultInstance(ListCommentsRequest.class, listCommentsRequest);
    }

    private ListCommentsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22190n(ListCommentsRequest listCommentsRequest, String str) {
        listCommentsRequest.getClass();
        str.getClass();
        listCommentsRequest.entityUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22191o(ListCommentsRequest listCommentsRequest, String str) {
        listCommentsRequest.getClass();
        str.getClass();
        listCommentsRequest.bitField0_ |= 1;
        listCommentsRequest.pageToken_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static zo80 m22193q() {
        return (zo80) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "entityUri_", "pageToken_"});
        }
        if (iOrdinal == 3) {
            return new ListCommentsRequest();
        }
        if (iOrdinal == 4) {
            return new zo80();
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
        synchronized (ListCommentsRequest.class) {
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
