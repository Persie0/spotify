package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z6b implements c7b {

    /* JADX INFO: renamed from: a */
    public final String f279818a;

    /* JADX INFO: renamed from: b */
    public final int f279819b;

    public z6b(String str, int i) {
        this.f279818a = str;
        this.f279819b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6b)) {
            return false;
        }
        z6b z6bVar = (z6b) obj;
        return wj50.m88271j(this.f279818a, z6bVar.f279818a) && this.f279819b == z6bVar.f279819b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f279819b) + (this.f279818a.hashCode() * 31);
    }
}
