package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j690 {

    /* JADX INFO: renamed from: a */
    public final String f109255a;

    /* JADX INFO: renamed from: b */
    public final mb61 f109256b;

    /* JADX WARN: Multi-variable type inference failed */
    public j690(String str, gh00 gh00Var) {
        this.f109255a = str;
        this.f109256b = (mb61) gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j690)) {
            return false;
        }
        j690 j690Var = (j690) obj;
        return wj50.m88271j(this.f109255a, j690Var.f109255a) && this.f109256b.equals(j690Var.f109256b);
    }

    public final int hashCode() {
        return this.f109256b.hashCode() + (this.f109255a.hashCode() * 31);
    }
}
