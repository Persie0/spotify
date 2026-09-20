package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hdv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final String f90235a;

    /* JADX INFO: renamed from: b */
    public final String f90236b;

    public hdv0(String str, String str2) {
        this.f90235a = str;
        this.f90236b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdv0)) {
            return false;
        }
        hdv0 hdv0Var = (hdv0) obj;
        return wj50.m88271j(this.f90235a, hdv0Var.f90235a) && wj50.m88271j(this.f90236b, hdv0Var.f90236b);
    }

    public final int hashCode() {
        return this.f90236b.hashCode() + (this.f90235a.hashCode() * 31);
    }
}
