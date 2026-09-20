package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zbs implements fuk {

    /* JADX INFO: renamed from: a */
    public final float f281393a;

    public zbs(float f) {
        this.f281393a = f;
    }

    @Override // p204p.fuk
    /* JADX INFO: renamed from: a */
    public final float mo29770a(long j, yqq yqqVar) {
        return yqqVar.mo35989Z0(this.f281393a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbs) && ybs.m93301b(this.f281393a, ((zbs) obj).f281393a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f281393a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f281393a + ".dp)";
    }
}
