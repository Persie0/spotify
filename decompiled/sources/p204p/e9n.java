package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e9n implements dtp, nuv0 {

    /* JADX INFO: renamed from: a */
    public final ebn f57487a;

    public /* synthetic */ e9n(ebn ebnVar) {
        this.f57487a = ebnVar;
    }

    @Override // p204p.dtp
    public etp create() {
        return new g9n(this.f57487a, 0);
    }

    @Override // p204p.nuv0
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public ouv0 mo98365create() {
        return new g9n(this.f57487a, 1);
    }
}
