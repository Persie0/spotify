package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vqb1 extends arb1 {

    /* JADX INFO: renamed from: a */
    public final String f243920a;

    public vqb1(String str) {
        this.f243920a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqb1) && wj50.m88271j(this.f243920a, ((vqb1) obj).f243920a);
    }

    public final int hashCode() {
        return this.f243920a.hashCode();
    }
}
