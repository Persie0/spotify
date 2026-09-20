package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mga0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f143418a;

    /* JADX INFO: renamed from: b */
    public String f143419b;

    /* JADX INFO: renamed from: c */
    public rqs0 f143420c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f143421d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ oga0 f143422e;

    /* JADX INFO: renamed from: f */
    public int f143423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mga0(oga0 oga0Var, ibk ibkVar) {
        super(ibkVar);
        this.f143422e = oga0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143421d = obj;
        this.f143423f |= Integer.MIN_VALUE;
        return this.f143422e.m66876b(false, null, null, this);
    }
}
