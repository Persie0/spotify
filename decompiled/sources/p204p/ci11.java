package p204p;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.UserManager;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.IconCompat;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.music.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ci11 {

    /* JADX INFO: renamed from: a */
    public static volatile ai11 f38186a;

    /* JADX INFO: renamed from: b */
    public static volatile ArrayList f38187b;

    /* JADX INFO: renamed from: A */
    public static void m32832A(View view) {
        view.setImportantForContentCapture(1);
    }

    /* JADX INFO: renamed from: B */
    public static void m32833B(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    /* JADX INFO: renamed from: C */
    public static void m32834C(Outline outline, vbn0 vbn0Var) {
        if (!(vbn0Var instanceof uk4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((uk4) vbn0Var).f231212a);
    }

    /* JADX INFO: renamed from: D */
    public static void m32835D(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* JADX INFO: renamed from: E */
    public static RouteDiscoveryPreference m32836E(uld0 uld0Var) {
        if (!uld0Var.m83363c()) {
            return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        boolean zM83362b = uld0Var.m83362b();
        ArrayList arrayList = new ArrayList();
        uld0Var.m83361a();
        for (String str : uld0Var.f231531b.m67345b()) {
            str.getClass();
            switch (str) {
                case "android.media.intent.category.REMOTE_PLAYBACK":
                    str = "android.media.route.feature.REMOTE_PLAYBACK";
                    break;
                case "android.media.intent.category.LIVE_AUDIO":
                    str = "android.media.route.feature.LIVE_AUDIO";
                    break;
                case "android.media.intent.category.LIVE_VIDEO":
                    str = "android.media.route.feature.LIVE_VIDEO";
                    break;
                case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                    str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                    break;
                case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                    str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                    break;
            }
            arrayList.add(str);
        }
        return new RouteDiscoveryPreference.Builder(arrayList, zM83362b).build();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX INFO: renamed from: F */
    public static tld0 m32837F(MediaRoute2Info mediaRoute2Info) {
        int i;
        ArrayList<String> stringArrayList;
        if (mediaRoute2Info == null) {
            return null;
        }
        e6a0 e6a0Var = new e6a0(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        Bundle bundle = (Bundle) e6a0Var.f56598b;
        e6a0Var.m37930x(mediaRoute2Info.getConnectionState());
        e6a0Var.m37902C(mediaRoute2Info.getVolumeHandling());
        e6a0Var.m37903D(mediaRoute2Info.getVolumeMax());
        e6a0Var.m37901B(mediaRoute2Info.getVolume());
        e6a0Var.m37932z(mediaRoute2Info.getExtras());
        bundle.putBoolean(x09.f256832d, true);
        bundle.putBoolean("canDisconnect", false);
        if (Build.VERSION.SDK_INT >= 34) {
            bundle.putStringArrayList("deduplicationIds", new ArrayList<>(AbstractC1665af.m25785p(mediaRoute2Info)));
            int iM25793x = AbstractC1665af.m25793x(mediaRoute2Info);
            i = 2;
            if (iM25793x == 2) {
                i = 12;
            } else if (iM25793x == 3) {
                i = 13;
            } else if (iM25793x == 4) {
                i = 14;
            } else if (iM25793x == 22) {
                i = 20;
            } else if (iM25793x == 23) {
                i = 21;
            } else if (iM25793x == 26) {
                i = 22;
            } else if (iM25793x == 29) {
                i = 24;
            } else if (iM25793x != 2000) {
                switch (iM25793x) {
                    case 8:
                        i = 3;
                        break;
                    case 9:
                        i = 16;
                        break;
                    case 10:
                        i = 23;
                        break;
                    case 11:
                        i = 17;
                        break;
                    case 12:
                        i = 18;
                        break;
                    case 13:
                        i = 19;
                        break;
                    default:
                        switch (iM25793x) {
                            case 1001:
                                i = 1;
                                break;
                            case 1002:
                                break;
                            case 1003:
                                i = 4;
                                break;
                            case 1004:
                                i = 5;
                                break;
                            case 1005:
                                i = 6;
                                break;
                            case 1006:
                                i = 7;
                                break;
                            case 1007:
                                i = 8;
                                break;
                            case 1008:
                                i = 9;
                                break;
                            case 1009:
                                i = 10;
                                break;
                            case ContentMediaFormat.EXTRA_GENERIC /* 1010 */:
                                i = 11;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        break;
                }
            } else {
                i = 1000;
            }
        } else {
            i = 0;
        }
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            bundle.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        e6a0Var.m37932z(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        if (i == 0) {
            i = extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
        }
        e6a0Var.m37931y(i);
        e6a0Var.m37900A(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            e6a0Var.m37913g(parcelableArrayList);
        }
        List<String> features = mediaRoute2Info.getFeatures();
        if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
            bundle.putBoolean("isDynamicGroupRoute", true);
        }
        if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK") && (stringArrayList = extras.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS")) != null && !stringArrayList.isEmpty()) {
            e6a0Var.m37915i(stringArrayList);
        }
        return e6a0Var.m37919m();
    }

    /* JADX INFO: renamed from: G */
    public static uld0 m32838G(RouteDiscoveryPreference routeDiscoveryPreference) {
        omd0 omd0Var;
        ArrayList<String> arrayList = new ArrayList();
        for (String str : routeDiscoveryPreference.getPreferredFeatures()) {
            str.getClass();
            switch (str) {
                case "android.media.route.feature.REMOTE_AUDIO_PLAYBACK":
                    str = "android.media.intent.category.REMOTE_AUDIO_PLAYBACK";
                    break;
                case "android.media.route.feature.REMOTE_VIDEO_PLAYBACK":
                    str = "android.media.intent.category.REMOTE_VIDEO_PLAYBACK";
                    break;
                case "android.media.route.feature.REMOTE_PLAYBACK":
                    str = "android.media.intent.category.REMOTE_PLAYBACK";
                    break;
                case "android.media.route.feature.LIVE_AUDIO":
                    str = "android.media.intent.category.LIVE_AUDIO";
                    break;
                case "android.media.route.feature.LIVE_VIDEO":
                    str = "android.media.intent.category.LIVE_VIDEO";
                    break;
            }
            arrayList.add(str);
        }
        ArrayList<String> arrayList2 = null;
        if (!arrayList.isEmpty()) {
            for (String str2 : arrayList) {
                if (str2 == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
        }
        if (arrayList2 == null) {
            omd0Var = omd0.f167017c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList2);
            omd0Var = new omd0(bundle, arrayList2);
        }
        return new uld0(omd0Var, routeDiscoveryPreference.shouldPerformActiveScan());
    }

    /* JADX INFO: renamed from: a */
    public static final void m32839a(c3q0 c3q0Var) {
        ConstraintLayout constraintLayout = c3q0Var.f33729a;
        String string = constraintLayout.getResources().getString(c3q0Var.f33733e.isChecked() ? R.string.podcast_row_auto_download_content_description_disabled : R.string.podcast_row_auto_download_content_description_enabled, c3q0Var.f33732d.getText(), c3q0Var.f33731c.getText());
        if (Build.VERSION.SDK_INT <= 35) {
            constraintLayout.announceForAccessibility(string);
        } else {
            constraintLayout.setStateDescription(string);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Context m32840b(Context context, String str) {
        return context.createAttributionContext(str);
    }

    /* JADX INFO: renamed from: c */
    public static wy9 m32841c(InterfaceC2415th interfaceC2415th) {
        C1742ci c1742ci = (C1742ci) interfaceC2415th;
        String strM32823b = c1742ci.m32823b();
        String strM74362a = c1742ci.f38166i.m74362a();
        String str = c1742ci.f38161d;
        if (str == null) {
            str = "1024";
        }
        return new wy9(strM32823b, strM74362a, str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: NullPointerException -> 0x0030, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x0030, blocks: (B:3:0x0003, B:5:0x0009, B:8:0x0014), top: B:30:0x0003 }] */
    /* JADX INFO: renamed from: d */
    public static wy9 m32842d(Parcelable parcelable) {
        String name;
        String address;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
        String strValueOf = null;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                name = bluetoothDevice.getAlias();
                if (TextUtils.isEmpty(name)) {
                    name = bluetoothDevice.getName();
                }
            } else {
                name = bluetoothDevice.getName();
            }
            try {
                address = bluetoothDevice.getAddress();
                try {
                    BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                    if (bluetoothClass != null) {
                        strValueOf = String.valueOf(bluetoothClass.getDeviceClass());
                    }
                } catch (NullPointerException e) {
                    e = e;
                    na6.m63972t("Unexpected null pointer from BT api", e);
                }
            } catch (NullPointerException e2) {
                e = e2;
                address = null;
            }
        } catch (NullPointerException e3) {
            e = e3;
            name = null;
            address = null;
        }
        if (strValueOf == null) {
            strValueOf = "1024";
        }
        return new wy9(name, address, strValueOf);
    }

    /* JADX INFO: renamed from: e */
    public static Icon m32843e(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* JADX INFO: renamed from: f */
    public static String m32844f(Context context) {
        return context.getAttributionTag();
    }

    /* JADX INFO: renamed from: g */
    public static int m32845g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return z201.m95173b(context.getSystemService(z201.m95174c())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m32846h(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static List m32847i(Context context) {
        Bundle bundle;
        String string;
        if (f38187b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, ci11.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (f38187b == null) {
                f38187b = arrayList;
            }
        }
        return f38187b;
    }

    /* JADX INFO: renamed from: j */
    public static ai11 m32848j(Context context) {
        if (f38186a == null) {
            try {
                f38186a = (ai11) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ci11.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f38186a == null) {
                f38186a = new ai11();
            }
        }
        return f38186a;
    }

    /* JADX INFO: renamed from: k */
    public static List m32849k(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return zh11.m96111a(context, z201.m95173b(context.getSystemService(z201.m95174c())).getShortcuts(i));
        }
        if (i2 < 25) {
            if ((i & 2) != 0) {
                try {
                    m32848j(context).getClass();
                    return new ArrayList();
                } catch (Exception unused) {
                }
            }
            return Collections.EMPTY_LIST;
        }
        ShortcutManager shortcutManagerM95173b = z201.m95173b(context.getSystemService(z201.m95174c()));
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManagerM95173b.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManagerM95173b.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManagerM95173b.getPinnedShortcuts());
        }
        return zh11.m96111a(context, arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static CharSequence m32850l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: m */
    public static String m32851m(gg0 gg0Var) {
        if (gg0Var instanceof eg0) {
            return "image/*";
        }
        if (gg0Var instanceof fg0) {
            return "video/*";
        }
        if (gg0Var instanceof dg0) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public static Insets m32852n(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m32853o() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m32854p(Context context) {
        UserManager userManager;
        return Build.VERSION.SDK_INT >= 30 && (userManager = (UserManager) context.getSystemService(UserManager.class)) != null && userManager.isManagedProfile();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m32855q(Context context, zh11 zh11Var) {
        IconCompat iconCompat;
        int i;
        InputStream inputStreamM398l;
        Bitmap bitmapDecodeStream;
        context.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int iM32845g = m32845g(context);
        if (iM32845g != 0) {
            if (i2 <= 29 && (iconCompat = zh11Var.f282773h) != null && (((i = iconCompat.f775a) == 6 || i == 4) && (inputStreamM398l = iconCompat.m398l(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM398l)) != null)) {
                zh11Var.f282773h = i == 6 ? IconCompat.m389c(bitmapDecodeStream) : IconCompat.m390d(bitmapDecodeStream);
            }
            int i3 = -1;
            if (i2 >= 30) {
                z201.m95173b(context.getSystemService(z201.m95174c())).pushDynamicShortcut(zh11Var.m96112b());
            } else if (i2 >= 25) {
                ShortcutManager shortcutManagerM95173b = z201.m95173b(context.getSystemService(z201.m95174c()));
                if (!shortcutManagerM95173b.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManagerM95173b.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= iM32845g) {
                        int rank = -1;
                        String id = null;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > rank) {
                                id = shortcutInfo.getId();
                                rank = shortcutInfo.getRank();
                            }
                        }
                        shortcutManagerM95173b.removeDynamicShortcuts(Arrays.asList(id));
                    }
                    shortcutManagerM95173b.addDynamicShortcuts(Arrays.asList(zh11Var.m96112b()));
                }
            }
            try {
                m32848j(context).getClass();
                ArrayList<zh11> arrayList = new ArrayList();
                if (arrayList.size() >= iM32845g) {
                    String str = null;
                    for (zh11 zh11Var2 : arrayList) {
                        int i4 = zh11Var2.f282778m;
                        if (i4 > i3) {
                            str = zh11Var2.f282767b;
                            i3 = i4;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(zh11Var);
                Iterator it = ((ArrayList) m32847i(context)).iterator();
                if (!it.hasNext()) {
                    m32862x(context, zh11Var.f282767b);
                    return true;
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(zh11Var);
                throw null;
            } catch (Exception unused) {
                Iterator it2 = ((ArrayList) m32847i(context)).iterator();
                if (!it2.hasNext()) {
                    m32862x(context, zh11Var.f282767b);
                    return false;
                }
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(zh11Var);
                throw null;
            } catch (Throwable th) {
                Iterator it3 = ((ArrayList) m32847i(context)).iterator();
                if (!it3.hasNext()) {
                    m32862x(context, zh11Var.f282767b);
                    throw th;
                }
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(zh11Var);
                throw null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m32856r(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m32857s(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m32858t(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    /* JADX INFO: renamed from: u */
    public static void m32859u(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            z201.m95173b(context.getSystemService(z201.m95174c())).removeAllDynamicShortcuts();
        }
        m32848j(context).getClass();
        Iterator it = ((ArrayList) m32847i(context)).iterator();
        if (it.hasNext()) {
            throw ikc0.m50937i(it);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m32860v(Context context, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            z201.m95173b(context.getSystemService(z201.m95174c())).removeDynamicShortcuts(list);
        }
        m32848j(context).getClass();
        Iterator it = ((ArrayList) m32847i(context)).iterator();
        if (it.hasNext()) {
            throw ikc0.m50937i(it);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m32861w(Context context, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT < 30) {
            m32860v(context, arrayList);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(arrayList);
        m32848j(context).getClass();
        Iterator it = ((ArrayList) m32847i(context)).iterator();
        if (it.hasNext()) {
            throw ikc0.m50937i(it);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m32862x(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            z201.m95173b(context.getSystemService(z201.m95174c())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) m32847i(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m32863y(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: z */
    public static void m32864z(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }
}
