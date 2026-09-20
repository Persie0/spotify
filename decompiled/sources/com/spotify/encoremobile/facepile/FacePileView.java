package com.spotify.encoremobile.facepile;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.AbstractC1768d7;
import p204p.cf40;
import p204p.ddg1;
import p204p.g6f;
import p204p.gtq;
import p204p.n2u0;
import p204p.pf40;
import p204p.wsv0;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/encoremobile/facepile/FacePileView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "cornerRadiusPx", "Lp/w2a1;", "setFaceCornerRadius", "(F)V", "size", "setFaceSize", "(I)V", "src_main_java_com_spotify_encoremobile_facepile-facepile"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class FacePileView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final wsv0 f3809a;

    /* JADX INFO: renamed from: b */
    public final FacePileContainer f3810b;

    /* JADX INFO: renamed from: c */
    public final boolean f3811c;

    /* JADX INFO: renamed from: d */
    public final int f3812d;

    /* JADX INFO: renamed from: e */
    public final float f3813e;

    public FacePileView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void setFaceCornerRadius(float cornerRadiusPx) {
        ViewGroup.LayoutParams layoutParams;
        wsv0 wsv0Var = this.f3809a;
        Iterator it = wsv0Var.iterator();
        while (true) {
            AbstractC1768d7 abstractC1768d7 = (AbstractC1768d7) it;
            if (!abstractC1768d7.hasNext()) {
                break;
            } else {
                ((FaceView) abstractC1768d7.next()).setCornerRadius(cornerRadiusPx);
            }
        }
        FaceView faceView = (FaceView) g6f.m43745s0(wsv0Var);
        if (faceView == null || (layoutParams = faceView.getLayoutParams()) == null) {
            return;
        }
        this.f3810b.m9679a(layoutParams.width / 2.0f, this.f3813e, this.f3812d, cornerRadiusPx);
    }

    public final void setFaceSize(int size) {
        this.f3810b.m9679a(size / 2.0f, this.f3813e, this.f3812d, Float.MAX_VALUE);
        Iterator it = this.f3809a.iterator();
        while (true) {
            AbstractC1768d7 abstractC1768d7 = (AbstractC1768d7) it;
            if (!abstractC1768d7.hasNext()) {
                return;
            }
            FaceView faceView = (FaceView) abstractC1768d7.next();
            ViewGroup.LayoutParams layoutParams = faceView.getLayoutParams();
            layoutParams.width = size;
            layoutParams.height = size;
            faceView.setLayoutParams(layoutParams);
        }
    }

    public FacePileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FacePileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2u0.f149834a);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.face_size));
        this.f3812d = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.second_face_left_margin));
        int integer = typedArrayObtainStyledAttributes.getInteger(2, 2);
        this.f3811c = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f3813e = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        FacePileContainer facePileContainer = (FacePileContainer) layoutInflaterFrom.inflate(R.layout.face_pile_container, (ViewGroup) this, false);
        this.f3810b = facePileContainer;
        addView(facePileContainer);
        ddg1.m35736g(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < integer) {
            View view = (FaceView) layoutInflaterFrom.inflate(R.layout.face_view_layout, (ViewGroup) this.f3810b, false);
            if (i2 == 0) {
                view.setId(R.id.face_pile_first);
            } else {
                int i4 = this.f3812d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (view.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                    marginLayoutParams.rightMargin = i4;
                } else {
                    marginLayoutParams.leftMargin = i4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
            if (this.f3813e <= 0.0f) {
                view.setElevation(((integer - i2) - 1.0f) * getResources().getDisplayMetrics().density);
            }
            view.setDuplicateParentStateEnabled(true);
            int i5 = i3 + 1;
            int iM32617b = cf40.m32617b(objArrCopyOf.length, i5);
            if (iM32617b > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM32617b);
            }
            objArrCopyOf[i3] = view;
            this.f3810b.addView(view);
            i2++;
            i3 = i5;
        }
        this.f3809a = pf40.m69787l(i3, objArrCopyOf);
        setFaceSize(dimensionPixelSize);
    }

    public /* synthetic */ FacePileView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
