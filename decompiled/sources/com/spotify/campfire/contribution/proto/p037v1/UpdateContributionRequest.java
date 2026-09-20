package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s9a1;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class UpdateContributionRequest extends AbstractC0269h implements sre0 {
    public static final int CONTRIBUTION_FIELD_NUMBER = 1;
    private static final UpdateContributionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private int bitField0_;
    private ContributionReference contribution_;
    private ContributionPayload payload_;

    static {
        UpdateContributionRequest updateContributionRequest = new UpdateContributionRequest();
        DEFAULT_INSTANCE = updateContributionRequest;
        AbstractC0269h.registerDefaultInstance(UpdateContributionRequest.class, updateContributionRequest);
    }

    private UpdateContributionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4361n(UpdateContributionRequest updateContributionRequest, ContributionReference contributionReference) {
        updateContributionRequest.getClass();
        contributionReference.getClass();
        updateContributionRequest.contribution_ = contributionReference;
        updateContributionRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m4362o(UpdateContributionRequest updateContributionRequest, ContributionPayload contributionPayload) {
        updateContributionRequest.getClass();
        updateContributionRequest.payload_ = contributionPayload;
        updateContributionRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static s9a1 m4363p() {
        return (s9a1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "contribution_", "payload_"});
        }
        if (iOrdinal == 3) {
            return new UpdateContributionRequest();
        }
        if (iOrdinal == 4) {
            return new s9a1(DEFAULT_INSTANCE);
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
        synchronized (UpdateContributionRequest.class) {
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
