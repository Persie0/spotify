package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gsw implements k3x {

    /* JADX INFO: renamed from: a */
    public final String f84030a;

    /* JADX INFO: renamed from: b */
    public final String f84031b;

    public gsw(String str, String str2) {
        this.f84030a = str;
        this.f84031b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsw)) {
            return false;
        }
        gsw gswVar = (gsw) obj;
        return wj50.m88271j(this.f84030a, gswVar.f84030a) && wj50.m88271j(this.f84031b, gswVar.f84031b);
    }

    public final int hashCode() {
        return this.f84031b.hashCode() + (this.f84030a.hashCode() * 31);
    }
}
