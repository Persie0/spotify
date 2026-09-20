package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rto implements sto {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2573xi f202621a;

    public rto(InterfaceC2573xi interfaceC2573xi) {
        this.f202621a = interfaceC2573xi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rto) && wj50.m88271j(this.f202621a, ((rto) obj).f202621a);
    }

    public final int hashCode() {
        return this.f202621a.hashCode();
    }
}
