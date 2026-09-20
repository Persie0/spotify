package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class d7l extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f7l f46234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7l(f7l f7lVar, int i) {
        super(0);
        this.f46233a = i;
        this.f46234b = f7lVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f46233a) {
            case 0:
                return new DispatcherWorker(this.f46234b.f66748i);
            case 1:
                return new DispatcherWorker(this.f46234b.f66749t);
            default:
                this.f46234b.f66745f.getClass();
                return new svy0(uuy0.f234299a);
        }
    }
}
