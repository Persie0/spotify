package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class td8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f219259a;

    /* JADX INFO: renamed from: b */
    public final int f219260b;

    public td8(String str, int i) {
        this.f219259a = str;
        this.f219260b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td8)) {
            return false;
        }
        td8 td8Var = (td8) obj;
        return wj50.m88271j(this.f219259a, td8Var.f219259a) && this.f219260b == td8Var.f219260b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219260b) + (this.f219259a.hashCode() * 31);
    }
}
