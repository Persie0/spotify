package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yg40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bh40 f272475b;

    /* JADX INFO: renamed from: c */
    public int f272476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg40(bh40 bh40Var, ibk ibkVar) {
        super(ibkVar);
        this.f272475b = bh40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272474a = obj;
        this.f272476c |= Integer.MIN_VALUE;
        return this.f272475b.m29200b(this);
    }
}
