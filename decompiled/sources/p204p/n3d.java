package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n3d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f150007a;

    public n3d(String str) {
        this.f150007a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3d) && wj50.m88271j(this.f150007a, ((n3d) obj).f150007a);
    }

    public final int hashCode() {
        return this.f150007a.hashCode() * 31;
    }
}
