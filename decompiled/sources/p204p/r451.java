package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r451 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f195659a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f195660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t451 f195661c;

    /* JADX INFO: renamed from: d */
    public int f195662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r451(t451 t451Var, ibk ibkVar) {
        super(ibkVar);
        this.f195661c = t451Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195660b = obj;
        this.f195662d |= Integer.MIN_VALUE;
        return t451.m80033c(this.f195661c, null, this);
    }
}
