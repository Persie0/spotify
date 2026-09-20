package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class c2d0 {
    public static final b2d0 Companion = new b2d0();

    /* JADX INFO: renamed from: a */
    public final String f33359a;

    /* JADX INFO: renamed from: b */
    public final String f33360b;

    public /* synthetic */ c2d0(int i, String str, String str2) {
        this.f33359a = (i & 1) == 0 ? "ANDROID" : str;
        if ((i & 2) == 0) {
            this.f33360b = null;
        } else {
            this.f33360b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2d0)) {
            return false;
        }
        c2d0 c2d0Var = (c2d0) obj;
        return wj50.m88271j(this.f33359a, c2d0Var.f33359a) && wj50.m88271j(this.f33360b, c2d0Var.f33360b);
    }

    public final int hashCode() {
        int iHashCode = this.f33359a.hashCode() * 31;
        String str = this.f33360b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public c2d0(String str) {
        this.f33359a = "ANDROID";
        this.f33360b = str;
    }
}
