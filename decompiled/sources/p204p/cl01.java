package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cl01 extends fl01 {

    /* JADX INFO: renamed from: a */
    public final String f39143a;

    public cl01(String str) {
        this.f39143a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl01) && wj50.m88271j(this.f39143a, ((cl01) obj).f39143a);
    }

    public final int hashCode() {
        return this.f39143a.hashCode();
    }
}
