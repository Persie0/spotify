package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class crc0 extends erc0 {

    /* JADX INFO: renamed from: a */
    public final vnc0 f41264a;

    public crc0(vnc0 vnc0Var) {
        this.f41264a = vnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crc0) && wj50.m88271j(this.f41264a, ((crc0) obj).f41264a);
    }

    public final int hashCode() {
        return this.f41264a.hashCode();
    }
}
