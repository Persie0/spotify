package p204p;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class h5f1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f87832l = 1;

    /* JADX INFO: renamed from: m */
    public final Object f87833m;

    public h5f1(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.f87833m = revocationBoundService;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: a2 */
    public final boolean mo46686a2(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult d4f1Var;
        String strM90081e;
        int i2 = this.f87832l;
        Object obj = this.f87833m;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) m5f1.m60863a(parcel, Status.CREATOR);
                n3y0 n3y0Var = (n3y0) m5f1.m60863a(parcel, n3y0.CREATOR);
                ev61 ev61Var = (ev61) obj;
                if (status.m1489k()) {
                    ev61Var.m40097b(n3y0Var);
                } else {
                    ev61Var.m40096a(uqe1.m83767f(status));
                }
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i == 1) {
                    m46687c2();
                    x651 x651VarM90076a = x651.m90076a(revocationBoundService);
                    GoogleSignInAccount googleSignInAccountM90078b = x651VarM90076a.m90078b();
                    GoogleSignInOptions googleSignInOptionsM1478k = GoogleSignInOptions.f1736X;
                    if (googleSignInAccountM90078b != null) {
                        String strM90081e2 = x651VarM90076a.m90081e("defaultGoogleSignInAccount");
                        if (TextUtils.isEmpty(strM90081e2) || (strM90081e = x651VarM90076a.m90081e(x651.m90077f("googleSignInOptions", strM90081e2))) == null) {
                            googleSignInOptionsM1478k = null;
                        } else {
                            try {
                                googleSignInOptionsM1478k = GoogleSignInOptions.m1478k(strM90081e);
                            } catch (JSONException unused) {
                                googleSignInOptionsM1478k = null;
                            }
                        }
                    }
                    w4f1 w4f1VarM57162g = krg1.m57162g(revocationBoundService, googleSignInOptionsM1478k);
                    if (googleSignInAccountM90078b != null) {
                        r3f1 r3f1Var = w4f1VarM57162g.f220803i;
                        Context context = w4f1VarM57162g.f220795a;
                        boolean z = w4f1VarM57162g.m87198m() == 3;
                        r5f1.f196050a.m86280b("Revoking access", new Object[0]);
                        String strM90081e3 = x651.m90076a(context).m90081e("refreshToken");
                        r5f1.m74812b(context);
                        if (!z) {
                            q5f1 q5f1Var = new q5f1(r3f1Var, 1);
                            r3f1Var.f195505a.m80961d(1, q5f1Var);
                            d4f1Var = q5f1Var;
                        } else if (strM90081e3 == null) {
                            vra0 vra0Var = k5f1.f119507c;
                            Status status2 = new Status(4, null, null, null);
                            ig31.m50497o("Status code must not be SUCCESS", !status2.m1489k());
                            d4f1Var = new d4f1(status2);
                            d4f1Var.m1493a(status2);
                        } else {
                            k5f1 k5f1Var = new k5f1(strM90081e3);
                            new Thread(k5f1Var).start();
                            d4f1Var = k5f1Var.f119509b;
                        }
                        stf1.m79256p(d4f1Var, new jsc1());
                    } else {
                        w4f1VarM57162g.m87196k();
                    }
                } else {
                    if (i != 2) {
                        return false;
                    }
                    m46687c2();
                    s5f1.m77260l(revocationBoundService).m77266n();
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m46687c2() {
        if (kif1.m56502k((RevocationBoundService) this.f87833m, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5f1(ev61 ev61Var) {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback", 1);
        this.f87833m = ev61Var;
    }
}
