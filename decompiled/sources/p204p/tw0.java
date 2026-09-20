package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224286a;

    /* JADX INFO: renamed from: b */
    public int f224287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f224288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f224288c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224286a = obj;
        this.f224287b |= Integer.MIN_VALUE;
        return this.f224288c.emit(null, this);
    }
}
