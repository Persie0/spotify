package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.firebase.encoders.EncodingException;
import com.google.protobuf.Timestamp;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.StatsDetailsRequest;
import io.reactivex.rxjava3.functions.Function;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ob31 implements InterfaceC1667ah, lf9, Function, kdl0 {

    /* JADX INFO: renamed from: a */
    public int f163528a;

    /* JADX INFO: renamed from: b */
    public Object f163529b;

    /* JADX INFO: renamed from: c */
    public Object f163530c;

    public ob31(int i) {
        this.f163528a = i;
    }

    @Override // p204p.lf9
    /* JADX INFO: renamed from: a */
    public kf9 mo55701a(d5y d5yVar, long j) {
        long j2;
        long position = d5yVar.getPosition();
        int iMin = (int) Math.min(112800, d5yVar.getLength() - position);
        l2n0 l2n0Var = (l2n0) this.f163530c;
        l2n0Var.m57927O(iMin);
        d5yVar.mo35039i(0, l2n0Var.f129054a, iMin);
        int i = l2n0Var.f129056c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (l2n0Var.m57932a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = l2n0Var.f129054a;
            int i2 = l2n0Var.f129055b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jM67369u = omo0.m67369u(l2n0Var, i2, this.f163528a);
            if (jM67369u != j2) {
                long jM73879b = ((qu71) this.f163529b).m73879b(jM67369u);
                if (jM73879b > j) {
                    return j5 == j2 ? new kf9(-1, jM73879b, position) : new kf9(0, -9223372036854775807L, position + j4);
                }
                if (100000 + jM73879b > j) {
                    return new kf9(0, -9223372036854775807L, position + ((long) i2));
                }
                j5 = jM73879b;
                j4 = i2;
            }
            l2n0Var.m57930R(i3);
            j3 = i3;
        }
        return j5 != j2 ? new kf9(-2, j5, position + j3) : kf9.f122104d;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Optional optional = (Optional) obj;
        h9p h9pVar = (h9p) this.f163529b;
        fmn0 fmn0Var = (fmn0) this.f163530c;
        int i = this.f163528a;
        lw20 lw20Var = ((kw20) h9pVar.f89015c).f126997a;
        if (!h9pVar.f89014b) {
            e5u0 e5u0Var = (!optional.isPresent() || optional.get() == fgz.f69479a) ? e5u0.MONTH : e5u0.WEEK;
            cmn0 cmn0Var = fmn0Var instanceof cmn0 ? (cmn0) fmn0Var : null;
            int i2 = cmn0Var != null ? cmn0Var.f39732a : 0;
            pz41 pz41VarM11435r = StatsDetailsRequest.m11435r();
            pz41VarM11435r.m71688r(e5u0Var);
            pz41VarM11435r.m71687q(i2);
            pz41VarM11435r.m71686m(u3r.m82306a(i));
            pz41VarM11435r.m71689s(tg1.m80715e());
            return lw20Var.m60093c((StatsDetailsRequest) pz41VarM11435r.build()).map(new vaa1(h9pVar, 2));
        }
        oz41 oz41VarM11671r = com.spotify.highlightsstats.data.proto.p076v2.StatsDetailsRequest.m11671r();
        if (fmn0Var instanceof dmn0) {
            wj50.m88279p(oz41VarM11671r);
            Timestamp timestampM80718h = tg1.m80718h(((dmn0) fmn0Var).f50575a);
            if (timestampM80718h != null) {
                oz41VarM11671r.m68617s(timestampM80718h);
            }
        } else {
            if (!(fmn0Var instanceof cmn0)) {
                throw new NoWhenBranchMatchedException();
            }
            oz41VarM11671r.m68615q(((cmn0) fmn0Var).f39732a);
        }
        oz41VarM11671r.m68614m(u3r.m82306a(i));
        oz41VarM11671r.m68616r(tg1.m80715e());
        return lw20Var.m60096f((com.spotify.highlightsstats.data.proto.p076v2.StatsDetailsRequest) oz41VarM11671r.build()).map(new b741(h9pVar, 21));
    }

    @Override // p204p.lf9
    /* JADX INFO: renamed from: b */
    public void mo55702b() {
        l2n0 l2n0Var = (l2n0) this.f163530c;
        byte[] bArr = h0b1.f86201b;
        l2n0Var.getClass();
        l2n0Var.m57928P(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public void m66603c(vw41 vw41Var) {
        int i = this.f163528a;
        int iIdentityHashCode = System.identityHashCode(vw41Var);
        int i2 = -1;
        if (i > 0) {
            int i3 = this.f163528a - 1;
            int i4 = 0;
            while (true) {
                if (i4 > i3) {
                    i2 = -(i4 + 1);
                    break;
                }
                int i5 = (i4 + i3) >>> 1;
                int i6 = ((int[]) this.f163529b)[i5];
                if (i6 < iIdentityHashCode) {
                    i4 = i5 + 1;
                } else if (i6 > iIdentityHashCode) {
                    i3 = i5 - 1;
                } else {
                    zjd1 zjd1Var = ((zjd1[]) this.f163530c)[i5];
                    if (vw41Var == (zjd1Var != null ? zjd1Var.get() : null)) {
                        i2 = i5;
                        break;
                    }
                    int i7 = i5 - 1;
                    while (true) {
                        if (-1 >= i7 || ((int[]) this.f163529b)[i7] != iIdentityHashCode) {
                            i5++;
                            int i8 = this.f163528a;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(this.f163528a + 1);
                                    break;
                                }
                                if (((int[]) this.f163529b)[i5] != iIdentityHashCode) {
                                    i2 = -(i5 + 1);
                                    break;
                                }
                                zjd1 zjd1Var2 = ((zjd1[]) this.f163530c)[i5];
                                if ((zjd1Var2 != null ? zjd1Var2.get() : null) == vw41Var) {
                                    i2 = i5;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            zjd1 zjd1Var3 = ((zjd1[]) this.f163530c)[i7];
                            if ((zjd1Var3 != null ? zjd1Var3.get() : null) == vw41Var) {
                                i2 = i7;
                                break;
                            }
                            i7--;
                        }
                    }
                }
            }
            if (i2 >= 0) {
                return;
            }
        }
        int i9 = -(i2 + 1);
        zjd1[] zjd1VarArr = (zjd1[]) this.f163530c;
        int length = zjd1VarArr.length;
        if (i == length) {
            int i10 = length * 2;
            zjd1[] zjd1VarArr2 = new zjd1[i10];
            int[] iArr = new int[i10];
            int i11 = i9 + 1;
            System.arraycopy(zjd1VarArr, i9, zjd1VarArr2, i11, i - i9);
            System.arraycopy((zjd1[]) this.f163530c, 0, zjd1VarArr2, 0, i9);
            bk5.m29627o0(i11, i9, i, (int[]) this.f163529b, iArr);
            bk5.m29635t0(0, i9, 6, (int[]) this.f163529b, iArr);
            this.f163530c = zjd1VarArr2;
            this.f163529b = iArr;
        } else {
            int i12 = i9 + 1;
            System.arraycopy(zjd1VarArr, i9, zjd1VarArr, i12, i - i9);
            int[] iArr2 = (int[]) this.f163529b;
            bk5.m29627o0(i12, i9, i, iArr2, iArr2);
        }
        ((zjd1[]) this.f163530c)[i9] = new zjd1(vw41Var);
        ((int[]) this.f163529b)[i9] = iIdentityHashCode;
        this.f163528a++;
    }

    /* JADX INFO: renamed from: d */
    public Object m66604d(int i) {
        SparseArray sparseArray = (SparseArray) this.f163529b;
        if (this.f163528a == -1) {
            this.f163528a = 0;
        }
        while (true) {
            int i2 = this.f163528a;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f163528a--;
        }
        while (this.f163528a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f163528a + 1)) {
            this.f163528a++;
        }
        return sparseArray.valueAt(this.f163528a);
    }

    /* JADX INFO: renamed from: e */
    public int[] m66605e() {
        return (int[]) this.f163529b;
    }

    /* JADX INFO: renamed from: f */
    public int m66606f() {
        return this.f163528a;
    }

    /* JADX INFO: renamed from: g */
    public zjd1[] m66607g() {
        return (zjd1[]) this.f163530c;
    }

    /* JADX INFO: renamed from: h */
    public void m66608h(int i) {
        this.f163528a = i;
    }

    /* JADX INFO: renamed from: i */
    public l3f1 m66609i() {
        return (l3f1) l3f1.class.cast(((Map) this.f163529b).get("ConnectionlessLifecycleHelper"));
    }

    /* JADX INFO: renamed from: j */
    public void m66610j(String str, gey geyVar) {
        int i = this.f163528a + 1;
        Object[] objArr = (Object[]) this.f163529b;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Alert.DURATION_SHOW_INDEFINITELY;
            }
            this.f163529b = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.f163529b;
        int i4 = this.f163528a;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = geyVar;
        this.f163528a = i4 + 1;
    }

    /* JADX INFO: renamed from: k */
    public void m66611k(l3f1 l3f1Var) {
        Map map = (Map) this.f163529b;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            StringBuilder sb = new StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
            sb.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        map.put("ConnectionlessLifecycleHelper", l3f1Var);
        if (this.f163528a > 0) {
            new ywh0(Looper.getMainLooper(), 6).post(new wpa1((Object) this, (Object) l3f1Var, false, 11));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m66612l(Bundle bundle) {
        this.f163528a = 1;
        this.f163530c = bundle;
        for (Map.Entry entry : ((Map) this.f163529b).entrySet()) {
            ((l3f1) entry.getValue()).m58005b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX INFO: renamed from: m */
    public byte[] m66613m() {
        tjr0 tjr0Var = tjr0.f220999Y0;
        sef0 sef0Var = (sef0) this.f163529b;
        ((mqw0) this.f163530c).f146375i = false;
        mqw0 mqw0Var = (mqw0) this.f163530c;
        mqw0Var.f146373g = Boolean.FALSE;
        sef0Var.f208284a = new b2h1(mqw0Var);
        try {
            o5h1.m66283a();
            etg1 etg1Var = new etg1(sef0Var);
            ood0 ood0Var = new ood0(3);
            tjr0Var.m80991a(ood0Var);
            HashMap map = new HashMap((HashMap) ood0Var.f167565b);
            HashMap map2 = new HashMap((HashMap) ood0Var.f167566c);
            bdf1 bdf1Var = (bdf1) ood0Var.f167567d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                erf1 erf1Var = new erf1(byteArrayOutputStream, map, map2, bdf1Var);
                amk0 amk0Var = (amk0) map.get(etg1.class);
                if (amk0Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(etg1.class)));
                }
                amk0Var.mo24360a(etg1Var, erf1Var);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m66614n() {
        this.f163528a = 2;
        for (l3f1 l3f1Var : ((Map) this.f163529b).values()) {
            l3f1Var.f129323b = true;
            l3f1Var.m58007d();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m66615o() {
        this.f163528a = 3;
        Iterator it = ((Map) this.f163529b).values().iterator();
        while (it.hasNext()) {
            ((l3f1) it.next()).m58007d();
        }
    }

    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        bfg1 bfg1Var = (bfg1) this.f163529b;
        gxg1 gxg1Var = (gxg1) this.f163530c;
        int i = this.f163528a;
        if (((Boolean) obj).booleanValue()) {
            dxg1 dxg1VarM46093o = gxg1.m46093o(gxg1Var);
            String str = bfg1Var.f26714d;
            dxg1VarM46093o.m38389b();
            ((gxg1) dxg1VarM46093o.f57940b).m46098r(str);
            dxg1VarM46093o.m38389b();
            ((gxg1) dxg1VarM46093o.f57940b).m46099s(str);
            Long l = bfg1Var.f26715e;
            if (l != null) {
                int iLongValue = (int) l.longValue();
                dxg1VarM46093o.m38389b();
                ((gxg1) dxg1VarM46093o.f57940b).m46100t(iLongValue);
            }
            gxg1 gxg1Var2 = (gxg1) dxg1VarM46093o.m38391d();
            int i2 = bfg1Var.f26719i;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            int i4 = i - 1;
            ler0 ler0Var = ler0.f132670b;
            s08 s08Var = (i3 == 0 || i3 != 1) ? new s08(Integer.valueOf(i4), gxg1Var2, ler0Var) : new s08(Integer.valueOf(i4), gxg1Var2, ler0.f132669a);
            bfg1.f26709j.m83848a("analytics event: %s", s08Var);
            hd91 hd91Var = bfg1Var.f26717g;
            if (hd91Var != null) {
                hd91Var.m47180b(s08Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x000c A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public void m66616p(int i, int i2, Intent intent) {
        for (l3f1 l3f1Var : ((Map) this.f163529b).values()) {
            AtomicReference atomicReference = l3f1Var.f129324c;
            yj10 yj10Var = l3f1Var.f129328g;
            AtomicReference atomicReference2 = l3f1Var.f129324c;
            v4f1 v4f1Var = (v4f1) atomicReference.get();
            if (i != 1) {
                if (i == 2) {
                    int iM85679c = l3f1Var.f129326e.m85679c(l3f1Var.m58004a(), vj10.f241853a);
                    if (iM85679c == 0) {
                        atomicReference2.set(null);
                        ywh0 ywh0Var = yj10Var.f273250L0;
                        ywh0Var.sendMessage(ywh0Var.obtainMessage(3));
                    } else if (v4f1Var == null || (v4f1Var.f237144b.f138371b == 18 && iM85679c == 18)) {
                    }
                }
                if (v4f1Var != null) {
                    lzi lziVar = v4f1Var.f237144b;
                    int i3 = v4f1Var.f237143a;
                    atomicReference2.set(null);
                    yj10Var.m93841h(lziVar, i3);
                }
            } else if (i2 == -1) {
                atomicReference2.set(null);
                ywh0 ywh0Var2 = yj10Var.f273250L0;
                ywh0Var2.sendMessage(ywh0Var2.obtainMessage(3));
            } else if (i2 == 0) {
                if (v4f1Var != null) {
                    lzi lziVar2 = new lzi(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, v4f1Var.f237144b.toString());
                    int i4 = v4f1Var.f237143a;
                    atomicReference2.set(null);
                    yj10Var.m93841h(lziVar2, i4);
                }
            } else if (v4f1Var != null) {
                lzi lziVar3 = v4f1Var.f237144b;
                int i5 = v4f1Var.f237143a;
                atomicReference2.set(null);
                yj10Var.m93841h(lziVar3, i5);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [p.gh00, p.qe70] */
    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ci81 ci81Var = (ci81) this.f163529b;
        if (ci81Var.f38252t) {
            return false;
        }
        ?? r5 = ci81Var.f38250h;
        mh81 mh81Var = (mh81) this.f163530c;
        r5.invoke(new di81(mh81Var.f143725a, this.f163528a, mh81Var.f143732h));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m66617r(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f163529b).entrySet()) {
            Bundle bundle2 = new Bundle();
            v4f1 v4f1Var = (v4f1) ((l3f1) entry.getValue()).f129324c.get();
            if (v4f1Var != null) {
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", v4f1Var.m84651a());
                bundle2.putInt("failed_status", v4f1Var.m84652b().f138371b);
                bundle2.putParcelable("failed_resolution", v4f1Var.m84652b().f138372c);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m66618s() {
        this.f163528a = 4;
        Iterator it = ((Map) this.f163529b).values().iterator();
        while (it.hasNext()) {
            ((l3f1) it.next()).m58006c();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m66619t() {
        this.f163528a = 5;
        Iterator it = ((Map) this.f163529b).values().iterator();
        while (it.hasNext()) {
            ((l3f1) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m66620u() {
        Iterator it = ((Map) this.f163529b).values().iterator();
        while (it.hasNext()) {
            ((l3f1) it.next()).getClass();
        }
    }

    public /* synthetic */ ob31(int i, Object obj, Object obj2) {
        this.f163529b = obj;
        this.f163530c = obj2;
        this.f163528a = i;
    }

    public ob31(sef0 sef0Var, int i) {
        this.f163530c = new mqw0();
        this.f163529b = sef0Var;
        o5h1.m66283a();
        this.f163528a = i;
    }

    public ob31(int i, boolean z) {
        switch (i) {
            case 6:
                this.f163529b = new Object[8];
                this.f163528a = 0;
                break;
            case 7:
            default:
                this.f163529b = new int[16];
                this.f163530c = new zjd1[16];
                break;
            case 8:
                this.f163529b = Collections.synchronizedMap(new uj5(0));
                this.f163528a = 0;
                break;
        }
    }
}
