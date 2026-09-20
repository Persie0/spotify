package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rk91 {

    /* JADX INFO: renamed from: a */
    public final String f200037a;

    public /* synthetic */ rk91(String str) {
        this.f200037a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rk91) {
            return wj50.m88271j(this.f200037a, ((rk91) obj).f200037a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f200037a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("TriggerType(name=", this.f200037a, ")");
    }
}
