package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class koe1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124773a;

    /* JADX INFO: renamed from: b */
    public int f124774b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f124775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koe1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f124775c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124773a = obj;
        this.f124774b |= Integer.MIN_VALUE;
        return this.f124775c.emit(null, this);
    }
}
