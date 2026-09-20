package p204p;

import android.view.ViewGroup;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.runtime_consumption.esperanto.proto.ConsumptionRecord;
import com.spotify.runtime_consumption.esperanto.proto.GetConsumptionRecordsRequest;
import com.spotify.runtime_consumption.esperanto.proto.GetConsumptionRecordsResponse;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class cvx0 implements cvb0 {

    /* JADX INFO: renamed from: a */
    public final sr6 f42570a;

    /* JADX INFO: renamed from: b */
    public final ske f42571b;

    /* JADX INFO: renamed from: c */
    public final epx f42572c;

    /* JADX INFO: renamed from: d */
    public final er70 f42573d;

    /* JADX INFO: renamed from: e */
    public final xre f42574e;

    /* JADX INFO: renamed from: f */
    public final luk f42575f;

    /* JADX INFO: renamed from: g */
    public c9k f42576g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f42577h = new LinkedHashSet();

    public cvx0(sr6 sr6Var, ske skeVar, epx epxVar, er70 er70Var, xre xreVar, luk lukVar) {
        this.f42570a = sr6Var;
        this.f42571b = skeVar;
        this.f42572c = epxVar;
        this.f42573d = er70Var;
        this.f42574e = xreVar;
        this.f42575f = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba A[LOOP:0: B:68:0x0186->B:77:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c5 A[EDGE_INSN: B:94:0x01c5->B:79:0x01c5 BREAK  A[LOOP:0: B:68:0x0186->B:77:0x01ba], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0104 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final Object m34070a(cvx0 cvx0Var, long j, long j2, long j3, boolean z, boolean z2, ibk ibkVar) {
        zux0 zux0Var;
        long j4;
        long j5;
        boolean z3;
        boolean z4;
        long j6;
        long jCurrentTimeMillis;
        w2a1 w2a1Var;
        String str;
        ArrayList arrayList;
        boolean z5;
        long j7;
        long j8;
        boolean z6;
        long j9;
        long j10;
        String str2;
        gqx gqxVar;
        Iterator it;
        boolean z7;
        long j11;
        Object next;
        xaw xawVar;
        Boolean boolValueOf;
        LinkedHashSet linkedHashSet = cvx0Var.f42577h;
        if (ibkVar instanceof zux0) {
            zux0Var = (zux0) ibkVar;
            int i = zux0Var.f286564t;
            if ((i & Integer.MIN_VALUE) != 0) {
                zux0Var.f286564t = i - Integer.MIN_VALUE;
            } else {
                zux0Var = new zux0(cvx0Var, ibkVar);
            }
        } else {
            zux0Var = new zux0(cvx0Var, ibkVar);
        }
        Object objM79087s = zux0Var.f286562h;
        int i2 = zux0Var.f286564t;
        w2a1 w2a1Var2 = w2a1.f247311a;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79087s);
                sr6 sr6Var = cvx0Var.f42570a;
                GetConsumptionRecordsRequest getConsumptionRecordsRequestM20421n = GetConsumptionRecordsRequest.m20421n();
                zux0Var.f286555a = j;
                j4 = j2;
                zux0Var.f286556b = j4;
                j5 = j3;
                zux0Var.f286557c = j5;
                z3 = z;
                zux0Var.f286559e = z3;
                z4 = z2;
                zux0Var.f286560f = z4;
                zux0Var.f286564t = 1;
                objM79087s = sr6Var.m79087s(getConsumptionRecordsRequestM20421n, zux0Var);
                if (objM79087s != obj) {
                    j6 = j;
                }
                return obj;
            }
            if (i2 == 1) {
                boolean z8 = zux0Var.f286560f;
                boolean z9 = zux0Var.f286559e;
                long j12 = zux0Var.f286557c;
                long j13 = zux0Var.f286556b;
                j6 = zux0Var.f286555a;
                bga.m29073P(objM79087s);
                j5 = j12;
                j4 = j13;
                z4 = z8;
                z3 = z9;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM79087s);
                    return w2a1Var2;
                }
                long j14 = zux0Var.f286558d;
                z5 = zux0Var.f286560f;
                z6 = zux0Var.f286559e;
                j9 = zux0Var.f286557c;
                j10 = zux0Var.f286556b;
                j7 = zux0Var.f286555a;
                ArrayList arrayList2 = zux0Var.f286561g;
                bga.m29073P(objM79087s);
                arrayList = arrayList2;
                w2a1Var = w2a1Var2;
                j8 = j14;
            }
            gqxVar = (gqx) objM79087s;
            if (gqxVar == null) {
                return w2a1Var;
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    z7 = z5;
                    j11 = j7;
                    next = null;
                    break;
                }
                next = it.next();
                z7 = z5;
                j11 = j7;
                xawVar = (xaw) gqxVar.mo45449a(xaw.class, (String) next).f72301b;
                if (xawVar != null) {
                    boolValueOf = Boolean.valueOf(xawVar.f259785l);
                } else {
                    boolValueOf = null;
                }
                wj50.m88271j(boolValueOf, Boolean.TRUE);
                if (wj50.m88271j(boolValueOf, Boolean.FALSE)) {
                    break;
                }
                z5 = z7;
                j7 = j11;
            }
            str = (String) next;
            if (str == null) {
                return w2a1Var;
            }
            z4 = z7;
            jCurrentTimeMillis = j8;
            j6 = j11;
            z3 = z6;
            j5 = j9;
            j4 = j10;
            str2 = str;
            linkedHashSet.add(str2);
            zux0Var.f286561g = null;
            zux0Var.f286555a = j6;
            zux0Var.f286556b = j4;
            zux0Var.f286557c = j5;
            zux0Var.f286559e = z3;
            zux0Var.f286560f = z4;
            zux0Var.f286558d = jCurrentTimeMillis;
            zux0Var.f286564t = 3;
            if (cvx0Var.m34071b(str2, zux0Var) == obj) {
                return obj;
            }
            return w2a1Var;
            GetConsumptionRecordsResponse getConsumptionRecordsResponse = (GetConsumptionRecordsResponse) objM79087s;
            ((wy3) cvx0Var.f42574e).getClass();
            jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            ae50 ae50VarM20423n = getConsumptionRecordsResponse.m20423n();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : ae50VarM20423n) {
                w2a1 w2a1Var3 = w2a1Var2;
                ConsumptionRecord consumptionRecord = (ConsumptionRecord) obj2;
                long jM20420p = jCurrentTimeMillis - consumptionRecord.m20420p();
                hvi0 hvi0Var = cks.f39079b;
                Object obj3 = obj;
                ils ilsVar = ils.SECONDS;
                if (jM20420p >= cks.m33199r(j6, ilsVar)) {
                    if (cks.m33199r(j4, ilsVar) > 0) {
                        if (jM20420p <= cks.m33199r(j4, ilsVar) + cks.m33199r(j6, ilsVar)) {
                            if (consumptionRecord.m20419o() >= j5) {
                                arrayList3.add(obj2);
                            }
                        }
                    } else if (consumptionRecord.m20419o() >= j5) {
                        arrayList3.add(obj2);
                    }
                }
                w2a1Var2 = w2a1Var3;
                obj = obj3;
            }
            w2a1Var = w2a1Var2;
            Object obj4 = obj;
            if (arrayList3.isEmpty()) {
                return w2a1Var;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                String strM20418n = ((ConsumptionRecord) it2.next()).m20418n();
                wj50.m88279p(strM20418n);
                if (strM20418n.length() <= 0 || (z3 && linkedHashSet.contains(strM20418n))) {
                    strM20418n = null;
                }
                if (strM20418n != null) {
                    arrayList4.add(strM20418n);
                }
            }
            if (arrayList4.isEmpty()) {
                return w2a1Var;
            }
            if (z4) {
                zux0Var.f286561g = arrayList4;
                zux0Var.f286555a = j6;
                zux0Var.f286556b = j4;
                zux0Var.f286557c = j5;
                zux0Var.f286559e = z3;
                zux0Var.f286560f = z4;
                zux0Var.f286558d = jCurrentTimeMillis;
                zux0Var.f286564t = 2;
                objM79087s = cvx0Var.m34072e(arrayList4, zux0Var);
                obj = obj4;
                if (objM79087s != obj) {
                    boolean z10 = z4;
                    arrayList = arrayList4;
                    z5 = z10;
                    j7 = j6;
                    j8 = jCurrentTimeMillis;
                    long j15 = j4;
                    z6 = z3;
                    j9 = j5;
                    j10 = j15;
                    gqxVar = (gqx) objM79087s;
                    if (gqxVar == null) {
                        return w2a1Var;
                    }
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z7 = z5;
                            j11 = j7;
                            next = null;
                            break;
                        }
                        next = it.next();
                        z7 = z5;
                        j11 = j7;
                        xawVar = (xaw) gqxVar.mo45449a(xaw.class, (String) next).f72301b;
                        if (xawVar != null) {
                            boolValueOf = Boolean.valueOf(xawVar.f259785l);
                        } else {
                            boolValueOf = null;
                        }
                        wj50.m88271j(boolValueOf, Boolean.TRUE);
                        if (wj50.m88271j(boolValueOf, Boolean.FALSE)) {
                            break;
                            break;
                        }
                        z5 = z7;
                        j7 = j11;
                    }
                    str = (String) next;
                    if (str == null) {
                        return w2a1Var;
                    }
                    z4 = z7;
                    jCurrentTimeMillis = j8;
                    j6 = j11;
                    z3 = z6;
                    j5 = j9;
                    j4 = j10;
                    str2 = str;
                    linkedHashSet.add(str2);
                    zux0Var.f286561g = null;
                    zux0Var.f286555a = j6;
                    zux0Var.f286556b = j4;
                    zux0Var.f286557c = j5;
                    zux0Var.f286559e = z3;
                    zux0Var.f286560f = z4;
                    zux0Var.f286558d = jCurrentTimeMillis;
                    zux0Var.f286564t = 3;
                    if (cvx0Var.m34071b(str2, zux0Var) == obj) {
                        return w2a1Var;
                    }
                }
            } else {
                obj = obj4;
                str = (String) g6f.m43741q0(arrayList4);
                str2 = str;
                linkedHashSet.add(str2);
                zux0Var.f286561g = null;
                zux0Var.f286555a = j6;
                zux0Var.f286556b = j4;
                zux0Var.f286557c = j5;
                zux0Var.f286559e = z3;
                zux0Var.f286560f = z4;
                zux0Var.f286558d = jCurrentTimeMillis;
                zux0Var.f286564t = 3;
                if (cvx0Var.m34071b(str2, zux0Var) == obj) {
                    return w2a1Var;
                }
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return w2a1Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m34071b(String str, ibk ibkVar) {
        yux0 yux0Var;
        if (ibkVar instanceof yux0) {
            yux0Var = (yux0) ibkVar;
            int i = yux0Var.f276502c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yux0Var.f276502c = i - Integer.MIN_VALUE;
            } else {
                yux0Var = new yux0(this, ibkVar);
            }
        } else {
            yux0Var = new yux0(this, ibkVar);
        }
        Object obj = yux0Var.f276500a;
        int i2 = yux0Var.f276502c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Single singleM78369c = ske.m78369c(this.f42571b, "spotify:consumption_threshold_reached:v1", TriggerType.CLIENT_EVENT, null, null, null, null, new DynamicTagsMetadata(str, null, null, null, 14, null), null, null, 444);
                yux0Var.f276502c = 1;
                Object objM96567o = zn91.m96567o(singleM78369c, yux0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return w2a1.f247311a;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        if (this.f42576g == null) {
            er70 er70Var = this.f42573d;
            int iM62439g = ((mp4) er70Var.get()).m62439g();
            hvi0 hvi0Var = cks.f39079b;
            int iM62440h = ((mp4) er70Var.get()).m62440h();
            ils ilsVar = ils.SECONDS;
            long jM54449D = jwg1.m54449D(iM62440h, ilsVar);
            int iM62434b = ((mp4) er70Var.get()).m62434b();
            ils ilsVar2 = ils.HOURS;
            long jM54449D2 = jwg1.m54449D(iM62434b, ilsVar2);
            long jM54449D3 = jwg1.m54449D(((mp4) er70Var.get()).m62435c(), ilsVar2);
            long jM62438f = ((mp4) er70Var.get()).m62438f();
            boolean zM62437e = ((mp4) er70Var.get()).m62437e();
            boolean zM62436d = ((mp4) er70Var.get()).m62436d();
            if (iM62439g <= 0 || cks.m33199r(jM54449D, ilsVar) <= 0) {
                return;
            }
            c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(njg1.m64613f(), this.f42575f));
            this.f42576g = c9kVarM56661c;
            x0h1.m89578u(c9kVarM56661c, null, 0, new bvx0(iM62439g, jM54449D, this, jM54449D2, jM54449D3, jM62438f, zM62437e, zM62436d, null), 3);
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        c9k c9kVar = this.f42576g;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f42576g = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m34072e(ArrayList arrayList, ibk ibkVar) {
        avx0 avx0Var;
        if (ibkVar instanceof avx0) {
            avx0Var = (avx0) ibkVar;
            int i = avx0Var.f20294c;
            if ((i & Integer.MIN_VALUE) != 0) {
                avx0Var.f20294c = i - Integer.MIN_VALUE;
            } else {
                avx0Var = new avx0(this, ibkVar);
            }
        } else {
            avx0Var = new avx0(this, ibkVar);
        }
        Object objM96567o = avx0Var.f20292a;
        int i2 = avx0Var.f20294c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleFirstOrError = ((jpx) this.f42572c).m53978b(new C1668ai("runtime-consumption-trigger", false, (gh00) new f5q0(6, arrayList))).filter(olr0.f166905i).firstOrError();
                avx0Var.f20294c = 1;
                objM96567o = zn91.m96567o(singleFirstOrError, avx0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return (gqx) objM96567o;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
    }
}
