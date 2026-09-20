package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rdk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sdk0 f198163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rdk0(sdk0 sdk0Var, int i) {
        super(0);
        this.f198162a = i;
        this.f198163b = sdk0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f198162a) {
            case 0:
                return this.f198163b.f208032f;
            default:
                return this.f198163b.f208027a.path();
        }
    }
}
