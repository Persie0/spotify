package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ho2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ io2 f93430b;

    /* JADX INFO: renamed from: c */
    public int f93431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho2(io2 io2Var, ibk ibkVar) {
        super(ibkVar);
        this.f93430b = io2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93429a = obj;
        this.f93431c |= Integer.MIN_VALUE;
        return io2.m51144a(this.f93430b, this);
    }
}
