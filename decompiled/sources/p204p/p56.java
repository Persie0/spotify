package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class p56 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ voc1 f174083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p56(voc1 voc1Var, int i) {
        super(1);
        this.f174082a = i;
        this.f174083b = voc1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f174082a) {
            case 0:
                return new e56(((qt5) obj).f192293a, this.f174083b.f243453a);
            case 1:
                pig0 pig0Var = (pig0) obj;
                String str = this.f174083b.f243453a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), pig0Var.f177967a, st91.f213865b, System.currentTimeMillis());
            case 2:
                qig0 qig0Var = (qig0) obj;
                String str2 = this.f174083b.f243453a;
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str2 != null ? str2.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), qig0Var.f189013a, st91.f213865b, System.currentTimeMillis());
            case 3:
                rig0 rig0Var = (rig0) obj;
                String str3 = this.f174083b.f243453a;
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str3 != null ? str3.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3)), rig0Var.f199539a, st91.f213865b, System.currentTimeMillis());
            case 4:
                v6w0 v6w0Var = (v6w0) obj;
                return new q0k(v6w0Var.f237979a, this.f174083b.f243453a, new r380(v6w0Var, 0), 12);
            case 5:
                return new wn31(((xm31) obj).f263280a, this.f174083b.f243453a);
            case 6:
                v6w0 v6w0Var2 = (v6w0) obj;
                return new q0k(v6w0Var2.f237979a, this.f174083b.f243453a, new r380(v6w0Var2, 1), 12);
            default:
                v6w0 v6w0Var3 = (v6w0) obj;
                return new q0k(v6w0Var3.f237979a, this.f174083b.f243453a, new r380(v6w0Var3, 2), 12);
        }
    }
}
