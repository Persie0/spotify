package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wfs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f250888a;

    /* JADX INFO: renamed from: b */
    public final String f250889b;

    /* JADX INFO: renamed from: c */
    public final long f250890c;

    public wfs0(String str, String str2, long j) {
        this.f250888a = str;
        this.f250889b = str2;
        this.f250890c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfs0)) {
            return false;
        }
        wfs0 wfs0Var = (wfs0) obj;
        return wj50.m88271j(this.f250888a, wfs0Var.f250888a) && wj50.m88271j(this.f250889b, wfs0Var.f250889b) && this.f250890c == wfs0Var.f250890c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f250890c) + s571.m77243b(this.f250888a.hashCode() * 31, 31, this.f250889b);
    }
}
