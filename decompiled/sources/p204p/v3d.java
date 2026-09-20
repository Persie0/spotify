package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v3d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f236830a;

    public v3d(String str) {
        this.f236830a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3d) && wj50.m88271j(this.f236830a, ((v3d) obj).f236830a);
    }

    public final int hashCode() {
        return this.f236830a.hashCode();
    }
}
