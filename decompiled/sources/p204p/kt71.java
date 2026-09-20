package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kt71 implements mt71 {

    /* JADX INFO: renamed from: a */
    public final String f126174a;

    public kt71(String str) {
        this.f126174a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt71) && wj50.m88271j(this.f126174a, ((kt71) obj).f126174a);
    }

    public final int hashCode() {
        return this.f126174a.hashCode();
    }
}
