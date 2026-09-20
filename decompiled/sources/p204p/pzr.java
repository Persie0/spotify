package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pzr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183788a;

    /* JADX INFO: renamed from: b */
    public int f183789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f183790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f183790c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183788a = obj;
        this.f183789b |= Integer.MIN_VALUE;
        return this.f183790c.emit(null, this);
    }
}
