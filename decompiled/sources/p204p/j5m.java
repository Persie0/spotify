package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class j5m {

    /* JADX INFO: renamed from: a */
    public final String f109002a;

    /* JADX INFO: renamed from: b */
    public final String f109003b;

    /* JADX INFO: renamed from: c */
    public final String f109004c;

    public j5m(String str, String str2, String str3) {
        this.f109002a = str;
        this.f109003b = str2;
        this.f109004c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5m)) {
            return false;
        }
        j5m j5mVar = (j5m) obj;
        return wj50.m88271j(this.f109002a, j5mVar.f109002a) && wj50.m88271j(this.f109003b, j5mVar.f109003b) && wj50.m88271j(this.f109004c, j5mVar.f109004c);
    }

    public final int hashCode() {
        return this.f109004c.hashCode() + s571.m77243b(this.f109002a.hashCode() * 31, 31, this.f109003b);
    }
}
