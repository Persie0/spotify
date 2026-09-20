package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s451 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t451 f205500b;

    /* JADX INFO: renamed from: c */
    public int f205501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s451(t451 t451Var, ibk ibkVar) {
        super(ibkVar);
        this.f205500b = t451Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205499a = obj;
        this.f205501c |= Integer.MIN_VALUE;
        return t451.m80034d(this.f205500b, null, null, 0, this);
    }
}
