package p204p;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class umd0 {

    /* JADX INFO: renamed from: a */
    public final amd0 f231826a;

    /* JADX INFO: renamed from: b */
    public final int f231827b;

    /* JADX INFO: renamed from: c */
    public final boolean f231828c;

    /* JADX INFO: renamed from: d */
    public final wmd0 f231829d;

    /* JADX INFO: renamed from: e */
    public final wmd0 f231830e;

    /* JADX INFO: renamed from: f */
    public final wmd0 f231831f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f231832g;

    /* JADX INFO: renamed from: h */
    public final WeakReference f231833h;

    /* JADX INFO: renamed from: i */
    public boolean f231834i = false;

    /* JADX INFO: renamed from: j */
    public boolean f231835j = false;

    public umd0(mg10 mg10Var, wmd0 wmd0Var, amd0 amd0Var, int i, boolean z, wmd0 wmd0Var2, Collection collection) {
        this.f231833h = new WeakReference(mg10Var);
        this.f231830e = wmd0Var;
        this.f231826a = amd0Var;
        this.f231827b = i;
        this.f231828c = z;
        this.f231829d = mg10Var.f143262d;
        this.f231831f = wmd0Var2;
        this.f231832g = collection == null ? null : new ArrayList(collection);
        mg10Var.f143259a.postDelayed(new ig10(this, 18), 15000L);
    }

    /* JADX INFO: renamed from: a */
    public final void m83430a() {
        if (this.f231834i || this.f231835j) {
            return;
        }
        this.f231835j = true;
        amd0 amd0Var = this.f231826a;
        if (amd0Var != null) {
            amd0Var.mo26396i(0);
            amd0Var.mo26392e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83431b() {
        zmd0.m96426b();
        if (this.f231834i || this.f231835j) {
            return;
        }
        WeakReference weakReference = this.f231833h;
        mg10 mg10Var = (mg10) weakReference.get();
        if (mg10Var == null || mg10Var.f143264f != this) {
            m83430a();
            return;
        }
        this.f231834i = true;
        mg10Var.f143264f = null;
        mg10 mg10Var2 = (mg10) weakReference.get();
        wmd0 wmd0Var = this.f231829d;
        int i = this.f231827b;
        if (mg10Var2 != null) {
            HashMap map = mg10Var2.f143260b;
            if (mg10Var2.f143262d == wmd0Var) {
                Message messageObtainMessage = mg10Var2.f143259a.obtainMessage(263, wmd0Var);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.sendToTarget();
                amd0 amd0Var = mg10Var2.f143263e;
                if (amd0Var != null) {
                    amd0Var.mo26396i(i);
                    mg10Var2.f143263e.mo26392e();
                }
                if (!map.isEmpty()) {
                    for (amd0 amd0Var2 : map.values()) {
                        amd0Var2.mo26396i(i);
                        amd0Var2.mo26392e();
                    }
                    map.clear();
                }
                mg10Var2.f143263e = null;
            }
        }
        mg10 mg10Var3 = (mg10) weakReference.get();
        if (mg10Var3 == null) {
            return;
        }
        eg10 eg10Var = mg10Var3.f143259a;
        wmd0 wmd0Var2 = this.f231830e;
        mg10Var3.f143262d = wmd0Var2;
        mg10Var3.f143263e = this.f231826a;
        boolean z = this.f231828c;
        wmd0 wmd0Var3 = this.f231831f;
        if (wmd0Var3 == null) {
            eg10Var.getClass();
            Message messageObtainMessage2 = eg10Var.obtainMessage(262, new lg10(wmd0Var, wmd0Var2, z));
            messageObtainMessage2.arg1 = i;
            messageObtainMessage2.sendToTarget();
        } else {
            eg10Var.getClass();
            Message messageObtainMessage3 = eg10Var.obtainMessage(264, new lg10(wmd0Var3, wmd0Var2, z));
            messageObtainMessage3.arg1 = i;
            messageObtainMessage3.sendToTarget();
        }
        mg10Var3.f143260b.clear();
        mg10Var3.m61671j();
        mg10Var3.m61675n();
        ArrayList arrayList = this.f231832g;
        if (arrayList != null) {
            wmd0 wmd0Var4 = mg10Var3.f143262d;
            wmd0Var4.getClass();
            tmd0 tmd0Var = wmd0Var4 instanceof tmd0 ? (tmd0) wmd0Var4 : null;
            if (tmd0Var != null) {
                tmd0Var.m81128q(arrayList);
            }
        }
    }
}
