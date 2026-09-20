package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sr70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ur70 f213252b;

    /* JADX INFO: renamed from: c */
    public int f213253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr70(ur70 ur70Var, ibk ibkVar) {
        super(ibkVar);
        this.f213252b = ur70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213251a = obj;
        this.f213253c |= Integer.MIN_VALUE;
        return this.f213252b.m83844i(this);
    }
}
