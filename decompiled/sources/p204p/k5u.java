package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k5u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119579a;

    /* JADX INFO: renamed from: b */
    public int f119580b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5u f119581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5u(l5u l5uVar, fbk fbkVar) {
        super(fbkVar);
        this.f119581c = l5uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119579a = obj;
        this.f119580b |= Integer.MIN_VALUE;
        return this.f119581c.emit(null, this);
    }
}
