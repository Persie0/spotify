package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class QrCodeDisplay extends AbstractC0269h implements sre0 {
    private static final QrCodeDisplay DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TOTP_CONFIG_FIELD_NUMBER = 2;
    public static final int VIEW_CONTENTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private TotpParams totpConfig_;
    private QrCodeDisplayViewContents viewContents_;

    static {
        QrCodeDisplay qrCodeDisplay = new QrCodeDisplay();
        DEFAULT_INSTANCE = qrCodeDisplay;
        AbstractC0269h.registerDefaultInstance(QrCodeDisplay.class, qrCodeDisplay);
    }

    private QrCodeDisplay() {
    }

    /* JADX INFO: renamed from: n */
    public static QrCodeDisplay m10627n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "viewContents_", "totpConfig_"});
        }
        if (iOrdinal == 3) {
            return new QrCodeDisplay();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 11);
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
        synchronized (QrCodeDisplay.class) {
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
    public final TotpParams m10628o() {
        TotpParams totpParams = this.totpConfig_;
        return totpParams == null ? TotpParams.m10647n() : totpParams;
    }

    /* JADX INFO: renamed from: p */
    public final QrCodeDisplayViewContents m10629p() {
        QrCodeDisplayViewContents qrCodeDisplayViewContents = this.viewContents_;
        return qrCodeDisplayViewContents == null ? QrCodeDisplayViewContents.m10630o() : qrCodeDisplayViewContents;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
