package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q5u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185602a;

    /* JADX INFO: renamed from: b */
    public int f185603b;

    /* JADX INFO: renamed from: c */
    public niz f185604c;

    /* JADX INFO: renamed from: d */
    public int f185605d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l5u f185606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5u(l5u l5uVar, fbk fbkVar) {
        super(fbkVar);
        this.f185606e = l5uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185602a = obj;
        this.f185603b |= Integer.MIN_VALUE;
        return this.f185606e.emit(null, this);
    }
}
