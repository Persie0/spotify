package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qlb extends ibk {

    /* JADX INFO: renamed from: a */
    public String f189810a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f189811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f189812c;

    /* JADX INFO: renamed from: d */
    public int f189813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f189812c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189811b = obj;
        this.f189813d |= Integer.MIN_VALUE;
        return this.f189812c.m59331h(0, null, this);
    }
}
