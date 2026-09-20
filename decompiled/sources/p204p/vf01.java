package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vf01 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f240863a;

    /* JADX INFO: renamed from: b */
    public Object f240864b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f240865c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wf01 f240866d;

    /* JADX INFO: renamed from: e */
    public int f240867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf01(wf01 wf01Var, ibk ibkVar) {
        super(ibkVar);
        this.f240866d = wf01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240865c = obj;
        this.f240867e |= Integer.MIN_VALUE;
        return this.f240866d.m87918a(null, null, null, this);
    }
}
