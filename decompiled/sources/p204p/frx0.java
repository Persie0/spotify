package p204p;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Banner;
import androidx.car.app.model.Row;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class frx0 {

    /* JADX INFO: renamed from: d */
    public static final frx0 f72674d;

    /* JADX INFO: renamed from: e */
    public static final frx0 f72675e;

    /* JADX INFO: renamed from: a */
    public final int f72676a;

    /* JADX INFO: renamed from: b */
    public final nox0 f72677b;

    /* JADX INFO: renamed from: c */
    public final boolean f72678c;

    static {
        ojp ojpVar = new ojp();
        ojpVar.f166109c = nox0.f156805g;
        ojpVar.f166108b = 0;
        ojpVar.f166109c = nox0.f156806h;
        ojpVar.f166107a = false;
        frx0 frx0Var = new frx0(ojpVar);
        ojp ojpVar2 = new ojp(frx0Var);
        ojpVar2.f166108b = 2;
        ojpVar2.f166109c = nox0.f156807i;
        ojpVar2.f166107a = false;
        f72674d = new frx0(ojpVar2);
        ojp ojpVar3 = new ojp(frx0Var);
        ojpVar3.f166109c = nox0.f156808j;
        f72675e = new frx0(ojpVar3);
        nox0 nox0Var = nox0.f156805g;
        nox0 nox0Var2 = nox0.f156805g;
        nox0 nox0Var3 = nox0.f156805g;
        nox0 nox0Var4 = nox0.f156805g;
    }

    public frx0(ojp ojpVar) {
        this.f72676a = ojpVar.f166108b;
        this.f72677b = (nox0) ojpVar.f166109c;
        this.f72678c = ojpVar.f166107a;
    }

    /* JADX INFO: renamed from: a */
    public final void m42515a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kr50 kr50Var = (kr50) it.next();
            if (kr50Var instanceof Row) {
                this.f72677b.m65252a((Row) kr50Var);
            } else if (!(kr50Var instanceof ConversationItem) && !(kr50Var instanceof Banner)) {
                throw new IllegalArgumentException("Unsupported item type: ".concat(kr50Var.getClass().getSimpleName()));
            }
        }
    }
}
