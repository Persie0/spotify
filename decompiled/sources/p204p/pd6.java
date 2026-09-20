package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pd6 {

    /* JADX INFO: renamed from: a */
    public final boolean f176358a;

    public final boolean equals(Object obj) {
        if (obj instanceof pd6) {
            return this.f176358a == ((pd6) obj).f176358a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176358a);
    }

    public final String toString() {
        return "PersonalizedRecommendationsDisabled(value=" + this.f176358a + ")";
    }
}
