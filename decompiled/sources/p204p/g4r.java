package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class g4r extends mvf1 {
    @Override // p204p.mvf1
    /* JADX INFO: renamed from: j */
    public final float mo43543j(h4r h4rVar) {
        return h4rVar.f87630M0 * 10000.0f;
    }

    @Override // p204p.mvf1
    /* JADX INFO: renamed from: n */
    public final void mo43544n(h4r h4rVar, float f) {
        h4rVar.f87630M0 = f / 10000.0f;
        h4rVar.invalidateSelf();
    }
}
