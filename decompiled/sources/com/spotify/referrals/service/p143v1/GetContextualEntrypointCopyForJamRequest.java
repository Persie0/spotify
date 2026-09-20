package com.spotify.referrals.service.p143v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q710;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetContextualEntrypointCopyForJamRequest extends AbstractC0269h implements sre0 {
    private static final GetContextualEntrypointCopyForJamRequest DEFAULT_INSTANCE;
    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    public static final int HOST_USERNAME_FIELD_NUMBER = 1;
    public static final int MEMBERS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String hostUsername_ = "";
    private String entityId_ = "";
    private ae50 members_ = AbstractC0269h.emptyProtobufList();

    static {
        GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequest = new GetContextualEntrypointCopyForJamRequest();
        DEFAULT_INSTANCE = getContextualEntrypointCopyForJamRequest;
        AbstractC0269h.registerDefaultInstance(GetContextualEntrypointCopyForJamRequest.class, getContextualEntrypointCopyForJamRequest);
    }

    private GetContextualEntrypointCopyForJamRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20356n(GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequest, ArrayList arrayList) {
        ae50 ae50Var = getContextualEntrypointCopyForJamRequest.members_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            getContextualEntrypointCopyForJamRequest.members_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, getContextualEntrypointCopyForJamRequest.members_);
    }

    /* JADX INFO: renamed from: o */
    public static void m20357o(GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequest, String str) {
        getContextualEntrypointCopyForJamRequest.getClass();
        str.getClass();
        getContextualEntrypointCopyForJamRequest.entityId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m20358p(GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequest, String str) {
        getContextualEntrypointCopyForJamRequest.getClass();
        str.getClass();
        getContextualEntrypointCopyForJamRequest.hostUsername_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static q710 m20359q() {
        return (q710) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"hostUsername_", "entityId_", "members_", JamMember.class});
        }
        if (iOrdinal == 3) {
            return new GetContextualEntrypointCopyForJamRequest();
        }
        if (iOrdinal == 4) {
            return new q710(DEFAULT_INSTANCE);
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
        synchronized (GetContextualEntrypointCopyForJamRequest.class) {
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
