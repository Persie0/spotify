package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class url0 extends l4k0 {

    /* JADX INFO: renamed from: a */
    public final String f233400a;

    /* JADX INFO: renamed from: b */
    public final boolean f233401b;

    public url0(String str, boolean z) {
        this.f233400a = str;
        this.f233401b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof url0)) {
            return false;
        }
        url0 url0Var = (url0) obj;
        return wj50.m88271j(this.f233400a, url0Var.f233400a) && this.f233401b == url0Var.f233401b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233401b) + (this.f233400a.hashCode() * 31);
    }
}
