package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.media.session.MediaSession;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.support.v4.media.session.InterfaceC0002a;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Layout;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class uqf1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233008a;

    /* JADX INFO: renamed from: b */
    public final Object f233009b;

    /* JADX INFO: renamed from: c */
    public final Object f233010c;

    public /* synthetic */ uqf1(int i, Object obj, Object obj2) {
        this.f233008a = i;
        this.f233009b = obj;
        this.f233010c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future, p.dsf1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    @Override // java.lang.Runnable
    public final void run() {
        eq10 eq10VarM59813v;
        Throwable thMo27131c;
        View view;
        RecyclerView recyclerView;
        e6a0 e6a0Var;
        GridLayoutManager layoutManager;
        float f = 0.0f;
        ?? r5 = 0;
        surface = null;
        Surface surface = null;
        int i = 1;
        boolean z = false;
        switch (this.f233008a) {
            case 0:
                f7d1 f7d1Var = (f7d1) this.f233010c;
                ?? r0 = (dsf1) this.f233009b;
                if ((r0 instanceof atf1) && (thMo27131c = ((atf1) r0).mo27131c()) != null) {
                    f7d1Var.m40971j(thMo27131c);
                    return;
                }
                try {
                    boolean zIsDone = r0.isDone();
                    ?? r1 = r0;
                    if (!zIsDone) {
                        throw new IllegalStateException(dt71.m36807B("Future was expected to be done: %s", r0));
                    }
                    while (true) {
                        try {
                            Object obj = r1.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            wqf1 wqf1Var = (wqf1) f7d1Var.f66660d;
                            if (iIntValue <= 0) {
                                ((nhy0) f7d1Var.f66659c).run();
                                return;
                            }
                            int iIntValue2 = num.intValue();
                            wqf1Var.getClass();
                            ye9 ye9VarM39906a = esf1.m39906a(iIntValue2, "Billing override value was set by a license tester.");
                            wqf1Var.m88747Z(93, 7, ye9VarM39906a);
                            ((d700) f7d1Var.f66658b).accept(ye9VarM39906a);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                            r1 = r1;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    f7d1Var.m40971j(e.getCause());
                    return;
                } catch (Throwable th2) {
                    f7d1Var.m40971j(th2);
                    return;
                }
                break;
            case 1:
                ((uf0) this.f233009b).f229632a = this.f233010c;
                return;
            case 2:
                Object obj2 = this.f233010c;
                Object obj3 = this.f233009b;
                try {
                    Method method = vf0.f240857d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        vf0.f240858e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 3:
                ly4 ly4Var = (ly4) this.f233009b;
                gy4 gy4Var = ly4Var.f137950a;
                vbn0 vbn0Var = (vbn0) this.f233010c;
                gy4Var.getClass();
                ArrayList arrayList = new ArrayList();
                if (!(vbn0Var instanceof uk4)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                PathMeasure pathMeasure = new PathMeasure(((uk4) vbn0Var).f231212a, false);
                float length = pathMeasure.getLength();
                if (length != 0.0f) {
                    int iM63437n = n0e1.m63437n((int) (length / 2.0f), 50, 400);
                    float[] fArr = {0.0f, 0.0f};
                    float[] fArr2 = {0.0f, 0.0f};
                    if (iM63437n >= 0) {
                        int i2 = 0;
                        while (true) {
                            float f2 = i2 / iM63437n;
                            pathMeasure.getPosTan(f2 * length, fArr, fArr2);
                            float f3 = -fArr2[1];
                            float f4 = fArr2[0];
                            float f5 = f;
                            float[] fArr3 = fArr2;
                            float fSqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                            float f6 = fSqrt > f5 ? f3 / fSqrt : f5;
                            float f7 = fSqrt > f5 ? f4 / fSqrt : f5;
                            arrayList.add(Float.valueOf(fArr[0]));
                            arrayList.add(Float.valueOf(fArr[1]));
                            arrayList.add(Float.valueOf(f2));
                            arrayList.add(Float.valueOf(f5));
                            arrayList.add(Float.valueOf((f6 * 40.0f) + fArr[0]));
                            arrayList.add(Float.valueOf((f7 * 40.0f) + fArr[1]));
                            arrayList.add(Float.valueOf(f2));
                            arrayList.add(Float.valueOf(1.0f));
                            if (i2 != iM63437n) {
                                i2++;
                                fArr2 = fArr3;
                                f = f5;
                            }
                        }
                    }
                    gy4Var.f85437d = arrayList.size() / 4;
                    float[] fArrM43722g1 = g6f.m43722g1(arrayList);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArrM43722g1.length * 4);
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
                    floatBufferAsFloatBuffer.put(fArrM43722g1);
                    floatBufferAsFloatBuffer.position(0);
                    GLES20.glBindBuffer(34962, gy4Var.f85436c);
                    GLES20.glBufferData(34962, fArrM43722g1.length * 4, floatBufferAsFloatBuffer, 35044);
                    GLES20.glBindBuffer(34962, 0);
                }
                ly4.m60215a(ly4Var);
                return;
            case 4:
                EditText editText = (EditText) this.f233009b;
                Layout layout = editText.getLayout();
                if (layout == null) {
                    return;
                }
                int lineBottom = layout.getLineBottom(layout.getLineForOffset(((String) this.f233010c).length()));
                Object parent = editText.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
                if (r5 == 0) {
                    r5 = view;
                    return;
                }
                int[] iArr = new int[2];
                r5.getLocationOnScreen(iArr);
                int top = editText.getTop() + iArr[1];
                int i3 = (int) (editText.getResources().getDisplayMetrics().heightPixels * 0.5f);
                int scrollY = (top + lineBottom) - editText.getScrollY();
                if (scrollY <= i3) {
                    r5 = view;
                    return;
                }
                r5 = view;
                int lineHeight = editText.getLineHeight() + (scrollY - i3);
                editText.animate().cancel();
                editText.animate().translationY(-lineHeight).setDuration(200L).start();
                return;
            case 5:
                cq6 cq6Var = ((gq6) this.f233009b).f83364a;
                RecyclerView recyclerView2 = (RecyclerView) this.f233010c;
                cq6Var.mo33599g(0, Float.valueOf(b0g1.m27774J(recyclerView2)), Float.valueOf(b0g1.m27775K(recyclerView2)), recyclerView2.getResources().getDisplayMetrics().density);
                return;
            case 6:
                vj7 vj7Var = (vj7) this.f233009b;
                m500 m500Var = (m500) this.f233010c;
                wj50.m88279p(m500Var);
                vj7Var.getClass();
                m500Var.startActivity(m500Var.getPackageManager().getLaunchIntentForPackage(m500Var.getPackageName()));
                return;
            case 7:
                q4c q4cVar = (q4c) this.f233010c;
                ArrayList<dkv0> arrayList2 = (ArrayList) this.f233009b;
                for (dkv0 dkv0Var : arrayList2) {
                    zkc1 zkc1VarM61551c = mec1.m61551c(dkv0Var.f50039a);
                    q4cVar.f185140k.add(dkv0Var);
                    View view2 = dkv0Var.f50039a;
                    p4c p4cVar = (p4c) view2.getTag(R.id.paste_carousel_animation_info);
                    float f8 = p4cVar != null ? p4cVar.f173890a : 1.0f;
                    q6c q6cVar = (q6c) view2.getTag(R.id.paste_carousel_tag);
                    if (q6cVar != null) {
                        if (q6cVar.f185738b == -1) {
                            view2.setTranslationX(-q6cVar.f185739c);
                        }
                        if (q6cVar.f185738b == 1) {
                            view2.setTranslationX(q6cVar.f185739c);
                        }
                    }
                    zkc1VarM61551c.m96312a(f8);
                    View view3 = (View) zkc1VarM61551c.f283721a.get();
                    if (view3 != null) {
                        view3.animate().translationX(0.0f);
                    }
                    zkc1VarM61551c.m96315d(300L);
                    zkc1VarM61551c.m96317f(new o4c(q4cVar, dkv0Var, zkc1VarM61551c, i));
                    zkc1VarM61551c.m96318g();
                }
                arrayList2.clear();
                q4cVar.f185139j.remove(arrayList2);
                return;
            case 8:
                if (((sbe) this.f233009b).f207449n) {
                    return;
                }
                try {
                    sbe.m77724b((sbe) this.f233009b);
                    k7i0 k7i0Var = new k7i0((String) this.f233010c, new j7i0(si51.f209361d, null, null, "chromeless-webview", null, null, 502), false, (i7i0) null, 0L, (h7i0) null, (String) null, true, 0, 764);
                    lg21 lg21Var = ((sbe) this.f233009b).f207453r;
                    if (lg21Var != null) {
                        lg21Var.m58924b(k7i0Var);
                    }
                    lg21 lg21Var2 = ((sbe) this.f233009b).f207453r;
                    if (lg21Var2 != null) {
                        lg21.m58922g(lg21Var2, null, null, null, null, 15);
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 9:
                if (((zte) this.f233009b).f286149g) {
                    return;
                }
                zte zteVar = (zte) this.f233009b;
                Surface surface2 = (Surface) this.f233010c;
                if (surface2 != null && surface2.isValid()) {
                    surface = surface2;
                }
                zteVar.f286147e = surface;
                zte zteVar2 = (zte) this.f233009b;
                Surface surfaceM96905a = zteVar2.m96905a();
                Iterator it = zteVar2.f286146d.values().iterator();
                while (it.hasNext()) {
                    ((xte) it.next()).m92012a(surfaceM96905a);
                }
                return;
            case 10:
                xuk xukVar = (xuk) ((rlv0) this.f233009b).f200373a;
                if (xukVar != null) {
                    x0h1.m89578u(xukVar, null, 0, new v3f((js3) this.f233010c, r5, i), 3);
                    return;
                }
                return;
            case 11:
                zhf zhfVar = (zhf) this.f233009b;
                if ((zhfVar instanceof yhf) && ((yhf) zhfVar).f272856c && (recyclerView = ((sgf) this.f233010c).f208850O0) != null) {
                    recyclerView.mo1035v0(0);
                    return;
                }
                return;
            case 12:
                ovf ovfVar = ((s7i) this.f233009b).f206370Y;
                d7i d7iVar = (d7i) this.f233010c;
                String str = d7iVar.f46200a;
                String str2 = d7iVar.f46201b;
                String str3 = d7iVar.f46202c;
                String str4 = d7iVar.f46203d;
                String str5 = d7iVar.f46204e;
                String str6 = d7iVar.f46205f;
                String str7 = d7iVar.f46206g;
                List list = d7iVar.f46207h;
                List list2 = d7iVar.f46208i;
                List list3 = d7iVar.f46209j;
                List list4 = d7iVar.f46210k;
                String str8 = d7iVar.f46211l;
                String str9 = d7iVar.f46212m;
                boolean z2 = d7iVar.f46213n;
                boolean z3 = d7iVar.f46214o;
                List list5 = d7iVar.f46215p;
                boolean z4 = d7iVar.f46216q;
                c7i c7iVar = d7iVar.f46219t;
                boolean z5 = d7iVar.f46220u;
                Integer num2 = d7iVar.f46221v;
                d7iVar.getClass();
                ovfVar.mo2820d(new d7i(str, str2, str3, str4, str5, str6, str7, list, list2, list3, list4, str8, str9, z2, z3, list5, z4, false, (Long) null, c7iVar, z5, num2));
                return;
            case 13:
                Integer num3 = ((hiy0) this.f233009b).f91899Y;
                if (num3 != null) {
                    ContentPickerFragment contentPickerFragment = (ContentPickerFragment) this.f233010c;
                    int iIntValue3 = num3.intValue();
                    e6a0 e6a0Var2 = contentPickerFragment.f2805L1;
                    if (e6a0Var2 != null && (layoutManager = ((GridRecyclerView) e6a0Var2.f56601e).getLayoutManager()) != null) {
                        layoutManager.mo962x1(iIntValue3, 1);
                    }
                    if (iIntValue3 == 0 && (e6a0Var = contentPickerFragment.f2805L1) != null) {
                        ((PickerCollapsingTitleBar) e6a0Var.f56600d).setExpanded(true);
                    }
                    contentPickerFragment.m3102m1().m15621f(boj.f29187a);
                    return;
                }
                return;
            case 14:
                epi epiVar = (epi) this.f233010c;
                x5p x5pVar = (x5p) this.f233009b;
                if (x5pVar.f258489c.get()) {
                    x5pVar.f258490d.onNext(epiVar);
                    return;
                } else {
                    x5pVar.f258488b.add(epiVar);
                    return;
                }
            case 15:
                gaz gazVarM44190b = gaz.m44190b();
                int i4 = ilq.f103453e;
                i1e1 i1e1Var = (i1e1) this.f233009b;
                gazVarM44190b.getClass();
                ((ilq) this.f233010c).f103454a.mo25889e(i1e1Var);
                return;
            case 16:
                khy0 khy0Var = (khy0) this.f233009b;
                fw7 fw7Var = (fw7) ((fin) this.f233010c).f69922d;
                kv91 kv91Var = (kv91) fw7Var.f74006b;
                hog0 hog0Var = (hog0) fw7Var.f74007c;
                hog0Var.getClass();
                yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("change_image_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("choose_image_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                mjx0.m62020X(new nyw(kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), hog0Var.f93537b, System.currentTimeMillis()), null).f46380a.f279709a), (sir0) khy0Var.f122742b);
                return;
            case 17:
                boolean zIsPopupShowing = ((AutoCompleteTextView) this.f233009b).isPopupShowing();
                his hisVar = (his) this.f233010c;
                ((kis) hisVar.f91867c).m56528g(zIsPopupShowing);
                ((kis) hisVar.f91867c).f123083j = zIsPopupShowing;
                return;
            case 18:
                o5t o5tVar = (o5t) this.f233010c;
                p5t p5tVar = (p5t) this.f233009b;
                if (p5tVar.f174225c.get()) {
                    p5tVar.f174226d.onNext(o5tVar);
                    return;
                } else {
                    p5tVar.f174224b.add(o5tVar);
                    return;
                }
            case 19:
                Object obj4 = this.f233010c;
                q4x q4xVar = (q4x) this.f233009b;
                if (q4xVar.f185362c.get()) {
                    q4xVar.f185363d.onNext(obj4);
                    return;
                } else {
                    q4xVar.f185361b.add(obj4);
                    return;
                }
            case 20:
                String str10 = (String) this.f233009b;
                j5x j5xVar = (j5x) this.f233010c;
                HashMap map = j5xVar.f109137d;
                if (map.containsKey(str10)) {
                    map.remove(str10);
                    j5xVar.f109135b.invoke(new v5d1(str10));
                    return;
                }
                return;
            case 21:
                hnz hnzVar = (hnz) this.f233009b;
                RecyclerView recyclerView3 = (RecyclerView) this.f233010c;
                hnzVar.getClass();
                if (recyclerView3.getChildCount() != 0) {
                    hnzVar.mo35394f(recyclerView3, 0, 0);
                    return;
                }
                return;
            case 22:
                try {
                    eq10VarM59813v = lrg1.m59813v();
                    break;
                } catch (Throwable th3) {
                    Logger.m3967c(th3, "Failed to read GPU info", new Object[0]);
                    Logger.m3965a("GPU probe failed: %s", th3.getMessage());
                    eq10VarM59813v = k0y0.f118168a;
                }
                ((AtomicReference) this.f233009b).set(eq10VarM59813v);
                ((a8x) this.f233010c).invoke(eq10VarM59813v);
                return;
            case 23:
                vxx vxxVar = (vxx) this.f233009b;
                p540 p540Var = (p540) this.f233010c;
                Double d = p540Var.f174071h;
                ZoomImageView zoomImageView = (ZoomImageView) vxxVar.f245852e;
                int width = d != null ? (int) (((double) zoomImageView.getWidth()) / d.doubleValue()) : -2;
                ViewGroup.LayoutParams layoutParams = zoomImageView.getLayoutParams();
                layoutParams.height = width;
                zoomImageView.setLayoutParams(layoutParams);
                zoomImageView.requestLayout();
                zoomImageView.invalidate();
                String str11 = p540Var.f174067d;
                ra40 ra40Var = (ra40) vxxVar.f245851d;
                Context context = (Context) vxxVar.f245849b;
                ZoomImageView zoomImageView2 = (ZoomImageView) vxxVar.f245852e;
                int width2 = zoomImageView2.getWidth();
                int height = zoomImageView2.getHeight();
                ra40Var.getClass();
                String str12 = "2131231989:" + width2 + "x" + height;
                HashMap map2 = ra40Var.f197188a;
                Drawable drawable = (Drawable) map2.get(str12);
                if (drawable == null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawColor(context.getColor(R.color.placeholder_bg_color));
                    StateListDrawable stateListDrawable = (StateListDrawable) context.getDrawable(R.drawable.encore_icon_image);
                    stateListDrawable.mutate().setTintList(lzj.m60387w(context, R.color.placeholder_tint_color));
                    int i5 = width2 / 3;
                    int i6 = i5 / 2;
                    int i7 = (width2 / 2) - i6;
                    int i8 = (height / 2) - i6;
                    stateListDrawable.setBounds(i7, i8, i7 + i5, i5 + i8);
                    stateListDrawable.draw(canvas);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
                    map2.put(str12, bitmapDrawable);
                    drawable = bitmapDrawable;
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.image_view_corner_radius);
                lxe lxeVarMo24613j = ((e940) vxxVar.f245850c).mo24613j(str11);
                lxeVarMo24613j.m60187m(drawable);
                lxeVarMo24613j.m60182h();
                lxeVarMo24613j.m60192r(new djs0(Integer.valueOf(dimensionPixelSize), 19));
                lxeVarMo24613j.m60185k(zoomImageView2, null);
                return;
            case 24:
                RecyclerView recyclerView4 = (RecyclerView) this.f233009b;
                wj50.m88279p(recyclerView4);
                recyclerView4.setPadding(recyclerView4.getPaddingLeft(), recyclerView4.getPaddingTop(), recyclerView4.getPaddingRight(), ((View) ((r0e1) this.f233010c).f194479c).getHeight());
                return;
            case 25:
                vqc1 vqc1Var = (vqc1) this.f233009b;
                RecyclerView recyclerView5 = (RecyclerView) this.f233010c;
                vqc1Var.getClass();
                if (recyclerView5.getChildCount() != 0) {
                    vqc1Var.mo35394f(recyclerView5, 0, 0);
                    return;
                }
                return;
            case 26:
                synchronized (((nk90) this.f233010c).f154842c) {
                    try {
                        Object objApply = ((nk90) this.f233010c).f154843d.apply(this.f233009b);
                        nk90 nk90Var = (nk90) this.f233010c;
                        Object obj5 = nk90Var.f154840a;
                        if (obj5 == null && objApply != null) {
                            nk90Var.f154840a = objApply;
                            nk90Var.f154844e.m33101j(objApply);
                        } else if (obj5 != null && !obj5.equals(objApply)) {
                            nk90 nk90Var2 = (nk90) this.f233010c;
                            nk90Var2.f154840a = objApply;
                            nk90Var2.f154844e.m33101j(objApply);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 27:
                ugz ugzVar = (ugz) this.f233010c;
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f233009b;
                ArrayList arrayList3 = (ArrayList) ugzVar.f230290b;
                if (!arrayList3.isEmpty()) {
                    InterfaceC0002a interfaceC0002aM34c = mediaSessionCompat$Token.m34c();
                    if (interfaceC0002aM34c != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            ((Bundle) it2.next()).putBinder(MediaBrowserProtocol.EXTRA_SESSION_BINDER, interfaceC0002aM34c.asBinder());
                        }
                    }
                    arrayList3.clear();
                }
                ((v8d0) ugzVar.f230291c).setSessionToken((MediaSession.Token) mediaSessionCompat$Token.f22b);
                return;
            case 28:
                t8d0 t8d0Var = (t8d0) ((c9d0) ((mj70) this.f233010c).f144173b).f35469e.remove(((Messenger) ((pj70) this.f233009b).f178196b).getBinder());
                if (t8d0Var != null) {
                    ((Messenger) t8d0Var.f218064d.f178196b).getBinder().unlinkToDeath(t8d0Var, 0);
                    return;
                }
                return;
            default:
                jod0 jod0Var = (jod0) ((ood0) this.f233009b).f167565b;
                MediaSession mediaSession = jod0Var.f114393a;
                jod0Var.f114398f.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                        break;
                    } catch (Exception unused4) {
                    }
                }
                mediaSession.setCallback(null);
                jod0Var.f114394b.f53a.set(null);
                mediaSession.release();
                ((Handler) this.f233010c).getLooper().quitSafely();
                return;
        }
    }

    public String toString() {
        switch (this.f233008a) {
            case 0:
                f7d1 f7d1Var = new f7d1(uqf1.class.getSimpleName());
                f7d1 f7d1Var2 = (f7d1) this.f233010c;
                yya1 yya1Var = new yya1(20);
                ((yya1) f7d1Var.f66660d).f277454c = yya1Var;
                f7d1Var.f66660d = yya1Var;
                yya1Var.f277453b = f7d1Var2;
                return f7d1Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ uqf1(Object obj, Object obj2, boolean z, int i) {
        this.f233008a = i;
        this.f233010c = obj;
        this.f233009b = obj2;
    }
}
