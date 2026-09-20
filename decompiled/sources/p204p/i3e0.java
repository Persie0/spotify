package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i3e0 extends j3e0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f98162a;

    /* JADX INFO: renamed from: b */
    public final String f98163b;

    /* JADX INFO: renamed from: c */
    public final b250 f98164c;

    public i3e0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f98162a = ezs0Var;
        this.f98163b = str;
        this.f98164c = b250Var;
    }

    @Override // p204p.j3e0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo46522a() {
        return this.f98162a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3e0)) {
            return false;
        }
        i3e0 i3e0Var = (i3e0) obj;
        return wj50.m88271j(this.f98162a, i3e0Var.f98162a) && wj50.m88271j(this.f98163b, i3e0Var.f98163b) && wj50.m88271j(this.f98164c, i3e0Var.f98164c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f98163b;
    }

    public final int hashCode() {
        return this.f98164c.hashCode() + s571.m77243b(this.f98162a.hashCode() * 31, 31, this.f98163b);
    }
}
