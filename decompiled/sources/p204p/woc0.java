package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class woc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f253431a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f253432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yoc0 f253433c;

    /* JADX INFO: renamed from: d */
    public int f253434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woc0(yoc0 yoc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f253433c = yoc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253432b = obj;
        this.f253434d |= Integer.MIN_VALUE;
        return this.f253433c.m94278e(null, null, null, null, this);
    }
}
