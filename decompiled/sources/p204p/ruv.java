package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ruv {

    /* JADX INFO: renamed from: a */
    public final String f202915a;

    /* JADX INFO: renamed from: b */
    public final mgz0 f202916b;

    /* JADX INFO: renamed from: c */
    public final mgz0 f202917c;

    public ruv(String str, mgz0 mgz0Var, mgz0 mgz0Var2) {
        this.f202915a = str;
        this.f202916b = mgz0Var;
        this.f202917c = mgz0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final String m76460a() {
        return this.f202915a;
    }

    /* JADX INFO: renamed from: b */
    public final mgz0 m76461b() {
        return this.f202916b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruv)) {
            return false;
        }
        ruv ruvVar = (ruv) obj;
        return wj50.m88271j(this.f202915a, ruvVar.f202915a) && wj50.m88271j(this.f202916b, ruvVar.f202916b) && wj50.m88271j(this.f202917c, ruvVar.f202917c);
    }

    public final int hashCode() {
        return this.f202917c.hashCode() + ((this.f202916b.hashCode() + (this.f202915a.hashCode() * 31)) * 31);
    }
}
