package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class voe0 extends ape0 {

    /* JADX INFO: renamed from: a */
    public final String f243463a;

    public voe0(String str) {
        this.f243463a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof voe0) && wj50.m88271j(this.f243463a, ((voe0) obj).f243463a);
    }

    public final int hashCode() {
        String str = this.f243463a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
