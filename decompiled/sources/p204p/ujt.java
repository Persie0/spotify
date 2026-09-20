package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ujt {

    /* JADX INFO: renamed from: a */
    public final String f231115a;

    /* JADX INFO: renamed from: b */
    public final boolean f231116b;

    public ujt(String str, boolean z) {
        this.f231115a = str;
        this.f231116b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujt)) {
            return false;
        }
        ujt ujtVar = (ujt) obj;
        return wj50.m88271j(this.f231115a, ujtVar.f231115a) && this.f231116b == ujtVar.f231116b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231116b) + (this.f231115a.hashCode() * 31);
    }
}
