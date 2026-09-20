package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ry01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203777a;

    /* JADX INFO: renamed from: b */
    public int f203778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sy01 f203779c;

    /* JADX INFO: renamed from: d */
    public bqz0 f203780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry01(sy01 sy01Var, ibk ibkVar) {
        super(ibkVar);
        this.f203779c = sy01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203777a = obj;
        this.f203778b |= Integer.MIN_VALUE;
        return this.f203779c.mo15629a(null, null, this);
    }
}
