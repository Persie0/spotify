package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vt2 implements fu2 {

    /* JADX INFO: renamed from: a */
    public final String f244533a;

    public vt2(String str) {
        this.f244533a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt2) && wj50.m88271j(this.f244533a, ((vt2) obj).f244533a);
    }

    public final int hashCode() {
        String str = this.f244533a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
