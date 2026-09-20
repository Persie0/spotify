package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pa70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175410a;

    /* JADX INFO: renamed from: b */
    public int f175411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f175412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f175412c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175410a = obj;
        this.f175411b |= Integer.MIN_VALUE;
        return this.f175412c.emit(null, this);
    }
}
