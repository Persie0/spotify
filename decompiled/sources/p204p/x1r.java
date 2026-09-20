package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x1r extends z1r {

    /* JADX INFO: renamed from: a */
    public final String f257257a;

    /* JADX INFO: renamed from: b */
    public final String f257258b;

    /* JADX INFO: renamed from: c */
    public final String f257259c;

    /* JADX INFO: renamed from: d */
    public final String f257260d;

    public x1r(String str, String str2, String str3, String str4) {
        this.f257257a = str;
        this.f257258b = str2;
        this.f257259c = str3;
        this.f257260d = str4;
    }

    @Override // p204p.z1r
    /* JADX INFO: renamed from: a */
    public final String mo89689a() {
        return this.f257260d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1r)) {
            return false;
        }
        x1r x1rVar = (x1r) obj;
        return wj50.m88271j(this.f257257a, x1rVar.f257257a) && wj50.m88271j(this.f257258b, x1rVar.f257258b) && wj50.m88271j(this.f257259c, x1rVar.f257259c) && wj50.m88271j(this.f257260d, x1rVar.f257260d);
    }

    public final int hashCode() {
        return this.f257260d.hashCode() + s571.m77243b(s571.m77243b(this.f257257a.hashCode() * 31, 31, this.f257258b), 31, this.f257259c);
    }
}
