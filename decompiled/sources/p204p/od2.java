package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class od2 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f164071a;

    /* JADX INFO: renamed from: b */
    public int f164072b;

    /* JADX INFO: renamed from: c */
    public int f164073c;

    /* JADX INFO: renamed from: d */
    public int f164074d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f164075e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pd2 f164076f;

    /* JADX INFO: renamed from: g */
    public int f164077g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od2(pd2 pd2Var, ibk ibkVar) {
        super(ibkVar);
        this.f164076f = pd2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164075e = obj;
        this.f164077g |= Integer.MIN_VALUE;
        return pd2.m69637b(this.f164076f, this);
    }
}
