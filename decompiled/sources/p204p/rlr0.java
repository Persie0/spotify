package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rlr0 extends tlr0 {

    /* JADX INFO: renamed from: a */
    public final String f200358a;

    public rlr0(String str) {
        this.f200358a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlr0) && wj50.m88271j(this.f200358a, ((rlr0) obj).f200358a);
    }

    public final int hashCode() {
        return this.f200358a.hashCode();
    }
}
