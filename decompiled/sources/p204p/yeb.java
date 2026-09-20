package p204p;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class yeb extends AbstractC1895gf {
    /* JADX INFO: renamed from: t */
    public void mo93532t(ayz0 ayz0Var) throws CameraAccessExceptionCompat {
        CameraDevice cameraDevice = (CameraDevice) this.f79242a;
        cameraDevice.getClass();
        zxz0 zxz0Var = ayz0Var.f21381a;
        zxz0Var.mo92394g().getClass();
        List listMo92388a = zxz0Var.mo92388a();
        if (listMo92388a == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (zxz0Var.mo92392e() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        cameraDevice.getId();
        Iterator it = listMo92388a.iterator();
        while (it.hasNext()) {
            String strMo31038d = ((zyl0) it.next()).f287622a.mo31038d();
            if (strMo31038d != null && !strMo31038d.isEmpty()) {
                vie1.m85617F("CameraDeviceCompat");
            }
        }
        jeb jebVar = new jeb(zxz0Var.mo92392e(), zxz0Var.mo92394g());
        List listMo92388a2 = zxz0Var.mo92388a();
        afb afbVar = (afb) this.f79243b;
        afbVar.getClass();
        Handler handler = afbVar.f15109a;
        bv40 bv40VarMo92391d = zxz0Var.mo92391d();
        try {
            if (bv40VarMo92391d != null) {
                InputConfiguration inputConfiguration = bv40VarMo92391d.f31273a.f286341a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, ayz0.m27559a(listMo92388a2), jebVar, handler);
            } else {
                if (zxz0Var.mo92393f() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(ayz0.m27559a(listMo92388a2), jebVar, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listMo92388a2.size());
                Iterator it2 = listMo92388a2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((zyl0) it2.next()).f287622a.m31039e());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, jebVar, handler);
            }
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
