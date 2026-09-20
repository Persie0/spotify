package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bjw0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoveOrDeleteMemberRequest extends AbstractC0269h implements sre0 {
    private static final RemoveOrDeleteMemberRequest DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String memberId_ = "";

    static {
        RemoveOrDeleteMemberRequest removeOrDeleteMemberRequest = new RemoveOrDeleteMemberRequest();
        DEFAULT_INSTANCE = removeOrDeleteMemberRequest;
        AbstractC0269h.registerDefaultInstance(RemoveOrDeleteMemberRequest.class, removeOrDeleteMemberRequest);
    }

    private RemoveOrDeleteMemberRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10763n(RemoveOrDeleteMemberRequest removeOrDeleteMemberRequest, String str) {
        removeOrDeleteMemberRequest.getClass();
        str.getClass();
        removeOrDeleteMemberRequest.memberId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static bjw0 m10765p() {
        return (bjw0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"memberId_"});
        }
        if (iOrdinal == 3) {
            return new RemoveOrDeleteMemberRequest();
        }
        if (iOrdinal == 4) {
            return new bjw0();
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
        synchronized (RemoveOrDeleteMemberRequest.class) {
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
