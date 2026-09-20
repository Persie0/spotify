package androidx.car.app.model;

import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.model.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0032f implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub f460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f461c;

    public /* synthetic */ C0032f(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, int i) {
        this.f459a = i;
        this.f460b = searchCallbackStub;
        this.f461c = str;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f459a) {
            case 0:
                return this.f460b.lambda$onSearchSubmitted$1(this.f461c);
            default:
                return this.f460b.lambda$onSearchTextChanged$0(this.f461c);
        }
    }
}
