package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f123199a;

    /* JADX INFO: renamed from: b */
    public fj2 f123200b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f123201c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ck2 f123202d;

    /* JADX INFO: renamed from: e */
    public int f123203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f123202d = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123201c = obj;
        this.f123203e |= Integer.MIN_VALUE;
        return ck2.m33021c(this.f123202d, false, null, false, this);
    }
}
