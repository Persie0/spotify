package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f240349a;

    public vd8(String str) {
        this.f240349a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd8) && wj50.m88271j(this.f240349a, ((vd8) obj).f240349a);
    }

    public final int hashCode() {
        return this.f240349a.hashCode();
    }
}
