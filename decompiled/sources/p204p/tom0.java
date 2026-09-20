package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tom0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f222286a;

    /* JADX INFO: renamed from: b */
    public n05 f222287b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f222288c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xom0 f222289d;

    /* JADX INFO: renamed from: e */
    public int f222290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tom0(xom0 xom0Var, fbk fbkVar) {
        super(fbkVar);
        this.f222289d = xom0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222288c = obj;
        this.f222290e |= Integer.MIN_VALUE;
        return this.f222289d.m91550f(0, null, this);
    }
}
