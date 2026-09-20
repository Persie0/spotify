package p204p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class vmz0 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f242954a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f242955b;

    /* JADX INFO: renamed from: c */
    public final m500 f242956c;

    public vmz0(z9j0 z9j0Var, k5m0 k5m0Var, m500 m500Var) {
        this.f242954a = z9j0Var;
        this.f242955b = k5m0Var;
        this.f242956c = m500Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m86027a(String str) {
        Set set = dd41.f47702f;
        String strM35712j = r46.m74726U(str).m35712j();
        if (strM35712j == null) {
            strM35712j = "";
        }
        String strConcat = "spotify:readalong:selection:".concat(strM35712j);
        Bundle bundleM70529j = pp91.m70529j(new pqm0("selectionParams", new rnz0(str)));
        m500 m500Var = this.f242956c;
        z9j0 z9j0Var = this.f242954a;
        if (!z9j0Var.mo47349j(m500Var)) {
            k5m0.m55541i(this.f242955b, strConcat, null, bundleM70529j, false, 10);
        } else {
            if (strConcat == null) {
                throw new IllegalStateException("uri was not set!");
            }
            z9j0Var.mo47348i(new p6j0(strConcat, "", false, false, 0, 0, false, null, null, null), bundleM70529j);
        }
    }
}
