package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ efx f200181b;

    /* JADX INFO: renamed from: c */
    public int f200182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkz(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f200181b = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200180a = obj;
        this.f200182c |= Integer.MIN_VALUE;
        return this.f200181b.m38747b(null, this);
    }
}
