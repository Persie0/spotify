package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class vme0 extends y85 implements Serializable {

    /* JADX INFO: renamed from: L0 */
    public final int f242795L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f242796M0;

    /* JADX INFO: renamed from: N0 */
    public final String f242797N0;

    /* JADX INFO: renamed from: Z */
    public final MessageDigest f242798Z;

    public vme0(String str, int i, String str2) {
        str2.getClass();
        this.f242797N0 = str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f242798Z = messageDigest;
            int digestLength = messageDigest.getDigestLength();
            boolean z = false;
            c95.m31841g("bytes (%s) must be >= 4 and < %s", i, digestLength, i >= 4 && i <= digestLength);
            this.f242795L0 = i;
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
            }
            this.f242796M0 = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final String toString() {
        return this.f242797N0;
    }

    @Override // p204p.y85
    /* JADX INFO: renamed from: w */
    public final c95 mo28837w() {
        boolean z = this.f242796M0;
        int i = this.f242795L0;
        MessageDigest messageDigest = this.f242798Z;
        if (z) {
            try {
                return new tme0((MessageDigest) messageDigest.clone(), i);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new tme0(MessageDigest.getInstance(messageDigest.getAlgorithm()), i);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public Object writeReplace() {
        return new ume0(this.f242798Z.getAlgorithm(), this.f242795L0, this.f242797N0);
    }

    public vme0(String str, String str2) {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f242798Z = messageDigest;
            this.f242795L0 = messageDigest.getDigestLength();
            this.f242797N0 = str2;
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.f242796M0 = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
