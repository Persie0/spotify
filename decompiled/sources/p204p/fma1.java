package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fma1 implements gma1 {

    /* JADX INFO: renamed from: a */
    public final String f71002a;

    public fma1(String str) {
        this.f71002a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fma1) && wj50.m88271j(this.f71002a, ((fma1) obj).f71002a);
    }

    public final int hashCode() {
        return this.f71002a.hashCode();
    }
}
