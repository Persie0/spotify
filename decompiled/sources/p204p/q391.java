package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q391 {

    /* JADX INFO: renamed from: a */
    public final int f184822a;

    /* JADX INFO: renamed from: b */
    public final String f184823b;

    public q391(int i, String str) {
        this.f184822a = i;
        this.f184823b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q391)) {
            return false;
        }
        q391 q391Var = (q391) obj;
        return this.f184822a == q391Var.f184822a && wj50.m88271j(this.f184823b, q391Var.f184823b);
    }

    public final int hashCode() {
        return this.f184823b.hashCode() + (Integer.hashCode(this.f184822a) * 31);
    }
}
