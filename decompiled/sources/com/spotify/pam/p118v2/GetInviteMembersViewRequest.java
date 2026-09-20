package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.n910;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetInviteMembersViewRequest extends AbstractC0269h implements sre0 {
    private static final GetInviteMembersViewRequest DEFAULT_INSTANCE;
    public static final int NOT_EMPTY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String notEmpty_ = "";

    static {
        GetInviteMembersViewRequest getInviteMembersViewRequest = new GetInviteMembersViewRequest();
        DEFAULT_INSTANCE = getInviteMembersViewRequest;
        AbstractC0269h.registerDefaultInstance(GetInviteMembersViewRequest.class, getInviteMembersViewRequest);
    }

    private GetInviteMembersViewRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16484n(GetInviteMembersViewRequest getInviteMembersViewRequest) {
        getInviteMembersViewRequest.getClass();
        getInviteMembersViewRequest.notEmpty_ = "0";
    }

    /* JADX INFO: renamed from: o */
    public static n910 m16485o() {
        return (n910) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"notEmpty_"});
        }
        if (iOrdinal == 3) {
            return new GetInviteMembersViewRequest();
        }
        if (iOrdinal == 4) {
            return new n910(DEFAULT_INSTANCE);
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
        synchronized (GetInviteMembersViewRequest.class) {
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
