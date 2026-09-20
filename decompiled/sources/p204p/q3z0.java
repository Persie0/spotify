package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q3z0 extends w3z0 {

    /* JADX INFO: renamed from: d */
    public final String f185009d;

    public q3z0(String str) {
        this.f185009d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3z0) && wj50.m88271j(this.f185009d, ((q3z0) obj).f185009d);
    }

    public final int hashCode() {
        return this.f185009d.hashCode();
    }
}
