package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r710;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetContributionCapabilitiesRequest extends AbstractC0269h implements sre0 {
    private static final GetContributionCapabilitiesRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 1;
    private int bitField0_;
    private CapabilitiesTarget target_;

    static {
        GetContributionCapabilitiesRequest getContributionCapabilitiesRequest = new GetContributionCapabilitiesRequest();
        DEFAULT_INSTANCE = getContributionCapabilitiesRequest;
        AbstractC0269h.registerDefaultInstance(GetContributionCapabilitiesRequest.class, getContributionCapabilitiesRequest);
    }

    private GetContributionCapabilitiesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4324n(GetContributionCapabilitiesRequest getContributionCapabilitiesRequest, CapabilitiesTarget capabilitiesTarget) {
        getContributionCapabilitiesRequest.getClass();
        getContributionCapabilitiesRequest.target_ = capabilitiesTarget;
        getContributionCapabilitiesRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static r710 m4325o() {
        return (r710) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "target_"});
        }
        if (iOrdinal == 3) {
            return new GetContributionCapabilitiesRequest();
        }
        if (iOrdinal == 4) {
            return new r710(DEFAULT_INSTANCE);
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
        synchronized (GetContributionCapabilitiesRequest.class) {
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
