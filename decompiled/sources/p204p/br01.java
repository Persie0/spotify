package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class br01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cr01 f29928b;

    /* JADX INFO: renamed from: c */
    public int f29929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br01(cr01 cr01Var, ibk ibkVar) {
        super(ibkVar);
        this.f29928b = cr01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29927a = obj;
        this.f29929c |= Integer.MIN_VALUE;
        return this.f29928b.m33700a(null, this);
    }
}
