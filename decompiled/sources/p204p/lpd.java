package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class lpd extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mpd f135737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpd(mpd mpdVar, int i) {
        super(0);
        this.f135736a = i;
        this.f135737b = mpdVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f135736a) {
            case 0:
                return new DispatcherWorker(this.f135737b.f145984h);
            default:
                return new DispatcherWorker(this.f135737b.f145985i);
        }
    }
}
