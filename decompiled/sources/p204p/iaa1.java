package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iaa1 implements kaa1 {

    /* JADX INFO: renamed from: a */
    public final pdu f100211a;

    public iaa1(pdu pduVar) {
        this.f100211a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iaa1) && wj50.m88271j(this.f100211a, ((iaa1) obj).f100211a);
    }

    public final int hashCode() {
        return this.f100211a.hashCode();
    }
}
