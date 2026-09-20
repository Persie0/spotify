package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final String f50798a;

    public dnf0(String str) {
        this.f50798a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnf0) && wj50.m88271j(this.f50798a, ((dnf0) obj).f50798a);
    }

    public final int hashCode() {
        return this.f50798a.hashCode();
    }
}
