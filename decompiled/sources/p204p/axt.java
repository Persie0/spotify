package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class axt implements cxt {

    /* JADX INFO: renamed from: a */
    public final siv0 f20990a;

    /* JADX INFO: renamed from: b */
    public final siv0 f20991b;

    public axt(siv0 siv0Var, siv0 siv0Var2) {
        this.f20990a = siv0Var;
        this.f20991b = siv0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axt)) {
            return false;
        }
        axt axtVar = (axt) obj;
        return wj50.m88271j(this.f20990a, axtVar.f20990a) && wj50.m88271j(this.f20991b, axtVar.f20991b);
    }

    public final int hashCode() {
        return this.f20991b.hashCode() + (this.f20990a.hashCode() * 31);
    }
}
