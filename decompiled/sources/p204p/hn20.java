package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hn20 extends ln20 {

    /* JADX INFO: renamed from: a */
    public final int f93154a;

    /* JADX INFO: renamed from: b */
    public final String f93155b;

    /* JADX INFO: renamed from: c */
    public final boolean f93156c;

    /* JADX INFO: renamed from: d */
    public final String f93157d;

    public hn20(String str, int i, String str2, boolean z) {
        this.f93154a = i;
        this.f93155b = str;
        this.f93156c = z;
        this.f93157d = str2;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: a */
    public final String mo45287a() {
        return this.f93157d;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: b */
    public final jn20 mo45288b() {
        return jn20.f113989a;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: c */
    public final String mo45289c() {
        return this.f93155b;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: d */
    public final boolean mo45290d() {
        return this.f93156c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn20)) {
            return false;
        }
        hn20 hn20Var = (hn20) obj;
        return this.f93154a == hn20Var.f93154a && this.f93155b.equals(hn20Var.f93155b) && this.f93156c == hn20Var.f93156c && wj50.m88271j(this.f93157d, hn20Var.f93157d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(Integer.hashCode(this.f93154a) * 31, 31, this.f93155b), 31, this.f93156c);
        String str = this.f93157d;
        return jn20.f113989a.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
