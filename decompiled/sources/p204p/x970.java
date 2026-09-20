package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x970 {

    /* JADX INFO: renamed from: a */
    public final String f259287a;

    /* JADX INFO: renamed from: b */
    public final n6f f259288b;

    /* JADX INFO: renamed from: c */
    public final n6f f259289c;

    /* JADX INFO: renamed from: d */
    public final String f259290d;

    public x970(String str, n6f n6fVar, n6f n6fVar2, String str2) {
        this.f259287a = str;
        this.f259288b = n6fVar;
        this.f259289c = n6fVar2;
        this.f259290d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x970)) {
            return false;
        }
        x970 x970Var = (x970) obj;
        return wj50.m88271j(this.f259287a, x970Var.f259287a) && wj50.m88271j(this.f259288b, x970Var.f259288b) && wj50.m88271j(this.f259289c, x970Var.f259289c) && wj50.m88271j(this.f259290d, x970Var.f259290d);
    }

    public final int hashCode() {
        int iHashCode = this.f259287a.hashCode() * 31;
        n6f n6fVar = this.f259288b;
        int iHashCode2 = (iHashCode + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31;
        n6f n6fVar2 = this.f259289c;
        return this.f259290d.hashCode() + ((iHashCode2 + (n6fVar2 != null ? Long.hashCode(n6fVar2.f150873a) : 0)) * 31);
    }
}
