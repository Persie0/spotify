package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fxw implements i2x {

    /* JADX INFO: renamed from: a */
    public final String f74472a;

    public fxw(String str) {
        this.f74472a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxw) && wj50.m88271j(this.f74472a, ((fxw) obj).f74472a);
    }

    public final int hashCode() {
        return this.f74472a.hashCode();
    }
}
