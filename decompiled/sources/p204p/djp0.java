package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class djp0 {

    /* JADX INFO: renamed from: a */
    public final String f49716a;

    /* JADX INFO: renamed from: b */
    public final String f49717b;

    /* JADX INFO: renamed from: c */
    public final String f49718c;

    public djp0(String str, String str2, String str3) {
        this.f49716a = str;
        this.f49717b = str2;
        this.f49718c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djp0)) {
            return false;
        }
        djp0 djp0Var = (djp0) obj;
        if (!this.f49716a.equals(djp0Var.f49716a) || !this.f49717b.equals(djp0Var.f49717b) || !this.f49718c.equals(djp0Var.f49718c)) {
            return false;
        }
        Object obj2 = fby.f67936Z0;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return fby.f67936Z0.hashCode() + s571.m77243b(s571.m77243b(this.f49716a.hashCode() * 31, 31, this.f49717b), 961, this.f49718c);
    }
}
