package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iim0 implements rim0 {

    /* JADX INFO: renamed from: a */
    public final Exception f102604a;

    public iim0(Exception exc) {
        this.f102604a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iim0) && this.f102604a.equals(((iim0) obj).f102604a);
    }

    @Override // p204p.i040
    public final /* bridge */ /* synthetic */ String getId() {
        return "FindInShowFailed";
    }

    public final int hashCode() {
        return this.f102604a.hashCode();
    }
}
