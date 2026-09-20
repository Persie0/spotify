package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q660 implements r660 {

    /* JADX INFO: renamed from: a */
    public final String f185690a;

    /* JADX INFO: renamed from: b */
    public final String f185691b;

    /* JADX INFO: renamed from: c */
    public final String f185692c;

    /* JADX INFO: renamed from: d */
    public final String f185693d;

    public q660(String str, String str2, String str3, String str4) {
        this.f185690a = str;
        this.f185691b = str2;
        this.f185692c = str3;
        this.f185693d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q660)) {
            return false;
        }
        q660 q660Var = (q660) obj;
        return wj50.m88271j(this.f185690a, q660Var.f185690a) && wj50.m88271j(this.f185691b, q660Var.f185691b) && wj50.m88271j(this.f185692c, q660Var.f185692c) && wj50.m88271j(this.f185693d, q660Var.f185693d);
    }

    public final int hashCode() {
        return this.f185693d.hashCode() + s571.m77243b(s571.m77243b(this.f185690a.hashCode() * 31, 31, this.f185691b), 31, this.f185692c);
    }
}
