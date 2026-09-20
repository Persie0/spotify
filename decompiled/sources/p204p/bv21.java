package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bv21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ev21 f31261b;

    /* JADX INFO: renamed from: c */
    public int f31262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv21(ev21 ev21Var, ibk ibkVar) {
        super(ibkVar);
        this.f31261b = ev21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31260a = obj;
        this.f31262c |= Integer.MIN_VALUE;
        return this.f31261b.m40084d(null, this);
    }
}
