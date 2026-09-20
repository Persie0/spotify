package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rjx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f199915a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f199916b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ djx0 f199917c;

    /* JADX INFO: renamed from: d */
    public int f199918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjx0(djx0 djx0Var, ibk ibkVar) {
        super(ibkVar);
        this.f199917c = djx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199916b = obj;
        this.f199918d |= Integer.MIN_VALUE;
        return djx0.m36238n(this.f199917c, this);
    }
}
