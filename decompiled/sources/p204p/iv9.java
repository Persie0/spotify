package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iv9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final String f106174a;

    public iv9(String str) {
        this.f106174a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv9) && wj50.m88271j(this.f106174a, ((iv9) obj).f106174a);
    }

    public final int hashCode() {
        return this.f106174a.hashCode();
    }
}
