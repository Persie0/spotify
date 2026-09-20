package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ezk {

    /* JADX INFO: renamed from: a */
    public final boolean f64406a;

    /* JADX INFO: renamed from: b */
    public final String f64407b;

    public ezk(boolean z, String str) {
        this.f64406a = z;
        this.f64407b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezk)) {
            return false;
        }
        ezk ezkVar = (ezk) obj;
        return this.f64406a == ezkVar.f64406a && wj50.m88271j(this.f64407b, ezkVar.f64407b);
    }

    public final int hashCode() {
        return this.f64407b.hashCode() + (Boolean.hashCode(this.f64406a) * 31);
    }
}
