package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ax60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public final String f20772a;

    public ax60(String str) {
        this.f20772a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax60) && wj50.m88271j(this.f20772a, ((ax60) obj).f20772a);
    }

    public final int hashCode() {
        return this.f20772a.hashCode();
    }
}
