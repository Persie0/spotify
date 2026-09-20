package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class raw {

    /* JADX INFO: renamed from: a */
    public final String f197395a;

    /* JADX INFO: renamed from: b */
    public final int f197396b;

    public raw(String str, int i) {
        this.f197395a = str;
        this.f197396b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raw)) {
            return false;
        }
        raw rawVar = (raw) obj;
        return this.f197395a.equals(rawVar.f197395a) && this.f197396b == rawVar.f197396b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f197396b) + (this.f197395a.hashCode() * 31);
    }
}
