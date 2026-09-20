package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bze {

    /* JADX INFO: renamed from: a */
    public final boolean f32479a;

    public bze(boolean z) {
        this.f32479a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bze) && this.f32479a == ((bze) obj).f32479a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32479a);
    }
}
