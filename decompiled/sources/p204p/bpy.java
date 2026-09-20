package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bpy implements epy {

    /* JADX INFO: renamed from: a */
    public final String f29622a;

    /* JADX INFO: renamed from: b */
    public final rly f29623b;

    public bpy(String str, rly rlyVar) {
        this.f29622a = str;
        this.f29623b = rlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpy)) {
            return false;
        }
        bpy bpyVar = (bpy) obj;
        return wj50.m88271j(this.f29622a, bpyVar.f29622a) && wj50.m88271j(this.f29623b, bpyVar.f29623b);
    }

    public final int hashCode() {
        return this.f29623b.hashCode() + (this.f29622a.hashCode() * 31);
    }
}
