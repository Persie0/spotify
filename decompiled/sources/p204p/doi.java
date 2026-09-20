package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class doi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eoi f51048b;

    /* JADX INFO: renamed from: c */
    public int f51049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doi(eoi eoiVar, ibk ibkVar) {
        super(ibkVar);
        this.f51048b = eoiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51047a = obj;
        this.f51049c |= Integer.MIN_VALUE;
        return eoi.m39570a(this.f51048b, null, this);
    }
}
