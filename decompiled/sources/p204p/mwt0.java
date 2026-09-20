package p204p;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.os.Looper;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class mwt0 implements Function, deu0, Function4, BiFunction, il91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147882a;

    /* JADX INFO: renamed from: b */
    public boolean f147883b;

    public /* synthetic */ mwt0(Object obj, boolean z, int i) {
        this.f147882a = i;
        this.f147883b = z;
    }

    /* JADX INFO: renamed from: a */
    public static yvb m63065a(yvb yvbVar) {
        xvb xvbVar = new xvb(0);
        xvbVar.f266335a = yvbVar.f276634c;
        Iterator it = Collections.unmodifiableList(yvbVar.f276632a).iterator();
        while (it.hasNext()) {
            ((HashSet) xvbVar.f266337c).add((mjq) it.next());
        }
        xvbVar.m92221i(yvbVar.f276633b);
        lpi0 lpi0VarM59671t = lpi0.m59671t();
        lpi0VarM59671t.m59673v(sdb.m77825m0(CaptureRequest.FLASH_MODE), 0);
        xvbVar.m92221i(new sdb(jvl0.m54384j(lpi0VarM59671t), 11));
        return xvbVar.m92222j();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ArrayList arrayList;
        List<nw80> list;
        switch (this.f147882a) {
            case 0:
                boolean z = this.f147883b;
                for (api apiVar : (List) obj) {
                    if (z ? apiVar.mo26697m() : apiVar.isActive()) {
                        return apiVar.mo26689e();
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
            default:
                boolean z2 = this.f147883b;
                return new o221(z2, ((Boolean) obj).booleanValue(), z2, false);
            case 2:
                qu80 qu80Var = (qu80) ((p2x0) obj).m68970c();
                if (qu80Var == null || (list = qu80Var.f192598d) == null) {
                    arrayList = null;
                } else {
                    boolean z3 = this.f147883b;
                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                    for (nw80 nw80Var : list) {
                        arrayList.add(new yzu0(nw80Var.f159049c, z3 || nw80Var.f159058l));
                    }
                }
                return arrayList == null ? lau.f131415a : arrayList;
        }
    }

    @Override // p204p.il91
    /* JADX INFO: renamed from: b */
    public Bundle mo51005b() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
        bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f147883b);
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", 0);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public boolean m63066c(ArrayList arrayList, boolean z) {
        if (!this.f147883b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m63067d(boolean z) {
        if (this.f147883b == z) {
            return;
        }
        this.f147883b = z;
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: e */
    public long mo35830e(boolean z, xq00 xq00Var) {
        long j;
        xq00Var.m91771i0(349765255);
        if (z) {
            xq00Var.m91771i0(266128398);
            j = leu.m58815a(xq00Var).f112823a.f229876c;
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(266179424);
            j = leu.m58815a(xq00Var).f112823a.f229874a.f123094b;
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        return j;
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: f */
    public long mo35831f(boolean z, xq00 xq00Var) {
        long j;
        xq00Var.m91771i0(834387397);
        if (z) {
            xq00Var.m91771i0(-2035684030);
            j = leu.m58815a(xq00Var).f112823a.f229874a.f123094b;
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-2035619984);
            j = leu.m58815a(xq00Var).f112823a.f229876c;
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        return j;
    }

    /* JADX INFO: renamed from: g */
    public boolean m63068g(ArrayList arrayList, boolean z) {
        if (!this.f147883b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: h */
    public long mo35832h(xq00 xq00Var) {
        xq00Var.m91771i0(-1998032456);
        long j = leu.m58815a(xq00Var).f112823a.f229876c;
        xq00Var.m91788r(false);
        return j;
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: k */
    public boolean mo35833k(int i) {
        return this.f147883b && i == 0;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f147882a) {
            case 3:
                ContextTrack contextTrack = (ContextTrack) obj;
                Long l = (Long) obj2;
                Long l2 = (Long) obj4;
                boolean zIsEmpty = ((Restrictions) obj3).disallowSeekingReasons().isEmpty();
                wj50.m88279p(contextTrack);
                boolean z = (!e72.m37978L(contextTrack) || l2.longValue() == -1 || this.f147883b) ? false : true;
                String strUri = contextTrack.uri();
                wj50.m88279p(l);
                long jLongValue = l.longValue();
                if (!z) {
                    l2 = -1L;
                }
                return new thz0(jLongValue, l2.longValue(), strUri, zIsEmpty);
            default:
                ContextTrack contextTrack2 = (ContextTrack) obj;
                Long l3 = (Long) obj2;
                Long l4 = (Long) obj4;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long jLongValue2 = l3.longValue();
                String strUri2 = contextTrack2.uri();
                long jLongValue3 = -1;
                if (!this.f147883b) {
                    Long lValueOf = Long.valueOf(l3.longValue() + l4.longValue());
                    if (l4.longValue() == -1 || !e72.m37978L(contextTrack2)) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        jLongValue3 = lValueOf.longValue();
                    }
                }
                return new yhz0(jLongValue2, jLongValue3, strUri2, zBooleanValue);
        }
    }

    public /* synthetic */ mwt0(boolean z, int i) {
        this.f147882a = i;
        this.f147883b = z;
    }

    public mwt0(ou4 ou4Var) {
        this.f147882a = 13;
        this.f147883b = ou4Var.m68089b();
        ou4Var.m68091d();
        ou4Var.m68090c();
        ou4Var.m68088a();
    }

    public mwt0(rwt0 rwt0Var) {
        this.f147882a = 5;
        this.f147883b = rwt0Var.m76580a(Preview3AThreadCrashQuirk.class);
    }

    public mwt0(int i) {
        this.f147882a = i;
        switch (i) {
            case 9:
                this.f147883b = pbr.f175896a.m76583e(SurfaceOrderQuirk.class) != null;
                break;
            case 10:
                this.f147883b = rbr.f197650a.m76583e(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            default:
                this.f147883b = ((StillCaptureFlashStopRepeatingQuirk) rbr.f197650a.m76583e(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
        }
    }

    public mwt0(Context context, Looper looper, gh61 gh61Var) {
        this.f147882a = 14;
        context.getApplicationContext();
        gh61Var.m44723a(looper, null);
        gh61Var.m44723a(Looper.getMainLooper(), null);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        boolean z = this.f147883b;
        return new o221(z, ((Boolean) obj2).booleanValue(), z, ((Boolean) obj).booleanValue());
    }
}
