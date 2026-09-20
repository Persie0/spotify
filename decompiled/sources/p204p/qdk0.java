package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class qdk0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sdk0 f187705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdk0(sdk0 sdk0Var, int i) {
        super(1);
        this.f187704a = i;
        this.f187705b = sdk0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f187704a) {
            case 0:
                m7i0 m7i0Var = this.f187705b.f208028b;
                m7i0Var.getClass();
                return new tai0((Context) obj, m7i0Var.f140792j);
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f187705b.f208028b.getClass();
                return new s9p0(zBooleanValue);
        }
    }
}
