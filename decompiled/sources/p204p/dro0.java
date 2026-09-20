package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dro0 implements fro0 {

    /* JADX INFO: renamed from: a */
    public final String f52369a;

    /* JADX INFO: renamed from: b */
    public final String f52370b;

    public dro0(String str, String str2) {
        this.f52369a = str;
        this.f52370b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dro0)) {
            return false;
        }
        dro0 dro0Var = (dro0) obj;
        return wj50.m88271j(this.f52369a, dro0Var.f52369a) && wj50.m88271j(this.f52370b, dro0Var.f52370b);
    }

    public final int hashCode() {
        return this.f52370b.hashCode() + (this.f52369a.hashCode() * 31);
    }
}
