package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t9l extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f218325b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9l(float f, int i) {
        super(0);
        this.f218324a = i;
        this.f218325b = f;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f218324a) {
            case 0:
                return Float.valueOf(this.f218325b * 0.5f);
            case 1:
                return Float.valueOf(this.f218325b);
            case 2:
                return Float.valueOf(this.f218325b);
            case 3:
                return Float.valueOf(this.f218325b);
            case 4:
                return Float.valueOf(this.f218325b);
            default:
                return Float.valueOf(this.f218325b);
        }
    }
}
