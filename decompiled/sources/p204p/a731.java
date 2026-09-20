package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a731 {

    /* JADX INFO: renamed from: a */
    public final String f12936a;

    /* JADX INFO: renamed from: b */
    public final int f12937b;

    public a731(String str, int i) {
        this.f12936a = str;
        this.f12937b = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m24884a() {
        return this.f12936a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a731.class != obj.getClass()) {
            return false;
        }
        a731 a731Var = (a731) obj;
        return wj50.m88271j(this.f12936a, a731Var.f12936a) && this.f12937b == a731Var.f12937b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f12937b) + s571.m77245d(this.f12936a.hashCode() * 961, 31, false);
    }
}
