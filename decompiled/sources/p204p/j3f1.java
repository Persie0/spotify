package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class j3f1 extends ufc1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f108369c;

    public /* synthetic */ j3f1(int i) {
        this.f108369c = i;
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: g */
    public o35 mo48938g(Context context, Looper looper, twy twyVar, Object obj, wj10 wj10Var, xj10 xj10Var) {
        switch (this.f108369c) {
            case 0:
                twyVar.getClass();
                Integer num = (Integer) twyVar.f224516h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new b021(context, looper, twyVar, bundle, wj10Var, xj10Var);
            case 1:
                throw ei6.m39072i(obj);
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 10:
            default:
                return super.mo48938g(context, looper, twyVar, obj, wj10Var, xj10Var);
            case 5:
                return new t5f1(context, looper, twyVar, (cg7) obj, (p3f1) wj10Var, (p3f1) xj10Var);
            case 7:
                return new o5f1(context, looper, twyVar, (GoogleSignInOptions) obj, (p3f1) wj10Var, (p3f1) xj10Var);
            case 9:
                z9c z9cVar = (z9c) obj;
                ig31.m50507y(z9cVar, "Setting the API options is required.");
                return new cbh1(context, looper, twyVar, z9cVar.f280739a, 0, z9cVar.f280741c, z9cVar.f280742d, (p3f1) wj10Var, (p3f1) xj10Var);
            case 11:
                return new yrg1(context, looper, 161, twyVar, wj10Var, xj10Var, 0);
            case 12:
                return new l6g1(context, looper, twyVar, (p3f1) wj10Var, (p3f1) xj10Var);
            case 13:
                return new ldg1(context, looper, twyVar, (p3f1) wj10Var, (p3f1) xj10Var);
        }
    }

    @Override // p204p.ufc1
    /* JADX INFO: renamed from: h */
    public o35 mo52256h(Context context, Looper looper, twy twyVar, Object obj, p3f1 p3f1Var, p3f1 p3f1Var2) {
        switch (this.f108369c) {
            case 2:
                return new f5f1(context, looper, 308, twyVar, p3f1Var, p3f1Var2, 0);
            case 3:
                return new n3f1(context, looper, 449, twyVar, p3f1Var, p3f1Var2, 0);
            case 4:
                return new a5f1(context, looper, twyVar, (jy61) obj, p3f1Var, p3f1Var2);
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                return super.mo52256h(context, looper, twyVar, obj, p3f1Var, p3f1Var2);
            case 6:
                return new x5f1(context, looper, twyVar, p3f1Var, p3f1Var2);
            case 8:
                return new baf1(context, looper, 432, twyVar, p3f1Var, p3f1Var2, 0);
            case 10:
                return new uvf1(context, looper, twyVar, p3f1Var, p3f1Var2);
            case 14:
                return new nng1(context, looper, 380, twyVar, p3f1Var, p3f1Var2, 0);
        }
    }
}
