package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v6k {

    /* JADX INFO: renamed from: a */
    public final u6k f237913a;

    /* JADX INFO: renamed from: b */
    public final t6k f237914b;

    public v6k(u6k u6kVar, t6k t6kVar) {
        this.f237913a = u6kVar;
        this.f237914b = t6kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6k)) {
            return false;
        }
        v6k v6kVar = (v6k) obj;
        return wj50.m88271j(this.f237913a, v6kVar.f237913a) && wj50.m88271j(this.f237914b, v6kVar.f237914b);
    }

    public final int hashCode() {
        u6k u6kVar = this.f237913a;
        return this.f237914b.f217569a.hashCode() + ((u6kVar == null ? 0 : u6kVar.hashCode()) * 31);
    }
}
