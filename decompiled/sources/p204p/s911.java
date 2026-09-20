package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s911 {

    /* JADX INFO: renamed from: a */
    public final t911 f206820a;

    /* JADX INFO: renamed from: b */
    public final String f206821b;

    public s911(t911 t911Var, String str) {
        this.f206820a = t911Var;
        this.f206821b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s911)) {
            return false;
        }
        s911 s911Var = (s911) obj;
        return wj50.m88271j(this.f206820a, s911Var.f206820a) && wj50.m88271j(this.f206821b, s911Var.f206821b);
    }

    public final int hashCode() {
        return this.f206821b.hashCode() + (this.f206820a.hashCode() * 31);
    }
}
