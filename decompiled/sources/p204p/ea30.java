package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ea30 implements fa30 {

    /* JADX INFO: renamed from: a */
    public final String f57574a;

    public ea30(String str) {
        this.f57574a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea30) && wj50.m88271j(this.f57574a, ((ea30) obj).f57574a);
    }

    public final int hashCode() {
        return this.f57574a.hashCode();
    }
}
