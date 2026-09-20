package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class igi0 {

    /* JADX INFO: renamed from: a */
    public final String f101995a;

    public igi0(String str) {
        this.f101995a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igi0) && wj50.m88271j(this.f101995a, ((igi0) obj).f101995a);
    }

    public final int hashCode() {
        return this.f101995a.hashCode();
    }
}
