package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f224071a;

    /* JADX INFO: renamed from: b */
    public String f224072b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f224073c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wv60 f224074d;

    /* JADX INFO: renamed from: e */
    public int f224075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv60(wv60 wv60Var, ibk ibkVar) {
        super(ibkVar);
        this.f224074d = wv60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224073c = obj;
        this.f224075e |= Integer.MIN_VALUE;
        return this.f224074d.m89078a(null, null, this);
    }
}
