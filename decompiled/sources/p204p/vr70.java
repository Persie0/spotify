package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vr70 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f244094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f244095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr70(int i, float f, float f2) {
        super(0);
        this.f244093a = i;
        this.f244094b = f;
        this.f244095c = f2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new ur70(this.f244093a, this.f244094b, this.f244095c);
    }
}
