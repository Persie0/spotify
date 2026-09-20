package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gdk {

    /* JADX INFO: renamed from: a */
    public final qtb f78887a;

    /* JADX INFO: renamed from: b */
    public final Object f78888b;

    public gdk(qtb qtbVar, Object obj) {
        this.f78887a = qtbVar;
        this.f78888b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdk)) {
            return false;
        }
        gdk gdkVar = (gdk) obj;
        return wj50.m88271j(this.f78887a, gdkVar.f78887a) && wj50.m88271j(this.f78888b, gdkVar.f78888b);
    }

    public final int hashCode() {
        return s6x0.m77349b(this.f78888b) + (this.f78887a.f192355a.hashCode() * 31);
    }
}
