package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z2j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a3j f278595b;

    /* JADX INFO: renamed from: c */
    public int f278596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2j(a3j a3jVar, ibk ibkVar) {
        super(ibkVar);
        this.f278595b = a3jVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278594a = obj;
        this.f278596c |= Integer.MIN_VALUE;
        return this.f278595b.m24630a(this);
    }
}
