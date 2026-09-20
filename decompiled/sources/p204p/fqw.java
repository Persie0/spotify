package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqw f72293b;

    /* JADX INFO: renamed from: c */
    public int f72294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqw(kqw kqwVar, ibk ibkVar) {
        super(ibkVar);
        this.f72293b = kqwVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72292a = obj;
        this.f72294c |= Integer.MIN_VALUE;
        return this.f72293b.m57126d(null, this);
    }
}
