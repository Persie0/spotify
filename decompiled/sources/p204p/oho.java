package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oho implements qho {

    /* JADX INFO: renamed from: a */
    public final Object f165512a;

    /* JADX INFO: renamed from: b */
    public final Integer f165513b;

    public oho(Object obj, Integer num) {
        this.f165512a = obj;
        this.f165513b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oho)) {
            return false;
        }
        oho ohoVar = (oho) obj;
        return wj50.m88271j(this.f165512a, ohoVar.f165512a) && wj50.m88271j(this.f165513b, ohoVar.f165513b);
    }

    public final int hashCode() {
        Object obj = this.f165512a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.f165513b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
