package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u701 implements v701 {

    /* JADX INFO: renamed from: a */
    public final boolean f227478a;

    public u701(boolean z) {
        this.f227478a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u701) && this.f227478a == ((u701) obj).f227478a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227478a);
    }
}
