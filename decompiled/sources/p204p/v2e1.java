package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class v2e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public xve f236624a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f236625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w2e1 f236626c;

    /* JADX INFO: renamed from: d */
    public int f236627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2e1(w2e1 w2e1Var, fbk fbkVar) {
        super(fbkVar);
        this.f236626c = w2e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236625b = obj;
        this.f236627d |= Integer.MIN_VALUE;
        return this.f236626c.m87074b(null, this);
    }
}
