package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gyd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f85550a;

    /* JADX INFO: renamed from: b */
    public eyd0 f85551b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f85552c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tyd0 f85553d;

    /* JADX INFO: renamed from: e */
    public int f85554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyd0(tyd0 tyd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f85553d = tyd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85552c = obj;
        this.f85554e |= Integer.MIN_VALUE;
        return this.f85553d.m81967i(null, null, this);
    }
}
