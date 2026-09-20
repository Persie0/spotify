package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class iew0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f101568a;

    public iew0(Set set) {
        this.f101568a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hew0 hew0Var = (hew0) it.next();
            HashMap map = this.f101568a;
            hew0Var.getClass();
            map.put(sam.class, hew0Var.f90518a);
        }
    }

    /* JADX INFO: renamed from: a */
    public float m50401a(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = this.f101568a;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: b */
    public void m50402b(IBinder iBinder) {
        o1g1 o1g1Var;
        synchronized (this.f101568a) {
            if (iBinder == null) {
                o1g1Var = null;
            } else {
                try {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    o1g1Var = iInterfaceQueryLocalInterface instanceof o1g1 ? (o1g1) iInterfaceQueryLocalInterface : new o1g1(iBinder);
                } catch (Throwable th) {
                    throw th;
                }
            }
            acg1 acg1Var = new acg1();
            for (Map.Entry entry : this.f101568a.entrySet()) {
                beg1 beg1Var = (beg1) entry.getValue();
                try {
                    lrf1 lrf1Var = new lrf1(beg1Var);
                    Parcel parcelM43604d2 = o1g1Var.m43604d2();
                    int i = qmf1.f190217a;
                    parcelM43604d2.writeStrongBinder(acg1Var);
                    qmf1.m73273c(parcelM43604d2, lrf1Var);
                    o1g1Var.m43603c2(16, parcelM43604d2);
                    if (Log.isLoggable("WearableClient", 3)) {
                        String.valueOf(entry.getKey());
                        String.valueOf(beg1Var);
                    }
                } catch (RemoteException unused) {
                    String.valueOf(entry.getKey());
                    String.valueOf(beg1Var);
                }
            }
        }
    }

    public iew0(int i) {
        switch (i) {
            case 2:
                this.f101568a = new HashMap();
                break;
            default:
                this.f101568a = new HashMap();
                break;
        }
    }
}
