package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vlk {

    /* JADX INFO: renamed from: a */
    public final String f242537a;

    public vlk(String str) {
        this.f242537a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlk) && wj50.m88271j(this.f242537a, ((vlk) obj).f242537a);
    }

    public final int hashCode() {
        return this.f242537a.hashCode();
    }
}
