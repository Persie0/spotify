package p204p;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class jld1 extends Dialog {

    /* JADX INFO: renamed from: Z */
    public static volatile int f113585Z;

    /* JADX INFO: renamed from: X */
    public boolean f113586X;

    /* JADX INFO: renamed from: Y */
    public WindowManager.LayoutParams f113587Y;

    /* JADX INFO: renamed from: a */
    public String f113588a;

    /* JADX INFO: renamed from: b */
    public String f113589b;

    /* JADX INFO: renamed from: c */
    public fld1 f113590c;

    /* JADX INFO: renamed from: d */
    public ild1 f113591d;

    /* JADX INFO: renamed from: e */
    public ProgressDialog f113592e;

    /* JADX INFO: renamed from: f */
    public ImageView f113593f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f113594g;

    /* JADX INFO: renamed from: h */
    public final ojd1 f113595h;

    /* JADX INFO: renamed from: i */
    public boolean f113596i;

    /* JADX INFO: renamed from: t */
    public boolean f113597t;

    /* JADX WARN: Illegal instructions before constructor call */
    public jld1(Context context, String str) {
        zn91.m96564m0();
        int i = f113585Z;
        if (i == 0) {
            zn91.m96564m0();
            i = f113585Z;
        }
        super(context, i);
        this.f113589b = "fbconnect://success";
        this.f113588a = str;
    }

    /* JADX INFO: renamed from: a */
    public static int m53673a(float f, int i, int i2, int i3) {
        double d;
        int i4 = (int) (i / f);
        if (i4 <= i2) {
            d = 1.0d;
        } else {
            d = i4 >= i3 ? 0.5d : ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i) * d);
    }

    /* JADX INFO: renamed from: b */
    public static final void m53674b(m500 m500Var) {
        if (m500Var == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = m500Var.getPackageManager().getApplicationInfo(m500Var.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && f113585Z == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = R.style.com_facebook_activity_theme;
                }
                f113585Z = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle mo53675c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleM63346E = n0b1.m63346E(uri.getQuery());
        bundleM63346E.putAll(n0b1.m63346E(uri.getFragment()));
        return bundleM63346E;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f113590c == null || this.f113596i) {
            return;
        }
        m53677e(new FacebookOperationCanceledException());
    }

    /* JADX INFO: renamed from: d */
    public final void m53676d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int iMin = Math.min(m53673a(displayMetrics.density, i3, 480, CtaType.CTA_SHARE_FIELD_NUMBER), displayMetrics.widthPixels);
        int iMin2 = Math.min(m53673a(displayMetrics.density, i, CtaType.CTA_SHARE_FIELD_NUMBER, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        ild1 ild1Var = this.f113591d;
        if (ild1Var != null) {
            ild1Var.stopLoading();
        }
        if (!this.f113597t && (progressDialog = this.f113592e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m53677e(Exception exc) {
        if (this.f113590c == null || this.f113596i) {
            return;
        }
        this.f113596i = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        fld1 fld1Var = this.f113590c;
        if (fld1Var != null) {
            fld1Var.mo41999f(null, facebookException);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final void m53678f(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        ild1 ild1Var = new ild1(getContext());
        this.f113591d = ild1Var;
        ild1Var.setVerticalScrollBarEnabled(false);
        ild1 ild1Var2 = this.f113591d;
        if (ild1Var2 != null) {
            ild1Var2.setHorizontalScrollBarEnabled(false);
        }
        ild1 ild1Var3 = this.f113591d;
        if (ild1Var3 != null) {
            ild1Var3.setWebViewClient(new k97(this, 3));
        }
        ild1 ild1Var4 = this.f113591d;
        WebSettings settings = ild1Var4 != null ? ild1Var4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        ild1 ild1Var5 = this.f113591d;
        if (ild1Var5 != null) {
            String str = this.f113588a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ild1Var5.loadUrl(str);
        }
        ild1 ild1Var6 = this.f113591d;
        if (ild1Var6 != null) {
            ild1Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        ild1 ild1Var7 = this.f113591d;
        if (ild1Var7 != null) {
            ild1Var7.setVisibility(4);
        }
        ild1 ild1Var8 = this.f113591d;
        WebSettings settings2 = ild1Var8 != null ? ild1Var8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        ild1 ild1Var9 = this.f113591d;
        WebSettings settings3 = ild1Var9 != null ? ild1Var9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        ild1 ild1Var10 = this.f113591d;
        if (ild1Var10 != null) {
            ild1Var10.setFocusable(true);
        }
        ild1 ild1Var11 = this.f113591d;
        if (ild1Var11 != null) {
            ild1Var11.setFocusableInTouchMode(true);
        }
        ild1 ild1Var12 = this.f113591d;
        if (ild1Var12 != null) {
            ild1Var12.setOnTouchListener(new eld1());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f113591d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f113594g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f113597t = false;
        if (n0b1.m63345D(getContext()) && (layoutParams = this.f113587Y) != null && layoutParams.token == null) {
            Activity ownerActivity = getOwnerActivity();
            layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            WindowManager.LayoutParams layoutParams2 = this.f113587Y;
            Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
            p8y p8yVar = p8y.f175080a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f113592e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f113592e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f113592e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f113592e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new xwk0(this, 1));
        }
        requestWindowFeature(1);
        this.f113594g = new FrameLayout(getContext());
        m53676d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f113593f = imageView;
        imageView.setOnClickListener(new l5r(this, 6));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.f113593f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f113593f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f113588a != null) {
            ImageView imageView4 = this.f113593f;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            m53678f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f113594g;
        if (frameLayout != null) {
            frameLayout.addView(this.f113593f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f113594g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f113597t = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            ild1 ild1Var = this.f113591d;
            if (ild1Var != null && ild1Var.canGoBack()) {
                ild1 ild1Var2 = this.f113591d;
                if (ild1Var2 != null) {
                    ild1Var2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        ojd1 ojd1Var = this.f113595h;
        if (ojd1Var != null) {
            if ((ojd1Var != null ? ojd1Var.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (ojd1Var != null) {
                    ojd1Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f113592e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        m53676d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        ojd1 ojd1Var = this.f113595h;
        if (ojd1Var != null) {
            ojd1Var.cancel(true);
            ProgressDialog progressDialog = this.f113592e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f113587Y = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jld1(m500 m500Var, String str, Bundle bundle, int i, fld1 fld1Var) {
        Uri uriM63361a;
        super(m500Var, f113585Z);
        zn91.m96564m0();
        this.f113589b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = n0b1.m63381u(m500Var) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f113589b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", p8y.m69344b());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.2.3"}, 1)));
        this.f113590c = fld1Var;
        if (wj50.m88271j(str, "share") && bundle.containsKey("media")) {
            this.f113595h = new ojd1(this, str, bundle);
            return;
        }
        if (hld1.f92675a[edb.m38547C(i)] == 1) {
            uriM63361a = n0b1.m63361a(yjg1.m93924p(), "oauth/authorize", bundle);
        } else {
            uriM63361a = n0b1.m63361a(yjg1.m93918j(), p8y.m69346d() + "/dialog/" + str, bundle);
        }
        this.f113588a = uriM63361a.toString();
    }
}
