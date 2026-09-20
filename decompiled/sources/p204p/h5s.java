package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h5s extends ibk {

    /* JADX INFO: renamed from: a */
    public s4s f87891a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f87892b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j5s f87893c;

    /* JADX INFO: renamed from: d */
    public int f87894d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5s(j5s j5sVar, ibk ibkVar) {
        super(ibkVar);
        this.f87893c = j5sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87892b = obj;
        this.f87894d |= Integer.MIN_VALUE;
        return j5s.m52474g(this.f87893c, null, this);
    }
}
