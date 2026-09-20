package com.spotify.encoreconsumermobile.elements.artwork;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2087le;
import p204p.a6o0;
import p204p.aq7;
import p204p.b6o0;
import p204p.c6o0;
import p204p.dh01;
import p204p.dt71;
import p204p.gh00;
import p204p.gtq;
import p204p.ihf1;
import p204p.j96;
import p204p.jg31;
import p204p.lxe;
import p204p.lzj;
import p204p.mif1;
import p204p.n10;
import p204p.n3d0;
import p204p.oqs;
import p204p.p1u0;
import p204p.py30;
import p204p.q76;
import p204p.qe70;
import p204p.r96;
import p204p.ry30;
import p204p.svg1;
import p204p.t96;
import p204p.tc41;
import p204p.vc41;
import p204p.vtg1;
import p204p.w66;
import p204p.w6f;
import p204p.wb40;
import p204p.wj50;
import p204p.z5o0;
import p204p.z8y;
import p204p.zq2;

/* JADX INFO: loaded from: classes.dex */
@gtq
@Metadata(m24211d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00106\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010E\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u001bR\u0014\u0010I\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u001b¨\u0006J"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/artwork/ArtworkView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lp/w2a1;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lp/r96;", "viewContext", "setViewContext", "(Lp/r96;)V", "", "getRadius", "()F", "getContentRadius", "f", "I", "getPlaceholderInset", "()I", "setPlaceholderInset", "(I)V", "placeholderInset", "g", "F", "getPlaceholderInsetRatio", "setPlaceholderInsetRatio", "(F)V", "placeholderInsetRatio", "", "L0", "Z", "getConstrainIconToSmallestDimension", "()Z", "setConstrainIconToSmallestDimension", "(Z)V", "constrainIconToSmallestDimension", "Lp/w6f;", "M0", "Lp/w6f;", "getImageLoaderColorCallback", "()Lp/w6f;", "setImageLoaderColorCallback", "(Lp/w6f;)V", "getImageLoaderColorCallback$annotations", "()V", "imageLoaderColorCallback", "Lp/wb40;", "O0", "Lp/wb40;", "getRequestCreator", "()Lp/wb40;", "setRequestCreator", "(Lp/wb40;)V", "requestCreator", "Landroid/content/res/ColorStateList;", "value", "getPlaceholderBackgroundColor", "()Landroid/content/res/ColorStateList;", "setPlaceholderBackgroundColor", "(Landroid/content/res/ColorStateList;)V", "placeholderBackgroundColor", "getCoverArtSize", "coverArtSize", "getIconReferenceSize", "iconReferenceSize", "src_main_java_com_spotify_encoreconsumermobile_elements_artwork-artwork"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ArtworkView extends AppCompatImageView implements oqs {

    /* JADX INFO: renamed from: Q0 */
    public static final String f3599Q0 = String.valueOf(R.id.cover_art_tag);

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public boolean constrainIconToSmallestDimension;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public w6f imageLoaderColorCallback;

    /* JADX INFO: renamed from: N0 */
    public final n10 f3602N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public wb40 requestCreator;

    /* JADX INFO: renamed from: P0 */
    public qe70 f3604P0;

    /* JADX INFO: renamed from: d */
    public final ColorDrawable f3605d;

    /* JADX INFO: renamed from: e */
    public final n3d0 f3606e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int placeholderInset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float placeholderInsetRatio;

    /* JADX INFO: renamed from: h */
    public LayerDrawable f3609h;

    /* JADX INFO: renamed from: i */
    public vc41 f3610i;

    /* JADX INFO: renamed from: t */
    public r96 f3611t;

    public ArtworkView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getContentRadius() {
        return Math.max((getContext().getResources().getDisplayMetrics().densityDpi / 160) * 4.0f, getCoverArtSize() * 0.025f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCoverArtSize() {
        return getLayoutParams().width <= 0 ? getWidth() : getLayoutParams().width;
    }

    private final int getIconReferenceSize() {
        if (!this.constrainIconToSmallestDimension) {
            return getCoverArtSize();
        }
        int width = getLayoutParams().width <= 0 ? getWidth() : getLayoutParams().width;
        int height = getLayoutParams().height <= 0 ? getHeight() : getLayoutParams().height;
        return height > 0 ? Math.min(width, height) : width;
    }

    public static /* synthetic */ void getImageLoaderColorCallback$annotations() {
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.imageLoaderColorCallback = new t96(gh00Var);
    }

    /* JADX INFO: renamed from: g */
    public final int m9585g() {
        return (((double) this.placeholderInsetRatio) >= 1.0d || getIconReferenceSize() <= 0) ? this.placeholderInset : (((int) (getIconReferenceSize() * this.placeholderInsetRatio)) / 2) + this.placeholderInset;
    }

    public final boolean getConstrainIconToSmallestDimension() {
        return this.constrainIconToSmallestDimension;
    }

    public final w6f getImageLoaderColorCallback() {
        return this.imageLoaderColorCallback;
    }

    public final ColorStateList getPlaceholderBackgroundColor() {
        return this.f3606e.f150021a.f139595c;
    }

    public final int getPlaceholderInset() {
        return this.placeholderInset;
    }

    public final float getPlaceholderInsetRatio() {
        return this.placeholderInsetRatio;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    public final float getRadius() {
        return ((Number) this.f3604P0.invoke()).floatValue();
    }

    public final wb40 getRequestCreator() {
        return this.requestCreator;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p.eh00, p.qe70] */
    /* JADX INFO: renamed from: h */
    public final void m9586h(q76 q76Var) {
        Drawable layerDrawable;
        int iM86387n;
        wb40 wb40Var;
        this.f3604P0 = new zq2(22, q76Var, this);
        dh01 dh01VarM35961e = new dh01().m35961e(((Number) this.f3604P0.invoke()).floatValue());
        n3d0 n3d0Var = this.f3606e;
        n3d0Var.setShapeAppearanceModel(dh01VarM35961e);
        dt71.m36830v(this, this.f3604P0);
        mif1 mif1VarMo24909b = q76Var.mo24909b();
        if (mif1VarMo24909b == null) {
            layerDrawable = null;
        } else if (mif1VarMo24909b instanceof b6o0) {
            Context context = getContext();
            vc41 vc41Var = ((b6o0) mif1VarMo24909b).f23998j;
            int iconReferenceSize = getIconReferenceSize();
            int iM9585g = m9585g();
            if (this.f3610i == vc41Var) {
                layerDrawable = this.f3609h;
            } else {
                int i = iconReferenceSize - (iM9585g * 2);
                tc41 tc41Var = new tc41(context, vc41Var, i);
                tc41Var.m80418c(ihf1.m50631o(context, R.color.encore_placeholder_icon));
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{n3d0Var, tc41Var});
                int coverArtSize = (getCoverArtSize() - i) / 2;
                layerDrawable2.setLayerInset(1, coverArtSize, iM9585g, coverArtSize, iM9585g);
                this.f3609h = layerDrawable2;
                this.f3610i = vc41Var;
                layerDrawable = layerDrawable2;
            }
        } else if (mif1VarMo24909b instanceof c6o0) {
            c6o0 c6o0Var = (c6o0) mif1VarMo24909b;
            layerDrawable = new z8y(getContext(), c6o0Var.m31585V(), c6o0Var.m31584U());
        } else if (mif1VarMo24909b instanceof a6o0) {
            Context context2 = getContext();
            ry30 ry30VarM24868U = ((a6o0) mif1VarMo24909b).m24868U();
            int iM9585g2 = m9585g();
            py30 py30VarM76689a = ry30VarM24868U.m76689a();
            if (py30VarM76689a instanceof py30) {
                ry30VarM24868U.m76689a().getClass();
                iM86387n = vtg1.m86387n(this, R.attr.textSubdued);
            } else {
                if (py30VarM76689a != null) {
                    throw new NoWhenBranchMatchedException();
                }
                iM86387n = vtg1.m86387n(this, R.attr.textSubdued);
            }
            Drawable drawableM60389y = lzj.m60389y(context2, ry30VarM24868U.m76690b());
            if (drawableM60389y != null) {
                svg1.m79458L(drawableM60389y.mutate(), iM86387n);
            } else {
                drawableM60389y = null;
            }
            int i2 = -Math.abs(getMeasuredWidth() - getMeasuredHeight());
            LayerDrawable layerDrawable3 = new LayerDrawable(new Drawable[]{n3d0Var, drawableM60389y});
            layerDrawable3.setLayerInset(0, i2, i2, i2, i2);
            int iconReferenceSize2 = getIconReferenceSize() - (iM9585g2 * 2);
            int coverArtSize2 = getCoverArtSize() > iconReferenceSize2 ? (getCoverArtSize() - iconReferenceSize2) / 2 : iM9585g2;
            layerDrawable3.setLayerInset(1, coverArtSize2, iM9585g2, coverArtSize2, iM9585g2);
            layerDrawable = layerDrawable3;
        } else {
            if (!mif1VarMo24909b.equals(z5o0.f279595j)) {
                throw new NoWhenBranchMatchedException();
            }
            layerDrawable = new LayerDrawable(new n3d0[]{n3d0Var});
        }
        wb40 wb40Var2 = this.requestCreator;
        if (wb40Var2 != null) {
            ((lxe) wb40Var2).m60176b();
        }
        String str = q76Var.mo24908a().f88010a;
        if (str == null) {
            if (q76Var instanceof w66) {
                layerDrawable = ((w66) q76Var).m87267d();
            }
            setImageDrawable(layerDrawable);
            return;
        }
        r96 r96Var = this.f3611t;
        if (r96Var == null) {
            wj50.m88260d0("viewContext");
            throw null;
        }
        lxe lxeVarMo24606b = r96Var.f196922a.mo24606b(str.length() == 0 ? Uri.EMPTY : Uri.parse(str));
        lxeVarMo24606b.m60191q(f3599Q0);
        this.requestCreator = lxeVarMo24606b;
        if (layerDrawable != null) {
            lxeVarMo24606b.m60187m(layerDrawable);
        }
        if (getScaleType() == ImageView.ScaleType.CENTER_CROP && (wb40Var = this.requestCreator) != null) {
            lxe lxeVar = (lxe) wb40Var;
            lxeVar.m60178d();
            lxeVar.m60190p(getWidth(), getHeight(), 1);
        }
        if (!q76Var.mo24910c()) {
            wb40 wb40Var3 = this.requestCreator;
            if (wb40Var3 != null) {
                ((lxe) wb40Var3).m60185k(this, this.imageLoaderColorCallback);
                return;
            }
            return;
        }
        wb40 wb40Var4 = this.requestCreator;
        if (wb40Var4 != null) {
            lxe lxeVar2 = (lxe) wb40Var4;
            lxeVar2.f137801g = false;
            lxeVar2.m60184j(jg31.m53279r(this, this.imageLoaderColorCallback));
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(q76 q76Var) {
        n10 n10Var = this.f3602N0;
        removeCallbacks(n10Var);
        r96 r96Var = this.f3611t;
        if (r96Var != null) {
            r96Var.f196922a.mo24607c(this);
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            addOnLayoutChangeListener(new j96(this, q76Var));
        } else {
            m9586h(q76Var);
        }
        if (q76Var.mo24908a().f88010a == null && q76Var.mo24910c()) {
            post(n10Var);
        }
    }

    public final void setConstrainIconToSmallestDimension(boolean z) {
        this.constrainIconToSmallestDimension = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable != null && !drawable.isStateful()) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, this.f3605d});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(aq7.f18123a, layerDrawable);
            stateListDrawable.addState(aq7.f18124b, drawable);
            drawable = stateListDrawable;
        }
        super.setImageDrawable(drawable);
    }

    public final void setImageLoaderColorCallback(w6f w6fVar) {
        this.imageLoaderColorCallback = w6fVar;
    }

    public final void setPlaceholderBackgroundColor(ColorStateList colorStateList) {
        this.f3606e.m63601l(colorStateList);
    }

    public final void setPlaceholderInset(int i) {
        this.placeholderInset = i;
    }

    public final void setPlaceholderInsetRatio(float f) {
        this.placeholderInsetRatio = f;
    }

    public final void setRequestCreator(wb40 wb40Var) {
        this.requestCreator = wb40Var;
    }

    public final void setViewContext(r96 viewContext) {
        this.f3611t = viewContext;
    }

    public ArtworkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ArtworkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3606e = new n3d0();
        this.f3602N0 = new n10(this, 9);
        this.f3604P0 = C2087le.f132409h;
        ColorDrawable colorDrawable = new ColorDrawable(lzj.m60386v(getContext(), R.color.gray_7));
        this.f3605d = colorDrawable;
        colorDrawable.setAlpha(128);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p1u0.f173170a, i, 0);
        this.placeholderInset = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        setPlaceholderBackgroundColor(lzj.m60387w(context, typedArrayObtainStyledAttributes.getResourceId(3, R.color.encore_placeholder_background)));
        this.placeholderInsetRatio = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        dt71.m36829u(this, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ ArtworkView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
