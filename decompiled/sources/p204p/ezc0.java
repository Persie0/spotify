package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ezc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f64331a;

    /* JADX INFO: renamed from: b */
    public final String f64332b;

    /* JADX INFO: renamed from: c */
    public final String f64333c;

    /* JADX INFO: renamed from: d */
    public final boolean f64334d;

    public ezc0(String str, String str2, String str3, boolean z) {
        this.f64331a = str;
        this.f64332b = str2;
        this.f64333c = str3;
        this.f64334d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezc0)) {
            return false;
        }
        ezc0 ezc0Var = (ezc0) obj;
        return wj50.m88271j(this.f64331a, ezc0Var.f64331a) && this.f64332b.equals(ezc0Var.f64332b) && wj50.m88271j(this.f64333c, ezc0Var.f64333c) && this.f64334d == ezc0Var.f64334d;
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f64331a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64334d) + s571.m77243b(s571.m77243b(this.f64331a.hashCode() * 961, 31, this.f64332b), 31, this.f64333c);
    }
}
