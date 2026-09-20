package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e9b0 implements f9b0 {

    /* JADX INFO: renamed from: a */
    public final String f57402a;

    public /* synthetic */ e9b0(String str) {
        this.f57402a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e9b0) {
            return wj50.m88271j(this.f57402a, ((e9b0) obj).f57402a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57402a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("Url(url=", this.f57402a, ")");
    }
}
