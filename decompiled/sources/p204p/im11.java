package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class im11 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103574a;

    /* JADX INFO: renamed from: b */
    public final emx f103575b;

    public /* synthetic */ im11(emx emxVar, int i) {
        this.f103574a = i;
        this.f103575b = emxVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f103574a) {
            case 0:
                this.f103575b.m39465a(((tjt) obj).f221015a);
                break;
            default:
                this.f103575b.m39465a(((nj6) obj).f154450g);
                break;
        }
    }
}
