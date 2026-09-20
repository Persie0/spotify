package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m420 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139793a;

    /* JADX INFO: renamed from: b */
    public int f139794b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eyi f139795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m420(eyi eyiVar, fbk fbkVar) {
        super(fbkVar);
        this.f139795c = eyiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139793a = obj;
        this.f139794b |= Integer.MIN_VALUE;
        return this.f139795c.emit(null, this);
    }
}
