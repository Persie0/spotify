package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dqx {

    /* JADX INFO: renamed from: a */
    public final String f52101a;

    /* JADX INFO: renamed from: b */
    public final Class f52102b;

    /* JADX INFO: renamed from: c */
    public final boolean f52103c;

    public dqx(String str, Class cls, boolean z) {
        this.f52101a = str;
        this.f52102b = cls;
        this.f52103c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqx)) {
            return false;
        }
        dqx dqxVar = (dqx) obj;
        return wj50.m88271j(this.f52101a, dqxVar.f52101a) && wj50.m88271j(this.f52102b, dqxVar.f52102b) && this.f52103c == dqxVar.f52103c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52103c) + ((this.f52102b.hashCode() + (this.f52101a.hashCode() * 31)) * 31);
    }
}
