package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rsv {

    /* JADX INFO: renamed from: a */
    public final String f202441a;

    public rsv(String str) {
        this.f202441a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsv) && wj50.m88271j(this.f202441a, ((rsv) obj).f202441a);
    }

    public final int hashCode() {
        return this.f202441a.hashCode();
    }
}
