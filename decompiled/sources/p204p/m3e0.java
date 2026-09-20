package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m3e0 {

    /* JADX INFO: renamed from: a */
    public final uem0 f139621a;

    public m3e0(uem0 uem0Var) {
        this.f139621a = uem0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3e0) && this.f139621a.equals(((m3e0) obj).f139621a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s571.m77245d(s571.m77245d(Integer.hashCode(this.f139621a.f229562a) * 31, 31, false), 31, false);
    }
}
