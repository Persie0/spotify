package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class pnj implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ snj f179419b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ com.spotify.mobius.functions.Consumer f179420c;

    public /* synthetic */ pnj(snj snjVar, com.spotify.mobius.functions.Consumer consumer, int i) {
        this.f179418a = i;
        this.f179419b = snjVar;
        this.f179420c = consumer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f179418a) {
            case 0:
                lnj lnjVar = (lnj) obj;
                snj snjVar = this.f179419b;
                if (!snjVar.f210949e) {
                    snjVar.f210947c.mo36102d(lnjVar.f135172b, lnjVar.f135171a, lnjVar.f135173c);
                }
                this.f179420c.accept(new asj(lnjVar.f135172b));
                break;
            default:
                knj knjVar = (knj) obj;
                snj snjVar2 = this.f179419b;
                if (!snjVar2.f210949e) {
                    snjVar2.f210947c.mo36103e(knjVar.f124431a);
                }
                this.f179420c.accept(new zrj(knjVar.f124432b));
                break;
        }
    }
}
