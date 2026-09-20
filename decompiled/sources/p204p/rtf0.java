package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rtf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ttf0 f202575b;

    /* JADX INFO: renamed from: c */
    public int f202576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtf0(ttf0 ttf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f202575b = ttf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202574a = obj;
        this.f202576c |= Integer.MIN_VALUE;
        return this.f202575b.m81503b(null, this);
    }
}
