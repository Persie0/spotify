package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vvk {

    /* JADX INFO: renamed from: a */
    public final int f245242a;

    /* JADX INFO: renamed from: b */
    public final int f245243b;

    /* JADX INFO: renamed from: c */
    public final int f245244c;

    /* JADX INFO: renamed from: d */
    public final int f245245d;

    public vvk(int i, int i2, int i3, int i4) {
        this.f245242a = i;
        this.f245243b = i2;
        this.f245244c = i3;
        this.f245245d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvk)) {
            return false;
        }
        vvk vvkVar = (vvk) obj;
        return this.f245242a == vvkVar.f245242a && this.f245243b == vvkVar.f245243b && this.f245244c == vvkVar.f245244c && this.f245245d == vvkVar.f245245d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245245d) + mt60.m62800g(this.f245244c, mt60.m62800g(this.f245243b, Integer.hashCode(this.f245242a) * 31, 31), 31);
    }
}
