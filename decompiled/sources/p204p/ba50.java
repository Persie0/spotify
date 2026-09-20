package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ba50 {

    /* JADX INFO: renamed from: a */
    public final String f25092a;

    /* JADX INFO: renamed from: b */
    public final boolean f25093b;

    /* JADX INFO: renamed from: c */
    public final boolean f25094c;

    public ba50(String str, boolean z, boolean z2) {
        this.f25092a = str;
        this.f25093b = z;
        this.f25094c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba50)) {
            return false;
        }
        ba50 ba50Var = (ba50) obj;
        return wj50.m88271j(this.f25092a, ba50Var.f25092a) && this.f25093b == ba50Var.f25093b && this.f25094c == ba50Var.f25094c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25094c) + s571.m77245d(this.f25092a.hashCode() * 31, 31, this.f25093b);
    }
}
