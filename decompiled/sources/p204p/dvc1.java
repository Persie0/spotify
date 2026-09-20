package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dvc1 {

    /* JADX INFO: renamed from: a */
    public final String f53420a;

    /* JADX INFO: renamed from: b */
    public final boolean f53421b;

    /* JADX INFO: renamed from: c */
    public final boolean f53422c;

    public dvc1(String str, boolean z, boolean z2) {
        this.f53420a = str;
        this.f53421b = z;
        this.f53422c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvc1)) {
            return false;
        }
        dvc1 dvc1Var = (dvc1) obj;
        return wj50.m88271j(this.f53420a, dvc1Var.f53420a) && this.f53421b == dvc1Var.f53421b && this.f53422c == dvc1Var.f53422c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53422c) + s571.m77245d(this.f53420a.hashCode() * 31, 31, this.f53421b);
    }
}
