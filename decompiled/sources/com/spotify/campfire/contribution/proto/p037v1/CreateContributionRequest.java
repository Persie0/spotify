package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t5l;
import p204p.z110;
import p204p.zik;

/* JADX INFO: loaded from: classes5.dex */
public final class CreateContributionRequest extends AbstractC0269h implements sre0 {
    private static final CreateContributionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int TARGET_FIELD_NUMBER = 1;
    private int bitField0_;
    private ContributionPayload payload_;
    private int source_;
    private ContributionTarget target_;

    static {
        CreateContributionRequest createContributionRequest = new CreateContributionRequest();
        DEFAULT_INSTANCE = createContributionRequest;
        AbstractC0269h.registerDefaultInstance(CreateContributionRequest.class, createContributionRequest);
    }

    private CreateContributionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4304n(CreateContributionRequest createContributionRequest, ContributionPayload contributionPayload) {
        createContributionRequest.getClass();
        createContributionRequest.payload_ = contributionPayload;
        createContributionRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m4305o(CreateContributionRequest createContributionRequest, zik zikVar) {
        createContributionRequest.getClass();
        createContributionRequest.source_ = zikVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m4306p(CreateContributionRequest createContributionRequest, ContributionTarget contributionTarget) {
        createContributionRequest.getClass();
        createContributionRequest.target_ = contributionTarget;
        createContributionRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static t5l m4307q() {
        return (t5l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "target_", "payload_", "source_"});
        }
        if (iOrdinal == 3) {
            return new CreateContributionRequest();
        }
        if (iOrdinal == 4) {
            return new t5l(DEFAULT_INSTANCE);
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
        synchronized (CreateContributionRequest.class) {
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
