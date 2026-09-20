package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/idl0;", "Lp/ixh0;", "Lp/jdl0;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class idl0 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f101151a;

    public idl0(gh00 gh00Var) {
        this.f101151a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        jdl0 jdl0Var = new jdl0();
        jdl0Var.f111369M0 = this.f101151a;
        long j = Integer.MIN_VALUE;
        jdl0Var.f111370N0 = (j & 4294967295L) | (j << 32);
        return jdl0Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        jdl0 jdl0Var = (jdl0) exh0Var;
        jdl0Var.f111369M0 = this.f101151a;
        long j = Integer.MIN_VALUE;
        jdl0Var.f111370N0 = (j & 4294967295L) | (j << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof idl0) {
            return this.f101151a == ((idl0) obj).f101151a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f101151a.hashCode();
    }
}
