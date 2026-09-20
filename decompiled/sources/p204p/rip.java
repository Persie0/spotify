package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rip extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sip f199583b;

    /* JADX INFO: renamed from: c */
    public int f199584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rip(sip sipVar, ibk ibkVar) {
        super(ibkVar);
        this.f199583b = sipVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199582a = obj;
        this.f199584c |= Integer.MIN_VALUE;
        return this.f199583b.m78231a(null, this);
    }
}
