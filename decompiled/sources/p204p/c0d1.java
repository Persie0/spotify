package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class c0d1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f32748a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f0d1 f32750c;

    /* JADX INFO: renamed from: d */
    public int f32751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0d1(f0d1 f0d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f32750c = f0d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32749b = obj;
        this.f32751d |= Integer.MIN_VALUE;
        return this.f32750c.m40472a(null, this);
    }
}
