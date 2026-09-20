package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class wkp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f252273b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f252274c;

    public /* synthetic */ wkp(Object obj, long j, int i) {
        this.f252272a = i;
        this.f252274c = obj;
        this.f252273b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f252272a) {
            case 0:
                ComposeView composeView = (ComposeView) this.f252274c;
                if (composeView.getHeight() != ((int) (this.f252273b & 4294967295L))) {
                    Iterator it = btz0.m30487K(composeView, o9p.f163104Y0).iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).requestLayout();
                    }
                }
                break;
            case 1:
                ((v4p0) this.f252274c).apply(this.f252273b);
                break;
            default:
                if (!((ik90) this.f252274c).f103072c) {
                    long j = this.f252273b;
                    if (j > 0) {
                        ik90 ik90Var = (ik90) this.f252274c;
                        long j2 = ik90Var.f103074e;
                        long j3 = j + j2;
                        if (j3 < j2) {
                            j3 = Long.MAX_VALUE;
                        }
                        ik90Var.f103074e = j3;
                        if (!ik90Var.f103073d) {
                            ik90Var.f103073d = true;
                            ik90Var.f103071b.m33100g(ik90Var);
                        } else {
                            Object obj = ik90Var.f103075f;
                            if (obj != null) {
                                ik90Var.mo31453b(obj);
                                ((ik90) this.f252274c).f103075f = null;
                            }
                        }
                    } else {
                        ((ik90) this.f252274c).f103072c = true;
                        ik90 ik90Var2 = (ik90) this.f252274c;
                        if (ik90Var2.f103073d) {
                            ik90Var2.f103071b.mo33102k(ik90Var2);
                            ((ik90) this.f252274c).f103073d = false;
                        }
                        ik90 ik90Var3 = (ik90) this.f252274c;
                        ik90Var3.f103075f = null;
                        ik90Var3.f103070a.onError(new IllegalArgumentException("Non-positive request"));
                    }
                    break;
                }
                break;
        }
    }
}
