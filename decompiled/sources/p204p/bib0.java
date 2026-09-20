package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class bib0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f27380b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oib0 f27381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bib0(gh00 gh00Var, oib0 oib0Var, int i) {
        super(1);
        this.f27379a = i;
        this.f27380b = gh00Var;
        this.f27381c = oib0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ?? r4;
        switch (this.f27379a) {
            case 0:
                nb71 nb71Var = (nb71) obj;
                oib0 oib0Var = this.f27381c;
                Object stw0Var = null;
                if (oib0Var.f165756b.length() != 0) {
                    if (!oib0Var.f165767m) {
                        ?? r5 = nb71Var.f152205a;
                        if (r5.isEmpty()) {
                            r4 = r5;
                            r4 = 0;
                        }
                        if (r4 != 0) {
                            stw0Var = new ttw0(r4);
                        }
                    } else if (nb71Var.f152206b) {
                        stw0Var = new stw0(oib0Var.f165766l);
                    }
                }
                if (stw0Var != null) {
                    this.f27380b.invoke(stw0Var);
                }
                break;
            case 1:
                this.f27380b.invoke(new sqb0(Collections.singletonMap(new vhc(this.f27381c.f165755a), (utw0) obj)));
                break;
            default:
                this.f27380b.invoke(new sqb0(Collections.singletonMap(new vhc(this.f27381c.f165755a), (utw0) obj)));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bib0(oib0 oib0Var, gh00 gh00Var) {
        super(1);
        this.f27379a = 0;
        this.f27381c = oib0Var;
        this.f27380b = gh00Var;
    }
}
