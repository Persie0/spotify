package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class v871 extends ibk {

    /* JADX INFO: renamed from: a */
    public qlv0 f238423a;

    /* JADX INFO: renamed from: b */
    public qlv0 f238424b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f238425c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ d971 f238426d;

    /* JADX INFO: renamed from: e */
    public int f238427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v871(d971 d971Var, ibk ibkVar) {
        super(ibkVar);
        this.f238426d = d971Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238425c = obj;
        this.f238427e |= Integer.MIN_VALUE;
        return d971.m35321a(this.f238426d, null, this);
    }
}
