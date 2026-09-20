package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class siv extends uiv {

    /* JADX INFO: renamed from: a */
    public final boolean f209668a;

    public siv(boolean z) {
        this.f209668a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof siv) && this.f209668a == ((siv) obj).f209668a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209668a);
    }
}
