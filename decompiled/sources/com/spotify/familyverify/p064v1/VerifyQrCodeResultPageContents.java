package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VerifyQrCodeResultPageContents extends AbstractC0269h implements sre0 {
    private static final VerifyQrCodeResultPageContents DEFAULT_INSTANCE;
    public static final int FAILURE_VIEW_CONTENTS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_VIEW_CONTENTS_FIELD_NUMBER = 1;
    private int pageContentsCase_ = 0;
    private Object pageContents_;

    static {
        VerifyQrCodeResultPageContents verifyQrCodeResultPageContents = new VerifyQrCodeResultPageContents();
        DEFAULT_INSTANCE = verifyQrCodeResultPageContents;
        AbstractC0269h.registerDefaultInstance(VerifyQrCodeResultPageContents.class, verifyQrCodeResultPageContents);
    }

    private VerifyQrCodeResultPageContents() {
    }

    /* JADX INFO: renamed from: n */
    public static VerifyQrCodeResultPageContents m10666n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"pageContents_", "pageContentsCase_", VerificationSucceededViewContents.class, VerificationFailureViewContents.class});
        }
        if (iOrdinal == 3) {
            return new VerifyQrCodeResultPageContents();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 22);
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
        synchronized (VerifyQrCodeResultPageContents.class) {
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

    /* JADX INFO: renamed from: o */
    public final VerificationFailureViewContents m10667o() {
        return this.pageContentsCase_ == 2 ? (VerificationFailureViewContents) this.pageContents_ : VerificationFailureViewContents.m10655o();
    }

    /* JADX INFO: renamed from: p */
    public final int m10668p() {
        int i = this.pageContentsCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final VerificationSucceededViewContents m10669q() {
        return this.pageContentsCase_ == 1 ? (VerificationSucceededViewContents) this.pageContents_ : VerificationSucceededViewContents.m10659o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
