package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qcj;
import p204p.r110;
import p204p.r2n0;
import p204p.scj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ContainsRelationsResponse$ContainRelationsUsernameRequest extends AbstractC0269h implements sre0 {
    private static final ContainsRelationsResponse$ContainRelationsUsernameRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RELATION_TYPE_FIELD_NUMBER = 2;
    public static final int SOURCE_USERNAME_FIELD_NUMBER = 1;
    public static final int TARGET_USERNAMES_FIELD_NUMBER = 3;
    private int relationType_;
    private String sourceUsername_ = "";
    private ae50 targetUsernames_ = AbstractC0269h.emptyProtobufList();

    static {
        ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest = new ContainsRelationsResponse$ContainRelationsUsernameRequest();
        DEFAULT_INSTANCE = containsRelationsResponse$ContainRelationsUsernameRequest;
        AbstractC0269h.registerDefaultInstance(ContainsRelationsResponse$ContainRelationsUsernameRequest.class, containsRelationsResponse$ContainRelationsUsernameRequest);
    }

    private ContainsRelationsResponse$ContainRelationsUsernameRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19835n(ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest, Iterable iterable) {
        ae50 ae50Var = containsRelationsResponse$ContainRelationsUsernameRequest.targetUsernames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            containsRelationsResponse$ContainRelationsUsernameRequest.targetUsernames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, containsRelationsResponse$ContainRelationsUsernameRequest.targetUsernames_);
    }

    /* JADX INFO: renamed from: o */
    public static void m19836o(ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest) {
        containsRelationsResponse$ContainRelationsUsernameRequest.getClass();
        containsRelationsResponse$ContainRelationsUsernameRequest.relationType_ = scj.RELATION_TYPE_IS_BLOCKING.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m19837p(ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest, String str) {
        containsRelationsResponse$ContainRelationsUsernameRequest.getClass();
        str.getClass();
        containsRelationsResponse$ContainRelationsUsernameRequest.sourceUsername_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static qcj m19838q() {
        return (qcj) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ț", new Object[]{"sourceUsername_", "relationType_", "targetUsernames_"});
        }
        if (iOrdinal == 3) {
            return new ContainsRelationsResponse$ContainRelationsUsernameRequest();
        }
        if (iOrdinal == 4) {
            return new qcj(DEFAULT_INSTANCE);
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
        synchronized (ContainsRelationsResponse$ContainRelationsUsernameRequest.class) {
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
