package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class amo implements bmo {

    /* JADX INFO: renamed from: a */
    public final kbu f17169a;

    public amo(kbu kbuVar) {
        this.f17169a = kbuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amo) && wj50.m88271j(this.f17169a, ((amo) obj).f17169a);
    }

    public final int hashCode() {
        return this.f17169a.hashCode();
    }
}
