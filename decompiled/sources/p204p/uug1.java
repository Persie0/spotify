package p204p;

import android.app.PendingIntent;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import com.comscore.streaming.ContentType;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import com.spotify.music.R;
import com.spotify.share.resultactivity.api.ShareResultActivity;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Locale;
import java.util.Set;
import p000.C1635n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uug1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f234197a;

    /* JADX INFO: renamed from: b */
    public static volatile ihj0 f234198b;

    /* JADX INFO: renamed from: c */
    public static volatile qgj0 f234199c;

    /* JADX INFO: renamed from: a */
    public static final void m84007a(zug1 zug1Var, gh00 gh00Var, rk0 rk0Var, rbf rbfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-489769251);
        int i2 = i | (xq00Var2.m91766g(zug1Var) ? 4 : 2) | (xq00Var2.m91770i(gh00Var) ? 32 : 16) | (xq00Var2.m91770i(rk0Var) ? 256 : 128) | (xq00Var2.m91766g(rbfVar) ? 2048 : 1024) | (xq00Var2.m91766g(fxh0Var) ? 16384 : 8192);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z = i3 == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new u71(2, gh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                ecu ecuVar = new ecu(false, ((C2099lq) ((ogm) rk0Var.f199940h).f165186a.f102010c).m59683n());
                xq00Var2.m91793t0(ecuVar);
                objM91750T2 = ecuVar;
            }
            ecu ecuVar2 = (ecu) objM91750T2;
            boolean z2 = i3 == 32;
            Object objM91750T3 = xq00Var2.m91750T();
            if (z2 || objM91750T3 == ia7Var) {
                objM91750T3 = new C1902gm(4, gh00Var);
                xq00Var2.m91793t0(objM91750T3);
            }
            th00 th00Var = (th00) objM91750T3;
            boolean z3 = i3 == 32;
            Object objM91750T4 = xq00Var2.m91750T();
            if (z3 || objM91750T4 == ia7Var) {
                objM91750T4 = new u71(1, gh00Var);
                xq00Var2.m91793t0(objM91750T4);
            }
            eh00 eh00Var2 = (eh00) objM91750T4;
            if (zug1Var instanceof l81) {
                xq00Var2.m91771i0(-711011183);
                mif1.m61869b(ecuVar2, new ybu(k0e1.m54977L(R.string.add_blocked_content_empty_title, xq00Var2), k0e1.m54977L(R.string.add_blocked_content_empty_subtitle, xq00Var2), 1), null, null, xq00Var2, 6, 12);
                xq00Var2.m91788r(false);
            } else if (zug1Var instanceof n81) {
                xq00Var2.m91771i0(1778192489);
                i091.m49337i((C1873fu) rk0Var.f199942t, xq00Var2, 0);
                xq00Var2.m91788r(false);
            } else if (zug1Var instanceof m81) {
                xq00Var2.m91771i0(1778195564);
                uxg1.m84157d(eh00Var, (pgm) rk0Var.f199932X, fxh0Var, false, xq00Var, (i2 >> 6) & 896, 8);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            } else if (zug1Var instanceof o81) {
                xq00Var2.m91771i0(1778201761);
                zlg1.m96367c(((o81) zug1Var).f162670c, ecuVar2, xq00Var2, 48);
                xq00Var2.m91788r(false);
            } else {
                if (!(zug1Var instanceof p81)) {
                    throw lq51.m59703i(1778178644, xq00Var2, false);
                }
                xq00Var2.m91771i0(-710186707);
                p81 p81Var = (p81) zug1Var;
                ybg1.m93267d(p81Var.f174802c, p81Var.f174804e, th00Var, rk0Var, mi21.m61820d(1.0f, fxh0Var), p81Var.f174805f, p81Var.f174806g, eh00Var2, p81Var.f174807h, rbfVar, p81Var.f174808i, xq00Var2, ((i2 << 18) & 1879048192) | ((i2 << 3) & 7168));
                xq00Var2 = xq00Var2;
                xq00Var2.m91788r(false);
            }
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1635n(zug1Var, gh00Var, rk0Var, rbfVar, fxh0Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m84008b(z71 z71Var, gh00 gh00Var, rk0 rk0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-260818824);
        int i2 = i | (xq00Var.m91770i(z71Var) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91770i(rk0Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            ppz ppzVar = (ppz) xq00Var.m91774k(wsh.f254618i);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                xq00Var.m91793t0(gh00Var);
                objM91750T = gh00Var;
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                tvy0 tvy0Var = new tvy0(new C1743cj(20, gh00Var2), new C1966i4(12, gh00Var2, ppzVar), new u71(3, gh00Var2), false, ((C2099lq) ((ygm) rk0Var.f199939g).f272602a.f102010c).m59683n());
                xq00Var.m91793t0(tvy0Var);
                objM91750T2 = tvy0Var;
            }
            tvy0 tvy0Var2 = (tvy0) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = new d81(tvy0Var2, null, 0);
                xq00Var.m91793t0(objM91750T3);
            }
            hz40.m49237i(w2a1.f247311a, (th00) objM91750T3, xq00Var);
            vig1.m85649d(null, rkk.m75772x(-1953967573, new e81(tvy0Var2, z71Var, 1), xq00Var), null, null, rkk.m75772x(131084017, new jo21(z71Var, gh00Var2, rk0Var), xq00Var), xq00Var, 24624, 13);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1690b3(z71Var, gh00Var, rk0Var, fxh0Var2, i, 7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m84009c(int i, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fxh0 fxh0Var2;
        j15 j15VarM43339o;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-2142397085);
        int i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i | 48 | (xq00Var.m91768h(z) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            String strM54977L = k0e1.m54977L(R.string.group_chat_request_title, xq00Var);
            boolean z2 = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == obj) {
                objM91750T = new tc00(29, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            xq00Var.m91771i0(1593858185);
            if (z) {
                xq00Var.m91771i0(1765965177);
                xq00Var.m91788r(false);
                g15 g15Var = new g15();
                g15Var.m43331g(k0e1.m54977L(R.string.group_chat_request_subtitle_holistic, xq00Var));
                g15Var.m43331g(" ");
                String strM54977L2 = k0e1.m54977L(R.string.chat_request_manage_social_settings, xq00Var);
                FontFamily fontFamily = leu.m58818d(xq00Var).f64978n.f101704a.f63415f;
                long j = 0;
                ew31 ew31Var = new ew31(leu.m58815a(xq00Var).f112824b.f138757a, j, leu.m58818d(xq00Var).f64978n.f101704a.f63412c, leu.m58818d(xq00Var).f64978n.f101704a.f63413d, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490);
                boolean zM91766g = xq00Var.m91766g(eh00Var);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91766g || objM91750T2 == obj) {
                    objM91750T2 = new s2w(5, eh00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                vie.m85608a(g15Var, strM54977L2, "manageSocialSettings", ew31Var, (gh00) objM91750T2);
                j15VarM43339o = g15Var.m43339o();
            } else {
                xq00Var.m91771i0(1765882531);
                j15VarM43339o = new j15(k0e1.m54977L(R.string.group_chat_request_subtitle, xq00Var));
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(false);
            j15 j15Var = j15VarM43339o;
            fxh0Var2 = cxh0.f43038a;
            zmg1.m96434a(strM54977L, j15Var, epv0.m39673I("group_chat-request-view-test-tag", fxh0Var2), rkk.m75772x(1520147024, new zov(6, gh00Var), xq00Var), xq00Var, 3072, 0);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kr5(gh00Var, fxh0Var2, z, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final s1e1 m84010d(hol0 hol0Var, Set set, vh00 vh00Var) {
        BluetoothManager bluetoothManager = (BluetoothManager) hol0Var.f93562b;
        Context context = (Context) hol0Var.f93563c;
        ruc rucVar = (ruc) hol0Var.f93564d;
        a0a a0aVar = (a0a) hol0Var.f93565e;
        a0a a0aVar2 = (a0a) hol0Var.f93566f;
        rlv0 rlv0Var = new rlv0();
        BluetoothGattServer bluetoothGattServerOpenGattServer = bluetoothManager.openGattServer(context, new hqa(new ms8(rlv0Var, 9), vh00Var, rucVar, a0aVar, a0aVar2));
        rlv0Var.f200373a = bluetoothGattServerOpenGattServer;
        return new s1e1(bluetoothGattServerOpenGattServer, new e2a(1, puc.f181408a, puc.class, "convert", "convert(Lcom/spotify/bluetooth/common/BLECharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;", 0, 0, 0), set);
    }

    /* JADX INFO: renamed from: e */
    public static final hlh m84011e(fxh0 fxh0Var) {
        return new hlh(new fyf(new ttv(fxh0Var, 0), true, 2044538759), null, null, false, 62);
    }

    /* JADX INFO: renamed from: g */
    public static int m84013g(int i) {
        try {
            return tfe.m80665w(nap.m64033z(i).toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return 22;
        }
    }

    /* JADX INFO: renamed from: h */
    public static PendingIntent m84014h(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    /* JADX INFO: renamed from: i */
    public static final int m84015i(View view, View view2) {
        iic1 iic1VarM84028v = m84028v(view);
        uga ugaVar = m84028v(view2).f102510b;
        uga ugaVar2 = iic1VarM84028v.f102510b;
        int i = ugaVar2.f230056c;
        int i2 = ugaVar2.f230057d;
        int i3 = ugaVar2.f230055b;
        int i4 = ugaVar2.f230054a;
        int i5 = (i2 - i3) * (i - i4);
        if (!iic1VarM84028v.f102509a || i5 == 0) {
            return 0;
        }
        int i6 = ugaVar.f230056c;
        int i7 = ugaVar.f230055b;
        int i8 = ugaVar.f230057d;
        int i9 = ugaVar.f230054a;
        if (i4 > i6 || i < i9 || i3 > i8 || i2 < i7) {
            return 0;
        }
        if (i2 - i3 > i8 - i7) {
            return 100;
        }
        return (int) ((((double) ((Math.min(i2, i8) - Math.max(i3, i7)) * (Math.min(i, i6) - Math.max(i4, i9)))) / ((double) i5)) * ((double) 100));
    }

    /* JADX INFO: renamed from: j */
    public static final long m84016j(gcs gcsVar) {
        DragEvent dragEvent = gcsVar.f78648a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX INFO: renamed from: k */
    public static void m84017k(MediaButtonReceiver mediaButtonReceiver, xb5 xb5Var) {
        mediaButtonReceiver.f5461b = xb5Var;
    }

    /* JADX INFO: renamed from: l */
    public static void m84018l(MediaButtonReceiver mediaButtonReceiver, z140 z140Var) {
        mediaButtonReceiver.f5467h = z140Var;
    }

    /* JADX INFO: renamed from: m */
    public static void m84019m(MediaButtonReceiver mediaButtonReceiver, Scheduler scheduler) {
        mediaButtonReceiver.f5464e = scheduler;
    }

    /* JADX INFO: renamed from: n */
    public static void m84020n(MediaButtonReceiver mediaButtonReceiver, aba0 aba0Var) {
        mediaButtonReceiver.f5462c = aba0Var;
    }

    /* JADX INFO: renamed from: o */
    public static void m84021o(MediaButtonReceiver mediaButtonReceiver, tfm0 tfm0Var) {
        mediaButtonReceiver.f5463d = tfm0Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m84022p(MediaButtonReceiver mediaButtonReceiver, Scheduler scheduler) {
        mediaButtonReceiver.f5465f = scheduler;
    }

    /* JADX INFO: renamed from: q */
    public static void m84023q(MediaButtonReceiver mediaButtonReceiver, rhy0 rhy0Var) {
        mediaButtonReceiver.f5460a = rhy0Var;
    }

    /* JADX INFO: renamed from: r */
    public static void m84024r(MediaButtonReceiver mediaButtonReceiver, xo4 xo4Var) {
        mediaButtonReceiver.f5466g = xo4Var;
    }

    /* JADX INFO: renamed from: s */
    public static void m84025s(ShareResultActivity shareResultActivity, n9r0 n9r0Var) {
        shareResultActivity.f6654Y0 = n9r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public static void m84026t(wqb wqbVar, db71 db71Var) {
        wqb wqbVar2;
        Throwable th;
        z6i0 z6i0Var = db71Var.f47231b;
        boolean zM35533d = db71Var.m35533d();
        cb71 cb71Var = db71Var.f47230a;
        boolean z = zM35533d && cb71Var.f36038f != 3;
        if (z) {
            long j = db71Var.f47232c;
            tiv0 tiv0VarM71836j = q0f1.m71836j(0L, (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            wqbVar.mo25287p();
            wqb.m88736a(wqbVar, tiv0VarM71836j);
        }
        ew31 ew31Var = cb71Var.f36034b.f101704a;
        TextDecoration textDecoration = ew31Var.f63422m;
        v971 v971Var = ew31Var.f63410a;
        if (textDecoration == null) {
            textDecoration = TextDecoration.f538b;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = ew31Var.f63423n;
        if (shadow == null) {
            shadow = Shadow.f496d;
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = ew31Var.f63425p;
        if (drawStyle == null) {
            drawStyle = qxy.f193763a;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brushMo38249c = v971Var.mo38249c();
            u971 u971Var = u971.f228087a;
            try {
                if (brushMo38249c == null) {
                    long jMo38247a = v971Var != u971Var ? v971Var.mo38247a() : n6f.f150862b;
                    wqbVar2 = wqbVar;
                    try {
                        z6i0Var.m95503j(wqbVar2, jMo38247a, shadow2, textDecoration2, drawStyle2);
                        if (z) {
                            wqbVar2.mo25279h();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        wqbVar2.mo25279h();
                        throw th;
                    }
                }
                float fMo38248b = v971Var != u971Var ? v971Var.mo38248b() : 1.0f;
                wqbVar2 = wqbVar;
                try {
                    vvx.m86509j(z6i0Var, wqbVar2, brushMo38249c, fMo38248b, shadow2, textDecoration2, drawStyle2);
                    wqbVar2 = wqbVar2;
                    if (z) {
                        wqbVar2.mo25279h();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    wqbVar2.mo25279h();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                wqbVar2 = wqbVar;
            }
        } catch (Throwable th5) {
            th = th5;
            wqbVar2 = wqbVar;
        }
        if (!z) {
            throw th;
        }
        wqbVar2.mo25279h();
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:30:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: u */
    public static final java.lang.Object m84027u(int r10, p204p.pyu0 r11, p204p.ibk r12) {
        /*
            boolean r0 = r12 instanceof p204p.bzu0
            if (r0 == 0) goto L13
            r0 = r12
            p.bzu0 r0 = (p204p.bzu0) r0
            int r1 = r0.f32594g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32594g = r1
            goto L18
        L13:
            p.bzu0 r0 = new p.bzu0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f32593f
            int r1 = r0.f32594g
            r2 = 0
            r3 = 2
            r4 = 1
            p.yuk r5 = p204p.yuk.f276404a
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L33
            int r10 = r0.f32589b
            int r11 = r0.f32588a
            p.gh00 r1 = r0.f32592e
            p204p.bga.m29073P(r12)
            r12 = r1
            goto L8e
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            int r10 = r0.f32591d
            int r11 = r0.f32590c
            int r1 = r0.f32589b
            int r6 = r0.f32588a
            p.gh00 r7 = r0.f32592e
            p204p.bga.m29073P(r12)
            r9 = r11
            r11 = r10
            r10 = r1
            r1 = r12
            r12 = r9
            goto L6d
        L4e:
            p204p.bga.m29073P(r12)
            r12 = r11
            r11 = r2
        L53:
            if (r11 >= r10) goto L93
            r0.f32592e = r12
            r0.f32588a = r10
            r0.f32589b = r11
            r0.f32590c = r11
            r0.f32591d = r2
            r0.f32594g = r4
            java.lang.Object r1 = r12.invoke(r0)
            if (r1 != r5) goto L68
            goto L8b
        L68:
            r6 = r10
            r10 = r11
            r7 = r12
            r12 = r10
            r11 = r2
        L6d:
            p.s6x0 r1 = (p204p.s6x0) r1
            java.lang.Object r1 = r1.f206218a
            boolean r8 = r1 instanceof p204p.c6x0
            if (r8 != 0) goto L79
            p204p.bga.m29073P(r1)
            return r1
        L79:
            r0.f32592e = r7
            r0.f32588a = r6
            r0.f32589b = r10
            r0.f32590c = r12
            r0.f32591d = r11
            r0.f32594g = r3
            java.lang.Object r11 = p204p.qlk.m73247z(r0)
            if (r11 != r5) goto L8c
        L8b:
            return r5
        L8c:
            r11 = r6
            r12 = r7
        L8e:
            int r10 = r10 + r4
            r9 = r11
            r11 = r10
            r10 = r9
            goto L53
        L93:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.uug1.m84027u(int, p.pyu0, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: v */
    public static final iic1 m84028v(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new iic1(view.getVisibility() == 0, new uga(i, i2, view.getWidth() + i, (view.getHeight() + i2) - view.getPaddingBottom()));
    }
}
