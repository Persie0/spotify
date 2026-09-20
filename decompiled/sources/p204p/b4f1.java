package p204p;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b4f1 extends y3f1 implements wj10, xj10 {

    /* JADX INFO: renamed from: s */
    public static final j3f1 f23343s = e4f1.f56082a;

    /* JADX INFO: renamed from: l */
    public final Context f23344l;

    /* JADX INFO: renamed from: m */
    public final Handler f23345m;

    /* JADX INFO: renamed from: n */
    public final j3f1 f23346n;

    /* JADX INFO: renamed from: o */
    public final Set f23347o;

    /* JADX INFO: renamed from: p */
    public final twy f23348p;

    /* JADX INFO: renamed from: q */
    public b021 f23349q;

    /* JADX INFO: renamed from: r */
    public i82 f23350r;

    public b4f1(Context context, ywh0 ywh0Var, twy twyVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f23344l = context;
        this.f23345m = ywh0Var;
        this.f23348p = twyVar;
        this.f23347o = (Set) twyVar.f224511c;
        this.f23346n = f23343s;
    }

    @Override // p204p.xj10
    /* JADX INFO: renamed from: C */
    public final void mo28089C(lzi lziVar) {
        this.f23350r.m49910D(lziVar);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m28090b2(i82 i82Var) {
        b021 b021Var = this.f23349q;
        if (b021Var != null) {
            b021Var.mo32171f();
        }
        Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
        twy twyVar = this.f23348p;
        twyVar.f224516h = numValueOf;
        Handler handler = this.f23345m;
        this.f23349q = (b021) this.f23346n.mo48938g(this.f23344l, handler.getLooper(), twyVar, (c021) twyVar.f224515g, this, this);
        this.f23350r = i82Var;
        Set set = this.f23347o;
        if (set == null || set.isEmpty()) {
            handler.post(new n081(this, 17));
            return;
        }
        b021 b021Var2 = this.f23349q;
        b021Var2.getClass();
        b021Var2.mo37429c(new id8(b021Var2));
    }

    /* JADX INFO: renamed from: c2 */
    public final void m28091c2() {
        b021 b021Var = this.f23349q;
        if (b021Var != null) {
            b021Var.mo32171f();
        }
    }

    @Override // p204p.wj10
    public final void onConnected() {
        b021 b021Var = this.f23349q;
        b021Var.getClass();
        try {
            try {
                b021Var.f21732C.getClass();
                Account account = new Account("<<default account>>", "com.google");
                GoogleSignInAccount googleSignInAccountM90078b = "<<default account>>".equals(account.name) ? x651.m90076a(b021Var.f54558c).m90078b() : null;
                Integer num = b021Var.f21734E;
                ig31.m50506x(num);
                b5f1 b5f1Var = new b5f1(2, account, num.intValue(), googleSignInAccountM90078b);
                j4f1 j4f1Var = (j4f1) b021Var.m37438q();
                o4f1 o4f1Var = new o4f1(1, b5f1Var);
                Parcel parcelM49620C = j4f1Var.m49620C();
                x3f1.m89796b(parcelM49620C, o4f1Var);
                parcelM49620C.writeStrongBinder(this);
                j4f1Var.m49621v1(12, parcelM49620C);
            } catch (RemoteException unused) {
                this.f23345m.post(new vpa1(this, new t4f1(1, new lzi(8, null, null), null), 9));
            }
        } catch (RemoteException unused2) {
        }
    }

    @Override // p204p.wj10
    /* JADX INFO: renamed from: v1 */
    public final void mo28092v1(int i) {
        i82 i82Var = this.f23350r;
        p3f1 p3f1Var = (p3f1) ((yj10) i82Var.f99670f).f273264t.get((i45) i82Var.f99667c);
        if (p3f1Var != null) {
            if (p3f1Var.f173644s) {
                p3f1Var.m69012k(new lzi(17, null, null));
            } else {
                p3f1Var.mo28092v1(i);
            }
        }
    }
}
