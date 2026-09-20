package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vf9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hd41 f240915b;

    /* JADX INFO: renamed from: c */
    public int f240916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf9(hd41 hd41Var, ibk ibkVar) {
        super(ibkVar);
        this.f240915b = hd41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240914a = obj;
        this.f240916c |= Integer.MIN_VALUE;
        return this.f240915b.m47168d(this);
    }
}
