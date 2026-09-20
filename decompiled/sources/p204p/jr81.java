package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jr81 extends ibk {

    /* JADX INFO: renamed from: a */
    public lu01 f115107a;

    /* JADX INFO: renamed from: b */
    public xr01 f115108b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f115109c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qr81 f115110d;

    /* JADX INFO: renamed from: e */
    public int f115111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr81(qr81 qr81Var, ibk ibkVar) {
        super(ibkVar);
        this.f115110d = qr81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115109c = obj;
        this.f115111e |= Integer.MIN_VALUE;
        return this.f115110d.m73611h(null, null, this);
    }
}
