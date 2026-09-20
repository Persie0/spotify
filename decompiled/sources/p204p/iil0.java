package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iil0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102599a;

    /* JADX INFO: renamed from: b */
    public int f102600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jil0 f102601c;

    /* JADX INFO: renamed from: d */
    public bqz0 f102602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iil0(jil0 jil0Var, ibk ibkVar) {
        super(ibkVar);
        this.f102601c = jil0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102599a = obj;
        this.f102600b |= Integer.MIN_VALUE;
        return this.f102601c.mo15629a(null, null, this);
    }
}
