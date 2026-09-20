package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f112115a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f112116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kg91 f112117c;

    /* JADX INFO: renamed from: d */
    public int f112118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f112117c = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112116b = obj;
        this.f112118d |= Integer.MIN_VALUE;
        return this.f112117c.m56324n(0L, this);
    }
}
