package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d9z {

    /* JADX INFO: renamed from: a */
    public final String f46935a;

    /* JADX INFO: renamed from: b */
    public final rim0 f46936b;

    public d9z(String str, rim0 rim0Var) {
        this.f46935a = str;
        this.f46936b = rim0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9z)) {
            return false;
        }
        d9z d9zVar = (d9z) obj;
        return wj50.m88271j(this.f46935a, d9zVar.f46935a) && wj50.m88271j(this.f46936b, d9zVar.f46936b);
    }

    public final int hashCode() {
        return this.f46936b.hashCode() + (this.f46935a.hashCode() * 31);
    }
}
