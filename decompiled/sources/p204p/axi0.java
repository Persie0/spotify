package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class axi0 {

    /* JADX INFO: renamed from: a */
    public static final axi0 f20875a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f20876b;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f20877c;

    /* JADX INFO: renamed from: d */
    public static final Integer[] f20878d;

    static {
        axi0 axi0Var = new axi0();
        f20875a = axi0Var;
        f20876b = axi0Var.m27421a();
        int i = 0;
        ArrayList arrayList = null;
        if (!p2l.f173365a.contains(axi0Var)) {
            try {
                ArrayList arrayListM46710G = h6f.m46710G(new xwi0(i));
                arrayListM46710G.addAll(axi0Var.m27421a());
                arrayList = arrayListM46710G;
            } catch (Throwable th) {
                p2l.m68953a(axi0Var, th);
            }
        }
        axi0 axi0Var2 = f20875a;
        if (!p2l.f173365a.contains(axi0Var2)) {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new xwi0(2));
                ArrayList arrayList3 = f20876b;
                map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                p2l.m68953a(axi0Var2, th2);
            }
        }
        f20877c = new AtomicBoolean(false);
        f20878d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX INFO: renamed from: b */
    public static final int m27413b(TreeSet treeSet, int i, int[] iArr) {
        if (p2l.f173365a.contains(axi0.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator itDescendingIterator = treeSet.descendingIterator();
                int iMax = -1;
                while (itDescendingIterator.hasNext()) {
                    Integer num = (Integer) itDescendingIterator.next();
                    iMax = Math.max(iMax, num.intValue());
                    while (length >= 0 && iArr[length] > num.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == num.intValue()) {
                        if (length % 2 != 0) {
                            break;
                        }
                        return Math.min(iMax, i);
                    }
                }
            } catch (Throwable th) {
                p2l.m68953a(axi0.class, th);
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX INFO: renamed from: d */
    public static final Intent m27414d(Context context) {
        if (!p2l.f173365a.contains(axi0.class)) {
            try {
                Iterator it = f20876b.iterator();
                while (it.hasNext()) {
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((zwi0) it.next()).mo92289c()).addCategory("android.intent.category.DEFAULT");
                    if (p2l.f173365a.contains(axi0.class) || intentAddCategory == null) {
                        intentAddCategory = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                            if (resolveInfoResolveService == null || !s8y.m77538a(context, resolveInfoResolveService.serviceInfo.packageName)) {
                                intentAddCategory = null;
                            }
                        } catch (Throwable th) {
                            p2l.m68953a(axi0.class, th);
                        }
                    }
                    if (intentAddCategory != null) {
                        return intentAddCategory;
                    }
                }
            } catch (Throwable th2) {
                p2l.m68953a(axi0.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #2 {all -> 0x008a, blocks: (B:31:0x0070, B:33:0x0082), top: B:50:0x0070, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: e */
    public static final Intent m27415e(Intent intent, Bundle bundle, FacebookException facebookException) {
        String stringExtra;
        UUID uuidFromString;
        Intent intent2;
        Bundle bundle2;
        Bundle bundle3;
        Set set = p2l.f173365a;
        if (!set.contains(axi0.class)) {
            try {
                if (set.contains(axi0.class)) {
                    uuidFromString = null;
                    if (uuidFromString != null) {
                        intent2 = new Intent();
                        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m27418i(intent));
                        bundle2 = new Bundle();
                        bundle2.putString("action_id", uuidFromString.toString());
                        if (facebookException != null) {
                            if (p2l.f173365a.contains(axi0.class)) {
                                bundle3 = null;
                                bundle2.putBundle("error", bundle3);
                            } else {
                                try {
                                    bundle3 = new Bundle();
                                    bundle3.putString("error_description", facebookException.toString());
                                    if (facebookException instanceof FacebookOperationCanceledException) {
                                        bundle3.putString("error_type", "UserCanceled");
                                    }
                                } catch (Throwable th) {
                                    p2l.m68953a(axi0.class, th);
                                    bundle3 = null;
                                }
                                bundle2.putBundle("error", bundle3);
                            }
                        }
                        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                        if (bundle != null) {
                            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                        }
                        return intent2;
                    }
                } else {
                    try {
                        if (m27419j(m27418i(intent))) {
                            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                        } else {
                            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                        }
                        if (stringExtra != null) {
                            try {
                                uuidFromString = UUID.fromString(stringExtra);
                            } catch (IllegalArgumentException unused) {
                                p8y p8yVar = p8y.f175080a;
                                uuidFromString = null;
                                if (uuidFromString != null) {
                                    intent2 = new Intent();
                                    intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m27418i(intent));
                                    bundle2 = new Bundle();
                                    bundle2.putString("action_id", uuidFromString.toString());
                                    if (facebookException != null) {
                                        if (p2l.f173365a.contains(axi0.class)) {
                                            bundle3 = null;
                                            bundle2.putBundle("error", bundle3);
                                        } else {
                                            bundle3 = new Bundle();
                                            bundle3.putString("error_description", facebookException.toString());
                                            if (facebookException instanceof FacebookOperationCanceledException) {
                                                bundle3.putString("error_type", "UserCanceled");
                                            }
                                            bundle2.putBundle("error", bundle3);
                                        }
                                    }
                                    intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                    if (bundle != null) {
                                        intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                    }
                                    return intent2;
                                }
                                return null;
                            }
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m27418i(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (facebookException != null) {
                                    if (p2l.f173365a.contains(axi0.class)) {
                                        bundle3 = null;
                                        bundle2.putBundle("error", bundle3);
                                    } else {
                                        bundle3 = new Bundle();
                                        bundle3.putString("error_description", facebookException.toString());
                                        if (facebookException instanceof FacebookOperationCanceledException) {
                                            bundle3.putString("error_type", "UserCanceled");
                                        }
                                        bundle2.putBundle("error", bundle3);
                                    }
                                }
                                intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                if (bundle != null) {
                                    intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                }
                                return intent2;
                            }
                        } else {
                            uuidFromString = null;
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m27418i(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (facebookException != null) {
                                    if (p2l.f173365a.contains(axi0.class)) {
                                        bundle3 = null;
                                        bundle2.putBundle("error", bundle3);
                                    } else {
                                        bundle3 = new Bundle();
                                        bundle3.putString("error_description", facebookException.toString());
                                        if (facebookException instanceof FacebookOperationCanceledException) {
                                            bundle3.putString("error_type", "UserCanceled");
                                        }
                                        bundle2.putBundle("error", bundle3);
                                    }
                                }
                                intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                                if (bundle != null) {
                                    intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                                }
                                return intent2;
                            }
                        }
                    } catch (Throwable th2) {
                        p2l.m68953a(axi0.class, th2);
                        uuidFromString = null;
                    }
                }
            } catch (Throwable th3) {
                p2l.m68953a(axi0.class, th3);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final int m27416g() {
        if (p2l.f173365a.contains(axi0.class)) {
            return 0;
        }
        try {
            return f20878d[0].intValue();
        } catch (Throwable th) {
            p2l.m68953a(axi0.class, th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Bundle m27417h(Intent intent) {
        if (p2l.f173365a.contains(axi0.class)) {
            return null;
        }
        try {
            return !m27419j(m27418i(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            p2l.m68953a(axi0.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final int m27418i(Intent intent) {
        if (p2l.f173365a.contains(axi0.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            p2l.m68953a(axi0.class, th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m27419j(int i) {
        if (p2l.f173365a.contains(axi0.class)) {
            return false;
        }
        try {
            return bk5.m29621l0(f20878d, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            p2l.m68953a(axi0.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m27420k() {
        if (p2l.f173365a.contains(axi0.class)) {
            return;
        }
        try {
            if (f20877c.compareAndSet(false, true)) {
                p8y.m69345c().execute(new z85(3));
            }
        } catch (Throwable th) {
            p2l.m68953a(axi0.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m27421a() {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            return h6f.m46710G(new ywi0(), new xwi0(3));
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Intent m27422c(zwi0 zwi0Var, String str, Collection collection, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, int i2, boolean z4, boolean z5, String str6, String str7, String str8) {
        String strConcat;
        Set set = p2l.f173365a;
        if (!set.contains(this)) {
            try {
                String strMo92288b = zwi0Var.mo92288b();
                if (strMo92288b != null) {
                    Intent intentPutExtra = new Intent().setClassName(zwi0Var.mo92289c(), strMo92288b).putExtra("client_id", str);
                    p8y p8yVar = p8y.f175080a;
                    intentPutExtra.putExtra("facebook_sdk_version", "18.2.3");
                    if (!(collection == null || collection.isEmpty())) {
                        intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
                    }
                    if (!n0b1.m63385y(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    intentPutExtra.putExtra("response_type", zwi0Var.mo92290d());
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", "true");
                    if (z) {
                        intentPutExtra.putExtra("default_audience", adn.m25589a(i));
                    }
                    intentPutExtra.putExtra("legacy_override", p8y.m69346d());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z2) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z3);
                    if (z4) {
                        intentPutExtra.putExtra("fx_app", y8a0.m93097b(i2));
                    }
                    if (z5) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    if (str7 != null && str7.length() != 0) {
                        intentPutExtra.putExtra("https_redirect_uri", str7);
                        return intentPutExtra;
                    }
                    if (str8 != null && str8.length() != 0) {
                        if (set.contains(this)) {
                            strConcat = null;
                        } else {
                            try {
                                strConcat = "intent://".concat(str8);
                            } catch (Throwable th) {
                                p2l.m68953a(this, th);
                                strConcat = null;
                            }
                        }
                        intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th2) {
                p2l.m68953a(this, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final TreeSet m27423f(zwi0 zwi0Var) {
        Uri uri;
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = p8y.m69343a().getContentResolver();
            String[] strArr = {"version"};
            if (set.contains(this)) {
                uri = null;
            } else {
                try {
                    uri = Uri.parse("content://" + zwi0Var.mo92289c() + ".provider.PlatformProvider/versions");
                } catch (Throwable th2) {
                    p2l.m68953a(this, th2);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = p8y.m69343a().getPackageManager().resolveContentProvider(zwi0Var.mo92289c().concat(".provider.PlatformProvider"), 0);
                } catch (RuntimeException unused) {
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursorQuery;
                                th = th3;
                                if (cursor == null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
        } catch (Throwable th5) {
            p2l.m68953a(this, th5);
            return null;
        }
    }
}
