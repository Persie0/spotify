package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rau0 extends ibk {

    /* JADX INFO: renamed from: a */
    public lau0 f197384a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f197385b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wau0 f197386c;

    /* JADX INFO: renamed from: d */
    public int f197387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rau0(wau0 wau0Var, fbk fbkVar) {
        super(fbkVar);
        this.f197386c = wau0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197385b = obj;
        this.f197387d |= Integer.MIN_VALUE;
        return this.f197386c.m87616d(false, null, null, this);
    }
}
