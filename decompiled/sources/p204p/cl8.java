package p204p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.model.SectionHeader;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class cl8 implements InterfaceC1667ah, Function, hr61, Predicate, kdl0, k6z0, ls30, l591, hg50, mu61, wxb1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39205a;

    /* JADX INFO: renamed from: b */
    public int f39206b;

    /* JADX INFO: renamed from: c */
    public Object f39207c;

    public /* synthetic */ cl8(int i, boolean z) {
        this.f39205a = i;
    }

    /* JADX INFO: renamed from: A */
    public boolean m33230A(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    /* JADX INFO: renamed from: B */
    public boolean m33231B(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* JADX INFO: renamed from: C */
    public void m33232C() {
        otc.f169033c.m70923T0((char[]) this.f39207c);
    }

    /* JADX INFO: renamed from: D */
    public void m33233D(yj5 yj5Var) {
        int i = this.f39206b;
        Object[] objArr = (Object[]) this.f39207c;
        if (i < objArr.length) {
            objArr[i] = yj5Var;
            this.f39206b = i + 1;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m33234E(int i, Object[] objArr) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f39206b;
            Object[] objArr2 = (Object[]) this.f39207c;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f39206b = i3 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m33235F(int i) {
        this.f39206b = i;
    }

    /* JADX INFO: renamed from: G */
    public void m33236G(nnz nnzVar) {
        this.f39207c = nnzVar;
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: a */
    public void mo33237a(VideoFrameProcessingException videoFrameProcessingException) {
        pci0 pci0Var = (pci0) this.f39207c;
        pci0Var.f176120f.execute(new mpd0(7, pci0Var, videoFrameProcessingException));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        pvf pvfVar;
        switch (this.f39205a) {
            case 3:
                esf esfVar = (esf) g6f.m43745s0((List) obj);
                ArrayList arrayList = esfVar != null ? esfVar.f62352b : null;
                return Observable.just((arrayList == null || (pvfVar = (pvf) g6f.m43747t0(arrayList != null ? h6f.m46712I(arrayList, new le0((gtf) this.f39207c, this.f39206b)) : -1, arrayList)) == null) ? atf.f19666a : new btf(pvfVar));
            case 4:
                qzn qznVar = (qzn) this.f39207c;
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f39206b;
                qznVar.getClass();
                if (iIntValue == -1) {
                    iIntValue = i;
                }
                return Integer.valueOf(iIntValue);
            case 5:
                return new CompletableFromAction(new al1((psp) this.f39207c, (su1) obj, this.f39206b, 2));
            case 6:
            case 7:
            case 8:
            default:
                ((wy3) ((q0p0) this.f39207c).f184051f).getClass();
                return Long.valueOf(((Number) ((PlayerState) obj).position(System.currentTimeMillis()).mo49280e(0L)).longValue() + ((long) this.f39206b));
            case 9:
                eag0 eag0Var = ((myx) this.f39207c).f148555h;
                int i2 = this.f39206b;
                eag0Var.getClass();
                dv91 dv91Var = new dv91("hit", 1);
                String string = ((String) obj).toString();
                if (string == null) {
                    string = "";
                }
                pqm0 pqm0Var = new pqm0("currently_played_item", string);
                String strValueOf = String.valueOf(i2);
                return new av91("", "", dv91Var, new bv91("set_playback_speed", 1, kkc0.m56695h0(pqm0Var, new pqm0(ContextTrack.Metadata.KEY_PLAYBACK_SPEED, strValueOf != null ? strValueOf : ""))), eag0Var.f57667c, eag0Var.f57666b, System.currentTimeMillis());
        }
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: c */
    public gh00 mo33238c() {
        return new r7q(this, 4);
    }

    @Override // p204p.ls30
    public GridLayoutManager create() {
        return new TraitsLayoutManager((skp) this.f39207c, this.f39206b);
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        int i;
        tkf1 wzx0Var;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        wj50.m88279p(config);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Matrix matrix = new Matrix();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Activity activity = (Activity) this.f39207c;
        int i2 = this.f39206b;
        if (i2 == 1) {
            i = R.drawable.glue_radio_square_ripple_overlay;
        } else {
            if (i2 != 2) {
                throw null;
            }
            i = R.drawable.glue_radio_circle_ripple_overlay;
        }
        Drawable drawable = activity.getDrawable(i);
        if (drawable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        try {
            wzx0Var = new yzx0(new geu(bitmap).m44523a());
        } catch (Exception unused) {
            wzx0Var = new wzx0();
        }
        int iMo81019h = wzx0Var.mo81019h();
        if (iMo81019h == -65281) {
            iMo81019h = wzx0Var.mo81020j();
        }
        Rect clipBounds = canvas.getClipBounds();
        float fCenterX = clipBounds.centerX();
        float fCenterY = clipBounds.centerY();
        int iM72083N = q3d0.m72083N(Math.min(canvas.getWidth(), canvas.getHeight()) / 2.0f);
        matrix.preTranslate(-fCenterX, -fCenterY);
        bitmapShader.setLocalMatrix(matrix);
        canvas.drawColor(iMo81019h);
        canvas.save();
        canvas.translate(fCenterX, fCenterY);
        int i3 = -iM72083N;
        drawable.setBounds(i3, i3, iM72083N, iM72083N);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        canvas.translate(fCenterX, fCenterY);
        canvas.scale(0.5f, 0.5f);
        float f = iM72083N;
        if (i2 != 1) {
            canvas.drawCircle(0.0f, 0.0f, f, paint);
        } else {
            float f2 = -f;
            canvas.drawRect(f2, f2, f, f, paint);
        }
        canvas.restore();
        return bitmapCreateBitmap;
    }

    @Override // p204p.k6z0
    /* JADX INFO: renamed from: g */
    public List mo33240g(kxb kxbVar, cjh cjhVar) {
        SectionHeader sectionHeader = cjhVar.f38588e;
        ycg0 ycg0VarM83446n = umg1.m83446n(kxbVar, cjhVar);
        String title = kxbVar.getTitle();
        String str = (title == null || title.length() == 0) ? null : title;
        List items = kxbVar.getItems();
        ArrayList arrayList = new ArrayList(i6f.m49804T(items, 10));
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            fxb fxbVar = (fxb) obj;
            arrayList.add(ehg1.m38972l(fxbVar.f74314a, fxbVar.f74315b, fxbVar.f74316c, new ehi(cjhVar, fxbVar, i, ycg0VarM83446n, 1)));
            i = i2;
        }
        px0 px0Var = (px0) this.f39207c;
        if (px0Var == null) {
            return Collections.singletonList(ofg1.m66838g(str, arrayList, this.f39206b, cjhVar.f38587d, sectionHeader));
        }
        int iMin = Math.min(50, ((s6j) ((c9a) px0Var.f182174b).f35434b).m77326a(1));
        ArrayList arrayListM43740p1 = g6f.m43740p1(arrayList, iMin, iMin);
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayListM43740p1, 10));
        int i3 = 0;
        for (Object obj2 : arrayListM43740p1) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h6f.m46722S();
                throw null;
            }
            arrayList2.add(ofg1.m66838g(i3 == 0 ? str : null, (List) obj2, 4, null, i3 == 0 ? sectionHeader : null));
            i3 = i4;
        }
        return arrayList2;
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: h */
    public av91 mo33241h(oq61 oq61Var, pv91 pv91Var) {
        if ((pv91Var instanceof gmg0 ? (gmg0) pv91Var : null) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(oq61Var.f168124a);
        yt91 yt91VarM96903c = ((gmg0) pv91Var).f81395a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("tab_item", "", numValueOf, null, null));
        yt91VarM96903c.f276056j = false;
        return new av91("", "", new dv91("swipe_left", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.hg50
    /* JADX INFO: renamed from: i */
    public void mo33242i(char c) {
        m33252v(this.f39206b, 1);
        char[] cArr = (char[]) this.f39207c;
        int i = this.f39206b;
        this.f39206b = i + 1;
        cArr[i] = c;
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: j */
    public void mo33243j() {
        pci0 pci0Var = (pci0) this.f39207c;
        int i = this.f39206b;
        dgq dgqVar = pci0Var.f176130p;
        dgqVar.getClass();
        synchronized (dgqVar) {
            try {
                c95.m31855u(h0b1.m46321l(dgqVar.f48872f, i));
                boolean z = false;
                c95.m31855u(dgqVar.f48881o != -1);
                ((cgq) dgqVar.f48872f.get(i)).f37777b = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= dgqVar.f48872f.size()) {
                        z = true;
                        break;
                    } else if (!((cgq) dgqVar.f48872f.valueAt(i2)).f37777b) {
                        break;
                    } else {
                        i2++;
                    }
                }
                dgqVar.f48873g = z;
                if (((cgq) dgqVar.f48872f.get(dgqVar.f48881o)).f37776a.isEmpty()) {
                    if (i == dgqVar.f48881o) {
                        dgqVar.m35931c();
                    }
                    if (z) {
                        dgqVar.f48867a.m86924h();
                        return;
                    }
                }
                if (i != dgqVar.f48881o && ((cgq) dgqVar.f48872f.get(i)).f37776a.size() == 1) {
                    dgqVar.f48871e.m81905f(new yfq(dgqVar, 2), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public String mo33244k() {
        String str;
        int i = this.f39206b;
        StringBuilder sb = new StringBuilder("GlueRadioCardRippleTransformation (");
        if (i != 1) {
            str = i != 2 ? "null" : "CIRCLE";
        } else {
            str = "SQUARE";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: l */
    public av91 mo33245l(pq61 pq61Var, pv91 pv91Var) {
        if ((pv91Var instanceof gmg0 ? (gmg0) pv91Var : null) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(pq61Var.f180202a);
        yt91 yt91VarM96903c = ((gmg0) pv91Var).f81395a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("tab_item", "", numValueOf, null, null));
        yt91VarM96903c.f276056j = false;
        return new av91("", "", new dv91("swipe_right", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: m */
    public av91 mo33246m(qq61 qq61Var, pv91 pv91Var) {
        if ((pv91Var instanceof gmg0 ? (gmg0) pv91Var : null) == null) {
            return null;
        }
        String str = qq61Var.f191498a;
        Integer numValueOf = Integer.valueOf(qq61Var.f191499b);
        yt91 yt91VarM96903c = ((gmg0) pv91Var).f81395a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("tab_item", str, numValueOf, null, null));
        yt91VarM96903c.f276056j = false;
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: n */
    public boolean mo33247n() {
        return false;
    }

    @Override // p204p.kdl0
    public void onSuccess(Object obj) throws Exception {
        PendingIntent pendingIntent = ((n3y0) obj).f150155a;
        if (pendingIntent != null) {
            ak10 ak10Var = (ak10) this.f39207c;
            int i = this.f39206b;
            IntentSender intentSender = pendingIntent.getIntentSender();
            if (ak10Var.f98681T0 == null) {
                throw new IllegalStateException("Fragment " + ak10Var + " not attached to Activity");
            }
            if (c700.m31595O(2)) {
                ak10Var.toString();
                Objects.toString(intentSender);
            }
            c700 c700VarM49720s0 = ak10Var.m49720s0();
            if (c700VarM49720s0.f34653F != null) {
                x550 x550Var = new x550(intentSender, null, 0, 0);
                c700VarM49720s0.f34655H.addLast(new v600(ak10Var.f98699e, i));
                if (c700.m31595O(2)) {
                    ak10Var.toString();
                }
                c700VarM49720s0.f34653F.mo24737a(x550Var);
                return;
            }
            c600 c600Var = c700VarM49720s0.f34689x;
            if (i != -1) {
                c600Var.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = c600Var.f34327Z;
            if (activity == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            activity.startIntentSenderForResult(intentSender, i, null, 0, 0, 0, null);
        }
    }

    @Override // p204p.mu61
    /* JADX INFO: renamed from: p */
    public void mo25096p(Exception exc) {
        iz5 iz5Var = (iz5) this.f39207c;
        qyy0 qyy0Var = (qyy0) iz5Var.f107137f;
        ((ImageView) qyy0Var.f194065h).setVisibility(8);
        ((ImageView) qyy0Var.f194063f).setVisibility(0);
        ((ImageView) qyy0Var.f194063f).setImageDrawable(((FrameLayout) iz5Var.f107138g).getContext().getDrawable(this.f39206b));
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ((BottomSheetBehavior) this.f39207c).m1578L(this.f39206b);
        return true;
    }

    @Override // p204p.hg50
    /* JADX INFO: renamed from: r */
    public void mo33248r(String str) {
        byte b;
        m33252v(this.f39206b, str.length() + 2);
        char[] cArr = (char[]) this.f39207c;
        int i = this.f39206b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = nl51.f155009b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    m33252v(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = nl51.f155009b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.f39207c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = nl51.f155008a[cCharAt];
                        wj50.m88279p(str2);
                        m33252v(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.f39207c, i4);
                        int length3 = str2.length() + i4;
                        this.f39206b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) this.f39207c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        this.f39206b = i4;
                    }
                }
                m33252v(i4, 1);
                ((char[]) this.f39207c)[i4] = '\"';
                this.f39206b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.f39206b = i3 + 1;
    }

    @Override // p204p.hg50
    /* JADX INFO: renamed from: s */
    public void mo33249s(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        m33252v(this.f39206b, length);
        str.getChars(0, str.length(), (char[]) this.f39207c, this.f39206b);
        this.f39206b += length;
    }

    /* JADX INFO: renamed from: t */
    public Object m33250t() {
        int i = this.f39206b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.f39207c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f39206b = i - 1;
        return obj;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        v7x v7xVar = (v7x) this.f39207c;
        if (!((xul0) obj).mo49279c()) {
            return false;
        }
        v7xVar.f238332c.getClass();
        return SystemClock.elapsedRealtime() - v7xVar.f238337h >= ((long) (this.f39206b * 1000));
    }

    public String toString() {
        switch (this.f39205a) {
            case 21:
                return new String((char[]) this.f39207c, 0, this.f39206b);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public yh10 m33251u(Context context) {
        return new yh10(context, this.f39206b, (al20) this.f39207c);
    }

    /* JADX INFO: renamed from: v */
    public void m33252v(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f39207c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f39207c = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: w */
    public int m33253w() {
        if (((MediaCodecInfo[]) this.f39207c) == null) {
            this.f39207c = new MediaCodecList(this.f39206b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f39207c).length;
    }

    @Override // p204p.hg50
    public void writeLong(long j) {
        mo33249s(String.valueOf(j));
    }

    /* JADX INFO: renamed from: x */
    public MediaCodecInfo m33254x(int i) {
        if (((MediaCodecInfo[]) this.f39207c) == null) {
            this.f39207c = new MediaCodecList(this.f39206b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f39207c)[i];
    }

    /* JADX INFO: renamed from: y */
    public int m33255y() {
        return this.f39206b;
    }

    /* JADX INFO: renamed from: z */
    public nnz m33256z() {
        return (nnz) this.f39207c;
    }

    public /* synthetic */ cl8(Object obj, int i, int i2) {
        this.f39205a = i2;
        this.f39207c = obj;
        this.f39206b = i;
    }

    public cl8(int i) {
        this.f39205a = i;
        switch (i) {
            case 10:
                this.f39207c = nnz.f156532a;
                break;
            case 21:
                this.f39207c = otc.f169033c.m70924V0(128);
                break;
            case 29:
                this.f39207c = new Object[256];
                break;
            default:
                this.f39206b = 0;
                this.f39207c = new StringBuilder();
                break;
        }
    }

    public cl8(Activity activity, skp skpVar, int i) {
        this.f39205a = 15;
        this.f39207c = skpVar;
        this.f39206b = i;
    }

    public cl8(Activity activity, boolean z) {
        this.f39205a = 17;
        this.f39207c = activity;
        this.f39206b = z ? 2 : 1;
    }

    public cl8(int i, hmg0 hmg0Var) {
        this.f39205a = 7;
        this.f39206b = i;
        this.f39207c = hmg0Var;
    }

    public cl8(int i, i500 i500Var) {
        this.f39205a = 14;
        if (i != 0) {
            this.f39206b = i;
            this.f39207c = i500Var;
            return;
        }
        throw null;
    }

    @Override // p204p.mu61
    public void onSuccess() {
        iz5 iz5Var = (iz5) this.f39207c;
        ((ImageView) ((qyy0) iz5Var.f107137f).f194065h).setVisibility(0);
        ((ImageView) ((qyy0) iz5Var.f107137f).f194063f).setVisibility(8);
    }

    public cl8(fk30 fk30Var, int i) {
        this.f39205a = 16;
        fk30Var.getClass();
        this.f39207c = fk30Var;
        this.f39206b = i;
    }

    public cl8(boolean z, boolean z2, boolean z3) {
        this.f39205a = 23;
        this.f39206b = (z || z2 || z3) ? 1 : 0;
    }
}
