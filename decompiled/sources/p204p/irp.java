package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes8.dex */
public final class irp extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105024a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f105025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f105026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ irp(eh00 eh00Var, kqi0 kqi0Var, int i) {
        super(1);
        this.f105024a = i;
        this.f105025b = eh00Var;
        this.f105026c = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f105024a) {
            case 0:
                if (Offset.m253c(((Offset) obj).f493a, 0L)) {
                    kqi0 kqi0Var = this.f105026c;
                    if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                        kqi0Var.setValue(Boolean.FALSE);
                        this.f105025b.invoke();
                    }
                }
                break;
            default:
                this.f105026c.setValue(Boolean.FALSE);
                this.f105025b.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
