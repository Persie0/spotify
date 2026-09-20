package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i350 {

    /* JADX INFO: renamed from: a */
    public final String f98035a;

    /* JADX INFO: renamed from: b */
    public final String f98036b;

    /* JADX INFO: renamed from: c */
    public final String f98037c;

    public i350(String str, String str2, String str3) {
        this.f98035a = str;
        this.f98036b = str2;
        this.f98037c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i350)) {
            return false;
        }
        i350 i350Var = (i350) obj;
        return wj50.m88271j(this.f98035a, i350Var.f98035a) && wj50.m88271j(this.f98036b, i350Var.f98036b) && wj50.m88271j(this.f98037c, i350Var.f98037c);
    }

    public final int hashCode() {
        return this.f98037c.hashCode() + s571.m77243b(this.f98035a.hashCode() * 31, 31, this.f98036b);
    }
}
