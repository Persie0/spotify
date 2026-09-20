package com.google.android.play.core.splitinstall.internal;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes4.dex */
final class zzg extends zzh {
    private final byte[] zza;

    public zzg(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzh, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
