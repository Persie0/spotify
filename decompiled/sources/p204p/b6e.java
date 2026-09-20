package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b6e {

    /* JADX INFO: renamed from: a */
    public final String f23944a;

    /* JADX INFO: renamed from: b */
    public final String f23945b;

    public b6e(String str, String str2) {
        this.f23944a = str;
        this.f23945b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6e)) {
            return false;
        }
        b6e b6eVar = (b6e) obj;
        return wj50.m88271j(this.f23944a, b6eVar.f23944a) && wj50.m88271j(this.f23945b, b6eVar.f23945b);
    }

    public final int hashCode() {
        return this.f23945b.hashCode() + (this.f23944a.hashCode() * 31);
    }
}
