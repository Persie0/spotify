package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class glb1 {

    /* JADX INFO: renamed from: a */
    public final String f81050a;

    /* JADX INFO: renamed from: b */
    public final String f81051b;

    /* JADX INFO: renamed from: c */
    public final String f81052c;

    public glb1(String str, String str2, String str3) {
        this.f81050a = str;
        this.f81051b = str2;
        this.f81052c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glb1)) {
            return false;
        }
        glb1 glb1Var = (glb1) obj;
        return wj50.m88271j(this.f81050a, glb1Var.f81050a) && wj50.m88271j(this.f81051b, glb1Var.f81051b) && wj50.m88271j(this.f81052c, glb1Var.f81052c);
    }

    public final int hashCode() {
        int iHashCode = this.f81050a.hashCode() * 31;
        String str = this.f81051b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81052c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
