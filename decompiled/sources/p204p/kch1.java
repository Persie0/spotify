package p204p;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes4.dex */
public final class kch1 {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f121485e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f121486f;

    /* JADX INFO: renamed from: a */
    public Integer f121487a = null;

    /* JADX INFO: renamed from: b */
    public BigInteger f121488b = pch1.f176107e;

    /* JADX INFO: renamed from: c */
    public mch1 f121489c = null;

    /* JADX INFO: renamed from: d */
    public nch1 f121490d = nch1.f152520f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f121485e = bigIntegerValueOf;
        f121486f = bigIntegerValueOf.pow(256);
    }

    /* JADX INFO: renamed from: a */
    public final void m56052a(int i) {
        this.f121487a = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public final pch1 m56053b() {
        Integer num = this.f121487a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f121488b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f121489c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f121490d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f121487a));
        }
        BigInteger bigInteger = this.f121488b;
        int iCompareTo = bigInteger.compareTo(pch1.f176107e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f121485e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f121486f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new pch1(this.f121487a.intValue(), this.f121488b, this.f121490d, this.f121489c);
    }
}
