package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mc30 f121353b;

    /* JADX INFO: renamed from: c */
    public int f121354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc30(mc30 mc30Var, ibk ibkVar) {
        super(ibkVar);
        this.f121353b = mc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121352a = obj;
        this.f121354c |= Integer.MIN_VALUE;
        return mc30.m61438I1(this.f121353b, this);
    }
}
