package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yx40 {

    /* JADX INFO: renamed from: a */
    public final nx40 f277129a;

    /* JADX INFO: renamed from: b */
    public final String f277130b;

    /* JADX INFO: renamed from: c */
    public final String f277131c;

    /* JADX INFO: renamed from: d */
    public final String f277132d;

    /* JADX INFO: renamed from: e */
    public final n6f f277133e;

    /* JADX INFO: renamed from: f */
    public final n6f f277134f;

    public yx40(nx40 nx40Var, String str, String str2, String str3, n6f n6fVar, n6f n6fVar2) {
        this.f277129a = nx40Var;
        this.f277130b = str;
        this.f277131c = str2;
        this.f277132d = str3;
        this.f277133e = n6fVar;
        this.f277134f = n6fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx40)) {
            return false;
        }
        yx40 yx40Var = (yx40) obj;
        return wj50.m88271j(this.f277129a, yx40Var.f277129a) && wj50.m88271j(this.f277130b, yx40Var.f277130b) && wj50.m88271j(this.f277131c, yx40Var.f277131c) && wj50.m88271j(this.f277132d, yx40Var.f277132d) && wj50.m88271j(this.f277133e, yx40Var.f277133e) && wj50.m88271j(this.f277134f, yx40Var.f277134f);
    }

    public final int hashCode() {
        int iHashCode = this.f277129a.hashCode() * 31;
        String str = this.f277130b;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f277131c);
        String str2 = this.f277132d;
        int iHashCode2 = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        n6f n6fVar = this.f277133e;
        int iHashCode3 = (iHashCode2 + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31;
        n6f n6fVar2 = this.f277134f;
        return iHashCode3 + (n6fVar2 != null ? Long.hashCode(n6fVar2.f150873a) : 0);
    }
}
