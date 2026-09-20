package p204p;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t28 {

    /* JADX INFO: renamed from: a */
    public final String f216447a;

    /* JADX INFO: renamed from: b */
    public final byte[] f216448b;

    /* JADX INFO: renamed from: c */
    public final ler0 f216449c;

    public t28(String str, byte[] bArr, ler0 ler0Var) {
        this.f216447a = str;
        this.f216448b = bArr;
        this.f216449c = ler0Var;
    }

    /* JADX INFO: renamed from: a */
    public static c06 m79891a() {
        c06 c06Var = new c06(13);
        c06Var.m31094K(ler0.f132669a);
        return c06Var;
    }

    /* JADX INFO: renamed from: b */
    public final t28 m79892b(ler0 ler0Var) {
        c06 c06VarM79891a = m79891a();
        c06VarM79891a.m31088E(this.f216447a);
        c06VarM79891a.m31094K(ler0Var);
        c06VarM79891a.m31091H(this.f216448b);
        return c06VarM79891a.m31099k();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t28) {
            t28 t28Var = (t28) obj;
            if (this.f216447a.equals(t28Var.f216447a) && Arrays.equals(this.f216448b, t28Var.f216448b) && this.f216449c.equals(t28Var.f216449c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f216447a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f216448b)) * 1000003) ^ this.f216449c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f216448b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f216447a);
        sb.append(", ");
        sb.append(this.f216449c);
        sb.append(", ");
        return dq60.m36616p(strEncodeToString, ")", sb);
    }
}
