package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pvf {

    /* JADX INFO: renamed from: a */
    public final int f181732a;

    /* JADX INFO: renamed from: b */
    public final Integer f181733b;

    /* JADX INFO: renamed from: c */
    public final g4a f181734c;

    public pvf(int i, Integer num, g4a g4aVar) {
        this.f181732a = i;
        this.f181733b = num;
        this.f181734c = g4aVar;
    }

    /* JADX INFO: renamed from: a */
    public final g4a m71143a() {
        return this.f181734c;
    }

    /* JADX INFO: renamed from: b */
    public final int m71144b() {
        return this.f181732a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvf)) {
            return false;
        }
        pvf pvfVar = (pvf) obj;
        return this.f181732a == pvfVar.f181732a && wj50.m88271j(this.f181733b, pvfVar.f181733b) && wj50.m88271j(this.f181734c, pvfVar.f181734c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f181732a) * 31;
        Integer num = this.f181733b;
        return this.f181734c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
