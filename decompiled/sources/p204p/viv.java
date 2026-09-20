package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class viv {

    /* JADX INFO: renamed from: a */
    public final String f241796a;

    public viv(String str) {
        this.f241796a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof viv) && wj50.m88271j(this.f241796a, ((viv) obj).f241796a);
    }

    public final int hashCode() {
        return this.f241796a.hashCode();
    }
}
