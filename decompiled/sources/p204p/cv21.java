package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cv21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42275a;

    /* JADX INFO: renamed from: b */
    public int f42276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f42277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f42277c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42275a = obj;
        this.f42276b |= Integer.MIN_VALUE;
        return this.f42277c.emit(null, this);
    }
}
