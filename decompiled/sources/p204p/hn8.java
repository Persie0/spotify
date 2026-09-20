package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hn8 {

    /* JADX INFO: renamed from: a */
    public final String f93232a;

    /* JADX INFO: renamed from: b */
    public final boolean f93233b;

    public hn8(String str, boolean z) {
        this.f93232a = str;
        this.f93233b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn8)) {
            return false;
        }
        hn8 hn8Var = (hn8) obj;
        return wj50.m88271j(this.f93232a, hn8Var.f93232a) && this.f93233b == hn8Var.f93233b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93233b) + (this.f93232a.hashCode() * 31);
    }
}
