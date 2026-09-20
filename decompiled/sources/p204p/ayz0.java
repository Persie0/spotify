package p204p;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ayz0 {

    /* JADX INFO: renamed from: a */
    public final zxz0 f21381a;

    public ayz0(ArrayList arrayList, htz0 htz0Var, meb mebVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f21381a = new yxz0(arrayList, htz0Var, mebVar);
        } else {
            this.f21381a = new xxz0(arrayList, htz0Var, mebVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m27559a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((zyl0) it.next()).f287622a.mo31037c());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayz0)) {
            return false;
        }
        return this.f21381a.equals(((ayz0) obj).f21381a);
    }

    public final int hashCode() {
        return this.f21381a.hashCode();
    }
}
