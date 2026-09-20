package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m5a {

    /* JADX INFO: renamed from: a */
    public final int f140171a;

    /* JADX INFO: renamed from: b */
    public final u7a f140172b;

    public m5a(int i, u7a u7aVar) {
        this.f140171a = i;
        this.f140172b = u7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5a)) {
            return false;
        }
        m5a m5aVar = (m5a) obj;
        return this.f140171a == m5aVar.f140171a && wj50.m88271j(this.f140172b, m5aVar.f140172b);
    }

    public final int hashCode() {
        return this.f140172b.hashCode() + (Integer.hashCode(this.f140171a) * 31);
    }
}
