package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dms extends gms {

    /* JADX INFO: renamed from: a */
    public final String f50607a;

    public dms(String str) {
        this.f50607a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dms) && wj50.m88271j(this.f50607a, ((dms) obj).f50607a);
    }

    public final int hashCode() {
        return this.f50607a.hashCode();
    }
}
