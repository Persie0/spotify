package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class d4q {

    /* JADX INFO: renamed from: a */
    public final String f45227a;

    /* JADX INFO: renamed from: b */
    public final String f45228b;

    public d4q(String str, String str2) {
        this.f45227a = str;
        this.f45228b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4q)) {
            return false;
        }
        d4q d4qVar = (d4q) obj;
        return wj50.m88271j(this.f45227a, d4qVar.f45227a) && wj50.m88271j(this.f45228b, d4qVar.f45228b);
    }

    public final int hashCode() {
        return this.f45228b.hashCode() + (this.f45227a.hashCode() * 31);
    }
}
