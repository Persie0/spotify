package p204p;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import com.spotify.profile.editprofile.editprofile.kidsprofileavatarpicker.KidsProfileAvatarPickerActivity;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class o5m0 extends hsg1 {

    /* JADX INFO: renamed from: c */
    public static final o5m0 f162037c = new o5m0(0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f162038b;

    public /* synthetic */ o5m0(int i) {
        this.f162038b = i;
    }

    /* JADX INFO: renamed from: A */
    public Intent mo53166A(Context context, Uri uri) {
        return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
    }

    /* JADX INFO: renamed from: B */
    public Intent m66293B(Context context, twn0 twn0Var) {
        if (ci11.m32853o()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(ci11.m32851m(twn0Var.f224454a));
            twn0Var.f224456c.getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(ci11.m32851m(twn0Var.f224454a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        if (resolveInfoResolveActivity == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(ci11.m32851m(twn0Var.f224454a));
        twn0Var.f224456c.getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    @Override // p204p.hsg1
    /* JADX INFO: renamed from: q */
    public Intent mo32677q(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f162038b) {
            case 0:
                return (Intent) obj;
            case 1:
                return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) obj).setType("*/*");
            case 2:
                return m66293B(context, (twn0) obj);
            case 3:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 4:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
            case 5:
                return (Intent) obj;
            case 6:
                return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (x550) obj);
            case 7:
                return mo53166A(context, (Uri) obj);
            case 8:
                return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", (Uri) obj).addFlags(3);
            case 9:
                x550 x550Var = (x550) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = x550Var.f258302b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        x550Var = new x550(x550Var.f258301a, null, x550Var.f258303c, x550Var.f258304d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", x550Var);
                if (c700.m31595O(2)) {
                    intent.toString();
                }
                return intent;
            case 10:
                Intent intent3 = new Intent(context, (Class<?>) GoogleCheckoutActivity.class);
                intent3.putExtra("CHECKOUT_ARGS_PARAM", (ok10) obj);
                return intent3;
            case 11:
                e670 e670Var = (e670) obj;
                Intent intent4 = new Intent(context, (Class<?>) KidsProfileAvatarPickerActivity.class);
                intent4.putExtra("extra-color-picker-displayname", e670Var.f56580b);
                intent4.putExtra("extra-color-picker-username", e670Var.f56579a);
                intent4.putExtra("extra-color-picker-image", e670Var.f56581c);
                intent4.putExtra("extra-color-picker-color", e670Var.f56582d);
                return intent4;
            case 12:
                Intent intent5 = new Intent(context, (Class<?>) PictureSelectionActivity.class);
                intent5.putExtra("using-camera", ((bzn0) obj).f32541a);
                return intent5;
            default:
                Intent intent6 = new Intent(context, (Class<?>) SpotifyCheckoutActivity.class);
                intent6.putExtra("EXTRA_ARGS", (ub41) obj);
                return intent6;
        }
    }

    @Override // p204p.hsg1
    /* JADX INFO: renamed from: s */
    public s5f1 mo32678s(Context context, Object obj) {
        switch (this.f162038b) {
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new s5f1(nau.f152117a, 5);
                }
                for (String str : strArr) {
                    if (lzj.m60353c(context, str) != 0) {
                        return null;
                    }
                }
                int iM31820L = c95.m31820L(strArr.length);
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new s5f1(linkedHashMap, 5);
            case 4:
                if (lzj.m60353c(context, (String) obj) == 0) {
                    return new s5f1(Boolean.TRUE, 5);
                }
                return null;
            case 5:
            case 6:
            default:
                return super.mo32678s(context, obj);
            case 7:
                return null;
            case 8:
                return null;
        }
    }

    @Override // p204p.hsg1
    /* JADX INFO: renamed from: v */
    public final Object mo32679v(Intent intent, int i) {
        List arrayList;
        Uri data;
        Bundle extras;
        wb41 wb41Var;
        switch (this.f162038b) {
            case 0:
                return w2a1.f247311a;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 2:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data2 = intent.getData();
                if (data2 != null) {
                    return data2;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data3 = intent.getData();
                if (data3 != null) {
                    linkedHashSet.add(data3);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = lau.f131415a;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Uri uri = clipData.getItemAt(i2).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) g6f.m43745s0(arrayList);
            case 3:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        return kkc0.m56705r0(g6f.m43746s1(bk5.m29582E0(stringArrayExtra), arrayList2));
                    }
                }
                return nau.f152117a;
            case 4:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra2 != null) {
                    for (int i4 : intArrayExtra2) {
                        if (i4 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                return new xf0(intent, i);
            case 6:
                return new xf0(intent, i);
            case 7:
                return Boolean.valueOf(i == -1);
            case 8:
                return Boolean.valueOf(i == -1);
            case 9:
                return new xf0(intent, i);
            case 10:
                GoogleCheckoutActivity.f4132h1.getClass();
                om10 om10Var = intent != null ? (om10) pp91.m70538s(intent, "EXTRA_CHECKOUT_RESULT", om10.class) : null;
                return om10Var == null ? jm10.f113730a : om10Var;
            case 11:
                if (i == 100) {
                    Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("extra-color-picker-color", 0)) : null;
                    if (numValueOf != null) {
                        return new i670(numValueOf.intValue());
                    }
                } else {
                    if (i != 200) {
                        return f670.f66306a;
                    }
                    String stringExtra = intent != null ? intent.getStringExtra("extra-color-picker-avatar-name") : null;
                    String stringExtra2 = intent != null ? intent.getStringExtra("extra-color-picker-avatar-url") : null;
                    if (stringExtra != null && stringExtra2 != null) {
                        return new h670(stringExtra, stringExtra2);
                    }
                }
                return g670.f76948a;
            case 12:
                if (i != -1) {
                    if (i == 100) {
                        return dzn0.f54700a;
                    }
                } else if (intent != null && (data = intent.getData()) != null) {
                    return new ezn0(data);
                }
                return czn0.f43598a;
            default:
                return (intent == null || (extras = intent.getExtras()) == null || (wb41Var = (wb41) zn91.m96526N(extras, "EXTRA_CHECKOUT_RESULT", wb41.class)) == null) ? wb41.f249692b : wb41Var;
        }
    }

    public /* synthetic */ o5m0(boolean z, int i) {
        this.f162038b = i;
    }
}
