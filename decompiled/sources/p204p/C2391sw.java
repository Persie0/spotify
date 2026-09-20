package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: renamed from: p.sw */
/* JADX INFO: loaded from: classes9.dex */
public final class C2391sw {

    /* JADX INFO: renamed from: a */
    public final g5t0 f214542a;

    public C2391sw(g5t0 g5t0Var) {
        this.f214542a = g5t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m79502a() {
        return this.f214542a.m43619b("kids-data-migration", new C2401t5(1, this, C2391sw.class, "convert", "convert(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/kidsdatamigration/v1/MigrationStatusPubsub;", 0, 0, 4)).doOnNext(C1710bm.f28335d).map(new snq0(this)).doOnNext(C1710bm.f28336e);
    }
}
