package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vg1 implements wg1 {

    /* JADX INFO: renamed from: a */
    public final String f241091a;

    public vg1(String str) {
        this.f241091a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg1) && wj50.m88271j(this.f241091a, ((vg1) obj).f241091a);
    }

    public final int hashCode() {
        return this.f241091a.hashCode();
    }
}
