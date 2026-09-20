package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.C0067a;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fxf implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f74361c;

    public /* synthetic */ fxf(int i, Object obj, Object obj2) {
        this.f74359a = i;
        this.f74361c = obj;
        this.f74360b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x019f  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b8  */
    @Override // java.lang.Runnable
    public final void run() {
        njq njqVar;
        CharSequence charSequence;
        boolean z;
        boolean z2;
        switch (this.f74359a) {
            case 0:
                fvl0 fvl0Var = (fvl0) this.f74361c;
                j4t0 j4t0Var = (j4t0) this.f74360b;
                if (fvl0Var.f73815b != fvl0.f73813d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (fvl0Var) {
                    njqVar = fvl0Var.f73814a;
                    fvl0Var.f73814a = null;
                    fvl0Var.f73815b = j4t0Var;
                    break;
                }
                njqVar.mo40111e(j4t0Var);
                return;
            case 1:
                vx70 vx70Var = (vx70) this.f74361c;
                j4t0 j4t0Var2 = (j4t0) this.f74360b;
                synchronized (vx70Var) {
                    try {
                        if (vx70Var.f245636b == null) {
                            vx70Var.f245635a.add(j4t0Var2);
                        } else {
                            vx70Var.f245636b.add(j4t0Var2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                ((bxb) this.f74361c).m30802p((rxi) this.f74360b);
                return;
            case 3:
                List<jy8> list = (List) this.f74361c;
                l7j l7jVar = (l7j) this.f74360b;
                for (jy8 jy8Var : list) {
                    Object obj = l7jVar.f130665e;
                    ky8 ky8Var = jy8Var.f117321a;
                    jy8Var.f117322b.mo71315c().mo30231j(ky8Var.mo57646e(obj) ? new i8j(ky8Var.mo57645d()) : h8j.f88718a);
                }
                return;
            case 4:
                ((v2l) this.f74361c).m84516c((String) this.f74360b, Boolean.FALSE);
                return;
            case 5:
                a3l a3lVar = (a3l) this.f74361c;
                Throwable th2 = (Throwable) this.f74360b;
                v2l v2lVar = a3lVar.f11989h;
                Thread threadCurrentThread = Thread.currentThread();
                v2lVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                p4l p4lVar = v2lVar.f236691n;
                if (p4lVar == null || !p4lVar.f173974e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strM84519f = v2lVar.m84519f();
                    if (strM84519f == null) {
                        return;
                    }
                    q201 q201Var = v2lVar.f236690m;
                    q201Var.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    q201Var.m71976j(th2, threadCurrentThread, strM84519f, "error", j, false);
                    return;
                }
                return;
            case 6:
                a3l a3lVar2 = (a3l) this.f74361c;
                String str = (String) this.f74360b;
                clq0 clq0Var = a3lVar2.f11989h.f236681d;
                clq0Var.getClass();
                String strM37481a = e070.m37481a(1024, str);
                synchronized (((AtomicMarkableReference) clq0Var.f39346h)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) clq0Var.f39346h).getReference();
                        if (strM37481a == null ? str2 == null : strM37481a.equals(str2)) {
                            return;
                        }
                        ((AtomicMarkableReference) clq0Var.f39346h).set(strM37481a, true);
                        ((q4l) ((rb5) clq0Var.f39341c).f197472c).m72169a(new rsz0(clq0Var, 14));
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 7:
                a3l a3lVar3 = (a3l) this.f74361c;
                Map map = (Map) this.f74360b;
                s831 s831Var = (s831) a3lVar3.f11989h.f236681d.f39343e;
                synchronized (s831Var) {
                    ((e070) ((AtomicMarkableReference) s831Var.f206534c).getReference()).m37483c(map);
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) s831Var.f206534c;
                    atomicMarkableReference.set((e070) atomicMarkableReference.getReference(), true);
                    break;
                }
                s831Var.m77454b();
                return;
            case 8:
                jep jepVar = (jep) this.f74361c;
                r300 r300Var = (r300) this.f74360b;
                lep lepVar = jepVar.f111641d;
                if (lepVar.f132643p == 0 || jepVar.f111640c) {
                    return;
                }
                Looper looper = lepVar.f132647t;
                looper.getClass();
                jepVar.f111639b = lepVar.m58804f(looper, jepVar.f111638a, r300Var, false);
                lepVar.f132641n.add(jepVar);
                return;
            case 9:
                qjp qjpVar = (qjp) this.f74361c;
                Uri uri = (Uri) this.f74360b;
                qjpVar.f189291t = false;
                if (qjpVar.f189282a.equals(qjpVar.f189281Z.f209901P0) || qjpVar.f189280Y) {
                    qjpVar.m72932b(uri);
                    return;
                }
                return;
            case 10:
                r800.m74962j((Rect) this.f74360b, (View) this.f74361c);
                return;
            case 11:
                w9q w9qVar = (w9q) this.f74361c;
                ViewGroup viewGroup = (ViewGroup) this.f74360b;
                Iterator it = w9qVar.f249231c.iterator();
                while (it.hasNext()) {
                    jx31 jx31Var = (jx31) ((x9q) it.next()).f57320b;
                    View view = jx31Var.f116782c.f98706h1;
                    if (view != null) {
                        dq60.m36601a(jx31Var.f116780a, view, viewGroup);
                    }
                }
                return;
            case 12:
                cbq cbqVar = (cbq) this.f74361c;
                l861 l861Var = (l861) this.f74360b;
                Surface surfaceM58460c = l861Var.m58460c(cbqVar.f36176c, new sgb(1, cbqVar, l861Var));
                cbqVar.f36174a.m78663q(surfaceM58460c);
                cbqVar.f36181h.put(l861Var, surfaceM58460c);
                return;
            case 13:
                final cbq cbqVar2 = (cbq) this.f74361c;
                final s861 s861Var = (s861) this.f74360b;
                cbqVar2.f36182i++;
                sol0 sol0Var = cbqVar2.f36174a;
                fl00.m41971d((AtomicBoolean) sol0Var.f211214c, true);
                fl00.m41970c((Thread) sol0Var.f211216e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(sol0Var.f211212a);
                Size size = s861Var.f206577b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                zb20 zb20Var = cbqVar2.f36176c;
                s861Var.m77463b(zb20Var, new m94(21, cbqVar2, s861Var));
                s861Var.m77462a(surface, zb20Var, new y8j() { // from class: p.bbq
                    @Override // p204p.y8j
                    public final void accept(Object obj2) {
                        cbq cbqVar3 = cbqVar2;
                        s861 s861Var2 = s861Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        cbqVar3.getClass();
                        synchronized (s861Var2.f206576a) {
                            s861Var2.f206588m = null;
                            s861Var2.f206589n = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        cbqVar3.f36182i--;
                        cbqVar3.m32186c();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(cbqVar2, cbqVar2.f36177d);
                return;
            case 14:
                ((ngq) this.f74361c).f153764h.mo81150e(((r300) ((mgq) this.f74360b).f143607c).f195352B);
                return;
            case 15:
                ((C0067a) ((tgq) this.f74361c).f220238c).f1026i.mo24872b((k9c1) this.f74360b);
                return;
            case 16:
                Callable callable = (Callable) this.f74361c;
                nfp nfpVar = (nfp) this.f74360b;
                try {
                    nfpVar.m64360l(callable.call());
                    return;
                } catch (Exception e) {
                    nfpVar.m64361m(e);
                    return;
                }
            case 17:
                x0h1.m89578u(((usr) this.f74361c).f233678e, null, 0, new C2069kx((gh00) this.f74360b, null, 23), 3);
                return;
            case 18:
                ((tsr) this.f74361c).f223424e.mo30231j((gh00) this.f74360b);
                return;
            case 19:
                e6s e6sVar = (e6s) this.f74361c;
                IOException iOException = (IOException) this.f74360b;
                cdn cdnVar = e6sVar.f56723j;
                cdnVar.getClass();
                ((SingleEmitter) cdnVar.f36918e).onError(iOException);
                e6sVar.m37960e();
                return;
            case 20:
                e6s e6sVar2 = (e6s) this.f74361c;
                cdn cdnVar2 = (cdn) this.f74360b;
                e6sVar2.getClass();
                cdnVar2.m32451n(e6sVar2, false);
                return;
            case 21:
                final kjs kjsVar = (kjs) this.f74361c;
                s861 s861Var2 = (s861) this.f74360b;
                kjsVar.f123415e++;
                ijs ijsVar = kjsVar.f123411a;
                boolean z3 = s861Var2.f206580e;
                Size size2 = s861Var2.f206577b;
                fl00.m41971d((AtomicBoolean) ijsVar.f211214c, true);
                fl00.m41970c((Thread) ijsVar.f211216e);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z3 ? ijsVar.f102886L0 : ijsVar.f102887M0);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                s861Var2.m77462a(surface2, kjsVar.f123413c, new y8j() { // from class: p.jjs
                    @Override // p204p.y8j
                    public final void accept(Object obj2) {
                        kjs kjsVar2 = kjsVar;
                        kjsVar2.getClass();
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        kjsVar2.f123415e--;
                        kjsVar2.m56622c();
                    }
                });
                if (z3) {
                    kjsVar.f123419i = surfaceTexture2;
                    return;
                } else {
                    kjsVar.f123420t = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(kjsVar, kjsVar.f123414d);
                    return;
                }
            case 22:
                kjs kjsVar2 = (kjs) this.f74361c;
                l861 l861Var2 = (l861) this.f74360b;
                Surface surfaceM58460c2 = l861Var2.m58460c(kjsVar2.f123413c, new sgb(2, kjsVar2, l861Var2));
                kjsVar2.f123411a.m78663q(surfaceM58460c2);
                kjsVar2.f123418h.put(l861Var2, surfaceM58460c2);
                return;
            case 23:
                CharSequence charSequence2 = (CharSequence) this.f74361c;
                EmojiView emojiView = (EmojiView) this.f74360b;
                Bitmap bitmap = emojiView.f882c;
                if (charSequence2 == null) {
                    bitmap.eraseColor(0);
                    return;
                }
                if (charSequence2.equals(emojiView.emoji)) {
                    if (q8u.f186388M0) {
                        p7u p7uVarM69297a = p7u.m69297a();
                        p7uVarM69297a.getClass();
                        CharSequence charSequenceM69304h = p7uVarM69297a.m69304h(0, charSequence2.length(), 0, charSequence2);
                        if (charSequenceM69304h == null) {
                            charSequence = charSequence2;
                        } else {
                            charSequence = charSequenceM69304h;
                        }
                    } else {
                        charSequence = charSequence2;
                    }
                    if (emojiView.willDrawVariantIndicator) {
                        LinkedHashMap linkedHashMap = u4g1.f226684L0;
                        if (linkedHashMap == null) {
                            throw new IllegalStateException("BundledEmojiListLoader.load is not called or complete");
                        }
                        if (linkedHashMap.containsKey(charSequence2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    TextPaint textPaint = emojiView.f881b;
                    bitmap.eraseColor(0);
                    Canvas canvas = new Canvas(bitmap);
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, canvas.getWidth());
                        builderObtain.setAlignment(Layout.Alignment.ALIGN_CENTER);
                        builderObtain.setLineSpacing(0.0f, 1.0f);
                        builderObtain.setIncludePad(false);
                        builderObtain.build().draw(canvas);
                    } else {
                        canvas.drawText(charSequence, 0, charSequence.length(), (canvas.getWidth() - textPaint.measureText(charSequence, 0, charSequence.length())) / 2, -textPaint.getFontMetrics().top, textPaint);
                    }
                    if (z) {
                        Drawable drawable = emojiView.getContext().getDrawable(R.drawable.variant_availability_indicator);
                        if (drawable != null) {
                            int width = canvas.getWidth();
                            int height = canvas.getHeight();
                            drawable.setBounds(new Rect(width - emojiView.getContext().getResources().getDimensionPixelSize(R.dimen.variant_availability_indicator_width), height - emojiView.getContext().getResources().getDimensionPixelSize(R.dimen.variant_availability_indicator_height), width, height));
                        } else {
                            drawable = null;
                        }
                        wj50.m88279p(drawable);
                        drawable.draw(canvas);
                    }
                    emojiView.setContentDescription(emojiView.getContext().getString(R.string.emoji_content_desc, emojiView.emoji));
                }
                emojiView.invalidate();
                return;
            case 24:
                gjx gjxVar = (gjx) this.f74361c;
                njx njxVar = (njx) this.f74360b;
                int i = gjxVar.f80586J - njxVar.f154664b;
                gjxVar.f80586J = i;
                boolean z4 = true;
                if (njxVar.f154667e) {
                    gjxVar.f80587K = njxVar.f154665c;
                    gjxVar.f80588L = true;
                }
                if (i == 0) {
                    qp71 qp71Var = ((a0p0) njxVar.f154668f).f11132a;
                    int iMo43847M0 = -1;
                    if (!gjxVar.f80637r0.f11132a.m73436p() && qp71Var.m73436p()) {
                        gjxVar.f80639s0 = -1;
                        gjxVar.f80641t0 = 0L;
                    }
                    if (!qp71Var.m73436p()) {
                        List listAsList = Arrays.asList(((jtp0) qp71Var).f115944k);
                        c95.m31855u(listAsList.size() == gjxVar.f80632p.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((djx) gjxVar.f80632p.get(i2)).f49767c = (qp71) listAsList.get(i2);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (gjxVar.f80588L) {
                        boolean z5 = ((a0p0) njxVar.f154668f).f11132a.m73436p() && gjxVar.f80637r0.f11132a.m73436p();
                        boolean zM86308b = ((a0p0) njxVar.f154668f).f11133b.m86308b(gjxVar.f80637r0.f11133b);
                        boolean z6 = ((a0p0) njxVar.f154668f).f11135d == gjxVar.f80637r0.f11150s;
                        if (z5 || (zM86308b && z6)) {
                            z4 = false;
                        }
                        if (z4) {
                            iMo43847M0 = gjxVar.mo43847M0();
                            if (qp71Var.m73436p() || ((a0p0) njxVar.f154668f).f11133b.m86309c()) {
                                j2 = ((a0p0) njxVar.f154668f).f11135d;
                            } else {
                                a0p0 a0p0Var = (a0p0) njxVar.f154668f;
                                vsd0 vsd0Var = a0p0Var.f11133b;
                                long j3 = a0p0Var.f11135d;
                                Object obj2 = vsd0Var.f244408a;
                                bp71 bp71Var = gjxVar.f80630o;
                                qp71Var.mo46978g(obj2, bp71Var);
                                j2 = j3 + bp71Var.f29347e;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = false;
                        z4 = false;
                    }
                    long j4 = j2;
                    int i3 = iMo43847M0;
                    gjxVar.f80588L = z2;
                    gjxVar.m44994C1((a0p0) njxVar.f154668f, 1, z4, gjxVar.f80587K, j4, i3, false);
                    return;
                }
                return;
            case 25:
                bmx bmxVar = (bmx) this.f74361c;
                ((n890) bmxVar.f28644b).m63839j(-1, new its(bmxVar, (p591) this.f74360b));
                return;
            case 26:
                ((o7z) this.f74361c).f162647j.mo33237a(VideoFrameProcessingException.m757a(-9223372036854775807L, (InterruptedException) this.f74360b));
                return;
            case 27:
                ((o7z) this.f74361c).f162647j.mo33237a(VideoFrameProcessingException.m757a(-9223372036854775807L, (GlUtil$GlException) this.f74360b));
                return;
            case 28:
                ((o7z) this.f74361c).f162647j.mo33237a((VideoFrameProcessingException) this.f74360b);
                return;
            default:
                o7z o7zVar = (o7z) this.f74361c;
                di21 di21Var = (di21) this.f74360b;
                o7zVar.f162647j.mo81149d(di21Var.f49219a, di21Var.f49220b);
                return;
        }
    }

    public /* synthetic */ fxf(r800 r800Var, View view, Rect rect) {
        this.f74359a = 10;
        this.f74361c = view;
        this.f74360b = rect;
    }
}
