package p204p;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eg10 extends Handler {

    /* JADX INFO: renamed from: a */
    public final ArrayList f59196a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f59197b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mg10 f59198c;

    public eg10(mg10 mg10Var) {
        this.f59198c = mg10Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:79:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m38768a(rmd0 rmd0Var, int i, Object obj, int i2) {
        wmd0 wmd0Var;
        wmd0 wmd0Var2;
        wmd0 wmd0Var3;
        wmd0 wmd0Var4;
        boolean zM88557d;
        dnd0 dnd0Var;
        boolean z;
        zmd0 zmd0Var = rmd0Var.f200502a;
        qmd0 qmd0Var = rmd0Var.f200503b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    qmd0Var.getClass();
                }
                return;
            }
            vmd0 vmd0Var = (vmd0) obj;
            switch (i) {
                case 513:
                    qmd0Var.mo45297a(vmd0Var);
                    break;
                case 514:
                    qmd0Var.mo45299c(vmd0Var);
                    break;
                case 515:
                    qmd0Var.mo45298b(vmd0Var);
                    break;
            }
        }
        if (i != 264 && i != 262) {
            if (i == 265 || i == 266) {
                kg10 kg10Var = (kg10) obj;
                wmd0Var = kg10Var.f122274a;
                wmd0Var2 = kg10Var.f122275b;
            } else {
                wmd0Var4 = (wmd0) obj;
                wmd0Var3 = null;
            }
            if (wmd0Var4 != null) {
                zM88557d = true;
                if ((rmd0Var.f200505d & 2) == 0 && !wmd0Var4.m88560g(rmd0Var.f200504c)) {
                    dnd0Var = zmd0.m96427c().f143279u;
                    if (dnd0Var == null) {
                        z = false;
                    } else {
                        z = dnd0Var.f50761c;
                    }
                    if (!z && wmd0Var4.m88557d() && i == 262 && i2 == 3 && wmd0Var3 != null) {
                        zM88557d = true ^ wmd0Var3.m88557d();
                    } else {
                        zM88557d = false;
                    }
                }
                if (zM88557d) {
                    switch (i) {
                        case 257:
                            qmd0Var.mo45068d(zmd0Var, wmd0Var4);
                            break;
                        case 258:
                            qmd0Var.mo45072h(zmd0Var, wmd0Var4);
                            break;
                        case 259:
                            qmd0Var.mo45069e(zmd0Var, wmd0Var4);
                            break;
                        case 260:
                            qmd0Var.getClass();
                            break;
                        case 261:
                            qmd0Var.getClass();
                            break;
                        case 262:
                            qmd0Var.mo45073j(zmd0Var, wmd0Var4, i2, wmd0Var4);
                            break;
                        case 263:
                            qmd0Var.mo45074k(zmd0Var, wmd0Var4, i2);
                            break;
                        case 264:
                            qmd0Var.mo45073j(zmd0Var, wmd0Var4, i2, wmd0Var3);
                            break;
                        case 265:
                            qmd0Var.mo45070f(wmd0Var3, wmd0Var4);
                            break;
                        case 266:
                            qmd0Var.mo45071g(wmd0Var3, wmd0Var4, i2);
                            break;
                    }
                }
                return;
            }
        }
        lg10 lg10Var = (lg10) obj;
        wmd0Var = lg10Var.f133050b;
        wmd0Var2 = lg10Var.f133049a;
        wmd0 wmd0Var5 = wmd0Var;
        wmd0Var3 = wmd0Var2;
        wmd0Var4 = wmd0Var5;
        if (wmd0Var4 != null) {
            zM88557d = true;
            if ((rmd0Var.f200505d & 2) == 0) {
                dnd0Var = zmd0.m96427c().f143279u;
                if (dnd0Var == null) {
                    z = false;
                } else {
                    z = dnd0Var.f50761c;
                }
                if (!z) {
                    zM88557d = false;
                } else {
                    zM88557d = false;
                }
            }
            if (zM88557d) {
                return;
            }
            switch (i) {
                case 257:
                    qmd0Var.mo45068d(zmd0Var, wmd0Var4);
                    break;
                case 258:
                    qmd0Var.mo45072h(zmd0Var, wmd0Var4);
                    break;
                case 259:
                    qmd0Var.mo45069e(zmd0Var, wmd0Var4);
                    break;
                case 260:
                    qmd0Var.getClass();
                    break;
                case 261:
                    qmd0Var.getClass();
                    break;
                case 262:
                    qmd0Var.mo45073j(zmd0Var, wmd0Var4, i2, wmd0Var4);
                    break;
                case 263:
                    qmd0Var.mo45074k(zmd0Var, wmd0Var4, i2);
                    break;
                case 264:
                    qmd0Var.mo45073j(zmd0Var, wmd0Var4, i2, wmd0Var3);
                    break;
                case 265:
                    qmd0Var.mo45070f(wmd0Var3, wmd0Var4);
                    break;
                case 266:
                    qmd0Var.mo45071g(wmd0Var3, wmd0Var4, i2);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m38769b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iM50356l;
        ArrayList arrayList = this.f59196a;
        mg10 mg10Var = this.f59198c;
        ArrayList arrayList2 = mg10Var.f143266h;
        ido0 ido0Var = mg10Var.f143277s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && mg10Var.m61669h().f252812c.equals(((wmd0) obj).f252812c)) {
            mg10Var.m61678q(true);
        }
        ArrayList arrayList3 = this.f59197b;
        if (i == 262) {
            lg10 lg10Var = (lg10) obj;
            wmd0 wmd0Var = lg10Var.f133050b;
            if (lg10Var.f133051c) {
                ido0Var.m50361r(wmd0Var);
            }
            if (mg10Var.f143280v != null && wmd0Var.m88557d()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ido0Var.m50360q((wmd0) it.next());
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    ido0Var.m50359p((wmd0) obj);
                    break;
                case 258:
                    ido0Var.m50360q((wmd0) obj);
                    break;
                case 259:
                    wmd0 wmd0Var2 = (wmd0) obj;
                    ido0Var.getClass();
                    if (wmd0Var2.m88555b() != ido0Var && (iM50356l = ido0Var.m50356l(wmd0Var2)) >= 0) {
                        ido0.m50352u((ldo0) ido0Var.f101192P0.get(iM50356l));
                    }
                    break;
            }
        } else {
            lg10 lg10Var2 = (lg10) obj;
            wmd0 wmd0Var3 = lg10Var2.f133050b;
            arrayList3.add(wmd0Var3);
            ido0Var.m50359p(wmd0Var3);
            if (lg10Var2.f133051c) {
                ido0Var.m50361r(wmd0Var3);
            }
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m38768a((rmd0) it2.next(), i, obj, i2);
                    }
                    return;
                } else {
                    zmd0 zmd0Var = (zmd0) ((WeakReference) arrayList2.get(size)).get();
                    if (zmd0Var == null) {
                        arrayList2.remove(size);
                    } else {
                        arrayList.addAll(zmd0Var.f284252b);
                    }
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}
