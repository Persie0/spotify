package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class who0 extends ibk {

    /* JADX INFO: renamed from: a */
    public lho0 f251414a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f251415b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dio0 f251416c;

    /* JADX INFO: renamed from: d */
    public int f251417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public who0(dio0 dio0Var, ibk ibkVar) {
        super(ibkVar);
        this.f251416c = dio0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251415b = obj;
        this.f251417d |= Integer.MIN_VALUE;
        return dio0.m36126a(this.f251416c, null, this);
    }
}
