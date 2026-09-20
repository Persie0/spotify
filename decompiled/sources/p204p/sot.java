package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212649a;

    /* JADX INFO: renamed from: b */
    public int f212650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vot f212651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sot(vot votVar, ibk ibkVar) {
        super(ibkVar);
        this.f212651c = votVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212649a = obj;
        this.f212650b |= Integer.MIN_VALUE;
        return this.f212651c.mo15629a(null, null, this);
    }
}
