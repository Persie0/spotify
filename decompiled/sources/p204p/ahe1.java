package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ahe1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15682a;

    /* JADX INFO: renamed from: b */
    public int f15683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f15684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahe1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f15684c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15682a = obj;
        this.f15683b |= Integer.MIN_VALUE;
        return this.f15684c.emit(null, this);
    }
}
