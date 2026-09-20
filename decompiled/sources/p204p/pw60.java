package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final boolean f181922a;

    public pw60(boolean z) {
        this.f181922a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw60) && this.f181922a == ((pw60) obj).f181922a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181922a);
    }
}
