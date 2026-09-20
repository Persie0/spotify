package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class coy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40368a;

    /* JADX INFO: renamed from: b */
    public int f40369b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f40370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coy0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f40370c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40368a = obj;
        this.f40369b |= Integer.MIN_VALUE;
        return this.f40370c.emit(null, this);
    }
}
