package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqw f83564b;

    /* JADX INFO: renamed from: c */
    public int f83565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqw(kqw kqwVar, ibk ibkVar) {
        super(ibkVar);
        this.f83564b = kqwVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83563a = obj;
        this.f83565c |= Integer.MIN_VALUE;
        return this.f83564b.m57127e(null, this);
    }
}
