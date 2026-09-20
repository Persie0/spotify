package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vu71 implements xu71 {

    /* JADX INFO: renamed from: a */
    public final String f244882a;

    public vu71(String str) {
        this.f244882a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu71) && wj50.m88271j(this.f244882a, ((vu71) obj).f244882a);
    }

    public final int hashCode() {
        return this.f244882a.hashCode();
    }
}
