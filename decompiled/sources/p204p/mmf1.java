package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.comscore.android.ConnectivityType;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mmf1 {

    /* JADX INFO: renamed from: a */
    public static final int f145137a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m62307a(String str, Bundle bundle) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m62313g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return 6;
    }

    /* JADX INFO: renamed from: b */
    public static void m62308b(long j, String str, String str2, Bundle bundle) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m62309c(ye9 ye9Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", ye9Var.f271939a);
        bundle.putString("DEBUG_MESSAGE", ye9Var.f271941c);
        bundle.putInt("LOG_REASON", ilf1.m51014b(i));
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m62310d(String str, String str2, ArrayList arrayList, a2d1 a2d1Var, long j) {
        Bundle bundle = new Bundle();
        m62308b(j, str, str2, bundle);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        mlf1 mlf1Var = tlf1.f221461b;
        Object[] objArr = {"subs", "inapp"};
        g391.m43441A(2, objArr);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(tlf1.m81056l(2, objArr)));
        Object[] objArr2 = {"inapp"};
        g391.m43441A(1, objArr2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(tlf1.m81056l(1, objArr2)));
        Object[] objArr3 = {"inapp"};
        g391.m43441A(1, objArr3);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(tlf1.m81056l(1, objArr3)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            rit0 rit0Var = (rit0) arrayList.get(i);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z2 |= !TextUtils.isEmpty(null);
            if (rit0Var.f199615b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z2) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static ye9 m62311e(String str, Intent intent) {
        if (intent != null) {
            C2477v c2477vM93531a = ye9.m93531a();
            c2477vM93531a.f235859a = m62307a(str, intent.getExtras());
            c2477vM93531a.f235861c = m62312f(str, intent.getExtras());
            return c2477vM93531a.m84353a();
        }
        Log.isLoggable("BillingHelper", 5);
        C2477v c2477vM93531a2 = ye9.m93531a();
        c2477vM93531a2.f235859a = 6;
        c2477vM93531a2.f235861c = "An internal error occurred.";
        return c2477vM93531a2.m84353a();
    }

    /* JADX INFO: renamed from: f */
    public static String m62312f(String str, Bundle bundle) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m62313g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return "";
    }

    /* JADX INFO: renamed from: g */
    public static void m62313g(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = ConnectivityType.UNKNOWN;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m62314h() {
        Log.isLoggable("BillingLogger", 5);
    }

    /* JADX INFO: renamed from: i */
    public static void m62315i(String str) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static Purchase m62316j(String str, String str2) {
        if (str == null || str2 == null) {
            m62313g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            "Got JSONException while parsing purchase data: ".concat(e.toString());
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
    }
}
