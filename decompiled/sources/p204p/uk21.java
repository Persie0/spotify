package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uk21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vk21 f231206b;

    /* JADX INFO: renamed from: c */
    public int f231207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk21(vk21 vk21Var, ibk ibkVar) {
        super(ibkVar);
        this.f231206b = vk21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231205a = obj;
        this.f231207c |= Integer.MIN_VALUE;
        return vk21.m85794e(this.f231206b, null, null, this);
    }
}
