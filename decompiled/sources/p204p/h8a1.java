package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h8a1 implements j8a1 {

    /* JADX INFO: renamed from: a */
    public final String f88668a;

    public h8a1(String str) {
        this.f88668a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8a1) && wj50.m88271j(this.f88668a, ((h8a1) obj).f88668a);
    }

    public final int hashCode() {
        return this.f88668a.hashCode();
    }
}
