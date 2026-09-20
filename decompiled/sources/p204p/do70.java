package p204p;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.text.font.FontWeight;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class do70 implements zn70, edo0, r3m0, geo0 {

    /* JADX INFO: renamed from: a */
    public static final do70 f50962a = new do70();

    /* JADX INFO: renamed from: b */
    public static final do70 f50963b = new do70();

    /* JADX INFO: renamed from: c */
    public static final do70 f50964c = new do70();

    /* JADX INFO: renamed from: f */
    public static String m36512f(TextClassification textClassification, xq00 xq00Var) {
        xq00Var.m91771i0(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        xq00Var.m91788r(false);
        return strValueOf;
    }

    /* JADX INFO: renamed from: h */
    public static void m36513h(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC1665af.m25758H(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m36514i(RemoteAction remoteAction, xq00 xq00Var) {
        xq00Var.m91771i0(-1376593684);
        String string = remoteAction.getTitle().toString();
        xq00Var.m91788r(false);
        return string;
    }

    /* JADX INFO: renamed from: m */
    public static Typeface m36515m(String str, FontWeight fontWeight, int i) {
        if (i == 0 && wj50.m88271j(fontWeight, FontWeight.f532t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), fontWeight.f533a, i == 1);
    }

    /* JADX INFO: renamed from: n */
    public static void m36516n(r6k r6kVar, Context context, d571 d571Var) {
        if (context == null) {
            return;
        }
        int i = d571Var.f45362c;
        TextClassification textClassification = d571Var.f45361b;
        if (i < 0) {
            nk4 nk4Var = new nk4(textClassification, 23);
            Drawable icon = textClassification.getIcon();
            r6k.m74856b(r6kVar, nk4Var, icon != null ? new fyf(new rbq(icon, 3), true, -1123224187) : null, new v631(2, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            r6k.m74856b(r6kVar, new nk4(remoteAction, 22), ((i == 0) || remoteAction.shouldShowIcon()) ? new fyf(new w471(remoteAction), true, -1261173016) : null, new u471(remoteAction, 0), 6);
        }
    }

    @Override // p204p.r3m0
    /* JADX INFO: renamed from: a */
    public ArrayList mo36517a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (!signingInfo.hasMultipleSigners()) {
            arrayList.add(rfg1.m75454x(signingInfo.getSigningCertificateHistory()[0]));
            return arrayList;
        }
        for (Signature signature : signingInfo.getApkContentsSigners()) {
            arrayList.add(rfg1.m75454x(signature));
        }
        return arrayList;
    }

    @Override // p204p.geo0
    /* JADX INFO: renamed from: b */
    public Typeface mo36518b(int i, FontWeight fontWeight) {
        return m36515m(null, fontWeight, i);
    }

    @Override // p204p.zn70
    /* JADX INFO: renamed from: c */
    public Object mo36519c(rx10 rx10Var, fbk fbkVar) {
        return Bitmap.createBitmap(new co70(rx10Var));
    }

    @Override // p204p.edo0
    /* JADX INFO: renamed from: d */
    public boolean mo36520d() {
        return false;
    }

    @Override // p204p.geo0
    /* JADX INFO: renamed from: e */
    public Typeface mo36521e(w310 w310Var, FontWeight fontWeight, int i) {
        return m36515m(w310Var.f247456f, fontWeight, i);
    }

    @Override // p204p.edo0
    /* JADX INFO: renamed from: g */
    public ddo0 mo36522g(View view, boolean z, long j, float f, float f2, boolean z2, yqq yqqVar, float f3) {
        return new fdo0(new Magnifier(view));
    }

    /* JADX INFO: renamed from: j */
    public void m36523j(Drawable drawable, xq00 xq00Var, int i) {
        xq00Var.m91775k0(257732500);
        int i2 = (xq00Var.m91770i(drawable) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM61834r = mi21.m61834r(x6k.f258701j, cxh0.f43038a);
            boolean zM91770i = xq00Var.m91770i(drawable);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new wa31(drawable, 7);
                xq00Var.m91793t0(objM91750T);
            }
            dha.m36004a(z520.m95446z(fxh0VarM61834r, (gh00) objM91750T), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cr3(this, drawable, i, 26);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m36524k(final Icon icon, xq00 xq00Var, final int i) {
        pgv0 pgv0VarM91796v;
        th00 th00Var;
        xq00Var.m91775k0(2116504409);
        int i2 = (xq00Var.m91770i(icon) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            boolean zM91766g = xq00Var.m91766g(icon) | xq00Var.m91766g(context);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = icon.loadDrawable(context);
                xq00Var.m91793t0(objM91750T);
            }
            Drawable drawable = (Drawable) objM91750T;
            if (drawable == null) {
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                }
                final int i3 = 0;
                th00Var = new th00(this, icon, i, i3) { // from class: p.v471

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f237089a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ do70 f237090b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Icon f237091c;

                    {
                        this.f237089a = i3;
                        this.f237090b = this;
                    }

                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = this.f237089a;
                        xq00 xq00Var2 = (xq00) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                this.f237090b.m36524k(this.f237091c, xq00Var2, fyg1.m43076B(49));
                                break;
                            default:
                                this.f237090b.m36524k(this.f237091c, xq00Var2, fyg1.m43076B(49));
                                break;
                        }
                        return w2a1.f247311a;
                    }
                };
            } else {
                m36523j(drawable, xq00Var, 48);
            }
            pgv0VarM91796v.f177419d = th00Var;
        }
        xq00Var.m91757b0();
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            final int i4 = 1;
            th00Var = new th00(this, icon, i, i4) { // from class: p.v471

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f237089a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ do70 f237090b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Icon f237091c;

                {
                    this.f237089a = i4;
                    this.f237090b = this;
                }

                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f237089a;
                    xq00 xq00Var2 = (xq00) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.f237090b.m36524k(this.f237091c, xq00Var2, fyg1.m43076B(49));
                            break;
                        default:
                            this.f237090b.m36524k(this.f237091c, xq00Var2, fyg1.m43076B(49));
                            break;
                    }
                    return w2a1.f247311a;
                }
            };
            pgv0VarM91796v.f177419d = th00Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public Object m36525l(Activity activity, ibk ibkVar) {
        y9s0 y9s0Var;
        Activity activity2;
        sef0 sef0Var;
        if (ibkVar instanceof y9s0) {
            y9s0Var = (y9s0) ibkVar;
            int i = y9s0Var.f270648e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9s0Var.f270648e = i - Integer.MIN_VALUE;
            } else {
                y9s0Var = new y9s0(this, ibkVar);
            }
        } else {
            y9s0Var = new y9s0(this, ibkVar);
        }
        Object obj = y9s0Var.f270646c;
        int i2 = y9s0Var.f270648e;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!l9s0.m58523e(activity)) {
                throw new IllegalArgumentException("Provided Activity is not running on a Projected device.");
            }
            sef0 sef0Var2 = new sef0(activity);
            y9s0Var.f270644a = activity;
            y9s0Var.f270645b = sef0Var2;
            y9s0Var.f270648e = 1;
            Object objM77895m = sef0Var2.m77895m(y9s0Var);
            yuk yukVar = yuk.f276404a;
            if (objM77895m == yukVar) {
                return yukVar;
            }
            activity2 = activity;
            sef0Var = sef0Var2;
            obj = objM77895m;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sef0Var = y9s0Var.f270645b;
            activity2 = y9s0Var.f270644a;
            bga.m29073P(obj);
        }
        new xpo(activity2, Handler.createAsync(Looper.getMainLooper()));
        return new z9s0(sef0Var, (sx30) obj);
    }
}
