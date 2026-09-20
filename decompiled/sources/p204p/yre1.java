package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yre1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275465a;

    /* JADX INFO: renamed from: b */
    public int f275466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f275467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yre1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f275467c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275465a = obj;
        this.f275466b |= Integer.MIN_VALUE;
        return this.f275467c.emit(null, this);
    }
}
