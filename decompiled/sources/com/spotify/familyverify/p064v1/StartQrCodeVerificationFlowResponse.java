package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ct31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class StartQrCodeVerificationFlowResponse extends AbstractC0269h implements sre0 {
    private static final StartQrCodeVerificationFlowResponse DEFAULT_INSTANCE;
    public static final int PAGE_CONTENTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private StartQrCodeVerificationFlowPageContents pageContents_;

    static {
        StartQrCodeVerificationFlowResponse startQrCodeVerificationFlowResponse = new StartQrCodeVerificationFlowResponse();
        DEFAULT_INSTANCE = startQrCodeVerificationFlowResponse;
        AbstractC0269h.registerDefaultInstance(StartQrCodeVerificationFlowResponse.class, startQrCodeVerificationFlowResponse);
    }

    private StartQrCodeVerificationFlowResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pageContents_"});
        }
        if (iOrdinal == 3) {
            return new StartQrCodeVerificationFlowResponse();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 28);
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
        synchronized (StartQrCodeVerificationFlowResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final StartQrCodeVerificationFlowPageContents m10643n() {
        StartQrCodeVerificationFlowPageContents startQrCodeVerificationFlowPageContents = this.pageContents_;
        return startQrCodeVerificationFlowPageContents == null ? StartQrCodeVerificationFlowPageContents.m10635n() : startQrCodeVerificationFlowPageContents;
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
