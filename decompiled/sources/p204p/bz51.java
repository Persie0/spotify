package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bz51 {

    /* JADX INFO: renamed from: a */
    public final String f32413a;

    /* JADX INFO: renamed from: b */
    public final String f32414b;

    public bz51(String str, String str2) {
        this.f32413a = str;
        this.f32414b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz51)) {
            return false;
        }
        bz51 bz51Var = (bz51) obj;
        return wj50.m88271j(this.f32413a, bz51Var.f32413a) && wj50.m88271j(this.f32414b, bz51Var.f32414b);
    }

    public final int hashCode() {
        return this.f32414b.hashCode() + (this.f32413a.hashCode() * 31);
    }
}
