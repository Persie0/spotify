package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class jmd0 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final Messenger f113831a;

    /* JADX INFO: renamed from: b */
    public final int f113832b;

    /* JADX INFO: renamed from: c */
    public final String f113833c;

    /* JADX INFO: renamed from: d */
    public uld0 f113834d;

    /* JADX INFO: renamed from: e */
    public long f113835e;

    /* JADX INFO: renamed from: f */
    public final SparseArray f113836f = new SparseArray();

    /* JADX INFO: renamed from: g */
    public final pj70 f113837g = new pj70(this, 20);

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xpo f113838h;

    public jmd0(xpo xpoVar, Messenger messenger, int i, String str) {
        this.f113838h = xpoVar;
        this.f113831a = messenger;
        this.f113832b = i;
        this.f113833c = str;
    }

    /* JADX INFO: renamed from: a */
    public Bundle mo45228a(fmd0 fmd0Var) {
        return lmd0.m59425a(fmd0Var, this.f113832b);
    }

    /* JADX INFO: renamed from: b */
    public Bundle mo45229b(String str, cmd0 cmd0Var, int i) {
        zld0 zld0VarMo36410a;
        lmd0 lmd0Var = (lmd0) this.f113838h.f264693c;
        SparseArray sparseArray = this.f113836f;
        if (sparseArray.indexOfKey(i) >= 0 || (zld0VarMo36410a = lmd0Var.f134950d.mo36410a(str)) == null) {
            return null;
        }
        zld0VarMo36410a.m96361o(lzj.m60328F(lmd0Var.getApplicationContext()), this.f113837g);
        sparseArray.put(i, zld0VarMo36410a);
        Bundle bundle = new Bundle();
        bundle.putString("groupableTitle", null);
        bundle.putString("transferableTitle", null);
        return bundle;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((lmd0) this.f113838h.f264693c).f134948b.obtainMessage(1, this.f113831a).sendToTarget();
    }

    /* JADX INFO: renamed from: c */
    public boolean mo45230c(String str, String str2, cmd0 cmd0Var, int i) {
        lmd0 lmd0Var = (lmd0) this.f113838h.f264693c;
        SparseArray sparseArray = this.f113836f;
        if (sparseArray.indexOfKey(i) >= 0) {
            return false;
        }
        amd0 amd0VarMo36411c = str2 == null ? lmd0Var.f134950d.mo36411c(str) : lmd0Var.f134950d.mo36412d(str, str2);
        if (amd0VarMo36411c == null) {
            return false;
        }
        sparseArray.put(i, amd0VarMo36411c);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void mo45231d() {
        SparseArray sparseArray = this.f113836f;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((amd0) sparseArray.valueAt(i)).mo26392e();
        }
        sparseArray.clear();
        this.f113831a.getBinder().unlinkToDeath(this, 0);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Objects.equals(this.f113834d, null)) {
            return;
        }
        this.f113834d = null;
        this.f113835e = jElapsedRealtime;
        this.f113838h.m91717r();
    }

    /* JADX INFO: renamed from: e */
    public final amd0 m53773e(int i) {
        return (amd0) this.f113836f.get(i);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo45232f(int i) {
        SparseArray sparseArray = this.f113836f;
        amd0 amd0Var = (amd0) sparseArray.get(i);
        if (amd0Var == null) {
            return false;
        }
        sparseArray.remove(i);
        amd0Var.mo26392e();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void mo45233g(zld0 zld0Var, tld0 tld0Var, Collection collection) {
        SparseArray sparseArray = this.f113836f;
        int iIndexOfValue = sparseArray.indexOfValue(zld0Var);
        if (iIndexOfValue < 0) {
            Objects.toString(zld0Var);
            return;
        }
        int iKeyAt = sparseArray.keyAt(iIndexOfValue);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xld0 xld0Var = (xld0) it.next();
            if (xld0Var.f263110f == null) {
                Bundle bundle = new Bundle();
                xld0Var.f263110f = bundle;
                bundle.putBundle("mrDescriptor", xld0Var.f263105a.f221451a);
                xld0Var.f263110f.putInt("selectionState", xld0Var.f263106b);
                xld0Var.f263110f.putBoolean("isUnselectable", xld0Var.f263107c);
                xld0Var.f263110f.putBoolean("isGroupable", xld0Var.f263108d);
                xld0Var.f263110f.putBoolean("isTransferable", xld0Var.f263109e);
            }
            arrayList.add(xld0Var.f263110f);
        }
        Bundle bundle2 = new Bundle();
        if (tld0Var != null) {
            bundle2.putParcelable("groupRoute", tld0Var.f221451a);
        }
        bundle2.putParcelableArrayList("dynamicRoutes", arrayList);
        lmd0.m59427d(this.f113831a, 7, 0, iKeyAt, bundle2, null);
    }

    public final String toString() {
        int i = lmd0.f134946f;
        return "Client connection " + this.f113831a.getBinder().toString();
    }
}
