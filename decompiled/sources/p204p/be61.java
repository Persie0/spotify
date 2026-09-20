package p204p;

/* JADX INFO: loaded from: classes18.dex */
public final class be61 {

    /* JADX INFO: renamed from: a */
    public final int f26291a;

    /* JADX INFO: renamed from: b */
    public final int f26292b;

    /* JADX INFO: renamed from: c */
    public final String f26293c;

    public be61(int i, int i2, String str) {
        this.f26291a = i;
        this.f26292b = i2;
        this.f26293c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be61)) {
            return false;
        }
        be61 be61Var = (be61) obj;
        return this.f26291a == be61Var.f26291a && this.f26292b == be61Var.f26292b && wj50.m88271j(this.f26293c, be61Var.f26293c);
    }

    public final int hashCode() {
        return (((edb.m38547C(this.f26291a) * 31) + edb.m38547C(this.f26292b)) * 31) + this.f26293c.hashCode();
    }
}
