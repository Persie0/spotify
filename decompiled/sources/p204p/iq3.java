package p204p;

import android.app.Activity;
import android.content.Intent;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$RelationsUsernameResponse;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$UsernameUser;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class iq3 implements Function, i5w0, BiFunction, vd50, Init, if11, yh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104621a;

    public /* synthetic */ iq3(int i) {
        this.f104621a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m51319c(float[] fArr, zsd1 zsd1Var) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = zsd1Var.f285925a;
        float f8 = zsd1Var.f285926b;
        float f9 = 1;
        float f10 = (f9 - f) / f2;
        float f11 = (f9 - f3) / f4;
        float f12 = (f9 - f5) / f6;
        float f13 = (f9 - f7) / f8;
        float f14 = f / f2;
        float f15 = (f3 / f4) - f14;
        float f16 = (f7 / f8) - f14;
        float f17 = f11 - f10;
        float f18 = (f5 / f6) - f14;
        float f19 = (((f13 - f10) * f15) - (f16 * f17)) / (((f12 - f10) * f15) - (f17 * f18));
        float f20 = (f16 - (f18 * f19)) / f15;
        float f21 = (1.0f - f20) - f19;
        float f22 = f21 / f2;
        float f23 = f20 / f4;
        float f24 = f19 / f6;
        return new float[]{f22 * f, f21, ((1.0f - f) - f2) * f22, f23 * f3, f20, ((1.0f - f3) - f4) * f23, f24 * f5, f19, ((1.0f - f5) - f6) * f24};
    }

    /* JADX INFO: renamed from: d */
    public static final d2s m51320d(y491 y491Var) {
        double d = y491Var.f269102a;
        if (d == -3.0d) {
            return new vdx0(y491Var, 6);
        }
        if (d == -2.0d) {
            return new vdx0(y491Var, 7);
        }
        return (y491Var.f269107f == 0.0d && y491Var.f269108g == 0.0d) ? new vdx0(y491Var, 0) : new vdx0(y491Var, 1);
    }

    /* JADX INFO: renamed from: e */
    public static final d2s m51321e(y491 y491Var) {
        double d = y491Var.f269102a;
        if (d == -3.0d) {
            return new vdx0(y491Var, 2);
        }
        if (d == -2.0d) {
            return new vdx0(y491Var, 3);
        }
        return (y491Var.f269107f == 0.0d && y491Var.f269108g == 0.0d) ? new vdx0(y491Var, 4) : new vdx0(y491Var, 5);
    }

    /* JADX INFO: renamed from: f */
    public static final Integer m51322f(zh11 zh11Var) {
        return bm51.m29807r0(wl51.m88469S0(zh11Var.f282767b, "customshortcut-lastvisitedpage-"));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079 A[LOOP:1: B:23:0x0048->B:29:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final boolean m51323g(float[] fArr, zsd1 zsd1Var, d2s d2sVar, d2s d2sVar2, float f, float f2, int i) {
        wdx0 wdx0Var;
        double d;
        if (i == 0) {
            return true;
        }
        float[] fArr2 = c9f.f35490a;
        float[] fArr3 = c9f.f35490a;
        if (fArr != fArr3) {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (Float.compare(fArr[i2], fArr3[i2]) == 0 || Math.abs(fArr[i2] - fArr3[i2]) <= 0.001f) {
                }
            }
            if (fgg1.m41602q(zsd1Var, q0f1.f184001e)) {
                float[] fArr4 = c9f.f35490a;
                wdx0Var = c9f.f35494e;
                for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(d2sVar.mo34792b(d) - wdx0Var.f250370k.mo34792b(d)) <= 0.001d) {
                        if (Math.abs(d2sVar2.mo34792b(d) - wdx0Var.f250373n.mo34792b(d)) <= 0.001d) {
                        }
                    }
                    return false;
                }
                return true;
            }
        } else if (fgg1.m41602q(zsd1Var, q0f1.f184001e) && f == 0.0f && f2 == 1.0f) {
            float[] fArr5 = c9f.f35490a;
            wdx0Var = c9f.f35494e;
            while (d <= 1.0d) {
                if (Math.abs(d2sVar.mo34792b(d) - wdx0Var.f250370k.mo34792b(d)) <= 0.001d) {
                    if (Math.abs(d2sVar2.mo34792b(d) - wdx0Var.f250373n.mo34792b(d)) <= 0.001d) {
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final void m51324h(float f, float f2, float[] fArr) {
        float fM51329m = m51329m(fArr);
        float[] fArr2 = c9f.f35490a;
        if (fM51329m / m51329m(c9f.f35491b) > 0.9f) {
            float[] fArr3 = c9f.f35490a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            float f6 = fArr[3];
            float f7 = fArr[4];
            float f8 = fArr[5];
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m51325i(Throwable th) {
        Logger.m3967c(th, "Failed to listen for offline errors.", new Object[0]);
    }

    /* JADX INFO: renamed from: j */
    public static final List m51326j(List list) {
        float f = x9z0.f259478h;
        int iM38547C = edb.m38547C(2);
        if (iM38547C == 0) {
            return list;
        }
        if (iM38547C == 1) {
            return g6f.m43704R0(list);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public static final HashSet m51327k(List list) {
        HashSet hashSet = new HashSet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((zh11) it.next()).f282770e.toString().toLowerCase(Locale.ROOT));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: l */
    public static final float[] m51328l(float[] fArr) {
        float[] fArr2 = new float[6];
        if (fArr.length != 9) {
            bk5.m29637v0(fArr, fArr2, 6);
            return fArr2;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = f + f2 + fArr[2];
        fArr2[0] = f / f3;
        fArr2[1] = f2 / f3;
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = f4 + f5 + fArr[5];
        fArr2[2] = f4 / f6;
        fArr2[3] = f5 / f6;
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = f7 + f8 + fArr[8];
        fArr2[4] = f7 / f9;
        fArr2[5] = f8 / f9;
        return fArr2;
    }

    /* JADX INFO: renamed from: m */
    public static float m51329m(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float fM66394h = o7t0.m66394h(f, f6, (((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3), 0.5f);
        return fM66394h < 0.0f ? -fM66394h : fM66394h;
    }

    /* JADX INFO: renamed from: n */
    public static Intent m51330n(Activity activity, ij40 ij40Var) {
        return new Intent(activity, (Class<?>) InAppBrowserActivity.class).putExtra("com.spotify.adsdisplay.browser.webview.metadata", ij40Var);
    }

    /* JADX INFO: renamed from: r */
    public static void m51331r(hsa0 hsa0Var) {
        synchronized (p8y.f175081b) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m51332s(hsa0 hsa0Var) {
        synchronized (p8y.f175081b) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m51333t(hsa0 hsa0Var) {
        synchronized (p8y.f175081b) {
        }
    }

    @Override // p204p.if11
    /* JADX INFO: renamed from: a */
    public fiz mo33756a(du51 du51Var) {
        return new ysk(ff11.f68880a, 27);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f104621a) {
            case 1:
                int iOrdinal = ((EsAuthStorageResult$AuthStorageResult) obj).m7498o().ordinal();
                if (iOrdinal == 0) {
                    return pi7.f177849a;
                }
                if (iOrdinal != 1) {
                    return iOrdinal != 2 ? ni7.f154191a : ni7.f154192b;
                }
                return ni7.f154193c;
            case 22:
                BlockedlistResponse$RelationsUsernameResponse blockedlistResponse$RelationsUsernameResponse = (BlockedlistResponse$RelationsUsernameResponse) obj;
                String nextPageToken = blockedlistResponse$RelationsUsernameResponse.getNextPageToken();
                wj50.m88279p(nextPageToken);
                String str = nextPageToken.length() > 0 ? nextPageToken : null;
                ae50<BlockedlistResponse$UsernameUser> ae50VarM19834o = blockedlistResponse$RelationsUsernameResponse.m19834o();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM19834o, 10));
                for (BlockedlistResponse$UsernameUser blockedlistResponse$UsernameUser : ae50VarM19834o) {
                    Set set = dd41.f47702f;
                    String strM35694A = r46.m74732a0(blockedlistResponse$UsernameUser.getUsername(), null).m35694A();
                    wj50.m88279p(strM35694A);
                    arrayList.add(new p0s0(f0s0.f64712a, strM35694A, null, null, null, null, null, 4092));
                }
                return new qxr0(3, arrayList, str, str == null, 104);
            default:
                ((bv81) obj).getClass();
                int iM38547C = edb.m38547C(2);
                if (iM38547C == 0) {
                    return fw81.f74027b;
                }
                if (iM38547C == 1) {
                    return fw81.f74026a;
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        return null;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        ntx ntxVarM65644b = ntx.m65644b(i);
        return ntxVarM65644b == null ? ntx.UNRECOGNIZED : ntxVarM65644b;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((usi0) obj);
    }

    /* JADX WARN: Code duplicated, block: B:187:0x031f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0350  */
    /* JADX WARN: Code duplicated, block: B:210:0x0368  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:255:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:262:0x040c  */
    /* JADX WARN: Code duplicated, block: B:266:0x0420  */
    /* JADX WARN: Code duplicated, block: B:268:0x042e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0431  */
    /* JADX WARN: Code duplicated, block: B:271:0x0435  */
    /* JADX WARN: Code duplicated, block: B:275:0x0444  */
    /* JADX WARN: Code duplicated, block: B:276:0x0447  */
    /* JADX WARN: Code duplicated, block: B:278:0x044a  */
    /* JADX WARN: Code duplicated, block: B:279:0x044c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0454  */
    /* JADX WARN: Code duplicated, block: B:284:0x0463  */
    /* JADX WARN: Code duplicated, block: B:290:0x0478  */
    /* JADX WARN: Code duplicated, block: B:291:0x047f  */
    /* JADX WARN: Code duplicated, block: B:296:0x0488  */
    /* JADX WARN: Code duplicated, block: B:300:0x0490  */
    /* JADX WARN: Code duplicated, block: B:302:0x0493  */
    /* JADX WARN: Code duplicated, block: B:306:0x049b  */
    /* JADX WARN: Code duplicated, block: B:308:0x049e  */
    /* JADX WARN: Code duplicated, block: B:311:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:314:0x04af  */
    /* JADX WARN: Code duplicated, block: B:319:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:322:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:326:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:328:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:329:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:334:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:335:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:338:0x0503  */
    /* JADX WARN: Code duplicated, block: B:341:0x0512  */
    /* JADX WARN: Code duplicated, block: B:345:0x052d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0536  */
    /* JADX WARN: Code duplicated, block: B:363:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0362 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x04c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:? A[LOOP:6: B:312:0x04a9->B:379:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0213  */
    /* JADX INFO: renamed from: o */
    public gd70 m51334o(ey9 ey9Var, gd70 gd70Var, List list, pn91 pn91Var, boolean z) {
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        bo91 bo91VarM68427D;
        int i;
        z9t z9tVar;
        de60[] de60VarArr;
        lzd1 lzd1VarM40297h;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Iterable annotations;
        dhz dhzVarM68476n;
        boolean z9;
        ArrayList<de60> arrayList2;
        Iterator it;
        boolean z10;
        boolean z11;
        doi0 doi0Var;
        klk0 klk0Var;
        ArrayList arrayList3;
        d15 d15Var;
        Set setM43736n1;
        klk0 klk0Var2;
        klk0 klk0Var3;
        boolean z12;
        boolean z13;
        ArrayList arrayList4;
        doi0 doi0Var2;
        doi0 doi0Var3;
        doi0 doi0Var4;
        doi0 doi0Var5;
        doi0 doi0Var6;
        boolean z14;
        ArrayList arrayList5;
        Iterator it2;
        doi0 doi0Var7;
        doi0 doi0Var8;
        boolean z15;
        Iterator it3;
        de60 de60Var;
        boolean z16;
        ArrayList arrayList6;
        Iterator it4;
        Set setM43736n2;
        klk0 klk0Var4;
        klk0 klk0Var5;
        C2487v9 c2487v9;
        de60 de60Var2;
        kd70 kd70Var;
        klk0 klk0VarM40291j;
        int iM79514f;
        d15 d15Var2 = (d15) ey9Var.f63992c;
        z9t z9tVar2 = (z9t) ey9Var.f63993d;
        boolean z17 = ey9Var.f63990a;
        ArrayList arrayListM40304q = ey9Var.m40304q(gd70Var);
        ArrayList arrayList7 = new ArrayList(i6f.m49804T(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList7.add(ey9Var.m40304q((kd70) it5.next()));
        }
        if (!z17 || list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z2 = false;
                break;
            }
            if (!((ljj0) ((kjj0) ((qwm) z9tVar2.f280873b).f193383u)).m59168a(gd70Var, (gd70) ((kd70) it6.next()))) {
                z2 = true;
                break;
            }
        }
        int size = arrayListM40304q.size();
        de60[] de60VarArr2 = new de60[size];
        int i2 = 0;
        while (i2 < size) {
            fr70 fr70VarM72078I = q3d0.m72078I(3, new d9e0(ey9Var, arrayListM40304q, i2, 2));
            de60 de60Var3 = de60.f47973f;
            if (i2 <= 0 || !z2) {
                C2487v9 c2487v10 = (C2487v9) arrayListM40304q.get(i2);
                hd60 hd60Var = (hd60) fr70VarM72078I.getValue();
                kd70 kd70Var2 = c2487v10.f238800a;
                do91 do91Var = c2487v10.f238802c;
                z3 = z17;
                klk0 klk0Var6 = klk0.f123917a;
                klk0 klk0Var7 = klk0.f123918b;
                arrayList = arrayList7;
                klk0 klk0Var8 = klk0.f123919c;
                if (kd70Var2 == null) {
                    if (do91Var == null) {
                        iM79514f = 0;
                    } else {
                        if (!(do91Var instanceof bo91)) {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(do91Var);
                            sb.append(", ");
                            throw new IllegalArgumentException(stz0.m79354h(qpv0.f191387a, do91Var.getClass(), sb).toString());
                        }
                        iM79514f = sw41.m79514f(((bo91) do91Var).mo27374C());
                    }
                    z4 = z2;
                    z5 = true;
                    if (iM79514f == 1) {
                        z9tVar = z9tVar2;
                        i = size;
                        de60VarArr = de60VarArr2;
                    }
                    z9 = de60Var3.f47977d;
                    arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        c2487v9 = (C2487v9) g6f.m43747t0(i2, (List) it.next());
                        if (c2487v9 != null || (kd70Var = c2487v9.f238800a) == null) {
                            de60Var2 = null;
                        } else {
                            klk0 klk0VarM40291j2 = ey9.m40291j(kd70Var);
                            if (klk0VarM40291j2 == null) {
                                gd70 gd70VarM39345o = el51.m39345o((gd70) kd70Var);
                                klk0VarM40291j = gd70VarM39345o != null ? ey9.m40291j(gd70VarM39345o) : null;
                            } else {
                                klk0VarM40291j = klk0VarM40291j2;
                            }
                            doi0 doi0VarM40290i = ey9.m40290i(kd70Var);
                            doi0 doi0VarM40290i2 = ey9.m40290i(kd70Var);
                            if (doi0VarM40290i2 == null) {
                                gd70 gd70VarM39345o2 = el51.m39345o((gd70) kd70Var);
                                doi0VarM40290i2 = gd70VarM39345o2 != null ? ey9.m40290i(gd70VarM39345o2) : null;
                            }
                            jd21 jd21VarM68478o = oyf1.m68478o(kd70Var);
                            de60Var2 = new de60(klk0VarM40291j, doi0VarM40290i, (((jd21VarM68478o != null ? oyf1.m68474m(jd21VarM68478o) : null) != null ? z5 : false) || (((gd70) kd70Var).mo35108F0() instanceof hqj0)) ? z5 : false, klk0VarM40291j != klk0VarM40291j2 ? z5 : false, doi0VarM40290i2 != doi0VarM40290i ? z5 : false);
                        }
                        if (de60Var2 != null) {
                            arrayList2.add(de60Var2);
                        }
                    }
                    if (i2 == 0 || !z3) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    if (i2 == 0 || !(d15Var2 instanceof s3b1) || ((s3b1) d15Var2).f205254X == null) {
                        z11 = false;
                    } else {
                        z11 = z5;
                    }
                    doi0Var = de60Var3.f47975b;
                    klk0Var = de60Var3.f47974a;
                    arrayList3 = new ArrayList();
                    for (de60 de60Var4 : arrayList2) {
                        d15 d15Var3 = d15Var2;
                        if (de60Var4.f47977d) {
                            klk0Var5 = null;
                        } else {
                            klk0Var5 = de60Var4.f47974a;
                        }
                        if (klk0Var5 != null) {
                            arrayList3.add(klk0Var5);
                        }
                        d15Var2 = d15Var3;
                    }
                    d15Var = d15Var2;
                    setM43736n1 = g6f.m43736n1(arrayList3);
                    if (z9) {
                        klk0Var2 = null;
                    } else {
                        klk0Var2 = klk0Var;
                    }
                    if (klk0Var2 == klk0Var6) {
                        klk0Var3 = klk0Var6;
                    } else {
                        klk0Var3 = (klk0) k2z0.m55223y(setM43736n1, klk0Var8, klk0Var7, klk0Var2, z10);
                    }
                    if (klk0Var3 == null) {
                        arrayList6 = new ArrayList();
                        it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            klk0Var4 = ((de60) it4.next()).f47974a;
                            if (klk0Var4 != null) {
                                arrayList6.add(klk0Var4);
                            }
                        }
                        setM43736n2 = g6f.m43736n1(arrayList6);
                        if (klk0Var != klk0Var6) {
                            klk0Var6 = (klk0) k2z0.m55223y(setM43736n2, klk0Var8, klk0Var7, klk0Var, z10);
                        }
                    } else {
                        klk0Var6 = klk0Var3;
                    }
                    if (klk0Var6 != null || z || (z11 && klk0Var6 == klk0Var7)) {
                        klk0Var6 = null;
                    }
                    if (klk0Var6 == null && klk0Var3 == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (klk0Var6 != klk0Var8) {
                        z13 = false;
                    } else {
                        if (z9 == z12 || !de60Var3.f47976c) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z15) {
                            if (!arrayList2.isEmpty()) {
                                it3 = arrayList2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        de60Var = (de60) it3.next();
                                        if (de60Var.f47977d == z12 || !de60Var.f47976c) {
                                            z16 = false;
                                        } else {
                                            z16 = true;
                                        }
                                        if (z16) {
                                        }
                                    }
                                }
                            }
                            z13 = false;
                        }
                        z13 = true;
                    }
                    arrayList4 = new ArrayList();
                    for (de60 de60Var5 : arrayList2) {
                        if (de60Var5.f47978e) {
                            doi0Var8 = null;
                        } else {
                            doi0Var8 = de60Var5.f47975b;
                        }
                        if (doi0Var8 != null) {
                            arrayList4.add(doi0Var8);
                        }
                    }
                    Set setM43736n3 = g6f.m43736n1(arrayList4);
                    if (de60Var3.f47978e) {
                        doi0Var2 = null;
                    } else {
                        doi0Var2 = doi0Var;
                    }
                    doi0Var3 = doi0.f51051b;
                    doi0Var4 = doi0.f51050a;
                    doi0Var5 = (doi0) k2z0.m55223y(setM43736n3, doi0Var3, doi0Var4, doi0Var2, z10);
                    if (doi0Var5 == null) {
                        arrayList5 = new ArrayList();
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            doi0Var7 = ((de60) it2.next()).f47975b;
                            if (doi0Var7 != null) {
                                arrayList5.add(doi0Var7);
                            }
                        }
                        doi0Var6 = (doi0) k2z0.m55223y(g6f.m43736n1(arrayList5), doi0Var3, doi0Var4, doi0Var, z10);
                    } else {
                        doi0Var6 = doi0Var5;
                    }
                    if (doi0Var6 == null && doi0Var5 == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    de60Var3 = new de60(klk0Var6, doi0Var6, z13, z12, z14);
                } else {
                    z4 = z2;
                }
                boolean z18 = do91Var == null;
                lau lauVar = lau.f131415a;
                Iterable annotations2 = kd70Var2 != null ? ((gd70) kd70Var2).getAnnotations() : lauVar;
                if (kd70Var2 == null) {
                    bo91VarM68427D = null;
                } else {
                    jd21 jd21VarM68478o2 = oyf1.m68478o(kd70Var2);
                    if (jd21VarM68478o2 == null && ((dhzVarM68476n = oyf1.m68476n(kd70Var2)) == null || (jd21VarM68478o2 = oyf1.m68453b0(dhzVarM68476n)) == null)) {
                        jd21VarM68478o2 = oyf1.m68478o(kd70Var2);
                        wj50.m88279p(jd21VarM68478o2);
                    }
                    jn91 jn91VarM68487s0 = oyf1.m68487s0(jd21VarM68478o2);
                    if (jn91VarM68487s0 != null) {
                        bo91VarM68427D = oyf1.m68427D(jn91VarM68487s0);
                    } else {
                        bo91VarM68427D = null;
                    }
                }
                i = size;
                boolean z19 = ((c25) ey9Var.f63994e) == c25.TYPE_PARAMETER_BOUNDS;
                if (z18) {
                    if (!z19) {
                        ((jsy) ((qwm) z9tVar2.f280873b).f193382t).getClass();
                    }
                    if (d15Var2 == null || (annotations = d15Var2.getAnnotations()) == null) {
                        annotations = lauVar;
                    }
                    annotations2 = g6f.m43698L0(annotations, annotations2);
                }
                f25 f25Var = (f25) ((qwm) z9tVar2.f280873b).f193379q;
                f25Var.getClass();
                C2401t5 c2401t5 = new C2401t5(1, f25Var, f25.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lorg/jetbrains/kotlin/load/java/typeEnhancement/WithMigrationStatus;", 0, 0, 0);
                Iterator it7 = annotations2.iterator();
                lzd1 lzd1Var = null;
                while (it7.hasNext()) {
                    lzd1 lzd1Var2 = (lzd1) c2401t5.invoke(it7.next());
                    C2401t5 c2401t6 = c2401t5;
                    if (lzd1Var == null) {
                        lzd1Var = lzd1Var2;
                    } else {
                        boolean z20 = lzd1Var.f138352b;
                        if (lzd1Var2 != null && !lzd1Var2.equals(lzd1Var) && (!(z8 = lzd1Var2.f138352b) || z20)) {
                            if (z8 || !z20) {
                                lzd1Var = null;
                                break;
                            }
                            lzd1Var = lzd1Var2;
                        }
                    }
                    c2401t5 = c2401t6;
                }
                f25 f25Var2 = (f25) ((qwm) z9tVar2.f280873b).f193379q;
                z9tVar = z9tVar2;
                C2405t9 c2405t9 = new C2405t9(0, ey9Var, c2487v10);
                f25Var2.getClass();
                Iterator it8 = annotations2.iterator();
                lzd1 lzd1Var3 = null;
                while (true) {
                    if (!it8.hasNext()) {
                        de60VarArr = de60VarArr2;
                        break;
                    }
                    Object next = it8.next();
                    f25Var2.getClass();
                    Iterator it9 = it8;
                    lzd1 lzd1VarM40576f = f25Var2.m40576f(next, ((Boolean) c2405t9.invoke(next)).booleanValue());
                    if (lzd1VarM40576f != null) {
                        de60VarArr = de60VarArr2;
                    } else {
                        Object objM40578h = f25Var2.m40578h(next);
                        de60VarArr = de60VarArr2;
                        if (objM40578h != null) {
                            esw0 esw0VarM40577g = f25Var2.m40577g(next);
                            if (esw0VarM40577g == null) {
                                esw0VarM40577g = ((sm60) f25Var2.f65115a.f15840c).f210572a;
                            }
                            esw0VarM40577g.getClass();
                            if (esw0VarM40577g == esw0.f62508a) {
                                lzd1VarM40576f = null;
                            } else {
                                lzd1 lzd1VarM40576f2 = f25Var2.m40576f(objM40578h, ((Boolean) c2405t9.invoke(objM40578h)).booleanValue());
                                lzd1VarM40576f = lzd1VarM40576f2 != null ? lzd1.m60300a(lzd1VarM40576f2, null, esw0VarM40577g.m39921a(), 1) : null;
                            }
                        }
                    }
                    if (lzd1Var3 == null) {
                        lzd1Var3 = lzd1VarM40576f;
                    } else {
                        boolean z21 = lzd1Var3.f138352b;
                        if (lzd1VarM40576f != null && !lzd1VarM40576f.equals(lzd1Var3) && (!(z7 = lzd1VarM40576f.f138352b) || z21)) {
                            if (z7 || !z21) {
                                lzd1Var3 = null;
                                break;
                            }
                            lzd1Var3 = lzd1VarM40576f;
                        }
                    }
                    it8 = it9;
                    de60VarArr2 = de60VarArr;
                    f25Var2 = f25Var2;
                }
                if (lzd1Var3 != null) {
                    Object obj = lzd1Var3.f138351a;
                    de60Var3 = new de60((klk0) obj, lzd1Var != null ? (doi0) lzd1Var.f138351a : null, obj == klk0Var8 && bo91VarM68427D != null, lzd1Var3.f138352b, lzd1Var != null && lzd1Var.f138352b);
                    z5 = true;
                } else {
                    lzd1 lzd1VarM40297h2 = bo91VarM68427D != null ? ey9Var.m40297h(bo91VarM68427D) : null;
                    lzd1 lzd1VarM60300a = lzd1VarM40297h2 != null ? lzd1.m60300a(lzd1VarM40297h2, klk0Var8, false, 2) : hd60Var != null ? hd60Var.f90029a : null;
                    boolean z22 = (lzd1VarM40297h2 != null ? (klk0) lzd1VarM40297h2.f138351a : null) == klk0Var8 || !(bo91VarM68427D == null || hd60Var == null || !hd60Var.f90031c);
                    if (do91Var == null || (lzd1VarM40297h = ey9Var.m40297h(do91Var)) == null) {
                        lzd1VarM40297h = null;
                    } else if (lzd1VarM40297h.f138351a == klk0Var7) {
                        lzd1VarM40297h = lzd1.m60300a(lzd1VarM40297h, klk0Var6, false, 2);
                    }
                    if (lzd1VarM40297h != null) {
                        Object obj2 = lzd1VarM40297h.f138351a;
                        if (lzd1VarM60300a == null) {
                            lzd1VarM60300a = lzd1VarM40297h;
                        } else {
                            Object obj3 = lzd1VarM60300a.f138351a;
                            boolean z23 = lzd1VarM60300a.f138352b;
                            boolean z24 = lzd1VarM40297h.f138352b;
                            if (!z24 || z23) {
                                if (z24 || !z23) {
                                    klk0 klk0Var9 = (klk0) obj2;
                                    Enum r7 = (Enum) obj3;
                                    if (klk0Var9.compareTo(r7) >= 0 && klk0Var9.compareTo(r7) > 0) {
                                        lzd1VarM60300a = lzd1VarM40297h;
                                    }
                                } else {
                                    lzd1VarM60300a = lzd1VarM40297h;
                                }
                            }
                        }
                    }
                    klk0 klk0Var10 = lzd1VarM60300a != null ? (klk0) lzd1VarM60300a.f138351a : null;
                    doi0 doi0Var9 = lzd1Var != null ? (doi0) lzd1Var.f138351a : null;
                    if (lzd1VarM60300a != null) {
                        z5 = true;
                        boolean z25 = lzd1VarM60300a.f138352b;
                        if (lzd1Var == null && lzd1Var.f138352b == z5) {
                            z6 = z5;
                        } else {
                            z6 = false;
                        }
                        de60Var3 = new de60(klk0Var10, doi0Var9, z22, z25, z6);
                    } else {
                        z5 = true;
                    }
                    if (lzd1Var == null) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    de60Var3 = new de60(klk0Var10, doi0Var9, z22, z25, z6);
                }
                z9 = de60Var3.f47977d;
                arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c2487v9 = (C2487v9) g6f.m43747t0(i2, (List) it.next());
                    if (c2487v9 != null) {
                        de60Var2 = null;
                    } else {
                        de60Var2 = null;
                    }
                    if (de60Var2 != null) {
                        arrayList2.add(de60Var2);
                    }
                }
                if (i2 == 0) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (i2 == 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                doi0Var = de60Var3.f47975b;
                klk0Var = de60Var3.f47974a;
                arrayList3 = new ArrayList();
                while (r15.hasNext()) {
                    d15 d15Var4 = d15Var2;
                    if (de60Var4.f47977d) {
                        klk0Var5 = null;
                    } else {
                        klk0Var5 = de60Var4.f47974a;
                    }
                    if (klk0Var5 != null) {
                        arrayList3.add(klk0Var5);
                    }
                    d15Var2 = d15Var4;
                }
                d15Var = d15Var2;
                setM43736n1 = g6f.m43736n1(arrayList3);
                if (z9) {
                    klk0Var2 = null;
                } else {
                    klk0Var2 = klk0Var;
                }
                if (klk0Var2 == klk0Var6) {
                    klk0Var3 = klk0Var6;
                } else {
                    klk0Var3 = (klk0) k2z0.m55223y(setM43736n1, klk0Var8, klk0Var7, klk0Var2, z10);
                }
                if (klk0Var3 == null) {
                    arrayList6 = new ArrayList();
                    it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        klk0Var4 = ((de60) it4.next()).f47974a;
                        if (klk0Var4 != null) {
                            arrayList6.add(klk0Var4);
                        }
                    }
                    setM43736n2 = g6f.m43736n1(arrayList6);
                    if (klk0Var != klk0Var6) {
                        klk0Var6 = (klk0) k2z0.m55223y(setM43736n2, klk0Var8, klk0Var7, klk0Var, z10);
                    }
                } else {
                    klk0Var6 = klk0Var3;
                }
                if (klk0Var6 != null) {
                    klk0Var6 = null;
                } else {
                    klk0Var6 = null;
                }
                if (klk0Var6 == null) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (klk0Var6 != klk0Var8) {
                    z13 = false;
                } else {
                    if (z9 == z12) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        if (!arrayList2.isEmpty()) {
                            it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    de60Var = (de60) it3.next();
                                    if (de60Var.f47977d == z12) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                    }
                                }
                            }
                        }
                        z13 = false;
                    }
                    z13 = true;
                }
                arrayList4 = new ArrayList();
                while (r2.hasNext()) {
                    if (de60Var5.f47978e) {
                        doi0Var8 = null;
                    } else {
                        doi0Var8 = de60Var5.f47975b;
                    }
                    if (doi0Var8 != null) {
                        arrayList4.add(doi0Var8);
                    }
                }
                Set setM43736n4 = g6f.m43736n1(arrayList4);
                if (de60Var3.f47978e) {
                    doi0Var2 = null;
                } else {
                    doi0Var2 = doi0Var;
                }
                doi0Var3 = doi0.f51051b;
                doi0Var4 = doi0.f51050a;
                doi0Var5 = (doi0) k2z0.m55223y(setM43736n4, doi0Var3, doi0Var4, doi0Var2, z10);
                if (doi0Var5 == null) {
                    arrayList5 = new ArrayList();
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        doi0Var7 = ((de60) it2.next()).f47975b;
                        if (doi0Var7 != null) {
                            arrayList5.add(doi0Var7);
                        }
                    }
                    doi0Var6 = (doi0) k2z0.m55223y(g6f.m43736n1(arrayList5), doi0Var3, doi0Var4, doi0Var, z10);
                } else {
                    doi0Var6 = doi0Var5;
                }
                if (doi0Var6 == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                de60Var3 = new de60(klk0Var6, doi0Var6, z13, z12, z14);
            } else {
                d15Var = d15Var2;
                z9tVar = z9tVar2;
                z3 = z17;
                arrayList = arrayList7;
                z4 = z2;
                i = size;
                de60VarArr = de60VarArr2;
            }
            de60VarArr[i2] = de60Var3;
            i2++;
            d15Var2 = d15Var;
            z17 = z3;
            arrayListM40304q = arrayListM40304q;
            arrayList7 = arrayList;
            z2 = z4;
            z9tVar2 = z9tVar;
            size = i;
            de60VarArr2 = de60VarArr;
        }
        return (gd70) ri5.m75543r(gd70Var.mo35108F0(), new C2405t9(1, pn91Var, de60VarArr2), 0, ey9Var.f63991b).f39207c;
    }

    /* JADX INFO: renamed from: p */
    public gd70 m51335p(ad60 ad60Var, cab cabVar, boolean z, z9t z9tVar, c25 c25Var, pn91 pn91Var, boolean z2, gh00 gh00Var) {
        ey9 ey9Var = new ey9((d15) cabVar, z, z9tVar, c25Var, false);
        gd70 gd70Var = (gd70) gh00Var.invoke(ad60Var);
        Collection<eab> collectionMo32019p = ad60Var.mo32019p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(collectionMo32019p, 10));
        for (eab eabVar : collectionMo32019p) {
            wj50.m88279p(eabVar);
            arrayList.add((gd70) gh00Var.invoke(eabVar));
        }
        return m51334o(ey9Var, gd70Var, arrayList, pn91Var, z2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:105:0x0200  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:111:0x022a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0237  */
    /* JADX WARN: Code duplicated, block: B:119:0x023c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0241  */
    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0271  */
    /* JADX WARN: Code duplicated, block: B:130:0x027b A[EDGE_INSN: B:130:0x027b->B:137:0x029a BREAK  A[LOOP:4: B:132:0x0281->B:201:?]] */
    /* JADX WARN: Code duplicated, block: B:131:0x027d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0287  */
    /* JADX WARN: Code duplicated, block: B:139:0x029d  */
    /* JADX WARN: Code duplicated, block: B:140:0x029f  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:143:0x02af  */
    /* JADX WARN: Code duplicated, block: B:160:0x02da  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0304  */
    /* JADX WARN: Code duplicated, block: B:172:0x0308  */
    /* JADX WARN: Code duplicated, block: B:177:0x0323  */
    /* JADX WARN: Code duplicated, block: B:183:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[LOOP:4: B:132:0x0281->B:201:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0179  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [p.cab] */
    /* JADX WARN: Type inference failed for: r25v0, types: [p.iq3] */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.cab, p.eab, p.oqo] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [p.ad60] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX INFO: renamed from: q */
    public ArrayList m51336q(z9t z9tVar, Collection collection) {
        l25 annotations;
        gd70 type;
        sfq0 sfq0Var;
        boolean z;
        ArrayList arrayList;
        nys0 nys0Var;
        c25 c25Var;
        pn91 pn91Var;
        ad60 ad60Var;
        gd70 gd70VarM51335p;
        gd70 gd70VarMo29933i;
        boolean z2;
        pqm0 pqm0Var;
        ArrayList arrayList2;
        int i;
        int i2;
        gd70 type2;
        wr70 wr70VarMo32017Q;
        boolean z3;
        wr70 wr70VarMo32017Q2;
        boolean zM78632c;
        List listMo32015K;
        Iterator it;
        boolean z4;
        pn91 pn91Var2;
        z9t z9tVarM40596k;
        List list;
        tys0 tys0Var;
        hrl0 hrl0Var = hrl0.f94463W0;
        Collection<??> collection2 = collection;
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(collection2, 10));
        for (?? Mo25521z : collection2) {
            if ((Mo25521z instanceof ad60) && (Mo25521z.mo38278l0() != 2 || Mo25521z.mo27377a().mo32019p().size() != 1)) {
                qge qgeVarM70359r = pmg1.m70359r(Mo25521z);
                int i3 = 0;
                if (qgeVarM70359r == null) {
                    annotations = ((AbstractC1806e9) Mo25521z).getAnnotations();
                } else {
                    mt70 mt70Var = qgeVarM70359r instanceof mt70 ? (mt70) qgeVarM70359r : null;
                    List list2 = mt70Var != null ? (List) mt70Var.f146974X.getValue() : null;
                    if (list2 == null || list2.isEmpty()) {
                        annotations = ((AbstractC1806e9) Mo25521z).getAnnotations();
                    } else {
                        ArrayList arrayList4 = new ArrayList(i6f.m49804T(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(new it70(z9tVar, (cov0) it2.next(), true));
                        }
                        ArrayList arrayListM43698L0 = g6f.m43698L0(((AbstractC1806e9) Mo25521z).getAnnotations(), arrayList4);
                        annotations = arrayListM43698L0.isEmpty() ? e370.f55667h : new n25(arrayListM43698L0, i3);
                    }
                }
                z9t z9tVarM40596k2 = f2h1.m40596k(z9tVar, annotations);
                ?? r12 = (!(Mo25521z instanceof qd60) || (tys0Var = ((pys0) Mo25521z).f183505V0) == null || tys0Var.f138109f) ? Mo25521z : tys0Var;
                wr70 wr70VarMo32017Q3 = Mo25521z.mo32017Q();
                c25 c25Var2 = c25.VALUE_PARAMETER;
                if (wr70VarMo32017Q3 != null) {
                    mi00 mi00Var = r12 instanceof mi00 ? (mi00) r12 : null;
                    s3b1 s3b1Var = mi00Var != null ? (s3b1) mi00Var.mo32014B(nd60.f152689e1) : null;
                    type = m51335p((ad60) Mo25521z, s3b1Var, false, s3b1Var != null ? f2h1.m40596k(z9tVarM40596k2, s3b1Var.getAnnotations()) : z9tVarM40596k2, c25Var2, null, false, hrl0.f94460T0);
                } else {
                    type = null;
                }
                nd60 nd60Var = Mo25521z instanceof nd60 ? (nd60) Mo25521z : null;
                if (nd60Var != null) {
                    nfe nfeVar = (nfe) nd60Var.mo27379o();
                    String strM64248k = nec.m64248k(nd60Var, 3);
                    String str = vd60.f240327a;
                    vfe vfeVarM85215f = vd60.m85215f(txq.m81934g(nfeVar).f269048a);
                    String str2 = (vfeVarM85215f != null ? un60.m83532e(vfeVarM85215f) : amg1.m26421v(nfeVar, oyq0.f171851U0)) + '.' + strM64248k;
                    if (str2 == null || (sfq0Var = (sfq0) rfq0.f198719d.get(str2)) == null) {
                        sfq0Var = null;
                    } else {
                        String str3 = sfq0Var.f208628c;
                        if (str3 != null && !bm51.m29803n0(str3, "2.", false)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (str3 != null) {
                            sfq0Var = sfq0Var.f208629d;
                        }
                    }
                } else {
                    sfq0Var = null;
                }
                if (sfq0Var != null) {
                    sfq0Var.f208627b.size();
                    ((nd60) Mo25521z).mo32015K().size();
                }
                if (((C2483v5) ((C1668ai) ((qwm) z9tVar.f280873b).f193384v).f15841d).invoke(od60.f164107a) == esw0.f62510c) {
                    if ((Mo25521z instanceof mi00) && wj50.m88271j(Mo25521z.mo32014B(nd60.f152690f1), Boolean.TRUE)) {
                        z = true;
                    }
                    List<s3b1> listMo32015K2 = r12.mo32015K();
                    arrayList = new ArrayList(i6f.m49804T(listMo32015K2, 10));
                    for (s3b1 s3b1Var2 : listMo32015K2) {
                        if (sfq0Var != null || (list = sfq0Var.f208627b) == null) {
                            pn91Var2 = null;
                        } else {
                            pn91Var2 = (pn91) g6f.m43747t0(s3b1Var2.f205256g, list);
                        }
                        jt70 jt70Var = new jt70(s3b1Var2, 15);
                        ad60 ad60Var2 = (ad60) Mo25521z;
                        if (s3b1Var2 != null) {
                            z9tVarM40596k = f2h1.m40596k(z9tVarM40596k2, s3b1Var2.getAnnotations());
                        } else {
                            z9tVarM40596k = z9tVarM40596k2;
                        }
                        arrayList.add(m51335p(ad60Var2, s3b1Var2, false, z9tVarM40596k, c25Var2, pn91Var2, z, jt70Var));
                    }
                    if (Mo25521z instanceof nys0) {
                        nys0Var = (nys0) Mo25521z;
                    } else {
                        nys0Var = null;
                    }
                    if (nys0Var == null && nys0Var.mo65908b() == null) {
                        c25Var = c25.FIELD;
                    } else {
                        c25Var = c25.METHOD_RETURN_TYPE;
                    }
                    c25 c25Var3 = c25Var;
                    if (sfq0Var != null) {
                        pn91Var = sfq0Var.f208626a;
                    } else {
                        pn91Var = null;
                    }
                    ad60Var = (ad60) Mo25521z;
                    gd70VarM51335p = m51335p(ad60Var, r12, true, z9tVarM40596k2, c25Var3, pn91Var, false, hrl0.f94461U0);
                    gd70VarMo29933i = Mo25521z.mo29933i();
                    wj50.m88279p(gd70VarMo29933i);
                    if (so91.m78632c(gd70VarMo29933i, hrl0Var, null)) {
                        z2 = true;
                    } else {
                        wr70VarMo32017Q2 = Mo25521z.mo32017Q();
                        if (wr70VarMo32017Q2 != null) {
                            zM78632c = so91.m78632c(wr70VarMo32017Q2.getType(), hrl0Var, null);
                        } else {
                            zM78632c = false;
                        }
                        if (zM78632c) {
                            z2 = true;
                        } else {
                            listMo32015K = Mo25521z.mo32015K();
                            if (listMo32015K.isEmpty()) {
                                z4 = false;
                                break;
                            }
                            it = listMo32015K.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                                if (so91.m78632c(((s3b1) it.next()).getType(), hrl0Var, null)) {
                                    z4 = true;
                                    break;
                                }
                            }
                            if (z4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                    if (z2) {
                        pqm0Var = new pqm0(cct.f36613a, new htq());
                    } else {
                        pqm0Var = null;
                    }
                    if (type == null || gd70VarM51335p != null) {
                        if (type == null) {
                            wr70VarMo32017Q = Mo25521z.mo32017Q();
                            if (wr70VarMo32017Q != null) {
                                type = wr70VarMo32017Q.getType();
                            } else {
                                type = null;
                            }
                        }
                        arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                        i = 0;
                        for (Object obj : arrayList) {
                            i2 = i + 1;
                            if (i >= 0) {
                                h6f.m46722S();
                                throw null;
                            }
                            type2 = (gd70) obj;
                            if (type2 == null) {
                                type2 = ((s3b1) Mo25521z.mo32015K().get(i)).getType();
                            }
                            arrayList2.add(type2);
                            i = i2;
                        }
                        if (gd70VarM51335p == null) {
                            gd70VarM51335p = Mo25521z.mo29933i();
                            wj50.m88279p(gd70VarM51335p);
                        }
                        Mo25521z = ad60Var.mo25521z(type, arrayList2, gd70VarM51335p, pqm0Var);
                    } else {
                        if (arrayList.isEmpty()) {
                            z3 = false;
                            break;
                        }
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z3 = false;
                                break;
                            }
                            if (((gd70) it3.next()) != null) {
                                z3 = true;
                                break;
                            }
                        }
                        if (z3 || pqm0Var != null) {
                            if (type == null) {
                                wr70VarMo32017Q = Mo25521z.mo32017Q();
                                if (wr70VarMo32017Q != null) {
                                    type = wr70VarMo32017Q.getType();
                                } else {
                                    type = null;
                                }
                            }
                            arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                            i = 0;
                            while (r7.hasNext()) {
                                i2 = i + 1;
                                if (i >= 0) {
                                    h6f.m46722S();
                                    throw null;
                                }
                                type2 = (gd70) obj;
                                if (type2 == null) {
                                    type2 = ((s3b1) Mo25521z.mo32015K().get(i)).getType();
                                }
                                arrayList2.add(type2);
                                i = i2;
                            }
                            if (gd70VarM51335p == null) {
                                gd70VarM51335p = Mo25521z.mo29933i();
                                wj50.m88279p(gd70VarM51335p);
                            }
                            Mo25521z = ad60Var.mo25521z(type, arrayList2, gd70VarM51335p, pqm0Var);
                        }
                    }
                } else {
                    ((jsy) ((qwm) z9tVarM40596k2.f280873b).f193382t).getClass();
                }
                z = false;
                List<s3b1> listMo32015K3 = r12.mo32015K();
                arrayList = new ArrayList(i6f.m49804T(listMo32015K3, 10));
                while (r11.hasNext()) {
                    if (sfq0Var != null) {
                        pn91Var2 = null;
                    } else {
                        pn91Var2 = null;
                    }
                    jt70 jt70Var2 = new jt70(s3b1Var2, 15);
                    ad60 ad60Var3 = (ad60) Mo25521z;
                    if (s3b1Var2 != null) {
                        z9tVarM40596k = f2h1.m40596k(z9tVarM40596k2, s3b1Var2.getAnnotations());
                    } else {
                        z9tVarM40596k = z9tVarM40596k2;
                    }
                    arrayList.add(m51335p(ad60Var3, s3b1Var2, false, z9tVarM40596k, c25Var2, pn91Var2, z, jt70Var2));
                }
                if (Mo25521z instanceof nys0) {
                    nys0Var = (nys0) Mo25521z;
                } else {
                    nys0Var = null;
                }
                if (nys0Var == null) {
                    c25Var = c25.METHOD_RETURN_TYPE;
                } else {
                    c25Var = c25.METHOD_RETURN_TYPE;
                }
                c25 c25Var4 = c25Var;
                if (sfq0Var != null) {
                    pn91Var = sfq0Var.f208626a;
                } else {
                    pn91Var = null;
                }
                ad60Var = (ad60) Mo25521z;
                gd70VarM51335p = m51335p(ad60Var, r12, true, z9tVarM40596k2, c25Var4, pn91Var, false, hrl0.f94461U0);
                gd70VarMo29933i = Mo25521z.mo29933i();
                wj50.m88279p(gd70VarMo29933i);
                if (so91.m78632c(gd70VarMo29933i, hrl0Var, null)) {
                    z2 = true;
                } else {
                    wr70VarMo32017Q2 = Mo25521z.mo32017Q();
                    if (wr70VarMo32017Q2 != null) {
                        zM78632c = so91.m78632c(wr70VarMo32017Q2.getType(), hrl0Var, null);
                    } else {
                        zM78632c = false;
                    }
                    if (zM78632c) {
                        listMo32015K = Mo25521z.mo32015K();
                        if (listMo32015K.isEmpty()) {
                            z4 = false;
                            break;
                        }
                        it = listMo32015K.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z4 = false;
                                break;
                            }
                            if (so91.m78632c(((s3b1) it.next()).getType(), hrl0Var, null)) {
                                z4 = true;
                                break;
                            }
                        }
                        if (z4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                    }
                }
                if (z2) {
                    pqm0Var = new pqm0(cct.f36613a, new htq());
                } else {
                    pqm0Var = null;
                }
                if (type == null) {
                    if (type == null) {
                        wr70VarMo32017Q = Mo25521z.mo32017Q();
                        if (wr70VarMo32017Q != null) {
                            type = wr70VarMo32017Q.getType();
                        } else {
                            type = null;
                        }
                    }
                    arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                    i = 0;
                    while (r7.hasNext()) {
                        i2 = i + 1;
                        if (i >= 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        type2 = (gd70) obj;
                        if (type2 == null) {
                            type2 = ((s3b1) Mo25521z.mo32015K().get(i)).getType();
                        }
                        arrayList2.add(type2);
                        i = i2;
                    }
                    if (gd70VarM51335p == null) {
                        gd70VarM51335p = Mo25521z.mo29933i();
                        wj50.m88279p(gd70VarM51335p);
                    }
                    Mo25521z = ad60Var.mo25521z(type, arrayList2, gd70VarM51335p, pqm0Var);
                } else {
                    if (type == null) {
                        wr70VarMo32017Q = Mo25521z.mo32017Q();
                        if (wr70VarMo32017Q != null) {
                            type = wr70VarMo32017Q.getType();
                        } else {
                            type = null;
                        }
                    }
                    arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                    i = 0;
                    while (r7.hasNext()) {
                        i2 = i + 1;
                        if (i >= 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        type2 = (gd70) obj;
                        if (type2 == null) {
                            type2 = ((s3b1) Mo25521z.mo32015K().get(i)).getType();
                        }
                        arrayList2.add(type2);
                        i = i2;
                    }
                    if (gd70VarM51335p == null) {
                        gd70VarM51335p = Mo25521z.mo29933i();
                        wj50.m88279p(gd70VarM51335p);
                    }
                    Mo25521z = ad60Var.mo25521z(type, arrayList2, gd70VarM51335p, pqm0Var);
                }
            }
            arrayList3.add(Mo25521z);
        }
        return arrayList3;
    }

    public String toString() {
        switch (this.f104621a) {
            case 27:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m51337u(String str) {
        synchronized (p8y.f175081b) {
        }
        synchronized (this) {
            tra0.f223026c.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0018  */
    /* JADX INFO: renamed from: v */
    public int m51338v(e3x e3xVar, gzs0 gzs0Var, boolean z) {
        Object obj;
        lxv lxvVar = lxv.f137893e;
        lxv lxvVar2 = lxv.f137895g;
        String str = gzs0Var.f86021h;
        boolean z2 = gzs0Var.f86018e;
        if (rwg1.m76555p(str) && gzs0Var.f86032s.contains(pxj.MUSIC)) {
            obj = lxvVar2;
        } else if (rwg1.m76555p(str)) {
            obj = z2 ? qxv.f193751b : qxv.f193752c;
        } else {
            Set set = dd41.f47702f;
            if (r46.m74709B(str, gn80.TRACK, gn80.TRACK_AUTOPLAY)) {
                obj = lxvVar2;
            } else if (rwg1.m76557r(str)) {
                obj = lxv.f137894f;
            } else if (rwg1.m76552m(str)) {
                obj = z2 ? ixv.f106775b : ixv.f106776c;
            } else if (rwg1.m76558s(str)) {
                obj = z2 ? nxv.f159621b : nxv.f159622c;
            } else if (rwg1.m76553n(str)) {
                obj = lxv.f137890b;
            } else if (r46.m74708A(str, gn80.KALLAX)) {
                obj = lxvVar;
            } else {
                na6.m63957e("Failed to determine entity type for uri: ".concat(str));
                obj = null;
            }
        }
        if (e3xVar instanceof g0x) {
            if (obj != null) {
                return ((obj.equals(lxvVar2) || obj.equals(lxvVar)) && z) ? 1 : 2;
            }
        } else {
            if (e3xVar instanceof atw) {
                return 2;
            }
            if (!e3xVar.equals(j0x.f107571a)) {
                if (e3xVar instanceof pzw) {
                    return 5;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!gzs0Var.f86030q) {
                return 4;
            }
            if (obj != null && ((obj.equals(lxvVar2) || obj.equals(lxvVar)) && z)) {
                return 1;
            }
        }
        return 2;
    }

    public /* synthetic */ iq3(Object obj, int i) {
        this.f104621a = i;
    }

    public /* synthetic */ iq3(son sonVar, otn otnVar, int i) {
        this.f104621a = i;
    }

    public /* synthetic */ iq3(boolean z) {
        this.f104621a = 4;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        boolean z;
        xul0 hzq0Var;
        switch (this.f104621a) {
            case 8:
                xul0 xul0Var = (xul0) obj;
                Boolean bool = (Boolean) obj2;
                if (xul0Var.mo49279c()) {
                    api apiVar = (api) xul0Var.mo49278b();
                    if (!apiVar.mo26697m() && apiVar.mo26692h()) {
                        z = bm51.m29797h0(apiVar.mo26684F(), "Google", true) && !wl51.m88496t0(apiVar.mo26704t(), "Chromecast", true) && bool.booleanValue();
                    }
                }
                return Boolean.valueOf(z);
            default:
                o4x0 o4x0Var = (o4x0) obj;
                boolean zContains = o4x0Var.f161800b.contains("mft_disallow");
                C2244p5 c2244p5 = C2244p5.f174033a;
                if (zContains) {
                    hzq0Var = new hzq0(o4x0Var.f161799a);
                } else {
                    Logger.m3966b("Unhandled restricted action: %s", qpv0.f191387a.mo54112b(o4x0Var.getClass()).mo29111F());
                    hzq0Var = c2244p5;
                }
                aew aewVar = (aew) hzq0Var.mo49283h();
                if (aewVar != null) {
                    return new hzq0(new ard0(5, 0L, 0.0f, null, aewVar, o4x0Var.getClass().getCanonicalName(), 0, null, null, 0L, null, null, null, false, 16334));
                }
                return c2244p5;
        }
    }
}
