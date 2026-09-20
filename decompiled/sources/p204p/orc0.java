package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class orc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public m500 f168531a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f168532b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qrc0 f168533c;

    /* JADX INFO: renamed from: d */
    public int f168534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orc0(qrc0 qrc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f168533c = qrc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168532b = obj;
        this.f168534d |= Integer.MIN_VALUE;
        return qrc0.m73614b(this.f168533c, null, this);
    }
}
