package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o290 {

    /* JADX INFO: renamed from: a */
    public final m500 f160984a;

    /* JADX INFO: renamed from: b */
    public final qcx0 f160985b;

    /* JADX INFO: renamed from: c */
    public final yz80 f160986c;

    /* JADX INFO: renamed from: d */
    public final a850 f160987d;

    /* JADX INFO: renamed from: e */
    public final q831 f160988e;

    /* JADX INFO: renamed from: f */
    public final qkx0 f160989f;

    /* JADX INFO: renamed from: g */
    public final jh10 f160990g;

    public o290(m500 m500Var, qcx0 qcx0Var, yz80 yz80Var, a850 a850Var, q831 q831Var, qkx0 qkx0Var, jh10 jh10Var) {
        this.f160984a = m500Var;
        this.f160985b = qcx0Var;
        this.f160986c = yz80Var;
        this.f160987d = a850Var;
        this.f160988e = q831Var;
        this.f160989f = qkx0Var;
        this.f160990g = jh10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r11 == r4) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m66096a(o290 o290Var, String str, boolean z, ibk ibkVar) {
        n290 n290Var;
        if (ibkVar instanceof n290) {
            n290Var = (n290) ibkVar;
            int i = n290Var.f149711e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n290Var.f149711e = i - Integer.MIN_VALUE;
            } else {
                n290Var = new n290(o290Var, ibkVar);
            }
        } else {
            n290Var = new n290(o290Var, ibkVar);
        }
        Object objM63320q = n290Var.f149709c;
        int i2 = n290Var.f149711e;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                z = n290Var.f149708b;
                str = n290Var.f149707a;
                bga.m29073P(objM63320q);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM63320q);
            }
            ((p2x0) objM63320q).m68971d();
            return w2a1.f247311a;
        }
        bga.m29073P(objM63320q);
        yz80 yz80Var = o290Var.f160986c;
        List listSingletonList = Collections.singletonList(str);
        lnn0 lnn0Var = z ? lnn0.f135184c : lnn0.f135185d;
        Integer num = new Integer(3500);
        n290Var.f149707a = str;
        n290Var.f149708b = z;
        n290Var.f149711e = 1;
        objM63320q = ((n090) yz80Var).m63320q(listSingletonList, lnn0Var, num, n290Var);
        if (objM63320q != yukVar) {
        }
        return yukVar;
        ((p2x0) objM63320q).m68971d();
        if (z) {
            qkx0 qkx0Var = o290Var.f160989f;
            List listSingletonList2 = Collections.singletonList(str);
            n290Var.f149707a = null;
            n290Var.f149708b = z;
            n290Var.f149711e = 2;
            objM63320q = ((rkx0) qkx0Var).m75802c(listSingletonList2, false, n290Var);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final f5k m66097b(String str, lnn0 lnn0Var) {
        return new f5k("list_toggle_private", lnn0Var.m59499a() ? euu.f63076c : mru.f146615c, (c5k) null, Integer.valueOf(lnn0Var.m59499a() ? R.string.playlist_options_menu_make_public : R.string.playlist_options_menu_make_private), (String) null, false, (p221) null, new e5k(new v4k(2), 1, new d5k(ay80.f21140R0, new ri80(3, lnn0Var, str)), new x740(this, str, lnn0Var, 12)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m66098c(int i, String str, p290 p290Var, ibk ibkVar) {
        l290 l290Var;
        p290 p290Var2;
        String str2;
        if (ibkVar instanceof l290) {
            l290Var = (l290) ibkVar;
            int i2 = l290Var.f128949d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l290Var.f128949d = i2 - Integer.MIN_VALUE;
            } else {
                l290Var = new l290(this, ibkVar);
            }
        } else {
            l290Var = new l290(this, ibkVar);
        }
        l290 l290Var2 = l290Var;
        Object objM72573c = l290Var2.f128947b;
        int i3 = l290Var2.f128949d;
        if (i3 == 0) {
            bga.m29073P(objM72573c);
            js3 js3Var = new js3(this, str, p290Var, null, 10);
            try {
                qcx0 qcx0Var = this.f160985b;
                x740 x740Var = new x740(this, str, p290Var, 13);
                l290Var2.f128946a = p290Var;
                l290Var2.f128949d = 1;
                objM72573c = qcx0Var.m72573c(i, js3Var, x740Var, pwv0.f182118N0, l290Var2);
                yuk yukVar = yuk.f276404a;
                if (objM72573c == yukVar) {
                    return yukVar;
                }
                p290Var2 = p290Var;
            } catch (IllegalStateException e) {
                e = e;
                p290Var2 = p290Var;
                if (p290Var2 == p290.f173302a) {
                    str2 = "public";
                } else {
                    str2 = "private";
                }
                Logger.m3967c(e, "MakePrivateItem: Failed to set list to ".concat(str2), new Object[0]);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p290Var2 = l290Var2.f128946a;
            try {
                bga.m29073P(objM72573c);
            } catch (IllegalStateException e2) {
                e = e2;
                if (p290Var2 == p290.f173302a) {
                    str2 = "public";
                } else {
                    str2 = "private";
                }
                Logger.m3967c(e, "MakePrivateItem: Failed to set list to ".concat(str2), new Object[0]);
            }
        }
        return w2a1.f247311a;
    }
}
