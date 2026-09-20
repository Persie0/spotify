package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qp6 implements sp6 {

    /* JADX INFO: renamed from: a */
    public final String f191143a;

    public qp6(String str) {
        this.f191143a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m73430a() {
        return this.f191143a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp6) && wj50.m88271j(this.f191143a, ((qp6) obj).f191143a);
    }

    public final int hashCode() {
        String str = this.f191143a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
