package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class byi0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uyi0 f32248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byi0(uyi0 uyi0Var, int i) {
        super(1);
        this.f32247a = i;
        this.f32248b = uyi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f32247a) {
            case 0:
                break;
        }
        return Boolean.valueOf(!this.f32248b.f235277m.containsKey(Integer.valueOf(((jyi0) obj).f117421h)));
    }
}
