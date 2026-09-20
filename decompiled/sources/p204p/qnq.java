package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qnq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f190680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n90 f190681b;

    /* JADX INFO: renamed from: c */
    public int f190682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnq(n90 n90Var, fbk fbkVar) {
        super(fbkVar);
        this.f190681b = n90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190680a = obj;
        this.f190682c |= Integer.MIN_VALUE;
        return this.f190681b.m63872f(null, this);
    }
}
