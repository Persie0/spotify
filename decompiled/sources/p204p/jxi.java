package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jxi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117142a;

    /* JADX INFO: renamed from: b */
    public int f117143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f117144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f117144c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117142a = obj;
        this.f117143b |= Integer.MIN_VALUE;
        return this.f117144c.emit(null, this);
    }
}
