package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mzk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148723a;

    /* JADX INFO: renamed from: b */
    public int f148724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f148725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f148725c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148723a = obj;
        this.f148724b |= Integer.MIN_VALUE;
        return this.f148725c.emit(null, this);
    }
}
