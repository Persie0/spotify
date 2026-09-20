package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wlf1 extends ijf1 {

    /* JADX INFO: renamed from: s */
    public static final ura0 f252543s = new ura0("MediaRouterProxy", null);

    /* JADX INFO: renamed from: l */
    public final zmd0 f252544l;

    /* JADX INFO: renamed from: m */
    public final ebc f252545m;

    /* JADX INFO: renamed from: n */
    public final HashMap f252546n;

    /* JADX INFO: renamed from: o */
    public final tnf1 f252547o;

    /* JADX INFO: renamed from: p */
    public final boolean f252548p;

    /* JADX INFO: renamed from: q */
    public boolean f252549q;

    /* JADX INFO: renamed from: r */
    public boolean f252550r;

    public wlf1(Context context, zmd0 zmd0Var, ebc ebcVar, bqg1 bqg1Var) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 3);
        this.f252546n = new HashMap();
        this.f252544l = zmd0Var;
        this.f252545m = ebcVar;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        f252543s.m83848a("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f252547o = new tnf1(ebcVar);
        Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        this.f252548p = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f252549q = true;
        bqg1Var.m30263f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).mo1510b(new k791(this, 17));
    }

    /* JADX INFO: renamed from: c2 */
    public final boolean m88516c2() {
        ebc ebcVar;
        return this.f252548p && this.f252549q && (ebcVar = this.f252545m) != null && ebcVar.f57889Z;
    }

    /* JADX INFO: renamed from: d2 */
    public final void m88517d2(omd0 omd0Var, int i) {
        Set set = (Set) this.f252546n.get(omd0Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f252544l.m96432a(omd0Var, (qmd0) it.next(), i);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final void m88518e2(omd0 omd0Var) {
        Set set = (Set) this.f252546n.get(omd0Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f252544l.m96433e((qmd0) it.next());
        }
    }
}
