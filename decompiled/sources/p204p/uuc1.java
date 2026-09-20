package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uuc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f234151a;

    /* JADX INFO: renamed from: b */
    public String f234152b;

    /* JADX INFO: renamed from: c */
    public String f234153c;

    /* JADX INFO: renamed from: d */
    public String f234154d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f234155e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ yuc1 f234156f;

    /* JADX INFO: renamed from: g */
    public int f234157g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuc1(yuc1 yuc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f234156f = yuc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234155e = obj;
        this.f234157g |= Integer.MIN_VALUE;
        return yuc1.m94651g(this.f234156f, this);
    }
}
