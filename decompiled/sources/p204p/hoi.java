package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hoi {

    /* JADX INFO: renamed from: a */
    public final String f93544a;

    /* JADX INFO: renamed from: b */
    public final ioi f93545b;

    public hoi(String str, ioi ioiVar) {
        this.f93544a = str;
        this.f93545b = ioiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoi)) {
            return false;
        }
        hoi hoiVar = (hoi) obj;
        return wj50.m88271j(this.f93544a, hoiVar.f93544a) && wj50.m88271j(this.f93545b, hoiVar.f93545b);
    }

    public final int hashCode() {
        return this.f93545b.hashCode() + (this.f93544a.hashCode() * 31);
    }
}
