package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d0b extends ibk {

    /* JADX INFO: renamed from: a */
    public n0b f43835a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f43836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e0b f43837c;

    /* JADX INFO: renamed from: d */
    public int f43838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0b(e0b e0bVar, ibk ibkVar) {
        super(ibkVar);
        this.f43837c = e0bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43836b = obj;
        this.f43838d |= Integer.MIN_VALUE;
        return this.f43837c.m37486a(null, this);
    }
}
