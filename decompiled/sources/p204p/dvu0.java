package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dvu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53541a;

    /* JADX INFO: renamed from: b */
    public int f53542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f53543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f53543c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53541a = obj;
        this.f53542b |= Integer.MIN_VALUE;
        return this.f53543c.emit(null, this);
    }
}
