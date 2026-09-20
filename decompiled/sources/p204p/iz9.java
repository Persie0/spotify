package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class iz9 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f107170a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f107171b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jz9 f107172c;

    /* JADX INFO: renamed from: d */
    public int f107173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz9(jz9 jz9Var, fbk fbkVar) {
        super(fbkVar);
        this.f107172c = jz9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107171b = obj;
        this.f107173d |= Integer.MIN_VALUE;
        return this.f107172c.categorize(null, this);
    }
}
