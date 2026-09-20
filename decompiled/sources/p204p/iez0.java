package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class iez0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f101594a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f101595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jez0 f101596c;

    /* JADX INFO: renamed from: d */
    public int f101597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iez0(jez0 jez0Var, ibk ibkVar) {
        super(ibkVar);
        this.f101596c = jez0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f101595b = obj;
        this.f101597d |= Integer.MIN_VALUE;
        return jez0.m53136I1(this.f101596c, this);
    }
}
