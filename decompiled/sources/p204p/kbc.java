package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nbc f121173b;

    /* JADX INFO: renamed from: c */
    public int f121174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbc(nbc nbcVar, ibk ibkVar) {
        super(ibkVar);
        this.f121173b = nbcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121172a = obj;
        this.f121174c |= Integer.MIN_VALUE;
        return this.f121173b.m64072e(null, this);
    }
}
