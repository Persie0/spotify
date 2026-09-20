package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.i3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1965i3 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final C1965i3 f97946L0;

    /* JADX INFO: renamed from: M0 */
    public static final C1965i3 f97947M0;

    /* JADX INFO: renamed from: N0 */
    public static final C1965i3 f97948N0;

    /* JADX INFO: renamed from: O0 */
    public static final C1965i3 f97949O0;

    /* JADX INFO: renamed from: P0 */
    public static final C1965i3 f97950P0;

    /* JADX INFO: renamed from: Q0 */
    public static final C1965i3 f97951Q0;

    /* JADX INFO: renamed from: R0 */
    public static final C1965i3 f97952R0;

    /* JADX INFO: renamed from: S0 */
    public static final C1965i3 f97953S0;

    /* JADX INFO: renamed from: T0 */
    public static final C1965i3 f97954T0;

    /* JADX INFO: renamed from: U0 */
    public static final C1965i3 f97955U0;

    /* JADX INFO: renamed from: V0 */
    public static final C1965i3 f97956V0;

    /* JADX INFO: renamed from: W0 */
    public static final C1965i3 f97957W0;

    /* JADX INFO: renamed from: X */
    public static final C1965i3 f97958X;

    /* JADX INFO: renamed from: X0 */
    public static final C1965i3 f97959X0;

    /* JADX INFO: renamed from: Y */
    public static final C1965i3 f97960Y;

    /* JADX INFO: renamed from: Y0 */
    public static final C1965i3 f97961Y0;

    /* JADX INFO: renamed from: Z */
    public static final C1965i3 f97962Z;

    /* JADX INFO: renamed from: Z0 */
    public static final C1965i3 f97963Z0;

    /* JADX INFO: renamed from: a1 */
    public static final C1965i3 f97964a1;

    /* JADX INFO: renamed from: b */
    public static final C1965i3 f97965b;

    /* JADX INFO: renamed from: b1 */
    public static final C1965i3 f97966b1;

    /* JADX INFO: renamed from: c */
    public static final C1965i3 f97967c;

    /* JADX INFO: renamed from: c1 */
    public static final C1965i3 f97968c1;

    /* JADX INFO: renamed from: d */
    public static final C1965i3 f97969d;

    /* JADX INFO: renamed from: e */
    public static final C1965i3 f97970e;

    /* JADX INFO: renamed from: f */
    public static final C1965i3 f97971f;

    /* JADX INFO: renamed from: g */
    public static final C1965i3 f97972g;

    /* JADX INFO: renamed from: h */
    public static final C1965i3 f97973h;

    /* JADX INFO: renamed from: i */
    public static final C1965i3 f97974i;

    /* JADX INFO: renamed from: t */
    public static final C1965i3 f97975t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97976a;

    static {
        int i = 2;
        f97965b = new C1965i3(i, 0);
        f97967c = new C1965i3(i, 1);
        f97969d = new C1965i3(i, 2);
        f97970e = new C1965i3(i, 3);
        f97971f = new C1965i3(i, 4);
        f97972g = new C1965i3(i, 5);
        f97973h = new C1965i3(i, 6);
        f97974i = new C1965i3(i, 7);
        f97975t = new C1965i3(i, 8);
        f97958X = new C1965i3(i, 9);
        f97960Y = new C1965i3(i, 10);
        f97962Z = new C1965i3(i, 11);
        f97946L0 = new C1965i3(i, 12);
        f97947M0 = new C1965i3(i, 13);
        f97948N0 = new C1965i3(i, 14);
        f97949O0 = new C1965i3(i, 15);
        f97950P0 = new C1965i3(i, 16);
        f97951Q0 = new C1965i3(i, 17);
        f97952R0 = new C1965i3(i, 18);
        f97953S0 = new C1965i3(i, 19);
        f97954T0 = new C1965i3(i, 20);
        f97955U0 = new C1965i3(i, 21);
        f97956V0 = new C1965i3(i, 22);
        f97957W0 = new C1965i3(i, 23);
        f97959X0 = new C1965i3(i, 24);
        f97961Y0 = new C1965i3(i, 25);
        f97963Z0 = new C1965i3(i, 26);
        f97964a1 = new C1965i3(i, 27);
        f97966b1 = new C1965i3(i, 28);
        f97968c1 = new C1965i3(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1965i3(int i, int i2) {
        super(i);
        this.f97976a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        List list;
        boolean zM88271j;
        m340 m340Var;
        z240 z240VarM60640a;
        rfz rfzVar;
        tdu pduVar;
        Boolean boolValueOf;
        vj0 vj0Var;
        vj0 vj0Var2;
        switch (this.f97976a) {
            case 0:
                C1846f3 c1846f3 = (C1846f3) obj;
                C1764d3 c1764d3 = (C1764d3) obj2;
                return new C1883g3(c1846f3.f65322a, c1846f3.f65323b, c1846f3.f65324c, c1764d3.f44701b, c1764d3.f44700a, c1764d3.f44703d, c1764d3.f44704e, c1764d3.f44702c);
            case 1:
                C2558x3 c2558x3 = (C2558x3) obj;
                return new C2599y3(((C2519w3) obj2).f247447a, c2558x3.f257606a, c2558x3.f257607b);
            case 2:
                C2280q4 c2280q4 = (C2280q4) obj;
                C2325r4 c2325r4 = (C2325r4) obj2;
                C2325r4 c2325r4M74705c = C2325r4.m74705c(c2325r4, c2280q4.f185010a, c2280q4.f185011b, c2280q4.f185012c, null, null, null, 0, 0, null, 504);
                String str = c2280q4.f185010a;
                return !wj50.m88271j(str, c2325r4.f195600a) ? Next.m15607i(c2325r4M74705c, Collections.singleton(new C2039k4(str))) : Next.m15606h(c2325r4M74705c);
            case 3:
                C2325r4 c2325r5 = (C2325r4) obj2;
                return First.m15575c(C2325r4.m74705c(c2325r5, null, null, null, null, null, null, 0, 0, null, 255), Collections.singleton(new C2039k4(c2325r5.f195600a)));
            case 4:
                return new C1787dr((C1751cr) obj);
            case 5:
                return new C1752cs(((Boolean) obj2).booleanValue());
            case 6:
                C1908gs c1908gs = (C1908gs) obj;
                return new C1953hs(c1908gs.f83857a, c1908gs.f83858b, ((Boolean) obj2).booleanValue());
            case 7:
                return (InterfaceC2426ts) obj2;
            case 8:
                Object objM96523K = zn91.m96523K((Bundle) obj, "parcelable", InterfaceC2426ts.class);
                wj50.m88279p(objM96523K);
                return (Parcelable) objM96523K;
            case 9:
                return new C1718bu(((C1680au) obj).f19772a, ((Boolean) obj2).booleanValue());
            case 10:
                vb0 vb0Var = (vb0) obj;
                wb0 wb0Var = (wb0) obj2;
                ub0 ub0Var = vb0Var.f239354e;
                if (ub0Var == null || (list = ub0Var.f228591c) == null) {
                    list = wb0Var.f249650b;
                }
                return new wb0(wb0Var.f249649a, list, vb0Var);
            case 11:
                ec0 ec0Var = (ec0) obj;
                av31 av31Var = (av31) obj2;
                if (av31Var instanceof yu31) {
                    return new mjo(new jjo(((yu31) av31Var).f276272a.toString()));
                }
                if (!(av31Var instanceof zu31)) {
                    throw new NoWhenBranchMatchedException();
                }
                pqm0 pqm0Var = (pqm0) ((zu31) av31Var).f286335a;
                PlayerState playerState = (PlayerState) pqm0Var.f180351b;
                fc0 fc0Var = (fc0) pqm0Var.f180350a;
                String str2 = ec0Var.f58165b;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                int i = 1;
                if (contextTrack == null || !wj50.m88271j(e72.m37967A(contextTrack), "standalone") || e72.m37968B(contextTrack) == null) {
                    zM88271j = wj50.m88271j(fc0Var != null ? fc0Var.f67962a : null, str2);
                } else {
                    zM88271j = hdi.m47210B(playerState).equals(str2) || wj50.m88271j(e72.m37968B(contextTrack), str2);
                }
                if (zM88271j) {
                    i = 2;
                    if (!playerState.isBuffering() && playerState.isPlaying() && !playerState.isPaused()) {
                        i = 3;
                    }
                }
                return new ojo(new dc0(i));
            case 12:
                yd0 yd0Var = (yd0) obj;
                vd0 vd0Var = (vd0) obj2;
                return (vd0Var.f240285b.length() <= 0 && vd0Var.f240284a.length() <= 0) ? ae0.f14705a : new zd0(yd0Var.f271601a, vd0Var.f240285b, vd0Var.f240284a, yd0Var.f271603c, yd0Var.f271604d);
            case 13:
                v140 v140Var = (v140) obj;
                erc1 erc1Var = (erc1) obj2;
                String str3 = null;
                String str4 = v140Var != null ? v140Var.f236243a : null;
                if (str4 == null) {
                    str4 = "";
                }
                if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (z240VarM60640a = m340Var.m60640a(a340.f11861b)) != null && (rfzVar = z240VarM60640a.f278475a) != null) {
                    str3 = rfzVar.f198763a;
                }
                if (str3 == null) {
                    str3 = "";
                }
                return new vd0(str3, str4, "");
            case 14:
                hi0 hi0Var = (hi0) obj;
                return Next.m15607i(new fj0(hi0Var), Collections.singleton(new qf9(hi0Var.f91624a.mo29280c())));
            case 15:
                return First.m15575c((fj0) obj2, Collections.singleton(new qf9(((hi0) obj).f91624a.mo29280c())));
            case 16:
                jj0 jj0Var = (jj0) obj;
                ij0 ij0Var = (ij0) obj2;
                Integer numValueOf = Integer.valueOf(R.string.settings_disabled_reason_failed_to_load);
                int i2 = jj0Var.f112850a;
                String str5 = jj0Var.f112851b;
                String str6 = jj0Var.f112852c;
                List list2 = jj0Var.f112854e;
                tdu tduVar = ij0Var.f102663c;
                Boolean bool = (Boolean) ij0Var.f102661a.mo35690a();
                boolean zM88271j2 = wj50.m88271j(bool, Boolean.TRUE);
                tdu pduVar2 = rdu.f198207a;
                if (zM88271j2) {
                    pduVar = pduVar2;
                } else if (wj50.m88271j(bool, Boolean.FALSE)) {
                    pduVar = new pdu(Integer.valueOf(R.string.ad_category_disabled_reason_tailored_ads), null);
                } else {
                    if (bool != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pduVar = new pdu(numValueOf, null);
                }
                fd01 fd01Var = ij0Var.f102662b;
                pdu pduVar3 = new pdu(numValueOf, null);
                if (!(fd01Var instanceof ed01)) {
                    if (!(fd01Var instanceof dd01)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Integer num = ((dd01) fd01Var).f47688a;
                    pduVar2 = num != null ? new pdu(Integer.valueOf(num.intValue()), null) : pduVar3;
                }
                return new lj0(i2, str5, str6, list2, qlk.m73227f(tduVar, pduVar, pduVar2));
            case 17:
                ik0 ik0Var = (ik0) obj;
                hk0 hk0Var = (hk0) obj2;
                tdu tduVar2 = ik0Var.f102941d;
                fd01 fd01Var2 = hk0Var.f92303a;
                Boolean boolValueOf2 = null;
                tdu pduVar4 = new pdu(Integer.valueOf(R.string.settings_disabled_reason_failed_to_load), null);
                if (fd01Var2 instanceof ed01) {
                    pduVar4 = rdu.f198207a;
                } else {
                    if (!(fd01Var2 instanceof dd01)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Integer num2 = ((dd01) fd01Var2).f47688a;
                    if (num2 != null) {
                        pduVar4 = new pdu(Integer.valueOf(num2.intValue()), null);
                    }
                }
                tdu tduVarM73227f = qlk.m73227f(tduVar2, pduVar4);
                int i3 = ik0Var.f102938a;
                String str7 = ik0Var.f102939b;
                String str8 = ik0Var.f102940c;
                boolean z = tduVarM73227f instanceof rdu;
                hk0 hk0Var2 = z ? hk0Var : null;
                if (hk0Var2 != null) {
                    fd01 fd01Var3 = hk0Var2.f92303a;
                    ed01 ed01Var = fd01Var3 instanceof ed01 ? (ed01) fd01Var3 : null;
                    if (ed01Var == null || (vj0Var2 = (vj0) ed01Var.f58419a) == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(oqq0.m67655a(vj0Var2, i3));
                    }
                } else {
                    boolValueOf = null;
                }
                if (!z) {
                    hk0Var = null;
                }
                if (hk0Var != null && (vj0Var = hk0Var.f92304b) != null) {
                    boolValueOf2 = Boolean.valueOf(oqq0.m67655a(vj0Var, ik0Var.f102938a));
                }
                return new jk0(i3, str7, str8, boolValueOf, boolValueOf2, tduVarM73227f);
            case 18:
                return (lp0) obj2;
            case 19:
                return (cpo0) obj2;
            case 20:
                return (cpo0) obj2;
            case 21:
                pqm0 pqm0Var2 = (pqm0) obj2;
                return new su0((String) pqm0Var2.f180350a, ((Restrictions) pqm0Var2.f180351b).disallowSeekingReasons().isEmpty());
            case 22:
                pqm0 pqm0Var3 = (pqm0) obj2;
                return new su0((String) pqm0Var3.f180350a, ((Restrictions) pqm0Var3.f180351b).disallowSeekingReasons().isEmpty());
            case 23:
                pqm0 pqm0Var4 = (pqm0) obj2;
                return new xu0((String) pqm0Var4.f180350a, ((Restrictions) pqm0Var4.f180351b).disallowSeekingReasons().isEmpty());
            case 24:
                pqm0 pqm0Var5 = (pqm0) obj2;
                return new xu0((String) pqm0Var5.f180350a, ((Restrictions) pqm0Var5.f180351b).disallowSeekingReasons().isEmpty());
            case 25:
                yk91 yk91Var = (yk91) obj2;
                String str9 = (String) yk91Var.f273650a;
                Restrictions restrictions = (Restrictions) yk91Var.f273651b;
                return new qm21(str9, restrictions.disallowSkippingPrevReasons().isEmpty() || restrictions.disallowSeekingReasons().isEmpty(), (am81) yk91Var.f273652c);
            case 26:
                yk91 yk91Var2 = (yk91) obj2;
                String str10 = (String) yk91Var2.f273650a;
                Restrictions restrictions2 = (Restrictions) yk91Var2.f273651b;
                return new qm21(str10, restrictions2.disallowSkippingPrevReasons().isEmpty() || restrictions2.disallowSeekingReasons().isEmpty(), (am81) yk91Var2.f273652c);
            case 27:
                String strM38012j0 = e72.m38012j0((ContextTrack) obj2);
                if (strM38012j0 == null) {
                    strM38012j0 = "";
                }
                return new dg81(16, strM38012j0, hv0.f95515t, false);
            case 28:
                return (zw0) obj2;
            default:
                long j = ((Offset) obj2).f493a;
                return w2a1.f247311a;
        }
    }
}
