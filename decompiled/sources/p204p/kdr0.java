package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kdr0 {

    /* JADX INFO: renamed from: a */
    public final String f121726a;

    /* JADX INFO: renamed from: b */
    public final String f121727b;

    /* JADX INFO: renamed from: c */
    public final Float f121728c;

    public kdr0(String str, String str2, Float f) {
        this.f121726a = str;
        this.f121727b = str2;
        this.f121728c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdr0)) {
            return false;
        }
        kdr0 kdr0Var = (kdr0) obj;
        return wj50.m88271j(this.f121726a, kdr0Var.f121726a) && wj50.m88271j(this.f121727b, kdr0Var.f121727b) && wj50.m88271j(this.f121728c, kdr0Var.f121728c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f121726a.hashCode() * 31, 31, this.f121727b);
        Float f = this.f121728c;
        return iM77243b + (f == null ? 0 : f.hashCode());
    }
}
