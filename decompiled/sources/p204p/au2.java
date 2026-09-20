package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class au2 implements fu2 {

    /* JADX INFO: renamed from: a */
    public final String f19821a;

    /* JADX INFO: renamed from: b */
    public final String f19822b;

    public au2(String str, String str2) {
        this.f19821a = str;
        this.f19822b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au2)) {
            return false;
        }
        au2 au2Var = (au2) obj;
        return wj50.m88271j(this.f19821a, au2Var.f19821a) && wj50.m88271j(this.f19822b, au2Var.f19822b);
    }

    public final int hashCode() {
        return this.f19822b.hashCode() + (this.f19821a.hashCode() * 31);
    }
}
