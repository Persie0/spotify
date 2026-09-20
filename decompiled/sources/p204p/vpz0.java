package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class vpz0 extends ffz0 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f243817e;

    public vpz0(long j, vpz0 vpz0Var, int i) {
        super(j, vpz0Var, i);
        this.f243817e = new AtomicReferenceArray(upz0.f232864f);
    }

    @Override // p204p.ffz0
    /* JADX INFO: renamed from: g */
    public final int mo41558g() {
        return upz0.f232864f;
    }

    @Override // p204p.ffz0
    /* JADX INFO: renamed from: h */
    public final void mo41559h(int i, juk jukVar) {
        this.f243817e.set(i, upz0.f232863e);
        m41560i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f69124c + ", hashCode=" + hashCode() + ']';
    }
}
