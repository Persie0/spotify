package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w7c {

    /* JADX INFO: renamed from: a */
    public final h8c f248633a;

    /* JADX INFO: renamed from: b */
    public final qf40 f248634b;

    public w7c(h8c h8cVar, AbstractC2524w8 abstractC2524w8) {
        this.f248633a = h8cVar;
        this.f248634b = abstractC2524w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7c)) {
            return false;
        }
        w7c w7cVar = (w7c) obj;
        return wj50.m88271j(this.f248633a, w7cVar.f248633a) && wj50.m88271j(this.f248634b, w7cVar.f248634b);
    }

    public final int hashCode() {
        return this.f248634b.hashCode() + (this.f248633a.hashCode() * 31);
    }
}
