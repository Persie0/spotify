package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class mtv extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final mtv f147159L0;

    /* JADX INFO: renamed from: M0 */
    public static final mtv f147160M0;

    /* JADX INFO: renamed from: N0 */
    public static final mtv f147161N0;

    /* JADX INFO: renamed from: O0 */
    public static final mtv f147162O0;

    /* JADX INFO: renamed from: P0 */
    public static final mtv f147163P0;

    /* JADX INFO: renamed from: Q0 */
    public static final mtv f147164Q0;

    /* JADX INFO: renamed from: R0 */
    public static final mtv f147165R0;

    /* JADX INFO: renamed from: S0 */
    public static final mtv f147166S0;

    /* JADX INFO: renamed from: T0 */
    public static final mtv f147167T0;

    /* JADX INFO: renamed from: U0 */
    public static final mtv f147168U0;

    /* JADX INFO: renamed from: V0 */
    public static final mtv f147169V0;

    /* JADX INFO: renamed from: W0 */
    public static final mtv f147170W0;

    /* JADX INFO: renamed from: X */
    public static final mtv f147171X;

    /* JADX INFO: renamed from: X0 */
    public static final mtv f147172X0;

    /* JADX INFO: renamed from: Y */
    public static final mtv f147173Y;

    /* JADX INFO: renamed from: Y0 */
    public static final mtv f147174Y0;

    /* JADX INFO: renamed from: Z */
    public static final mtv f147175Z;

    /* JADX INFO: renamed from: Z0 */
    public static final mtv f147176Z0;

    /* JADX INFO: renamed from: a1 */
    public static final mtv f147177a1;

    /* JADX INFO: renamed from: b */
    public static final mtv f147178b;

    /* JADX INFO: renamed from: b1 */
    public static final mtv f147179b1;

    /* JADX INFO: renamed from: c */
    public static final mtv f147180c;

    /* JADX INFO: renamed from: c1 */
    public static final mtv f147181c1;

    /* JADX INFO: renamed from: d */
    public static final mtv f147182d;

    /* JADX INFO: renamed from: e */
    public static final mtv f147183e;

    /* JADX INFO: renamed from: f */
    public static final mtv f147184f;

    /* JADX INFO: renamed from: g */
    public static final mtv f147185g;

    /* JADX INFO: renamed from: h */
    public static final mtv f147186h;

    /* JADX INFO: renamed from: i */
    public static final mtv f147187i;

    /* JADX INFO: renamed from: t */
    public static final mtv f147188t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147189a;

    static {
        int i = 2;
        f147178b = new mtv(i, 0);
        f147180c = new mtv(i, 1);
        f147182d = new mtv(i, 2);
        f147183e = new mtv(i, 3);
        f147184f = new mtv(i, 4);
        f147185g = new mtv(i, 5);
        f147186h = new mtv(i, 6);
        f147187i = new mtv(i, 7);
        f147188t = new mtv(i, 8);
        f147171X = new mtv(i, 9);
        f147173Y = new mtv(i, 10);
        f147175Z = new mtv(i, 11);
        f147159L0 = new mtv(i, 12);
        f147160M0 = new mtv(i, 13);
        f147161N0 = new mtv(i, 14);
        f147162O0 = new mtv(i, 15);
        f147163P0 = new mtv(i, 16);
        f147164Q0 = new mtv(i, 17);
        f147165R0 = new mtv(i, 18);
        f147166S0 = new mtv(i, 19);
        f147167T0 = new mtv(i, 20);
        f147168U0 = new mtv(i, 21);
        f147169V0 = new mtv(i, 22);
        f147170W0 = new mtv(i, 23);
        f147172X0 = new mtv(i, 24);
        f147174Y0 = new mtv(i, 25);
        f147176Z0 = new mtv(i, 26);
        f147177a1 = new mtv(i, 27);
        f147179b1 = new mtv(i, 28);
        f147181c1 = new mtv(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mtv(int i, int i2) {
        super(i);
        this.f147189a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        Object objM34164h;
        pad1 pad1Var;
        List<uqm0> listUnmodifiableList;
        String str;
        cbf0 cbf0VarM35556a;
        cbf0 cbf0VarM35556a2;
        cbf0 cbf0VarM35556a3;
        switch (this.f147189a) {
            case 0:
                return (ktv) obj2;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                xvv xvvVar = (xvv) obj;
                dwv dwvVar = (dwv) obj2;
                if (dwvVar instanceof awv) {
                    objM34164h = awv.m27344h((awv) dwvVar, xvvVar.f266518c, null, null, null, null, 0, 4093);
                } else if (dwvVar instanceof yvv) {
                    objM34164h = yvv.m94753h((yvv) dwvVar, xvvVar.f266516a, xvvVar.f266517b, xvvVar.f266518c, null, 56);
                } else {
                    if (!(dwvVar instanceof cwv)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objM34164h = cwv.m34164h((cwv) dwvVar, xvvVar.f266516a, xvvVar.f266517b, xvvVar.f266518c, null, 8);
                }
                return Next.m15606h(objM34164h);
            case 4:
                pad1 pad1Var2 = (pad1) obj;
                sxg1 sxg1Var = pad1Var2 != null ? pad1Var2.f175509a : null;
                iad1 iad1Var = sxg1Var instanceof iad1 ? (iad1) sxg1Var : null;
                return iad1Var != null ? new i5a0("episode_page:entity_explorer", iad1Var) : j5a0.f108923a;
            case 5:
                String str2 = (String) obj;
                qho qhoVar = (qho) obj2;
                sxg1 sxg1Var2 = null;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                if (ohoVar != null && (pad1Var = (pad1) ohoVar.f165512a) != null) {
                    sxg1Var2 = pad1Var.f175509a;
                }
                return new i3y(str2, sxg1Var2 != null);
            case 6:
                return new i3y((String) obj, ((Boolean) obj2).booleanValue());
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return (g3w) obj2;
            case 10:
                x5w x5wVar = (x5w) obj2;
                aoo0 aoo0Var = x5wVar.f258530a;
                return new y5w(aoo0Var.f17727a, aoo0Var.f17729c, x5wVar.f258531b);
            case 11:
                return Boolean.valueOf(wj50.m88271j(((n53) obj).f150466d, ((n53) obj2).f150466d));
            case 12:
                return ufc1.m82980w(((ijm0) obj).f102846b, (b250) obj2);
            case 13:
                int iOrdinal = ((fkx) obj2).ordinal();
                if (iOrdinal == 0) {
                    return new dkx(1);
                }
                if (iOrdinal == 1) {
                    return new dkx(2);
                }
                if (iOrdinal == 2) {
                    return ckx.f39106a;
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                return ((v4o0) obj).f237212e;
            case 15:
                return Next.m15608j();
            case 16:
                return (ty80) obj;
            case 17:
                return new h3y(obj, obj2);
            case 18:
                vqm0 vqm0VarM89960a = ((x4y) obj2).m89960a();
                if (vqm0VarM89960a == null || (listUnmodifiableList = Collections.unmodifiableList(vqm0VarM89960a.f243963a)) == null) {
                    return lau.f131415a;
                }
                ArrayList arrayList = new ArrayList();
                for (uqm0 uqm0Var : listUnmodifiableList) {
                    j6f.m52564V(h6f.m46715L(Integer.valueOf(uqm0Var.f233081d), Integer.valueOf(uqm0Var.f233082e)), arrayList);
                }
                return arrayList;
            case 19:
                return null;
            case 20:
                return null;
            case 21:
                return null;
            case 22:
                return null;
            case 23:
                return ufc1.m82980w(((jjm0) obj).f113058b, (b250) obj2);
            case 24:
                return ufc1.m82980w(((kjm0) obj).f123382b, (b250) obj2);
            case 25:
                return ufc1.m82980w(((ljm0) obj).f134103b, (b250) obj2);
            case 26:
                khy khyVar = (khy) obj;
                ohy nhyVar = (ohy) obj2;
                zgy zgyVar = khyVar.f122738b;
                if (!(nhyVar instanceof lhy) || !wj50.m88271j(((lhy) nhyVar).f133665b, zgyVar.f282733a)) {
                    nhyVar = new nhy(khyVar.f122737a, zgyVar.f282733a, zgyVar.f282734b, zgyVar.f282735c, khyVar.f122740d);
                }
                return First.m15575c(nhyVar, Collections.singleton(new hgt(khyVar.f122737a, zgyVar.f282733a, zgyVar.f282734b, zgyVar.f282735c)));
            case 27:
                loy loyVar = (loy) obj;
                return Next.m15606h(moy.m62423a((moy) obj2, loyVar.f135563a, loyVar.f135564b, loyVar.f135565c, loyVar.f135566d, null, false, false, false, null, false, false, loyVar.f135567e, loyVar.f135568f, loyVar.f135569g, false, loyVar.f135570h, loyVar.f135571i, false, loyVar.f135572j, 149488));
            case 28:
                return First.m15575c((moy) obj2, Collections.singleton(vly.f242622a));
            default:
                odb1 odb1Var = (odb1) obj;
                ebf0 ebf0Var = (ebf0) obj2;
                String str3 = odb1Var.f164145a;
                dbf0 dbf0VarM38368c = ebf0Var.m38368c(wil.class, str3);
                jcl0 jcl0Var = null;
                wil wilVar = (dbf0VarM38368c == null || (cbf0VarM35556a3 = dbf0VarM38368c.m35556a()) == null) ? null : (wil) cbf0VarM35556a3.f36107a;
                dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(bd00.class, str3);
                bd00 bd00Var = (dbf0VarM38368c2 == null || (cbf0VarM35556a2 = dbf0VarM38368c2.m35556a()) == null) ? null : (bd00) cbf0VarM35556a2.f36107a;
                if (bd00Var == null) {
                    str = null;
                } else {
                    bd00 bd00Var2 = bd00Var.f25970b ? bd00Var : null;
                    if (bd00Var2 != null) {
                        str = bd00Var2.f25971c;
                    } else {
                        str = null;
                    }
                }
                if (str == null) {
                    str = "";
                }
                dbf0 dbf0VarM38368c3 = ebf0Var.m38368c(jcl0.class, str3);
                if (dbf0VarM38368c3 != null && (cbf0VarM35556a = dbf0VarM38368c3.m35556a()) != null) {
                    jcl0Var = (jcl0) cbf0VarM35556a.f36107a;
                }
                return new zty(str, bjg1.m29459j0(odb1Var, jcl0Var, wilVar), bjg1.m29461k0(odb1Var.f164150f, bd00Var), bjg1.m29457i0(odb1Var, wilVar));
        }
    }
}
