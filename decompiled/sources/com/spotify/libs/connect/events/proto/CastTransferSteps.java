package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zbc;

/* JADX INFO: loaded from: classes7.dex */
public final class CastTransferSteps extends AbstractC0269h implements sre0 {
    private static final CastTransferSteps DEFAULT_INSTANCE;
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE_FIELD_NUMBER = 3;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSFER_STEP_FIELD_NUMBER = 2;
    private int bitField0_;
    private long googlePlayServicesVersionCode_;
    private String interactionId_ = "";
    private String transferStep_ = "";

    static {
        CastTransferSteps castTransferSteps = new CastTransferSteps();
        DEFAULT_INSTANCE = castTransferSteps;
        AbstractC0269h.registerDefaultInstance(CastTransferSteps.class, castTransferSteps);
    }

    private CastTransferSteps() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12678n(CastTransferSteps castTransferSteps, long j) {
        castTransferSteps.bitField0_ |= 4;
        castTransferSteps.googlePlayServicesVersionCode_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m12679o(CastTransferSteps castTransferSteps, String str) {
        castTransferSteps.getClass();
        str.getClass();
        castTransferSteps.bitField0_ |= 1;
        castTransferSteps.interactionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12680p(CastTransferSteps castTransferSteps, String str) {
        castTransferSteps.getClass();
        str.getClass();
        castTransferSteps.bitField0_ |= 2;
        castTransferSteps.transferStep_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static zbc m12681q() {
        return (zbc) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "interactionId_", "transferStep_", "googlePlayServicesVersionCode_"});
        }
        if (iOrdinal == 3) {
            return new CastTransferSteps();
        }
        if (iOrdinal == 4) {
            return new zbc(DEFAULT_INSTANCE);
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
        synchronized (CastTransferSteps.class) {
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
