package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ew0 {

    /* JADX INFO: renamed from: a */
    public final String f63380a;

    /* JADX INFO: renamed from: b */
    public final long f63381b;

    public ew0(String str, long j) {
        this.f63380a = str;
        this.f63381b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew0)) {
            return false;
        }
        ew0 ew0Var = (ew0) obj;
        return wj50.m88271j(this.f63380a, ew0Var.f63380a) && this.f63381b == ew0Var.f63381b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f63381b) + (this.f63380a.hashCode() * 31);
    }
}
