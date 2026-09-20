package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ei3 implements qwh0 {

    /* JADX INFO: renamed from: b */
    public static final ei3 f59776b = new ei3(0);

    /* JADX INFO: renamed from: c */
    public static final ei3 f59777c = new ei3(1);

    /* JADX INFO: renamed from: d */
    public static final ei3 f59778d = new ei3(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59779a;

    public /* synthetic */ ei3(int i) {
        this.f59779a = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        switch (this.f59779a) {
            case 0:
                ph3 ph3Var = (ph3) obj;
                fa80 fa80Var = ph3Var.f177455c;
                dw50 dw50Var = ph3Var.f177454b.f117620c;
                boolean z3 = false;
                if ((dw50Var instanceof i6a0) || (dw50Var instanceof xv50) || (dw50Var instanceof yv50)) {
                    z = true;
                } else {
                    z = dw50Var instanceof zv50 ? ((zv50) dw50Var).f286619a instanceof i6a0 : false;
                }
                if (((!z || fa80Var.m41144c(a6q0.f12841a) == null || fa80Var.m41144c(oo50.f167466a) == null) ? false : true) && fa80Var.m41144c(rx20.f203471a) != null) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 1:
                h2f h2fVar = (h2f) obj;
                return Boolean.valueOf((h2fVar.f86962a instanceof v6m0) && (h2fVar.f86964c instanceof ht41));
            default:
                ph3 ph3Var2 = (ph3) obj;
                fa80 fa80Var2 = ph3Var2.f177455c;
                dw50 dw50Var2 = ph3Var2.f177454b.f117620c;
                boolean z4 = false;
                if ((dw50Var2 instanceof i6a0) || (dw50Var2 instanceof xv50) || (dw50Var2 instanceof yv50)) {
                    z2 = true;
                } else {
                    z2 = dw50Var2 instanceof zv50 ? ((zv50) dw50Var2).f286619a instanceof i6a0 : false;
                }
                if (z2 && fa80Var2.m41144c(a6q0.f12841a) != null && fa80Var2.m41144c(oo50.f167466a) != null) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
        }
    }
}
