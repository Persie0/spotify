package p204p;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public final class szg1 extends ftf1 implements Serializable {

    /* JADX INFO: renamed from: c */
    public final MessageDigest f215592c;

    /* JADX INFO: renamed from: d */
    public final int f215593d;

    /* JADX INFO: renamed from: e */
    public final boolean f215594e;

    /* JADX INFO: renamed from: f */
    public final String f215595f;

    public szg1() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f215592c = messageDigest;
            this.f215593d = messageDigest.getDigestLength();
            this.f215595f = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.f215594e = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.f215595f;
    }
}
