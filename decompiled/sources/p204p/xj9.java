package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xj9 {

    /* JADX INFO: renamed from: a */
    public final String f262071a;

    /* JADX INFO: renamed from: b */
    public final String f262072b;

    /* JADX INFO: renamed from: c */
    public final int f262073c;

    public xj9(String str, String str2, int i) {
        this.f262071a = str;
        this.f262072b = str2;
        this.f262073c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj9)) {
            return false;
        }
        xj9 xj9Var = (xj9) obj;
        return wj50.m88271j(this.f262071a, xj9Var.f262071a) && wj50.m88271j(this.f262072b, xj9Var.f262072b) && this.f262073c == xj9Var.f262073c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f262073c) + s571.m77243b(this.f262071a.hashCode() * 31, 31, this.f262072b);
    }
}
