package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jfa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111870a;

    /* JADX INFO: renamed from: b */
    public int f111871b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f111872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfa1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f111872c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111870a = obj;
        this.f111871b |= Integer.MIN_VALUE;
        return this.f111872c.emit(null, this);
    }
}
