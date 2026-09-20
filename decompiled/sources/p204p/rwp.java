package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class rwp {

    /* JADX INFO: renamed from: a */
    public final Context f203391a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f203392b;

    /* JADX INFO: renamed from: c */
    public final ComponentName f203393c;

    public rwp(Context context) {
        this.f203391a = context;
        this.f203392b = new ComponentName(context, SpotifyMediaRouteProviderService.class.getName());
        this.f203393c = new ComponentName(context, (Class<?>) MediaTransferReceiver.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m76574a() {
        this.f203392b.getShortClassName();
        m76577d(2);
    }

    /* JADX INFO: renamed from: b */
    public final void m76575b() {
        this.f203392b.getClassName();
        m76577d(1);
    }

    /* JADX INFO: renamed from: c */
    public final void m76576c(List list) {
        Objects.toString(list);
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.f203391a;
            if (i < 33) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pqm0 pqm0Var = (pqm0) it.next();
                    context.getPackageManager().setComponentEnabledSetting((ComponentName) pqm0Var.f180350a, ((Number) pqm0Var.f180351b).intValue(), 1);
                }
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                pqm0 pqm0Var2 = (pqm0) it2.next();
                arrayList.add(new PackageManager.ComponentEnabledSetting((ComponentName) pqm0Var2.f180350a, ((Number) pqm0Var2.f180351b).intValue(), 1));
            }
            packageManager.setComponentEnabledSettings(arrayList);
        } catch (SecurityException e) {
            Logger.m3967c(e, "Failed to set components " + list, new Object[0]);
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to set components " + list, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m76577d(int i) {
        Context context = this.f203391a;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.f203393c;
        if (!bk5.m29624m1(new Integer[]{0, 1}).contains(Integer.valueOf(packageManager.getComponentEnabledSetting(componentName)))) {
            Logger.m3966b("MediaTransferReceiver is not in default state(AndroidManifest) or enabled", new Object[0]);
            m76576c(Collections.singletonList(new pqm0(componentName, 1)));
        }
        PackageManager packageManager2 = context.getPackageManager();
        ComponentName componentName2 = this.f203392b;
        if (packageManager2.getComponentEnabledSetting(componentName2) == i) {
            return;
        }
        m76576c(Collections.singletonList(new pqm0(componentName2, Integer.valueOf(i))));
    }
}
