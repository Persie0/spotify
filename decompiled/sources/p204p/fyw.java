package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fyw extends f2x {

    /* JADX INFO: renamed from: a */
    public final String f74861a;

    public fyw(String str) {
        this.f74861a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyw) && wj50.m88271j(this.f74861a, ((fyw) obj).f74861a);
    }

    public final int hashCode() {
        return this.f74861a.hashCode();
    }
}
