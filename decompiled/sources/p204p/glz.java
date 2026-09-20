package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class glz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81227a;

    /* JADX INFO: renamed from: b */
    public int f81228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f81229c;

    /* JADX INFO: renamed from: d */
    public Object f81230d;

    /* JADX INFO: renamed from: e */
    public niz f81231e;

    /* JADX INFO: renamed from: f */
    public int f81232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glz(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f81229c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81227a = obj;
        this.f81228b |= Integer.MIN_VALUE;
        return this.f81229c.emit(null, this);
    }
}
