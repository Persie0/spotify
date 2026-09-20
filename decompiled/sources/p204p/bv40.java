package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class bv40 {

    /* JADX INFO: renamed from: a */
    public final zu40 f31273a;

    public bv40(zu40 zu40Var) {
        this.f31273a = zu40Var;
    }

    /* JADX INFO: renamed from: a */
    public static bv40 m30585a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new bv40(new av40(obj)) : new bv40(new zu40(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bv40)) {
            return false;
        }
        return this.f31273a.equals(((bv40) obj).f31273a);
    }

    public final int hashCode() {
        return this.f31273a.hashCode();
    }

    public final String toString() {
        return this.f31273a.toString();
    }
}
