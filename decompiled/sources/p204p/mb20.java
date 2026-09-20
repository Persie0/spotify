package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mb20 implements ob20 {

    /* JADX INFO: renamed from: a */
    public final Exception f141766a;

    public mb20(Exception exc) {
        this.f141766a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb20) && this.f141766a.equals(((mb20) obj).f141766a);
    }

    public final int hashCode() {
        return this.f141766a.hashCode();
    }
}
