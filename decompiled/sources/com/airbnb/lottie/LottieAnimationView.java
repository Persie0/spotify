package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p204p.bab0;
import p204p.c1u0;
import p204p.cab0;
import p204p.ckw0;
import p204p.dzz;
import p204p.eab0;
import p204p.edb;
import p204p.eff0;
import p204p.g440;
import p204p.hab0;
import p204p.i571;
import p204p.ig10;
import p204p.ikc0;
import p204p.k9b0;
import p204p.lu60;
import p204p.lzj;
import p204p.n8b0;
import p204p.nsh;
import p204p.o8b0;
import p204p.ood0;
import p204p.p8b0;
import p204p.pn6;
import p204p.q8b0;
import p204p.qlo;
import p204p.r9b0;
import p204p.u8b0;
import p204p.ugz;
import p204p.uz30;
import p204p.vb21;
import p204p.vio;
import p204p.w8b0;
import p204p.x0b1;
import p204p.x2l;
import p204p.x9b0;
import p204p.xh70;
import p204p.xln0;
import p204p.z8b0;

/* JADX INFO: loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: R0 */
    public static final n8b0 f1466R0 = new n8b0();

    /* JADX INFO: renamed from: L0 */
    public boolean f1467L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f1468M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f1469N0;

    /* JADX INFO: renamed from: O0 */
    public final HashSet f1470O0;

    /* JADX INFO: renamed from: P0 */
    public final HashSet f1471P0;

    /* JADX INFO: renamed from: Q0 */
    public eab0 f1472Q0;

    /* JADX INFO: renamed from: d */
    public final q8b0 f1473d;

    /* JADX INFO: renamed from: e */
    public final q8b0 f1474e;

    /* JADX INFO: renamed from: f */
    public x9b0 f1475f;

    /* JADX INFO: renamed from: g */
    public int f1476g;

    /* JADX INFO: renamed from: h */
    public final r9b0 f1477h;

    /* JADX INFO: renamed from: i */
    public String f1478i;

    /* JADX INFO: renamed from: t */
    public int f1479t;

    public LottieAnimationView(Context context) {
        super(context);
        this.f1473d = new q8b0(this, 1);
        this.f1474e = new q8b0(this, 0);
        this.f1476g = 0;
        this.f1477h = new r9b0();
        this.f1467L0 = false;
        this.f1468M0 = false;
        this.f1469N0 = true;
        this.f1470O0 = new HashSet();
        this.f1471P0 = new HashSet();
        m1185g(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(eab0 eab0Var) {
        cab0 cab0Var = eab0Var.f57617d;
        r9b0 r9b0Var = this.f1477h;
        if (cab0Var != null && r9b0Var == getDrawable() && r9b0Var.f196988a == cab0Var.f35791a) {
            return;
        }
        this.f1470O0.add(p8b0.f174923a);
        this.f1477h.m75024d();
        m1184f();
        eab0Var.m38281b(this.f1473d);
        eab0Var.m38280a(this.f1474e);
        this.f1472Q0 = eab0Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m1183e() {
        this.f1468M0 = false;
        this.f1470O0.add(p8b0.f174928f);
        r9b0 r9b0Var = this.f1477h;
        r9b0Var.f196998f.clear();
        r9b0Var.f196990b.cancel();
        if (r9b0Var.isVisible()) {
            return;
        }
        r9b0Var.f197010n1 = 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m1184f() {
        eab0 eab0Var = this.f1472Q0;
        if (eab0Var != null) {
            q8b0 q8b0Var = this.f1473d;
            synchronized (eab0Var) {
                eab0Var.f57614a.remove(q8b0Var);
            }
            eab0 eab0Var2 = this.f1472Q0;
            q8b0 q8b0Var2 = this.f1474e;
            synchronized (eab0Var2) {
                eab0Var2.f57615b.remove(q8b0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1185g(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c1u0.f33192a, i, 0);
        this.f1469N0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f1468M0 = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(12, false);
        r9b0 r9b0Var = this.f1477h;
        if (z) {
            r9b0Var.m75042w(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f = typedArrayObtainStyledAttributes.getFloat(13, 0.0f);
        if (zHasValue4) {
            this.f1470O0.add(p8b0.f174924b);
        }
        r9b0Var.m75041v(f);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (r9b0Var.f196984Y != z2) {
            r9b0Var.f196984Y = z2;
            if (r9b0Var.f196988a != null) {
                r9b0Var.m75023c();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            r9b0Var.m75021a(new lu60("**"), bab0.f25140F, new xh70(new vb21(lzj.m60387w(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(15, 0);
            if (i2 >= ckw0.values().length) {
                i2 = 0;
            }
            setRenderMode(ckw0.values()[i2]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (i3 >= ckw0.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(pn6.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context = getContext();
        qlo qloVar = x0b1.f256851a;
        r9b0Var.f196992c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public pn6 getAsyncUpdates() {
        pn6 pn6Var = this.f1477h.f197003h1;
        return pn6Var != null ? pn6Var : pn6.f179316a;
    }

    public boolean getAsyncUpdatesEnabled() {
        pn6 pn6Var = this.f1477h.f197003h1;
        if (pn6Var == null) {
            pn6Var = pn6.f179316a;
        }
        return pn6Var == pn6.f179317b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f1477h.f196976R0;
    }

    public boolean getClipToCompositionBounds() {
        return this.f1477h.f196970L0;
    }

    public u8b0 getComposition() {
        Drawable drawable = getDrawable();
        r9b0 r9b0Var = this.f1477h;
        if (drawable == r9b0Var) {
            return r9b0Var.f196988a;
        }
        return null;
    }

    public long getDuration() {
        u8b0 composition = getComposition();
        if (composition != null) {
            return (long) composition.m82567b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f1477h.f196990b.f89182h;
    }

    public String getImageAssetsFolder() {
        return this.f1477h.f197002h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f1477h.f196986Z;
    }

    public float getMaxFrame() {
        return this.f1477h.f196990b.m46924k();
    }

    public float getMinFrame() {
        return this.f1477h.f196990b.m46925l();
    }

    public xln0 getPerformanceTracker() {
        u8b0 u8b0Var = this.f1477h.f196988a;
        if (u8b0Var != null) {
            return u8b0Var.f227882a;
        }
        return null;
    }

    public float getProgress() {
        return this.f1477h.f196990b.m46923j();
    }

    public ckw0 getRenderMode() {
        return this.f1477h.f196978T0 ? ckw0.f39104c : ckw0.f39103b;
    }

    public int getRepeatCount() {
        return this.f1477h.f196990b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f1477h.f196990b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f1477h.f196990b.f89178d;
    }

    /* JADX INFO: renamed from: h */
    public final void m1186h() {
        this.f1470O0.add(p8b0.f174928f);
        this.f1477h.m75030k();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof r9b0) {
            boolean z = ((r9b0) drawable).f196978T0;
            ckw0 ckw0Var = ckw0.f39104c;
            if ((z ? ckw0Var : ckw0.f39103b) == ckw0Var) {
                this.f1477h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        r9b0 r9b0Var = this.f1477h;
        if (drawable2 == r9b0Var) {
            super.invalidateDrawable(r9b0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f1468M0) {
            return;
        }
        this.f1477h.m75030k();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof o8b0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o8b0 o8b0Var = (o8b0) parcelable;
        super.onRestoreInstanceState(o8b0Var.getSuperState());
        this.f1478i = o8b0Var.f162761a;
        HashSet hashSet = this.f1470O0;
        p8b0 p8b0Var = p8b0.f174923a;
        if (!hashSet.contains(p8b0Var) && !TextUtils.isEmpty(this.f1478i)) {
            setAnimation(this.f1478i);
        }
        this.f1479t = o8b0Var.f162762b;
        if (!hashSet.contains(p8b0Var) && (i = this.f1479t) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(p8b0.f174924b)) {
            this.f1477h.m75041v(o8b0Var.f162763c);
        }
        if (!hashSet.contains(p8b0.f174928f) && o8b0Var.f162764d) {
            m1186h();
        }
        if (!hashSet.contains(p8b0.f174927e)) {
            setImageAssetsFolder(o8b0Var.f162765e);
        }
        if (!hashSet.contains(p8b0.f174925c)) {
            setRepeatMode(o8b0Var.f162766f);
        }
        if (hashSet.contains(p8b0.f174926d)) {
            return;
        }
        setRepeatCount(o8b0Var.f162767g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        o8b0 o8b0Var = new o8b0(super.onSaveInstanceState());
        o8b0Var.f162761a = this.f1478i;
        o8b0Var.f162762b = this.f1479t;
        r9b0 r9b0Var = this.f1477h;
        hab0 hab0Var = r9b0Var.f196990b;
        hab0 hab0Var2 = r9b0Var.f196990b;
        o8b0Var.f162763c = hab0Var.m46923j();
        if (r9b0Var.isVisible()) {
            z = hab0Var2.f89177Z;
        } else {
            int i = r9b0Var.f197010n1;
            z = i == 2 || i == 3;
        }
        o8b0Var.f162764d = z;
        o8b0Var.f162765e = r9b0Var.f197002h;
        o8b0Var.f162766f = hab0Var2.getRepeatMode();
        o8b0Var.f162767g = hab0Var2.getRepeatCount();
        return o8b0Var;
    }

    public void setAnimation(int i) {
        eab0 eab0VarM95572e;
        this.f1479t = i;
        this.f1478i = null;
        if (isInEditMode()) {
            eab0VarM95572e = new eab0(new uz30(this, i, 1), true);
        } else if (this.f1469N0) {
            Context context = getContext();
            eab0VarM95572e = z8b0.m95572e(i, context, z8b0.m95578k(context, i));
        } else {
            eab0VarM95572e = z8b0.m95572e(i, getContext(), null);
        }
        setCompositionTask(eab0VarM95572e);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(z8b0.m95568a(null, new x2l(byteArrayInputStream, 3), new ig10(byteArrayInputStream, 12)));
    }

    public void setAnimationFromUrl(String str) {
        eab0 eab0VarM95568a;
        int i = 0;
        String str2 = null;
        if (this.f1469N0) {
            Context context = getContext();
            HashMap map = z8b0.f280430a;
            String strM38564m = edb.m38564m("url_", str);
            eab0VarM95568a = z8b0.m95568a(strM38564m, new w8b0(context, str, strM38564m, i), null);
        } else {
            eab0VarM95568a = z8b0.m95568a(null, new w8b0(getContext(), str, str2, i), null);
        }
        setCompositionTask(eab0VarM95568a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f1477h.f196975Q0 = z;
    }

    public void setAsyncUpdates(pn6 pn6Var) {
        this.f1477h.f197003h1 = pn6Var;
    }

    public void setCacheComposition(boolean z) {
        this.f1469N0 = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        r9b0 r9b0Var = this.f1477h;
        if (z != r9b0Var.f196976R0) {
            r9b0Var.f196976R0 = z;
            r9b0Var.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        r9b0 r9b0Var = this.f1477h;
        if (z != r9b0Var.f196970L0) {
            r9b0Var.f196970L0 = z;
            nsh nshVar = r9b0Var.f196971M0;
            if (nshVar != null) {
                nshVar.f157806I = z;
            }
            r9b0Var.invalidateSelf();
        }
    }

    public void setComposition(u8b0 u8b0Var) {
        r9b0 r9b0Var = this.f1477h;
        r9b0Var.setCallback(this);
        this.f1467L0 = true;
        boolean zM75033n = r9b0Var.m75033n(u8b0Var);
        if (this.f1468M0) {
            r9b0Var.m75030k();
        }
        this.f1467L0 = false;
        if (getDrawable() != r9b0Var || zM75033n) {
            if (!zM75033n) {
                hab0 hab0Var = r9b0Var.f196990b;
                boolean z = hab0Var != null ? hab0Var.f89177Z : false;
                setImageDrawable(null);
                setImageDrawable(r9b0Var);
                if (z) {
                    r9b0Var.m75032m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f1471P0.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        r9b0 r9b0Var = this.f1477h;
        r9b0Var.f196982X = str;
        ugz ugzVarM75028i = r9b0Var.m75028i();
        if (ugzVarM75028i != null) {
            ugzVarM75028i.m83085a0(str);
        }
    }

    public void setFailureListener(x9b0 x9b0Var) {
        this.f1475f = x9b0Var;
    }

    public void setFallbackResource(int i) {
        this.f1476g = i;
    }

    public void setFontAssetDelegate(dzz dzzVar) {
        ugz ugzVar = this.f1477h.f197004i;
    }

    public void setFontMap(Map<String, Typeface> map) {
        r9b0 r9b0Var = this.f1477h;
        if (map == r9b0Var.f197011t) {
            return;
        }
        r9b0Var.f197011t = map;
        r9b0Var.invalidateSelf();
    }

    public void setFrame(int i) {
        this.f1477h.m75034o(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f1477h.f196994d = z;
    }

    public void setImageAssetDelegate(g440 g440Var) {
        ood0 ood0Var = this.f1477h.f197000g;
    }

    public void setImageAssetsFolder(String str) {
        this.f1477h.f197002h = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f1479t = 0;
        this.f1478i = null;
        m1184f();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f1479t = 0;
        this.f1478i = null;
        m1184f();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.f1479t = 0;
        this.f1478i = null;
        m1184f();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f1477h.f196986Z = z;
    }

    public void setMaxFrame(int i) {
        this.f1477h.m75035p(i);
    }

    public void setMaxProgress(float f) {
        r9b0 r9b0Var = this.f1477h;
        u8b0 u8b0Var = r9b0Var.f196988a;
        if (u8b0Var == null) {
            r9b0Var.f196998f.add(new k9b0(r9b0Var, f, 0));
            return;
        }
        hab0 hab0Var = r9b0Var.f196990b;
        hab0Var.m46929s(hab0Var.f89184t, eff0.m38735e(u8b0Var.f227893l, u8b0Var.f227894m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.f1477h.m75038s(str);
    }

    public void setMinFrame(int i) {
        this.f1477h.m75039t(i);
    }

    public void setMinProgress(float f) {
        r9b0 r9b0Var = this.f1477h;
        u8b0 u8b0Var = r9b0Var.f196988a;
        if (u8b0Var == null) {
            r9b0Var.f196998f.add(new k9b0(r9b0Var, f, 1));
        } else {
            r9b0Var.m75039t((int) eff0.m38735e(u8b0Var.f227893l, u8b0Var.f227894m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        r9b0 r9b0Var = this.f1477h;
        if (r9b0Var.f196974P0 == z) {
            return;
        }
        r9b0Var.f196974P0 = z;
        nsh nshVar = r9b0Var.f196971M0;
        if (nshVar != null) {
            nshVar.mo65559q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        r9b0 r9b0Var = this.f1477h;
        r9b0Var.f196973O0 = z;
        u8b0 u8b0Var = r9b0Var.f196988a;
        if (u8b0Var != null) {
            u8b0Var.f227882a.f263200a = z;
        }
    }

    public void setProgress(float f) {
        this.f1470O0.add(p8b0.f174924b);
        this.f1477h.m75041v(f);
    }

    public void setRenderMode(ckw0 ckw0Var) {
        r9b0 r9b0Var = this.f1477h;
        r9b0Var.f196977S0 = ckw0Var;
        r9b0Var.m75025e();
    }

    public void setRepeatCount(int i) {
        this.f1470O0.add(p8b0.f174926d);
        this.f1477h.m75042w(i);
    }

    public void setRepeatMode(int i) {
        this.f1470O0.add(p8b0.f174925c);
        this.f1477h.m75043x(i);
    }

    public void setSafeMode(boolean z) {
        this.f1477h.f196996e = z;
    }

    public void setSpeed(float f) {
        this.f1477h.f196990b.f89178d = f;
    }

    public void setTextDelegate(i571 i571Var) {
        this.f1477h.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f1477h.f196990b.f89174L0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        r9b0 r9b0Var;
        hab0 hab0Var;
        r9b0 r9b0Var2;
        boolean z = this.f1467L0;
        if (!z && drawable == (r9b0Var2 = this.f1477h)) {
            hab0 hab0Var2 = r9b0Var2.f196990b;
            if (hab0Var2 == null ? false : hab0Var2.f89177Z) {
                this.f1468M0 = false;
                r9b0Var2.m75029j();
            } else if (!z) {
                r9b0Var = (r9b0) drawable;
                hab0Var = r9b0Var.f196990b;
                if (hab0Var != null ? hab0Var.f89177Z : false) {
                    r9b0Var.m75029j();
                }
            }
        } else if (!z && (drawable instanceof r9b0)) {
            r9b0Var = (r9b0) drawable;
            hab0Var = r9b0Var.f196990b;
            if (hab0Var != null ? hab0Var.f89177Z : false) {
                r9b0Var.m75029j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f1477h.m75036q(str);
    }

    public void setMinFrame(String str) {
        this.f1477h.m75040u(str);
    }

    public void setAnimation(String str) {
        eab0 eab0VarM95568a;
        this.f1478i = str;
        this.f1479t = 0;
        int i = 1;
        if (isInEditMode()) {
            eab0VarM95568a = new eab0(new vio(5, this, str), true);
        } else {
            String str2 = null;
            if (this.f1469N0) {
                Context context = getContext();
                HashMap map = z8b0.f280430a;
                String strM38564m = edb.m38564m("asset_", str);
                eab0VarM95568a = z8b0.m95568a(strM38564m, new w8b0(context.getApplicationContext(), str, strM38564m, i), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = z8b0.f280430a;
                eab0VarM95568a = z8b0.m95568a(null, new w8b0(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(eab0VarM95568a);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1473d = new q8b0(this, 1);
        this.f1474e = new q8b0(this, 0);
        this.f1476g = 0;
        this.f1477h = new r9b0();
        this.f1467L0 = false;
        this.f1468M0 = false;
        this.f1469N0 = true;
        this.f1470O0 = new HashSet();
        this.f1471P0 = new HashSet();
        m1185g(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1473d = new q8b0(this, 1);
        this.f1474e = new q8b0(this, 0);
        this.f1476g = 0;
        this.f1477h = new r9b0();
        this.f1467L0 = false;
        this.f1468M0 = false;
        this.f1469N0 = true;
        this.f1470O0 = new HashSet();
        this.f1471P0 = new HashSet();
        m1185g(attributeSet, i);
    }
}
