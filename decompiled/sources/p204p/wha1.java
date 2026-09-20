package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f251294a;

    /* JADX INFO: renamed from: b */
    public long f251295b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f251296c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yha1 f251297d;

    /* JADX INFO: renamed from: e */
    public int f251298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wha1(yha1 yha1Var, ibk ibkVar) {
        super(ibkVar);
        this.f251297d = yha1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251296c = obj;
        this.f251298e |= Integer.MIN_VALUE;
        return this.f251297d.m93630e(null, null, this);
    }
}
