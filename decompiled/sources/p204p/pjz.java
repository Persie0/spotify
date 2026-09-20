package p204p;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class pjz extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f178329a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjz(long j, fbk fbkVar) {
        super(1, fbkVar);
        this.f178329a = j;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        return new pjz(this.f178329a, fbkVar);
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ((pjz) create((fbk) obj)).invokeSuspend(w2a1.f247311a);
        throw null;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) cks.m33200s(this.f178329a)), null);
    }
}
