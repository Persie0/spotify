package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b171 {

    /* JADX INFO: renamed from: a */
    public final String f22237a;

    public b171(String str) {
        this.f22237a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b171) && wj50.m88271j(this.f22237a, ((b171) obj).f22237a);
    }

    public final int hashCode() {
        return edb.m38547C(3) + (this.f22237a.hashCode() * 31);
    }
}
