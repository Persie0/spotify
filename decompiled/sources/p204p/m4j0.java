package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m4j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139974a;

    /* JADX INFO: renamed from: b */
    public int f139975b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f139976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4j0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f139976c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139974a = obj;
        this.f139975b |= Integer.MIN_VALUE;
        return this.f139976c.emit(null, this);
    }
}
