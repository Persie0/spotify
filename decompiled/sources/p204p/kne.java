package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kne extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124394a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lne f124395b;

    /* JADX INFO: renamed from: c */
    public int f124396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kne(lne lneVar, ibk ibkVar) {
        super(ibkVar);
        this.f124395b = lneVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124394a = obj;
        this.f124396c |= Integer.MIN_VALUE;
        return this.f124395b.m59497c(null, this);
    }
}
