package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class i3c1 extends l3c1 {

    /* JADX INFO: renamed from: a */
    public final int f98132a;

    /* JADX INFO: renamed from: b */
    public final String f98133b;

    public i3c1(int i, String str) {
        this.f98132a = i;
        this.f98133b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3c1)) {
            return false;
        }
        i3c1 i3c1Var = (i3c1) obj;
        return this.f98132a == i3c1Var.f98132a && wj50.m88271j(this.f98133b, i3c1Var.f98133b);
    }

    public final int hashCode() {
        return this.f98133b.hashCode() + (Integer.hashCode(this.f98132a) * 31);
    }
}
