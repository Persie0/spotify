package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m24212d2 = {"Lp/uxy;", "Lp/ixh0;", "Lp/vxy;", "p/zuj0", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class uxy extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final int f235065a;

    /* JADX INFO: renamed from: b */
    public final float f235066b;

    public uxy(int i, float f) {
        this.f235065a = i;
        this.f235066b = f;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        vxy vxyVar = new vxy();
        vxyVar.f245857M0 = this.f235065a;
        vxyVar.f245858N0 = this.f235066b;
        return vxyVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        vxy vxyVar = (vxy) exh0Var;
        vxyVar.f245857M0 = this.f235065a;
        vxyVar.f245858N0 = this.f235066b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxy)) {
            return false;
        }
        uxy uxyVar = (uxy) obj;
        return this.f235065a == uxyVar.f235065a && this.f235066b == uxyVar.f235066b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f235066b) + (edb.m38547C(this.f235065a) * 31);
    }
}
