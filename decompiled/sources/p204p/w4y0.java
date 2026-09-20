package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w4y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f247920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rwt0 f247921b;

    /* JADX INFO: renamed from: c */
    public int f247922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4y0(rwt0 rwt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f247921b = rwt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247920a = obj;
        this.f247922c |= Integer.MIN_VALUE;
        return this.f247921b.m76588l(null, this);
    }
}
