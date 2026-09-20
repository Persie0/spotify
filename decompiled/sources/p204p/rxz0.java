package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class rxz0 extends qxz0 {
    /* JADX INFO: renamed from: d */
    public static rxz0 m76683d(jla1 jla1Var, Size size) {
        if (((tdb) jla1Var.mo39830f(jla1.f113574z0, null)) == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) jla1Var.mo39830f(nu61.f158519t0, jla1Var.toString())));
        }
        rxz0 rxz0Var = new rxz0();
        vxz0 vxz0Var = (vxz0) jla1Var.mo39830f(jla1.f113572x0, null);
        jvl0 jvl0Var = jvl0.f116366c;
        int i = vxz0.m86699a().f245872g.f276634c;
        if (vxz0Var != null) {
            i = vxz0Var.f245872g.f276634c;
            for (CameraDevice.StateCallback stateCallback : vxz0Var.f245868c) {
                ArrayList arrayList = rxz0Var.f193769c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : vxz0Var.f245869d) {
                ArrayList arrayList2 = rxz0Var.f193770d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            rxz0Var.f193768b.m92219c(vxz0Var.f245872g.f276635d);
            jvl0Var = vxz0Var.f245872g.f276633b;
        }
        xvb xvbVar = rxz0Var.f193768b;
        xvbVar.getClass();
        xvbVar.f266338d = lpi0.m59672u(jvl0Var);
        if (jla1Var instanceof i5r0) {
            Rational rational = aar0.f13911a;
            if (((PreviewPixelHDRnetQuirk) rbr.f197650a.m76583e(PreviewPixelHDRnetQuirk.class)) != null && !aar0.f13911a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                lpi0 lpi0VarM59671t = lpi0.m59671t();
                lpi0VarM59671t.m59673v(sdb.m77825m0(CaptureRequest.TONEMAP_MODE), 2);
                rxz0Var.f193768b.m92221i(new sdb(jvl0.m54384j(lpi0VarM59671t), 11));
            }
        }
        rxz0Var.f193768b.f266335a = ((Integer) jla1Var.mo39830f(sdb.f207967c, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) jla1Var.mo39830f(sdb.f207969e, new cfb());
        ArrayList arrayList3 = rxz0Var.f193769c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) jla1Var.mo39830f(sdb.f207970f, new neb());
        ArrayList arrayList4 = rxz0Var.f193770d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        svb svbVar = new svb((CameraCaptureSession.CaptureCallback) jla1Var.mo39830f(sdb.f207971g, new ndb()));
        rxz0Var.f193768b.m92220h(svbVar);
        ArrayList arrayList5 = rxz0Var.f193771e;
        if (!arrayList5.contains(svbVar)) {
            arrayList5.add(svbVar);
        }
        sy7 sy7Var = jla1.f113571H0;
        Integer num = (Integer) jla1Var.mo39830f(sy7Var, 0);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            xvb xvbVar2 = rxz0Var.f193768b;
            xvbVar2.getClass();
            if (iIntValue != 0) {
                ((lpi0) xvbVar2.f266338d).m59673v(sy7Var, num);
            }
        }
        int iM53666p = jla1Var.m53666p();
        if (iM53666p != 0) {
            xvb xvbVar3 = rxz0Var.f193768b;
            xvbVar3.getClass();
            if (iM53666p != 0) {
                ((lpi0) xvbVar3.f266338d).m59673v(jla1.f113570G0, Integer.valueOf(iM53666p));
            }
        }
        lpi0 lpi0VarM59671t2 = lpi0.m59671t();
        sy7 sy7Var2 = sdb.f207972h;
        lpi0VarM59671t2.m59673v(sy7Var2, (String) jla1Var.mo39830f(sy7Var2, null));
        sy7 sy7Var3 = sdb.f207968d;
        Long l = (Long) jla1Var.mo39830f(sy7Var3, -1L);
        l.getClass();
        lpi0VarM59671t2.m59673v(sy7Var3, l);
        rxz0Var.f193768b.m92221i(lpi0VarM59671t2);
        rxz0Var.f193768b.m92221i(a99.m25084j(jla1Var).m25087c());
        return rxz0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m76684a(phi phiVar) {
        this.f193768b.m92221i(phiVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m76685b(mjq mjqVar, cns cnsVar, int i) {
        azp0 azp0VarM31317a = c28.m31317a(mjqVar);
        if (cnsVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        azp0VarM31317a.f21668f = cnsVar;
        azp0VarM31317a.f21666d = Integer.valueOf(i);
        this.f193767a.add(azp0VarM31317a.m27660s());
        ((HashSet) this.f193768b.f266337c).add(mjqVar);
    }

    /* JADX INFO: renamed from: c */
    public final vxz0 m76686c() {
        return new vxz0(new ArrayList(this.f193767a), new ArrayList(this.f193769c), new ArrayList(this.f193770d), new ArrayList(this.f193771e), this.f193768b.m92222j(), this.f193772f, this.f193773g, this.f193774h);
    }
}
