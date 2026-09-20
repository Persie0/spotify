package p204p;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class wm7 {
    public static final vm7 Companion = new vm7();

    /* JADX INFO: renamed from: a */
    public final String f252746a;

    /* JADX INFO: renamed from: b */
    public final String f252747b;

    /* JADX INFO: renamed from: c */
    public final String f252748c;

    public /* synthetic */ wm7(String str, String str2, int i, String str3) {
        if ((i & 1) == 0) {
            this.f252746a = null;
        } else {
            this.f252746a = str;
        }
        if ((i & 2) == 0) {
            this.f252747b = null;
        } else {
            this.f252747b = str2;
        }
        if ((i & 4) == 0) {
            this.f252748c = null;
        } else {
            this.f252748c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm7)) {
            return false;
        }
        wm7 wm7Var = (wm7) obj;
        return wj50.m88271j(this.f252746a, wm7Var.f252746a) && wj50.m88271j(this.f252747b, wm7Var.f252747b) && wj50.m88271j(this.f252748c, wm7Var.f252748c);
    }

    public final int hashCode() {
        String str = this.f252746a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f252747b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f252748c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public wm7(String str, String str2, String str3) {
        this.f252746a = str;
        this.f252747b = str2;
        this.f252748c = str3;
    }
}
