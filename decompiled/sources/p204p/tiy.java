package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tiy {

    /* JADX INFO: renamed from: a */
    public final String f220763a;

    /* JADX INFO: renamed from: b */
    public final String f220764b;

    public tiy(String str, String str2) {
        this.f220763a = str;
        this.f220764b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m80942a() {
        return this.f220763a;
    }

    /* JADX INFO: renamed from: b */
    public final String m80943b() {
        return this.f220764b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tiy)) {
            return false;
        }
        tiy tiyVar = (tiy) obj;
        return wj50.m88271j(this.f220763a, tiyVar.f220763a) && wj50.m88271j(this.f220764b, tiyVar.f220764b);
    }

    public final int hashCode() {
        return this.f220764b.hashCode() + (this.f220763a.hashCode() * 31);
    }
}
