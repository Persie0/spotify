package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rnb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ unb f200863b;

    /* JADX INFO: renamed from: c */
    public int f200864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnb(unb unbVar, ibk ibkVar) {
        super(ibkVar);
        this.f200863b = unbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200862a = obj;
        this.f200864c |= Integer.MIN_VALUE;
        return this.f200863b.m83538a(null, null, this);
    }
}
