package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class o520 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e3p f161847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pq4 f161848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f161849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f161850d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f161851e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ qe70 f161852f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ q831 f161853g;

    /* JADX WARN: Multi-variable type inference failed */
    public o520(e3p e3pVar, pq4 pq4Var, Context context, String str, String str2, gh00 gh00Var, q831 q831Var) {
        this.f161847a = e3pVar;
        this.f161848b = pq4Var;
        this.f161849c = context;
        this.f161850d = str;
        this.f161851e = str2;
        this.f161852f = (qe70) gh00Var;
        this.f161853g = q831Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x024b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0304  */
    /* JADX WARN: Code duplicated, block: B:160:0x0326  */
    /* JADX WARN: Code duplicated, block: B:164:0x032d  */
    /* JADX WARN: Code duplicated, block: B:169:0x036d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:172:0x0377  */
    /* JADX WARN: Code duplicated, block: B:174:0x0395  */
    /* JADX WARN: Code duplicated, block: B:176:0x0398 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:196:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c2  */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0327, code lost:
    
        if (r4 == r15) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00a1: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:162), block:B:29:0x009f */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00d3: MOVE (r0 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:212), block:B:38:0x00ce */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String, java.util.concurrent.CancellationException, p.bqz0, p.q520] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String, p.bqz0, p.fbk, p.q520] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        n520 n520Var;
        bqz0 bqz0Var2;
        String str;
        Object obj2;
        Object objM89557A;
        Object objM89557A2;
        bqz0 bqz0Var3;
        ?? r2;
        Object obj3;
        q520 q520Var;
        Object objM37676k;
        int i;
        String strM61968d;
        String str2;
        Object objM37676k2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strM35712j;
        Object objM59339p;
        q520 q520Var2;
        String str7;
        String str8;
        String str9;
        Object objM70620a;
        String str10;
        bqz0 bqz0Var4 = bqz0Var;
        if (ibkVar instanceof n520) {
            n520Var = (n520) ibkVar;
            int i2 = n520Var.f150454b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n520Var.f150454b = i2 - Integer.MIN_VALUE;
            } else {
                n520Var = new n520(this, ibkVar);
            }
        } else {
            n520Var = new n520(this, ibkVar);
        }
        n520 n520Var2 = n520Var;
        Object obj4 = n520Var2.f150453a;
        int i3 = n520Var2.f150454b;
        Object obj5 = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        Context context = this.f161849c;
        e3p e3pVar = this.f161847a;
        int i4 = 0;
        String str11 = null;
         = 0;
        ?? r3 = 0;
        str11 = null;
        str11 = null;
        str11 = null;
        str11 = null;
        str11 = null;
        try {
            try {
                switch (i3) {
                    case 0:
                        bga.m29073P(obj4);
                        q520Var = (q520) obj;
                        try {
                            try {
                                String str12 = q520Var.f185383a;
                                String str13 = q520Var.f185385c;
                                try {
                                    if (str12 != null) {
                                        try {
                                            if (xoc1.f263923K4.m83613a(str12)) {
                                                strM61968d = q520Var.f185383a;
                                                i3 = 0;
                                                str2 = null;
                                                if (str2 == null) {
                                                    Set set = dd41.f47702f;
                                                    strM35712j = r46.m74726U(q520Var.f185383a).m35712j();
                                                    wj50.m88279p(strM35712j);
                                                } else {
                                                    strM35712j = str2;
                                                }
                                                int i5 = q520Var.f185386d;
                                                n520Var2.f150456d = bqz0Var4;
                                                n520Var2.f150457e = q520Var;
                                                n520Var2.f150458f = str2;
                                                n520Var2.f150459g = null;
                                                n520Var2.f150460h = strM35712j;
                                                n520Var2.f150461i = i3;
                                                n520Var2.f150454b = 4;
                                                objM59339p = e3pVar.f55841b.m59339p(i5, strM61968d, n520Var2);
                                                if (objM59339p != yukVar) {
                                                    bqz0Var3 = bqz0Var4;
                                                    q520Var2 = q520Var;
                                                    obj4 = objM59339p;
                                                    str7 = strM35712j;
                                                    str8 = str2;
                                                    str9 = (String) obj4;
                                                    pq4 pq4Var = this.f161848b;
                                                    String str14 = "spotify:chat-invite:" + str7;
                                                    String string = context.getString(R.string.chat_new_group_chat_invite_link_share_message, q520Var2.f185384b);
                                                    mec0 mec0Var = new mec0();
                                                    mec0Var.put("pt", str9);
                                                    context = context;
                                                    mec0Var.put("feature", "campfire_invite");
                                                    mec0Var.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
                                                    bve0 bve0Var = new bve0(str14, string, mec0Var.m61540b());
                                                    String str15 = this.f161850d;
                                                    String str16 = this.f161851e;
                                                    String str17 = q520Var2.f185387e;
                                                    n520Var2.f150456d = bqz0Var3;
                                                    n520Var2.f150457e = null;
                                                    n520Var2.f150458f = str8;
                                                    n520Var2.f150459g = null;
                                                    n520Var2.f150460h = str9;
                                                    n520Var2.f150461i = i3;
                                                    n520Var2.f150454b = 5;
                                                    str8 = str8;
                                                    e3pVar = e3pVar;
                                                    i4 = 0;
                                                    objM70620a = pq4Var.m70620a(context, bve0Var, str15, str16, "android-libs-inappmessaging", str17, n520Var2);
                                                    context = context;
                                                    if (objM70620a != yukVar) {
                                                        str10 = str9;
                                                        i4 = i3;
                                                        str11 = str8;
                                                        this.f161852f.invoke(str10);
                                                        obj3 = s520.f205690a;
                                                        r2 = 0;
                                                        n520Var2.f150456d = r2;
                                                        n520Var2.f150457e = r2;
                                                        n520Var2.f150458f = r2;
                                                        n520Var2.f150459g = r2;
                                                        n520Var2.f150460h = r2;
                                                        n520Var2.f150454b = 8;
                                                        if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                            return obj5;
                                                        }
                                                    }
                                                }
                                            } else {
                                                List listSingletonList = Collections.singletonList(str13);
                                                n520Var2.f150456d = bqz0Var4;
                                                n520Var2.f150457e = q520Var;
                                                n520Var2.f150461i = 0;
                                                n520Var2.f150454b = 2;
                                                objM37676k = e3pVar.m37676k(listSingletonList, n520Var2);
                                                if (objM37676k != yukVar) {
                                                    i = 0;
                                                    try {
                                                        str4 = ((rvc) objM37676k).f203049a;
                                                        try {
                                                            str5 = q520Var.f185385c;
                                                            str6 = q520Var.f185383a;
                                                            n520Var2.f150456d = bqz0Var4;
                                                            n520Var2.f150457e = q520Var;
                                                            n520Var2.f150458f = str4;
                                                            n520Var2.f150461i = i;
                                                            try {
                                                                n520Var2.f150454b = 3;
                                                                if (p520.m69161a(e3pVar, str5, str4, str6, n520Var2) != yukVar) {
                                                                    int i6 = i;
                                                                    str2 = str4;
                                                                    i3 = i6;
                                                                    try {
                                                                        try {
                                                                            strM61968d = mjd.m61968d(6, str2, null);
                                                                            if (str2 == null) {
                                                                                Set set2 = dd41.f47702f;
                                                                                strM35712j = r46.m74726U(q520Var.f185383a).m35712j();
                                                                                wj50.m88279p(strM35712j);
                                                                            } else {
                                                                                strM35712j = str2;
                                                                            }
                                                                            int i7 = q520Var.f185386d;
                                                                            n520Var2.f150456d = bqz0Var4;
                                                                            n520Var2.f150457e = q520Var;
                                                                            n520Var2.f150458f = str2;
                                                                            n520Var2.f150459g = null;
                                                                            n520Var2.f150460h = strM35712j;
                                                                            n520Var2.f150461i = i3;
                                                                            n520Var2.f150454b = 4;
                                                                            objM59339p = e3pVar.f55841b.m59339p(i7, strM61968d, n520Var2);
                                                                            if (objM59339p != yukVar) {
                                                                                bqz0Var3 = bqz0Var4;
                                                                                q520Var2 = q520Var;
                                                                                obj4 = objM59339p;
                                                                                str7 = strM35712j;
                                                                                str8 = str2;
                                                                                str9 = (String) obj4;
                                                                                pq4 pq4Var2 = this.f161848b;
                                                                                String str18 = "spotify:chat-invite:" + str7;
                                                                                String string2 = context.getString(R.string.chat_new_group_chat_invite_link_share_message, q520Var2.f185384b);
                                                                                mec0 mec0Var2 = new mec0();
                                                                                mec0Var2.put("pt", str9);
                                                                                context = context;
                                                                                mec0Var2.put("feature", "campfire_invite");
                                                                                mec0Var2.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
                                                                                bve0 bve0Var2 = new bve0(str18, string2, mec0Var2.m61540b());
                                                                                String str19 = this.f161850d;
                                                                                String str110 = this.f161851e;
                                                                                String str111 = q520Var2.f185387e;
                                                                                n520Var2.f150456d = bqz0Var3;
                                                                                n520Var2.f150457e = null;
                                                                                n520Var2.f150458f = str8;
                                                                                n520Var2.f150459g = null;
                                                                                n520Var2.f150460h = str9;
                                                                                n520Var2.f150461i = i3;
                                                                                n520Var2.f150454b = 5;
                                                                                str8 = str8;
                                                                                e3pVar = e3pVar;
                                                                                i4 = 0;
                                                                                objM70620a = pq4Var2.m70620a(context, bve0Var2, str19, str110, "android-libs-inappmessaging", str111, n520Var2);
                                                                                context = context;
                                                                                if (objM70620a != yukVar) {
                                                                                    str10 = str9;
                                                                                    i4 = i3;
                                                                                    str11 = str8;
                                                                                    this.f161852f.invoke(str10);
                                                                                    obj3 = s520.f205690a;
                                                                                    r2 = 0;
                                                                                    n520Var2.f150456d = r2;
                                                                                    n520Var2.f150457e = r2;
                                                                                    n520Var2.f150458f = r2;
                                                                                    n520Var2.f150459g = r2;
                                                                                    n520Var2.f150460h = r2;
                                                                                    n520Var2.f150454b = 8;
                                                                                    if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                                                        return obj5;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Exception unused) {
                                                                            context = context;
                                                                            e3pVar = e3pVar;
                                                                            i4 = 0;
                                                                            i4 = i3;
                                                                            str11 = str2;
                                                                            Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                                            if (str11 != null) {
                                                                                n520Var2.f150456d = bqz0Var4;
                                                                                obj2 = null;
                                                                                n520Var2.f150457e = null;
                                                                                n520Var2.f150458f = null;
                                                                                n520Var2.f150459g = null;
                                                                                n520Var2.f150460h = null;
                                                                                n520Var2.f150461i = i4;
                                                                                n520Var2.f150454b = 7;
                                                                                objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                                                if (objM89557A != yukVar) {
                                                                                    objM89557A = obj5;
                                                                                }
                                                                                break;
                                                                            } else {
                                                                                obj2 = null;
                                                                            }
                                                                            bqz0Var3 = bqz0Var4;
                                                                            this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                                            obj3 = t520.f217196a;
                                                                            r2 = obj2;
                                                                            n520Var2.f150456d = r2;
                                                                            n520Var2.f150457e = r2;
                                                                            n520Var2.f150458f = r2;
                                                                            n520Var2.f150459g = r2;
                                                                            n520Var2.f150460h = r2;
                                                                            n520Var2.f150454b = 8;
                                                                            if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                                                return yukVar;
                                                                            }
                                                                            return obj5;
                                                                        }
                                                                    } catch (CancellationException e) {
                                                                        e = e;
                                                                        i4 = 0;
                                                                        i4 = i3;
                                                                        str11 = str2;
                                                                        r3 = 0;
                                                                        Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                                        if (str11 == null) {
                                                                            throw e;
                                                                        }
                                                                        n520Var2.f150456d = r3;
                                                                        n520Var2.f150457e = r3;
                                                                        n520Var2.f150458f = r3;
                                                                        n520Var2.f150459g = e;
                                                                        n520Var2.f150460h = r3;
                                                                        n520Var2.f150461i = i4;
                                                                        n520Var2.f150454b = 6;
                                                                        objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                                        if (objM89557A2 == yukVar) {
                                                                            obj5 = objM89557A2;
                                                                        }
                                                                        if (obj5 == yukVar) {
                                                                            return yukVar;
                                                                        }
                                                                        throw e;
                                                                    }
                                                                }
                                                            } catch (CancellationException e2) {
                                                                e = e2;
                                                                i4 = 0;
                                                                str11 = str4;
                                                                i4 = i;
                                                                r3 = 0;
                                                                Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                                if (str11 == null) {
                                                                    throw e;
                                                                }
                                                                n520Var2.f150456d = r3;
                                                                n520Var2.f150457e = r3;
                                                                n520Var2.f150458f = r3;
                                                                n520Var2.f150459g = e;
                                                                n520Var2.f150460h = r3;
                                                                n520Var2.f150461i = i4;
                                                                n520Var2.f150454b = 6;
                                                                objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                                if (objM89557A2 == yukVar) {
                                                                    obj5 = objM89557A2;
                                                                }
                                                                if (obj5 == yukVar) {
                                                                    return yukVar;
                                                                }
                                                                throw e;
                                                            } catch (Exception unused2) {
                                                                i4 = 0;
                                                                str11 = str4;
                                                                i4 = i;
                                                                Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                                if (str11 != null) {
                                                                    n520Var2.f150456d = bqz0Var4;
                                                                    obj2 = null;
                                                                    n520Var2.f150457e = null;
                                                                    n520Var2.f150458f = null;
                                                                    n520Var2.f150459g = null;
                                                                    n520Var2.f150460h = null;
                                                                    n520Var2.f150461i = i4;
                                                                    n520Var2.f150454b = 7;
                                                                    objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                                    if (objM89557A != yukVar) {
                                                                        objM89557A = obj5;
                                                                    }
                                                                    break;
                                                                } else {
                                                                    obj2 = null;
                                                                }
                                                                bqz0Var3 = bqz0Var4;
                                                                this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                                obj3 = t520.f217196a;
                                                                r2 = obj2;
                                                                n520Var2.f150456d = r2;
                                                                n520Var2.f150457e = r2;
                                                                n520Var2.f150458f = r2;
                                                                n520Var2.f150459g = r2;
                                                                n520Var2.f150460h = r2;
                                                                n520Var2.f150454b = 8;
                                                                if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                                    return yukVar;
                                                                }
                                                                return obj5;
                                                            }
                                                        } catch (CancellationException e3) {
                                                            e = e3;
                                                            i4 = 0;
                                                        } catch (Exception unused3) {
                                                            i4 = 0;
                                                        }
                                                    } catch (CancellationException e4) {
                                                        e = e4;
                                                        i4 = i;
                                                        r3 = 0;
                                                        str11 = null;
                                                        Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                        if (str11 == null) {
                                                            throw e;
                                                        }
                                                        n520Var2.f150456d = r3;
                                                        n520Var2.f150457e = r3;
                                                        n520Var2.f150458f = r3;
                                                        n520Var2.f150459g = e;
                                                        n520Var2.f150460h = r3;
                                                        n520Var2.f150461i = i4;
                                                        n520Var2.f150454b = 6;
                                                        objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                        if (objM89557A2 == yukVar) {
                                                            obj5 = objM89557A2;
                                                        }
                                                        if (obj5 == yukVar) {
                                                            return yukVar;
                                                        }
                                                        throw e;
                                                    } catch (Exception unused4) {
                                                        i4 = i;
                                                        str11 = null;
                                                        Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                        if (str11 != null) {
                                                            n520Var2.f150456d = bqz0Var4;
                                                            obj2 = null;
                                                            n520Var2.f150457e = null;
                                                            n520Var2.f150458f = null;
                                                            n520Var2.f150459g = null;
                                                            n520Var2.f150460h = null;
                                                            n520Var2.f150461i = i4;
                                                            n520Var2.f150454b = 7;
                                                            objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                            if (objM89557A != yukVar) {
                                                                objM89557A = obj5;
                                                            }
                                                            break;
                                                        } else {
                                                            obj2 = null;
                                                        }
                                                        bqz0Var3 = bqz0Var4;
                                                        this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                        obj3 = t520.f217196a;
                                                        r2 = obj2;
                                                        n520Var2.f150456d = r2;
                                                        n520Var2.f150457e = r2;
                                                        n520Var2.f150458f = r2;
                                                        n520Var2.f150459g = r2;
                                                        n520Var2.f150460h = r2;
                                                        n520Var2.f150454b = 8;
                                                        if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                            return yukVar;
                                                        }
                                                        return obj5;
                                                    }
                                                }
                                            }
                                        } catch (CancellationException e5) {
                                            e = e5;
                                            r3 = 0;
                                            str11 = null;
                                            Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                            if (str11 == null) {
                                                throw e;
                                            }
                                            n520Var2.f150456d = r3;
                                            n520Var2.f150457e = r3;
                                            n520Var2.f150458f = r3;
                                            n520Var2.f150459g = e;
                                            n520Var2.f150460h = r3;
                                            n520Var2.f150461i = i4;
                                            n520Var2.f150454b = 6;
                                            objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                            if (objM89557A2 == yukVar) {
                                                obj5 = objM89557A2;
                                            }
                                            if (obj5 == yukVar) {
                                                return yukVar;
                                            }
                                            throw e;
                                        }
                                        break;
                                    } else {
                                        List listSingletonList2 = Collections.singletonList(str13);
                                        n520Var2.f150456d = bqz0Var4;
                                        n520Var2.f150457e = q520Var;
                                        n520Var2.f150461i = 0;
                                        n520Var2.f150454b = 1;
                                        objM37676k2 = e3pVar.m37676k(listSingletonList2, n520Var2);
                                        if (objM37676k2 != yukVar) {
                                            i = 0;
                                            try {
                                                str3 = ((rvc) objM37676k2).f203049a;
                                                try {
                                                    strM61968d = mjd.m61968d(6, str3, null);
                                                    int i8 = i;
                                                    str2 = str3;
                                                    i3 = i8;
                                                    if (str2 == null) {
                                                        try {
                                                            Set set3 = dd41.f47702f;
                                                            strM35712j = r46.m74726U(q520Var.f185383a).m35712j();
                                                            wj50.m88279p(strM35712j);
                                                        } catch (CancellationException e6) {
                                                            e = e6;
                                                            i4 = i3;
                                                            r3 = 0;
                                                            str11 = str2;
                                                            i4 = 0;
                                                            Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                            if (str11 == null) {
                                                                throw e;
                                                            }
                                                            n520Var2.f150456d = r3;
                                                            n520Var2.f150457e = r3;
                                                            n520Var2.f150458f = r3;
                                                            n520Var2.f150459g = e;
                                                            n520Var2.f150460h = r3;
                                                            n520Var2.f150461i = i4;
                                                            n520Var2.f150454b = 6;
                                                            objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                            if (objM89557A2 == yukVar) {
                                                                obj5 = objM89557A2;
                                                            }
                                                            if (obj5 == yukVar) {
                                                                throw e;
                                                            }
                                                        } catch (Exception unused5) {
                                                            i4 = i3;
                                                            context = context;
                                                            e3pVar = e3pVar;
                                                            str11 = str2;
                                                            i4 = 0;
                                                            Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                            if (str11 != null) {
                                                                n520Var2.f150456d = bqz0Var4;
                                                                obj2 = null;
                                                                n520Var2.f150457e = null;
                                                                n520Var2.f150458f = null;
                                                                n520Var2.f150459g = null;
                                                                n520Var2.f150460h = null;
                                                                n520Var2.f150461i = i4;
                                                                n520Var2.f150454b = 7;
                                                                objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                                if (objM89557A != yukVar) {
                                                                    objM89557A = obj5;
                                                                }
                                                                break;
                                                            } else {
                                                                obj2 = null;
                                                            }
                                                            bqz0Var3 = bqz0Var4;
                                                            this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                            obj3 = t520.f217196a;
                                                            r2 = obj2;
                                                            n520Var2.f150456d = r2;
                                                            n520Var2.f150457e = r2;
                                                            n520Var2.f150458f = r2;
                                                            n520Var2.f150459g = r2;
                                                            n520Var2.f150460h = r2;
                                                            n520Var2.f150454b = 8;
                                                            if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                                return yukVar;
                                                            }
                                                            return obj5;
                                                        }
                                                    } else {
                                                        strM35712j = str2;
                                                    }
                                                    int i9 = q520Var.f185386d;
                                                    n520Var2.f150456d = bqz0Var4;
                                                    n520Var2.f150457e = q520Var;
                                                    n520Var2.f150458f = str2;
                                                    n520Var2.f150459g = null;
                                                    n520Var2.f150460h = strM35712j;
                                                    n520Var2.f150461i = i3;
                                                    n520Var2.f150454b = 4;
                                                    try {
                                                        objM59339p = e3pVar.f55841b.m59339p(i9, strM61968d, n520Var2);
                                                        if (objM59339p != yukVar) {
                                                            bqz0Var3 = bqz0Var4;
                                                            q520Var2 = q520Var;
                                                            obj4 = objM59339p;
                                                            str7 = strM35712j;
                                                            str8 = str2;
                                                            try {
                                                                try {
                                                                    str9 = (String) obj4;
                                                                    pq4 pq4Var3 = this.f161848b;
                                                                    String str112 = "spotify:chat-invite:" + str7;
                                                                    String string3 = context.getString(R.string.chat_new_group_chat_invite_link_share_message, q520Var2.f185384b);
                                                                    try {
                                                                        mec0 mec0Var3 = new mec0();
                                                                        mec0Var3.put("pt", str9);
                                                                        context = context;
                                                                        try {
                                                                            mec0Var3.put("feature", "campfire_invite");
                                                                            try {
                                                                                mec0Var3.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
                                                                                try {
                                                                                    bve0 bve0Var3 = new bve0(str112, string3, mec0Var3.m61540b());
                                                                                    String str113 = this.f161850d;
                                                                                    String str114 = this.f161851e;
                                                                                    String str115 = q520Var2.f185387e;
                                                                                    n520Var2.f150456d = bqz0Var3;
                                                                                    n520Var2.f150457e = null;
                                                                                    n520Var2.f150458f = str8;
                                                                                    n520Var2.f150459g = null;
                                                                                    n520Var2.f150460h = str9;
                                                                                    n520Var2.f150461i = i3;
                                                                                    n520Var2.f150454b = 5;
                                                                                    str8 = str8;
                                                                                    e3pVar = e3pVar;
                                                                                    i4 = 0;
                                                                                    try {
                                                                                        objM70620a = pq4Var3.m70620a(context, bve0Var3, str113, str114, "android-libs-inappmessaging", str115, n520Var2);
                                                                                        context = context;
                                                                                        if (objM70620a != yukVar) {
                                                                                            str10 = str9;
                                                                                            i4 = i3;
                                                                                            str11 = str8;
                                                                                            try {
                                                                                                this.f161852f.invoke(str10);
                                                                                                obj3 = s520.f205690a;
                                                                                                r2 = 0;
                                                                                            } catch (CancellationException e7) {
                                                                                                e = e7;
                                                                                                e3pVar = e3pVar;
                                                                                                r3 = 0;
                                                                                                Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                                                                if (str11 == null) {
                                                                                                    throw e;
                                                                                                }
                                                                                                n520Var2.f150456d = r3;
                                                                                                n520Var2.f150457e = r3;
                                                                                                n520Var2.f150458f = r3;
                                                                                                n520Var2.f150459g = e;
                                                                                                n520Var2.f150460h = r3;
                                                                                                n520Var2.f150461i = i4;
                                                                                                n520Var2.f150454b = 6;
                                                                                                objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                                                                if (objM89557A2 == yukVar) {
                                                                                                    obj5 = objM89557A2;
                                                                                                }
                                                                                                if (obj5 == yukVar) {
                                                                                                    return yukVar;
                                                                                                }
                                                                                                throw e;
                                                                                            } catch (Exception unused6) {
                                                                                                bqz0Var4 = bqz0Var3;
                                                                                                Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                                                                if (str11 != null) {
                                                                                                    n520Var2.f150456d = bqz0Var4;
                                                                                                    obj2 = null;
                                                                                                    n520Var2.f150457e = null;
                                                                                                    n520Var2.f150458f = null;
                                                                                                    n520Var2.f150459g = null;
                                                                                                    n520Var2.f150460h = null;
                                                                                                    n520Var2.f150461i = i4;
                                                                                                    n520Var2.f150454b = 7;
                                                                                                    objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                                                                    if (objM89557A != yukVar) {
                                                                                                        objM89557A = obj5;
                                                                                                    }
                                                                                                } else {
                                                                                                    obj2 = null;
                                                                                                }
                                                                                                bqz0Var3 = bqz0Var4;
                                                                                                this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                                                                obj3 = t520.f217196a;
                                                                                                r2 = obj2;
                                                                                            }
                                                                                            n520Var2.f150456d = r2;
                                                                                            n520Var2.f150457e = r2;
                                                                                            n520Var2.f150458f = r2;
                                                                                            n520Var2.f150459g = r2;
                                                                                            n520Var2.f150460h = r2;
                                                                                            n520Var2.f150454b = 8;
                                                                                            if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                                                                return obj5;
                                                                                            }
                                                                                        }
                                                                                    } catch (CancellationException e8) {
                                                                                        e = e8;
                                                                                        i4 = i3;
                                                                                        str11 = str8;
                                                                                        e3pVar = e3pVar;
                                                                                        r3 = 0;
                                                                                        Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                                                        if (str11 == null) {
                                                                                            throw e;
                                                                                        }
                                                                                        n520Var2.f150456d = r3;
                                                                                        n520Var2.f150457e = r3;
                                                                                        n520Var2.f150458f = r3;
                                                                                        n520Var2.f150459g = e;
                                                                                        n520Var2.f150460h = r3;
                                                                                        n520Var2.f150461i = i4;
                                                                                        n520Var2.f150454b = 6;
                                                                                        objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                                                        if (objM89557A2 == yukVar) {
                                                                                            obj5 = objM89557A2;
                                                                                        }
                                                                                        if (obj5 == yukVar) {
                                                                                            return yukVar;
                                                                                        }
                                                                                        throw e;
                                                                                    } catch (Exception unused7) {
                                                                                        context = context;
                                                                                        i4 = i3;
                                                                                        bqz0Var4 = bqz0Var3;
                                                                                        str11 = str8;
                                                                                        Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                                                        if (str11 != null) {
                                                                                            n520Var2.f150456d = bqz0Var4;
                                                                                            obj2 = null;
                                                                                            n520Var2.f150457e = null;
                                                                                            n520Var2.f150458f = null;
                                                                                            n520Var2.f150459g = null;
                                                                                            n520Var2.f150460h = null;
                                                                                            n520Var2.f150461i = i4;
                                                                                            n520Var2.f150454b = 7;
                                                                                            objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                                                            if (objM89557A != yukVar) {
                                                                                                objM89557A = obj5;
                                                                                            }
                                                                                            break;
                                                                                        } else {
                                                                                            obj2 = null;
                                                                                        }
                                                                                        bqz0Var3 = bqz0Var4;
                                                                                        this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                                                        obj3 = t520.f217196a;
                                                                                        r2 = obj2;
                                                                                        n520Var2.f150456d = r2;
                                                                                        n520Var2.f150457e = r2;
                                                                                        n520Var2.f150458f = r2;
                                                                                        n520Var2.f150459g = r2;
                                                                                        n520Var2.f150460h = r2;
                                                                                        n520Var2.f150454b = 8;
                                                                                        if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                                                            return yukVar;
                                                                                        }
                                                                                        return obj5;
                                                                                    }
                                                                                } catch (CancellationException e9) {
                                                                                    e = e9;
                                                                                    str8 = str8;
                                                                                    e3pVar = e3pVar;
                                                                                    i4 = 0;
                                                                                } catch (Exception unused8) {
                                                                                    str8 = str8;
                                                                                    e3pVar = e3pVar;
                                                                                    i4 = 0;
                                                                                }
                                                                            } catch (CancellationException e10) {
                                                                                e = e10;
                                                                                str8 = str8;
                                                                                i4 = 0;
                                                                                e3pVar = e3pVar;
                                                                            } catch (Exception unused9) {
                                                                                str8 = str8;
                                                                                i4 = 0;
                                                                                e3pVar = e3pVar;
                                                                            }
                                                                        } catch (Exception unused10) {
                                                                            e3pVar = e3pVar;
                                                                            i4 = 0;
                                                                            i4 = i3;
                                                                            bqz0Var4 = bqz0Var3;
                                                                            str11 = str8;
                                                                            Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                                            if (str11 != null) {
                                                                                n520Var2.f150456d = bqz0Var4;
                                                                                obj2 = null;
                                                                                n520Var2.f150457e = null;
                                                                                n520Var2.f150458f = null;
                                                                                n520Var2.f150459g = null;
                                                                                n520Var2.f150460h = null;
                                                                                n520Var2.f150461i = i4;
                                                                                n520Var2.f150454b = 7;
                                                                                objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                                                if (objM89557A != yukVar) {
                                                                                    objM89557A = obj5;
                                                                                }
                                                                                break;
                                                                            } else {
                                                                                obj2 = null;
                                                                            }
                                                                            bqz0Var3 = bqz0Var4;
                                                                            this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                                            obj3 = t520.f217196a;
                                                                            r2 = obj2;
                                                                            n520Var2.f150456d = r2;
                                                                            n520Var2.f150457e = r2;
                                                                            n520Var2.f150458f = r2;
                                                                            n520Var2.f150459g = r2;
                                                                            n520Var2.f150460h = r2;
                                                                            n520Var2.f150454b = 8;
                                                                            if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                                                return yukVar;
                                                                            }
                                                                            return obj5;
                                                                        }
                                                                    } catch (CancellationException e11) {
                                                                        e = e11;
                                                                        str8 = str8;
                                                                        e3pVar = e3pVar;
                                                                        i4 = 0;
                                                                    } catch (Exception unused11) {
                                                                        context = context;
                                                                    }
                                                                } catch (Exception unused12) {
                                                                    context = context;
                                                                }
                                                            } catch (CancellationException e12) {
                                                                e = e12;
                                                                i4 = 0;
                                                                i4 = i3;
                                                                str11 = str8;
                                                                r3 = 0;
                                                                Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                                if (str11 == null) {
                                                                    throw e;
                                                                }
                                                                n520Var2.f150456d = r3;
                                                                n520Var2.f150457e = r3;
                                                                n520Var2.f150458f = r3;
                                                                n520Var2.f150459g = e;
                                                                n520Var2.f150460h = r3;
                                                                n520Var2.f150461i = i4;
                                                                n520Var2.f150454b = 6;
                                                                objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                                if (objM89557A2 == yukVar) {
                                                                    obj5 = objM89557A2;
                                                                }
                                                                if (obj5 == yukVar) {
                                                                    throw e;
                                                                }
                                                            }
                                                        }
                                                    } catch (CancellationException e13) {
                                                        e = e13;
                                                        e3pVar = e3pVar;
                                                        i4 = 0;
                                                        i4 = i3;
                                                        str11 = str2;
                                                        e3pVar = e3pVar;
                                                        r3 = 0;
                                                        Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                        if (str11 == null) {
                                                            throw e;
                                                        }
                                                        n520Var2.f150456d = r3;
                                                        n520Var2.f150457e = r3;
                                                        n520Var2.f150458f = r3;
                                                        n520Var2.f150459g = e;
                                                        n520Var2.f150460h = r3;
                                                        n520Var2.f150461i = i4;
                                                        n520Var2.f150454b = 6;
                                                        objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                        if (objM89557A2 == yukVar) {
                                                            obj5 = objM89557A2;
                                                        }
                                                        if (obj5 == yukVar) {
                                                            return yukVar;
                                                        }
                                                        throw e;
                                                    }
                                                } catch (CancellationException e14) {
                                                    e = e14;
                                                    i4 = 0;
                                                    i4 = i;
                                                    str11 = str3;
                                                    Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                    if (str11 == null) {
                                                        throw e;
                                                    }
                                                    n520Var2.f150456d = r3;
                                                    n520Var2.f150457e = r3;
                                                    n520Var2.f150458f = r3;
                                                    n520Var2.f150459g = e;
                                                    n520Var2.f150460h = r3;
                                                    n520Var2.f150461i = i4;
                                                    n520Var2.f150454b = 6;
                                                    objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                    if (objM89557A2 == yukVar) {
                                                        obj5 = objM89557A2;
                                                    }
                                                    if (obj5 == yukVar) {
                                                        return yukVar;
                                                    }
                                                    throw e;
                                                } catch (Exception unused13) {
                                                    str11 = str3;
                                                    context = context;
                                                    e3pVar = e3pVar;
                                                    i4 = 0;
                                                    i4 = i;
                                                    Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                                    if (str11 != null) {
                                                        n520Var2.f150456d = bqz0Var4;
                                                        obj2 = null;
                                                        n520Var2.f150457e = null;
                                                        n520Var2.f150458f = null;
                                                        n520Var2.f150459g = null;
                                                        n520Var2.f150460h = null;
                                                        n520Var2.f150461i = i4;
                                                        n520Var2.f150454b = 7;
                                                        objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                                        if (objM89557A != yukVar) {
                                                            objM89557A = obj5;
                                                        }
                                                        break;
                                                    } else {
                                                        obj2 = null;
                                                    }
                                                    bqz0Var3 = bqz0Var4;
                                                    this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                                    obj3 = t520.f217196a;
                                                    r2 = obj2;
                                                    n520Var2.f150456d = r2;
                                                    n520Var2.f150457e = r2;
                                                    n520Var2.f150458f = r2;
                                                    n520Var2.f150459g = r2;
                                                    n520Var2.f150460h = r2;
                                                    n520Var2.f150454b = 8;
                                                    if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                                        return yukVar;
                                                    }
                                                    return obj5;
                                                }
                                                break;
                                            } catch (CancellationException e15) {
                                                e = e15;
                                                i4 = 0;
                                                r3 = 0;
                                                i4 = i;
                                                Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                                                if (str11 == null) {
                                                    throw e;
                                                }
                                                n520Var2.f150456d = r3;
                                                n520Var2.f150457e = r3;
                                                n520Var2.f150458f = r3;
                                                n520Var2.f150459g = e;
                                                n520Var2.f150460h = r3;
                                                n520Var2.f150461i = i4;
                                                n520Var2.f150454b = 6;
                                                objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                                                if (objM89557A2 == yukVar) {
                                                    obj5 = objM89557A2;
                                                }
                                                if (obj5 == yukVar) {
                                                    return yukVar;
                                                }
                                                throw e;
                                            } catch (Exception unused14) {
                                            }
                                        }
                                    }
                                } catch (Exception unused15) {
                                    context = context;
                                    e3pVar = e3pVar;
                                    i4 = 0;
                                    Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                    if (str11 != null) {
                                        n520Var2.f150456d = bqz0Var4;
                                        obj2 = null;
                                        n520Var2.f150457e = null;
                                        n520Var2.f150458f = null;
                                        n520Var2.f150459g = null;
                                        n520Var2.f150460h = null;
                                        n520Var2.f150461i = i4;
                                        n520Var2.f150454b = 7;
                                        objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                        if (objM89557A != yukVar) {
                                            objM89557A = obj5;
                                        }
                                        break;
                                    } else {
                                        obj2 = null;
                                    }
                                    bqz0Var3 = bqz0Var4;
                                    this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                    obj3 = t520.f217196a;
                                    r2 = obj2;
                                    n520Var2.f150456d = r2;
                                    n520Var2.f150457e = r2;
                                    n520Var2.f150458f = r2;
                                    n520Var2.f150459g = r2;
                                    n520Var2.f150460h = r2;
                                    n520Var2.f150454b = 8;
                                    if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                        return yukVar;
                                    }
                                    return obj5;
                                }
                            } catch (Exception unused16) {
                                str11 = null;
                                Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                                if (str11 != null) {
                                    n520Var2.f150456d = bqz0Var4;
                                    obj2 = null;
                                    n520Var2.f150457e = null;
                                    n520Var2.f150458f = null;
                                    n520Var2.f150459g = null;
                                    n520Var2.f150460h = null;
                                    n520Var2.f150461i = i4;
                                    n520Var2.f150454b = 7;
                                    objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                    if (objM89557A != yukVar) {
                                        objM89557A = obj5;
                                    }
                                    break;
                                } else {
                                    obj2 = null;
                                }
                                bqz0Var3 = bqz0Var4;
                                this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                                obj3 = t520.f217196a;
                                r2 = obj2;
                                n520Var2.f150456d = r2;
                                n520Var2.f150457e = r2;
                                n520Var2.f150458f = r2;
                                n520Var2.f150459g = r2;
                                n520Var2.f150460h = r2;
                                n520Var2.f150454b = 8;
                                if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                    return yukVar;
                                }
                                return obj5;
                            }
                        } catch (CancellationException e16) {
                            e = e16;
                            i4 = 0;
                            r3 = 0;
                            Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                            if (str11 == null) {
                                throw e;
                            }
                            n520Var2.f150456d = r3;
                            n520Var2.f150457e = r3;
                            n520Var2.f150458f = r3;
                            n520Var2.f150459g = e;
                            n520Var2.f150460h = r3;
                            n520Var2.f150461i = i4;
                            n520Var2.f150454b = 6;
                            objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                            if (objM89557A2 == yukVar) {
                                obj5 = objM89557A2;
                            }
                            if (obj5 == yukVar) {
                                return yukVar;
                            }
                            throw e;
                        }
                        return yukVar;
                    case 1:
                        int i10 = n520Var2.f150461i;
                        q520 q520Var3 = n520Var2.f150457e;
                        bqz0 bqz0Var5 = n520Var2.f150456d;
                        bga.m29073P(obj4);
                        q520Var = q520Var3;
                        bqz0Var4 = bqz0Var5;
                        i = i10;
                        objM37676k2 = obj4;
                        str3 = ((rvc) objM37676k2).f203049a;
                        strM61968d = mjd.m61968d(6, str3, null);
                        int i11 = i;
                        str2 = str3;
                        i3 = i11;
                        if (str2 == null) {
                            Set set4 = dd41.f47702f;
                            strM35712j = r46.m74726U(q520Var.f185383a).m35712j();
                            wj50.m88279p(strM35712j);
                            break;
                        } else {
                            strM35712j = str2;
                        }
                        int i12 = q520Var.f185386d;
                        n520Var2.f150456d = bqz0Var4;
                        n520Var2.f150457e = q520Var;
                        n520Var2.f150458f = str2;
                        n520Var2.f150459g = null;
                        n520Var2.f150460h = strM35712j;
                        n520Var2.f150461i = i3;
                        n520Var2.f150454b = 4;
                        objM59339p = e3pVar.f55841b.m59339p(i12, strM61968d, n520Var2);
                        if (objM59339p != yukVar) {
                            bqz0Var3 = bqz0Var4;
                            q520Var2 = q520Var;
                            obj4 = objM59339p;
                            str7 = strM35712j;
                            str8 = str2;
                            str9 = (String) obj4;
                            pq4 pq4Var4 = this.f161848b;
                            String str116 = "spotify:chat-invite:" + str7;
                            String string4 = context.getString(R.string.chat_new_group_chat_invite_link_share_message, q520Var2.f185384b);
                            mec0 mec0Var4 = new mec0();
                            mec0Var4.put("pt", str9);
                            context = context;
                            mec0Var4.put("feature", "campfire_invite");
                            mec0Var4.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
                            bve0 bve0Var4 = new bve0(str116, string4, mec0Var4.m61540b());
                            String str117 = this.f161850d;
                            String str118 = this.f161851e;
                            String str119 = q520Var2.f185387e;
                            n520Var2.f150456d = bqz0Var3;
                            n520Var2.f150457e = null;
                            n520Var2.f150458f = str8;
                            n520Var2.f150459g = null;
                            n520Var2.f150460h = str9;
                            n520Var2.f150461i = i3;
                            n520Var2.f150454b = 5;
                            str8 = str8;
                            e3pVar = e3pVar;
                            i4 = 0;
                            objM70620a = pq4Var4.m70620a(context, bve0Var4, str117, str118, "android-libs-inappmessaging", str119, n520Var2);
                            context = context;
                            if (objM70620a != yukVar) {
                                str10 = str9;
                                i4 = i3;
                                str11 = str8;
                                this.f161852f.invoke(str10);
                                obj3 = s520.f205690a;
                                r2 = 0;
                                n520Var2.f150456d = r2;
                                n520Var2.f150457e = r2;
                                n520Var2.f150458f = r2;
                                n520Var2.f150459g = r2;
                                n520Var2.f150460h = r2;
                                n520Var2.f150454b = 8;
                                if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                    return obj5;
                                }
                            }
                        }
                        return yukVar;
                    case 2:
                        int i13 = n520Var2.f150461i;
                        q520 q520Var4 = n520Var2.f150457e;
                        bqz0 bqz0Var6 = n520Var2.f150456d;
                        bga.m29073P(obj4);
                        q520Var = q520Var4;
                        bqz0Var4 = bqz0Var6;
                        i = i13;
                        objM37676k = obj4;
                        str4 = ((rvc) objM37676k).f203049a;
                        str5 = q520Var.f185385c;
                        str6 = q520Var.f185383a;
                        n520Var2.f150456d = bqz0Var4;
                        n520Var2.f150457e = q520Var;
                        n520Var2.f150458f = str4;
                        n520Var2.f150461i = i;
                        n520Var2.f150454b = 3;
                        if (p520.m69161a(e3pVar, str5, str4, str6, n520Var2) != yukVar) {
                            int i14 = i;
                            str2 = str4;
                            i3 = i14;
                            strM61968d = mjd.m61968d(6, str2, null);
                            if (str2 == null) {
                                Set set5 = dd41.f47702f;
                                strM35712j = r46.m74726U(q520Var.f185383a).m35712j();
                                wj50.m88279p(strM35712j);
                            } else {
                                strM35712j = str2;
                            }
                            int i15 = q520Var.f185386d;
                            n520Var2.f150456d = bqz0Var4;
                            n520Var2.f150457e = q520Var;
                            n520Var2.f150458f = str2;
                            n520Var2.f150459g = null;
                            n520Var2.f150460h = strM35712j;
                            n520Var2.f150461i = i3;
                            n520Var2.f150454b = 4;
                            objM59339p = e3pVar.f55841b.m59339p(i15, strM61968d, n520Var2);
                            if (objM59339p != yukVar) {
                                bqz0Var3 = bqz0Var4;
                                q520Var2 = q520Var;
                                obj4 = objM59339p;
                                str7 = strM35712j;
                                str8 = str2;
                                str9 = (String) obj4;
                                pq4 pq4Var5 = this.f161848b;
                                String str1110 = "spotify:chat-invite:" + str7;
                                String string5 = context.getString(R.string.chat_new_group_chat_invite_link_share_message, q520Var2.f185384b);
                                mec0 mec0Var5 = new mec0();
                                mec0Var5.put("pt", str9);
                                context = context;
                                mec0Var5.put("feature", "campfire_invite");
                                mec0Var5.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
                                bve0 bve0Var5 = new bve0(str1110, string5, mec0Var5.m61540b());
                                String str1111 = this.f161850d;
                                String str1112 = this.f161851e;
                                String str1113 = q520Var2.f185387e;
                                n520Var2.f150456d = bqz0Var3;
                                n520Var2.f150457e = null;
                                n520Var2.f150458f = str8;
                                n520Var2.f150459g = null;
                                n520Var2.f150460h = str9;
                                n520Var2.f150461i = i3;
                                n520Var2.f150454b = 5;
                                str8 = str8;
                                e3pVar = e3pVar;
                                i4 = 0;
                                objM70620a = pq4Var5.m70620a(context, bve0Var5, str1111, str1112, "android-libs-inappmessaging", str1113, n520Var2);
                                context = context;
                                if (objM70620a != yukVar) {
                                    str10 = str9;
                                    i4 = i3;
                                    str11 = str8;
                                    this.f161852f.invoke(str10);
                                    obj3 = s520.f205690a;
                                    r2 = 0;
                                    n520Var2.f150456d = r2;
                                    n520Var2.f150457e = r2;
                                    n520Var2.f150458f = r2;
                                    n520Var2.f150459g = r2;
                                    n520Var2.f150460h = r2;
                                    n520Var2.f150454b = 8;
                                    if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                        return obj5;
                                    }
                                }
                            }
                            break;
                        }
                        return yukVar;
                    case 3:
                        i3 = n520Var2.f150461i;
                        str2 = n520Var2.f150458f;
                        q520 q520Var5 = n520Var2.f150457e;
                        bqz0 bqz0Var7 = n520Var2.f150456d;
                        try {
                            bga.m29073P(obj4);
                            q520Var = q520Var5;
                            bqz0Var4 = bqz0Var7;
                            strM61968d = mjd.m61968d(6, str2, null);
                            if (str2 == null) {
                                Set set6 = dd41.f47702f;
                                strM35712j = r46.m74726U(q520Var.f185383a).m35712j();
                                wj50.m88279p(strM35712j);
                            } else {
                                strM35712j = str2;
                            }
                            int i16 = q520Var.f185386d;
                            n520Var2.f150456d = bqz0Var4;
                            n520Var2.f150457e = q520Var;
                            n520Var2.f150458f = str2;
                            n520Var2.f150459g = null;
                            n520Var2.f150460h = strM35712j;
                            n520Var2.f150461i = i3;
                            n520Var2.f150454b = 4;
                            objM59339p = e3pVar.f55841b.m59339p(i16, strM61968d, n520Var2);
                            if (objM59339p != yukVar) {
                                bqz0Var3 = bqz0Var4;
                                q520Var2 = q520Var;
                                obj4 = objM59339p;
                                str7 = strM35712j;
                                str8 = str2;
                                str9 = (String) obj4;
                                pq4 pq4Var6 = this.f161848b;
                                String str1114 = "spotify:chat-invite:" + str7;
                                String string6 = context.getString(R.string.chat_new_group_chat_invite_link_share_message, q520Var2.f185384b);
                                mec0 mec0Var6 = new mec0();
                                mec0Var6.put("pt", str9);
                                context = context;
                                mec0Var6.put("feature", "campfire_invite");
                                mec0Var6.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
                                bve0 bve0Var6 = new bve0(str1114, string6, mec0Var6.m61540b());
                                String str1115 = this.f161850d;
                                String str1116 = this.f161851e;
                                String str1117 = q520Var2.f185387e;
                                n520Var2.f150456d = bqz0Var3;
                                n520Var2.f150457e = null;
                                n520Var2.f150458f = str8;
                                n520Var2.f150459g = null;
                                n520Var2.f150460h = str9;
                                n520Var2.f150461i = i3;
                                n520Var2.f150454b = 5;
                                str8 = str8;
                                e3pVar = e3pVar;
                                i4 = 0;
                                objM70620a = pq4Var6.m70620a(context, bve0Var6, str1115, str1116, "android-libs-inappmessaging", str1117, n520Var2);
                                context = context;
                                if (objM70620a != yukVar) {
                                    str10 = str9;
                                    i4 = i3;
                                    str11 = str8;
                                    this.f161852f.invoke(str10);
                                    obj3 = s520.f205690a;
                                    r2 = 0;
                                    n520Var2.f150456d = r2;
                                    n520Var2.f150457e = r2;
                                    n520Var2.f150458f = r2;
                                    n520Var2.f150459g = r2;
                                    n520Var2.f150460h = r2;
                                    n520Var2.f150454b = 8;
                                    if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                        return obj5;
                                    }
                                }
                            }
                            break;
                        } catch (Exception unused17) {
                            str11 = str2;
                            bqz0Var4 = bqz0Var7;
                            i4 = i3;
                            Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                            if (str11 != null) {
                                n520Var2.f150456d = bqz0Var4;
                                obj2 = null;
                                n520Var2.f150457e = null;
                                n520Var2.f150458f = null;
                                n520Var2.f150459g = null;
                                n520Var2.f150460h = null;
                                n520Var2.f150461i = i4;
                                n520Var2.f150454b = 7;
                                objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                if (objM89557A != yukVar) {
                                    objM89557A = obj5;
                                }
                                break;
                            } else {
                                obj2 = null;
                            }
                            bqz0Var3 = bqz0Var4;
                            this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                            obj3 = t520.f217196a;
                            r2 = obj2;
                            n520Var2.f150456d = r2;
                            n520Var2.f150457e = r2;
                            n520Var2.f150458f = r2;
                            n520Var2.f150459g = r2;
                            n520Var2.f150460h = r2;
                            n520Var2.f150454b = 8;
                            if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                return yukVar;
                            }
                            return obj5;
                        }
                        return yukVar;
                    case 4:
                        i3 = n520Var2.f150461i;
                        str7 = n520Var2.f150460h;
                        str2 = n520Var2.f150458f;
                        q520Var2 = n520Var2.f150457e;
                        bqz0Var3 = n520Var2.f150456d;
                        try {
                            bga.m29073P(obj4);
                            str8 = str2;
                            str9 = (String) obj4;
                            pq4 pq4Var7 = this.f161848b;
                            String str1118 = "spotify:chat-invite:" + str7;
                            String string7 = context.getString(R.string.chat_new_group_chat_invite_link_share_message, q520Var2.f185384b);
                            mec0 mec0Var7 = new mec0();
                            mec0Var7.put("pt", str9);
                            context = context;
                            mec0Var7.put("feature", "campfire_invite");
                            mec0Var7.put("locale", context.getResources().getConfiguration().getLocales().get(0).getLanguage());
                            bve0 bve0Var7 = new bve0(str1118, string7, mec0Var7.m61540b());
                            String str1119 = this.f161850d;
                            String str11110 = this.f161851e;
                            String str11111 = q520Var2.f185387e;
                            n520Var2.f150456d = bqz0Var3;
                            n520Var2.f150457e = null;
                            n520Var2.f150458f = str8;
                            n520Var2.f150459g = null;
                            n520Var2.f150460h = str9;
                            n520Var2.f150461i = i3;
                            n520Var2.f150454b = 5;
                            str8 = str8;
                            e3pVar = e3pVar;
                            i4 = 0;
                            objM70620a = pq4Var7.m70620a(context, bve0Var7, str1119, str11110, "android-libs-inappmessaging", str11111, n520Var2);
                            context = context;
                            if (objM70620a != yukVar) {
                                str10 = str9;
                                i4 = i3;
                                str11 = str8;
                                this.f161852f.invoke(str10);
                                obj3 = s520.f205690a;
                                r2 = 0;
                                n520Var2.f150456d = r2;
                                n520Var2.f150457e = r2;
                                n520Var2.f150458f = r2;
                                n520Var2.f150459g = r2;
                                n520Var2.f150460h = r2;
                                n520Var2.f150454b = 8;
                                if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                    return obj5;
                                }
                            }
                        } catch (Exception unused18) {
                            str11 = str2;
                            bqz0Var4 = bqz0Var3;
                            i4 = i3;
                            Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                            if (str11 != null) {
                                n520Var2.f150456d = bqz0Var4;
                                obj2 = null;
                                n520Var2.f150457e = null;
                                n520Var2.f150458f = null;
                                n520Var2.f150459g = null;
                                n520Var2.f150460h = null;
                                n520Var2.f150461i = i4;
                                n520Var2.f150454b = 7;
                                objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                if (objM89557A != yukVar) {
                                    objM89557A = obj5;
                                }
                                break;
                            } else {
                                obj2 = null;
                            }
                            bqz0Var3 = bqz0Var4;
                            this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                            obj3 = t520.f217196a;
                            r2 = obj2;
                            n520Var2.f150456d = r2;
                            n520Var2.f150457e = r2;
                            n520Var2.f150458f = r2;
                            n520Var2.f150459g = r2;
                            n520Var2.f150460h = r2;
                            n520Var2.f150454b = 8;
                            if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                return yukVar;
                            }
                            return obj5;
                        }
                        return yukVar;
                    case 5:
                        int i17 = n520Var2.f150461i;
                        str10 = n520Var2.f150460h;
                        str3 = n520Var2.f150458f;
                        bqz0 bqz0Var8 = n520Var2.f150456d;
                        try {
                            bga.m29073P(obj4);
                            i4 = i17;
                            i4 = 0;
                            str11 = str3;
                            context = context;
                            e3pVar = e3pVar;
                            bqz0Var3 = bqz0Var8;
                            this.f161852f.invoke(str10);
                            obj3 = s520.f205690a;
                            r2 = 0;
                        } catch (CancellationException e17) {
                            e = e17;
                            i4 = i17;
                            i4 = 0;
                            str11 = str3;
                            Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                            if (str11 == null) {
                                throw e;
                            }
                            n520Var2.f150456d = r3;
                            n520Var2.f150457e = r3;
                            n520Var2.f150458f = r3;
                            n520Var2.f150459g = e;
                            n520Var2.f150460h = r3;
                            n520Var2.f150461i = i4;
                            n520Var2.f150454b = 6;
                            objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                            if (objM89557A2 == yukVar) {
                                obj5 = objM89557A2;
                            }
                            if (obj5 == yukVar) {
                                return yukVar;
                            }
                            throw e;
                        } catch (Exception unused19) {
                            i4 = i17;
                            i4 = 0;
                            str11 = str3;
                            context = context;
                            e3pVar = e3pVar;
                            bqz0Var4 = bqz0Var8;
                            Logger.m3966b("Fetching invitation token failed", new Object[i4]);
                            if (str11 != null) {
                                n520Var2.f150456d = bqz0Var4;
                                obj2 = null;
                                n520Var2.f150457e = null;
                                n520Var2.f150458f = null;
                                n520Var2.f150459g = null;
                                n520Var2.f150460h = null;
                                n520Var2.f150461i = i4;
                                n520Var2.f150454b = 7;
                                objM89557A = x0h1.m89557A(rnj0.f200934b, new dmx((Object) e3pVar, (Object) str11, (fbk) (false ? 1 : 0), 29), n520Var2);
                                if (objM89557A != yukVar) {
                                    objM89557A = obj5;
                                }
                                break;
                            } else {
                                obj2 = null;
                            }
                            bqz0Var3 = bqz0Var4;
                            this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                            obj3 = t520.f217196a;
                            r2 = obj2;
                            n520Var2.f150456d = r2;
                            n520Var2.f150457e = r2;
                            n520Var2.f150458f = r2;
                            n520Var2.f150459g = r2;
                            n520Var2.f150460h = r2;
                            n520Var2.f150454b = 8;
                            if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                                return yukVar;
                            }
                            return obj5;
                        }
                        n520Var2.f150456d = r2;
                        n520Var2.f150457e = r2;
                        n520Var2.f150458f = r2;
                        n520Var2.f150459g = r2;
                        n520Var2.f150460h = r2;
                        n520Var2.f150454b = 8;
                        if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                            return yukVar;
                        }
                        return obj5;
                    case 6:
                        CancellationException cancellationException = n520Var2.f150459g;
                        bga.m29073P(obj4);
                        throw cancellationException;
                    case 7:
                        bqz0Var4 = n520Var2.f150456d;
                        bga.m29073P(obj4);
                        context = context;
                        i4 = 0;
                        obj2 = null;
                        bqz0Var3 = bqz0Var4;
                        this.f161853g.m72305j(new g631(null, context.getResources().getString(R.string.group_invite_link_snackbar_error), null, null, null, null, null, null, i4));
                        obj3 = t520.f217196a;
                        r2 = obj2;
                        n520Var2.f150456d = r2;
                        n520Var2.f150457e = r2;
                        n520Var2.f150458f = r2;
                        n520Var2.f150459g = r2;
                        n520Var2.f150460h = r2;
                        n520Var2.f150454b = 8;
                        if (bqz0Var3.mo30229d(obj3, n520Var2) != yukVar) {
                            return yukVar;
                        }
                        return obj5;
                    case 8:
                        bga.m29073P(obj4);
                        return obj5;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (CancellationException e18) {
                e = e18;
                str11 = str;
                i4 = i3;
                Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
                if (str11 == null) {
                    throw e;
                }
                n520Var2.f150456d = r3;
                n520Var2.f150457e = r3;
                n520Var2.f150458f = r3;
                n520Var2.f150459g = e;
                n520Var2.f150460h = r3;
                n520Var2.f150461i = i4;
                n520Var2.f150454b = 6;
                objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
                if (objM89557A2 == yukVar) {
                    obj5 = objM89557A2;
                }
                if (obj5 == yukVar) {
                    return yukVar;
                }
                throw e;
            }
        } catch (CancellationException e19) {
            e = e19;
            i4 = i3;
            Logger.m3966b("Fetching invitation token was cancelled", new Object[i4]);
            if (str11 == null) {
                throw e;
            }
            n520Var2.f150456d = r3;
            n520Var2.f150457e = r3;
            n520Var2.f150458f = r3;
            n520Var2.f150459g = e;
            n520Var2.f150460h = r3;
            n520Var2.f150461i = i4;
            n520Var2.f150454b = 6;
            objM89557A2 = x0h1.m89557A(rnj0.f200934b, new dmx(e3pVar, str11, (fbk) r3, 29), n520Var2);
            if (objM89557A2 == yukVar) {
                obj5 = objM89557A2;
            }
            if (obj5 == yukVar) {
                return yukVar;
            }
            throw e;
        } catch (Exception unused20) {
            bqz0Var4 = bqz0Var2;
        }
    }
}
