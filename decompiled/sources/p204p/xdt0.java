package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xdt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f260533a;

    /* JADX INFO: renamed from: b */
    public int f260534b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f260535c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ owp f260536d;

    /* JADX INFO: renamed from: e */
    public int f260537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdt0(owp owpVar, fbk fbkVar) {
        super(fbkVar);
        this.f260536d = owpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260535c = obj;
        this.f260537e |= Integer.MIN_VALUE;
        return this.f260536d.m68179e(null, this);
    }
}
