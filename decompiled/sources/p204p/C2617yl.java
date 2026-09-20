package p204p;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.spotify.contentdelivery.downloadimpl.ManifestException;
import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: p.yl */
/* JADX INFO: loaded from: classes.dex */
public class C2617yl implements Function, r8u, h741, Predicate, r9w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273868a;

    /* JADX INFO: renamed from: b */
    public final String f273869b;

    public /* synthetic */ C2617yl(String str, int i) {
        this.f273868a = i;
        this.f273869b = str;
    }

    /* JADX INFO: renamed from: d */
    public static C2617yl m94131d(l2n0 l2n0Var) {
        String str;
        l2n0Var.m57931S(2);
        int iM57917E = l2n0Var.m57917E();
        int i = iM57917E >> 1;
        int iM57917E2 = ((l2n0Var.m57917E() >> 3) & 31) | ((iM57917E & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM36620t = dq60.m36620t(str);
        sbM36620t.append(i < 10 ? ".0" : ".");
        sbM36620t.append(i);
        return new C2617yl(s571.m77248g(iM57917E2, iM57917E2 < 10 ? ".0" : ".", sbM36620t), 3);
    }

    /* JADX INFO: renamed from: i */
    public static String m94132i(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = s571.m77252k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return klh.m56834f(str, " : ", str2);
    }

    @Override // p204p.r8u
    /* JADX INFO: renamed from: a */
    public boolean mo52222a(CharSequence charSequence, int i, int i2, ep91 ep91Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f273869b)) {
            return true;
        }
        ep91Var.f61592c = (ep91Var.f61592c & 3) | 4;
        return false;
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        ((o1g1) ((ldg1) obj).m37438q()).m66068k2(new lag1(new x5g1(0, (ev61) obj2), 2), this.f273869b);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f273868a) {
            case 1:
                List itemsList = ((MetadataCosmos$MultiResponse) obj).getItemsList();
                ArrayList arrayList = new ArrayList();
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    axx axxVarM59032o = li80.m59032o(((MetadataCosmos$MetadataItem) it.next()).m15410n(), this.f273869b);
                    if (axxVarM59032o != null) {
                        arrayList.add(axxVarM59032o);
                    }
                }
                return arrayList;
            case 2:
                return Single.fromCallable(new x31(3, (CookieManager) obj, this.f273869b));
            default:
                Throwable th = (Throwable) obj;
                return th instanceof NullTransportException ? Single.error(new ManifestException(edb.m38564m("Failed to get manifest for manifestId: ", this.f273869b))) : Single.error(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public i5x m94133b(xh00 xh00Var, xh00 xh00Var2) {
        return new i5x(this.f273869b, xh00Var, xh00Var2);
    }

    @Override // p204p.h741
    /* JADX INFO: renamed from: c */
    public Iterator mo37398c(i741 i741Var, CharSequence charSequence) {
        return new f741(this, i741Var, charSequence, 1);
    }

    /* JADX INFO: renamed from: e */
    public void m94134e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            m94132i(this.f273869b, str, objArr);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m94135f(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            m94132i(this.f273869b, str, objArr);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m94136g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m94132i(this.f273869b, str, objArr);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m94137h(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            m94132i(this.f273869b, str, objArr);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((gqx) obj).mo45449a(fs11.class, this.f273869b).f72301b != null;
    }

    public String toString() {
        boolean zContainsAlias;
        switch (this.f273868a) {
            case 6:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                String str = this.f273869b;
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    zContainsAlias = keyStore.containsAlias(str);
                    break;
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    zContainsAlias = false;
                }
                return edb.m38570s(sb, zContainsAlias, "}");
            case 7:
            default:
                return super.toString();
            case 8:
                return dq60.m36617q(new StringBuilder("<"), this.f273869b, '>');
        }
    }

    public /* synthetic */ C2617yl(String str, int i, Object obj) {
        this.f273868a = i;
        this.f273869b = str;
    }

    public C2617yl(String str) {
        this.f273868a = 11;
        this.f273869b = edb.m38560i(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public C2617yl(String str, Object obj) {
        this.f273868a = 6;
        this.f273869b = str;
    }

    @Override // p204p.r8u
    public Object getResult() {
        return this;
    }
}
