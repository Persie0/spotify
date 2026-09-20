package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o2e1 {

    /* JADX INFO: renamed from: a */
    public final String f161036a;

    /* JADX INFO: renamed from: b */
    public final boolean f161037b;

    public o2e1(String str, boolean z) {
        this.f161036a = str;
        this.f161037b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2e1)) {
            return false;
        }
        o2e1 o2e1Var = (o2e1) obj;
        return wj50.m88271j(this.f161036a, o2e1Var.f161036a) && this.f161037b == o2e1Var.f161037b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161037b) + (this.f161036a.hashCode() * 31);
    }
}
