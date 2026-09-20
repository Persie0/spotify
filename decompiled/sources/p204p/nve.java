package p204p;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.model.SharedPackages;
import com.ravelin.core.repository.p008db.AppDatabase;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class nve implements zkk0, clk0 {

    /* JADX INFO: renamed from: f */
    public static final String f158871f;

    /* JADX INFO: renamed from: a */
    public final AppDatabase f158872a;

    /* JADX INFO: renamed from: b */
    public final xd70 f158873b;

    /* JADX INFO: renamed from: c */
    public final clk0 f158874c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f158875d;

    /* JADX INFO: renamed from: e */
    public boolean f158876e;

    static {
        String canonicalName = nve.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = nve.class.getSimpleName();
        }
        f158871f = canonicalName;
    }

    public nve(AppDatabase appDatabase, xd70 xd70Var, clk0 clk0Var, SharedPreferences sharedPreferences) {
        this.f158872a = appDatabase;
        this.f158873b = xd70Var;
        this.f158874c = clk0Var;
        this.f158875d = sharedPreferences;
    }

    /* JADX INFO: renamed from: c */
    public static long m65733c(Context context) {
        return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: a */
    public final void m65734a(Context context) {
        long jM65733c = m65733c(context);
        SharedPreferences.Editor editorEdit = this.f158875d.edit();
        editorEdit.putLong("last-update-for-apps-sharing", jM65733c);
        editorEdit.apply();
    }

    @Override // p204p.clk0
    /* JADX INFO: renamed from: b */
    public final boolean mo33278b() {
        return this.f158874c.mo33278b();
    }

    @Override // p204p.clk0
    /* JADX INFO: renamed from: d */
    public final Object mo33279d(Context context, List list, Long l, fbk fbkVar) {
        return this.f158874c.mo33279d(context, list, l, fbkVar);
    }

    /* JADX INFO: renamed from: e */
    public final String m65735e() {
        return DeviceId.INSTANCE.Lpt5().getId();
    }

    /* JADX INFO: renamed from: f */
    public final DeviceId m65736f(Context context, wue wueVar, vue vueVar, String str) throws NoSuchAlgorithmException {
        y1f1 y1f1Var;
        AppDatabase appDatabase = this.f158872a;
        y1f1 y1f1VarM55167a = appDatabase.mo2233z().m55167a();
        if (y1f1VarM55167a == null) {
            y1f1Var = new y1f1((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 1023);
        } else {
            y1f1Var = y1f1VarM55167a;
        }
        DeviceId deviceIdLpt2 = DeviceId.INSTANCE.lpt2(context, wueVar, vueVar, y1f1Var, str);
        try {
            k2f1 k2f1VarMo2233z = appDatabase.mo2233z();
            String id = deviceIdLpt2.getId();
            String imei = deviceIdLpt2.getImei();
            if (imei == null) {
                imei = "";
            }
            String imsi = deviceIdLpt2.getImsi();
            if (imsi == null) {
                imsi = "";
            }
            String bluetoothMAC = deviceIdLpt2.getBluetoothMAC();
            if (bluetoothMAC == null) {
                bluetoothMAC = "";
            }
            String wiFiMAC = deviceIdLpt2.getWiFiMAC();
            String androidId = deviceIdLpt2.getAndroidId();
            String mediaDrmId = deviceIdLpt2.getMediaDrmId();
            String deviceIdProvider = deviceIdLpt2.getDeviceIdProvider();
            if (deviceIdProvider == null) {
                deviceIdProvider = "";
            }
            Long createdAt = deviceIdLpt2.getCreatedAt();
            nsf1.m65528n(k2f1VarMo2233z.f118621a, false, true, new hp91(3, k2f1VarMo2233z, new y1f1(id, imei, imsi, bluetoothMAC, wiFiMAC, androidId, mediaDrmId, deviceIdProvider, Long.valueOf(createdAt != null ? createdAt.longValue() : 0L), 1)));
            return deviceIdLpt2;
        } catch (Exception e) {
            ((z2f1) this.f158873b).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(Error.INVALID_COUNTRY_FIELD_NUMBER, "Initialization", "An error occurred while updating the Room database", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
            return deviceIdLpt2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: g */
    public final Object m65737g(Application application, wue wueVar, vue vueVar, ArrayList arrayList, String str, Boolean bool, Long l, ibk ibkVar) throws NoSuchAlgorithmException {
        hve hveVar;
        Context context;
        long jCurrentTimeMillis;
        DeviceId deviceIdM65736f;
        DeviceId deviceId;
        List list;
        DeviceId deviceId2;
        long j;
        if (ibkVar instanceof hve) {
            hveVar = (hve) ibkVar;
            int i = hveVar.f95695f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hveVar.f95695f = i - Integer.MIN_VALUE;
            } else {
                hveVar = new hve(this, ibkVar);
            }
        } else {
            hveVar = new hve(this, ibkVar);
        }
        hve hveVar2 = hveVar;
        Object obj = hveVar2.f95693d;
        int i2 = hveVar2.f95695f;
        if (i2 == 0) {
            bga.m29073P(obj);
            try {
                jCurrentTimeMillis = System.currentTimeMillis();
                deviceIdM65736f = m65736f(application, wueVar, vueVar, str);
                if (this.f158874c.mo33278b()) {
                    if (arrayList == null) {
                        try {
                            list = lau.f131415a;
                        } catch (Exception e) {
                            e = e;
                            context = application;
                            m65740j(context);
                            ((z2f1) this.f158873b).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(105, "Initialization", "An error occurred while generating the device ID", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                        }
                    } else {
                        list = arrayList;
                    }
                    Long l2 = new Long(5200L);
                    hveVar2.f95690a = application;
                    hveVar2.f95691b = deviceIdM65736f;
                    hveVar2.f95692c = jCurrentTimeMillis;
                    hveVar2.f95695f = 1;
                    Object objM65738h = m65738h(application, str, list, bool, l2, hveVar2);
                    Object obj2 = yuk.f276404a;
                    if (objM65738h == obj2) {
                        return obj2;
                    }
                    context = application;
                    deviceId2 = deviceIdM65736f;
                    obj = objM65738h;
                    j = jCurrentTimeMillis;
                } else {
                    deviceId = null;
                    context = application;
                }
                String str2 = f158871f;
                utu0 utu0Var = gk71.f80747a;
                utu0Var.m83940H(str2);
                utu0Var.m83952u("***Debug fromApplication: " + deviceIdM65736f, new Object[0]);
                utu0Var.m83940H(str2);
                utu0Var.m83952u("***Debug fromDevice: " + deviceId, new Object[0]);
                if (deviceId != null && !bm51.m29803n0(deviceIdM65736f.getId(), "extand", false)) {
                    deviceIdM65736f = deviceId;
                }
                DeviceId.INSTANCE.lpt2(deviceIdM65736f);
                String str3 = "***Debug Initialization Duration = " + (System.currentTimeMillis() - jCurrentTimeMillis);
                utu0Var.m83940H(str2);
                utu0Var.m83952u(str3, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                context = application;
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = hveVar2.f95692c;
        deviceId2 = hveVar2.f95691b;
        context = hveVar2.f95690a;
        try {
            bga.m29073P(obj);
        } catch (Exception e3) {
            e = e3;
            m65740j(context);
            ((z2f1) this.f158873b).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(105, "Initialization", "An error occurred while generating the device ID", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
        }
        jCurrentTimeMillis = j;
        deviceId = (DeviceId) obj;
        deviceIdM65736f = deviceId2;
        String str4 = f158871f;
        utu0 utu0Var2 = gk71.f80747a;
        utu0Var2.m83940H(str4);
        utu0Var2.m83952u("***Debug fromApplication: " + deviceIdM65736f, new Object[0]);
        utu0Var2.m83940H(str4);
        utu0Var2.m83952u("***Debug fromDevice: " + deviceId, new Object[0]);
        if (deviceId != null) {
            deviceIdM65736f = deviceId;
        }
        DeviceId.INSTANCE.lpt2(deviceIdM65736f);
        String str5 = "***Debug Initialization Duration = " + (System.currentTimeMillis() - jCurrentTimeMillis);
        utu0Var2.m83940H(str4);
        utu0Var2.m83952u(str5, new Object[0]);
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m65738h(Context context, String str, List list, Boolean bool, Long l, ibk ibkVar) {
        fve fveVar;
        if (ibkVar instanceof fve) {
            fveVar = (fve) ibkVar;
            int i = fveVar.f73768d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fveVar.f73768d = i - Integer.MIN_VALUE;
            } else {
                fveVar = new fve(this, ibkVar);
            }
        } else {
            fveVar = new fve(this, ibkVar);
        }
        Object objMo33279d = fveVar.f73766b;
        int i2 = fveVar.f73768d;
        if (i2 == 0) {
            bga.m29073P(objMo33279d);
            if ((str != null && !wl51.m88460J0(str)) || !wj50.m88271j(bool, Boolean.TRUE) || list.isEmpty()) {
                return null;
            }
            if ((DeviceId.INSTANCE.COM7() && Build.VERSION.SDK_INT < 28) || this.f158876e) {
                return null;
            }
            fveVar.f73765a = list;
            fveVar.f73768d = 1;
            objMo33279d = this.f158874c.mo33279d(context, list, l, fveVar);
            yuk yukVar = yuk.f276404a;
            if (objMo33279d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo33279d);
        }
        DeviceId deviceId = (DeviceId) objMo33279d;
        this.f158876e = true;
        return deviceId;
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList m65739i(Application application, Boolean bool) {
        if (bool.equals(Boolean.TRUE)) {
            try {
                List<PackageInfo> installedPackages = application.getPackageManager().getInstalledPackages(4);
                ArrayList arrayList = new ArrayList();
                for (Object obj : installedPackages) {
                    ServiceInfo[] serviceInfoArr = ((PackageInfo) obj).services;
                    if (serviceInfoArr != null) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            if (bm51.m29796g0(serviceInfo.name, "com.ravelin.core.repository.services.DeviceIdService", false)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new ComponentName(((PackageInfo) obj2).packageName, "com.ravelin.core.repository.services.DeviceIdService"));
                }
                return arrayList2;
            } catch (Exception e) {
                String strM38564m = edb.m38564m("***Debug error getting installed packages: ", e.getMessage());
                utu0 utu0Var = gk71.f80747a;
                utu0Var.m83940H(f158871f);
                utu0Var.m83952u(strM38564m, new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m65740j(Context context) throws NoSuchAlgorithmException {
        DeviceId.INSTANCE.lpt2(context);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX INFO: renamed from: k */
    public final void m65741k(Context context, List list, Boolean bool, String str, tau0 tau0Var) {
        boolean z;
        if (bool.equals(Boolean.TRUE) && list != null && (!list.isEmpty())) {
            long j = this.f158875d.getLong("last-update-for-apps-sharing", 0L);
            if (m65733c(context) != j || j == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            tau0Var.mo46940a(new RavelinError("No sharing apps to send", null, 2, null));
        } else if (list != null) {
            String packageName = context.getPackageName();
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ComponentName) it.next()).getPackageName());
            }
            SharedPackages sharedPackages = new SharedPackages("7.0.0", "android", packageName, str, g6f.m43710X0(arrayList));
            n1f1 n1f1Var = (n1f1) ((z2f1) this.f158873b).f278569c;
            n1f1Var.f149413d = null;
            n1f1Var.f149414e = sharedPackages;
            n1f1Var.f149415f = "clickstream";
            n1f1Var.mo63481b(tau0Var);
        }
    }
}
