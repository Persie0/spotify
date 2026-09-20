package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v3z0 extends w3z0 {

    /* JADX INFO: renamed from: d */
    public final String f236992d;

    public v3z0(String str) {
        this.f236992d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3z0) && wj50.m88271j(this.f236992d, ((v3z0) obj).f236992d);
    }

    public final int hashCode() {
        return this.f236992d.hashCode();
    }
}
