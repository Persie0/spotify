package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vr3 extends ibk {

    /* JADX INFO: renamed from: a */
    public olv0 f244053a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f244054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yr3 f244055c;

    /* JADX INFO: renamed from: d */
    public int f244056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr3(yr3 yr3Var, ibk ibkVar) {
        super(ibkVar);
        this.f244055c = yr3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244054b = obj;
        this.f244056d |= Integer.MIN_VALUE;
        return yr3.m94405c2(this.f244055c, 0.0f, this);
    }
}
