package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qcc extends scc {

    /* JADX INFO: renamed from: a */
    public final String f187299a;

    /* JADX INFO: renamed from: b */
    public final String f187300b;

    public qcc(String str, String str2) {
        this.f187299a = str;
        this.f187300b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcc)) {
            return false;
        }
        qcc qccVar = (qcc) obj;
        return wj50.m88271j(this.f187299a, qccVar.f187299a) && wj50.m88271j(this.f187300b, qccVar.f187300b);
    }

    public final int hashCode() {
        return this.f187300b.hashCode() + (this.f187299a.hashCode() * 31);
    }
}
