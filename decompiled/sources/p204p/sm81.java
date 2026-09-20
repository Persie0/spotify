package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sm81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ an81 f210585b;

    /* JADX INFO: renamed from: c */
    public int f210586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm81(an81 an81Var, ibk ibkVar) {
        super(ibkVar);
        this.f210585b = an81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210584a = obj;
        this.f210586c |= Integer.MIN_VALUE;
        return this.f210585b.m26485a(null, this);
    }
}
