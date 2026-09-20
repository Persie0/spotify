package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m4z implements o4z {

    /* JADX INFO: renamed from: a */
    public final i4z f140056a;

    /* JADX INFO: renamed from: b */
    public final j4z f140057b;

    public m4z(i4z i4zVar, j4z j4zVar) {
        this.f140056a = i4zVar;
        this.f140057b = j4zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4z)) {
            return false;
        }
        m4z m4zVar = (m4z) obj;
        return wj50.m88271j(this.f140056a, m4zVar.f140056a) && wj50.m88271j(this.f140057b, m4zVar.f140057b);
    }

    public final int hashCode() {
        return this.f140057b.hashCode() + (this.f140056a.hashCode() * 31);
    }
}
