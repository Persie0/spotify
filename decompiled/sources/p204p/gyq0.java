package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gyq0 {

    /* JADX INFO: renamed from: a */
    public final String f85689a;

    /* JADX INFO: renamed from: b */
    public final String f85690b;

    public gyq0(String str, String str2) {
        this.f85689a = str;
        this.f85690b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyq0)) {
            return false;
        }
        gyq0 gyq0Var = (gyq0) obj;
        return wj50.m88271j(this.f85689a, gyq0Var.f85689a) && wj50.m88271j(this.f85690b, gyq0Var.f85690b);
    }

    public final int hashCode() {
        return this.f85690b.hashCode() + (this.f85689a.hashCode() * 31);
    }
}
