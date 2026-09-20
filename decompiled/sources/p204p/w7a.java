package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w7a {

    /* JADX INFO: renamed from: a */
    public final String f248615a;

    /* JADX INFO: renamed from: b */
    public final String f248616b;

    public w7a(String str, String str2) {
        this.f248615a = str;
        this.f248616b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7a)) {
            return false;
        }
        w7a w7aVar = (w7a) obj;
        return wj50.m88271j(this.f248615a, w7aVar.f248615a) && wj50.m88271j(this.f248616b, w7aVar.f248616b);
    }

    public final int hashCode() {
        return this.f248616b.hashCode() + (this.f248615a.hashCode() * 31);
    }
}
