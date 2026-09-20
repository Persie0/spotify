package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class stf {

    /* JADX INFO: renamed from: a */
    public final String f213899a;

    /* JADX INFO: renamed from: b */
    public final String f213900b;

    public stf(String str, String str2) {
        this.f213899a = str;
        this.f213900b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m79240a() {
        return this.f213899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stf)) {
            return false;
        }
        stf stfVar = (stf) obj;
        return wj50.m88271j(this.f213899a, stfVar.f213899a) && wj50.m88271j(this.f213900b, stfVar.f213900b);
    }

    public final int hashCode() {
        return this.f213900b.hashCode() + (this.f213899a.hashCode() * 31);
    }
}
