package p204p;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class fns implements ens {

    /* JADX INFO: renamed from: a */
    public final Object f71353a;

    public /* synthetic */ fns(Object obj, boolean z) {
        this.f71353a = obj;
    }

    /* JADX INFO: renamed from: d */
    public static fns m42231d(peb pebVar) {
        DynamicRangeProfiles dynamicRangeProfiles;
        int i = Build.VERSION.SDK_INT;
        fns fnsVar = null;
        if (i >= 33 && (dynamicRangeProfiles = (DynamicRangeProfiles) pebVar.m69715a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) != null) {
            wj50.m88281r("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            fnsVar = new fns(new fns(dynamicRangeProfiles), false);
        }
        return fnsVar == null ? gns.f82774a : fnsVar;
    }

    /* JADX INFO: renamed from: e */
    public static Set m42232e(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            cns cnsVar = (cns) dns.f50875a.get(l);
            wj50.m88280q(cnsVar, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(cnsVar);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // p204p.ens
    /* JADX INFO: renamed from: a */
    public DynamicRangeProfiles mo39521a() {
        return (DynamicRangeProfiles) this.f71353a;
    }

    @Override // p204p.ens
    /* JADX INFO: renamed from: b */
    public Set mo39522b(cns cnsVar) {
        Long lM36490a = dns.m36490a(cnsVar, (DynamicRangeProfiles) this.f71353a);
        wj50.m88275l("DynamicRange is not supported: " + cnsVar, lM36490a != null);
        return m42232e(((DynamicRangeProfiles) this.f71353a).getProfileCaptureRequestConstraints(lM36490a.longValue()));
    }

    @Override // p204p.ens
    /* JADX INFO: renamed from: c */
    public Set mo39523c() {
        return m42232e(((DynamicRangeProfiles) this.f71353a).getSupportedProfiles());
    }

    /* JADX INFO: renamed from: f */
    public void m42233f(Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        ActivityInfo activityInfo;
        if (Build.VERSION.SDK_INT < 33 || (resolveInfoResolveActivity = ((PackageManager) this.f71353a).resolveActivity(intent, PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH))) == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return;
        }
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
    }

    public fns(Object obj) {
        this.f71353a = (DynamicRangeProfiles) obj;
    }
}
