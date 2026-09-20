package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dqd implements fqd {

    /* JADX INFO: renamed from: a */
    public final String f51969a;

    public dqd(String str) {
        this.f51969a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqd) && wj50.m88271j(this.f51969a, ((dqd) obj).f51969a);
    }

    public final int hashCode() {
        return this.f51969a.hashCode();
    }
}
