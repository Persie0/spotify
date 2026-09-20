package p204p;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class zeg1 extends kv30 implements s9h1 {

    /* JADX INFO: renamed from: l */
    public final int f282036l;

    public zeg1(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        ig31.m50498p(bArr.length == 25);
        this.f282036l = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: d2 */
    public static byte[] m95983d2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            imk0 imk0Var = new imk0(mo29346c2());
            parcel2.writeNoException();
            gmf1.m45235b(parcel2, imk0Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f282036l);
        return true;
    }

    /* JADX INFO: renamed from: c2 */
    public abstract byte[] mo29346c2();

    public final boolean equals(Object obj) {
        if (!(obj instanceof s9h1)) {
            return false;
        }
        try {
            s9h1 s9h1Var = (s9h1) obj;
            if (((zeg1) s9h1Var).f282036l != this.f282036l) {
                return false;
            }
            return Arrays.equals(mo29346c2(), (byte[]) imk0.m51106d2(new imk0(((zeg1) s9h1Var).mo29346c2())));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.f282036l;
    }
}
