package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x210 f236518b;

    /* JADX INFO: renamed from: c */
    public int f236519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v210(x210 x210Var, fbk fbkVar) {
        super(fbkVar);
        this.f236518b = x210Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236517a = obj;
        this.f236519c |= Integer.MIN_VALUE;
        return this.f236518b.m89703f(null, this);
    }
}
