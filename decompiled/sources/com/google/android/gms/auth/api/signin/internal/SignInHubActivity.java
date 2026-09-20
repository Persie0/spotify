package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;
import p204p.fag1;
import p204p.hc80;
import p204p.jgc1;
import p204p.l5f1;
import p204p.m500;
import p204p.m7a0;
import p204p.mw31;
import p204p.n7a0;
import p204p.p7a0;
import p204p.r3f1;
import p204p.s5f1;
import p204p.vw90;
import p204p.x651;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class SignInHubActivity extends m500 {

    /* JADX INFO: renamed from: c1 */
    public static boolean f1754c1 = false;

    /* JADX INFO: renamed from: X0 */
    public boolean f1755X0 = false;

    /* JADX INFO: renamed from: Y0 */
    public SignInConfiguration f1756Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f1757Z0;

    /* JADX INFO: renamed from: a1 */
    public int f1758a1;

    /* JADX INFO: renamed from: b1 */
    public Intent f1759b1;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k0 */
    public final void m1479k0() {
        vw90 vw90VarM86531p = vw90.m86531p(this);
        jgc1 jgc1Var = new jgc1(this, 8);
        hc80 hc80Var = (hc80) vw90VarM86531p.f245441b;
        p7a0 p7a0Var = (p7a0) vw90VarM86531p.f245442c;
        boolean z = p7a0Var.f174633c;
        mw31 mw31Var = p7a0Var.f174632b;
        if (z) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        mw31Var.getClass();
        m7a0 m7a0Var = (m7a0) fag1.m41164m(mw31Var, 0);
        if (m7a0Var == null) {
            try {
                p7a0Var.f174633c = true;
                Set set = r3f1.f195504b;
                synchronized (set) {
                }
                l5f1 l5f1Var = new l5f1(this, set);
                if (l5f1.class.isMemberClass() && !Modifier.isStatic(l5f1.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + l5f1Var);
                }
                m7a0 m7a0Var2 = new m7a0(l5f1Var);
                mw31Var.m62985g(0, m7a0Var2);
                p7a0Var.f174633c = false;
                n7a0 n7a0Var = new n7a0(m7a0Var2.f140751Y, jgc1Var);
                m7a0Var2.m33099f(hc80Var, n7a0Var);
                n7a0 n7a0Var2 = m7a0Var2.f140750L0;
                if (n7a0Var2 != null) {
                    m7a0Var2.mo33102k(n7a0Var2);
                }
                m7a0Var2.f140752Z = hc80Var;
                m7a0Var2.f140750L0 = n7a0Var;
            } catch (Throwable th) {
                p7a0Var.f174633c = false;
                throw th;
            }
        } else {
            n7a0 n7a0Var3 = new n7a0(m7a0Var.f140751Y, jgc1Var);
            m7a0Var.m33099f(hc80Var, n7a0Var3);
            n7a0 n7a0Var4 = m7a0Var.f140750L0;
            if (n7a0Var4 != null) {
                m7a0Var.mo33102k(n7a0Var4);
            }
            m7a0Var.f140752Z = hc80Var;
            m7a0Var.f140750L0 = n7a0Var3;
        }
        f1754c1 = false;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1480l0(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f1754c1 = false;
    }

    @Override // p204p.m500, p204p.cwf, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f1755X0) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f1750b) != null) {
                s5f1 s5f1VarM77260l = s5f1.m77260l(this);
                GoogleSignInOptions googleSignInOptions = this.f1756Y0.f1753b;
                synchronized (s5f1VarM77260l) {
                    ((x651) s5f1VarM77260l.f205793b).m90079c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f1757Z0 = true;
                this.f1758a1 = i2;
                this.f1759b1 = intent;
                m1479k0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m1480l0(intExtra);
                return;
            }
        }
        m1480l0(8);
    }

    @Override // p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m1480l0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            if (strValueOf.length() != 0) {
                "Unknown action: ".concat(strValueOf);
            }
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f1756Y0 = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f1757Z0 = z;
            if (z) {
                this.f1758a1 = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f1759b1 = intent2;
                m1479k0();
                return;
            }
            return;
        }
        if (f1754c1) {
            setResult(0);
            m1480l0(12502);
            return;
        }
        f1754c1 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f1756Y0);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f1755X0 = true;
            m1480l0(17);
        }
    }

    @Override // p204p.m500, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f1754c1 = false;
    }

    @Override // p204p.cwf, p204p.bwf, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f1757Z0);
        if (this.f1757Z0) {
            bundle.putInt("signInResultCode", this.f1758a1);
            bundle.putParcelable("signInResultData", this.f1759b1);
        }
    }
}
