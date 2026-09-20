package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzrt;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.zip.ZipFile;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class f7d1 implements Function, gv51, feu, r9w0, aig1, r7l0 {

    /* JADX INFO: renamed from: e */
    public static Timer f66656e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66657a;

    /* JADX INFO: renamed from: b */
    public Object f66658b;

    /* JADX INFO: renamed from: c */
    public Object f66659c;

    /* JADX INFO: renamed from: d */
    public Object f66660d;

    public /* synthetic */ f7d1(int i) {
        this.f66657a = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static final Object m40966m(f7d1 f7d1Var, List list, ibk ibkVar) {
        ymg1 ymg1Var;
        Iterator it;
        if (ibkVar instanceof ymg1) {
            ymg1Var = (ymg1) ibkVar;
            int i = ymg1Var.f274263d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ymg1Var.f274263d = i - Integer.MIN_VALUE;
            } else {
                ymg1Var = new ymg1(f7d1Var, ibkVar);
            }
        } else {
            ymg1Var = new ymg1(f7d1Var, ibkVar);
        }
        Object obj = ymg1Var.f274261b;
        int i2 = ymg1Var.f274263d;
        if (i2 == 0) {
            bga.m29073P(obj);
            it = g6f.m43740p1(list, 20, 20).iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = ymg1Var.f274260a;
            bga.m29073P(obj);
        }
        while (it.hasNext()) {
            List list2 = (List) it.next();
            ymg1Var.f274260a = it;
            ymg1Var.f274263d = 1;
            Object objM40977q = f7d1Var.m40977q(list2, ymg1Var);
            Object obj2 = yuk.f276404a;
            if (objM40977q == obj2) {
                return obj2;
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.feu
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ feu mo40967a(Class cls, amk0 amk0Var) {
        ((HashMap) this.f66658b).put(cls, amk0Var);
        ((HashMap) this.f66659c).remove(cls);
        return this;
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        ev61 ev61Var = (ev61) obj2;
        lkf1 lkf1Var = (lkf1) this.f66660d;
        String str = (String) this.f66658b;
        String str2 = (String) this.f66659c;
        ig31.m50508z("Not connected to device", lkf1Var.m59260k());
        gbf1 gbf1Var = (gbf1) ((cbh1) obj).m37438q();
        j45 j45VarM44803n = gif1.m44803n();
        Parcel parcelM43604d2 = gbf1Var.m43604d2();
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeString(str2);
        int i = fmf1.f71041a;
        parcelM43604d2.writeInt(0);
        fmf1.m42107b(parcelM43604d2, j45VarM44803n);
        gbf1Var.m43607g2(14, parcelM43604d2);
        synchronized (lkf1Var.f134359s) {
            try {
                if (lkf1Var.f134356p != null) {
                    lkf1Var.m59261l(2477);
                }
                lkf1Var.f134356p = ev61Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f66657a) {
            case 0:
                return ((Transport) obj).callSingle((String) this.f66658b, (String) this.f66659c, (byte[]) this.f66660d).toObservable();
            default:
                if (((Boolean) obj).booleanValue()) {
                    return Single.just(ole1.f166834a);
                }
                vle1 vle1Var = (vle1) this.f66660d;
                return vjf1.m85770t(vle1Var.f242472j, new qt81(vle1Var, (String) this.f66658b, (String) this.f66659c, (fbk) null, 23)).map(hkr0.f92489Y0);
        }
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: b */
    public int mo24457b(long j) {
        long[] jArr = (long[]) this.f66660d;
        int iM46301b = h0b1.m46301b(jArr, j, false);
        if (iM46301b < jArr.length) {
            return iM46301b;
        }
        return -1;
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: c */
    public List mo24458c(long j) {
        List list = (List) this.f66658b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.f66659c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                kpd1 kpd1Var = (kpd1) list.get(i);
                b0m b0mVar = kpd1Var.f125037a;
                if (b0mVar.f21971e == -3.4028235E38f) {
                    arrayList2.add(kpd1Var);
                } else {
                    arrayList.add(b0mVar);
                }
            }
        }
        Collections.sort(arrayList2, new iw31(3));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            a0m a0mVarM27841a = ((kpd1) arrayList2.get(i3)).f125037a.m27841a();
            a0mVarM27841a.f11107e = (-1) - i3;
            a0mVarM27841a.f11108f = 1;
            arrayList.add(a0mVarM27841a.m24368a());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m40968d(ibk ibkVar) {
        cud1 cud1Var;
        if (ibkVar instanceof cud1) {
            cud1Var = (cud1) ibkVar;
            int i = cud1Var.f42099c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cud1Var.f42099c = i - Integer.MIN_VALUE;
            } else {
                cud1Var = new cud1(this, ibkVar);
            }
        } else {
            cud1Var = new cud1(this, ibkVar);
        }
        Object objM42936z = cud1Var.f42097a;
        int i2 = cud1Var.f42099c;
        if (i2 == 0) {
            bga.m29073P(objM42936z);
            if (Build.VERSION.SDK_INT >= 26 && ((ai5) this.f66658b).m26058b()) {
                fw40 fw40Var = (fw40) this.f66660d;
                cud1Var.f42099c = 1;
                objM42936z = fw40Var.m42936z();
                Object obj = yuk.f276404a;
                if (objM42936z == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM42936z);
        boolean z = ((Boolean) objM42936z).booleanValue() ? false : true;
        return Boolean.valueOf(z);
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: e */
    public long mo24459e(int i) {
        long[] jArr = (long[]) this.f66660d;
        c95.m31843i(i >= 0);
        c95.m31843i(i < jArr.length);
        return jArr[i];
    }

    @Override // p204p.gv51
    /* JADX INFO: renamed from: f */
    public int mo24460f() {
        return ((long[]) this.f66660d).length;
    }

    /* JADX INFO: renamed from: g */
    public void m40969g(String str, d850 d850Var) {
        Context context = (Context) this.f66658b;
        if (bm51.m29803n0(str, "spotify:", false)) {
            ((z9j0) this.f66660d).mo63651f(new p6j0(str, "", false, false, 0, 0, false, null, null, d850Var != null ? new n6j0(d850Var) : null));
        } else if (wl51.m88496t0(str, "play.google.com", false)) {
            jfg1.m53193p(context, str);
        } else {
            jfg1.m53194q(context, str);
        }
    }

    @Override // p204p.aig1
    /* JADX INFO: renamed from: h */
    public void mo26099h(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = (HashSet) this.f66658b;
        ypg1 ypg1Var = (ypg1) this.f66660d;
        tif1 tif1Var = (tif1) this.f66659c;
        HashSet hashSet3 = new HashSet();
        ypg1Var.m94305c(tif1Var, hashSet, new g7d1(hashSet3, tif1Var, zipFile, 12));
        hashSet2.addAll(hashSet3);
    }

    /* JADX INFO: renamed from: i */
    public sqg1 m40970i() {
        return (sqg1) this.f66658b;
    }

    /* JADX INFO: renamed from: j */
    public void m40971j(Throwable th) {
        wqf1 wqf1Var = (wqf1) this.f66660d;
        if (th instanceof TimeoutException) {
            wqf1Var.m88747Z(102, 28, esf1.f62356C);
            mmf1.m62315i("BillingClientTesting");
        } else {
            wqf1Var.m88747Z(95, 28, esf1.f62356C);
            mmf1.m62315i("BillingClientTesting");
        }
        ((nhy0) this.f66659c).run();
    }

    /* JADX INFO: renamed from: k */
    public pqg1 m40972k() {
        return (pqg1) this.f66659c;
    }

    /* JADX INFO: renamed from: l */
    public sqg1 m40973l() {
        return (sqg1) this.f66660d;
    }

    /* JADX INFO: renamed from: n */
    public l7f1 m40974n() throws GeneralSecurityException {
        f9f1 f9f1VarM74854a;
        if (((f7f1) this.f66658b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f66659c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        f7f1 f7f1Var = (f7f1) this.f66658b;
        int i = f7f1Var.f66672a;
        if (iBitLength != i) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(i);
            throw new GeneralSecurityException(sb.toString());
        }
        d7f1 d7f1Var = f7f1Var.f66674c;
        d7f1 d7f1Var2 = d7f1.f46189f;
        if (d7f1Var != d7f1Var2 && ((Integer) this.f66660d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (d7f1Var == d7f1Var2 && ((Integer) this.f66660d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (d7f1Var == d7f1Var2) {
            f9f1VarM74854a = r6h1.f196279a;
        } else if (d7f1Var == d7f1.f46188e || d7f1Var == d7f1.f46187d) {
            f9f1VarM74854a = r6h1.m74854a(((Integer) this.f66660d).intValue());
        } else {
            if (d7f1Var != d7f1.f46186c) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((f7f1) this.f66658b).f66674c)));
            }
            f9f1VarM74854a = r6h1.m74855b(((Integer) this.f66660d).intValue());
        }
        return new l7f1((f7f1) this.f66658b, (BigInteger) this.f66659c, f9f1VarM74854a, (Integer) this.f66660d);
    }

    /* JADX INFO: renamed from: o */
    public fbh1 m40975o() throws GeneralSecurityException {
        f9f1 f9f1VarM74854a;
        xah1 xah1Var = (xah1) this.f66658b;
        if (xah1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f66659c;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        e4h1.m37772a(eCPoint, xah1Var.f259692b.f218615b.getCurve());
        wah1 wah1Var = ((xah1) this.f66658b).f259694d;
        wah1 wah1Var2 = wah1.f249534f;
        if (wah1Var != wah1Var2 && ((Integer) this.f66660d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (wah1Var == wah1Var2 && ((Integer) this.f66660d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (wah1Var == wah1Var2) {
            f9f1VarM74854a = r6h1.f196279a;
        } else if (wah1Var == wah1.f249533e || wah1Var == wah1.f249532d) {
            f9f1VarM74854a = r6h1.m74854a(((Integer) this.f66660d).intValue());
        } else {
            if (wah1Var != wah1.f249531c) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((xah1) this.f66658b).f259694d.f249536b));
            }
            f9f1VarM74854a = r6h1.m74855b(((Integer) this.f66660d).intValue());
        }
        return new fbh1((xah1) this.f66658b, (ECPoint) this.f66659c, f9f1VarM74854a, (Integer) this.f66660d);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        ntx0 ntx0Var = (ntx0) this.f66659c;
        String str = (String) this.f66658b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f66660d;
        synchronized (ntx0Var.f158447a) {
            ntx0Var.f158447a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX INFO: renamed from: p */
    public cog1 m40976p() {
        return new cog1(new dnc(this, (fbk) null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: q */
    public Object m40977q(List list, ibk ibkVar) {
        cng1 cng1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        bnd1 bnd1Var = (bnd1) this.f66658b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof cng1) {
            cng1Var = (cng1) ibkVar;
            int i = cng1Var.f40020d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cng1Var.f40020d = i - Integer.MIN_VALUE;
            } else {
                cng1Var = new cng1(this, ibkVar);
            }
        } else {
            cng1Var = new cng1(this, ibkVar);
        }
        Object objM85035g = cng1Var.f40018b;
        yuk yukVar = yuk.f276404a;
        int i2 = cng1Var.f40020d;
        if (i2 == 0) {
            bga.m29073P(objM85035g);
            kdf1 kdf1VarM58737y = ldf1.m58737y();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                omg1 omg1Var = (omg1) it.next();
                try {
                    String str = omg1Var.f167033a;
                    a0h1 a0h1Var = f0h1.f64653c;
                    a0h1Var.getClass();
                    try {
                        CharSequence charSequenceM40484c = a0h1Var.m40484c(str);
                        arrayList2 = arrayList3;
                        try {
                            try {
                                int length = (int) (((((long) a0h1Var.f64655a.f256595d) * ((long) charSequenceM40484c.length())) + 7) / 8);
                                byte[] bArr = new byte[length];
                                int iM24364g = a0h1Var.m24364g(bArr, charSequenceM40484c);
                                if (iM24364g != length) {
                                    byte[] bArr2 = new byte[iM24364g];
                                    System.arraycopy(bArr, 0, bArr2, 0, iM24364g);
                                    bArr = bArr2;
                                }
                                igf1 igf1VarM50515y = igf1.m50515y(bArr);
                                int iM50518B = igf1VarM50515y.m50518B();
                                int i3 = iM50518B - 1;
                                if (iM50518B == 0) {
                                    throw null;
                                }
                                if (i3 == 0) {
                                    jdf1 jdf1VarM50519w = igf1VarM50515y.m50519w();
                                    kdf1VarM58737y.m52811c();
                                    ((ldf1) kdf1VarM58737y.f110458b).m58741z(jdf1VarM50519w);
                                } else if (i3 == 1) {
                                    qdf1 qdf1VarM50520x = igf1VarM50515y.m50520x();
                                    kdf1VarM58737y.m52811c();
                                    ((ldf1) kdf1VarM58737y.f110458b).m58738A(qdf1VarM50520x);
                                } else if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                arrayList2.add(omg1Var);
                                arrayList3 = arrayList2;
                            } catch (zzrt e) {
                                e = e;
                                throw new IllegalArgumentException(e);
                            }
                        } catch (Exception unused) {
                            continue;
                        }
                    } catch (zzrt e2) {
                        e = e2;
                        arrayList2 = arrayList3;
                    }
                } catch (Exception unused2) {
                    arrayList2 = arrayList3;
                }
            }
            ArrayList arrayList4 = arrayList3;
            if (((ldf1) kdf1VarM58737y.f110458b).m58740x() + ((ldf1) kdf1VarM58737y.f110458b).m58739w() != 0) {
                try {
                    va91 va91Var = (va91) this.f66659c;
                    ldf1 ldf1Var = (ldf1) kdf1VarM58737y.m52814g();
                    cng1Var.f40017a = arrayList4;
                    cng1Var.f40020d = 1;
                    objM85035g = va91Var.m85035g(ldf1Var, cng1Var);
                    if (objM85035g == yukVar) {
                        return yukVar;
                    }
                    arrayList = arrayList4;
                } catch (Exception unused3) {
                    arrayList = arrayList4;
                    bnd1Var.m29963g(arrayList);
                }
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList = cng1Var.f40017a;
        try {
            bga.m29073P(objM85035g);
        } catch (Exception unused4) {
            bnd1Var.m29963g(arrayList);
        }
        if (((Boolean) objM85035g).booleanValue()) {
            synchronized (jmg1.class) {
                try {
                    jmg1 jmg1Var = (jmg1) bnd1Var.f28810a;
                    if (jmg1Var != null) {
                        jmg1Var.m53782f(arrayList);
                    }
                } catch (Exception unused5) {
                }
            }
        }
        return w2a1Var;
    }

    public String toString() {
        switch (this.f66657a) {
            case 11:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f66658b);
                sb.append('{');
                yya1 yya1Var = (yya1) ((yya1) this.f66659c).f277454c;
                String str = "";
                while (yya1Var != null) {
                    Object obj = yya1Var.f277453b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    yya1Var = (yya1) yya1Var.f277454c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f7d1(Object obj, Object obj2, Object obj3, int i) {
        this.f66657a = i;
        this.f66658b = obj;
        this.f66659c = obj2;
        this.f66660d = obj3;
    }

    public /* synthetic */ f7d1(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f66657a = i;
        this.f66660d = obj;
        this.f66658b = obj2;
        this.f66659c = obj3;
    }

    public /* synthetic */ f7d1(ntx0 ntx0Var, String str, ScheduledFuture scheduledFuture) {
        this.f66657a = 18;
        this.f66659c = ntx0Var;
        this.f66658b = str;
        this.f66660d = scheduledFuture;
    }

    public f7d1() {
        this.f66657a = 9;
        this.f66658b = new HashMap();
        this.f66659c = new HashMap();
        this.f66660d = bdf1.f26094c;
    }

    public f7d1(va91 va91Var, okj0 okj0Var, bnd1 bnd1Var) {
        this.f66657a = 16;
        this.f66659c = va91Var;
        this.f66660d = okj0Var;
        this.f66658b = bnd1Var;
        if (f66656e == null) {
            Timer timer = new Timer();
            f66656e = timer;
            timer.schedule(new xhc1(this, 2), 30000L, 30000L);
        }
    }

    public f7d1(String str) {
        this.f66657a = 11;
        yya1 yya1Var = new yya1(20);
        this.f66659c = yya1Var;
        this.f66660d = yya1Var;
        this.f66658b = str;
    }

    public f7d1(xre xreVar, hv31 hv31Var) {
        this.f66657a = 1;
        this.f66658b = hv31Var;
        this.f66659c = xreVar;
        this.f66660d = fv31.f73628b.m78181M("watch_feed_app_in_background_timestamp");
    }

    public f7d1(ArrayList arrayList) {
        this.f66657a = 2;
        this.f66658b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f66659c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            kpd1 kpd1Var = (kpd1) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.f66659c;
            jArr[i2] = kpd1Var.f125038b;
            jArr[i2 + 1] = kpd1Var.f125039c;
        }
        long[] jArr2 = (long[]) this.f66659c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f66660d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
