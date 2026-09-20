package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xmu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263450a;

    /* JADX INFO: renamed from: b */
    public int f263451b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f263452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f263452c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263450a = obj;
        this.f263451b |= Integer.MIN_VALUE;
        return this.f263452c.emit(null, this);
    }
}
