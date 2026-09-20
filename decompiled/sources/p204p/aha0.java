package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aha0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f15650a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15651b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cha0 f15652c;

    /* JADX INFO: renamed from: d */
    public int f15653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aha0(cha0 cha0Var, ibk ibkVar) {
        super(ibkVar);
        this.f15652c = cha0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15651b = obj;
        this.f15653d |= Integer.MIN_VALUE;
        return this.f15652c.m32754d(this);
    }
}
