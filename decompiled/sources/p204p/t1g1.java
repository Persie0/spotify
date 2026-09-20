package p204p;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class t1g1 extends dag1 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f216262m = 0;

    /* JADX INFO: renamed from: n */
    public final WeakReference f216263n;

    /* JADX INFO: renamed from: o */
    public final WeakReference f216264o;

    public t1g1(HashMap map, Object obj, x5g1 x5g1Var) {
        super(x5g1Var);
        this.f216263n = new WeakReference(map);
        this.f216264o = new WeakReference(obj);
    }

    @Override // p204p.e6f1, p204p.k0g1
    /* JADX INFO: renamed from: r1 */
    public final void mo25472r1(Status status) {
        switch (this.f216262m) {
            case 0:
                Map map = (Map) this.f216263n.get();
                Object obj = this.f216264o.get();
                status.getClass();
                if (!status.m1489k() && map != null && obj != null) {
                    synchronized (map) {
                        try {
                            beg1 beg1Var = (beg1) map.remove(obj);
                            if (beg1Var != null) {
                                beg1Var.m28928c2();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                m35481c2(status);
                return;
            default:
                Map map2 = (Map) this.f216263n.get();
                Object obj2 = this.f216264o.get();
                status.getClass();
                if (status.f1842a == 4002 && map2 != null && obj2 != null) {
                    synchronized (map2) {
                        try {
                            beg1 beg1Var2 = (beg1) map2.remove(obj2);
                            if (beg1Var2 != null) {
                                beg1Var2.m28928c2();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                m35481c2(status);
                return;
        }
    }

    public t1g1(HashMap map, Object obj, x5g1 x5g1Var, byte b) {
        super(x5g1Var);
        this.f216263n = new WeakReference(map);
        this.f216264o = new WeakReference(obj);
    }
}
