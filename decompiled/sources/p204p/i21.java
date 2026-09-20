package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i21 extends k21 {

    /* JADX INFO: renamed from: a */
    public final String f97689a;

    public i21(String str) {
        this.f97689a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i21) && wj50.m88271j(this.f97689a, ((i21) obj).f97689a);
    }

    public final int hashCode() {
        return this.f97689a.hashCode();
    }
}
