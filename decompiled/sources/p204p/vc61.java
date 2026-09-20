package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vc61 {

    /* JADX INFO: renamed from: a */
    public final int f240065a;

    /* JADX INFO: renamed from: b */
    public final qvp f240066b;

    /* JADX INFO: renamed from: c */
    public final eh00 f240067c;

    public vc61(int i, qvp qvpVar, eh00 eh00Var) {
        this.f240065a = i;
        this.f240066b = qvpVar;
        this.f240067c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc61)) {
            return false;
        }
        vc61 vc61Var = (vc61) obj;
        return this.f240065a == vc61Var.f240065a && wj50.m88271j(this.f240066b, vc61Var.f240066b) && wj50.m88271j(this.f240067c, vc61Var.f240067c);
    }

    public final int hashCode() {
        return this.f240067c.hashCode() + ((this.f240066b.hashCode() + (Integer.hashCode(this.f240065a) * 31)) * 31);
    }

    public /* synthetic */ vc61(int i, qvp qvpVar) {
        this(i, qvpVar, uv51.f234344L0);
    }
}
