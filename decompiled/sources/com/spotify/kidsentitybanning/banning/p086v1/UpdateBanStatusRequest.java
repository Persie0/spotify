package com.spotify.kidsentitybanning.banning.p086v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.l7a1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UpdateBanStatusRequest extends AbstractC0269h implements sre0 {
    private static final UpdateBanStatusRequest DEFAULT_INSTANCE;
    public static final int DESIRED_CHILD_BAN_STATUS_FIELD_NUMBER = 3;
    public static final int ENTITY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String entity_ = "";
    private ae50 desiredChildBanStatus_ = AbstractC0269h.emptyProtobufList();

    static {
        UpdateBanStatusRequest updateBanStatusRequest = new UpdateBanStatusRequest();
        DEFAULT_INSTANCE = updateBanStatusRequest;
        AbstractC0269h.registerDefaultInstance(UpdateBanStatusRequest.class, updateBanStatusRequest);
    }

    private UpdateBanStatusRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12180n(UpdateBanStatusRequest updateBanStatusRequest, ChildBanStatus childBanStatus) {
        updateBanStatusRequest.getClass();
        childBanStatus.getClass();
        ae50 ae50Var = updateBanStatusRequest.desiredChildBanStatus_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            updateBanStatusRequest.desiredChildBanStatus_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        updateBanStatusRequest.desiredChildBanStatus_.add(childBanStatus);
    }

    /* JADX INFO: renamed from: o */
    public static void m12181o(UpdateBanStatusRequest updateBanStatusRequest, String str) {
        updateBanStatusRequest.getClass();
        str.getClass();
        updateBanStatusRequest.entity_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static l7a1 m12182p() {
        return (l7a1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ȉ\u0003\u001b", new Object[]{"entity_", "desiredChildBanStatus_", ChildBanStatus.class});
        }
        if (iOrdinal == 3) {
            return new UpdateBanStatusRequest();
        }
        if (iOrdinal == 4) {
            return new l7a1(DEFAULT_INSTANCE);
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
        synchronized (UpdateBanStatusRequest.class) {
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
