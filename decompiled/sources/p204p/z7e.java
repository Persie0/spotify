package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final String f280182a;

    public z7e(String str) {
        this.f280182a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7e) && wj50.m88271j(this.f280182a, ((z7e) obj).f280182a);
    }

    public final int hashCode() {
        return this.f280182a.hashCode();
    }
}
