package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class odb {

    /* JADX INFO: renamed from: a */
    public static final odb f164143a = new odb();

    /* JADX INFO: renamed from: a */
    public void mo66742a(jla1 jla1Var, xvb xvbVar) {
        yvb yvbVar = (yvb) jla1Var.mo39830f(jla1.f113573y0, null);
        jvl0 jvl0Var = jvl0.f116366c;
        sy7 sy7Var = yvb.f276629h;
        HashSet hashSet = new HashSet();
        lpi0 lpi0VarM59671t = lpi0.m59671t();
        ArrayList arrayList = new ArrayList();
        nqi0 nqi0VarM65450a = nqi0.m65450a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        jvl0 jvl0VarM54384j = jvl0.m54384j(lpi0VarM59671t);
        ArrayList arrayList3 = new ArrayList(arrayList);
        fs61 fs61Var = fs61.f72777b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = nqi0VarM65450a.f72778a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new yvb(arrayList2, jvl0VarM54384j, -1, arrayList3, false, new fs61(arrayMap), null);
        if (yvbVar != null) {
            i = yvbVar.f276634c;
            xvbVar.m92219c(yvbVar.f276635d);
            jvl0Var = yvbVar.f276633b;
        }
        xvbVar.f266338d = lpi0.m59672u(jvl0Var);
        xvbVar.f266335a = ((Integer) jla1Var.mo39830f(sdb.f207967c, Integer.valueOf(i))).intValue();
        xvbVar.m92220h(new svb((CameraCaptureSession.CaptureCallback) jla1Var.mo39830f(sdb.f207971g, new ndb())));
        xvbVar.m92221i(a99.m25084j(jla1Var).m25087c());
    }
}
