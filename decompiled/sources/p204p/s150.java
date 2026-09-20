package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class s150 {

    /* JADX INFO: renamed from: a */
    public final int f204600a;

    /* JADX INFO: renamed from: b */
    public final String f204601b;

    /* JADX INFO: renamed from: c */
    public final String f204602c;

    public s150(int i, String str, String str2) {
        this.f204600a = i;
        this.f204601b = str;
        this.f204602c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m76915a() {
        return this.f204602c;
    }

    /* JADX INFO: renamed from: b */
    public final String m76916b() {
        return this.f204601b;
    }

    /* JADX INFO: renamed from: c */
    public final int m76917c() {
        return this.f204600a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s150)) {
            return false;
        }
        s150 s150Var = (s150) obj;
        return this.f204600a == s150Var.f204600a && wj50.m88271j(this.f204601b, s150Var.f204601b) && wj50.m88271j(this.f204602c, s150Var.f204602c);
    }

    public final int hashCode() {
        return this.f204602c.hashCode() + s571.m77243b(Integer.hashCode(this.f204600a) * 31, 31, this.f204601b);
    }
}
