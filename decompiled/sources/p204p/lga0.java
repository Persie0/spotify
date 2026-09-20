package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lga0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oga0 f133189b;

    /* JADX INFO: renamed from: c */
    public int f133190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lga0(oga0 oga0Var, fbk fbkVar) {
        super(fbkVar);
        this.f133189b = oga0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133188a = obj;
        this.f133190c |= Integer.MIN_VALUE;
        return oga0.m66875a(this.f133189b, null, this);
    }
}
