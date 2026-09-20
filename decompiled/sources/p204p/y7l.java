package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y7l {

    /* JADX INFO: renamed from: a */
    public final String f270101a;

    /* JADX INFO: renamed from: b */
    public final String f270102b;

    public y7l(String str, String str2) {
        this.f270101a = str;
        this.f270102b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m93003a() {
        return this.f270102b;
    }

    /* JADX INFO: renamed from: b */
    public final String m93004b() {
        return this.f270101a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7l)) {
            return false;
        }
        y7l y7lVar = (y7l) obj;
        return wj50.m88271j(this.f270101a, y7lVar.f270101a) && wj50.m88271j(this.f270102b, y7lVar.f270102b);
    }

    public final int hashCode() {
        return this.f270102b.hashCode() + (this.f270101a.hashCode() * 31);
    }
}
