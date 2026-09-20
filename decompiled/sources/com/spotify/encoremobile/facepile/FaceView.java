package com.spotify.encoremobile.facepile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.clr0;
import p204p.dt71;
import p204p.e940;
import p204p.fbk0;
import p204p.gtq;
import p204p.h6y;
import p204p.j6y;
import p204p.lxe;
import p204p.m56;
import p204p.o4n0;
import p204p.omr0;
import p204p.pmr0;
import p204p.qmr0;
import p204p.u7y;
import p204p.wj50;
import p204p.wl51;
import p204p.ykq0;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/encoremobile/facepile/FaceView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "radiusPx", "Lp/w2a1;", "setCornerRadius", "(F)V", "p/u7y", "src_main_java_com_spotify_encoremobile_facepile-facepile"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FaceView extends AppCompatImageView {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f3814f = 0;

    /* JADX INFO: renamed from: d */
    public e940 f3815d;

    /* JADX INFO: renamed from: e */
    public Disposable f3816e;

    public FaceView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m9680e(FaceView faceView, e940 e940Var, j6y j6yVar, omr0 omr0Var) {
        Integer num = omr0Var.f167082a;
        if (num != null) {
            j6yVar = j6y.m52590c(j6yVar, new h6y(num.intValue()));
        }
        faceView.m9681f(e940Var, j6yVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m9681f(e940 e940Var, j6y j6yVar) {
        String str = j6yVar.f109421a;
        Drawable drawableM52595l = j6yVar.m52595l(getContext());
        if (str == null || str.length() == 0) {
            setImageDrawable(drawableM52595l);
        } else {
            lxe lxeVarMo24606b = e940Var.mo24606b(Uri.parse(str));
            lxeVarMo24606b.m60179e();
            lxeVarMo24606b.m60180f(drawableM52595l);
            lxeVarMo24606b.m60185k(this, null);
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setVisibility(0);
    }

    /* JADX INFO: renamed from: g */
    public final void m9682g(u7y u7yVar, j6y j6yVar) {
        m9683h(u7yVar.f227769a, j6yVar, u7yVar.f227770b);
    }

    /* JADX INFO: renamed from: h */
    public final void m9683h(e940 e940Var, j6y j6yVar, qmr0 qmr0Var) {
        String str;
        Single singleJust;
        e940 e940Var2 = this.f3815d;
        if (e940Var2 != null) {
            e940Var2.mo24607c(this);
        }
        Disposable disposable = this.f3816e;
        if (disposable != null) {
            disposable.dispose();
        }
        if (j6yVar == null) {
            setVisibility(8);
            this.f3815d = null;
            return;
        }
        if (qmr0Var == null || !(((str = j6yVar.f109421a) == null || str.length() == 0) && j6yVar.f109424d == null)) {
            m9681f(e940Var, j6yVar);
            this.f3815d = e940Var;
            return;
        }
        String str2 = j6yVar.f109422b;
        m56 m56Var = new m56(this, e940Var, j6yVar, 3);
        if (wl51.m88460J0(str2)) {
            singleJust = Single.just(new omr0(null));
            wj50.m88279p(singleJust);
        } else {
            singleJust = qmr0Var.f190383a.m86360c(str2).map(pmr0.f179219b).firstOrError().map(new fbk0(qmr0Var, 25)).onErrorReturn(ykq0.f273809c);
            wj50.m88279p(singleJust);
        }
        this.f3816e = singleJust.subscribeOn(qmr0Var.f190384b).observeOn(qmr0Var.f190385c).subscribe(new o4n0(m56Var, 22), clr0.f39374g, qmr0Var.f190386d);
        this.f3815d = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(iMin, iMin);
    }

    public final void setCornerRadius(float radiusPx) {
        dt71.m36829u(this, radiusPx);
    }

    public FaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        dt71.m36829u(this, Float.MAX_VALUE);
    }

    public /* synthetic */ FaceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
