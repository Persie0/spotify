package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ur80 implements ds80 {

    /* JADX INFO: renamed from: a */
    public final bs80 f233275a;

    /* JADX INFO: renamed from: b */
    public final sp80 f233276b;

    public ur80(bs80 bs80Var, sp80 sp80Var) {
        this.f233275a = bs80Var;
        this.f233276b = sp80Var;
    }

    @Override // p204p.ds80
    /* JADX INFO: renamed from: a */
    public final bs80 mo33758a() {
        return this.f233275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur80)) {
            return false;
        }
        ur80 ur80Var = (ur80) obj;
        return wj50.m88271j(this.f233275a, ur80Var.f233275a) && wj50.m88271j(this.f233276b, ur80Var.f233276b);
    }

    public final int hashCode() {
        return this.f233276b.hashCode() + (this.f233275a.hashCode() * 31);
    }
}
