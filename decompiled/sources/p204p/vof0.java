package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final String f243474a;

    public vof0(String str) {
        this.f243474a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vof0) && wj50.m88271j(this.f243474a, ((vof0) obj).f243474a);
    }

    public final int hashCode() {
        String str = this.f243474a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
