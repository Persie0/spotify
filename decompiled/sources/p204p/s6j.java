package p204p;

import android.content.res.Resources;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.C0023j;
import androidx.car.app.C0024k;
import androidx.car.app.HostException;
import androidx.car.app.constraints.IConstraintHost;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class s6j implements lbc0 {

    /* JADX INFO: renamed from: a */
    public final C0023j f206130a;

    /* JADX INFO: renamed from: b */
    public final C0024k f206131b;

    public s6j(C0023j c0023j, C0024k c0024k) {
        this.f206130a = c0023j;
        this.f206131b = c0024k;
    }

    /* JADX INFO: renamed from: a */
    public final int m77326a(int i) {
        int i2;
        Integer numValueOf = null;
        try {
            C0024k c0024k = this.f206131b;
            try {
                Log.isLoggable("CarApp", 3);
                IInterface iInterfaceM217b = c0024k.m217b("constraints");
                if (iInterfaceM217b != null) {
                    numValueOf = Integer.valueOf(((IConstraintHost) iInterfaceM217b).getContentLimit(i));
                }
            } catch (SecurityException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new HostException("Remote getContentLimit call failed", e2);
            }
        } catch (RemoteException unused) {
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        Resources resources = this.f206130a.getResources();
        if (i == 1) {
            i2 = R.integer.content_limit_grid;
        } else if (i == 2) {
            i2 = R.integer.content_limit_place_list;
        } else if (i != 3) {
            i2 = i != 4 ? R.integer.content_limit_list : R.integer.content_limit_pane;
        } else {
            i2 = R.integer.content_limit_route_list;
        }
        return resources.getInteger(i2);
    }
}
