package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jzc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f117685a;

    /* JADX INFO: renamed from: b */
    public final String f117686b;

    /* JADX INFO: renamed from: c */
    public final String f117687c;

    /* JADX INFO: renamed from: d */
    public final String f117688d;

    /* JADX INFO: renamed from: e */
    public final int f117689e;

    public jzc0(int i, String str, String str2, String str3, String str4) {
        this.f117685a = str;
        this.f117686b = str2;
        this.f117687c = str3;
        this.f117688d = str4;
        this.f117689e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzc0)) {
            return false;
        }
        jzc0 jzc0Var = (jzc0) obj;
        return wj50.m88271j(this.f117685a, jzc0Var.f117685a) && this.f117686b.equals(jzc0Var.f117686b) && wj50.m88271j(this.f117687c, jzc0Var.f117687c) && this.f117688d.equals(jzc0Var.f117688d) && this.f117689e == jzc0Var.f117689e;
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f117685a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f117689e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f117685a.hashCode() * 961, 31, this.f117686b), 31, this.f117687c), 31, this.f117688d);
    }
}
