package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class npt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final String f157069a;

    public npt0(String str) {
        this.f157069a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npt0) && wj50.m88271j(this.f157069a, ((npt0) obj).f157069a);
    }

    public final int hashCode() {
        return this.f157069a.hashCode();
    }
}
