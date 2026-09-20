package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cjy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public rlv0 f38704a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f38705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cha0 f38706c;

    /* JADX INFO: renamed from: d */
    public int f38707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjy0(cha0 cha0Var, ibk ibkVar) {
        super(ibkVar);
        this.f38706c = cha0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38705b = obj;
        this.f38707d |= Integer.MIN_VALUE;
        return this.f38706c.m32757g(null, this);
    }
}
