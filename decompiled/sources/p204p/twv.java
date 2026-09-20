package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class twv {

    /* JADX INFO: renamed from: a */
    public final wwv f224483a;

    /* JADX INFO: renamed from: b */
    public final ywv f224484b;

    /* JADX INFO: renamed from: c */
    public final boolean f224485c;

    public twv(wwv wwvVar, ywv ywvVar, xwv xwvVar, boolean z) {
        this.f224483a = wwvVar;
        this.f224484b = ywvVar;
        this.f224485c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twv)) {
            return false;
        }
        twv twvVar = (twv) obj;
        return this.f224483a.equals(twvVar.f224483a) && this.f224484b == twvVar.f224484b && wj50.m88271j(null, null) && this.f224485c == twvVar.f224485c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224485c) + ((vwv.f245557a.hashCode() + ((this.f224484b.hashCode() + (this.f224483a.hashCode() * 31)) * 31)) * 961);
    }
}
