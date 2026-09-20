package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cje1 implements jje1 {

    /* JADX INFO: renamed from: a */
    public final Throwable f38571a;

    public cje1(Throwable th) {
        this.f38571a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cje1) && wj50.m88271j(this.f38571a, ((cje1) obj).f38571a);
    }

    public final int hashCode() {
        return this.f38571a.hashCode();
    }
}
