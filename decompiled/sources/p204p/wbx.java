package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wbx extends gcx {

    /* JADX INFO: renamed from: a */
    public final String f249875a;

    public wbx(String str) {
        this.f249875a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbx) && wj50.m88271j(this.f249875a, ((wbx) obj).f249875a);
    }

    public final int hashCode() {
        return this.f249875a.hashCode();
    }
}
