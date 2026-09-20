package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lvr extends mvr {

    /* JADX INFO: renamed from: a */
    public final String f137379a;

    public lvr(String str) {
        this.f137379a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvr) && wj50.m88271j(this.f137379a, ((lvr) obj).f137379a);
    }

    public final int hashCode() {
        return this.f137379a.hashCode();
    }
}
