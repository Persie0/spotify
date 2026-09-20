package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tf11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r27 f219832b;

    /* JADX INFO: renamed from: c */
    public int f219833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf11(r27 r27Var, ibk ibkVar) {
        super(ibkVar);
        this.f219832b = r27Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219831a = obj;
        this.f219833c |= Integer.MIN_VALUE;
        return this.f219832b.m74506c(this);
    }
}
