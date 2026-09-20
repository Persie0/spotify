package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sol {

    /* JADX INFO: renamed from: a */
    public final String f211207a;

    /* JADX INFO: renamed from: b */
    public final String f211208b;

    public sol(String str, String str2) {
        this.f211207a = str;
        this.f211208b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sol)) {
            return false;
        }
        sol solVar = (sol) obj;
        return wj50.m88271j(this.f211207a, solVar.f211207a) && wj50.m88271j(this.f211208b, solVar.f211208b);
    }

    public final int hashCode() {
        return this.f211208b.hashCode() + (this.f211207a.hashCode() * 31);
    }
}
