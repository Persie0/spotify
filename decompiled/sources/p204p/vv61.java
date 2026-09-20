package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vv61 implements xv61 {

    /* JADX INFO: renamed from: a */
    public final String f245158a;

    public vv61(String str) {
        this.f245158a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv61) && wj50.m88271j(this.f245158a, ((vv61) obj).f245158a);
    }

    public final int hashCode() {
        return this.f245158a.hashCode();
    }
}
