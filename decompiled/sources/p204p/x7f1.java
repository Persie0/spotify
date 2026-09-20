package p204p;

import android.os.Looper;
import android.os.Parcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x7f1 extends kv30 {
    public x7f1() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 3);
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            imk0 imk0Var = new imk0((aif1) this);
            parcel2.writeNoException();
            fmf1.m42108c(parcel2, imk0Var);
            return true;
        }
        if (i == 2) {
            aif1 aif1Var = (aif1) this;
            aif1.f15984n.m83850c("onAppEnteredForeground", new Object[0]);
            aif1Var.f15987m = 1;
            Iterator it = aif1Var.f15986l.iterator();
            while (it.hasNext()) {
                ((skf1) it.next()).f210090a.m96324m();
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        aif1 aif1Var2 = (aif1) this;
        aif1.f15984n.m83850c("onAppEnteredBackground", new Object[0]);
        aif1Var2.f15987m = 2;
        Iterator it2 = aif1Var2.f15986l.iterator();
        while (it2.hasNext()) {
            zkf1 zkf1Var = ((skf1) it2.next()).f210090a;
            zkf1Var.getClass();
            zkf1.f283741f.m83848a("Stopping RouteDiscovery.", new Object[0]);
            zkf1Var.f283744c.clear();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                zkf1Var.f283746e.m78953h(zkf1Var);
            } else {
                new ywh0(Looper.getMainLooper(), 5).post(new ukf1(zkf1Var, 1));
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
