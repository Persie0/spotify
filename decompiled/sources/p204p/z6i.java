package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z6i extends b7i {

    /* JADX INFO: renamed from: a */
    public final String f279915a;

    /* JADX INFO: renamed from: b */
    public final String f279916b;

    public z6i(String str, String str2) {
        this.f279915a = str;
        this.f279916b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6i)) {
            return false;
        }
        z6i z6iVar = (z6i) obj;
        return wj50.m88271j(this.f279915a, z6iVar.f279915a) && wj50.m88271j(this.f279916b, z6iVar.f279916b);
    }

    public final int hashCode() {
        return this.f279916b.hashCode() + (this.f279915a.hashCode() * 31);
    }
}
