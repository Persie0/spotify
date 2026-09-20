package p204p;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import io.reactivex.rxjava3.core.SingleEmitter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class dnf1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final b9v0 f50799l;

    /* JADX INFO: renamed from: m */
    public final frf1 f50800m;

    /* JADX INFO: renamed from: n */
    public final int f50801n;

    public dnf1(b9v0 b9v0Var, bka1 bka1Var, int i) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 2);
        this.f50799l = b9v0Var;
        this.f50800m = bka1Var;
        this.f50801n = i;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: v1 */
    public final boolean mo36471v1(int i, Parcel parcel, Parcel parcel2) {
        x6x0 r5x0Var;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) rhf1.m75514a(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(s571.m77246e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        int i2 = this.f50801n;
        hgg1 hgg1Var = hgg1.BROADCAST_ACTION_UNSPECIFIED;
        frf1 frf1Var = this.f50800m;
        b9v0 b9v0Var = this.f50799l;
        if (bundle == null) {
            ye9 ye9Var = esf1.f62362f;
            ((bka1) frf1Var).m29665q(crf1.m33738b(63, 13, ye9Var, null, hgg1Var), i2);
            b9v0Var.m28543f(ye9Var);
        } else {
            int iM62307a = mmf1.m62307a("BillingClient", bundle);
            String strM62312f = mmf1.m62312f("BillingClient", bundle);
            C2477v c2477vM93531a = ye9.m93531a();
            c2477vM93531a.f235859a = iM62307a;
            c2477vM93531a.f235861c = strM62312f;
            if (iM62307a != 0) {
                Log.isLoggable("BillingClient", 5);
                ye9 ye9VarM84353a = c2477vM93531a.m84353a();
                ((bka1) frf1Var).m29665q(crf1.m33738b(23, 13, ye9VarM84353a, null, hgg1Var), i2);
                b9v0Var.m28543f(ye9VarM84353a);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    String strOptString = new JSONObject(bundle.getString("BILLING_CONFIG")).optString("countryCode");
                    ye9 ye9VarM84353a2 = c2477vM93531a.m84353a();
                    b9v0Var.getClass();
                    int i3 = ye9VarM84353a2.f271939a;
                    if (i3 == 0) {
                        r5x0Var = strOptString != null ? new k6x0(new qd9(strOptString)) : new x5x0(9, new IllegalStateException("null config.countryCode"));
                    } else {
                        r5x0Var = new r5x0(9, i3, ye9VarM84353a2.f271941c);
                    }
                    ((SingleEmitter) b9v0Var.f25009b).onSuccess(r5x0Var);
                } catch (JSONException unused) {
                    mmf1.m62315i("BillingClient");
                    ye9 ye9Var2 = esf1.f62362f;
                    ((bka1) frf1Var).m29665q(crf1.m33738b(65, 13, ye9Var2, null, hgg1Var), i2);
                    b9v0Var.m28543f(ye9Var2);
                }
            } else {
                Log.isLoggable("BillingClient", 5);
                c2477vM93531a.f235859a = 6;
                ye9 ye9VarM84353a3 = c2477vM93531a.m84353a();
                ((bka1) frf1Var).m29665q(crf1.m33738b(64, 13, ye9VarM84353a3, null, hgg1Var), i2);
                b9v0Var.m28543f(ye9VarM84353a3);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
