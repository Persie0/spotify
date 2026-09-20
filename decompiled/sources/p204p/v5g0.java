package p204p;

import com.spotify.playlistmixing.proto.SetTransition;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class v5g0 {

    /* JADX INFO: renamed from: a */
    public final wt80 f237489a;

    /* JADX INFO: renamed from: b */
    public final yz80 f237490b;

    /* JADX INFO: renamed from: c */
    public final r991 f237491c;

    public v5g0(wt80 wt80Var, yz80 yz80Var, r991 r991Var) {
        this.f237489a = wt80Var;
        this.f237490b = yz80Var;
        this.f237491c = r991Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x0125  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0182  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m84720a(String str, String str2, String str3, String str4, rg61 rg61Var, ibk ibkVar) {
        u5g0 u5g0Var;
        String str5;
        rg61 rg61Var2;
        Object objM63309f;
        String str6;
        List list;
        String str7;
        String str8;
        String str9;
        Object objM86755t;
        List list2;
        String str10;
        List list3;
        String str11;
        p2x0 p2x0Var;
        if (ibkVar instanceof u5g0) {
            u5g0Var = (u5g0) ibkVar;
            int i = u5g0Var.f227052i;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5g0Var.f227052i = i - Integer.MIN_VALUE;
            } else {
                u5g0Var = new u5g0(this, ibkVar);
            }
        } else {
            u5g0Var = new u5g0(this, ibkVar);
        }
        u5g0 u5g0Var2 = u5g0Var;
        Object objM63325v = u5g0Var2.f227050g;
        int i2 = u5g0Var2.f227052i;
        yz80 yz80Var = this.f237490b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM63325v);
            this.f237491c.getClass();
            b791 b791VarM75016a = r991.m75016a(str2);
            if (b791VarM75016a == null) {
                return new k2x0(new i2x0("Failed to decode transition blob"));
            }
            rzl0 rzl0Var = b791VarM75016a.f24196b;
            List listM46715L = h6f.m46715L(rzl0Var.f204174a, rzl0Var.f204175b);
            u5g0Var2.f227044a = str;
            str5 = str2;
            u5g0Var2.f227045b = str5;
            rg61Var2 = rg61Var;
            u5g0Var2.f227046c = rg61Var2;
            u5g0Var2.f227052i = 1;
            objM63309f = ((n090) this.f237490b).m63309f(str, listM46715L, str3, str4, null, u5g0Var2);
            if (objM63309f != yukVar) {
                str6 = str;
            }
            return yukVar;
        }
        if (i2 == 1) {
            rg61Var2 = u5g0Var2.f227046c;
            String str12 = u5g0Var2.f227045b;
            str6 = u5g0Var2.f227044a;
            bga.m29073P(objM63325v);
            objM63309f = objM63325v;
            str5 = str12;
        } else {
            if (i2 == 2) {
                list = u5g0Var2.f227047d;
                String str13 = u5g0Var2.f227045b;
                String str14 = u5g0Var2.f227044a;
                bga.m29073P(objM63325v);
                str7 = str14;
                str8 = str13;
                str9 = (String) g6f.m43745s0(list);
                if (str9 == null) {
                    return new k2x0(new i2x0("No row ID returned after adding tracks"));
                }
                u5g0Var2.f227044a = str7;
                u5g0Var2.f227045b = str8;
                u5g0Var2.f227046c = null;
                u5g0Var2.f227047d = list;
                u5g0Var2.f227048e = str9;
                u5g0Var2.f227052i = 3;
                objM86755t = vyf1.m86755t(new be11(((mu80) this.f237489a).m62848m(str7, str9, i221.f97709a), 2), u5g0Var2);
                if (objM86755t != yukVar) {
                    objM86755t = w2a1.f247311a;
                }
                if (objM86755t != yukVar) {
                    list2 = list;
                    str10 = str9;
                    m601 m601VarM19431r = SetTransition.m19431r();
                    m601VarM19431r.m60934r(str8);
                    m601VarM19431r.m60933q();
                    gva byteString = ((SetTransition) m601VarM19431r.build()).toByteString();
                    u5g0Var2.f227044a = str7;
                    u5g0Var2.f227045b = null;
                    u5g0Var2.f227046c = null;
                    u5g0Var2.f227047d = list2;
                    u5g0Var2.f227048e = null;
                    u5g0Var2.f227052i = 4;
                    objM63325v = ((n090) yz80Var).m63325v(str7, str10, "set-transition", byteString, u5g0Var2);
                    if (objM63325v != yukVar) {
                        list3 = list2;
                        str11 = str7;
                    }
                }
                return yukVar;
            }
            if (i2 == 3) {
                str10 = u5g0Var2.f227048e;
                list2 = u5g0Var2.f227047d;
                str8 = u5g0Var2.f227045b;
                str7 = u5g0Var2.f227044a;
                bga.m29073P(objM63325v);
                m601 m601VarM19431r2 = SetTransition.m19431r();
                m601VarM19431r2.m60934r(str8);
                m601VarM19431r2.m60933q();
                gva byteString2 = ((SetTransition) m601VarM19431r2.build()).toByteString();
                u5g0Var2.f227044a = str7;
                u5g0Var2.f227045b = null;
                u5g0Var2.f227046c = null;
                u5g0Var2.f227047d = list2;
                u5g0Var2.f227048e = null;
                u5g0Var2.f227052i = 4;
                objM63325v = ((n090) yz80Var).m63325v(str7, str10, "set-transition", byteString2, u5g0Var2);
                if (objM63325v != yukVar) {
                    list3 = list2;
                    str11 = str7;
                }
                return yukVar;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k2x0 k2x0Var = u5g0Var2.f227049f;
                bga.m29073P(objM63325v);
                return k2x0Var;
            }
            list3 = u5g0Var2.f227047d;
            str11 = u5g0Var2.f227044a;
            bga.m29073P(objM63325v);
        }
        p2x0Var = (p2x0) objM63325v;
        if (p2x0Var instanceof k2x0) {
            return new m2x0(list3);
        }
        u5g0Var2.f227044a = null;
        u5g0Var2.f227045b = null;
        u5g0Var2.f227046c = null;
        u5g0Var2.f227047d = null;
        u5g0Var2.f227048e = null;
        u5g0Var2.f227049f = (k2x0) p2x0Var;
        u5g0Var2.f227052i = 5;
        if (((n090) yz80Var).m63318o(str11, list3, u5g0Var2) != yukVar) {
            return yukVar;
        }
        return p2x0Var;
        p2x0 p2x0Var2 = (p2x0) objM63309f;
        if (p2x0Var2 instanceof k2x0) {
            return p2x0Var2;
        }
        if (!(p2x0Var2 instanceof m2x0)) {
            throw new NoWhenBranchMatchedException();
        }
        List list4 = (List) ((m2x0) p2x0Var2).f139474a;
        u5g0Var2.f227044a = str6;
        u5g0Var2.f227045b = str5;
        u5g0Var2.f227046c = null;
        u5g0Var2.f227047d = list4;
        u5g0Var2.f227052i = 2;
        if (((n090) yz80Var).m63326w(str6, rg61Var2, u5g0Var2) != yukVar) {
            list = list4;
            str7 = str6;
            str8 = str5;
            str9 = (String) g6f.m43745s0(list);
            if (str9 == null) {
                return new k2x0(new i2x0("No row ID returned after adding tracks"));
            }
            u5g0Var2.f227044a = str7;
            u5g0Var2.f227045b = str8;
            u5g0Var2.f227046c = null;
            u5g0Var2.f227047d = list;
            u5g0Var2.f227048e = str9;
            u5g0Var2.f227052i = 3;
            objM86755t = vyf1.m86755t(new be11(((mu80) this.f237489a).m62848m(str7, str9, i221.f97709a), 2), u5g0Var2);
            if (objM86755t != yukVar) {
                objM86755t = w2a1.f247311a;
            }
            if (objM86755t != yukVar) {
                list2 = list;
                str10 = str9;
                m601 m601VarM19431r3 = SetTransition.m19431r();
                m601VarM19431r3.m60934r(str8);
                m601VarM19431r3.m60933q();
                gva byteString3 = ((SetTransition) m601VarM19431r3.build()).toByteString();
                u5g0Var2.f227044a = str7;
                u5g0Var2.f227045b = null;
                u5g0Var2.f227046c = null;
                u5g0Var2.f227047d = list2;
                u5g0Var2.f227048e = null;
                u5g0Var2.f227052i = 4;
                objM63325v = ((n090) yz80Var).m63325v(str7, str10, "set-transition", byteString3, u5g0Var2);
                if (objM63325v != yukVar) {
                    list3 = list2;
                    str11 = str7;
                    p2x0Var = (p2x0) objM63325v;
                    if (p2x0Var instanceof k2x0) {
                        return new m2x0(list3);
                    }
                    u5g0Var2.f227044a = null;
                    u5g0Var2.f227045b = null;
                    u5g0Var2.f227046c = null;
                    u5g0Var2.f227047d = null;
                    u5g0Var2.f227048e = null;
                    u5g0Var2.f227049f = (k2x0) p2x0Var;
                    u5g0Var2.f227052i = 5;
                    if (((n090) yz80Var).m63318o(str11, list3, u5g0Var2) != yukVar) {
                        return p2x0Var;
                    }
                }
            }
        }
        return yukVar;
    }
}
