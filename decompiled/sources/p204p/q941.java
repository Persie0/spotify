package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q941 {

    /* JADX INFO: renamed from: a */
    public final String f186490a;

    /* JADX INFO: renamed from: b */
    public final String f186491b;

    /* JADX INFO: renamed from: c */
    public final String f186492c;

    public q941(String str, String str2, String str3) {
        this.f186490a = str;
        this.f186491b = str2;
        this.f186492c = str3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q941)) {
            return false;
        }
        q941 q941Var = (q941) obj;
        String str = q941Var.f186490a;
        String str2 = this.f186490a;
        if (str2 == null) {
            if (str == null) {
                zM88271j = true;
            } else {
                zM88271j = false;
            }
        } else if (str == null) {
            zM88271j = false;
        } else {
            zM88271j = wj50.m88271j(str2, str);
        }
        return zM88271j && wj50.m88271j(this.f186491b, q941Var.f186491b) && wj50.m88271j(this.f186492c, q941Var.f186492c);
    }

    public final int hashCode() {
        String str = this.f186490a;
        return this.f186492c.hashCode() + s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f186491b);
    }
}
