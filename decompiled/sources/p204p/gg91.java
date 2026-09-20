package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f79578a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f79579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kg91 f79580c;

    /* JADX INFO: renamed from: d */
    public int f79581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f79580c = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79579b = obj;
        this.f79581d |= Integer.MIN_VALUE;
        return this.f79580c.m56321k(false, this);
    }
}
