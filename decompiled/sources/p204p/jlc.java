package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class jlc extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ olc f113580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jlc(olc olcVar, int i) {
        super(0);
        this.f113579a = i;
        this.f113580b = olcVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f113579a) {
            case 0:
                break;
        }
        return new DispatcherWorker(this.f113580b.f166812a);
    }
}
