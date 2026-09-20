package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pcd implements rcd {

    /* JADX INFO: renamed from: a */
    public final String f176047a;

    public pcd(String str) {
        this.f176047a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcd) && wj50.m88271j(this.f176047a, ((pcd) obj).f176047a);
    }

    public final int hashCode() {
        return this.f176047a.hashCode();
    }
}
