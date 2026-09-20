package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hw2 {

    /* JADX INFO: renamed from: a */
    public final String f95836a;

    /* JADX INFO: renamed from: b */
    public final String f95837b;

    /* JADX INFO: renamed from: c */
    public final String f95838c;

    /* JADX INFO: renamed from: d */
    public final wzk f95839d;

    public hw2(String str, String str2, String str3, wzk wzkVar) {
        this.f95836a = str;
        this.f95837b = str2;
        this.f95838c = str3;
        this.f95839d = wzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw2)) {
            return false;
        }
        hw2 hw2Var = (hw2) obj;
        return wj50.m88271j(this.f95836a, hw2Var.f95836a) && wj50.m88271j(this.f95837b, hw2Var.f95837b) && wj50.m88271j(this.f95838c, hw2Var.f95838c) && wj50.m88271j(this.f95839d, hw2Var.f95839d);
    }

    public final int hashCode() {
        return this.f95839d.hashCode() + s571.m77243b(s571.m77243b(this.f95836a.hashCode() * 31, 31, this.f95837b), 31, this.f95838c);
    }
}
