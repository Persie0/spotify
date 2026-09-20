package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class te80 implements xe80 {

    /* JADX INFO: renamed from: a */
    public final String f219599a;

    /* JADX INFO: renamed from: b */
    public final int f219600b;

    public te80(String str, int i) {
        this.f219599a = str;
        this.f219600b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te80)) {
            return false;
        }
        te80 te80Var = (te80) obj;
        return wj50.m88271j(this.f219599a, te80Var.f219599a) && this.f219600b == te80Var.f219600b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219600b) + (this.f219599a.hashCode() * 31);
    }
}
