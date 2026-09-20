package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ure1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zre1 f233343b;

    /* JADX INFO: renamed from: c */
    public int f233344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ure1(zre1 zre1Var, ibk ibkVar) {
        super(ibkVar);
        this.f233343b = zre1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233342a = obj;
        this.f233344c |= Integer.MIN_VALUE;
        return this.f233343b.m96760a(null, this);
    }
}
