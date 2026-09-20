package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pgz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f177431a;

    /* JADX INFO: renamed from: b */
    public ogz0 f177432b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f177433c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rgz0 f177434d;

    /* JADX INFO: renamed from: e */
    public int f177435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgz0(rgz0 rgz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f177434d = rgz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177433c = obj;
        this.f177435e |= Integer.MIN_VALUE;
        return this.f177434d.m75492a(null, this);
    }
}
