package p204p;

import android.R;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.style.TypefaceSpan;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.common.zzy;
import com.spotify.base.java.logging.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r35 {

    /* JADX INFO: renamed from: a */
    public static String f195423a;

    /* JADX INFO: renamed from: b */
    public static int f195424b;

    /* JADX INFO: renamed from: c */
    public static Boolean f195425c;

    /* JADX INFO: renamed from: A */
    public static Signature[] m74571A(PackageInfo packageInfo) {
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo == null) {
            return null;
        }
        return signingInfo.getSigningCertificateHistory();
    }

    /* JADX INFO: renamed from: B */
    public static PrecomputedText.Params m74572B(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: C */
    public static int m74573C(Object obj) {
        return ((Icon) obj).getType();
    }

    /* JADX INFO: renamed from: D */
    public static Uri m74574D(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* JADX INFO: renamed from: E */
    public static final long m74575E(Context context, List list) {
        Long lValueOf;
        PackageInfo packageInfo;
        Iterator it = list.iterator();
        do {
            lValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                packageInfo = context.getPackageManager().getPackageInfo((String) it.next(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
            }
        } while (lValueOf == null);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F */
    public static ClassLoader m74576F() {
        return WebView.getWebViewClassLoader();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m74577G(NetworkRequest networkRequest, int i) {
        return networkRequest.hasCapability(i);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m74578H(NetworkRequest networkRequest, int i) {
        return networkRequest.hasTransport(i);
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m74579I(Context context) {
        List<String> listM88477a1 = wl51.m88477a1("C4:C1:A2:94:92:B9:A4:38:53:8C:8C:A5:76:B1:FC:D2:9B:24:6F:3B:82:89:15:13:1C:6C:35:5B:6D:15:FB:C4", new String[]{":"}, 0, 6);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM88477a1, 10));
        for (String str : listM88477a1) {
            zn91.m96584x(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str, 16)));
        }
        byte[] bArrM43718e1 = g6f.m43718e1(arrayList);
        if (Build.VERSION.SDK_INT >= 28) {
            return context.getPackageManager().hasSigningCertificate(context.getPackageName(), bArrM43718e1, 1);
        }
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        wj50.m88279p(signatureArr);
        for (Signature signature : signatureArr) {
            int i = yd20.f271624a;
            vme0 vme0Var = xd20.f260364a;
            byte[] byteArray = signature.toByteArray();
            vme0Var.getClass();
            int length = byteArray.length;
            c95.m31852r(0, length, byteArray.length);
            c95.m31842h("expectedInputSize must be >= 0 but was %s", length, length >= 0);
            c95 c95VarMo28837w = vme0Var.mo28837w();
            c95VarMo28837w.mo25556S(byteArray, length);
            if (Arrays.equals(c95VarMo28837w.mo25555F().mo56150a(), bArrM43718e1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m74580J(Handler handler, xgb xgbVar, long j) {
        return handler.postDelayed(xgbVar, "retry_token", j);
    }

    /* JADX INFO: renamed from: K */
    public static byte m74581K(hfa0 hfa0Var) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(hfa0Var.f90651a).getDigitStrings()[0], 0));
    }

    /* JADX INFO: renamed from: L */
    public static final dir0 m74582L() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            wj50.m88279p(processName);
        } else {
            try {
                processName = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null).invoke(null, null);
            } catch (ReflectiveOperationException e) {
                Logger.m3974j(e, "Failed to retrieve process name using reflection", new Object[0]);
                processName = "com.spotify.music";
            }
        }
        if (wl51.m88496t0(processName, ".gdbprocess", false)) {
            return dir0.f49469b;
        }
        if (wl51.m88496t0(processName, "com.spotify.music", false)) {
            return dir0.f49468a;
        }
        if (wl51.m88496t0(processName, "robolectric.ui", false) || t071.f215773a) {
            return dir0.f49470c;
        }
        throw new AssertionError(s571.m77251j("The process name ", processName, " is not allowed to start"));
    }

    /* JADX INFO: renamed from: M */
    public static int m74583M(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: N */
    public static int m74584N(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: O */
    public static int m74585O(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: P */
    public static int m74586P(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: Q */
    public static void m74587Q(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: R */
    public static void m74588R(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    /* JADX INFO: renamed from: S */
    public static final void m74589S(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }

    /* JADX INFO: renamed from: T */
    public static void m74590T(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    /* JADX INFO: renamed from: U */
    public static final void m74591U(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m74592V() {
        Boolean boolValueOf = f195425c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new zzy(dxf1.m37225N("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f195425c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static void m74593a(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC1665af.m25758H(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m74594b(Menu menu, int i, Context context, TextClassification textClassification, int i2) {
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(textClassification.getIcon());
            menuItemAdd.setOnMenuItemClickListener(new wq4(1, context, textClassification));
            return;
        }
        boolean z = i2 == 0;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, z ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(z ? 2 : 0);
        if (z || remoteAction.shouldShowIcon()) {
            menuItemAdd2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: p.nf71
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                r35.m74593a(remoteAction);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m74595c(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    /* JADX INFO: renamed from: d */
    public static final void m74596d(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m74597e(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    /* JADX INFO: renamed from: f */
    public static Handler m74598f(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: g */
    public static Handler m74599g(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: h */
    public static Handler m74600h(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m74601i(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    /* JADX INFO: renamed from: j */
    public static thj0 m74602j(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException unused) {
                gaz gazVarM44190b = gaz.m44190b();
                int i2 = thj0.f220444b;
                int i3 = thj0.f220444b;
                gazVarM44190b.getClass();
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = nkf1.f154870a[i4];
            if (!bk5.m29619k0(iArr, i5)) {
                try {
                    builder.removeCapability(i5);
                } catch (IllegalArgumentException unused2) {
                    gaz gazVarM44190b2 = gaz.m44190b();
                    int i6 = thj0.f220444b;
                    int i7 = thj0.f220444b;
                    gazVarM44190b2.getClass();
                }
            }
        }
        for (int i8 : iArr2) {
            builder.addTransportType(i8);
        }
        return new thj0(builder.build());
    }

    /* JADX INFO: renamed from: k */
    public static TextClassifier m74603k(Context context, wkz0 wkz0Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = wkz0Var.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    /* JADX INFO: renamed from: l */
    public static TypefaceSpan m74604l(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    /* JADX INFO: renamed from: m */
    public static void m74605m(View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            view.setAccessibilityHeading(true);
        }
        mec1.m61564p(view, new usa(10));
    }

    /* JADX INFO: renamed from: n */
    public static long m74606n(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
    }

    /* JADX INFO: renamed from: o */
    public static List m74607o(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: p */
    public static String[] m74608p(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: q */
    public static long m74609q(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* JADX INFO: renamed from: r */
    public static Executor m74610r(Context context) {
        return context.getMainExecutor();
    }

    /* JADX INFO: renamed from: s */
    public static String m74611s() throws Throwable {
        BufferedReader bufferedReader;
        if (f195423a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f195423a = Application.getProcessName();
            } else {
                int iMyPid = f195424b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f195424b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                strTrim = null;
                try {
                    if (iMyPid > 0) {
                        try {
                            StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb.append("/proc/");
                            sb.append(iMyPid);
                            sb.append("/cmdline");
                            String string = sb.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    ig31.m50506x(line);
                                    strTrim = line.trim();
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    f195423a = strTrim;
                                    return f195423a;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th2;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (IOException unused4) {
                }
                f195423a = strTrim;
            }
        }
        return f195423a;
    }

    /* JADX INFO: renamed from: t */
    public static void m74612t(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    /* JADX INFO: renamed from: u */
    public static int m74613u(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: v */
    public static String m74614v(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX INFO: renamed from: w */
    public static int m74615w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: x */
    public static int m74616x(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: y */
    public static int m74617y(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: z */
    public static int m74618z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
