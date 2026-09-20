package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k84 implements pdo0 {

    /* JADX INFO: renamed from: a */
    public final int f120245a;

    public k84(int i) {
        this.f120245a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k84) && this.f120245a == ((k84) obj).f120245a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120245a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f120245a, ')');
    }
}
