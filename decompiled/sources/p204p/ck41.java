package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ck41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38814a;

    /* JADX INFO: renamed from: b */
    public int f38815b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f38816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck41(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f38816c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38814a = obj;
        this.f38815b |= Integer.MIN_VALUE;
        return this.f38816c.emit(null, this);
    }
}
