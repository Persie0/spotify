package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tp8 {

    /* JADX INFO: renamed from: a */
    public final String f222457a;

    /* JADX INFO: renamed from: b */
    public final yil f222458b;

    public tp8(String str, yil yilVar) {
        this.f222457a = str;
        this.f222458b = yilVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp8)) {
            return false;
        }
        tp8 tp8Var = (tp8) obj;
        return wj50.m88271j(this.f222457a, tp8Var.f222457a) && this.f222458b == tp8Var.f222458b;
    }

    public final int hashCode() {
        return this.f222458b.hashCode() + (this.f222457a.hashCode() * 31);
    }
}
