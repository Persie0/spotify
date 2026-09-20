package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ues0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f229598a;

    /* JADX INFO: renamed from: b */
    public final String f229599b;

    public ues0(String str, String str2) {
        this.f229598a = str;
        this.f229599b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ues0)) {
            return false;
        }
        ues0 ues0Var = (ues0) obj;
        return wj50.m88271j(this.f229598a, ues0Var.f229598a) && wj50.m88271j(this.f229599b, ues0Var.f229599b);
    }

    public final int hashCode() {
        return this.f229599b.hashCode() + (this.f229598a.hashCode() * 31);
    }
}
