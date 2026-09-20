package p204p;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes4.dex */
public final class a7f1 {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f13039g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f13040h;

    /* JADX INFO: renamed from: a */
    public Integer f13041a = null;

    /* JADX INFO: renamed from: b */
    public BigInteger f13042b = f7f1.f66671g;

    /* JADX INFO: renamed from: c */
    public c7f1 f13043c = null;

    /* JADX INFO: renamed from: d */
    public c7f1 f13044d = null;

    /* JADX INFO: renamed from: e */
    public Integer f13045e = null;

    /* JADX INFO: renamed from: f */
    public d7f1 f13046f = d7f1.f46189f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f13039g = bigIntegerValueOf;
        f13040h = bigIntegerValueOf.pow(256);
    }

    /* JADX INFO: renamed from: a */
    public final void m24938a(int i) {
        this.f13041a = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public final void m24939b(int i) throws GeneralSecurityException {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.f13045e = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: c */
    public final f7f1 m24940c() throws GeneralSecurityException {
        Integer num = this.f13041a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f13042b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f13043c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f13044d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f13046f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f13045e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f13041a, 2048));
        }
        if (this.f13043c != this.f13044d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f13042b;
        int iCompareTo = bigInteger.compareTo(f7f1.f66671g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f13039g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f13040h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new f7f1(this.f13041a.intValue(), this.f13042b, this.f13046f, this.f13043c, this.f13044d, this.f13045e.intValue());
    }
}
