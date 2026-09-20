package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mn6 {

    /* JADX INFO: renamed from: a */
    public final Object f145320a;

    public /* synthetic */ mn6(Object obj) {
        this.f145320a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mn6) {
            return wj50.m88271j(this.f145320a, ((mn6) obj).f145320a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f145320a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f145320a + ')';
    }
}
