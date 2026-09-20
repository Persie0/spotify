package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Base64;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.lang.ref.WeakReference;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import javax.crypto.KeyGenerator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class yid1 {

    /* JADX INFO: renamed from: l */
    public static final ComponentName f273084l = new ComponentName("com.waze", "com.waze.sdk.SdkService");

    /* JADX INFO: renamed from: m */
    public static final qjd1 f273085m = new qjd1();

    /* JADX INFO: renamed from: n */
    public static WeakReference f273086n;

    /* JADX INFO: renamed from: a */
    public final Context f273087a;

    /* JADX INFO: renamed from: b */
    public final u4l0 f273088b;

    /* JADX INFO: renamed from: c */
    public String f273089c;

    /* JADX INFO: renamed from: d */
    public Messenger f273090d;

    /* JADX INFO: renamed from: e */
    public Messenger f273091e;

    /* JADX INFO: renamed from: f */
    public boolean f273092f;

    /* JADX INFO: renamed from: g */
    public boolean f273093g;

    /* JADX INFO: renamed from: h */
    public boolean f273094h;

    /* JADX INFO: renamed from: i */
    public final g2a1 f273095i;

    /* JADX INFO: renamed from: j */
    public g2a1 f273096j;

    /* JADX INFO: renamed from: k */
    public final njd1 f273097k = new njd1(this);

    public yid1(Context context, u4l0 u4l0Var, g2a1 g2a1Var) {
        new WeakReference(this);
        this.f273087a = context.getApplicationContext();
        this.f273088b = u4l0Var;
        this.f273095i = g2a1Var;
        m93724e();
    }

    /* JADX INFO: renamed from: h */
    public static yid1 m93723h(Context context, u4l0 u4l0Var, g2a1 g2a1Var) {
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo("com.waze", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i == 0) {
            throw new IllegalStateException("Waze not installed.");
        }
        if (i < 1021549) {
            throw new IllegalStateException(s571.m77251j("Waze version ", j1h1.m52162x(context), " does not support Audio SDK version 1.0.0.9."));
        }
        WeakReference weakReference = f273086n;
        if (weakReference != null && weakReference.get() != null && ((yid1) f273086n.get()).f273093g) {
            ((yid1) f273086n.get()).m93725f(5);
        }
        WeakReference weakReference2 = new WeakReference(new yid1(context, u4l0Var, g2a1Var));
        f273086n = weakReference2;
        return (yid1) weakReference2.get();
    }

    /* JADX INFO: renamed from: e */
    public final void m93724e() {
        String strEncodeToString;
        if (this.f273093g || this.f273094h) {
            return;
        }
        this.f273094h = true;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            strEncodeToString = Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 0);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = null;
        }
        this.f273089c = strEncodeToString;
        Intent intent = new Intent();
        intent.setComponent(f273084l);
        this.f273087a.bindService(intent, this.f273097k, 1);
        this.f273092f = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m93725f(int i) {
        if (this.f273092f) {
            Messenger messenger = this.f273090d;
            if (messenger != null) {
                try {
                    String str = this.f273089c;
                    Message messageObtain = Message.obtain((Handler) null, 103);
                    Bundle bundle = new Bundle();
                    bundle.putString("token", str);
                    messageObtain.setData(bundle);
                    messenger.send(messageObtain);
                } catch (RemoteException unused) {
                }
            }
            this.f273087a.unbindService(this.f273097k);
            this.f273092f = false;
        }
        if (this.f273093g) {
            this.f273093g = false;
            this.f273094h = false;
            this.f273090d = null;
            this.f273089c = null;
            qjd1 qjd1Var = f273085m;
            qjd1Var.getClass();
            Iterator it = qjd1Var.f189223a.iterator();
            while (it.hasNext()) {
                ikc0.m50942n(((WeakReference) it.next()).get());
                it.remove();
            }
            g2a1 g2a1Var = this.f273095i;
            if (g2a1Var != null) {
                ((BehaviorSubject) g2a1Var.f75877c).onNext(Boolean.FALSE);
                sjd1 sjd1Var = (sjd1) ((dz31) g2a1Var.f75876b).f54516b;
                sjd1.m78313a(sjd1Var, vjd1.f241970b);
                sjd1Var.m78314b();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final o73 m93726g() {
        return new o73(this);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m93727i() {
        if (this.f273096j != null) {
            return true;
        }
        qjd1 qjd1Var = f273085m;
        qjd1Var.getClass();
        Iterator it = qjd1Var.f189223a.iterator();
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m93728j(int i, String str) {
        qjd1 qjd1Var = f273085m;
        qjd1Var.getClass();
        Iterator it = qjd1Var.f189223a.iterator();
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
        g2a1 g2a1Var = this.f273096j;
        if (g2a1Var != null) {
            if (i > 0 || str != null) {
                dz31 dz31Var = (dz31) g2a1Var.f75876b;
                String strValueOf = String.valueOf(i);
                sjd1 sjd1Var = (sjd1) dz31Var.f54516b;
                ljd1 ljd1Var = sjd1Var.f209816d;
                ljd1Var.f134067e = strValueOf;
                ljd1Var.f134066d.onNext(Boolean.valueOf(ljd1Var.m59148a()));
                ljd1Var.f134063a = str;
                sjd1Var.m78317e();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m93729k(int i) {
        vjd1 vjd1Var;
        qjd1 qjd1Var = f273085m;
        qjd1Var.getClass();
        Iterator it = qjd1Var.f189223a.iterator();
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
        g2a1 g2a1Var = this.f273096j;
        if (g2a1Var == null || i == 0) {
            return;
        }
        dz31 dz31Var = (dz31) g2a1Var.f75876b;
        switch (edb.m38547C(i)) {
            case 0:
                vjd1Var = vjd1.f241970b;
                break;
            case 1:
                vjd1Var = vjd1.f241971c;
                break;
            case 2:
                vjd1Var = vjd1.f241972d;
                break;
            case 3:
                vjd1Var = vjd1.f241973e;
                break;
            case 4:
                vjd1Var = vjd1.f241974f;
                break;
            case 5:
                vjd1Var = vjd1.f241975g;
                break;
            case 6:
                vjd1Var = vjd1.f241976h;
                break;
            case 7:
                vjd1Var = vjd1.f241977i;
                break;
            case 8:
                vjd1Var = vjd1.f241978t;
                break;
            case 9:
                vjd1Var = vjd1.f241966X;
                break;
            case 10:
                vjd1Var = vjd1.f241967Y;
                break;
            case 11:
                vjd1Var = vjd1.f241968Z;
                break;
            case 12:
                vjd1Var = vjd1.f241956L0;
                break;
            case 13:
                vjd1Var = vjd1.f241957M0;
                break;
            case 14:
                vjd1Var = vjd1.f241958N0;
                break;
            case 15:
                vjd1Var = vjd1.f241959O0;
                break;
            case 16:
                vjd1Var = vjd1.f241960P0;
                break;
            case 17:
                vjd1Var = vjd1.f241961Q0;
                break;
            case 18:
                vjd1Var = vjd1.f241962R0;
                break;
            case 19:
                vjd1Var = vjd1.f241963S0;
                break;
            case 20:
                vjd1Var = vjd1.f241964T0;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        sjd1.m78313a((sjd1) dz31Var.f54516b, vjd1Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m93730l(boolean z) {
        qjd1 qjd1Var = f273085m;
        qjd1Var.getClass();
        Iterator it = qjd1Var.f189223a.iterator();
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
        g2a1 g2a1Var = this.f273096j;
        if (g2a1Var != null) {
            dz31 dz31Var = (dz31) g2a1Var.f75876b;
            if (z) {
                dz31Var.getClass();
            } else {
                sjd1.m78313a((sjd1) dz31Var.f54516b, vjd1.f241970b);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m93731m(int i) {
        qjd1 qjd1Var = f273085m;
        qjd1Var.getClass();
        Iterator it = qjd1Var.f189223a.iterator();
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
        g2a1 g2a1Var = this.f273096j;
        if (g2a1Var != null) {
            sjd1 sjd1Var = (sjd1) ((dz31) g2a1Var.f75876b).f54516b;
            sjd1Var.f209816d.f134065c = String.valueOf(i);
            sjd1Var.m78317e();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m93732n() {
        qjd1 qjd1Var = f273085m;
        qjd1Var.getClass();
        Iterator it = qjd1Var.f189223a.iterator();
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m93733o(boolean z) {
        qjd1 qjd1Var = f273085m;
        qjd1Var.getClass();
        Iterator it = qjd1Var.f189223a.iterator();
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
        g2a1 g2a1Var = this.f273096j;
        if (g2a1Var != null) {
            ((sjd1) ((dz31) g2a1Var.f75876b).f54516b).f209816d.f134064b = z;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m93734p() {
        Messenger messenger = this.f273090d;
        if (messenger != null) {
            try {
                String str = this.f273089c;
                boolean zM93727i = m93727i();
                Message messageObtain = Message.obtain((Handler) null, 102);
                Bundle bundle = new Bundle();
                bundle.putString("token", str);
                bundle.putBoolean("request", zM93727i);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }
}
