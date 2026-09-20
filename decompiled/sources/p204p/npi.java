package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class npi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157001a;

    /* JADX INFO: renamed from: b */
    public int f157002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f157003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f157003c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157001a = obj;
        this.f157002b |= Integer.MIN_VALUE;
        return this.f157003c.emit(null, this);
    }
}
