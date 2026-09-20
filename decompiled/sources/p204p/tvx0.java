package p204p;

import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class tvx0 {

    /* JADX INFO: renamed from: a */
    public final xc9 f224268a;

    /* JADX INFO: renamed from: b */
    public final PublishSubject f224269b;

    /* JADX INFO: renamed from: c */
    public final PublishSubject f224270c;

    public tvx0(Context context, wp10 wp10Var) {
        xc9 wqf1Var;
        fc9 fc9Var = new fc9(context);
        fc9Var.f68033c = this;
        fc9Var.f68031a = new er3(20);
        if (wp10Var.f253638a.m90274a()) {
            fc9Var.f68034d = true;
        }
        if (fc9Var.f68033c == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (fc9Var.f68031a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        fc9Var.f68031a.getClass();
        if (fc9Var.f68033c != null) {
            er3 er3Var = fc9Var.f68031a;
            tvx0 tvx0Var = fc9Var.f68033c;
            wqf1Var = fc9Var.m41294a() ? new wqf1(er3Var, context, tvx0Var, fc9Var) : new xc9(er3Var, context, tvx0Var, fc9Var);
        } else {
            er3 er3Var2 = fc9Var.f68031a;
            wqf1Var = fc9Var.m41294a() ? new wqf1(er3Var2, context, fc9Var) : new xc9(er3Var2, context, fc9Var);
        }
        this.f224268a = wqf1Var;
        this.f224269b = new PublishSubject();
        this.f224270c = new PublishSubject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static x6x0 m81621a(ye9 ye9Var, List list, int i) {
        Object arrayList;
        int i2 = ye9Var.f271939a;
        if (i2 != 0) {
            if (i2 != 1) {
                return new r5x0(i, i2, ye9Var.f271941c);
            }
            Logger.m3966b("User has cancelled the purchase flow", new Object[0]);
            return r6x0.f196374a;
        }
        if (list != null) {
            arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                JSONObject jSONObject = purchase.f1496c;
                String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                JSONObject jSONObject2 = purchase.f1496c;
                char c = jSONObject2.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2;
                int i3 = c != 1 ? c != 2 ? 3 : 1 : 2;
                ArrayList arrayList2 = new ArrayList();
                if (jSONObject2.has("productIds")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("productIds");
                    if (jSONArrayOptJSONArray != null) {
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                            arrayList2.add(jSONArrayOptJSONArray.optString(i4));
                        }
                    }
                } else if (jSONObject2.has("productId")) {
                    arrayList2.add(jSONObject2.optString("productId"));
                }
                String strOptString2 = jSONObject2.optString("obfuscatedAccountId");
                String str = null;
                C2617yl c2617yl = (strOptString2 == null && jSONObject2.optString("obfuscatedProfileId") == null) ? null : new C2617yl(strOptString2, 0);
                if (c2617yl != null) {
                    str = c2617yl.f273869b;
                }
                arrayList.add(new rdt0(i3, strOptString, str, arrayList2));
            }
        } else {
            arrayList = lau.f131415a;
        }
        return new k6x0(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x01f4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final x6x0 m81622b(int i) {
        String str;
        ye9 ye9Var;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            str = "fff";
        } else if (iM38547C == 1) {
            str = "subscriptions";
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "subscriptionsUpdate";
        }
        xc9 xc9Var = this.f224268a;
        if (xc9Var.m90375J()) {
            ye9 ye9Var2 = esf1.f62357a;
            switch (str.hashCode()) {
                case -422092961:
                    if (!str.equals("subscriptionsUpdate")) {
                        "Unsupported feature: ".concat(str);
                        int i2 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260152n ? esf1.f62363g : esf1.f62367k;
                        xc9Var.m90379O(10, 3, ye9Var);
                    }
                    break;
                case 96321:
                    if (!str.equals("aaa")) {
                        "Unsupported feature: ".concat(str);
                        int i3 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260159u ? esf1.f62363g : esf1.f62369m;
                        xc9Var.m90379O(31, 6, ye9Var);
                    }
                    break;
                case 97314:
                    if (!str.equals("bbb")) {
                        "Unsupported feature: ".concat(str);
                        int i4 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260157s ? esf1.f62363g : esf1.f62373q;
                        xc9Var.m90379O(30, 5, ye9Var);
                    }
                    break;
                case 98307:
                    if (!str.equals("ccc")) {
                        "Unsupported feature: ".concat(str);
                        int i5 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260160v ? esf1.f62363g : esf1.f62370n;
                        xc9Var.m90379O(19, 8, ye9Var);
                    }
                    break;
                case 99300:
                    if (!str.equals("ddd")) {
                        "Unsupported feature: ".concat(str);
                        int i6 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260158t ? esf1.f62363g : esf1.f62371o;
                        xc9Var.m90379O(21, 7, ye9Var);
                    }
                    break;
                case 100293:
                    if (!str.equals("eee")) {
                        "Unsupported feature: ".concat(str);
                        int i7 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260160v ? esf1.f62363g : esf1.f62370n;
                        xc9Var.m90379O(61, 9, ye9Var);
                    }
                    break;
                case 101286:
                    if (!str.equals("fff")) {
                        "Unsupported feature: ".concat(str);
                        int i8 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260161w ? esf1.f62363g : esf1.f62372p;
                        xc9Var.m90379O(20, 10, ye9Var);
                    }
                    break;
                case 102279:
                    if (!str.equals("ggg")) {
                        "Unsupported feature: ".concat(str);
                        int i9 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260162x ? esf1.f62363g : esf1.f62379w;
                        xc9Var.m90379O(32, 11, ye9Var);
                    }
                    break;
                case 103272:
                    if (!str.equals("hhh")) {
                        "Unsupported feature: ".concat(str);
                        int i10 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260162x ? esf1.f62363g : esf1.f62380x;
                        xc9Var.m90379O(33, 12, ye9Var);
                    }
                    break;
                case 104265:
                    if (!str.equals("iii")) {
                        "Unsupported feature: ".concat(str);
                        int i11 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260164z ? esf1.f62363g : esf1.f62382z;
                        xc9Var.m90379O(60, 13, ye9Var);
                    }
                    break;
                case 105258:
                    if (!str.equals("jjj")) {
                        "Unsupported feature: ".concat(str);
                        int i12 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260130A ? esf1.f62363g : esf1.f62354A;
                        xc9Var.m90379O(66, 14, ye9Var);
                    }
                    break;
                case 106251:
                    if (!str.equals("kkk")) {
                        "Unsupported feature: ".concat(str);
                        int i13 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260132C ? esf1.f62363g : esf1.f62374r;
                        xc9Var.m90379O(83, 18, ye9Var);
                    }
                    break;
                case 107244:
                    if (!str.equals("lll")) {
                        "Unsupported feature: ".concat(str);
                        int i14 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260131B ? esf1.f62363g : esf1.f62375s;
                        xc9Var.m90379O(104, 19, ye9Var);
                    }
                    break;
                case 108237:
                    if (!str.equals("mmm")) {
                        "Unsupported feature: ".concat(str);
                        int i15 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260132C ? esf1.f62363g : esf1.f62376t;
                        xc9Var.m90379O(119, 20, ye9Var);
                    }
                    break;
                case 109230:
                    if (!str.equals("nnn")) {
                        "Unsupported feature: ".concat(str);
                        int i16 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260133D ? esf1.f62363g : esf1.f62377u;
                        xc9Var.m90379O(138, 21, ye9Var);
                    }
                    break;
                case 207616302:
                    if (!str.equals("priceChangeConfirmation")) {
                        "Unsupported feature: ".concat(str);
                        int i17 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260155q ? esf1.f62363g : esf1.f62368l;
                        xc9Var.m90379O(35, 4, ye9Var);
                    }
                    break;
                case 1987365622:
                    if (!str.equals("subscriptions")) {
                        "Unsupported feature: ".concat(str);
                        int i18 = mmf1.f145137a;
                        Log.isLoggable("BillingClient", 5);
                        ye9Var = esf1.f62378v;
                        xc9Var.m90379O(34, 1, ye9Var);
                    } else {
                        ye9Var = xc9Var.f260151m ? esf1.f62363g : esf1.f62366j;
                        xc9Var.m90379O(9, 2, ye9Var);
                    }
                    break;
                default:
                    "Unsupported feature: ".concat(str);
                    int i19 = mmf1.f145137a;
                    Log.isLoggable("BillingClient", 5);
                    ye9Var = esf1.f62378v;
                    xc9Var.m90379O(34, 1, ye9Var);
                    break;
            }
        } else {
            ye9Var = esf1.f62364h;
            if (ye9Var.f271939a != 0) {
                xc9Var.m90380P(2, 5, ye9Var);
            } else {
                try {
                    int i20 = crf1.f41290a;
                    xc9Var.m90370E(crf1.m33739c(5, hgg1.BROADCAST_ACTION_UNSPECIFIED));
                } catch (Throwable unused) {
                    mmf1.m62315i("BillingClient");
                }
            }
        }
        int i21 = ye9Var.f271939a;
        if (i21 != -2) {
            return i21 != 0 ? new r5x0(3, i21, ye9Var.f271941c) : new k6x0(Boolean.TRUE);
        }
        return new k6x0(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c */
    public final void m81623c(ye9 ye9Var, List list) {
        this.f224270c.onNext(m81621a(ye9Var, list, 8));
    }
}
