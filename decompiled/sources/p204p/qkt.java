package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qkt implements xmt {

    /* JADX INFO: renamed from: a */
    public final String f189640a;

    /* JADX INFO: renamed from: b */
    public final String f189641b;

    /* JADX INFO: renamed from: c */
    public final Throwable f189642c;

    public qkt(String str, String str2, Throwable th) {
        this.f189640a = str;
        this.f189641b = str2;
        this.f189642c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkt)) {
            return false;
        }
        qkt qktVar = (qkt) obj;
        return wj50.m88271j(this.f189640a, qktVar.f189640a) && wj50.m88271j(this.f189641b, qktVar.f189641b) && wj50.m88271j(this.f189642c, qktVar.f189642c);
    }

    public final int hashCode() {
        return this.f189642c.hashCode() + s571.m77243b(this.f189640a.hashCode() * 31, 31, this.f189641b);
    }
}
