package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gqe {

    /* JADX INFO: renamed from: a */
    public final String f83455a;

    /* JADX INFO: renamed from: b */
    public final int f83456b;

    public gqe(String str, int i) {
        this.f83455a = str;
        this.f83456b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqe)) {
            return false;
        }
        gqe gqeVar = (gqe) obj;
        return this.f83455a.equals(gqeVar.f83455a) && this.f83456b == gqeVar.f83456b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f83456b) + (this.f83455a.hashCode() * 31);
    }
}
