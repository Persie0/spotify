package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class at30 {

    /* JADX INFO: renamed from: a */
    public final po10 f19579a;

    /* JADX INFO: renamed from: b */
    public final z9t f19580b;

    /* JADX INFO: renamed from: c */
    public final u6x f19581c;

    /* JADX INFO: renamed from: d */
    public final tr8 f19582d;

    public at30(Activity activity, u6x u6xVar, tr8 tr8Var) {
        this.f19579a = new po10(activity);
        this.f19580b = new z9t(activity);
        this.f19581c = u6xVar;
        this.f19582d = tr8Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m27105f(ImageView imageView, String str) {
        vc41 vc41Var = (vc41) mq30.f146151a.m63901l(str).mo49280e(vc41.TRACK);
        if (vc41Var != imageView.getTag(R.id.hub_glue_internal_tag_image_icon)) {
            Context context = imageView.getContext();
            ColorStateList colorStateListM30533v = bug1.m30533v(context, R.attr.pasteColorAccessory);
            tc41 tc41Var = new tc41(context, vc41Var, wqg1.m88767v(24.0f, context.getResources()));
            tc41Var.m80418c(colorStateListM30533v);
            tc41Var.m80419d(wqg1.m88767v(24.0f, context.getResources()));
            imageView.setImageDrawable(tc41Var);
            imageView.setTag(R.id.hub_glue_internal_tag_image_icon, vc41Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27106a(ImageView imageView) {
        this.f19581c.m82470j(imageView);
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m27107b(String str) {
        po10 po10Var = this.f19579a;
        if (str == null) {
            return (Drawable) po10Var.f179559b;
        }
        Activity activity = (Activity) po10Var.f179560c;
        Drawable drawable = activity.getDrawable(R.drawable.encore_icon_track);
        if (drawable == null) {
            throw new IllegalArgumentException("Icon drawable resource must be valid");
        }
        int iM86386m = vtg1.m86386m(activity, R.attr.baseTextSubdued, 0);
        int iM86386m2 = vtg1.m86386m(activity, 0, 0);
        drawable.setTint(iM86386m);
        return new s10(drawable, 1.0f, iM86386m2, 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m27108c(ImageView imageView, wq30 wq30Var, no30 no30Var) {
        tfs jt4Var = null;
        if (wq30Var == null) {
            m27106a(imageView);
            imageView.setImageDrawable(null);
            return;
        }
        try {
            int i = no30Var.f156561a;
            Drawable drawableM27107b = m27107b(wq30Var.placeholder());
            u6x u6xVar = this.f19581c;
            String strUri = wq30Var.uri();
            Uri uri = !TextUtils.isEmpty(strUri) ? Uri.parse(strUri) : null;
            l591 l591VarM95738z = this.f19580b.m95738z(cct.m32324w(wq30Var), i);
            Context context = imageView.getContext();
            int i2 = 3;
            if (cct.m32324w(wq30Var) == po30.CIRCULAR) {
                int i3 = qde.f187548f;
                jt4Var = new lb5(i2);
            }
            if (wq30Var.custom().boolValue("verified", false)) {
                tr8 tr8Var = this.f19582d;
                int iM38547C = edb.m38547C(i);
                int i4 = 2;
                if (iM38547C == 0) {
                    i2 = 1;
                } else if (iM38547C == 1) {
                    i2 = 2;
                }
                tr8Var.getClass();
                jt4Var = new jt4(new sr8(context, i2), jt4Var, context, i4);
            }
            u6xVar.m82470j(imageView);
            lxe lxeVarMo24606b = ((e940) u6xVar.f227447b).mo24606b(uri);
            if (drawableM27107b != null) {
                lxeVarMo24606b.m60187m(drawableM27107b);
                lxeVarMo24606b.m60180f(drawableM27107b);
            }
            if (l591VarM95738z != null) {
                lxeVarMo24606b.m60192r(l591VarM95738z);
            }
            u6x.m82465l(imageView, lxeVarMo24606b, jt4Var);
        } catch (Exception e) {
            na6.m63959g("Image can not be loaded " + wq30Var.uri(), e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m27109d(ImageView imageView, wq30 wq30Var, lb5 lb5Var) {
        if (wq30Var == null) {
            m27106a(imageView);
            imageView.setImageDrawable(null);
            return;
        }
        String strUri = wq30Var.uri();
        Uri uri = TextUtils.isEmpty(strUri) ? null : Uri.parse(strUri);
        Drawable drawableM27107b = m27107b(wq30Var.placeholder());
        l591 l591VarM95738z = this.f19580b.m95738z(cct.m32324w(wq30Var), 3);
        u6x u6xVar = this.f19581c;
        u6xVar.m82470j(imageView);
        lxe lxeVarMo24606b = ((e940) u6xVar.f227447b).mo24606b(uri);
        if (drawableM27107b != null) {
            lxeVarMo24606b.m60187m(drawableM27107b);
            lxeVarMo24606b.m60180f(drawableM27107b);
        }
        lxeVarMo24606b.m60190p(2048, 2048, 2);
        if (l591VarM95738z != null) {
            lxeVarMo24606b.m60192r(l591VarM95738z);
        }
        u6x.m82465l(imageView, lxeVarMo24606b, lb5Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m27110e(ImageView imageView, String str, s10 s10Var, yaz yazVar) {
        u6x u6xVar = this.f19581c;
        u6xVar.m82470j(imageView);
        e940 e940Var = (e940) u6xVar.f227447b;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        lxe lxeVarMo24613j = e940Var.mo24613j(str);
        lxeVarMo24613j.f137801g = false;
        if (s10Var != null) {
            lxeVarMo24613j.m60187m(s10Var);
        }
        rlv0 rlv0Var = new rlv0();
        cxb cxbVar = new cxb(imageView, new ne30(3, rlv0Var, yazVar), new C2113m3(rlv0Var, 10), 15);
        Object tag = imageView.getTag(R.id.hubs_view_bound_image_request);
        tdc1 tdc1Var = tag instanceof tdc1 ? (tdc1) tag : null;
        if (tdc1Var != null) {
            tdc1Var.m80503a();
        }
        tdc1 tdc1Var2 = new tdc1(imageView, lxeVarMo24613j);
        imageView.setTag(R.id.hubs_view_bound_image_request, tdc1Var2);
        imageView.addOnAttachStateChangeListener(tdc1Var2);
        rlv0Var.f200373a = tdc1Var2;
        tdc1Var2.f219281c = cxbVar;
        try {
            wb40 wb40Var = tdc1Var2.f219279a;
            if (wb40Var != null) {
                ((lxe) wb40Var).m60184j(tdc1Var2);
            }
        } catch (RuntimeException e) {
            tdc1Var2.m80503a();
            throw e;
        }
    }
}
