package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class s2m implements zmt {

    /* JADX INFO: renamed from: a */
    public final String f205030a;

    /* JADX INFO: renamed from: b */
    public final boolean f205031b;

    public s2m(String str, boolean z) {
        this.f205030a = str;
        this.f205031b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2m)) {
            return false;
        }
        s2m s2mVar = (s2m) obj;
        return wj50.m88271j(this.f205030a, s2mVar.f205030a) && this.f205031b == s2mVar.f205031b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205031b) + (this.f205030a.hashCode() * 31);
    }
}
