package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class s961 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206868a;

    /* JADX INFO: renamed from: b */
    public int f206869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t961 f206870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s961(t961 t961Var, ibk ibkVar) {
        super(ibkVar);
        this.f206870c = t961Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206868a = obj;
        this.f206869b |= Integer.MIN_VALUE;
        return this.f206870c.mo15629a(null, null, this);
    }
}
