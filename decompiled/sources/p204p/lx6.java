package p204p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lx6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f137732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f137733c;

    public /* synthetic */ lx6(Object obj, int i, int i2) {
        this.f137731a = i2;
        this.f137733c = obj;
        this.f137732b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f137731a) {
            case 0:
                mx6 mx6Var = (mx6) this.f137733c;
                mx6Var.f147970b.onAudioFocusChange(this.f137732b);
                return;
            case 1:
                fw40 fw40Var = (fw40) this.f137733c;
                int i = this.f137732b;
                j57 j57Var = (j57) fw40Var.f73935c;
                String str = h0b1.f86200a;
                j57Var.mo29555g(i);
                return;
            case 2:
                ((wdb) this.f137733c).mo80439a(this.f137732b);
                return;
            case 3:
                LinkedHashSet<vg61> linkedHashSet = (LinkedHashSet) this.f137733c;
                int i2 = this.f137732b;
                for (vg61 vg61Var : linkedHashSet) {
                    if (i2 == 5) {
                        synchronized (vg61Var.f241164p) {
                            try {
                                if (vg61Var.m85400m() && vg61Var.f241165q != null) {
                                    vg61Var.m85399l("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it = vg61Var.f241165q.iterator();
                                    while (it.hasNext()) {
                                        ((mjq) it.next()).mo61983a();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        vg61Var.getClass();
                    }
                }
                return;
            case 4:
                ((Consumer) this.f137733c).accept(Integer.valueOf(this.f137732b));
                return;
            case 5:
                qjx qjxVar = (qjx) this.f137733c;
                int i3 = this.f137732b;
                xwo xwoVar = qjxVar.f189334U0;
                int i4 = qjxVar.f189343a[i3].f242300a.f160288b;
                xwoVar.m92297Z(xwoVar.m92296Y(), 1033, new pwo(14));
                return;
            case 6:
                ((feb1) this.f137733c).onStatus(this.f137732b);
                return;
            case 7:
                jcd0 jcd0Var = (jcd0) this.f137733c;
                int i5 = this.f137732b;
                zj5 zj5Var = jcd0Var.f111089k;
                zj5Var.remove(Integer.valueOf(i5));
                jcd0Var.f111090l.delete(i5);
                n301 n301Var = jcd0Var.f111092n;
                if (n301Var == null || n301Var.f149897a.f161204c >= 5 || !zj5Var.isEmpty()) {
                    return;
                }
                jcd0Var.f111091m.postDelayed(new gcd0(jcd0Var, 1), 500L);
                return;
            default:
                ((hv90) this.f137733c).mo48758x(this.f137732b);
                return;
        }
    }

    public /* synthetic */ lx6(qjx qjxVar, int i, boolean z) {
        this.f137731a = 5;
        this.f137733c = qjxVar;
        this.f137732b = i;
    }
}
