package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zv81 {

    /* JADX INFO: renamed from: a */
    public final d0w f286657a;

    public zv81(d0w d0wVar) {
        this.f286657a = d0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv81) && wj50.m88271j(this.f286657a, ((zv81) obj).f286657a);
    }

    public final int hashCode() {
        d0w d0wVar = this.f286657a;
        if (d0wVar == null) {
            return 0;
        }
        return d0wVar.hashCode();
    }
}
