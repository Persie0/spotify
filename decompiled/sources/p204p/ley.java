package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ley extends mey {

    /* JADX INFO: renamed from: a */
    public final String f132764a;

    /* JADX INFO: renamed from: b */
    public final boolean f132765b;

    public ley(String str, boolean z) {
        this.f132764a = str;
        this.f132765b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ley)) {
            return false;
        }
        ley leyVar = (ley) obj;
        return wj50.m88271j(this.f132764a, leyVar.f132764a) && this.f132765b == leyVar.f132765b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132765b) + (this.f132764a.hashCode() * 31);
    }
}
