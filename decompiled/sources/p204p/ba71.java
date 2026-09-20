package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ba71 {

    /* JADX INFO: renamed from: a */
    public final int f25105a;

    public /* synthetic */ ba71(int i) {
        this.f25105a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ba71) {
            return this.f25105a == ((ba71) obj).f25105a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25105a);
    }

    public final String toString() {
        return dq60.m36613m("TextHighlightType(value=", this.f25105a, ')');
    }
}
