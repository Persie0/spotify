package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ll40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134526a;

    /* JADX INFO: renamed from: b */
    public int f134527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f134528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f134528c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134526a = obj;
        this.f134527b |= Integer.MIN_VALUE;
        return this.f134528c.emit(null, this);
    }
}
