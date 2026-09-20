package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ia1 {

    /* JADX INFO: renamed from: a */
    public final String f100119a;

    /* JADX INFO: renamed from: b */
    public final k1n0 f100120b;

    public ia1(String str, k1n0 k1n0Var) {
        this.f100119a = str;
        this.f100120b = k1n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia1)) {
            return false;
        }
        ia1 ia1Var = (ia1) obj;
        return wj50.m88271j(this.f100119a, ia1Var.f100119a) && this.f100120b == ia1Var.f100120b;
    }

    public final int hashCode() {
        return this.f100120b.hashCode() + (this.f100119a.hashCode() * 31);
    }
}
