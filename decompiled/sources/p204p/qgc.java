package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qgc {

    /* JADX INFO: renamed from: a */
    public final String f188437a;

    /* JADX INFO: renamed from: b */
    public final String f188438b;

    /* JADX INFO: renamed from: c */
    public final int f188439c;

    public qgc(String str, String str2, int i) {
        this.f188437a = str;
        this.f188438b = str2;
        this.f188439c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgc)) {
            return false;
        }
        qgc qgcVar = (qgc) obj;
        return wj50.m88271j(this.f188437a, qgcVar.f188437a) && wj50.m88271j(this.f188438b, qgcVar.f188438b) && this.f188439c == qgcVar.f188439c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188439c) + s571.m77243b(this.f188437a.hashCode() * 31, 31, this.f188438b);
    }
}
