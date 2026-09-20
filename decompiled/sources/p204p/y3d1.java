package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzwb;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class y3d1 implements Function, rdc1, el11, dn6, r7l0, r9w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268896a;

    /* JADX INFO: renamed from: b */
    public final Object f268897b;

    /* JADX INFO: renamed from: c */
    public Object f268898c;

    public /* synthetic */ y3d1(int i, Object obj, Object obj2) {
        this.f268896a = i;
        this.f268897b = obj;
        this.f268898c = obj2;
    }

    /* JADX INFO: renamed from: k */
    public static List m92750k(p9h1 p9h1Var) throws GeneralSecurityException {
        kuf1 g5h1Var;
        boolean z;
        l2h1 l2h1Var = nhg1.f154004a;
        ArrayList arrayList = new ArrayList(p9h1Var.m69394y());
        for (o9h1 o9h1Var : p9h1Var.m69393x()) {
            int iM66473y = o9h1Var.m66473y();
            Object objCast = null;
            try {
                ynd1 ynd1VarM92751l = m92751l(o9h1Var);
                x1h1 x1h1Var = (x1h1) (x1h1.class.equals(x1h1.class) ? x1h1.class.cast(l2h1Var) : (!x1h1.class.equals(g2h1.class) || c3h1.f33687a.f228905a.get()) ? null : x1h1.class.cast(new g2h1(0)));
                if (x1h1Var == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                g5h1Var = x1h1Var.mo57903a(ynd1VarM92751l);
                z = false;
            } catch (GeneralSecurityException e) {
                if ((g2h1.class.equals(x1h1.class) ? g2h1.class.cast(l2h1Var) : (!g2h1.class.equals(g2h1.class) || c3h1.f33687a.f228905a.get()) ? null : g2h1.class.cast(new g2h1(0))) == null) {
                    throw e;
                }
                g5h1Var = new g5h1(m92751l(o9h1Var));
                z = true;
            }
            if (g2h1.class.equals(x1h1.class)) {
                objCast = g2h1.class.cast(l2h1Var);
            } else if (g2h1.class.equals(g2h1.class) && !c3h1.f33687a.f228905a.get()) {
                objCast = g2h1.class.cast(new g2h1(0));
            }
            if (objCast == null && !m92752n(o9h1Var.m66467C())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new g1h1(g5h1Var, o9h1Var.m66467C(), iM66473y, iM66473y == p9h1Var.m69392w(), z));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static ynd1 m92751l(o9h1 o9h1Var) throws GeneralSecurityException {
        q1h1 q1h1Var;
        t1h1 t1h1Var;
        Integer numValueOf = o9h1Var.m66468D() == 5 ? null : Integer.valueOf(o9h1Var.m66473y());
        String strM44047w = o9h1Var.m66472x().m44047w();
        s9f1 s9f1VarM44048x = o9h1Var.m66472x().m44048x();
        int iM44045C = o9h1Var.m66472x().m44045C() - 2;
        if (iM44045C == 0) {
            q1h1Var = q1h1.f184338c;
        } else if (iM44045C == 1) {
            q1h1Var = q1h1.f184339d;
        } else if (iM44045C == 2) {
            q1h1Var = q1h1.f184340e;
        } else if (iM44045C == 3) {
            q1h1Var = q1h1.f184341f;
        } else {
            if (iM44045C != 4) {
                throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(iM44045C)));
            }
            q1h1Var = q1h1.f184342g;
        }
        int iM66468D = o9h1Var.m66468D() - 2;
        if (iM66468D == 0) {
            t1h1Var = t1h1.f216271c;
        } else if (iM66468D == 1) {
            t1h1Var = t1h1.f216272d;
        } else if (iM66468D == 2) {
            t1h1Var = t1h1.f216273e;
        } else if (iM66468D == 3) {
            t1h1Var = t1h1.f216274f;
        } else if (iM66468D == 4) {
            t1h1Var = t1h1.f216275g;
        } else {
            if (iM66468D != 5) {
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(iM66468D)));
            }
            t1h1Var = t1h1.f216276h;
        }
        return ynd1.m94246g(strM44047w, s9f1VarM44048x, q1h1Var, t1h1Var, numValueOf);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m92752n(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: a */
    public tjo mo27669a() {
        return (tjo) this.f268897b;
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        kgf1 kgf1Var = new kgf1((thf1) this.f268897b, (ev61) obj2, 0);
        acf1 acf1Var = (acf1) ((baf1) obj).m37438q();
        wff1 wff1Var = (wff1) this.f268898c;
        Parcel parcelM43604d2 = acf1Var.m43604d2();
        fmf1.m42108c(parcelM43604d2, kgf1Var);
        fmf1.m42108c(parcelM43604d2, wff1Var);
        acf1Var.m43606f2(1, parcelM43604d2);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objInvoke;
        switch (this.f268896a) {
            case 1:
                p2x0 p2x0Var = (p2x0) obj;
                k8c1 k8c1Var = new k8c1(8, (f4d1) this.f268897b, (x4b) this.f268898c);
                p2x0Var.getClass();
                if (p2x0Var instanceof k2x0) {
                    objInvoke = Single.error(new Exception(edb.m38564m("Failed to create playlist: ", ((k2x0) p2x0Var).f118699a.mo27977b())));
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objInvoke = k8c1Var.invoke(((m2x0) p2x0Var).f139474a);
                }
                return (SingleSource) objInvoke;
            case 2:
                gqx gqxVar = (gqx) obj;
                String str = (String) this.f268898c;
                String str2 = (String) ((z63) this.f268897b).f279685c;
                mec0 mec0Var = new mec0();
                pad1 pad1Var = (pad1) gqxVar.mo45449a(pad1.class, str).f72301b;
                if (pad1Var != null) {
                }
                erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str2).f72301b;
                if (erc1Var != null) {
                    mec0Var.put(erc1.class, new cbf0(erc1Var));
                }
                return new ebf0(Collections.singletonMap(str2, mec0Var.m61540b()));
            case 3:
            case 4:
            case 5:
            default:
                String str3 = (String) obj;
                vse1 vse1Var = (vse1) this.f268897b;
                g2a1 g2a1Var = vse1Var.f244422f;
                roa roaVar = (roa) this.f268898c;
                return g2a1Var.m43376g(str3, roaVar).map(new g7d1(roaVar, vse1Var, str3));
            case 6:
                return ((wb11) this.f268897b).mo35842b((Context) this.f268898c, (String) obj);
            case 7:
                roa roaVar2 = (roa) this.f268898c;
                zu0 zu0Var = ((gyp0) this.f268897b).f85687b;
                return ((e301) obj).f55572b ? zu0Var.m96988u(3).mo24638b(roaVar2) : zu0Var.m96988u(6).mo24638b(roaVar2);
        }
    }

    /* JADX INFO: renamed from: b */
    public Single m92753b(int i, String str, String str2) {
        wj50.m88279p(str);
        return ((my71) this.f268897b).mo63158a(str).flatMap(wsq0.f254699W0).doOnSuccess(new w3d1(this, i, 0)).doOnError(new w3d1(this, i, 1)).doOnSubscribe(new w3d1(this, str2, i));
    }

    /* JADX INFO: renamed from: c */
    public void m92754c(int i, Throwable th) {
        String strM38564m;
        if (th.getMessage() == null || (strM38564m = edb.m38564m("Auth failed with error: ", th.getMessage())) == null) {
            strM38564m = "Auth failed with no error message.";
        }
        Logger.m3966b("vtec-startup step 2 (AUTH): Auth Error: ".concat(strM38564m), new Object[0]);
        ((kl00) this.f268898c).m56793a(new g6d1(null, 1, kkc0.m56695h0(new pqm0("error", strM38564m), new pqm0("reason", t3d1.m79989d(i))), "authenticationFailed"));
    }

    /* JADX INFO: renamed from: d */
    public Object m92755d() {
        Reference referencePoll;
        Object obj;
        qqi0 qqi0Var = (qqi0) this.f268897b;
        do {
            referencePoll = ((ReferenceQueue) this.f268898c).poll();
            if (referencePoll != null) {
                qqi0Var.m73564k(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = qqi0Var.f191610c;
            if (i == 0) {
                return null;
            }
            obj = ((Reference) qqi0Var.m73565l(i - 1)).get();
        } while (obj == null);
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public void m92756e(e2m0 e2m0Var) {
        Reference referencePoll;
        qqi0 qqi0Var = (qqi0) this.f268897b;
        ReferenceQueue referenceQueue = (ReferenceQueue) this.f268898c;
        do {
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                qqi0Var.m73564k(referencePoll);
            }
        } while (referencePoll != null);
        qqi0Var.m73556b(new WeakReference(e2m0Var, referenceQueue));
    }

    /* JADX INFO: renamed from: f */
    public p9h1 m92757f() {
        int i;
        try {
            k9h1 k9h1VarM69388A = p9h1.m69388A();
            try {
                for (g1h1 g1h1Var : (List) this.f268897b) {
                    kuf1 kuf1Var = g1h1Var.f75621a;
                    int i2 = g1h1Var.f75623c;
                    int i3 = g1h1Var.f75626f;
                    x1h1 x1h1Var = (x1h1) (x1h1.class.equals(x1h1.class) ? x1h1.class.cast(nhg1.f154004a) : (!x1h1.class.equals(g2h1.class) || c3h1.f33687a.f228905a.get()) ? null : x1h1.class.cast(new g2h1(0)));
                    if (x1h1Var == null) {
                        throw new GeneralSecurityException("Passed in configuration cannot be used to parse and serialize proto keysets.");
                    }
                    ynd1 ynd1VarMo57904b = x1h1Var.mo57904b(kuf1Var);
                    Integer numMo41255s = kuf1Var.mo41255s();
                    if (numMo41255s != null && numMo41255s.intValue() != i2) {
                        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                    }
                    m9h1 m9h1VarM66464z = o9h1.m66464z();
                    e9h1 e9h1VarM44041y = g9h1.m44041y();
                    String str = (String) ynd1VarMo57904b.f274437a;
                    e9h1VarM44041y.m52811c();
                    ((g9h1) e9h1VarM44041y.f110458b).m44043A(str);
                    s9f1 s9f1Var = (s9f1) ynd1VarMo57904b.f274438b;
                    e9h1VarM44041y.m52811c();
                    ((g9h1) e9h1VarM44041y.f110458b).m44044B(s9f1Var);
                    q1h1 q1h1Var = (q1h1) ynd1VarMo57904b.f274439c;
                    int i4 = 6;
                    if (q1h1Var.equals(q1h1.f184338c)) {
                        i = 2;
                    } else if (q1h1Var.equals(q1h1.f184339d)) {
                        i = 3;
                    } else if (q1h1Var.equals(q1h1.f184340e)) {
                        i = 4;
                    } else if (q1h1Var.equals(q1h1.f184341f)) {
                        i = 5;
                    } else {
                        if (!q1h1Var.equals(q1h1.f184342g)) {
                            throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(q1h1Var.f184344b));
                        }
                        i = 6;
                    }
                    e9h1VarM44041y.m52811c();
                    ((g9h1) e9h1VarM44041y.f110458b).m44046D(i);
                    m9h1VarM66464z.m52811c();
                    ((o9h1) m9h1VarM66464z.f110458b).m66465A((g9h1) e9h1VarM44041y.m52814g());
                    m9h1VarM66464z.m52811c();
                    ((o9h1) m9h1VarM66464z.f110458b).m66469E(i3);
                    m9h1VarM66464z.m52811c();
                    ((o9h1) m9h1VarM66464z.f110458b).m66466B(i2);
                    t1h1 t1h1Var = (t1h1) ynd1VarMo57904b.f274440d;
                    if (t1h1Var.equals(t1h1.f216271c)) {
                        i4 = 2;
                    } else if (t1h1Var.equals(t1h1.f216272d)) {
                        i4 = 3;
                    } else if (t1h1Var.equals(t1h1.f216273e)) {
                        i4 = 4;
                    } else if (t1h1Var.equals(t1h1.f216274f)) {
                        i4 = 5;
                    } else if (!t1h1Var.equals(t1h1.f216275g)) {
                        if (!t1h1Var.equals(t1h1.f216276h)) {
                            throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(t1h1Var.f216278b));
                        }
                        i4 = 7;
                    }
                    m9h1VarM66464z.m52811c();
                    ((o9h1) m9h1VarM66464z.f110458b).m66470F(i4);
                    o9h1 o9h1Var = (o9h1) m9h1VarM66464z.m52814g();
                    k9h1VarM69388A.m52811c();
                    ((p9h1) k9h1VarM69388A.f110458b).m69391C(o9h1Var);
                    if (g1h1Var.f75624d) {
                        k9h1VarM69388A.m52811c();
                        ((p9h1) k9h1VarM69388A.f110458b).m69390B(i2);
                    }
                }
                return (p9h1) k9h1VarM69388A.m52814g();
            } catch (GeneralSecurityException e) {
                e = e;
                throw new zzwb(e);
            }
        } catch (GeneralSecurityException e2) {
            e = e2;
        }
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        cj8 cj8Var = (cj8) this.f268897b;
        Single singleFirstOrError = ((Observable) ((C1771da) cj8Var.f38519c).invoke()).firstOrError();
        gn80 gn80Var = (gn80) this.f268898c;
        return singleFirstOrError.map(new be41(cj8Var, intent, gn80Var, e301Var, 22)).onErrorReturn(new dc31(gn80Var, cj8Var, intent, e301Var, 23));
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (FrameLayout) this.f268897b;
    }

    /* JADX INFO: renamed from: h */
    public void m92758h(f7h1 f7h1Var) throws GeneralSecurityException {
        i7h1 i7h1Var = new i7h1(f7h1Var.f66684a, f7h1Var.f66685b);
        HashMap map = (HashMap) this.f268897b;
        if (!map.containsKey(i7h1Var)) {
            map.put(i7h1Var, f7h1Var);
            return;
        }
        f7h1 f7h1Var2 = (f7h1) map.get(i7h1Var);
        if (!f7h1Var2.equals(f7h1Var) || !f7h1Var.equals(f7h1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(i7h1Var.toString()));
        }
    }

    /* JADX INFO: renamed from: i */
    public byte[] m92759i() {
        return (byte[]) this.f268898c;
    }

    /* JADX INFO: renamed from: j */
    public byte[] m92760j(byte[] bArr, int i) {
        int i2;
        List listSingletonList;
        byte[] byteArray = BigInteger.valueOf(i).toByteArray();
        int i3 = 12;
        int i4 = 0;
        byte[] bArrM29596S0 = bk5.m29596S0(bk5.m29639x0(0, (byte[]) this.f268898c, 12 - byteArray.length), byteArray);
        byte[] bArrM77584y = ((s9f1) this.f268897b).m77584y();
        int i5 = ocf1.f163921a;
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        if (bArrM77584y.length != 32) {
            throw new IllegalArgumentException();
        }
        if (bArrM29596S0.length != 12) {
            throw new IllegalArgumentException();
        }
        int i6 = 16;
        int[] iArr2 = new int[16];
        int i7 = 0;
        while (true) {
            i2 = 4;
            if (i7 >= 4) {
                break;
            }
            iArr2[i7] = ocf1.m66688a(iArr[i7], 2131181306);
            i7++;
        }
        for (int i8 = 4; i8 < 12; i8++) {
            iArr2[i8] = ocf1.m66691d(bArrM77584y, (i8 - 4) * 4);
        }
        iArr2[12] = 1;
        int i9 = 13;
        for (int i10 = 13; i10 < 16; i10++) {
            iArr2[i10] = ocf1.m66691d(bArrM29596S0, (i10 - 13) * 4);
        }
        int[] iArr3 = new int[16];
        System.arraycopy(iArr2, 0, iArr3, 0, 16);
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i11 = 1;
        int i12 = 0;
        int i13 = length;
        while (i13 > 0) {
            System.arraycopy(iArr3, i4, iArr2, i4, i6);
            iArr2[i3] = i11;
            int i14 = i4;
            while (i14 < 10) {
                ocf1.m66690c(i4, i2, 8, i3, iArr2);
                ocf1.m66690c(1, 5, 9, i9, iArr2);
                ocf1.m66690c(2, 6, 10, 14, iArr2);
                ocf1.m66690c(3, 7, 11, 15, iArr2);
                ocf1.m66690c(0, 5, 10, 15, iArr2);
                ocf1.m66690c(1, 6, 11, 12, iArr2);
                i9 = 13;
                ocf1.m66690c(2, 7, 8, 13, iArr2);
                ocf1.m66690c(3, 4, 9, 14, iArr2);
                i14++;
                i2 = 4;
                i3 = 12;
                i4 = 0;
            }
            int i15 = i2;
            byte[] bArr3 = new byte[64];
            i6 = 16;
            for (int i16 = 0; i16 < 16; i16++) {
                int i17 = iArr2[i16];
                int i18 = i16 * 4;
                bArr3[i18] = (byte) (i17 & 255);
                bArr3[i18 + 1] = (byte) ((i17 >> 8) & 255);
                bArr3[i18 + 2] = (byte) ((i17 >> 16) & 255);
                bArr3[i18 + 3] = (byte) ((i17 >> 24) & 255);
            }
            int i19 = 0;
            for (int i20 = 64; i19 < Math.min(i20, i13); i20 = 64) {
                int i21 = i12 + i19;
                bArr2[i21] = (byte) ocf1.m66688a(bArr3[i19], bArr[i21]);
                i19++;
            }
            i11++;
            i13 -= 64;
            i12 += 64;
            i2 = i15;
            i3 = 12;
            i9 = 13;
            i4 = 0;
        }
        int i22 = length + 12;
        byte[] bArr4 = new byte[i22];
        System.arraycopy(bArrM29596S0, 0, bArr4, 0, 12);
        System.arraycopy(bArr2, 0, bArr4, 12, length);
        int i23 = length < 0 ? 0 : length;
        if (i23 < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i23, " is less than zero.").toString());
        }
        if (i23 == 0) {
            listSingletonList = lau.f131415a;
        } else if (i23 >= i22) {
            listSingletonList = bk5.m29610f1(bArr4);
        } else if (i23 == 1) {
            listSingletonList = Collections.singletonList(Byte.valueOf(bArr4[length + 11]));
        } else {
            ArrayList arrayList = new ArrayList(i23);
            for (int i24 = i22 - i23; i24 < i22; i24++) {
                arrayList.add(Byte.valueOf(bArr4[i24]));
            }
            listSingletonList = arrayList;
        }
        return g6f.m43718e1(listSingletonList);
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: m */
    public boolean mo27680m(Object obj) {
        j3e1 j3e1Var = (j3e1) obj;
        return ((p3e1) ((shq) this.f268898c).f209249e).m69001a(j3e1Var.f108366a.f96822X) && j3e1Var.f108367b;
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        switch (this.f268896a) {
            case 13:
                f0f1 f0f1Var = (f0f1) this.f268897b;
                ev61 ev61Var = (ev61) this.f268898c;
                synchronized (f0f1Var.f64637f) {
                    f0f1Var.f64636e.remove(ev61Var);
                    break;
                }
                return;
            default:
                ((Map) ((yya1) this.f268898c).f277454c).remove((ev61) this.f268897b);
                return;
        }
    }

    public String toString() {
        switch (this.f268896a) {
            case 20:
                p9h1 p9h1VarM92757f = m92757f();
                int i = y2h1.f268619a;
                q9h1 q9h1VarM32055w = cah1.m32055w();
                int iM69392w = p9h1VarM92757f.m69392w();
                q9h1VarM32055w.m52811c();
                ((cah1) q9h1VarM32055w.f110458b).m32056x(iM69392w);
                for (o9h1 o9h1Var : p9h1VarM92757f.m69393x()) {
                    x9h1 x9h1VarM25246w = aah1.m25246w();
                    String strM44047w = o9h1Var.m66472x().m44047w();
                    x9h1VarM25246w.m52811c();
                    ((aah1) x9h1VarM25246w.f110458b).m25249x(strM44047w);
                    int iM66467C = o9h1Var.m66467C();
                    x9h1VarM25246w.m52811c();
                    ((aah1) x9h1VarM25246w.f110458b).m25251z(iM66467C);
                    int iM66468D = o9h1Var.m66468D();
                    x9h1VarM25246w.m52811c();
                    ((aah1) x9h1VarM25246w.f110458b).m25247A(iM66468D);
                    int iM66473y = o9h1Var.m66473y();
                    x9h1VarM25246w.m52811c();
                    ((aah1) x9h1VarM25246w.f110458b).m25250y(iM66473y);
                    aah1 aah1Var = (aah1) x9h1VarM25246w.m52814g();
                    q9h1VarM32055w.m52811c();
                    ((cah1) q9h1VarM32055w.f110458b).m32057y(aah1Var);
                }
                return ((cah1) q9h1VarM32055w.m52814g()).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y3d1(Object obj, Object obj2, boolean z, int i) {
        this.f268896a = i;
        this.f268897b = obj2;
        this.f268898c = obj;
    }

    public y3d1(IBinder iBinder) throws RemoteException {
        this.f268896a = 19;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f268897b = new Messenger(iBinder);
            this.f268898c = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f268898c = new qrf1(iBinder);
            this.f268897b = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            if (strValueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(strValueOf);
            }
            throw new RemoteException();
        }
    }

    public y3d1(kld1 kld1Var) {
        this.f268896a = 18;
        this.f268897b = kld1Var == null ? null : kld1Var.f123875b;
    }

    public y3d1(s9f1 s9f1Var) {
        this.f268896a = 17;
        this.f268897b = s9f1Var;
        int i = ocf1.f163921a;
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        this.f268898c = bArr;
    }

    public /* synthetic */ y3d1(k7h1 k7h1Var) {
        this.f268896a = 21;
        this.f268897b = new HashMap(k7h1Var.f120108a);
        this.f268898c = new HashMap(k7h1Var.f120109b);
    }

    public y3d1(int i) {
        this.f268896a = i;
        switch (i) {
            case 21:
                this.f268897b = new HashMap();
                this.f268898c = new HashMap();
                break;
            default:
                this.f268897b = new qqi0(0, new Reference[16]);
                this.f268898c = new ReferenceQueue();
                break;
        }
    }

    public y3d1(shq shqVar) {
        this.f268896a = 8;
        this.f268898c = shqVar;
        this.f268897b = shqVar.f209248d;
    }
}
