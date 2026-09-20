package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Capping;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative;
import com.spotify.pendragon.p123v1.proto.InAppMessage;
import com.spotify.pendragon.p123v1.proto.Trigger;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class nwo implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159244a;

    /* JADX INFO: renamed from: b */
    public final Object f159245b;

    /* JADX INFO: renamed from: c */
    public final Object f159246c;

    /* JADX INFO: renamed from: d */
    public final Object f159247d;

    public /* synthetic */ nwo(Object obj, Object obj2, Object obj3, int i) {
        this.f159244a = i;
        this.f159245b = obj;
        this.f159246c = obj2;
        this.f159247d = obj3;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m65797a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: e */
    public AssertionError m65798e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + zma0.f284205b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((bna0) this.f159245b));
        bna0.m29935e(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: f */
    public AssertionError m65799f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((bna0) this.f159245b));
        bna0.m29935e(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: g */
    public AssertionError m65800g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((bna0) this.f159245b), th);
        bna0.m29935e(assertionError);
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:23:0x00d2, B:26:0x00dd, B:28:0x00e3, B:30:0x00e7, B:35:0x00f2, B:36:0x00f5, B:38:0x00f8, B:40:0x00fe, B:42:0x0102, B:43:0x0105, B:44:0x0108, B:46:0x010b, B:60:0x012f, B:64:0x013b, B:65:0x013f, B:66:0x0140, B:67:0x0142, B:72:0x014b, B:74:0x0156, B:75:0x015a, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:80:0x0165, B:82:0x0167, B:83:0x016b, B:69:0x0144, B:70:0x0148, B:62:0x0135, B:78:0x015f, B:49:0x0112, B:53:0x0121, B:57:0x0129, B:58:0x012d), top: B:172:0x00d2, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:23:0x00d2, B:26:0x00dd, B:28:0x00e3, B:30:0x00e7, B:35:0x00f2, B:36:0x00f5, B:38:0x00f8, B:40:0x00fe, B:42:0x0102, B:43:0x0105, B:44:0x0108, B:46:0x010b, B:60:0x012f, B:64:0x013b, B:65:0x013f, B:66:0x0140, B:67:0x0142, B:72:0x014b, B:74:0x0156, B:75:0x015a, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:80:0x0165, B:82:0x0167, B:83:0x016b, B:69:0x0144, B:70:0x0148, B:62:0x0135, B:78:0x015f, B:49:0x0112, B:53:0x0121, B:57:0x0129, B:58:0x012d), top: B:172:0x00d2, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0102 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:23:0x00d2, B:26:0x00dd, B:28:0x00e3, B:30:0x00e7, B:35:0x00f2, B:36:0x00f5, B:38:0x00f8, B:40:0x00fe, B:42:0x0102, B:43:0x0105, B:44:0x0108, B:46:0x010b, B:60:0x012f, B:64:0x013b, B:65:0x013f, B:66:0x0140, B:67:0x0142, B:72:0x014b, B:74:0x0156, B:75:0x015a, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:80:0x0165, B:82:0x0167, B:83:0x016b, B:69:0x0144, B:70:0x0148, B:62:0x0135, B:78:0x015f, B:49:0x0112, B:53:0x0121, B:57:0x0129, B:58:0x012d), top: B:172:0x00d2, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0105 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:23:0x00d2, B:26:0x00dd, B:28:0x00e3, B:30:0x00e7, B:35:0x00f2, B:36:0x00f5, B:38:0x00f8, B:40:0x00fe, B:42:0x0102, B:43:0x0105, B:44:0x0108, B:46:0x010b, B:60:0x012f, B:64:0x013b, B:65:0x013f, B:66:0x0140, B:67:0x0142, B:72:0x014b, B:74:0x0156, B:75:0x015a, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:80:0x0165, B:82:0x0167, B:83:0x016b, B:69:0x0144, B:70:0x0148, B:62:0x0135, B:78:0x015f, B:49:0x0112, B:53:0x0121, B:57:0x0129, B:58:0x012d), top: B:172:0x00d2, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x010b A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {all -> 0x00ed, blocks: (B:23:0x00d2, B:26:0x00dd, B:28:0x00e3, B:30:0x00e7, B:35:0x00f2, B:36:0x00f5, B:38:0x00f8, B:40:0x00fe, B:42:0x0102, B:43:0x0105, B:44:0x0108, B:46:0x010b, B:60:0x012f, B:64:0x013b, B:65:0x013f, B:66:0x0140, B:67:0x0142, B:72:0x014b, B:74:0x0156, B:75:0x015a, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:80:0x0165, B:82:0x0167, B:83:0x016b, B:69:0x0144, B:70:0x0148, B:62:0x0135, B:78:0x015f, B:49:0x0112, B:53:0x0121, B:57:0x0129, B:58:0x012d), top: B:172:0x00d2, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:49:0x0112, B:53:0x0121, B:57:0x0129, B:58:0x012d), top: B:173:0x0112, outer: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, java.util.List] */
    @Override // p204p.gh00
    public Object invoke(Object obj) {
        boolean z;
        boolean z2;
        MessageType messageType;
        Object objPut;
        ana0 ana0VarMo29939d;
        switch (this.f159244a) {
            case 0:
                ph3 ph3Var = (ph3) obj;
                fa80 fa80Var = ph3Var.f177455c;
                jz80 jz80Var = ph3Var.f177454b;
                int iM38688s = eem.m38688s(jz80Var.f117620c);
                boolean zBooleanValue = ((Boolean) ((C2483v5) this.f159246c).invoke(ph3Var)).booleanValue();
                gvl0 gvl0Var = jz80Var.f117618a;
                qf40 qf40VarM67574x = opo.m67574x(gvl0Var.f84783d);
                dw50 dw50Var = jz80Var.f117620c;
                qf40 qf40VarM67574x2 = opo.m67574x(eem.m38689t(dw50Var));
                boolean z3 = iM38688s > 0 || !qf40VarM67574x2.isEmpty();
                tqr0 tqr0Var = (tqr0) fa80Var.m41144c(imr0.f103771a);
                Boolean bool = (Boolean) fa80Var.m41144c(so50.f211096a);
                boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                hbj hbjVarM45898g = gvl0Var.m45898g();
                hs61 hs61Var = hbjVarM45898g != null ? new hs61(hbjVarM45898g.f89551a, hbjVarM45898g.f89552b, 0) : null;
                int iM38693x = eem.m38693x(dw50Var);
                int i = jz80Var.f117619b.f87908c;
                String str = (String) fa80Var.m41144c(cep0.f37165a);
                boolean z4 = !((Boolean) fa80Var.m41144c(nap0.f152107a)).booleanValue();
                ibj ibjVarM69936c = ph3Var.m69936c();
                ebj ebjVar = ibjVarM69936c instanceof ebj ? (ebj) ibjVarM69936c : null;
                String str2 = ebjVar != null ? ebjVar.f57946a : null;
                ibj ibjVar = gvl0Var.f84784e;
                ebj ebjVar2 = ibjVar instanceof ebj ? (ebj) ibjVar : null;
                String str3 = ebjVar2 != null ? ebjVar2.f57947b : null;
                boolean zM48231B = ((hqe1) this.f159247d).m48231B();
                boolean z5 = (qf40VarM67574x2.isEmpty() && qf40VarM67574x.isEmpty()) ? false : true;
                if (((Boolean) fa80Var.m41144c(ep50.f61550a)).booleanValue() && ((AbstractC2282q6) qf40VarM67574x).isEmpty()) {
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
                boolean z6 = z;
                kl20 kl20Var = new kl20(str2, z4, str3, str, zBooleanValue, z3, tqr0Var, zM48231B, new h7z(iM38693x, i, z5, zBooleanValue2, z2, hs61Var, qf40VarM67574x, qf40VarM67574x2));
                xw80 xw80VarM36551a = ((dop) this.f159245b).m36551a(ph3Var);
                ?? r12 = xw80VarM36551a.f266614b;
                return new pqe1(gvl0Var.f84784e, iM38688s, zBooleanValue, (!(((dw50Var instanceof i6a0) || (dw50Var instanceof xv50) || (dw50Var instanceof yv50)) ? true : dw50Var instanceof zv50 ? ((zv50) dw50Var).f286619a instanceof i6a0 : z6) || fa80Var.m41144c(a6q0.f12841a) == null || fa80Var.m41144c(oo50.f167466a) == null) ? z6 : true, kl20Var, xw80VarM36551a.f266613a, r12, ((Boolean) fa80Var.m41144c(a8l0.f13321a)).booleanValue() ? 2 : 1);
            case 1:
                InAppMessage inAppMessage = (InAppMessage) obj;
                String strM17228v = inAppMessage.m17228v();
                long jM17225s = inAppMessage.m17225s();
                Long lValueOf = Long.valueOf(inAppMessage.m17224r());
                MessageCreative messageCreative = (MessageCreative) ((qme0) this.f159245b).invoke(inAppMessage.m17223p());
                Capping capping = (Capping) ((sn91) this.f159246c).invoke(inAppMessage.m17222o());
                ae50<Trigger> ae50VarM17227u = inAppMessage.m17227u();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM17227u, 10));
                for (Trigger trigger : ae50VarM17227u) {
                    b321 b321Var = (b321) this.f159247d;
                    wj50.m88279p(trigger);
                    arrayList.add((com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger) b321Var.invoke(trigger));
                }
                String strName = inAppMessage.m17226t().name();
                MessageType messageType2 = MessageType.MARKETING;
                MessageType[] messageTypeArrValues = MessageType.values();
                int length = messageTypeArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        messageType = messageTypeArrValues[i2];
                        if (!wj50.m88271j(messageType.name(), strName)) {
                            i2++;
                        }
                    } else {
                        messageType = null;
                    }
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage(strM17228v, jM17225s, lValueOf, messageCreative, capping, arrayList, messageType == null ? messageType2 : messageType);
            case 2:
                bna0 bna0Var = (bna0) this.f159245b;
                r4z r4zVar = bna0Var.f28745b;
                uc21 uc21Var = bna0Var.f28744a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f159246c;
                Object obj2 = concurrentHashMap.get(obj);
                Object obj3 = igg1.f101990a;
                AssertionError assertionErrorM65799f = null;
                zma0 zma0Var = zma0.f284205b;
                if (obj2 != null && obj2 != zma0Var) {
                    igg1.m50547z(obj2);
                    if (obj2 == obj3) {
                        return null;
                    }
                    return obj2;
                }
                uc21Var.lock();
                try {
                    Object objInvoke = concurrentHashMap.get(obj);
                    zma0 zma0Var2 = zma0.f284206c;
                    if (objInvoke == zma0Var) {
                        ana0 ana0VarMo29939d2 = bna0Var.mo29939d(obj, "");
                        if (ana0VarMo29939d2 == null) {
                            m65797a(3);
                            throw null;
                        }
                        if (ana0VarMo29939d2.f17349b) {
                            objInvoke = zma0Var2;
                            if (objInvoke != zma0Var2) {
                                ana0VarMo29939d = bna0Var.mo29939d(obj, "");
                                if (ana0VarMo29939d != null) {
                                    m65797a(3);
                                    throw null;
                                }
                                if (!ana0VarMo29939d.f17349b) {
                                    objInvoke = ana0VarMo29939d.f17350c;
                                } else {
                                    if (objInvoke != null) {
                                        concurrentHashMap.put(obj, zma0Var);
                                        objInvoke = ((gh00) this.f159247d).invoke(obj);
                                        if (objInvoke == null) {
                                            obj3 = objInvoke;
                                        }
                                        objPut = concurrentHashMap.put(obj, obj3);
                                        if (objPut == zma0Var) {
                                            assertionErrorM65799f = m65799f(obj, objPut);
                                            throw assertionErrorM65799f;
                                        }
                                        uc21Var.unlock();
                                        throw th;
                                    }
                                    igg1.m50547z(objInvoke);
                                    if (objInvoke == obj3) {
                                        objInvoke = null;
                                    }
                                }
                            } else {
                                if (objInvoke != null) {
                                    concurrentHashMap.put(obj, zma0Var);
                                    objInvoke = ((gh00) this.f159247d).invoke(obj);
                                    if (objInvoke == null) {
                                        obj3 = objInvoke;
                                    }
                                    objPut = concurrentHashMap.put(obj, obj3);
                                    if (objPut == zma0Var) {
                                        assertionErrorM65799f = m65799f(obj, objPut);
                                        throw assertionErrorM65799f;
                                    }
                                    uc21Var.unlock();
                                    throw th;
                                }
                                igg1.m50547z(objInvoke);
                                if (objInvoke == obj3) {
                                    objInvoke = null;
                                }
                            }
                        } else {
                            objInvoke = ana0VarMo29939d2.f17350c;
                        }
                    } else if (objInvoke != zma0Var2) {
                        ana0VarMo29939d = bna0Var.mo29939d(obj, "");
                        if (ana0VarMo29939d != null) {
                            m65797a(3);
                            throw null;
                        }
                        if (!ana0VarMo29939d.f17349b) {
                            objInvoke = ana0VarMo29939d.f17350c;
                        } else {
                            if (objInvoke != null) {
                                concurrentHashMap.put(obj, zma0Var);
                                objInvoke = ((gh00) this.f159247d).invoke(obj);
                                if (objInvoke == null) {
                                    obj3 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj3);
                                if (objPut == zma0Var) {
                                    assertionErrorM65799f = m65799f(obj, objPut);
                                    throw assertionErrorM65799f;
                                }
                                uc21Var.unlock();
                                throw th;
                            }
                            igg1.m50547z(objInvoke);
                            if (objInvoke == obj3) {
                                objInvoke = null;
                            }
                        }
                    } else {
                        if (objInvoke != null) {
                            try {
                                concurrentHashMap.put(obj, zma0Var);
                                objInvoke = ((gh00) this.f159247d).invoke(obj);
                                if (objInvoke == null) {
                                    obj3 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj3);
                                if (objPut == zma0Var) {
                                    assertionErrorM65799f = m65799f(obj, objPut);
                                    throw assertionErrorM65799f;
                                }
                            } catch (Throwable th) {
                                if (o2h1.m66117k(th)) {
                                    try {
                                        Object objRemove = concurrentHashMap.remove(obj);
                                        if (objRemove != zma0Var) {
                                            throw m65798e(obj, objRemove);
                                        }
                                        throw th;
                                    } catch (Throwable th2) {
                                        throw m65800g(obj, th2);
                                    }
                                }
                                if (th != assertionErrorM65799f) {
                                    Object objPut2 = concurrentHashMap.put(obj, new bfe1(th));
                                    if (objPut2 != zma0Var) {
                                        throw m65799f(obj, objPut2);
                                    }
                                    r4zVar.getClass();
                                    throw th;
                                }
                                try {
                                    concurrentHashMap.remove(obj);
                                    r4zVar.getClass();
                                    throw th;
                                } catch (Throwable th3) {
                                    throw m65800g(obj, th3);
                                }
                            }
                            uc21Var.unlock();
                            throw th;
                        }
                        igg1.m50547z(objInvoke);
                        if (objInvoke == obj3) {
                            objInvoke = null;
                        }
                    }
                    uc21Var.unlock();
                    return objInvoke;
                } catch (Throwable th4) {
                    uc21Var.unlock();
                    throw th4;
                }
            case 3:
                return ((Single) ((ni00) this.f159246c).invoke()).flatMapCompletable(new b5y0(0, this, (a6z) obj));
            case 4:
                k501 k501Var = (k501) obj;
                String strMo58188y = k501Var.f119380b.mo58188y();
                w5s w5sVar = (w5s) this.f159247d;
                int i3 = 28;
                return Single.zip(((Single) w5sVar.invoke(strMo58188y)).flatMap(new gjs0(this, i3)), ((Single) w5sVar.invoke(k501Var.f119381c.mo51879m())).flatMap(new gjs0(this, i3)), mkr0.f144663t).flatMapCompletable(new khy0(3, k501Var, this));
            case 5:
                w37 w37Var = (w37) this.f159247d;
                long j = ((fuc0) obj).f73469a;
                nzx0 nzx0Var = new nzx0(new cp41(this, j, null));
                w37Var.getClass();
                return nxf1.m65828g(new v37(nzx0Var, w37Var, j, null));
            default:
                mxd0 mxd0Var = (mxd0) this.f159247d;
                gb80 gb80Var = (gb80) this.f159246c;
                luk lukVar = (luk) this.f159245b;
                dau dauVar = dau.f47107a;
                if (lukVar.mo30645P(dauVar)) {
                    lukVar.mo30646r(dauVar, new wpa1(7, gb80Var, mxd0Var));
                } else {
                    gb80Var.mo31988d(mxd0Var);
                }
                return w2a1.f247311a;
        }
    }

    public nwo(C2483v5 c2483v5, f501 f501Var, w5s w5sVar, b68 b68Var) {
        this.f159244a = 4;
        this.f159245b = c2483v5;
        this.f159246c = f501Var;
        this.f159247d = w5sVar;
    }
}
