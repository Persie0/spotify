package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eus0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63070a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eoi f63071b;

    /* JADX INFO: renamed from: c */
    public int f63072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eus0(eoi eoiVar, ibk ibkVar) {
        super(ibkVar);
        this.f63071b = eoiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63070a = obj;
        this.f63072c |= Integer.MIN_VALUE;
        return this.f63071b.m39573d(null, this);
    }
}
