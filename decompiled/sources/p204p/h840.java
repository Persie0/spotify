package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h840 implements l840 {

    /* JADX INFO: renamed from: a */
    public final m740 f88616a;

    /* JADX INFO: renamed from: b */
    public final String f88617b;

    public h840(m740 m740Var, String str) {
        this.f88616a = m740Var;
        this.f88617b = str;
    }

    @Override // p204p.l840
    /* JADX INFO: renamed from: a */
    public final String mo43945a() {
        return this.f88617b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h840)) {
            return false;
        }
        h840 h840Var = (h840) obj;
        return wj50.m88271j(this.f88616a, h840Var.f88616a) && wj50.m88271j(this.f88617b, h840Var.f88617b);
    }

    public final int hashCode() {
        return this.f88617b.hashCode() + (this.f88616a.hashCode() * 31);
    }
}
