package p204p;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pcd0 extends Binder implements dv30 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f176048a;

    /* JADX INFO: renamed from: l */
    public int f176049l;

    public pcd0(jcd0 jcd0Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.f176048a = new WeakReference(jcd0Var);
        this.f176049l = -1;
    }

    /* JADX INFO: renamed from: C */
    public static dv30 m69572C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof dv30)) {
            return (dv30) iInterfaceQueryLocalInterface;
        }
        cv30 cv30Var = new cv30();
        cv30Var.f42281a = iBinder;
        return cv30Var;
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: F */
    public final void mo33957F(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            xzi xziVarM92480a = xzi.m92480a(bundle);
            this.f176049l = xziVarM92480a.f267659b;
            m69574v1(new zca0(xziVarM92480a, 10));
        } catch (RuntimeException e) {
            yif1.m93821x0("Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            onDisconnected();
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: M1 */
    public final void mo33958M1(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            yif1.m93819w0("onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            ei6.m39077n(i2, "onSearchResultChanged(): Ignoring negative itemCount: ");
            return;
        }
        if (bundle != null) {
            try {
                egd0.m38849a(bundle);
            } catch (RuntimeException e) {
                yif1.m93821x0("Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        m69574v1(new xba0(24));
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: R1 */
    public final void mo33959R1(int i, Bundle bundle) {
        Bundle bundleM46328p = h0b1.m46328p(bundle);
        if (bundleM46328p == null) {
            yif1.m93819w0("Ignoring null Bundle for extras");
        } else {
            m69574v1(new ncd0(0, bundleM46328p));
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: T0 */
    public final void mo33960T0(int i, Bundle bundle) {
        try {
            h001.m46234a(bundle);
            m69574v1(new xba0(21));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for SessionError", e);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: X */
    public final void mo33961X(int i, List list) {
        if (list == null || this.f176049l == -1) {
            return;
        }
        try {
            jf40 jf40VarM69788m = pf40.m69788m();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                jf40VarM69788m.m28985c(bcf.m28703i(this.f176049l, bundle));
            }
            m69574v1(new mc5(i, jf40VarM69788m.m53150g(), 4));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for CommandButton", e);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final void m69573a2(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            jcd0 jcd0Var = (jcd0) this.f176048a.get();
            if (jcd0Var == null) {
                return;
            }
            jcd0Var.f111080b.m62572l(i, obj);
            jcd0Var.f111079a.m58660c1(new lx6(jcd0Var, i, 7));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: b1 */
    public final void mo33962b1(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m69574v1(new kcd0(b7p0.m28392b(bundle)));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: c */
    public final void mo33963c(int i, PendingIntent pendingIntent) {
        m69574v1(new mcd0(i, pendingIntent));
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: c0 */
    public final void mo33964c0(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.f176049l) == -1) {
            return;
        }
        try {
            m69573a2(i, ca80.m32007a(i2, bundle));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: c1 */
    public final void mo33965c1(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.f176049l) == -1) {
            return;
        }
        try {
            m69574v1(new zca0(n201.m63535b(i2, bundle), 11));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: d */
    public final void mo33966d(int i) {
        m69574v1(new xba0(22));
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: d1 */
    public final void mo33967d1(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            yif1.m93819w0("onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            ei6.m39077n(i2, "onChildrenChanged(): Ignoring negative itemCount: ");
            return;
        }
        if (bundle != null) {
            try {
                egd0.m38849a(bundle);
            } catch (RuntimeException e) {
                yif1.m93821x0("Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        m69574v1(new xba0(24));
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: e1 */
    public final void mo33968e1(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            yif1.m93819w0("Ignoring custom command with null args.");
            return;
        }
        try {
            m69574v1(new mc5(i, mxz0.m63117a(bundle), bundle2));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: g1 */
    public final void mo33969g1(int i, Bundle bundle, Bundle bundle2) {
        int i2;
        if (bundle == null || bundle2 == null || (i2 = this.f176049l) == -1) {
            return;
        }
        try {
            try {
                m69574v1(new us30(10, cap0.m32065q(i2, bundle), new x9p0(bundle2.getBoolean(x9p0.f259416d, false), bundle2.getBoolean(x9p0.f259417e, false))));
            } catch (RuntimeException e) {
                yif1.m93821x0("Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            yif1.m93821x0("Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: h */
    public final void mo33970h(int i, int i2, int i3) {
        m69574v1(new uix(i2, i3, 2));
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: j */
    public final void mo33971j(int i, List list) {
        if (list == null || this.f176049l == -1) {
            return;
        }
        try {
            jf40 jf40VarM69788m = pf40.m69788m();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                jf40VarM69788m.m28985c(bcf.m28703i(this.f176049l, bundle));
            }
            m69574v1(new mc5(i, jf40VarM69788m.m53150g(), 5));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: o0 */
    public final void mo33972o0(Bundle bundle, int i, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(x9p0.f259416d, z);
        bundle2.putBoolean(x9p0.f259417e, true);
        mo33969g1(i, bundle, bundle2);
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: o1 */
    public final void mo33973o1(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            try {
                m69574v1(new lcd0(nxz0.m65865b(bundle), b7p0.m28392b(bundle2)));
            } catch (RuntimeException e) {
                yif1.m93821x0("Ignoring malformed Bundle for Commands", e);
            }
        } catch (RuntimeException e2) {
            yif1.m93821x0("Ignoring malformed Bundle for SessionCommands", e2);
        }
    }

    @Override // p204p.dv30
    public final void onDisconnected() {
        m69574v1(new xba0(23));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            mo33967d1(parcel.readInt(), parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        if (i == 4002) {
            mo33958M1(parcel.readInt(), parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        switch (i) {
            case 3001:
                mo33957F(parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR));
                return true;
            case 3002:
                mo33974w0(parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR));
                return true;
            case 3003:
                mo33964c0(parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR));
                return true;
            case 3004:
                mo33971j(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3005:
                int i3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                mo33968e1(i3, (Bundle) vj50.m85729k(parcel, creator), (Bundle) vj50.m85729k(parcel, creator));
                return true;
            case 3006:
                parcel.readInt();
                onDisconnected();
                return true;
            case 3007:
                mo33972o0((Bundle) vj50.m85729k(parcel, Bundle.CREATOR), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3008:
                mo33965c1(parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR));
                return true;
            case 3009:
                mo33962b1(parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR));
                return true;
            case 3010:
                int i4 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mo33973o1(i4, (Bundle) vj50.m85729k(parcel, creator2), (Bundle) vj50.m85729k(parcel, creator2));
                return true;
            case 3011:
                mo33966d(parcel.readInt());
                return true;
            case 3012:
                mo33959R1(parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR));
                return true;
            case 3013:
                int i5 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mo33969g1(i5, (Bundle) vj50.m85729k(parcel, creator3), (Bundle) vj50.m85729k(parcel, creator3));
                return true;
            case 3014:
                mo33963c(parcel.readInt(), (PendingIntent) vj50.m85729k(parcel, PendingIntent.CREATOR));
                return true;
            case 3015:
                mo33960T0(parcel.readInt(), (Bundle) vj50.m85729k(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                mo33961X(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3017:
                int i6 = parcel.readInt();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle = (Bundle) vj50.m85729k(parcel, creator4);
                Bundle bundle2 = (Bundle) vj50.m85729k(parcel, creator4);
                Bundle bundle3 = (Bundle) vj50.m85729k(parcel, creator4);
                if (bundle == null || bundle2 == null) {
                    yif1.m93819w0("Ignoring custom command progress update with null args.");
                } else {
                    try {
                        m69574v1(new vwo(i6, mxz0.m63117a(bundle), bundle2, bundle3));
                    } catch (RuntimeException e) {
                        yif1.m93821x0("Ignoring malformed Bundle for SessionCommand", e);
                    }
                }
                return true;
            case 3018:
                mo33970h(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m69574v1(ocd0 ocd0Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            jcd0 jcd0Var = (jcd0) this.f176048a.get();
            if (jcd0Var == null) {
                return;
            }
            h0b1.m46304c0(jcd0Var.f111079a.f131637e, new zaz(15, jcd0Var, ocd0Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // p204p.dv30
    /* JADX INFO: renamed from: w0 */
    public final void mo33974w0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m69573a2(i, r201.m74501a(bundle));
        } catch (RuntimeException e) {
            yif1.m93821x0("Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
