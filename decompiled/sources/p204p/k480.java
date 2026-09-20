package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k480 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119132a;

    /* JADX INFO: renamed from: b */
    public int f119133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sn2 f119134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k480(sn2 sn2Var, fbk fbkVar) {
        super(fbkVar);
        this.f119134c = sn2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119132a = obj;
        this.f119133b |= Integer.MIN_VALUE;
        return this.f119134c.emit(null, this);
    }
}
