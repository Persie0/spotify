package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w420 implements y420 {

    /* JADX INFO: renamed from: a */
    public final Throwable f247687a;

    public w420(Throwable th) {
        this.f247687a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w420) && wj50.m88271j(this.f247687a, ((w420) obj).f247687a);
    }

    public final int hashCode() {
        return this.f247687a.hashCode();
    }
}
