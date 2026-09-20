package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class sad {

    /* JADX INFO: renamed from: a */
    public final Observable f207179a;

    /* JADX INFO: renamed from: b */
    public final e3p f207180b;

    public sad(Observable observable, e3p e3pVar) {
        this.f207179a = observable;
        this.f207180b = e3pVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: Exception -> 0x006e, CancellationException -> 0x0071, PHI: r12 r13 r14
      0x00be: PHI (r12v16 int) = (r12v14 int), (r12v17 int) binds: [B:43:0x00ba, B:32:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r13v17 ??) = (r13v42 ??), (r13v43 ??) binds: [B:43:0x00ba, B:32:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r14v19 ??) = (r14v41 ??), (r14v42 ??) binds: [B:43:0x00ba, B:32:0x0085] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0071, Exception -> 0x006e, blocks: (B:23:0x0069, B:62:0x0109, B:29:0x007c, B:58:0x00ee, B:32:0x0085, B:45:0x00be, B:35:0x008d, B:42:0x00a7, B:39:0x0099, B:52:0x00d4, B:55:0x00df), top: B:97:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[Catch: CancellationException -> 0x004d, Exception -> 0x0158, TryCatch #4 {CancellationException -> 0x004d, Exception -> 0x0158, blocks: (B:15:0x0048, B:73:0x013f, B:75:0x0145, B:77:0x0154, B:20:0x005e, B:67:0x0121), top: B:97:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x018a  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017b, code lost:
    
        if (r3 == r4) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, p.sad] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [p.lmb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m77620a(int i, String str, ibk ibkVar) throws Throwable {
        rad radVar;
        int i2;
        CancellationException cancellationException;
        ?? r14;
        Object objM89557A;
        Object objM89557A2;
        Object objM96571q;
        ?? r1;
        Object objM96571q2;
        ?? r15;
        ?? r13;
        Object objM37676k;
        ?? r16;
        ?? r17;
        String strM61968d;
        ?? r2;
        ?? r18;
        ?? r19;
        String str2;
        Object objM37676k2;
        ?? r3;
        String str3;
        ?? r110;
        String str4;
        String str5;
        ?? r111;
        Object objM59339p;
        ?? r112;
        String str6;
        ?? r4;
        ?? r5;
        ?? r6;
        if (ibkVar instanceof rad) {
            radVar = (rad) ibkVar;
            int i3 = radVar.f197270g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                radVar.f197270g = i3 - Integer.MIN_VALUE;
            } else {
                radVar = new rad(this, ibkVar);
            }
        } else {
            radVar = new rad(this, ibkVar);
        }
        ?? r113 = radVar.f197268e;
        int i4 = radVar.f197270g;
        int i5 = 15;
        Object obj = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        e3p e3pVar = this.f207180b;
        fbk fbkVar = null;
        try {
            try {
                try {
                    switch (i4) {
                        case 0:
                            bga.m29073P(r113);
                            Observable observable = this.f207179a;
                            if (str == 0) {
                                radVar.f197264a = str;
                                radVar.f197267d = i;
                                radVar.f197270g = 1;
                                objM96571q2 = zn91.m96571q(observable, 1, null, radVar);
                                if (objM96571q2 == yukVar) {
                                    r13 = str;
                                    r15 = objM96571q2;
                                } else {
                                    r13 = str;
                                    r15 = objM96571q2;
                                    List listSingletonList = Collections.singletonList((String) r15);
                                    radVar.f197264a = r13;
                                    radVar.f197265b = null;
                                    radVar.f197267d = i;
                                    radVar.f197270g = 2;
                                    objM37676k = e3pVar.m37676k(listSingletonList, radVar);
                                    r17 = r13;
                                    r16 = objM37676k;
                                    if (objM37676k == yukVar) {
                                        String str7 = ((rvc) r16).f203049a;
                                        strM61968d = mjd.m61968d(6, str7, null);
                                        r2 = r17;
                                        str6 = str7;
                                        r111 = strM61968d;
                                        r1 = r2;
                                        r113 = str6;
                                        radVar.f197264a = r1;
                                        radVar.f197265b = r113;
                                        radVar.f197266c = null;
                                        radVar.f197267d = i;
                                        radVar.f197270g = 6;
                                        objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                                        if (objM59339p != yukVar) {
                                            ?? r10 = r113;
                                            r112 = objM59339p;
                                            str = r10;
                                            r5 = r1;
                                            String str8 = (String) r112;
                                            if (str == 0) {
                                                Set set = dd41.f47702f;
                                                String strM35712j = r46.m74726U(r5).m35712j();
                                                wj50.m88279p(strM35712j);
                                                r6 = strM35712j;
                                            } else {
                                                r6 = str;
                                            }
                                            return new xqz0(r6, str8);
                                        }
                                    }
                                }
                            } else if (xoc1.f263923K4.m83613a(str)) {
                                r1 = str;
                                r113 = 0;
                                r111 = str;
                                radVar.f197264a = r1;
                                radVar.f197265b = r113;
                                radVar.f197266c = null;
                                radVar.f197267d = i;
                                radVar.f197270g = 6;
                                objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                                if (objM59339p != yukVar) {
                                    ?? r11 = r113;
                                    r112 = objM59339p;
                                    str = r11;
                                    r5 = r1;
                                    String str9 = (String) r112;
                                    if (str == 0) {
                                        Set set2 = dd41.f47702f;
                                        String strM35712j2 = r46.m74726U(r5).m35712j();
                                        wj50.m88279p(strM35712j2);
                                        r6 = strM35712j2;
                                    } else {
                                        r6 = str;
                                    }
                                    return new xqz0(r6, str9);
                                }
                            } else {
                                radVar.f197264a = str;
                                radVar.f197267d = i;
                                radVar.f197270g = 3;
                                objM96571q = zn91.m96571q(observable, 1, null, radVar);
                                if (objM96571q == yukVar) {
                                    r19 = str;
                                    r18 = objM96571q;
                                } else {
                                    r19 = str;
                                    r18 = objM96571q;
                                    str2 = (String) r18;
                                    List listSingletonList2 = Collections.singletonList(str2);
                                    radVar.f197264a = r19;
                                    radVar.f197265b = str2;
                                    radVar.f197267d = i;
                                    radVar.f197270g = 4;
                                    objM37676k2 = e3pVar.m37676k(listSingletonList2, radVar);
                                    if (objM37676k2 == yukVar) {
                                        r3 = r19;
                                        str3 = str2;
                                        r110 = objM37676k2;
                                        str4 = ((rvc) r110).f203049a;
                                        radVar.f197264a = r3;
                                        radVar.f197265b = str4;
                                        radVar.f197266c = null;
                                        radVar.f197267d = i;
                                        radVar.f197270g = 5;
                                        if (m77621b(str3, str4, r3, radVar) != yukVar) {
                                            str5 = str4;
                                            r4 = r3;
                                            strM61968d = mjd.m61968d(6, str5, null);
                                            str6 = str5;
                                            r2 = r4;
                                            r111 = strM61968d;
                                            r1 = r2;
                                            r113 = str6;
                                            radVar.f197264a = r1;
                                            radVar.f197265b = r113;
                                            radVar.f197266c = null;
                                            radVar.f197267d = i;
                                            radVar.f197270g = 6;
                                            objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                                            if (objM59339p != yukVar) {
                                                ?? r12 = r113;
                                                r112 = objM59339p;
                                                str = r12;
                                                r5 = r1;
                                                String str10 = (String) r112;
                                                if (str == 0) {
                                                    Set set3 = dd41.f47702f;
                                                    String strM35712j3 = r46.m74726U(r5).m35712j();
                                                    wj50.m88279p(strM35712j3);
                                                    r6 = strM35712j3;
                                                } else {
                                                    r6 = str;
                                                }
                                                return new xqz0(r6, str10);
                                            }
                                        }
                                    }
                                }
                            }
                            return yukVar;
                        case 1:
                            i = radVar.f197267d;
                            String str11 = radVar.f197264a;
                            bga.m29073P(r113);
                            r13 = str11;
                            r15 = r113;
                            r13 = str;
                            r15 = objM96571q2;
                            List listSingletonList3 = Collections.singletonList((String) r15);
                            radVar.f197264a = r13;
                            radVar.f197265b = null;
                            radVar.f197267d = i;
                            radVar.f197270g = 2;
                            objM37676k = e3pVar.m37676k(listSingletonList3, radVar);
                            r17 = r13;
                            r16 = objM37676k;
                            if (objM37676k == yukVar) {
                                String str12 = ((rvc) r16).f203049a;
                                strM61968d = mjd.m61968d(6, str12, null);
                                r2 = r17;
                                str6 = str12;
                                r111 = strM61968d;
                                r1 = r2;
                                r113 = str6;
                                radVar.f197264a = r1;
                                radVar.f197265b = r113;
                                radVar.f197266c = null;
                                radVar.f197267d = i;
                                radVar.f197270g = 6;
                                objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                                if (objM59339p != yukVar) {
                                    ?? r114 = r113;
                                    r112 = objM59339p;
                                    str = r114;
                                    r5 = r1;
                                    String str13 = (String) r112;
                                    if (str == 0) {
                                        Set set4 = dd41.f47702f;
                                        String strM35712j4 = r46.m74726U(r5).m35712j();
                                        wj50.m88279p(strM35712j4);
                                        r6 = strM35712j4;
                                    } else {
                                        r6 = str;
                                    }
                                    return new xqz0(r6, str13);
                                }
                            }
                            return yukVar;
                        case 2:
                            i = radVar.f197267d;
                            String str14 = radVar.f197264a;
                            bga.m29073P(r113);
                            r17 = str14;
                            r16 = r113;
                            String str15 = ((rvc) r16).f203049a;
                            strM61968d = mjd.m61968d(6, str15, null);
                            r2 = r17;
                            str6 = str15;
                            r111 = strM61968d;
                            r1 = r2;
                            r113 = str6;
                            radVar.f197264a = r1;
                            radVar.f197265b = r113;
                            radVar.f197266c = null;
                            radVar.f197267d = i;
                            radVar.f197270g = 6;
                            objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                            if (objM59339p != yukVar) {
                                ?? r115 = r113;
                                r112 = objM59339p;
                                str = r115;
                                r5 = r1;
                                String str16 = (String) r112;
                                if (str == 0) {
                                    Set set5 = dd41.f47702f;
                                    String strM35712j5 = r46.m74726U(r5).m35712j();
                                    wj50.m88279p(strM35712j5);
                                    r6 = strM35712j5;
                                } else {
                                    r6 = str;
                                }
                                return new xqz0(r6, str16);
                            }
                            return yukVar;
                        case 3:
                            i = radVar.f197267d;
                            String str17 = radVar.f197264a;
                            bga.m29073P(r113);
                            r19 = str17;
                            r18 = r113;
                            r19 = str;
                            r18 = objM96571q;
                            str2 = (String) r18;
                            List listSingletonList4 = Collections.singletonList(str2);
                            radVar.f197264a = r19;
                            radVar.f197265b = str2;
                            radVar.f197267d = i;
                            radVar.f197270g = 4;
                            objM37676k2 = e3pVar.m37676k(listSingletonList4, radVar);
                            if (objM37676k2 == yukVar) {
                                r3 = r19;
                                str3 = str2;
                                r110 = objM37676k2;
                                str4 = ((rvc) r110).f203049a;
                                radVar.f197264a = r3;
                                radVar.f197265b = str4;
                                radVar.f197266c = null;
                                radVar.f197267d = i;
                                radVar.f197270g = 5;
                                if (m77621b(str3, str4, r3, radVar) != yukVar) {
                                    str5 = str4;
                                    r4 = r3;
                                    strM61968d = mjd.m61968d(6, str5, null);
                                    str6 = str5;
                                    r2 = r4;
                                    r111 = strM61968d;
                                    r1 = r2;
                                    r113 = str6;
                                    radVar.f197264a = r1;
                                    radVar.f197265b = r113;
                                    radVar.f197266c = null;
                                    radVar.f197267d = i;
                                    radVar.f197270g = 6;
                                    objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                                    if (objM59339p != yukVar) {
                                        ?? r116 = r113;
                                        r112 = objM59339p;
                                        str = r116;
                                        r5 = r1;
                                        String str18 = (String) r112;
                                        if (str == 0) {
                                            Set set6 = dd41.f47702f;
                                            String strM35712j6 = r46.m74726U(r5).m35712j();
                                            wj50.m88279p(strM35712j6);
                                            r6 = strM35712j6;
                                        } else {
                                            r6 = str;
                                        }
                                        return new xqz0(r6, str18);
                                    }
                                }
                            }
                            return yukVar;
                        case 4:
                            i = radVar.f197267d;
                            str3 = radVar.f197265b;
                            String str19 = radVar.f197264a;
                            bga.m29073P(r113);
                            r3 = str19;
                            r110 = r113;
                            str4 = ((rvc) r110).f203049a;
                            radVar.f197264a = r3;
                            radVar.f197265b = str4;
                            radVar.f197266c = null;
                            radVar.f197267d = i;
                            radVar.f197270g = 5;
                            if (m77621b(str3, str4, r3, radVar) != yukVar) {
                                str5 = str4;
                                r4 = r3;
                                strM61968d = mjd.m61968d(6, str5, null);
                                str6 = str5;
                                r2 = r4;
                                r111 = strM61968d;
                                r1 = r2;
                                r113 = str6;
                                radVar.f197264a = r1;
                                radVar.f197265b = r113;
                                radVar.f197266c = null;
                                radVar.f197267d = i;
                                radVar.f197270g = 6;
                                objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                                if (objM59339p != yukVar) {
                                    ?? r117 = r113;
                                    r112 = objM59339p;
                                    str = r117;
                                    r5 = r1;
                                    String str110 = (String) r112;
                                    if (str == 0) {
                                        Set set7 = dd41.f47702f;
                                        String strM35712j7 = r46.m74726U(r5).m35712j();
                                        wj50.m88279p(strM35712j7);
                                        r6 = strM35712j7;
                                    } else {
                                        r6 = str;
                                    }
                                    return new xqz0(r6, str110);
                                }
                            }
                            return yukVar;
                        case 5:
                            i = radVar.f197267d;
                            str5 = radVar.f197265b;
                            String str20 = radVar.f197264a;
                            bga.m29073P(r113);
                            r4 = str20;
                            strM61968d = mjd.m61968d(6, str5, null);
                            str6 = str5;
                            r2 = r4;
                            r111 = strM61968d;
                            r1 = r2;
                            r113 = str6;
                            radVar.f197264a = r1;
                            radVar.f197265b = r113;
                            radVar.f197266c = null;
                            radVar.f197267d = i;
                            radVar.f197270g = 6;
                            objM59339p = e3pVar.f55841b.m59339p(i, r111, radVar);
                            if (objM59339p != yukVar) {
                                ?? r118 = r113;
                                r112 = objM59339p;
                                str = r118;
                                r5 = r1;
                                String str111 = (String) r112;
                                if (str == 0) {
                                    Set set8 = dd41.f47702f;
                                    String strM35712j8 = r46.m74726U(r5).m35712j();
                                    wj50.m88279p(strM35712j8);
                                    r6 = strM35712j8;
                                } else {
                                    r6 = str;
                                }
                                return new xqz0(r6, str111);
                            }
                            return yukVar;
                        case 6:
                            i = radVar.f197267d;
                            String str21 = radVar.f197265b;
                            String str22 = radVar.f197264a;
                            bga.m29073P(r113);
                            r5 = str22;
                            str = str21;
                            r112 = r113;
                            String str112 = (String) r112;
                            if (str == 0) {
                                Set set9 = dd41.f47702f;
                                String strM35712j9 = r46.m74726U(r5).m35712j();
                                wj50.m88279p(strM35712j9);
                                r6 = strM35712j9;
                            } else {
                                r6 = str;
                            }
                            return new xqz0(r6, str112);
                        case 7:
                            CancellationException cancellationException2 = radVar.f197266c;
                            bga.m29073P(r113);
                            throw cancellationException2;
                        case 8:
                            bga.m29073P(r113);
                            return wqz0.f254210a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (CancellationException e) {
                    i2 = i;
                    cancellationException = e;
                    r14 = 0;
                    Logger.m3966b("Fetching invitation token was cancelled", new Object[0]);
                    if (r14 == 0) {
                        throw cancellationException;
                    }
                    radVar.f197264a = null;
                    radVar.f197265b = null;
                    radVar.f197266c = cancellationException;
                    radVar.f197267d = i2;
                    radVar.f197270g = 7;
                    objM89557A2 = x0h1.m89557A(rnj0.f200934b, new b6b((Object) this, (Object) r14, fbkVar, i5), radVar);
                    if (objM89557A2 == yukVar) {
                        obj = objM89557A2;
                    }
                    if (obj != yukVar) {
                        throw cancellationException;
                    }
                } catch (Exception unused) {
                    str = 0;
                    Logger.m3966b("Fetching invitation token failed", new Object[0]);
                    if (str != 0) {
                        radVar.f197264a = null;
                        radVar.f197265b = null;
                        radVar.f197266c = null;
                        radVar.f197267d = i;
                        radVar.f197270g = 8;
                        objM89557A = x0h1.m89557A(rnj0.f200934b, new b6b((Object) this, (Object) str, fbkVar, i5), radVar);
                        if (objM89557A == yukVar) {
                            obj = objM89557A;
                        }
                    }
                }
            } catch (CancellationException e2) {
                i2 = i;
                cancellationException = e2;
                r14 = r113;
                Logger.m3966b("Fetching invitation token was cancelled", new Object[0]);
                if (r14 == 0) {
                    throw cancellationException;
                }
                radVar.f197264a = null;
                radVar.f197265b = null;
                radVar.f197266c = cancellationException;
                radVar.f197267d = i2;
                radVar.f197270g = 7;
                objM89557A2 = x0h1.m89557A(rnj0.f200934b, new b6b((Object) this, (Object) r14, fbkVar, i5), radVar);
                if (objM89557A2 == yukVar) {
                    obj = objM89557A2;
                }
                if (obj != yukVar) {
                    throw cancellationException;
                }
            } catch (Exception unused2) {
                str = r113;
                Logger.m3966b("Fetching invitation token failed", new Object[0]);
                if (str != 0) {
                    radVar.f197264a = null;
                    radVar.f197265b = null;
                    radVar.f197266c = null;
                    radVar.f197267d = i;
                    radVar.f197270g = 8;
                    objM89557A = x0h1.m89557A(rnj0.f200934b, new b6b((Object) this, (Object) str, fbkVar, i5), radVar);
                    if (objM89557A == yukVar) {
                        obj = objM89557A;
                    }
                }
            }
        } catch (CancellationException e3) {
            ?? r119 = str;
            i2 = i;
            cancellationException = e3;
            r14 = r119;
            Logger.m3966b("Fetching invitation token was cancelled", new Object[0]);
            if (r14 == 0) {
                throw cancellationException;
            }
            radVar.f197264a = null;
            radVar.f197265b = null;
            radVar.f197266c = cancellationException;
            radVar.f197267d = i2;
            radVar.f197270g = 7;
            objM89557A2 = x0h1.m89557A(rnj0.f200934b, new b6b((Object) this, (Object) r14, fbkVar, i5), radVar);
            if (objM89557A2 == yukVar) {
                obj = objM89557A2;
            }
            if (obj != yukVar) {
                throw cancellationException;
            }
        } catch (Exception unused3) {
            Logger.m3966b("Fetching invitation token failed", new Object[0]);
            if (str != 0) {
                radVar.f197264a = null;
                radVar.f197265b = null;
                radVar.f197266c = null;
                radVar.f197267d = i;
                radVar.f197270g = 8;
                objM89557A = x0h1.m89557A(rnj0.f200934b, new b6b((Object) this, (Object) str, fbkVar, i5), radVar);
                if (objM89557A == yukVar) {
                    obj = objM89557A;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m77621b(String str, String str2, String str3, rad radVar) {
        Object objM37661F = this.f207180b.m37661F(new fkb(str2, str2, new dkb(new pck("", str2, new pla1(str, str, 12, (String) null), 0L, false, new wdj(str3, null, null, null, null, null, null, 126), null, null, null, null, false, null, 4032), false), true), radVar);
        return objM37661F == yuk.f276404a ? objM37661F : w2a1.f247311a;
    }
}
