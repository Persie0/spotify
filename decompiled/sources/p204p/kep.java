package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.widget.ImageView;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.C0067a;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kep implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f121925b;

    public /* synthetic */ kep(int i, Object obj, Object obj2) {
        this.f121924a = i;
        this.f121925b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uw31 uw31Var;
        gr81 gr81Var;
        ServiceInfo serviceInfo;
        Object obj;
        int i = 0;
        switch (this.f121924a) {
            case 0:
                ((iep) this.f121925b).mo29258b(null);
                return;
            case 1:
                k800.m55717b(4, (ArrayList) this.f121925b);
                return;
            case 2:
                eh00 eh00Var = (eh00) ((rlv0) this.f121925b).f200373a;
                if (eh00Var != null) {
                    eh00Var.invoke();
                    return;
                }
                return;
            case 3:
                w9q w9qVar = (w9q) this.f121925b;
                c700.m31595O(2);
                Iterator it = w9qVar.f249231c.iterator();
                while (it.hasNext()) {
                    ((jx31) ((x9q) it.next()).f57320b).m54494c(w9qVar);
                }
                return;
            case 4:
                ((l861) this.f121925b).close();
                return;
            case 5:
                cbq cbqVar = (cbq) this.f121925b;
                cbqVar.f36183t = true;
                cbqVar.m32186c();
                return;
            case 6:
                req reqVar = (req) this.f121925b;
                if (!reqVar.f198410g.f142817A0 || Build.VERSION.SDK_INT < 32 || (uw31Var = reqVar.f198412i) == null || !uw31Var.f234561b || (gr81Var = reqVar.f38916a) == null) {
                    return;
                }
                gr81Var.mo45474g(null);
                return;
            case 7:
                ((ngq) this.f121925b).f153764h.mo88016o();
                return;
            case 8:
                ((wxb1) this.f121925b).mo33243j();
                return;
            case 9:
                ((C0067a) this.f121925b).f1026i.mo25348e();
                return;
            case 10:
                ((jbb) this.f121925b).cancel(true);
                return;
            case 11:
                ((r5r) this.f121925b).m74827w1();
                return;
            case 12:
                ((MaybeObserver) this.f121925b).onComplete();
                return;
            case 13:
                ((ft51) this.f121925b).onComplete();
                return;
            case 14:
                kjs kjsVar = (kjs) this.f121925b;
                kjsVar.f123416f = true;
                kjsVar.m56622c();
                return;
            case 15:
                ljs ljsVar = (ljs) ((d2n) this.f121925b).f44589d;
                if (ljsVar != null) {
                    Iterator it2 = ljsVar.values().iterator();
                    while (it2.hasNext()) {
                        ((v761) it2.next()).m84842b();
                    }
                    return;
                }
                return;
            case 16:
                ((ImageView) this.f121925b).sendAccessibilityEvent(128);
                return;
            case 17:
                ((EmojiView) this.f121925b).sendAccessibilityEvent(128);
                return;
            case 18:
                xpo xpoVar = (xpo) this.f121925b;
                Intent intent = new Intent("androidx.xr.projected.ACTION_ENGAGEMENT_BIND");
                Context context = (Context) xpoVar.f264694d;
                ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 131072);
                if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                    return;
                }
                String str = serviceInfo.packageName;
                wj50.m88279p(str);
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
                    if (applicationInfo == null || (applicationInfo.flags & 1) == 0) {
                        return;
                    }
                    intent.setPackage(str);
                    context.bindService(intent, (i8v) xpoVar.f264697g, 1);
                    return;
                } catch (PackageManager.NameNotFoundException | SecurityException unused) {
                    return;
                }
            case 19:
                gjx gjxVar = (gjx) this.f121925b;
                dy0 dy0Var = gjxVar.f80579C;
                Context context2 = gjxVar.f80610e;
                String str2 = h0b1.f86200a;
                int iGenerateAudioSessionId = fz6.m43165u(context2).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                dy0Var.getClass();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ((kh61) dy0Var.f54138c).f122536a.getLooper()) {
                    obj = dy0Var.f54140e;
                } else {
                    c95.m31855u(looperMyLooper == ((kh61) dy0Var.f54137b).f122536a.getLooper());
                    obj = dy0Var.f54141f;
                }
                if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    dy0Var.f54141f = numValueOf;
                    en8 en8Var = new en8(dy0Var, numValueOf, i);
                    kh61 kh61Var = (kh61) dy0Var.f54138c;
                    if (kh61Var.f122536a.getLooper().getThread().isAlive()) {
                        kh61Var.m56388f(en8Var);
                    }
                    kh61 kh61Var2 = gjxVar.f80624l.f189355g;
                    jh61 jh61VarM56385b = kh61Var2.m56385b(40, iGenerateAudioSessionId, 0);
                    Handler handler = kh61Var2.f122536a;
                    Message message = jh61VarM56385b.f112345a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    jh61VarM56385b.m53363a();
                    return;
                }
                return;
            case 20:
                xwo xwoVar = ((qjx) this.f121925b).f189334U0;
                xwoVar.m92297Z(xwoVar.m92292G(), 1034, new pwo(15));
                return;
            case 21:
                try {
                    qjx.m72957h((jap0) this.f121925b);
                    return;
                } catch (ExoPlaybackException e) {
                    yif1.m93810s("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 22:
                q3y q3yVar = (q3y) this.f121925b;
                ((txb1) q3yVar.f226862c).m81905f(new o3y(q3yVar, 5), true);
                return;
            case 23:
                w8y.m87475g((w8y) this.f121925b);
                return;
            case 24:
                fey.m41489a((Intent) this.f121925b);
                return;
            case 25:
                rzz rzzVar = (rzz) this.f121925b;
                synchronized (rzzVar.f204259d) {
                    try {
                        if (rzzVar.f204263h == null) {
                            return;
                        }
                        try {
                            o000 o000VarM76839c = rzzVar.m76839c();
                            int i2 = o000VarM76839c.f160202f;
                            if (i2 == 2) {
                                synchronized (rzzVar.f204259d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = sa81.f207158a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                tc5 tc5Var = rzzVar.f204258c;
                                Context context3 = rzzVar.f204256a;
                                tc5Var.getClass();
                                o000[] o000VarArr = {o000VarM76839c};
                                AbstractC1806e9 abstractC1806e9 = wo91.f253411a;
                                fn1.m42176e(k0e1.m54980O("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceMo26667N0 = wo91.f253411a.mo26667N0(context3, o000VarArr, 0);
                                    fn1.m42178g();
                                    MappedByteBuffer mappedByteBufferM71822J = q0f1.m71822J(rzzVar.f204256a, o000VarM76839c.f160197a);
                                    if (mappedByteBufferM71822J == null || typefaceMo26667N0 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        x4b x4bVar = new x4b(typefaceMo26667N0, g0b1.m43280v(mappedByteBufferM71822J));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (rzzVar.f204259d) {
                                            try {
                                                id6 id6Var = rzzVar.f204263h;
                                                if (id6Var != null) {
                                                    id6Var.mo49881l(x4bVar);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        rzzVar.m76838b();
                                        return;
                                    } catch (Throwable th2) {
                                        int i4 = sa81.f207158a;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    fn1.m42178g();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                int i5 = sa81.f207158a;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (rzzVar.f204259d) {
                                try {
                                    id6 id6Var2 = rzzVar.f204263h;
                                    if (id6Var2 != null) {
                                        id6Var2.mo49880k(th5);
                                    }
                                    rzzVar.m76838b();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 26:
                Iterator it3 = ((c700) this.f121925b).f34680o.iterator();
                while (it3.hasNext()) {
                    ((x600) it3.next()).getClass();
                }
                return;
            case 27:
                ((ScheduledFuture) this.f121925b).cancel(true);
                return;
            case 28:
                ((gbb) this.f121925b).m44211b(null);
                return;
            default:
                ((mg10) this.f121925b).m61674m();
                return;
        }
    }

    public /* synthetic */ kep(Object obj, int i) {
        this.f121924a = i;
        this.f121925b = obj;
    }

    public /* synthetic */ kep(ngq ngqVar, mgq mgqVar) {
        this.f121924a = 7;
        this.f121925b = ngqVar;
    }

    public /* synthetic */ kep(qjx qjxVar, int i) {
        this.f121924a = 20;
        this.f121925b = qjxVar;
    }
}
