package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vkb {

    /* JADX INFO: renamed from: a */
    public final String f242193a;

    /* JADX INFO: renamed from: b */
    public final String f242194b;

    public vkb(String str, String str2) {
        this.f242193a = str;
        this.f242194b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m85818a() {
        return this.f242194b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkb)) {
            return false;
        }
        vkb vkbVar = (vkb) obj;
        return wj50.m88271j(this.f242193a, vkbVar.f242193a) && wj50.m88271j(this.f242194b, vkbVar.f242194b);
    }

    public final int hashCode() {
        return this.f242194b.hashCode() + (this.f242193a.hashCode() * 31);
    }
}
