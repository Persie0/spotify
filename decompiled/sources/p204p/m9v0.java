package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m9v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141392a;

    /* JADX INFO: renamed from: b */
    public int f141393b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f141394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9v0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f141394c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141392a = obj;
        this.f141393b |= Integer.MIN_VALUE;
        return this.f141394c.emit(null, this);
    }
}
