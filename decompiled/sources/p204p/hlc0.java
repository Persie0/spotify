package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hlc0 extends ilc0 {

    /* JADX INFO: renamed from: a */
    public final String f92668a;

    public hlc0(String str) {
        this.f92668a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlc0) && wj50.m88271j(this.f92668a, ((hlc0) obj).f92668a);
    }

    public final int hashCode() {
        return this.f92668a.hashCode();
    }
}
