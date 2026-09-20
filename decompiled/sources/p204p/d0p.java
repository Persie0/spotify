package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d0p extends ibk {

    /* JADX INFO: renamed from: a */
    public String f44016a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f44017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h0p f44018c;

    /* JADX INFO: renamed from: d */
    public int f44019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0p(h0p h0pVar, ibk ibkVar) {
        super(ibkVar);
        this.f44018c = h0pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44017b = obj;
        this.f44019d |= Integer.MIN_VALUE;
        return this.f44018c.m46366d(null, null, this);
    }
}
