package p204p;

import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l6j {

    /* JADX INFO: renamed from: a */
    public final uva f130394a;

    /* JADX INFO: renamed from: b */
    public int f130395b;

    /* JADX INFO: renamed from: c */
    public final int f130396c;

    /* JADX INFO: renamed from: d */
    public int f130397d;

    public l6j(uva uvaVar) {
        new ArrayList();
        uva uvaVarM84052K = uvaVar != null ? uvaVar.m84052K() : null;
        this.f130394a = uvaVarM84052K == null ? new uva(new char[0]) : uvaVarM84052K;
        this.f130396c = 1000;
        this.f130397d = 1000;
    }

    /* JADX INFO: renamed from: f */
    public static j6j m58343f(l6j l6jVar, sq70[] sq70VarArr) throws CLParsingException {
        float f = 0;
        tq70 tq70Var = new tq70(Integer.valueOf(l6jVar.m58348e()));
        ova ovaVar = new ova(new char[0]);
        for (sq70 sq70Var : sq70VarArr) {
            ovaVar.m71126m(wva.m89079m(sq70Var.mo78940a().toString()));
        }
        uva uvaVarM58345b = l6jVar.m58345b(tq70Var);
        uvaVarM58345b.m71124J("type", "barrier");
        uvaVarM58345b.m71124J("direction", "top");
        uvaVarM58345b.m71123I("margin", f);
        uvaVarM58345b.m71122H("contains", ovaVar);
        l6jVar.m58350h(12);
        for (sq70 sq70Var2 : sq70VarArr) {
            l6jVar.m58350h(sq70Var2.hashCode());
        }
        l6jVar.m58350h(Float.hashCode(f));
        return new j6j(tq70Var.f213033a, 0, tq70Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:192:0x035e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0362  */
    /* JADX WARN: Code duplicated, block: B:198:0x0378  */
    /* JADX WARN: Code duplicated, block: B:200:0x037c  */
    /* JADX WARN: Code duplicated, block: B:204:0x0392  */
    /* JADX WARN: Code duplicated, block: B:206:0x0396  */
    /* JADX WARN: Code duplicated, block: B:223:0x0427  */
    /* JADX WARN: Code duplicated, block: B:242:0x049d  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:265:0x0527  */
    /* JADX WARN: Code duplicated, block: B:293:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:310:0x0606  */
    /* JADX WARN: Code duplicated, block: B:339:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:362:0x0701  */
    /* JADX WARN: Code duplicated, block: B:416:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:456:0x0845  */
    /* JADX WARN: Code duplicated, block: B:536:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:646:0x0c0f  */
    /* JADX WARN: Code duplicated, block: B:734:0x0e38  */
    /* JADX WARN: Code duplicated, block: B:753:0x0e64 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:7:0x0042  */
    /* JADX WARN: Code duplicated, block: B:825:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0197 A[PHI: r20
      0x0197: PHI (r20v27 java.util.Iterator) = 
      (r20v13 java.util.Iterator)
      (r20v14 java.util.Iterator)
      (r20v15 java.util.Iterator)
      (r20v16 java.util.Iterator)
      (r20v17 java.util.Iterator)
      (r20v18 java.util.Iterator)
      (r20v19 java.util.Iterator)
      (r20v20 java.util.Iterator)
      (r20v21 java.util.Iterator)
      (r20v22 java.util.Iterator)
      (r20v23 java.util.Iterator)
      (r20v24 java.util.Iterator)
      (r20v25 java.util.Iterator)
      (r20v28 java.util.Iterator)
     binds: [B:149:0x024b, B:145:0x023e, B:141:0x0231, B:137:0x0224, B:133:0x0217, B:129:0x020a, B:125:0x01fd, B:121:0x01ee, B:117:0x01e0, B:113:0x01d0, B:109:0x01c0, B:105:0x01b2, B:101:0x01a2, B:98:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public final void m58344a(xu41 xu41Var) {
        byte b;
        uva uvaVar;
        Iterator it;
        j7j j7jVar;
        uva uvaVar2;
        String strM71119E;
        uva uvaVar3;
        String strM71119E2;
        String str;
        byte b2;
        j7j j7jVar2;
        Iterator it2;
        j7j j7jVar3;
        Iterator it3;
        int i;
        float fM71131u;
        float fM80079b;
        float f;
        float fM80079b2;
        float fM80079b3;
        float fM71131u2;
        String strM73978d;
        Iterator it4;
        byte b3;
        j7j j7jVar4;
        String str2;
        String strM73978d2;
        String str3;
        String strM71116B;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        String strM73978d3;
        String str4;
        String strM71116B2;
        int iMo73980i;
        int i2;
        int iM71133w;
        int i3;
        Float fValueOf4;
        Float f2;
        Float fValueOf5;
        j7j j7jVar5;
        ova ovaVar;
        float fM71131u3;
        float fM80079b4;
        float f3;
        j7j j7jVar6 = new j7j();
        j7jVar6.f109612a = new HashMap();
        j7jVar6.f109613b = new HashMap();
        j7jVar6.f109614c = new HashMap();
        uva uvaVar4 = this.f130394a;
        Iterator it5 = uvaVar4.m71121G().iterator();
        while (it5.hasNext()) {
            String str5 = (String) it5.next();
            qva qvaVarM71129s = uvaVar4.m71129s(str5);
            str5.getClass();
            switch (str5) {
                case "Helpers":
                    b = 0;
                    break;
                case "Generate":
                    b = 1;
                    break;
                case "Variables":
                    b = 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            String strM71117C = null;
            switch (b) {
                case 0:
                    uvaVar = uvaVar4;
                    it = it5;
                    j7jVar = j7jVar6;
                    if (qvaVarM71129s instanceof ova) {
                        ova ovaVar2 = (ova) qvaVarM71129s;
                        for (int i4 = 0; i4 < ovaVar2.f181673e.size(); i4++) {
                            qva qvaVarM71128r = ovaVar2.m71128r(i4);
                            if (qvaVarM71128r instanceof ova) {
                                ova ovaVar3 = (ova) qvaVarM71128r;
                                if (ovaVar3.f181673e.size() > 1) {
                                    String strM71116B3 = ovaVar3.m71116B(0);
                                    strM71116B3.getClass();
                                    switch (strM71116B3) {
                                        case "vGuideline":
                                            qva qvaVarM71128r2 = ovaVar3.m71128r(1);
                                            if (!(qvaVarM71128r2 instanceof uva) || (strM71119E = (uvaVar2 = (uva) qvaVarM71128r2).m71119E("id")) == null) {
                                                break;
                                            } else {
                                                jq60.m54046E(1, xu41Var, strM71119E, uvaVar2);
                                                break;
                                            }
                                            break;
                                        case "hChain":
                                            jq60.m54042A(0, xu41Var, j7jVar, ovaVar3);
                                            break;
                                        case "vChain":
                                            jq60.m54042A(1, xu41Var, j7jVar, ovaVar3);
                                            break;
                                        case "hGuideline":
                                            qva qvaVarM71128r3 = ovaVar3.m71128r(1);
                                            if ((qvaVarM71128r3 instanceof uva) && (strM71119E2 = (uvaVar3 = (uva) qvaVarM71128r3).m71119E("id")) != null) {
                                                jq60.m54046E(0, xu41Var, strM71119E2, uvaVar3);
                                            }
                                        default:
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    uvaVar = uvaVar4;
                    it = it5;
                    j7jVar = j7jVar6;
                    if (qvaVarM71129s instanceof uva) {
                        uva uvaVar5 = (uva) qvaVarM71129s;
                        for (String str6 : uvaVar5.m71121G()) {
                            qva qvaVarM71129s2 = uvaVar5.m71129s(str6);
                            HashMap map = j7jVar.f109614c;
                            ArrayList arrayList = map.containsKey(str6) ? (ArrayList) map.get(str6) : null;
                            if (arrayList != null && (qvaVarM71129s2 instanceof uva)) {
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    jq60.m54047F(xu41Var, j7jVar, (String) it6.next(), (uva) qvaVarM71129s2);
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    uvaVar = uvaVar4;
                    it = it5;
                    j7jVar = j7jVar6;
                    if (qvaVarM71129s instanceof uva) {
                        uva uvaVar6 = (uva) qvaVarM71129s;
                        for (String str7 : uvaVar6.m71121G()) {
                            qva qvaVarM71129s3 = uvaVar6.m71129s(str7);
                            if (qvaVarM71129s3 instanceof sva) {
                                j7jVar.m52625b(qvaVarM71129s3.mo73980i(), str7);
                            } else if (qvaVarM71129s3 instanceof uva) {
                                uva uvaVar7 = (uva) qvaVarM71129s3;
                                if (uvaVar7.m71120F("from") && uvaVar7.m71120F("to")) {
                                    float fM52624a = j7jVar.m52624a(uvaVar7.m71129s("from"));
                                    float fM52624a2 = j7jVar.m52624a(uvaVar7.m71129s("to"));
                                    String strM71119E3 = uvaVar7.m71119E("prefix");
                                    String strM71119E4 = uvaVar7.m71119E("postfix");
                                    HashMap map2 = j7jVar.f109613b;
                                    if (map2.containsKey(str7)) {
                                        map2.get(str7);
                                    }
                                    g7j g7jVar = new g7j();
                                    g7jVar.f77277a = false;
                                    g7jVar.f77280d = 0.0f;
                                    if (strM71119E3 == null) {
                                        strM71119E3 = "";
                                    }
                                    g7jVar.f77278b = strM71119E3;
                                    if (strM71119E4 == null) {
                                        strM71119E4 = "";
                                    }
                                    g7jVar.f77279c = strM71119E4;
                                    g7jVar.f77281e = fM52624a2;
                                    map2.put(str7, g7jVar);
                                    HashMap map3 = j7jVar.f109614c;
                                    ArrayList arrayList2 = new ArrayList();
                                    int i5 = (int) fM52624a;
                                    int i6 = (int) fM52624a2;
                                    int i7 = i5;
                                    while (i5 <= i6) {
                                        arrayList2.add(g7jVar.f77278b + i7 + g7jVar.f77279c);
                                        i7 += (int) 1.0f;
                                        i5++;
                                    }
                                    map3.put(str7, arrayList2);
                                } else if (uvaVar7.m71120F("from") && uvaVar7.m71120F("step")) {
                                    float fM52624a3 = j7jVar.m52624a(uvaVar7.m71129s("from"));
                                    float fM52624a4 = j7jVar.m52624a(uvaVar7.m71129s("step"));
                                    HashMap map4 = j7jVar.f109613b;
                                    if (map4.containsKey(str7)) {
                                        map4.get(str7);
                                    }
                                    i7j i7jVar = new i7j();
                                    i7jVar.f99569a = fM52624a4;
                                    i7jVar.f99570b = fM52624a3;
                                    map4.put(str7, i7jVar);
                                } else if (uvaVar7.m71120F("ids")) {
                                    qva qvaVarM71129s4 = uvaVar7.m71129s("ids");
                                    if (!(qvaVarM71129s4 instanceof ova)) {
                                        throw new CLParsingException("no array found for key <ids>, found [" + qvaVarM71129s4.m73981j() + "] : " + qvaVarM71129s4, uvaVar7);
                                    }
                                    ova ovaVar4 = (ova) qvaVarM71129s4;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (int i8 = 0; i8 < ovaVar4.f181673e.size(); i8++) {
                                        arrayList3.add(ovaVar4.m71116B(i8));
                                    }
                                    j7jVar.m52626c(str7, arrayList3);
                                } else if (uvaVar7.m71120F("tag")) {
                                    String strM71117C2 = uvaVar7.m71117C("tag");
                                    HashMap map5 = xu41Var.f265995e;
                                    j7jVar.m52626c(str7, map5.containsKey(strM71117C2) ? (ArrayList) map5.get(strM71117C2) : null);
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                    break;
                default:
                    if (!(qvaVarM71129s instanceof uva)) {
                        uvaVar = uvaVar4;
                        it = it5;
                        j7jVar = j7jVar6;
                        if (qvaVarM71129s instanceof sva) {
                            j7jVar.m52625b(qvaVarM71129s.mo73980i(), str5);
                        }
                        break;
                    } else {
                        uva uvaVar8 = (uva) qvaVarM71129s;
                        Iterator it7 = uvaVar8.m71121G().iterator();
                        while (true) {
                            str = "type";
                            if (it7.hasNext()) {
                                if (((String) it7.next()).equals("type")) {
                                    strM71117C = uvaVar8.m71117C("type");
                                }
                            }
                        }
                        String str8 = strM71117C;
                        if (str8 == null) {
                            uvaVar = uvaVar4;
                            it = it5;
                            j7jVar = j7jVar6;
                            jq60.m54047F(xu41Var, j7jVar, str5, uvaVar8);
                            break;
                        } else {
                            switch (str8) {
                                case "vGuideline":
                                    b2 = 0;
                                    break;
                                case "column":
                                    b2 = 1;
                                    break;
                                case "hChain":
                                    b2 = 2;
                                    break;
                                case "vChain":
                                    b2 = 3;
                                    break;
                                case "barrier":
                                    b2 = 4;
                                    break;
                                case "row":
                                    b2 = 5;
                                    break;
                                case "grid":
                                    b2 = 6;
                                    break;
                                case "hFlow":
                                    b2 = 7;
                                    break;
                                case "vFlow":
                                    b2 = 8;
                                    break;
                                case "hGuideline":
                                    b2 = 9;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            uvaVar = uvaVar4;
                            switch (b2) {
                                case 0:
                                    it = it5;
                                    j7jVar = j7jVar6;
                                    jq60.m54046E(1, xu41Var, str5, uvaVar8);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    it = it5;
                                    j7jVar = j7jVar6;
                                    v6j v6jVarM92121b = xu41Var.m92121b(str5);
                                    Object obj = v6jVarM92121b.f237880c;
                                    if (obj == null || !(obj instanceof g020)) {
                                        g020 g020Var = new g020(xu41Var, str8.charAt(0) == 'r' ? 10 : str8.charAt(0) == 'c' ? 11 : 9);
                                        v6jVarM92121b.f237880c = g020Var;
                                        v6jVarM92121b.mo61241a(g020Var.mo48198b());
                                    }
                                    g020 g020Var2 = (g020) v6jVarM92121b.f237880c;
                                    for (String str9 : uvaVar8.m71121G()) {
                                        str9.getClass();
                                        switch (str9) {
                                            case "orientation":
                                                g020Var2.f75242o0 = uvaVar8.m71129s(str9).mo73980i();
                                                break;
                                            case "padding":
                                                qva qvaVarM71129s5 = uvaVar8.m71129s(str9);
                                                if (qvaVarM71129s5 instanceof ova) {
                                                    ova ovaVar5 = (ova) qvaVarM71129s5;
                                                    if (ovaVar5.f181673e.size() > 1) {
                                                        ovaVar5.m71133w(0);
                                                        ovaVar5.m71133w(1);
                                                        if (ovaVar5.f181673e.size() > 2) {
                                                            ovaVar5.m71133w(2);
                                                            try {
                                                                try {
                                                                    ((ova) qvaVarM71129s5).m71133w(3);
                                                                    break;
                                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                                }
                                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                            }
                                                        }
                                                    } else {
                                                        qvaVarM71129s5.mo73980i();
                                                    }
                                                } else {
                                                    qvaVarM71129s5.mo73980i();
                                                }
                                                g020Var2.getClass();
                                                break;
                                            case "contains":
                                                ova ovaVarM71130t = uvaVar8.m71130t(str9);
                                                if (ovaVarM71130t != null) {
                                                    for (int i9 = 0; i9 < ovaVarM71130t.f181673e.size(); i9++) {
                                                        g020Var2.m48196Y(xu41Var.m92121b(ovaVarM71130t.m71128r(i9).m73978d()));
                                                    }
                                                }
                                                break;
                                            case "hGap":
                                                g020Var2.f75245r0 = xu41Var.f265991a.m80079b(uvaVar8.m71129s(str9).mo73979e());
                                                break;
                                            case "rows":
                                                int iMo73980i2 = uvaVar8.m71129s(str9).mo73980i();
                                                if (iMo73980i2 > 0 && g020Var2.f94002l0 != 11) {
                                                    g020Var2.f75243p0 = iMo73980i2;
                                                }
                                                break;
                                            case "vGap":
                                                g020Var2.f75246s0 = xu41Var.f265991a.m80079b(uvaVar8.m71129s(str9).mo73979e());
                                                break;
                                            case "skips":
                                                String strM73978d4 = uvaVar8.m71129s(str9).m73978d();
                                                if (strM73978d4 != null && strM73978d4.contains("x") && strM73978d4.contains(":")) {
                                                    g020Var2.f75250w0 = strM73978d4;
                                                }
                                                break;
                                            case "spans":
                                                String strM73978d5 = uvaVar8.m71129s(str9).m73978d();
                                                if (strM73978d5 != null && strM73978d5.contains("x") && strM73978d5.contains(":")) {
                                                    g020Var2.f75249v0 = strM73978d5;
                                                }
                                                break;
                                            case "rowWeights":
                                                String strM73978d6 = uvaVar8.m71129s(str9).m73978d();
                                                if (strM73978d6 != null && strM73978d6.contains(",")) {
                                                    g020Var2.f75247t0 = strM73978d6;
                                                }
                                                break;
                                            case "columns":
                                                int iMo73980i3 = uvaVar8.m71129s(str9).mo73980i();
                                                if (iMo73980i3 > 0 && g020Var2.f94002l0 != 10) {
                                                    g020Var2.f75244q0 = iMo73980i3;
                                                }
                                                break;
                                            case "columnWeights":
                                                String strM73978d7 = uvaVar8.m71129s(str9).m73978d();
                                                if (strM73978d7 != null && strM73978d7.contains(",")) {
                                                    g020Var2.f75248u0 = strM73978d7;
                                                }
                                                break;
                                            default:
                                                jq60.m54066l(str9, uvaVar8, xu41Var.m92121b(str5), j7jVar, xu41Var);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                case 3:
                                    j7jVar2 = j7jVar6;
                                    it = it5;
                                    djc djcVarM92126g = str8.charAt(0) == 'h' ? xu41Var.m92126g() : xu41Var.m92129j();
                                    djcVarM92126g.f237876a = str5;
                                    Iterator it8 = uvaVar8.m71121G().iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            String str10 = (String) it8.next();
                                            str10.getClass();
                                            switch (str10) {
                                                case "bottom":
                                                case "end":
                                                case "top":
                                                case "left":
                                                case "right":
                                                case "start":
                                                    it2 = it8;
                                                    j7jVar3 = j7jVar2;
                                                    jq60.m54043B(str10, uvaVar8, djcVarM92126g, j7jVar3, xu41Var);
                                                    j7jVar2 = j7jVar3;
                                                    it8 = it2;
                                                    break;
                                                case "contains":
                                                    qva qvaVarM71129s6 = uvaVar8.m71129s(str10);
                                                    if (qvaVarM71129s6 instanceof ova) {
                                                        ova ovaVar6 = (ova) qvaVarM71129s6;
                                                        if (ovaVar6.f181673e.size() >= 1) {
                                                            int i10 = 0;
                                                            while (i10 < ovaVar6.f181673e.size()) {
                                                                qva qvaVarM71128r4 = ovaVar6.m71128r(i10);
                                                                if (qvaVarM71128r4 instanceof ova) {
                                                                    ova ovaVar7 = (ova) qvaVarM71128r4;
                                                                    if (ovaVar7.f181673e.size() > 0) {
                                                                        String strM73978d8 = ovaVar7.m71128r(0).m73978d();
                                                                        it3 = it8;
                                                                        int size = ovaVar7.f181673e.size();
                                                                        i = i10;
                                                                        if (size != 2) {
                                                                            if (size == 3) {
                                                                                fM71131u2 = ovaVar7.m71131u(1);
                                                                                fM80079b = xu41Var.m92123d().m80079b(ovaVar7.m71131u(2));
                                                                                fM80079b3 = fM80079b;
                                                                            } else if (size == 4) {
                                                                                fM71131u2 = ovaVar7.m71131u(1);
                                                                                float fM80079b5 = xu41Var.m92123d().m80079b(ovaVar7.m71131u(2));
                                                                                fM80079b = xu41Var.f265991a.m80079b(ovaVar7.m71131u(3));
                                                                                fM80079b3 = fM80079b5;
                                                                            } else if (size != 6) {
                                                                                fM80079b = Float.NaN;
                                                                                f = Float.NaN;
                                                                                fM80079b2 = Float.NaN;
                                                                                fM71131u = Float.NaN;
                                                                                fM80079b3 = Float.NaN;
                                                                            } else {
                                                                                float fM71131u4 = ovaVar7.m71131u(1);
                                                                                fM80079b3 = xu41Var.m92123d().m80079b(ovaVar7.m71131u(2));
                                                                                float fM80079b6 = xu41Var.f265991a.m80079b(ovaVar7.m71131u(3));
                                                                                float fM80079b7 = xu41Var.f265991a.m80079b(ovaVar7.m71131u(4));
                                                                                fM80079b2 = xu41Var.f265991a.m80079b(ovaVar7.m71131u(5));
                                                                                fM80079b = fM80079b6;
                                                                                fM71131u = fM71131u4;
                                                                                f = fM80079b7;
                                                                            }
                                                                            fM71131u = fM71131u2;
                                                                            f = Float.NaN;
                                                                            fM80079b2 = Float.NaN;
                                                                        } else {
                                                                            fM71131u = ovaVar7.m71131u(1);
                                                                            fM80079b = Float.NaN;
                                                                            f = Float.NaN;
                                                                            fM80079b2 = Float.NaN;
                                                                            fM80079b3 = Float.NaN;
                                                                        }
                                                                        djcVarM92126g.m48196Y(strM73978d8);
                                                                        String string = strM73978d8.toString();
                                                                        if (!Float.isNaN(fM71131u)) {
                                                                            djcVarM92126g.f49648o0.put(string, Float.valueOf(fM71131u));
                                                                        }
                                                                        if (!Float.isNaN(fM80079b3)) {
                                                                            djcVarM92126g.f49649p0.put(string, Float.valueOf(fM80079b3));
                                                                        }
                                                                        if (!Float.isNaN(fM80079b)) {
                                                                            djcVarM92126g.f49650q0.put(string, Float.valueOf(fM80079b));
                                                                        }
                                                                        if (!Float.isNaN(f)) {
                                                                            if (djcVarM92126g.f49651r0 == null) {
                                                                                djcVarM92126g.f49651r0 = new HashMap();
                                                                            }
                                                                            djcVarM92126g.f49651r0.put(string, Float.valueOf(f));
                                                                        }
                                                                        if (!Float.isNaN(fM80079b2)) {
                                                                            if (djcVarM92126g.f49652s0 == null) {
                                                                                djcVarM92126g.f49652s0 = new HashMap();
                                                                            }
                                                                            djcVarM92126g.f49652s0.put(string, Float.valueOf(fM80079b2));
                                                                        }
                                                                    } else {
                                                                        it3 = it8;
                                                                        i = i10;
                                                                    }
                                                                } else {
                                                                    it3 = it8;
                                                                    i = i10;
                                                                    djcVarM92126g.m48196Y(qvaVarM71128r4.m73978d());
                                                                }
                                                                i10 = i + 1;
                                                                it8 = it3;
                                                            }
                                                            it2 = it8;
                                                            j7jVar3 = j7jVar2;
                                                            j7jVar2 = j7jVar3;
                                                            it8 = it2;
                                                            break;
                                                        }
                                                    }
                                                    PrintStream printStream = System.err;
                                                    StringBuilder sbM75191i = rbz.m75191i(str5, " contains should be an array \"");
                                                    sbM75191i.append(qvaVarM71129s6.m73978d());
                                                    sbM75191i.append("\"");
                                                    printStream.println(sbM75191i.toString());
                                                    break;
                                                case "style":
                                                    qva qvaVarM71129s7 = uvaVar8.m71129s(str10);
                                                    if (qvaVarM71129s7 instanceof ova) {
                                                        ova ovaVar8 = (ova) qvaVarM71129s7;
                                                        if (ovaVar8.f181673e.size() > 1) {
                                                            strM73978d = ovaVar8.m71116B(0);
                                                            djcVarM92126g.f49647n0 = ovaVar8.m71131u(1);
                                                        } else {
                                                            strM73978d = qvaVarM71129s7.m73978d();
                                                        }
                                                    } else {
                                                        strM73978d = qvaVarM71129s7.m73978d();
                                                    }
                                                    strM73978d.getClass();
                                                    if (strM73978d.equals("packed")) {
                                                        djcVarM92126g.f49653t0 = ps41.f180746c;
                                                    } else if (strM73978d.equals("spread_inside")) {
                                                        djcVarM92126g.f49653t0 = ps41.f180745b;
                                                    } else {
                                                        djcVarM92126g.f49653t0 = ps41.f180744a;
                                                    }
                                                    it2 = it8;
                                                    j7jVar3 = j7jVar2;
                                                    j7jVar2 = j7jVar3;
                                                    it8 = it2;
                                                    break;
                                                default:
                                                    it2 = it8;
                                                    j7jVar3 = j7jVar2;
                                                    j7jVar2 = j7jVar3;
                                                    it8 = it2;
                                                    break;
                                            }
                                        }
                                        j7jVar = j7jVar2;
                                        break;
                                    }
                                    break;
                                case 4:
                                    j7jVar2 = j7jVar6;
                                    it = it5;
                                    boolean z = xu41Var.f265992b;
                                    v6j v6jVarM92121b2 = xu41Var.m92121b(str5);
                                    Object obj2 = v6jVarM92121b2.f237880c;
                                    if (obj2 == null || !(obj2 instanceof jx8)) {
                                        jx8 jx8Var = new jx8(xu41Var, 5);
                                        jx8Var.f117050n0 = 4;
                                        v6jVarM92121b2.f237880c = jx8Var;
                                        v6jVarM92121b2.mo61241a(jx8Var.mo48198b());
                                    }
                                    jx8 jx8Var2 = (jx8) v6jVarM92121b2.f237880c;
                                    for (String str11 : uvaVar8.m71121G()) {
                                        str11.getClass();
                                        switch (str11) {
                                            case "margin":
                                                qva qvaVarM71115A = uvaVar8.m71115A(str11);
                                                float fMo73979e = qvaVarM71115A instanceof sva ? qvaVarM71115A.mo73979e() : Float.NaN;
                                                if (!Float.isNaN(fMo73979e)) {
                                                    jx8Var2.mo54626z(Float.valueOf(xu41Var.f265991a.m80079b(fMo73979e)));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                                break;
                                            case "direction":
                                                String strM71117C3 = uvaVar8.m71117C(str11);
                                                strM71117C3.getClass();
                                                switch (strM71117C3) {
                                                    case "bottom":
                                                        jx8Var2.f117050n0 = 6;
                                                        break;
                                                    case "end":
                                                        if (!z) {
                                                            jx8Var2.f117050n0 = 1;
                                                            break;
                                                        } else {
                                                            jx8Var2.f117050n0 = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case "top":
                                                        jx8Var2.f117050n0 = 5;
                                                        break;
                                                    case "left":
                                                        jx8Var2.f117050n0 = 1;
                                                        break;
                                                    case "right":
                                                        jx8Var2.f117050n0 = 2;
                                                        break;
                                                    case "start":
                                                        if (!z) {
                                                            jx8Var2.f117050n0 = 2;
                                                            break;
                                                        } else {
                                                            jx8Var2.f117050n0 = 1;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                break;
                                            case "contains":
                                                ova ovaVarM71130t2 = uvaVar8.m71130t(str11);
                                                if (ovaVarM71130t2 == null) {
                                                    break;
                                                } else {
                                                    for (int i11 = 0; i11 < ovaVarM71130t2.f181673e.size(); i11++) {
                                                        jx8Var2.m48196Y(xu41Var.m92121b(ovaVarM71130t2.m71128r(i11).m73978d()));
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    j7jVar = j7jVar2;
                                    break;
                                case 7:
                                case 8:
                                    Float fValueOf6 = Float.valueOf(0.5f);
                                    boolean z2 = str8.charAt(0) == 'v';
                                    v6j v6jVarM92121b3 = xu41Var.m92121b(str5);
                                    it = it5;
                                    Object obj3 = v6jVarM92121b3.f237880c;
                                    if (obj3 == null || !(obj3 instanceof wmz)) {
                                        wmz wmzVar = z2 ? new wmz(xu41Var, 8) : new wmz(xu41Var, 7);
                                        v6jVarM92121b3.f237880c = wmzVar;
                                        v6jVarM92121b3.mo61241a(wmzVar.mo48198b());
                                    }
                                    wmz wmzVar2 = (wmz) v6jVarM92121b3.f237880c;
                                    Iterator it9 = uvaVar8.m71121G().iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            String str12 = (String) it9.next();
                                            str12.getClass();
                                            switch (str12.hashCode()) {
                                                case -1254185091:
                                                    it4 = it9;
                                                    if (str12.equals("hAlign")) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1237307863:
                                                    it4 = it9;
                                                    if (str12.equals("hStyle")) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1198076529:
                                                    it4 = it9;
                                                    if (str12.equals("hFlowBias")) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -853376977:
                                                    it4 = it9;
                                                    if (str12.equals("vAlign")) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -836499749:
                                                    it4 = it9;
                                                    if (str12.equals("vStyle")) {
                                                        b3 = 4;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -806339567:
                                                    it4 = it9;
                                                    if (str12.equals("padding")) {
                                                        b3 = 5;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -732635235:
                                                    it4 = it9;
                                                    if (str12.equals("vFlowBias")) {
                                                        b3 = 6;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -567445985:
                                                    it4 = it9;
                                                    if (str12.equals("contains")) {
                                                        b3 = 7;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -488900360:
                                                    it4 = it9;
                                                    if (str12.equals("maxElement")) {
                                                        b3 = 8;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3169614:
                                                    it4 = it9;
                                                    if (str12.equals("hGap")) {
                                                        b3 = 9;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3575610:
                                                    it4 = it9;
                                                    if (str12.equals(str)) {
                                                        b3 = 10;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3586688:
                                                    it4 = it9;
                                                    if (str12.equals("vGap")) {
                                                        b3 = 11;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3657802:
                                                    it4 = it9;
                                                    if (str12.equals("wrap")) {
                                                        b3 = 12;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    it4 = it9;
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    String strM73978d9 = uvaVar8.m71129s(str12).m73978d();
                                                    strM73978d9.getClass();
                                                    if (strM73978d9.equals("end")) {
                                                        wmzVar2.f253035z0 = 1;
                                                    } else if (strM73978d9.equals("start")) {
                                                        wmzVar2.f253035z0 = 0;
                                                    } else {
                                                        wmzVar2.f253035z0 = 2;
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 1:
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    qva qvaVarM71129s8 = uvaVar8.m71129s(str12);
                                                    if (qvaVarM71129s8 instanceof ova) {
                                                        ova ovaVar9 = (ova) qvaVarM71129s8;
                                                        if (ovaVar9.f181673e.size() > 1) {
                                                            String strM71116B4 = ovaVar9.m71116B(0);
                                                            strM73978d2 = ovaVar9.m71116B(1);
                                                            strM71116B = ovaVar9.f181673e.size() > 2 ? ovaVar9.m71116B(2) : "";
                                                            str3 = strM71116B4;
                                                        } else {
                                                            strM73978d2 = qvaVarM71129s8.m73978d();
                                                            str3 = "";
                                                            strM71116B = str3;
                                                        }
                                                    } else {
                                                        strM73978d2 = qvaVarM71129s8.m73978d();
                                                        str3 = "";
                                                        strM71116B = str3;
                                                    }
                                                    if (!strM73978d2.equals("")) {
                                                        wmzVar2.f253031v0 = ps41.m70759a(strM73978d2);
                                                    }
                                                    if (!str3.equals("")) {
                                                        wmzVar2.f253032w0 = ps41.m70759a(str3);
                                                    }
                                                    if (!strM71116B.equals("")) {
                                                        wmzVar2.f253033x0 = ps41.m70759a(strM71116B);
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 2:
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    qva qvaVarM71129s9 = uvaVar8.m71129s(str12);
                                                    if (qvaVarM71129s9 instanceof ova) {
                                                        ova ovaVar10 = (ova) qvaVarM71129s9;
                                                        if (ovaVar10.f181673e.size() > 1) {
                                                            fValueOf3 = Float.valueOf(ovaVar10.m71131u(0));
                                                            Float fValueOf7 = Float.valueOf(ovaVar10.m71131u(1));
                                                            fValueOf2 = ovaVar10.f181673e.size() > 2 ? Float.valueOf(ovaVar10.m71131u(2)) : fValueOf6;
                                                            fValueOf = fValueOf7;
                                                        } else {
                                                            fValueOf = Float.valueOf(qvaVarM71129s9.mo73979e());
                                                            fValueOf2 = fValueOf6;
                                                            fValueOf3 = fValueOf2;
                                                        }
                                                    } else {
                                                        fValueOf = Float.valueOf(qvaVarM71129s9.mo73979e());
                                                        fValueOf2 = fValueOf6;
                                                        fValueOf3 = fValueOf2;
                                                    }
                                                    wmzVar2.f237890h = fValueOf.floatValue();
                                                    if (fValueOf3.floatValue() != 0.5f) {
                                                        wmzVar2.f253021K0 = fValueOf3.floatValue();
                                                    }
                                                    if (fValueOf2.floatValue() != 0.5f) {
                                                        wmzVar2.f253022L0 = fValueOf2.floatValue();
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 3:
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    String strM73978d10 = uvaVar8.m71129s(str12).m73978d();
                                                    strM73978d10.getClass();
                                                    switch (strM73978d10) {
                                                        case "baseline":
                                                            wmzVar2.f253034y0 = 3;
                                                            break;
                                                        case "bottom":
                                                            wmzVar2.f253034y0 = 1;
                                                            break;
                                                        case "top":
                                                            wmzVar2.f253034y0 = 0;
                                                            break;
                                                        default:
                                                            wmzVar2.f253034y0 = 2;
                                                            break;
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 4:
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    qva qvaVarM71129s10 = uvaVar8.m71129s(str12);
                                                    if (qvaVarM71129s10 instanceof ova) {
                                                        ova ovaVar11 = (ova) qvaVarM71129s10;
                                                        if (ovaVar11.f181673e.size() > 1) {
                                                            String strM71116B5 = ovaVar11.m71116B(0);
                                                            strM73978d3 = ovaVar11.m71116B(1);
                                                            strM71116B2 = ovaVar11.f181673e.size() > 2 ? ovaVar11.m71116B(2) : "";
                                                            str4 = strM71116B5;
                                                        } else {
                                                            strM73978d3 = qvaVarM71129s10.m73978d();
                                                            str4 = "";
                                                            strM71116B2 = str4;
                                                        }
                                                    } else {
                                                        strM73978d3 = qvaVarM71129s10.m73978d();
                                                        str4 = "";
                                                        strM71116B2 = str4;
                                                    }
                                                    if (!strM73978d3.equals("")) {
                                                        wmzVar2.f253028s0 = ps41.m70759a(strM73978d3);
                                                    }
                                                    if (!str4.equals("")) {
                                                        wmzVar2.f253029t0 = ps41.m70759a(str4);
                                                    }
                                                    if (!strM71116B2.equals("")) {
                                                        wmzVar2.f253030u0 = ps41.m70759a(strM71116B2);
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 5:
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    qva qvaVarM71129s11 = uvaVar8.m71129s(str12);
                                                    if (qvaVarM71129s11 instanceof ova) {
                                                        ova ovaVar12 = (ova) qvaVarM71129s11;
                                                        if (ovaVar12.f181673e.size() > 1) {
                                                            int iM71133w2 = ovaVar12.m71133w(0);
                                                            iM71133w = ovaVar12.m71133w(1);
                                                            if (ovaVar12.f181673e.size() > 2) {
                                                                int iM71133w3 = ovaVar12.m71133w(2);
                                                                try {
                                                                    iMo73980i = ((ova) qvaVarM71129s11).m71133w(3);
                                                                    i3 = iM71133w3;
                                                                    i2 = iM71133w2;
                                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                                    i3 = iM71133w3;
                                                                    i2 = iM71133w2;
                                                                    iMo73980i = 0;
                                                                }
                                                            } else {
                                                                iMo73980i = iM71133w;
                                                                i2 = iM71133w2;
                                                                i3 = i2;
                                                            }
                                                        } else {
                                                            iMo73980i = qvaVarM71129s11.mo73980i();
                                                            i2 = iMo73980i;
                                                            iM71133w = i2;
                                                            i3 = iM71133w;
                                                        }
                                                    } else {
                                                        iMo73980i = qvaVarM71129s11.mo73980i();
                                                        i2 = iMo73980i;
                                                        iM71133w = i2;
                                                        i3 = iM71133w;
                                                    }
                                                    wmzVar2.f253013C0 = i2;
                                                    wmzVar2.f253015E0 = iM71133w;
                                                    wmzVar2.f253014D0 = i3;
                                                    wmzVar2.f253016F0 = iMo73980i;
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 6:
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    qva qvaVarM71129s12 = uvaVar8.m71129s(str12);
                                                    if (qvaVarM71129s12 instanceof ova) {
                                                        ova ovaVar13 = (ova) qvaVarM71129s12;
                                                        if (ovaVar13.f181673e.size() > 1) {
                                                            Float fValueOf8 = Float.valueOf(ovaVar13.m71131u(0));
                                                            fValueOf4 = Float.valueOf(ovaVar13.m71131u(1));
                                                            fValueOf5 = ovaVar13.f181673e.size() > 2 ? Float.valueOf(ovaVar13.m71131u(2)) : fValueOf6;
                                                            f2 = fValueOf8;
                                                        } else {
                                                            fValueOf4 = Float.valueOf(qvaVarM71129s12.mo73979e());
                                                            f2 = fValueOf6;
                                                            fValueOf5 = f2;
                                                        }
                                                    } else {
                                                        fValueOf4 = Float.valueOf(qvaVarM71129s12.mo73979e());
                                                        f2 = fValueOf6;
                                                        fValueOf5 = f2;
                                                    }
                                                    try {
                                                        wmzVar2.f237892i = fValueOf4.floatValue();
                                                        if (f2.floatValue() != 0.5f) {
                                                            wmzVar2.f253019I0 = f2.floatValue();
                                                        }
                                                        if (fValueOf5.floatValue() != 0.5f) {
                                                            wmzVar2.f253020J0 = fValueOf5.floatValue();
                                                        }
                                                    } catch (NumberFormatException unused4) {
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 7:
                                                    qva qvaVarM71129s13 = uvaVar8.m71129s(str12);
                                                    if (qvaVarM71129s13 instanceof ova) {
                                                        ova ovaVar14 = (ova) qvaVarM71129s13;
                                                        str2 = str;
                                                        if (ovaVar14.f181673e.size() >= 1) {
                                                            int i12 = 0;
                                                            while (i12 < ovaVar14.f181673e.size()) {
                                                                qva qvaVarM71128r5 = ovaVar14.m71128r(i12);
                                                                int i13 = i12;
                                                                if (qvaVarM71128r5 instanceof ova) {
                                                                    ova ovaVar15 = (ova) qvaVarM71128r5;
                                                                    if (ovaVar15.f181673e.size() > 0) {
                                                                        String strM73978d11 = ovaVar15.m71128r(0).m73978d();
                                                                        ovaVar = ovaVar14;
                                                                        int size2 = ovaVar15.f181673e.size();
                                                                        j7jVar5 = j7jVar6;
                                                                        if (size2 != 2) {
                                                                            if (size2 == 3) {
                                                                                fM71131u3 = ovaVar15.m71131u(1);
                                                                                fM80079b4 = xu41Var.f265991a.m80079b(ovaVar15.m71131u(2));
                                                                            } else if (size2 != 4) {
                                                                                fM80079b4 = Float.NaN;
                                                                                fM71131u3 = Float.NaN;
                                                                                f3 = Float.NaN;
                                                                            } else {
                                                                                float fM71131u5 = ovaVar15.m71131u(1);
                                                                                float fM80079b8 = xu41Var.f265991a.m80079b(ovaVar15.m71131u(2));
                                                                                fM80079b4 = xu41Var.f265991a.m80079b(ovaVar15.m71131u(3));
                                                                                f3 = fM80079b8;
                                                                                fM71131u3 = fM71131u5;
                                                                            }
                                                                            wmzVar2.m48196Y(strM73978d11);
                                                                            if (!Float.isNaN(fM71131u3)) {
                                                                                if (wmzVar2.f253024o0 == null) {
                                                                                    wmzVar2.f253024o0 = new HashMap();
                                                                                }
                                                                                wmzVar2.f253024o0.put(strM73978d11, Float.valueOf(fM71131u3));
                                                                            }
                                                                            if (!Float.isNaN(f3)) {
                                                                                if (wmzVar2.f253025p0 == null) {
                                                                                    wmzVar2.f253025p0 = new HashMap();
                                                                                }
                                                                                wmzVar2.f253025p0.put(strM73978d11, Float.valueOf(f3));
                                                                            }
                                                                            if (Float.isNaN(fM80079b4)) {
                                                                                if (wmzVar2.f253026q0 == null) {
                                                                                    wmzVar2.f253026q0 = new HashMap();
                                                                                }
                                                                                wmzVar2.f253026q0.put(strM73978d11, Float.valueOf(fM80079b4));
                                                                            }
                                                                        } else {
                                                                            fM71131u3 = ovaVar15.m71131u(1);
                                                                            fM80079b4 = Float.NaN;
                                                                        }
                                                                        f3 = fM80079b4;
                                                                        wmzVar2.m48196Y(strM73978d11);
                                                                        if (!Float.isNaN(fM71131u3)) {
                                                                            if (wmzVar2.f253024o0 == null) {
                                                                                wmzVar2.f253024o0 = new HashMap();
                                                                            }
                                                                            wmzVar2.f253024o0.put(strM73978d11, Float.valueOf(fM71131u3));
                                                                        }
                                                                        if (!Float.isNaN(f3)) {
                                                                            if (wmzVar2.f253025p0 == null) {
                                                                                wmzVar2.f253025p0 = new HashMap();
                                                                            }
                                                                            wmzVar2.f253025p0.put(strM73978d11, Float.valueOf(f3));
                                                                        }
                                                                        if (Float.isNaN(fM80079b4)) {
                                                                            if (wmzVar2.f253026q0 == null) {
                                                                                wmzVar2.f253026q0 = new HashMap();
                                                                            }
                                                                            wmzVar2.f253026q0.put(strM73978d11, Float.valueOf(fM80079b4));
                                                                        }
                                                                    } else {
                                                                        j7jVar5 = j7jVar6;
                                                                        ovaVar = ovaVar14;
                                                                    }
                                                                } else {
                                                                    j7jVar5 = j7jVar6;
                                                                    ovaVar = ovaVar14;
                                                                    wmzVar2.m48196Y(qvaVarM71128r5.m73978d());
                                                                }
                                                                i12 = i13 + 1;
                                                                ovaVar14 = ovaVar;
                                                                j7jVar6 = j7jVar5;
                                                            }
                                                            j7jVar4 = j7jVar6;
                                                            it9 = it4;
                                                            str = str2;
                                                            j7jVar6 = j7jVar4;
                                                            break;
                                                        }
                                                    }
                                                    j7jVar2 = j7jVar6;
                                                    PrintStream printStream2 = System.err;
                                                    StringBuilder sbM75191i2 = rbz.m75191i(str5, " contains should be an array \"");
                                                    sbM75191i2.append(qvaVarM71129s13.m73978d());
                                                    sbM75191i2.append("\"");
                                                    printStream2.println(sbM75191i2.toString());
                                                    break;
                                                case 8:
                                                    wmzVar2.f253017G0 = uvaVar8.m71129s(str12).mo73980i();
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 9:
                                                    wmzVar2.f253012B0 = uvaVar8.m71129s(str12).mo73980i();
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 10:
                                                    if (uvaVar8.m71129s(str12).m73978d().equals("hFlow")) {
                                                        wmzVar2.f253018H0 = 0;
                                                    } else {
                                                        wmzVar2.f253018H0 = 1;
                                                    }
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 11:
                                                    wmzVar2.f253011A0 = uvaVar8.m71129s(str12).mo73980i();
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                case 12:
                                                    String strM73978d12 = uvaVar8.m71129s(str12).m73978d();
                                                    HashMap map6 = mu41.f147250a;
                                                    wmzVar2.f253027r0 = map6.containsKey(strM73978d12) ? ((Integer) map6.get(strM73978d12)).intValue() : -1;
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                                default:
                                                    jq60.m54066l(str12, uvaVar8, xu41Var.m92121b(str5), j7jVar6, xu41Var);
                                                    j7jVar4 = j7jVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    j7jVar6 = j7jVar4;
                                                    break;
                                            }
                                        } else {
                                            j7jVar2 = j7jVar6;
                                        }
                                        j7jVar = j7jVar2;
                                        break;
                                    }
                                    break;
                                case 9:
                                    jq60.m54046E(0, xu41Var, str5, uvaVar8);
                                default:
                                    it = it5;
                                    j7jVar = j7jVar6;
                                    break;
                            }
                        }
                    }
                    break;
            }
            j7jVar6 = j7jVar;
            uvaVar4 = uvaVar;
            it5 = it;
        }
    }

    /* JADX INFO: renamed from: b */
    public final uva m58345b(sq70 sq70Var) throws CLParsingException {
        String string = sq70Var.mo78940a().toString();
        uva uvaVar = this.f130394a;
        if (uvaVar.m71135y(string) == null) {
            uvaVar.m71122H(string, new uva(new char[0]));
        }
        qva qvaVarM71129s = uvaVar.m71129s(string);
        if (qvaVarM71129s instanceof uva) {
            return (uva) qvaVarM71129s;
        }
        StringBuilder sbM38572u = edb.m38572u("no object found for key <", string, ">, found [");
        sbM38572u.append(qvaVarM71129s.m73981j());
        sbM38572u.append("] : ");
        sbM38572u.append(qvaVarM71129s);
        throw new CLParsingException(sbM38572u.toString(), uvaVar);
    }

    /* JADX INFO: renamed from: c */
    public final k6j m58346c(float f) throws CLParsingException {
        Integer numValueOf = Integer.valueOf(m58348e());
        tq70 tq70Var = new tq70(numValueOf);
        uva uvaVarM58345b = m58345b(tq70Var);
        uvaVarM58345b.m71124J("type", "vGuideline");
        uvaVarM58345b.m71123I("end", f);
        m58350h(5);
        m58350h(Float.hashCode(f));
        return new k6j(numValueOf, 0, tq70Var);
    }

    /* JADX INFO: renamed from: d */
    public final j6j m58347d() throws CLParsingException {
        Integer numValueOf = Integer.valueOf(m58348e());
        tq70 tq70Var = new tq70(numValueOf);
        uva uvaVarM58345b = m58345b(tq70Var);
        uvaVarM58345b.m71124J("type", "hGuideline");
        uvaVarM58345b.m71123I("percent", 0.4f);
        m58350h(8);
        m58350h(Float.hashCode(0.4f));
        return new j6j(numValueOf, 0, tq70Var);
    }

    /* JADX INFO: renamed from: e */
    public final int m58348e() {
        int i = this.f130397d;
        this.f130397d = i + 1;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6j)) {
            return false;
        }
        return wj50.m88271j(this.f130394a, ((l6j) obj).f130394a);
    }

    /* JADX INFO: renamed from: g */
    public final tq70 m58349g(sq70[] sq70VarArr, fjc fjcVar) throws CLParsingException {
        tq70 tq70Var = new tq70(Integer.valueOf(m58348e()));
        ova ovaVar = new ova(new char[0]);
        for (sq70 sq70Var : sq70VarArr) {
            sq70Var.f213034b.get(cjc.class.getSimpleName());
            ovaVar.m71126m(wva.m89079m(sq70Var.mo78940a().toString()));
        }
        ova ovaVar2 = new ova(new char[0]);
        ovaVar2.m71126m(wva.m89079m(fjcVar.f70157a));
        Float f = fjcVar.f70158b;
        ovaVar2.m71126m(new sva(f != null ? f.floatValue() : 0.5f));
        uva uvaVarM58345b = m58345b(tq70Var);
        uvaVarM58345b.m71124J("type", "vChain");
        uvaVarM58345b.m71122H("contains", ovaVar);
        uvaVarM58345b.m71122H("style", ovaVar2);
        m58350h(17);
        for (sq70 sq70Var2 : sq70VarArr) {
            m58350h(sq70Var2.hashCode());
        }
        m58350h(fjcVar.hashCode());
        return tq70Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m58350h(int i) {
        this.f130395b = ((this.f130395b * 1009) + i) % 1000000007;
    }

    public final int hashCode() {
        return this.f130394a.hashCode();
    }
}
