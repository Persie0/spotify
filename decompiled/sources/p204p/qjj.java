package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qjj implements kkj {

    /* JADX INFO: renamed from: a */
    public final String f189253a;

    /* JADX INFO: renamed from: b */
    public final String f189254b;

    public qjj(String str, String str2) {
        this.f189253a = str;
        this.f189254b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjj)) {
            return false;
        }
        qjj qjjVar = (qjj) obj;
        return wj50.m88271j(this.f189253a, qjjVar.f189253a) && wj50.m88271j(this.f189254b, qjjVar.f189254b);
    }

    public final int hashCode() {
        return this.f189254b.hashCode() + (this.f189253a.hashCode() * 31);
    }
}
