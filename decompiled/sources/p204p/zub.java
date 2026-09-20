package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zub {

    /* JADX INFO: renamed from: a */
    public final yub f286399a;

    /* JADX INFO: renamed from: b */
    public final j15 f286400b;

    public zub(yub yubVar, j15 j15Var) {
        this.f286399a = yubVar;
        this.f286400b = j15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zub)) {
            return false;
        }
        zub zubVar = (zub) obj;
        return wj50.m88271j(this.f286399a, zubVar.f286399a) && wj50.m88271j(this.f286400b, zubVar.f286400b);
    }

    public final int hashCode() {
        return this.f286400b.hashCode() + (this.f286399a.hashCode() * 31);
    }
}
