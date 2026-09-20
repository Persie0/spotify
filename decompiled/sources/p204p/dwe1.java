package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dwe1 extends nwe1 {

    /* JADX INFO: renamed from: a */
    public final String f53686a;

    public dwe1(String str) {
        this.f53686a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwe1) && wj50.m88271j(this.f53686a, ((dwe1) obj).f53686a);
    }

    public final int hashCode() {
        return this.f53686a.hashCode();
    }
}
