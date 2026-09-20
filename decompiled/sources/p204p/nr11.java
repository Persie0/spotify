package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nr11 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f157416a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f157417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aub f157418c;

    /* JADX INFO: renamed from: d */
    public int f157419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr11(aub aubVar, ibk ibkVar) {
        super(ibkVar);
        this.f157418c = aubVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157417b = obj;
        this.f157419d |= Integer.MIN_VALUE;
        return this.f157418c.m27172b(null, this);
    }
}
