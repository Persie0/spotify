package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f92682a;

    /* JADX INFO: renamed from: b */
    public final String f92683b;

    public hlf(String str, String str2) {
        this.f92682a = str;
        this.f92683b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlf)) {
            return false;
        }
        hlf hlfVar = (hlf) obj;
        return wj50.m88271j(this.f92682a, hlfVar.f92682a) && wj50.m88271j(this.f92683b, hlfVar.f92683b);
    }

    public final int hashCode() {
        return this.f92683b.hashCode() + (this.f92682a.hashCode() * 31);
    }
}
