package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a6e {

    /* JADX INFO: renamed from: a */
    public final String f12778a;

    /* JADX INFO: renamed from: b */
    public final String f12779b;

    public a6e(String str, String str2) {
        this.f12778a = str;
        this.f12779b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6e)) {
            return false;
        }
        a6e a6eVar = (a6e) obj;
        return wj50.m88271j(this.f12778a, a6eVar.f12778a) && wj50.m88271j(this.f12779b, a6eVar.f12779b);
    }

    public final int hashCode() {
        return this.f12779b.hashCode() + (this.f12778a.hashCode() * 31);
    }
}
