package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yeo0 {

    /* JADX INFO: renamed from: a */
    public final String f272026a;

    /* JADX INFO: renamed from: b */
    public final int f272027b;

    public yeo0(String str, int i) {
        this.f272026a = str;
        this.f272027b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeo0)) {
            return false;
        }
        yeo0 yeo0Var = (yeo0) obj;
        return wj50.m88271j(this.f272026a, yeo0Var.f272026a) && this.f272027b == yeo0Var.f272027b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f272027b) + (this.f272026a.hashCode() * 961);
    }
}
