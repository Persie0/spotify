package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qr3 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f191718a;

    /* JADX INFO: renamed from: b */
    public tf60 f191719b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f191720c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tr3 f191721d;

    /* JADX INFO: renamed from: e */
    public int f191722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr3(tr3 tr3Var, fbk fbkVar) {
        super(fbkVar);
        this.f191721d = tr3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191720c = obj;
        this.f191722e |= Integer.MIN_VALUE;
        return this.f191721d.emit(null, this);
    }
}
