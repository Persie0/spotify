package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f981 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final String f67195a;

    /* JADX INFO: renamed from: b */
    public final String f67196b;

    /* JADX INFO: renamed from: c */
    public final boolean f67197c;

    /* JADX INFO: renamed from: d */
    public final d981 f67198d;

    public f981(String str, String str2, boolean z, d981 d981Var) {
        this.f67195a = str;
        this.f67196b = str2;
        this.f67197c = z;
        this.f67198d = d981Var;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f981)) {
            return false;
        }
        f981 f981Var = (f981) obj;
        return wj50.m88271j(this.f67195a, f981Var.f67195a) && wj50.m88271j(this.f67196b, f981Var.f67196b) && this.f67197c == f981Var.f67197c && wj50.m88271j(this.f67198d, f981Var.f67198d);
    }

    public final int hashCode() {
        return this.f67198d.hashCode() + s571.m77245d(s571.m77243b(this.f67195a.hashCode() * 31, 31, this.f67196b), 31, this.f67197c);
    }
}
