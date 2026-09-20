package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rj00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199673a;

    /* JADX INFO: renamed from: b */
    public int f199674b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sj00 f199675c;

    /* JADX INFO: renamed from: d */
    public bqz0 f199676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj00(sj00 sj00Var, ibk ibkVar) {
        super(ibkVar);
        this.f199675c = sj00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199673a = obj;
        this.f199674b |= Integer.MIN_VALUE;
        return this.f199675c.mo15629a(null, null, this);
    }
}
