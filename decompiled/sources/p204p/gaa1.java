package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gaa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78010a;

    /* JADX INFO: renamed from: b */
    public int f78011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f78012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaa1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f78012c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78010a = obj;
        this.f78011b |= Integer.MIN_VALUE;
        return this.f78012c.emit(null, this);
    }
}
