package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f218250a;

    public t9d(String str) {
        this.f218250a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9d) && wj50.m88271j(this.f218250a, ((t9d) obj).f218250a);
    }

    public final int hashCode() {
        return this.f218250a.hashCode();
    }
}
