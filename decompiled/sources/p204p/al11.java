package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class al11 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final al11 f16705L0;

    /* JADX INFO: renamed from: M0 */
    public static final al11 f16706M0;

    /* JADX INFO: renamed from: N0 */
    public static final al11 f16707N0;

    /* JADX INFO: renamed from: O0 */
    public static final al11 f16708O0;

    /* JADX INFO: renamed from: P0 */
    public static final al11 f16709P0;

    /* JADX INFO: renamed from: Q0 */
    public static final al11 f16710Q0;

    /* JADX INFO: renamed from: R0 */
    public static final al11 f16711R0;

    /* JADX INFO: renamed from: S0 */
    public static final al11 f16712S0;

    /* JADX INFO: renamed from: T0 */
    public static final al11 f16713T0;

    /* JADX INFO: renamed from: U0 */
    public static final al11 f16714U0;

    /* JADX INFO: renamed from: V0 */
    public static final al11 f16715V0;

    /* JADX INFO: renamed from: W0 */
    public static final al11 f16716W0;

    /* JADX INFO: renamed from: X */
    public static final al11 f16717X;

    /* JADX INFO: renamed from: X0 */
    public static final al11 f16718X0;

    /* JADX INFO: renamed from: Y */
    public static final al11 f16719Y;

    /* JADX INFO: renamed from: Y0 */
    public static final al11 f16720Y0;

    /* JADX INFO: renamed from: Z */
    public static final al11 f16721Z;

    /* JADX INFO: renamed from: Z0 */
    public static final al11 f16722Z0;

    /* JADX INFO: renamed from: a1 */
    public static final al11 f16723a1;

    /* JADX INFO: renamed from: b */
    public static final al11 f16724b;

    /* JADX INFO: renamed from: b1 */
    public static final al11 f16725b1;

    /* JADX INFO: renamed from: c */
    public static final al11 f16726c;

    /* JADX INFO: renamed from: c1 */
    public static final al11 f16727c1;

    /* JADX INFO: renamed from: d */
    public static final al11 f16728d;

    /* JADX INFO: renamed from: e */
    public static final al11 f16729e;

    /* JADX INFO: renamed from: f */
    public static final al11 f16730f;

    /* JADX INFO: renamed from: g */
    public static final al11 f16731g;

    /* JADX INFO: renamed from: h */
    public static final al11 f16732h;

    /* JADX INFO: renamed from: i */
    public static final al11 f16733i;

    /* JADX INFO: renamed from: t */
    public static final al11 f16734t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16735a;

    static {
        int i = 2;
        f16724b = new al11(i, 0);
        f16726c = new al11(i, 1);
        f16728d = new al11(i, 2);
        f16729e = new al11(i, 3);
        f16730f = new al11(i, 4);
        f16731g = new al11(i, 5);
        f16732h = new al11(i, 6);
        f16733i = new al11(i, 7);
        f16734t = new al11(i, 8);
        f16717X = new al11(i, 9);
        f16719Y = new al11(i, 10);
        f16721Z = new al11(i, 11);
        f16705L0 = new al11(i, 12);
        f16706M0 = new al11(i, 13);
        f16707N0 = new al11(i, 14);
        f16708O0 = new al11(i, 15);
        f16709P0 = new al11(i, 16);
        f16710Q0 = new al11(i, 17);
        f16711R0 = new al11(i, 18);
        f16712S0 = new al11(i, 19);
        f16713T0 = new al11(i, 20);
        f16714U0 = new al11(i, 21);
        f16715V0 = new al11(i, 22);
        f16716W0 = new al11(i, 23);
        f16718X0 = new al11(i, 24);
        f16720Y0 = new al11(i, 25);
        f16722Z0 = new al11(i, 26);
        f16723a1 = new al11(i, 27);
        f16725b1 = new al11(i, 28);
        f16727c1 = new al11(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al11(int i, int i2) {
        super(i);
        this.f16735a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0282  */
    /* JADX WARN: Code duplicated, block: B:128:0x0294  */
    /* JADX WARN: Code duplicated, block: B:129:0x029c  */
    /* JADX WARN: Code duplicated, block: B:138:0x028f A[SYNTHETIC] */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        ln11 in11Var;
        Iterator it;
        Object next;
        xm11 xm11Var;
        String str;
        iv11 iv11Var;
        switch (this.f16735a) {
            case 0:
                yk11 yk11Var = (yk11) obj;
                return new zk11(yk11Var.f273542a, yk11Var.f273543b, yk11Var.f273544c, yk11Var.f273546e, yk11Var.f273547f, yk11Var.f273548g, yk11Var.f273549h, true, ((o2y) obj2).f161174a, yk11Var.f273553l);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                fo11 fo11Var = (fo11) obj2;
                List listMo33479a = fo11Var.mo33479a();
                if (listMo33479a == null || !listMo33479a.isEmpty()) {
                    Iterator it2 = listMo33479a.iterator();
                    while (it2.hasNext()) {
                        if (((xm11) it2.next()).f263270e == 1) {
                            in11Var = kn11.f124273a;
                        }
                    }
                    it = fo11Var.mo33479a().iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        xm11Var = (xm11) next;
                        if (xm11Var != null) {
                            in11Var = new in11(xm11Var.f263266a);
                        } else {
                            in11Var = jn11.f113986a;
                        }
                    } while (((xm11) next).f263270e != 3);
                    xm11Var = (xm11) next;
                    if (xm11Var != null) {
                        in11Var = new in11(xm11Var.f263266a);
                    } else {
                        in11Var = jn11.f113986a;
                    }
                } else {
                    it = fo11Var.mo33479a().iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        xm11Var = (xm11) next;
                        if (xm11Var != null) {
                            in11Var = new in11(xm11Var.f263266a);
                        } else {
                            in11Var = jn11.f113986a;
                        }
                    } while (((xm11) next).f263270e != 3);
                    xm11Var = (xm11) next;
                    if (xm11Var != null) {
                        in11Var = new in11(xm11Var.f263266a);
                    } else {
                        in11Var = jn11.f113986a;
                    }
                }
                return new zm11(in11Var);
            case 4:
                return Boolean.valueOf(wj50.m88271j(((mo11) obj).f145545a.f16396a, ((mo11) obj2).f145545a.f16396a));
            case 5:
                return obj;
            case 6:
                return ((Boolean) obj2).booleanValue() ? "1" : "0";
            case 7:
                return ((Boolean) obj2).booleanValue() ? "1" : "0";
            case 8:
                return new yr11((String) obj2);
            case 9:
                lu11 lu11Var = (lu11) obj;
                return new mu11(lu11Var.f136957a, lu11Var.f136958b, !((Boolean) obj2).booleanValue(), lu11Var.f136959c);
            case 10:
                return ((ht11) obj).f94896b;
            case 11:
                udh0 udh0Var = (udh0) obj;
                int i = ((bv11) dv11.f53339e.get(((pbi0) obj2).f175852a)).f31257e;
                dv91 dv91Var = new dv91("hit", 1);
                pqm0 pqm0Var = new pqm0("setting_name", "selected_shuffle_algorithm");
                if (i == 1) {
                    str = "classic";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    str = "fewer_repeats";
                }
                return new av91("", "", dv91Var, new bv91("set_multiple_choice_setting", 1, kkc0.m56695h0(pqm0Var, new pqm0("option_selected", str))), udh0Var.f229254a, ((vch0) udh0Var.f229255b.f76422c).f240134b, System.currentTimeMillis());
            case 12:
                return ((bv11) dv11.f53339e.get(((Number) obj2).intValue())).f31253a.f20072a;
            case 13:
                gv11 gv11Var = (gv11) obj2;
                int iOrdinal = gv11Var.f84591a.ordinal();
                iv11 iv11Var2 = iv11.f106067a;
                if (iOrdinal == 0) {
                    iv11Var = iv11Var2;
                } else if (iOrdinal == 1) {
                    iv11Var = iv11.f106068b;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iv11Var = iv11.f106069c;
                }
                boolean z = gv11Var.f84593c;
                if (z) {
                    iv11Var = null;
                }
                if (iv11Var != null) {
                    iv11Var2 = iv11Var;
                }
                return new jv11(iv11Var2, gv11Var.f84592b, z);
            case 14:
                return (ow11) obj2;
            case 15:
                Object objM96523K = zn91.m96523K((Bundle) obj, "parcelable", ow11.class);
                wj50.m88279p(objM96523K);
                return (Parcelable) objM96523K;
            case 16:
                return new ry11((qy11) obj, (uy11) obj2);
            case 17:
                Bundle bundle = (Bundle) obj;
                qz11 qz11Var = (qz11) obj2;
                String string = bundle.getString("username");
                Uri uri = (Uri) zn91.m96523K(bundle, "imageUri", Uri.class);
                String string2 = bundle.getString("displayName");
                int i2 = bundle.getInt("backgroundColor");
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 == 0) {
                    numValueOf = null;
                }
                return new rz11(string, uri, string2, numValueOf != null ? new n6f(rfg1.m75432b(numValueOf.intValue())) : null, qz11Var.f194088a, 32);
            case 18:
                ((d7u) obj).f46273c = ((bcs) obj2).f25936a;
                return w2a1.f247311a;
            case 19:
                ((d7u) obj).f46274d = (pi21) obj2;
                return w2a1.f247311a;
            case 20:
                yk91 yk91Var = (yk91) obj2;
                String str2 = (String) yk91Var.f273650a;
                hg40 hg40Var = (hg40) yk91Var.f273651b;
                am81 am81Var = (am81) yk91Var.f273652c;
                wj50.m88279p(str2);
                return new jm21(str2, hg40Var.isEmpty() || hg40Var.equals(Collections.singleton("mft_disallow")), am81Var);
            case 21:
                yk91 yk91Var2 = (yk91) obj2;
                String str3 = (String) yk91Var2.f273650a;
                Restrictions restrictions = (Restrictions) yk91Var2.f273651b;
                return new qm21(str3, restrictions.disallowSkippingPrevReasons().isEmpty() || restrictions.disallowSeekingReasons().isEmpty(), (am81) yk91Var2.f273652c);
            case 22:
                return Boolean.valueOf(wj50.m88271j(((ContextTrack) obj).uri(), ((ContextTrack) obj2).uri()));
            case 23:
                return (zn21) obj2;
            case 24:
                pqm0 pqm0Var2 = (pqm0) obj2;
                return new kp21((String) pqm0Var2.f180350a, ((Boolean) pqm0Var2.f180351b).booleanValue());
            case 25:
                b131 b131Var = (b131) obj2;
                return new n131(((e131) obj).f55115a, b131Var.f22202a, b131Var.f22203b, b131Var.f22204c, 1, b131Var.f22205d, true, b131Var.f22206e);
            case 26:
                return Next.m15608j();
            case 27:
                return First.m15574b(iev0.m50400a((iev0) obj2, ((l331) obj).f129196a, false, null, 100));
            case 28:
                return null;
            default:
                return null;
        }
    }
}
