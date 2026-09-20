package p204p;

import android.graphics.Bitmap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class nfb implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f153309b;

    public /* synthetic */ nfb(kqi0 kqi0Var, int i) {
        this.f153308a = i;
        this.f153309b = kqi0Var;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f153308a) {
            case 0:
                Bitmap bitmap = (Bitmap) this.f153309b.getValue();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                break;
            case 1:
                vjx0 vjx0Var = (vjx0) this.f153309b.getValue();
                if (vjx0Var != null) {
                    ar91 ar91Var = vjx0Var.f242085f;
                    ar91Var.mo26921b(vjx0Var);
                    Iterator it = vjx0Var.f242086g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            nwr nwrVar = ar91Var instanceof nwr ? (nwr) ar91Var : null;
                            if (nwrVar != null) {
                                nwrVar.dispose();
                            }
                            vjx0Var.f242081b.m25876m(vjx0Var);
                            kk40.m56680v(vjx0Var.f242082c, null);
                            break;
                        } else {
                            ar91 ar91Var2 = (ar91) it.next();
                            nwr nwrVar2 = ar91Var2 instanceof nwr ? (nwr) ar91Var2 : null;
                            if (nwrVar2 != null) {
                                nwrVar2.dispose();
                            }
                        }
                    }
                }
                break;
            case 2:
                this.f153309b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f153309b.setValue(Boolean.FALSE);
                break;
            default:
                this.f153309b.setValue(Boolean.FALSE);
                break;
        }
    }
}
