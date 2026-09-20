package p204p;

import android.os.Build;
import android.os.StatFs;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.model.Permissions;
import com.ravelin.core.model.SharedPackages;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class saa0 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207165a;

    public /* synthetic */ saa0(int i) {
        this.f207165a = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = 0;
        switch (this.f207165a) {
            case 0:
                return ym6.f274165a;
            case 1:
                MobileReportRequest.Companion coM4 = MobileReportRequest.INSTANCE;
                return new mj5(MobileError.cOm9.lpt2, 0);
            case 2:
                return UUID.randomUUID();
            case 3:
                return i1p.f97559a;
            case 4:
                n5q n5qVar = xsr.f265651a;
                return tlp.f221498c;
            case 5:
                return new g9b(new z4l0());
            case 6:
                Permissions.CoM4 coM5 = Permissions.Companion;
                return new mj5(ql51.f189738a, 0);
            case 7:
                Permissions.CoM4 coM6 = Permissions.Companion;
                return new mj5(ql51.f189738a, 0);
            case 8:
                n5q n5qVar2 = xsr.f265651a;
                return tlp.f221498c;
            case 9:
                List listM43711Y0 = g6f.m43711Y0((List) rwz0.f203434a.getValue(), new ode(6));
                ArrayList arrayList = new ArrayList();
                int size = listM43711Y0.size();
                while (i < size) {
                    arrayList.add(new pqm0(new ehj0(new saa0(5)), qpv0.f191387a.mo54112b(mja1.class)));
                    i++;
                }
                return arrayList;
            case 10:
                List listM43711Y1 = g6f.m43711Y0((List) rwz0.f203435b.getValue(), new btm0(13));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listM43711Y1.size();
                while (i < size2) {
                    ((gd10) listM43711Y1.get(i)).getClass();
                    arrayList2.add(Build.VERSION.SDK_INT >= 28 ? new tx4() : new ed10());
                    i++;
                }
                return arrayList2;
            case 11:
                return null;
            case 12:
                return new rgx0();
            case 13:
                return new c8y0(new LinkedHashMap());
            case 14:
                wy41 wy41Var = may0.f141719a;
                return null;
            case 15:
                return new ji01();
            case 16:
                SharedPackages.CoM4 coM7 = SharedPackages.Companion;
                return new mj5(ql51.f189738a, 0);
            case 17:
                return new mj5(e450.f55982a, 0);
            case 18:
                return new ybs(0);
            case 19:
                bns bnsVar = a571.f12455a;
                return null;
            case 20:
                return if71.f101703d;
            case 21:
                return wp91.f253711a;
            case 22:
                return new y350(0L);
            case 23:
                return new y350(0L);
            case 24:
                float f = y481.f269099a;
                return Boolean.TRUE;
            case 25:
                return Boolean.TRUE;
            case 26:
                return new sp91();
            default:
                hp60 hp60Var = ywy.f277076a;
                tbn0 tbn0VarM80403e = ywy.f277077b.m80403e("coil3_disk_cache");
                long jM63439p = 10485760;
                try {
                    File file = tbn0VarM80403e.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jM63439p = n0e1.m63439p((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new cvu0(jM63439p, hp60Var, tbn0VarM80403e);
        }
    }
}
