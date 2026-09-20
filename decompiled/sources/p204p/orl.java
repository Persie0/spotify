package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class orl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168618a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ prl f168619b;

    /* JADX INFO: renamed from: c */
    public int f168620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orl(prl prlVar, ibk ibkVar) {
        super(ibkVar);
        this.f168619b = prlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168618a = obj;
        this.f168620c |= Integer.MIN_VALUE;
        return prl.m70721a(this.f168619b, null, null, this);
    }
}
