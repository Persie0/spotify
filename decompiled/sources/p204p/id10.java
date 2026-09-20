package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class id10 extends jd10 {

    /* JADX INFO: renamed from: a */
    public final boolean f100917a;

    public id10(boolean z) {
        this.f100917a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id10) && this.f100917a == ((id10) obj).f100917a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100917a);
    }
}
