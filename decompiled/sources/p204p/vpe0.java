package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vpe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f243677a;

    public vpe0(String str) {
        this.f243677a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpe0) && wj50.m88271j(this.f243677a, ((vpe0) obj).f243677a);
    }

    public final int hashCode() {
        return this.f243677a.hashCode();
    }
}
