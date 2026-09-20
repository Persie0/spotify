package p204p;

import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.performancesdk.observationplatform.proto.ObservationPlatformProto$Point;
import com.spotify.performancesdk.observationplatform.proto.ObservationPlatformProto$TimeSeries;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kjg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f123364a;

    /* JADX INFO: renamed from: b */
    public static sd40 f123365b;

    /* JADX INFO: renamed from: a */
    public static final void m56578a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-1994610532);
        int i2 = i | 6 | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.queue_header_add_songs_button_label, xq00Var);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            peu peuVar = new peu(new t40(strM54977L), eh00Var);
            rgu rguVarM75488a = vvx.m86517r(xq00Var).m75488a();
            fyf fyfVar = jng.f114103a;
            cxh0 cxh0Var = cxh0.f43038a;
            xq00Var2 = xq00Var;
            dyu.m37375g(peuVar, cxh0Var, null, rguVarM75488a, null, null, fyfVar, xq00Var2, 12582960, 116);
            fxh0Var = cxh0Var;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var, eh00Var, i, 26);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m56579b(int i, int i2, eh00 eh00Var, xq00 xq00Var, boolean z) {
        int i3;
        xq00Var.m91775k0(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
        } else {
            if (i4 != 0) {
                z = true;
            }
            kqi0 kqi0VarM77651H = sam.m77651H(eh00Var, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = new ii8(kqi0VarM77651H, z);
                xq00Var.m91793t0(objM91750T);
            }
            ii8 ii8Var = (ii8) objM91750T;
            boolean z2 = (i3 & 14) == 4;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new gi8(ii8Var, z);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49245q((eh00) objM91750T2, xq00Var);
            c7l0 c7l0VarM35772a = dea0.m35772a(xq00Var);
            if (c7l0VarM35772a == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            b7l0 b7l0VarMo31751N = c7l0VarM35772a.mo31751N();
            hc80 hc80Var = (hc80) xq00Var.m91774k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zM91770i = xq00Var.m91770i(b7l0VarMo31751N) | xq00Var.m91770i(hc80Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == ia7Var) {
                objM91750T3 = new vy5(b7l0VarMo31751N, hc80Var, ii8Var, 7);
                xq00Var.m91793t0(objM91750T3);
            }
            hz40.m49232d(hc80Var, b7l0VarMo31751N, (gh00) objM91750T3, xq00Var);
        }
        boolean z3 = z;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hi8(i, i2, 0, eh00Var, z3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m56580c(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        eh00 eh00Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1997800706);
        int i2 = i | 6 | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            m56584g(R.string.queue_group_session_header_end_session_button, R.string.queue_header_end_session_button_label, (i2 << 6) & 8064, eh00Var2, xq00Var2, cxh0Var);
            fxh0Var = cxh0Var;
        } else {
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var, eh00Var2, i, 27);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m56581d(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        eh00 eh00Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(1620629850);
        int i2 = i | 6 | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            m56584g(R.string.queue_group_session_header_leave_session_button, R.string.queue_header_leave_session_button_label, (i2 << 6) & 8064, eh00Var2, xq00Var2, cxh0Var);
            fxh0Var = cxh0Var;
        } else {
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var, eh00Var2, i, 28);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m56582e(fv41 fv41Var, fyf fyfVar, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, th00 th00Var, th00 th00Var2, th00 th00Var3, float f, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        fxh0 fxh0Var3;
        xq00Var.m91775k0(1445567512);
        int i2 = i | (xq00Var.m91770i(fv41Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var2) ? 2048 : 1024) | 24576 | (xq00Var.m91760d(f) ? 67108864 : 33554432);
        if (xq00Var.m91752Y(i2 & 1, (38347923 & i2) != 38347922)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                fxh0Var3 = cxh0.f43038a;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var;
            }
            xq00Var.m91790s();
            y0v.m92603a(2, rkk.m75772x(-1326882036, new xqb0(fv41Var, fxh0Var3, f, eh00Var2, eh00Var, th00Var2, th00Var3, fyfVar, th00Var), xq00Var), xq00Var, 390, 2);
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xqb0(fv41Var, fyfVar, eh00Var, eh00Var2, fxh0Var2, th00Var, th00Var2, th00Var3, f, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m56583f(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-508285086);
        int i2 = i | 6 | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61824h = mi21.m61824h(32, cxh0Var);
            String strM54977L = k0e1.m54977L(R.string.queue_header_settings_button_label, xq00Var);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            riw0.m75607a(new peu(new t40(strM54977L), eh00Var), ugu.f230259c, fxh0VarM61824h, null, vvx.m86517r(xq00Var), null, false, null, null, jng.f114104b, xq00Var, 0, 6, 984);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var2, eh00Var, i, 29);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m56584g(int i, int i2, int i3, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        int i4;
        xq00Var.m91775k0(2143283814);
        if ((i3 & 6) == 0) {
            i4 = (xq00Var.m91762e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= xq00Var.m91762e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= xq00Var.m91770i(eh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i4 & 1, (i4 & 1171) != 1170)) {
            fxh0 fxh0VarM61824h = mi21.m61824h(32, fxh0Var);
            String strM54977L = k0e1.m54977L(i2, xq00Var);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            peu peuVar = new peu(new t40(strM54977L), eh00Var);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = zo50.f284678X;
                xq00Var.m91793t0(objM91750T);
            }
            th00 th00Var = (th00) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = zo50.f284680Y;
                xq00Var.m91793t0(objM91750T2);
            }
            dyu.m37371c(peuVar, new sgu(0, th00Var, (th00) objM91750T2, null, null, 25), fxh0VarM61824h, null, vvx.m86517r(xq00Var), null, null, null, null, null, rkk.m75772x(1037651975, new e920(i, 9, false), xq00Var), xq00Var, 0, 48, 2008);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new g660(i, i2, fxh0Var, eh00Var, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m56585h(th00 th00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1108393533);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(th00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0.f43038a);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fr0.m42474r(1.0f, true, xq00Var);
            if (th00Var == null) {
                xq00Var.m91771i0(739991382);
            } else {
                ms2.m62691p(xq00Var, 739991383, 0, th00Var, xq00Var);
            }
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zmj(i, 1, th00Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m56586i(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = klh.m56829a(uuidArr.length, 16, 4, length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: j */
    public static final byte m56587j(char c) {
        if (c < '~') {
            return stc.f213884b[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: k */
    public static int m56588k(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(s571.m77246e(i, "Invalid rotation: "));
    }

    /* JADX INFO: renamed from: l */
    public static ceb1 m56589l(w1t0 w1t0Var) {
        return w1t0Var.f247179b.size() == 0 ? ceb1.f37074b : new ceb1(w1t0Var.f247179b);
    }

    /* JADX INFO: renamed from: m */
    public static final gva m56590m(List list) {
        mok0 mok0VarM17343o = ObservationPlatformProto$TimeSeries.m17343o();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vbf0 vbf0Var = (vbf0) it.next();
            jok0 jok0VarM17335q = ObservationPlatformProto$Point.m17335q();
            vbf0Var.getClass();
            jok0VarM17335q.m53889r(0.0d);
            jok0VarM17335q.m53888q(0L);
            arrayList.add((ObservationPlatformProto$Point) jok0VarM17335q.build());
        }
        mok0VarM17343o.m62407m(arrayList);
        return ((ObservationPlatformProto$TimeSeries) mok0VarM17343o.build()).toByteString();
    }

    /* JADX INFO: renamed from: n */
    public static final di41 m56591n(xuk xukVar, ez4 ez4Var) {
        juk jukVarMo31960M = xukVar.mo31960M();
        int i = e1b1.f55173b;
        luk lukVar = (luk) jukVarMo31960M.mo26595B(luk.f137098b);
        return (lukVar == null || lukVar.equals(xsr.f265652b)) ? x0h1.m89577t(xukVar, xsr.f265652b, 4, ez4Var) : x0h1.m89577t(kk40.m56661c(new wjq(xukVar.mo31960M())), new xjq(lukVar), 4, ez4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.l2n0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX INFO: renamed from: o */
    public static t0h1 m56592o(byte[] bArr) {
        ?? r7;
        ?? l2n0Var = new l2n0(bArr);
        if (l2n0Var.f129056c < 32) {
            return null;
        }
        l2n0Var.m57930R(0);
        int iM57932a = l2n0Var.m57932a();
        int iM57945q = l2n0Var.m57945q();
        if (iM57945q != iM57932a) {
            yif1.m93819w0("Advertised atom size (" + iM57945q + ") does not match buffer size: " + iM57932a);
            return null;
        }
        int iM57945q2 = l2n0Var.m57945q();
        if (iM57945q2 != 1886614376) {
            ei6.m39077n(iM57945q2, "Atom type is not pssh: ");
            return null;
        }
        int iM61747e = mha.m61747e(l2n0Var.m57945q());
        if (iM61747e > 1) {
            ei6.m39077n(iM61747e, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(l2n0Var.m57953y(), l2n0Var.m57953y());
        if (iM61747e == 1) {
            int iM57921I = l2n0Var.m57921I();
            UUID[] uuidArr = new UUID[iM57921I];
            for (int i = 0; i < iM57921I; i++) {
                uuidArr[i] = new UUID(l2n0Var.m57953y(), l2n0Var.m57953y());
            }
            r7 = uuidArr;
        } else {
            r7 = 0;
        }
        int iM57921I2 = l2n0Var.m57921I();
        int iM57932a2 = l2n0Var.m57932a();
        if (iM57921I2 == iM57932a2) {
            ?? r6 = new byte[iM57921I2];
            l2n0Var.m57943o(0, r6, iM57921I2);
            return new t0h1(uuid, iM61747e, (Serializable) r6, (Serializable) r7, 21);
        }
        yif1.m93819w0("Atom data size (" + iM57921I2 + ") does not match the bytes left: " + iM57932a2);
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m56593p(UUID uuid, byte[] bArr) {
        t0h1 t0h1VarM56592o = m56592o(bArr);
        if (t0h1VarM56592o == null) {
            return null;
        }
        UUID uuid2 = (UUID) t0h1VarM56592o.f215890c;
        if (uuid.equals(uuid2)) {
            return (byte[]) t0h1VarM56592o.f215891d;
        }
        yif1.m93819w0("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static void m56594q(AbstractC1888g8 abstractC1888g8, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = abstractC1888g8.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final String m56595r(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: s */
    public static final Next m56596s(yej0 yej0Var, vej0 vej0Var) {
        if (vej0Var instanceof sej0) {
            return Next.m15605a(Effects.m15571a(new nej0((gmr0) yej0Var.f272002a.mo49283h(), (String) yej0Var.f272003b.mo49278b())));
        }
        if (vej0Var instanceof rej0) {
            rej0 rej0Var = (rej0) vej0Var;
            return Next.m15605a(Effects.m15571a(new mej0(rej0Var.f198374a, rej0Var.f198375b)));
        }
        if (vej0Var instanceof tej0) {
            hzq0 hzq0VarM92201d = xul0.m92201d(((tej0) vej0Var).f219717a);
            xul0 xul0Var = yej0Var.f272003b;
            yej0Var.getClass();
            return Next.m15606h(new yej0(hzq0VarM92201d, xul0Var));
        }
        if (vej0Var instanceof uej0) {
            hzq0 hzq0VarM92201d2 = xul0.m92201d(((uej0) vej0Var).f229548a);
            xul0 xul0Var2 = yej0Var.f272002a;
            yej0Var.getClass();
            return Next.m15606h(new yej0(xul0Var2, hzq0VarM92201d2));
        }
        if (!(vej0Var instanceof qej0)) {
            throw new NoWhenBranchMatchedException();
        }
        qej0 qej0Var = (qej0) vej0Var;
        return Next.m15605a(Effects.m15571a(new oej0(qej0Var.f187950a, qej0Var.f187951b, qej0Var.f187952c)));
    }

    /* JADX INFO: renamed from: t */
    public static void m56597t(AbstractC2329r8 abstractC2329r8, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(abstractC2329r8.mo38300b().size());
        for (Map.Entry entry : abstractC2329r8.mo38300b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
