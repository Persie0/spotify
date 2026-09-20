package p204p;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xcb {

    /* JADX INFO: renamed from: a */
    public final Context f260181a;

    /* JADX INFO: renamed from: b */
    public final hr81 f260182b;

    /* JADX INFO: renamed from: c */
    public final ly7 f260183c;

    /* JADX INFO: renamed from: d */
    public final rgb f260184d;

    /* JADX INFO: renamed from: e */
    public final yfb f260185e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f260186f;

    /* JADX INFO: renamed from: g */
    public final jvr f260187g;

    /* JADX INFO: renamed from: h */
    public final long f260188h;

    /* JADX INFO: renamed from: i */
    public final HashMap f260189i = new HashMap();

    public xcb(Context context, ly7 ly7Var, pgb pgbVar, long j) throws InitializationException {
        String strM38029z;
        this.f260181a = context;
        this.f260183c = ly7Var;
        yfb yfbVarM93552a = yfb.m93552a(context, ly7Var.f137979b);
        this.f260185e = yfbVarM93552a;
        this.f260187g = jvr.m54388b(context);
        try {
            ArrayList<String> arrayList = new ArrayList();
            c97 c97Var = yfbVarM93552a.f272197a;
            c97Var.getClass();
            try {
                List<String> listAsList = Arrays.asList(((CameraManager) c97Var.f35413b).getCameraIdList());
                if (pgbVar == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strM38029z = e72.m38029z(yfbVarM93552a, pgbVar.m69874b(), listAsList);
                    } catch (IllegalStateException unused) {
                        strM38029z = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strM38029z)) {
                            arrayList2.add(m90392b(str));
                        }
                    }
                    Iterator it2 = pgbVar.m69873a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((gfb) it2.next()).mo44590b());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : arrayList) {
                    if (str2.equals("0") || str2.equals("1")) {
                        arrayList3.add(str2);
                    } else if (jq60.m54076v(str2, this.f260185e)) {
                        arrayList3.add(str2);
                    } else {
                        vie1.m85624f("Camera2CameraFactory");
                    }
                }
                this.f260186f = arrayList3;
                hr81 hr81Var = new hr81(this.f260185e);
                this.f260182b = hr81Var;
                rgb rgbVar = new rgb(hr81Var);
                this.f260184d = rgbVar;
                ((ArrayList) hr81Var.f94376c).add(rgbVar);
                this.f260188h = j;
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        } catch (CameraUnavailableException e3) {
            throw new InitializationException(e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final idb m90391a(String str) throws CameraUnavailableException {
        if (!this.f260186f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        ldb ldbVarM90392b = m90392b(str);
        ly7 ly7Var = this.f260183c;
        return new idb(this.f260181a, this.f260185e, str, ldbVarM90392b, this.f260182b, this.f260184d, ly7Var.f137978a, ly7Var.f137979b, this.f260187g, this.f260188h);
    }

    /* JADX INFO: renamed from: b */
    public final ldb m90392b(String str) throws CameraUnavailableException {
        HashMap map = this.f260189i;
        try {
            ldb ldbVar = (ldb) map.get(str);
            if (ldbVar != null) {
                return ldbVar;
            }
            ldb ldbVar2 = new ldb(str, this.f260185e);
            map.put(str, ldbVar2);
            return ldbVar2;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }
}
