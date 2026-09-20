package p204p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Property;
import android.view.View;
import androidx.webkit.WebViewStartupException;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b381 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f22963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f22964c;

    public /* synthetic */ b381(int i, Object obj, Object obj2) {
        this.f22962a = i;
        this.f22963b = obj;
        this.f22964c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        String string = null;
        r7d1 r7d1Var = null;
        int i = 0;
        switch (this.f22962a) {
            case 0:
                TooltipContainer tooltipContainer = (TooltipContainer) this.f22963b;
                tooltipContainer.m9690g(tooltipContainer.f3824e, (z281) this.f22964c);
                w481 w481Var = tooltipContainer.f3820a;
                w481Var.getClass();
                Rect rect = new Rect();
                w481Var.getDrawingRect(rect);
                int i2 = rect.left;
                int i3 = w481Var.f247758t;
                int i4 = i2 + i3;
                w481Var.f247751c = i4;
                int i5 = rect.right - i3;
                w481Var.f247753e = i5;
                int i6 = rect.top;
                int i7 = w481Var.f247755g;
                int i8 = i6 + i7;
                w481Var.f247752d = i8;
                w481Var.f247754f = (rect.bottom - i7) - i8;
                float f = w481Var.f247743M0;
                float f2 = w481Var.f247757i;
                float f3 = i4 + i7 + f2;
                if (f < f3) {
                    w481Var.f247743M0 = f3;
                } else {
                    float f4 = (i5 - f2) - i7;
                    if (f > f4) {
                        w481Var.f247743M0 = f4;
                    }
                }
                w481Var.setVisibility(0);
                RectF rectF = w481Var.f247748R0;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = 0.0f;
                rectF.bottom = 0.0f;
                if (w481Var.f247745O0.mo49279c()) {
                    w481Var.f247746P0.setScaleX(1.0f);
                    w481Var.f247746P0.setScaleY(0.25f);
                    w481Var.f247746P0.setAlpha(0.0f);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new u481(w481Var, 0));
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(w481Var.f247746P0, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.25f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(250L);
                objectAnimatorOfPropertyValuesHolder.setStartDelay(50L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfPropertyValuesHolder);
                animatorSet.start();
                return;
            case 1:
                g691 g691Var = (g691) this.f22963b;
                jf40 jf40Var = (jf40) this.f22964c;
                bco bcoVar = g691Var.f76977e;
                wsv0 wsv0VarM53150g = jf40Var.m53150g();
                cxb cxbVar = g691Var.f76976d;
                String str = (String) cxbVar.f42973c;
                String str2 = (String) cxbVar.f42974d;
                ahp ahpVar = (ahp) bcoVar.f25926b;
                mnx mnxVar = ahpVar.f15744s;
                v3h1.m84588U(mnxVar, wsv0VarM53150g, str, str2);
                d501 d501Var = ahpVar.f15735j;
                onx onxVarM62371a = mnxVar.m62371a();
                a691 a691Var = (a691) d501Var.f45295b;
                a691Var.m24855c();
                a691Var.f12731h.m63839j(-1, new f151(d501Var, onxVarM62371a));
                if (a691Var.m24853a()) {
                    f9t f9tVar = a691Var.f12747x;
                    f9tVar.getClass();
                    f9tVar.m41086g(onxVarM62371a);
                }
                a691Var.f12743t = null;
                return;
            case 2:
                txb1 txb1Var = (txb1) this.f22963b;
                sxb1 sxb1Var = (sxb1) this.f22964c;
                txb1Var.getClass();
                try {
                    sxb1Var.run();
                    return;
                } catch (Exception e) {
                    txb1Var.m81901b(e);
                    return;
                }
            case 3:
                bka1 bka1Var = (bka1) this.f22963b;
                String str3 = (String) this.f22964c;
                n5c1 n5c1Var = (n5c1) bka1Var.f27888c;
                String str4 = h0b1.f86200a;
                n5c1Var.mo29560m(str3);
                return;
            case 4:
                bka1 bka1Var2 = (bka1) this.f22963b;
                k9c1 k9c1Var = (k9c1) this.f22964c;
                n5c1 n5c1Var2 = (n5c1) bka1Var2.f27888c;
                String str5 = h0b1.f86200a;
                n5c1Var2.mo29553b(k9c1Var);
                return;
            case 5:
                bka1 bka1Var3 = (bka1) this.f22963b;
                Exception exc = (Exception) this.f22964c;
                n5c1 n5c1Var3 = (n5c1) bka1Var3.f27888c;
                String str6 = h0b1.f86200a;
                n5c1Var3.mo29544B(exc);
                return;
            case 6:
                bka1 bka1Var4 = (bka1) this.f22963b;
                kwe kweVar = (kwe) this.f22964c;
                n5c1 n5c1Var4 = (n5c1) bka1Var4.f27888c;
                String str7 = h0b1.f86200a;
                n5c1Var4.mo29552R(kweVar);
                return;
            case 7:
                yhc1 yhc1Var = (yhc1) this.f22963b;
                xhc1 xhc1Var = (xhc1) this.f22964c;
                if (p2l.f173365a.contains(yhc1.class)) {
                    return;
                }
                try {
                    Timer timer = yhc1Var.f272817c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    yhc1Var.f272818d = null;
                    Timer timer2 = new Timer();
                    timer2.scheduleAtFixedRate(xhc1Var, 0L, 1000L);
                    yhc1Var.f272817c = timer2;
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    p2l.m68953a(yhc1.class, th);
                    return;
                }
            case 8:
                String str8 = (String) this.f22963b;
                yhc1 yhc1Var2 = (yhc1) this.f22964c;
                if (p2l.f173365a.contains(yhc1.class)) {
                    return;
                }
                try {
                    byte[] bytes = str8.getBytes(vuc.f244913a);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(bytes);
                        byte[] bArrDigest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        int length = bArrDigest.length;
                        while (i < length) {
                            byte b = bArrDigest[i];
                            sb.append(Integer.toHexString((b >> 4) & 15));
                            sb.append(Integer.toHexString(b & 15));
                            i++;
                        }
                        string = sb.toString();
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                    Date date = C1893gd.f78679Y;
                    C1893gd c1893gdM67200x = okg1.m67200x();
                    if (string == null || !string.equals(yhc1Var2.f272818d)) {
                        int i9 = yhc1.f272814e;
                        yhc1Var2.m93636b(vsg1.m86350j(str8, c1893gdM67200x, p8y.m69344b()), string);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    p2l.m68953a(yhc1.class, th2);
                    return;
                }
            case 9:
                String str9 = (String) this.f22963b;
                String str10 = (String) this.f22964c;
                HashSet hashSet = qjc1.f189213e;
                pjc1.m70139c(str9, str10, new float[0]);
                return;
            case 10:
                boc1 boc1Var = (boc1) this.f22963b;
                View[] viewArr = (View[]) this.f22964c;
                if (boc1Var.f29088p != -1) {
                    for (View view : viewArr) {
                        view.setTag(boc1Var.f29088p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (boc1Var.f29089q != -1) {
                    int length2 = viewArr.length;
                    while (i < length2) {
                        viewArr[i].setTag(boc1Var.f29089q, null);
                        i++;
                    }
                    return;
                }
                return;
            case 11:
                ey9 ey9Var = (ey9) this.f22963b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f22964c;
                bka1 bka1Var5 = (bka1) ey9Var.f63992c;
                bka1Var5.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new b381(12, bka1Var5, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 12:
                bka1 bka1Var6 = (bka1) this.f22963b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f22964c;
                synchronized (bka1Var6) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bka1Var6.f27888c) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 13:
                u4i u4iVar = (u4i) this.f22963b;
                Object[] objArr = (Object[]) this.f22964c;
                try {
                    Arrays.toString(objArr);
                    v0i0 v0i0Var = (v0i0) u4iVar.f226723b;
                    byte[] bytes2 = v0i0Var.f236007a.m68704d(v0i0Var.f236008b).toJson(Arrays.asList(objArr)).getBytes(vuc.f244913a);
                    c5f0 c5f0Var = (c5f0) u4iVar.f226724c;
                    c5f0Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("MESSAGE_BODY", bytes2);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 2;
                    messageObtain.setData(bundle);
                    try {
                        c5f0Var.f34159b.send(messageObtain);
                        break;
                    } catch (RemoteException unused3) {
                        Logger.m3966b("Could not send the message to the remote client", new Object[0]);
                    }
                    return;
                } catch (Exception e2) {
                    e2.getMessage();
                    na6.m63959g(e2.getMessage(), e2);
                    return;
                }
            case 14:
                u4i u4iVar2 = (u4i) this.f22963b;
                byte[] bArr = (byte[]) this.f22964c;
                u4iVar2.getClass();
                try {
                    y0i0 y0i0VarM84392a = ((v0i0) u4iVar2.f226723b).m84392a(bArr);
                    try {
                        int iM92585c = y0i0VarM84392a.m92585c();
                        if (iM92585c == 1) {
                            r7d1Var = (kkc1) u4iVar2.f226730i;
                        } else if (iM92585c == 32) {
                            r7d1Var = (p7d1) u4iVar2.f226719X;
                        } else if (iM92585c == 34) {
                            r7d1Var = (gc41) u4iVar2.f226720Y;
                        } else if (iM92585c == 48) {
                            r7d1Var = (vaa1) u4iVar2.f226721Z;
                        } else if (iM92585c == 5) {
                            r7d1Var = (p7d1) u4iVar2.f226731t;
                        } else if (iM92585c != 6) {
                            Logger.m3973i("No router for WAMP action %d.", Integer.valueOf(iM92585c));
                        } else {
                            r7d1Var = (b741) u4iVar2.f226718L0;
                        }
                        if (r7d1Var != null) {
                            r7d1Var.mo28350d(y0i0VarM84392a);
                            return;
                        }
                        return;
                    } catch (Exception e3) {
                        e3.getMessage();
                        na6.m63959g(e3.getMessage(), e3);
                        return;
                    }
                } catch (Exception e4) {
                    e4.getMessage();
                    na6.m63959g(e4.getMessage(), e4);
                    return;
                }
                e4.getMessage();
                na6.m63959g(e4.getMessage(), e4);
                return;
            case 15:
                gc41 gc41Var = (gc41) this.f22963b;
                WebViewStartupException webViewStartupException = (WebViewStartupException) this.f22964c;
                hqb hqbVar = (hqb) gc41Var.f78492b;
                if (hqbVar.isActive()) {
                    hqbVar.resumeWith(new s6x0(new c6x0(webViewStartupException)));
                    return;
                }
                return;
            case 16:
                ((zga1) this.f22963b).m96052e((red1) this.f22964c);
                return;
            default:
                xbe1 xbe1Var = (xbe1) this.f22963b;
                gb80 gb80Var = (gb80) this.f22964c;
                if (xbe1Var.f259899c) {
                    return;
                }
                xbe1Var.f259900d = gb80Var;
                gb80Var.mo31986a(xbe1Var);
                return;
        }
    }
}
