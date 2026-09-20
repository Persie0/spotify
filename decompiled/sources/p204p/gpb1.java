package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gpb1 extends jpb1 {

    /* JADX INFO: renamed from: a */
    public final String f83160a;

    /* JADX INFO: renamed from: b */
    public final String f83161b;

    /* JADX INFO: renamed from: c */
    public final psj f83162c;

    public gpb1(String str, String str2, psj psjVar) {
        this.f83160a = str;
        this.f83161b = str2;
        this.f83162c = psjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpb1)) {
            return false;
        }
        gpb1 gpb1Var = (gpb1) obj;
        return wj50.m88271j(this.f83160a, gpb1Var.f83160a) && wj50.m88271j(this.f83161b, gpb1Var.f83161b) && this.f83162c == gpb1Var.f83162c;
    }

    public final int hashCode() {
        return this.f83162c.hashCode() + s571.m77243b(this.f83160a.hashCode() * 31, 31, this.f83161b);
    }
}
