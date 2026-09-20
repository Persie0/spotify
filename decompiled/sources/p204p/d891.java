package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class d891 extends ibk {

    /* JADX INFO: renamed from: a */
    public b791 f46410a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f46411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i8z f46412c;

    /* JADX INFO: renamed from: d */
    public int f46413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d891(i8z i8zVar, ibk ibkVar) {
        super(ibkVar);
        this.f46412c = i8zVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46411b = obj;
        this.f46413d |= Integer.MIN_VALUE;
        return this.f46412c.m49968e(null, null, null, this);
    }
}
