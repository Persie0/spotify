package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m2b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dn10 f139308b;

    /* JADX INFO: renamed from: c */
    public int f139309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2b0(dn10 dn10Var, fbk fbkVar) {
        super(fbkVar);
        this.f139308b = dn10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139307a = obj;
        this.f139309c |= Integer.MIN_VALUE;
        return this.f139308b.m36442b(null, this);
    }
}
