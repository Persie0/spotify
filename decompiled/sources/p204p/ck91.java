package p204p;

import com.spotify.cosmos.cosmos.Request;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ck91 {

    /* JADX INFO: renamed from: l */
    public static final String[] f38890l;

    /* JADX INFO: renamed from: a */
    public final ljx0 f38891a;

    /* JADX INFO: renamed from: b */
    public final HashMap f38892b;

    /* JADX INFO: renamed from: c */
    public final HashMap f38893c;

    /* JADX INFO: renamed from: d */
    public final boolean f38894d;

    /* JADX INFO: renamed from: e */
    public final cv8 f38895e;

    /* JADX INFO: renamed from: g */
    public final String[] f38897g;

    /* JADX INFO: renamed from: h */
    public final bqk0 f38898h;

    /* JADX INFO: renamed from: i */
    public final mm90 f38899i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f38900j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public eh00 f38901k = new saa0(25);

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f38896f = new LinkedHashMap();

    static {
        new jb5(29);
        f38890l = new String[]{"INSERT", "UPDATE", Request.DELETE};
    }

    public ck91(ljx0 ljx0Var, HashMap map, HashMap map2, String[] strArr, boolean z, cv8 cv8Var) {
        this.f38891a = ljx0Var;
        this.f38892b = map;
        this.f38893c = map2;
        this.f38894d = z;
        this.f38895e = cv8Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            this.f38896f.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.f38892b.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.f38897g = strArr2;
        for (Map.Entry entry : this.f38892b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.f38896f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.f38896f;
                linkedHashMap.put(lowerCase4, kkc0.m56692e0(lowerCase3, linkedHashMap));
            }
        }
        this.f38898h = new bqk0(this.f38897g.length);
        this.f38899i = new mm90(this.f38897g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m33105a(ck91 ck91Var, f9q0 f9q0Var, ibk ibkVar) {
        vj91 vj91Var;
        if (ibkVar instanceof vj91) {
            vj91Var = (vj91) ibkVar;
            int i = vj91Var.f241929d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj91Var.f241929d = i - Integer.MIN_VALUE;
            } else {
                vj91Var = new vj91(ck91Var, ibkVar);
            }
        } else {
            vj91Var = new vj91(ck91Var, ibkVar);
        }
        Object objMo31798c = vj91Var.f241927b;
        int i2 = vj91Var.f241929d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo31798c);
            b771 b771Var = new b771(14);
            vj91Var.f241926a = f9q0Var;
            vj91Var.f241929d = 1;
            objMo31798c = f9q0Var.mo31798c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", b771Var, vj91Var);
            if (objMo31798c != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) vj91Var.f241926a;
            bga.m29073P(objMo31798c);
            return set;
        }
        f9q0Var = (f9q0) vj91Var.f241926a;
        bga.m29073P(objMo31798c);
        Set set2 = (Set) objMo31798c;
        if (!set2.isEmpty()) {
            vj91Var.f241926a = set2;
            vj91Var.f241929d = 2;
            if (n0e1.m63448y(f9q0Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", vj91Var) == yukVar) {
                return yukVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public static final Object m33106b(ck91 ck91Var, ibk ibkVar) throws Throwable {
        xj91 xj91Var;
        bxb bxbVar;
        ljx0 ljx0Var = ck91Var.f38891a;
        if (ibkVar instanceof xj91) {
            xj91Var = (xj91) ibkVar;
            int i = xj91Var.f262079d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj91Var.f262079d = i - Integer.MIN_VALUE;
            } else {
                xj91Var = new xj91(ck91Var, ibkVar);
            }
        } else {
            xj91Var = new xj91(ck91Var, ibkVar);
        }
        Object obj = xj91Var.f262077b;
        int i2 = xj91Var.f262079d;
        if (i2 == 0) {
            bga.m29073P(obj);
            bxb bxbVar2 = ljx0Var.f134170g;
            boolean zM30797k = bxbVar2.m30797k();
            gbu gbuVar = gbu.f78413a;
            if (!zM30797k) {
                return gbuVar;
            }
            try {
                if (!ck91Var.f38900j.compareAndSet(true, false)) {
                    bxbVar2.m30784P();
                    return gbuVar;
                }
                if (!((Boolean) ck91Var.f38901k.invoke()).booleanValue()) {
                    bxbVar2.m30784P();
                    return gbuVar;
                }
                o8t0 o8t0Var = new o8t0(ck91Var, (fbk) null, 6);
                xj91Var.f262076a = bxbVar2;
                xj91Var.f262079d = 1;
                Object objM59195y = ljx0Var.m59195y(false, o8t0Var, xj91Var);
                yuk yukVar = yuk.f276404a;
                if (objM59195y == yukVar) {
                    return yukVar;
                }
                bxbVar = bxbVar2;
                obj = objM59195y;
            } catch (Throwable th) {
                th = th;
                bxbVar = bxbVar2;
                bxbVar.m30784P();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bxbVar = xj91Var.f262076a;
            try {
                bga.m29073P(obj);
            } catch (Throwable th2) {
                th = th2;
                bxbVar.m30784P();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            ck91Var.f38899i.m62279g(set);
            ck91Var.f38895e.invoke(set);
        }
        bxbVar.m30784P();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (p204p.n0e1.m63448y(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        if (p204p.n0e1.m63448y(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c7 -> B:28:0x00ca). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m33107c(ck91 ck91Var, gy81 gy81Var, int i, ibk ibkVar) {
        yj91 yj91Var;
        int i2;
        int i3;
        String[] strArr;
        f9q0 f9q0Var;
        int i4;
        String str;
        String str2;
        boolean z;
        f9q0 f9q0Var2 = gy81Var;
        int i5 = i;
        ck91Var.getClass();
        if (ibkVar instanceof yj91) {
            yj91Var = (yj91) ibkVar;
            int i6 = yj91Var.f273333i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                yj91Var.f273333i = i6 - Integer.MIN_VALUE;
            } else {
                yj91Var = new yj91(ck91Var, ibkVar);
            }
        } else {
            yj91Var = new yj91(ck91Var, ibkVar);
        }
        Object obj = yj91Var.f273331g;
        int i7 = yj91Var.f273333i;
        boolean z2 = true;
        yuk yukVar = yuk.f276404a;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = yj91Var.f273328d;
                f9q0 f9q0Var3 = yj91Var.f273325a;
                bga.m29073P(obj);
                i5 = i8;
                f9q0Var2 = f9q0Var3;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = yj91Var.f273330f;
                i3 = yj91Var.f273329e;
                i2 = yj91Var.f273328d;
                strArr = yj91Var.f273327c;
                str = yj91Var.f273326b;
                f9q0Var = yj91Var.f273325a;
                bga.m29073P(obj);
                z = true;
            }
            i3++;
            z2 = z;
            if (i3 < i4) {
                return w2a1.f247311a;
            }
            String str3 = strArr[i3];
            if (ck91Var.f38894d) {
                str2 = "TEMP";
            } else {
                str2 = "";
            }
            z = z2;
            StringBuilder sbM38573v = edb.m38573v("CREATE ", str2, " TRIGGER IF NOT EXISTS `", jb5.m52869e(str, str3), "` AFTER ");
            klh.m56844p(sbM38573v, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            String strM56832d = klh.m56832d(i2, " AND invalidated = 0; END", sbM38573v);
            yj91Var.f273325a = f9q0Var;
            yj91Var.f273326b = str;
            yj91Var.f273327c = strArr;
            yj91Var.f273328d = i2;
            yj91Var.f273329e = i3;
            yj91Var.f273330f = i4;
            yj91Var.f273333i = 2;
        } else {
            bga.m29073P(obj);
            String str4 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)";
            yj91Var.f273325a = f9q0Var2;
            yj91Var.f273328d = i5;
            yj91Var.f273333i = 1;
        }
        String str5 = ck91Var.f38897g[i5];
        i2 = i5;
        i3 = 0;
        strArr = f38890l;
        f9q0Var = f9q0Var2;
        i4 = 3;
        str = str5;
        if (i3 < i4) {
            return w2a1.f247311a;
        }
        String str6 = strArr[i3];
        if (ck91Var.f38894d) {
            str2 = "TEMP";
        } else {
            str2 = "";
        }
        z = z2;
        StringBuilder sbM38573v2 = edb.m38573v("CREATE ", str2, " TRIGGER IF NOT EXISTS `", jb5.m52869e(str, str6), "` AFTER ");
        klh.m56844p(sbM38573v2, str6, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
        String strM56832d2 = klh.m56832d(i2, " AND invalidated = 0; END", sbM38573v2);
        yj91Var.f273325a = f9q0Var;
        yj91Var.f273326b = str;
        yj91Var.f273327c = strArr;
        yj91Var.f273328d = i2;
        yj91Var.f273329e = i3;
        yj91Var.f273330f = i4;
        yj91Var.f273333i = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0070 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m33108d(p204p.ck91 r7, p204p.gy81 r8, int r9, p204p.ibk r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof p204p.zj91
            if (r0 == 0) goto L16
            r0 = r10
            p.zj91 r0 = (p204p.zj91) r0
            int r1 = r0.f283403h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f283403h = r1
            goto L1b
        L16:
            p.zj91 r0 = new p.zj91
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f283401f
            int r1 = r0.f283403h
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r7 = r0.f283400e
            int r8 = r0.f283399d
            java.lang.String[] r9 = r0.f283398c
            java.lang.String r1 = r0.f283397b
            p.f9q0 r3 = r0.f283396a
            p204p.bga.m29073P(r10)
            r10 = r9
            r9 = r3
            goto L73
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            p204p.bga.m29073P(r10)
            java.lang.String[] r7 = r7.f38897g
            r7 = r7[r9]
            java.lang.String[] r9 = p204p.ck91.f38890l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4e:
            if (r8 >= r7) goto L75
            r3 = r10[r8]
            java.lang.String r3 = p204p.jb5.m52869e(r1, r3)
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = p204p.dq60.m36608h(r5, r4, r3)
            r0.f283396a = r9
            r0.f283397b = r1
            r0.f283398c = r10
            r0.f283399d = r8
            r0.f283400e = r7
            r0.f283403h = r2
            java.lang.Object r3 = p204p.n0e1.m63448y(r9, r3, r0)
            p.yuk r4 = p204p.yuk.f276404a
            if (r3 != r4) goto L73
            return r4
        L73:
            int r8 = r8 + r2
            goto L4e
        L75:
            p.w2a1 r7 = p204p.w2a1.f247311a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ck91.m33108d(p.ck91, p.gy81, int, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final void m33109e(eh00 eh00Var, eh00 eh00Var2) {
        if (this.f38900j.compareAndSet(false, true)) {
            eh00Var.invoke();
            c9k c9kVar = this.f38891a.f134164a;
            fbk fbkVar = null;
            if (c9kVar != null) {
                x0h1.m89578u(c9kVar, new uuk("Room Invalidation Tracker Refresh"), 0, new xw61(this, eh00Var2, fbkVar, 25), 2);
            } else {
                wj50.m88260d0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m33110f(ibk ibkVar) {
        ak91 ak91Var;
        bxb bxbVar;
        if (ibkVar instanceof ak91) {
            ak91Var = (ak91) ibkVar;
            int i = ak91Var.f16470d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ak91Var.f16470d = i - Integer.MIN_VALUE;
            } else {
                ak91Var = new ak91(this, ibkVar);
            }
        } else {
            ak91Var = new ak91(this, ibkVar);
        }
        Object obj = ak91Var.f16468b;
        int i2 = ak91Var.f16470d;
        if (i2 == 0) {
            bga.m29073P(obj);
            ljx0 ljx0Var = this.f38891a;
            bxb bxbVar2 = ljx0Var.f134170g;
            if (bxbVar2.m30797k()) {
                try {
                    oj71 oj71Var = new oj71(this, null, 7);
                    ak91Var.f16467a = bxbVar2;
                    ak91Var.f16470d = 1;
                    Object objM59195y = ljx0Var.m59195y(false, oj71Var, ak91Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM59195y == yukVar) {
                        return yukVar;
                    }
                    bxbVar = bxbVar2;
                    bxbVar.m30784P();
                } catch (Throwable th) {
                    th = th;
                    bxbVar = bxbVar2;
                    bxbVar.m30784P();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bxbVar = ak91Var.f16467a;
            try {
                bga.m29073P(obj);
                bxbVar.m30784P();
            } catch (Throwable th2) {
                th = th2;
                bxbVar.m30784P();
                throw th;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final pqm0 m33111g(String[] strArr) {
        x401 x401Var = new x401();
        for (String str : strArr) {
            Set set = (Set) this.f38893c.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                x401Var.addAll(set);
            } else {
                x401Var.add(str);
            }
        }
        String[] strArr2 = (String[]) n0e1.m63425d(x401Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) this.f38896f.get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i] = num.intValue();
        }
        return pft0.m69840u(strArr2, iArr);
    }
}
