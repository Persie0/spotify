package com.spotify.memberinvite.model.p109v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PayloadResponse extends AbstractC0269h implements sre0 {
    private static final PayloadResponse DEFAULT_INSTANCE;
    public static final int INVITE_LINK_FIELD_NUMBER = 2;
    public static final int INVITE_MEMBERS_ACTION_TITLE_FIELD_NUMBER = 3;
    public static final int INVITE_MEMBERS_DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_CONTEXT_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShareContext shareContext_;
    private String title_ = "";
    private String inviteLink_ = "";
    private String inviteMembersActionTitle_ = "";
    private String inviteMembersDescription_ = "";

    static {
        PayloadResponse payloadResponse = new PayloadResponse();
        DEFAULT_INSTANCE = payloadResponse;
        AbstractC0269h.registerDefaultInstance(PayloadResponse.class, payloadResponse);
    }

    private PayloadResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000", new Object[]{"bitField0_", "title_", "inviteLink_", "inviteMembersActionTitle_", "inviteMembersDescription_", "shareContext_"});
        }
        if (iOrdinal == 3) {
            return new PayloadResponse();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 9);
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
        synchronized (PayloadResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m13476n() {
        return this.inviteLink_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m13477o() {
        return this.inviteMembersActionTitle_;
    }

    /* JADX INFO: renamed from: p */
    public final String m13478p() {
        return this.inviteMembersDescription_;
    }

    /* JADX INFO: renamed from: q */
    public final ShareContext m13479q() {
        ShareContext shareContext = this.shareContext_;
        return shareContext == null ? ShareContext.m13480n() : shareContext;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
