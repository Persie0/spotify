package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class poq {

    /* JADX INFO: renamed from: a */
    public final String f179745a;

    /* JADX INFO: renamed from: b */
    public final int f179746b;

    /* JADX INFO: renamed from: c */
    public final cpq f179747c;

    /* JADX INFO: renamed from: d */
    public final boolean f179748d;

    public poq(String str, int i, cpq cpqVar, boolean z) {
        this.f179745a = str;
        this.f179746b = i;
        this.f179747c = cpqVar;
        this.f179748d = z;
    }

    /* JADX INFO: renamed from: a */
    public static poq m70489a(poq poqVar, boolean z) {
        String str = poqVar.f179745a;
        int i = poqVar.f179746b;
        cpq cpqVar = poqVar.f179747c;
        poqVar.getClass();
        return new poq(str, i, cpqVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poq)) {
            return false;
        }
        poq poqVar = (poq) obj;
        return wj50.m88271j(this.f179745a, poqVar.f179745a) && this.f179746b == poqVar.f179746b && wj50.m88271j(this.f179747c, poqVar.f179747c) && this.f179748d == poqVar.f179748d;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f179746b, this.f179745a.hashCode() * 31, 31);
        cpq cpqVar = this.f179747c;
        return Boolean.hashCode(this.f179748d) + ((iM40938f + (cpqVar == null ? 0 : cpqVar.hashCode())) * 31);
    }
}
