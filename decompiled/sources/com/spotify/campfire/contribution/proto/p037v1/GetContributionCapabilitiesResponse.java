package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetContributionCapabilitiesResponse extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    private static final GetContributionCapabilitiesResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int resultCase_ = 0;
    private Object result_;

    static {
        GetContributionCapabilitiesResponse getContributionCapabilitiesResponse = new GetContributionCapabilitiesResponse();
        DEFAULT_INSTANCE = getContributionCapabilitiesResponse;
        AbstractC0269h.registerDefaultInstance(GetContributionCapabilitiesResponse.class, getContributionCapabilitiesResponse);
    }

    private GetContributionCapabilitiesResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", ContributionKindCapabilities.class, ErrorStatus.class});
        }
        if (iOrdinal == 3) {
            return new GetContributionCapabilitiesResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 21);
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
        synchronized (GetContributionCapabilitiesResponse.class) {
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

    public final boolean hasCapabilities() {
        return this.resultCase_ == 1;
    }

    /* JADX INFO: renamed from: n */
    public final ContributionKindCapabilities m4326n() {
        return this.resultCase_ == 1 ? (ContributionKindCapabilities) this.result_ : ContributionKindCapabilities.m4271o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ErrorStatus m4327o() {
        return this.resultCase_ == 2 ? (ErrorStatus) this.result_ : ErrorStatus.m4322o();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4328p() {
        return this.resultCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
