package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cvv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42552a;

    /* JADX INFO: renamed from: b */
    public int f42553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f42554c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvv0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f42554c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42552a = obj;
        this.f42553b |= Integer.MIN_VALUE;
        return this.f42554c.emit(null, this);
    }
}
