package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final String f77028a;

    public g6e1(String str) {
        this.f77028a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6e1) && wj50.m88271j(this.f77028a, ((g6e1) obj).f77028a);
    }

    public final int hashCode() {
        return this.f77028a.hashCode();
    }
}
