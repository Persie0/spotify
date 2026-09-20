package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wnd {

    /* JADX INFO: renamed from: a */
    public final String f253154a;

    public wnd(String str) {
        this.f253154a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnd) && wj50.m88271j(this.f253154a, ((wnd) obj).f253154a);
    }

    public final int hashCode() {
        return this.f253154a.hashCode();
    }
}
