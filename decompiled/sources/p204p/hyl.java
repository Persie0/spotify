package p204p;

import java.util.Locale;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes16.dex */
public final class hyl {

    /* JADX INFO: renamed from: a */
    public final String f96600a;

    /* JADX INFO: renamed from: b */
    public final int f96601b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f96602c;

    /* JADX INFO: renamed from: d */
    public final IvParameterSpec f96603d;

    public hyl(String str, byte[] bArr, byte[] bArr2) {
        this.f96600a = str;
        this.f96601b = bArr.length * 8;
        this.f96602c = new SecretKeySpec(bArr, str.toUpperCase(Locale.ROOT));
        this.f96603d = new IvParameterSpec(bArr2);
    }
}
