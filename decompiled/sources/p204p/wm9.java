package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class wm9 {
    public static final um9 Companion = new um9();

    /* JADX INFO: renamed from: a */
    public final String f252758a;

    /* JADX INFO: renamed from: b */
    public final String f252759b;

    public /* synthetic */ wm9(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f252758a = null;
        } else {
            this.f252758a = str;
        }
        if ((i & 2) == 0) {
            this.f252759b = null;
        } else {
            this.f252759b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm9)) {
            return false;
        }
        wm9 wm9Var = (wm9) obj;
        return wj50.m88271j(this.f252758a, wm9Var.f252758a) && wj50.m88271j(this.f252759b, wm9Var.f252759b);
    }

    public final int hashCode() {
        String str = this.f252758a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f252759b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
