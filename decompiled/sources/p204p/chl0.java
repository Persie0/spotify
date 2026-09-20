package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class chl0 implements ghl0 {

    /* JADX INFO: renamed from: a */
    public final Float f38031a;

    public chl0(Float f) {
        this.f38031a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chl0) && wj50.m88271j(this.f38031a, ((chl0) obj).f38031a);
    }

    public final int hashCode() {
        Float f = this.f38031a;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }
}
