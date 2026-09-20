package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ds0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ es0 f52454b;

    /* JADX INFO: renamed from: c */
    public int f52455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(es0 es0Var, ibk ibkVar) {
        super(ibkVar);
        this.f52454b = es0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52453a = obj;
        this.f52455c |= Integer.MIN_VALUE;
        return this.f52454b.m39855e(this);
    }
}
