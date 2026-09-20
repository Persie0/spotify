package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vgu0 implements ehu0 {

    /* JADX INFO: renamed from: a */
    public final String f241316a;

    public vgu0(String str) {
        this.f241316a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgu0) && wj50.m88271j(this.f241316a, ((vgu0) obj).f241316a);
    }

    public final int hashCode() {
        return this.f241316a.hashCode();
    }
}
