package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e9j {

    /* JADX INFO: renamed from: a */
    public final int f57455a;

    /* JADX INFO: renamed from: b */
    public final h50 f57456b;

    public e9j(int i, h50 h50Var) {
        this.f57455a = i;
        this.f57456b = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9j)) {
            return false;
        }
        e9j e9jVar = (e9j) obj;
        return this.f57455a == e9jVar.f57455a && wj50.m88271j(this.f57456b, e9jVar.f57456b);
    }

    public final int hashCode() {
        return this.f57456b.hashCode() + (Integer.hashCode(this.f57455a) * 31);
    }
}
