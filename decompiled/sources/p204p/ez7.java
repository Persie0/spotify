package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ez7 extends k3l {

    /* JADX INFO: renamed from: a */
    public final String f64292a;

    /* JADX INFO: renamed from: b */
    public final byte[] f64293b;

    public ez7(String str, byte[] bArr) {
        this.f64292a = str;
        this.f64293b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k3l) {
            k3l k3lVar = (k3l) obj;
            ez7 ez7Var = (ez7) k3lVar;
            if (this.f64292a.equals(ez7Var.f64292a)) {
                if (Arrays.equals(this.f64293b, k3lVar instanceof ez7 ? ((ez7) k3lVar).f64293b : ez7Var.f64293b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f64292a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f64293b);
    }

    public final String toString() {
        return "File{filename=" + this.f64292a + ", contents=" + Arrays.toString(this.f64293b) + "}";
    }
}
