package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class otc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f169035a;

    public otc1(boolean z) {
        this.f169035a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof otc1) && this.f169035a == ((otc1) obj).f169035a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169035a);
    }
}
