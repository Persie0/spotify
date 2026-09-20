package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class s9w implements qr01 {

    /* JADX INFO: renamed from: a */
    public final Context f207075a;

    /* JADX INFO: renamed from: b */
    public final fus0 f207076b;

    /* JADX INFO: renamed from: c */
    public final zuv f207077c;

    /* JADX INFO: renamed from: d */
    public final wpx f207078d;

    /* JADX INFO: renamed from: e */
    public final boolean f207079e;

    public s9w(Context context, fus0 fus0Var, zuv zuvVar, wpx wpxVar, boolean z) {
        this.f207075a = context;
        this.f207076b = fus0Var;
        this.f207077c = zuvVar;
        this.f207078d = wpxVar;
        this.f207079e = z;
    }

    /* JADX INFO: renamed from: c */
    public static sr01 m77594c(v9w v9wVar, String str, om01 om01Var) {
        String str2;
        gcr0 gcr0Var;
        e0w e0wVar = v9wVar.f239049b;
        e0w e0wVar2 = v9wVar.f239049b;
        t611 t611Var = v9wVar.f239053f;
        yj11 yj11Var = v9wVar.f239048a;
        if (!e0wVar.m37505c()) {
            gcr0 gcr0Var2 = e0wVar.f55048c;
            int i = t611Var.f217417a;
            int i2 = t611Var.f217419c;
            String str3 = e0wVar.f55047b;
            str2 = yj11Var != null ? yj11Var.f273266b : null;
            return m77595f(new fw6(gcr0Var2, i, i2, str3, str2 == null ? "" : str2, om01Var), qpv0.f191387a.mo54112b(rv6.class), yj01.f273239a, vsg1.m86352l(gn80.SHARE_FORMAT_FULL_CONTENT_AUDIO, new String[0]), str, e0wVar2.f55046a);
        }
        gcr0 gcr0Var3 = v9wVar.f239052e;
        if (yj11Var == null || (gcr0Var = yj11Var.f273267c) == null) {
            gcr0Var = e0wVar.f55048c;
        }
        gcr0 gcr0Var4 = gcr0Var;
        int i3 = t611Var.f217417a;
        int i4 = t611Var.f217419c;
        String str4 = e0wVar.f55047b;
        str2 = yj11Var != null ? yj11Var.f273266b : null;
        return m77595f(new we00(gcr0Var3, gcr0Var4, i3, i4, str4, str2 == null ? "" : str2, om01Var), qpv0.f191387a.mo54112b(le00.class), k5j.f119531a, vsg1.m86352l(gn80.SHARE_FORMAT_FULL_CONTENT_VIDEO, new String[0]), str, e0wVar2.f55046a);
    }

    /* JADX INFO: renamed from: f */
    public static sr01 m77595f(as01 as01Var, up60 up60Var, ck01 ck01Var, xr01 xr01Var, String str, String str2) {
        return new sr01(new rr01(new lu01(str2, null, null, null, null, null, null, 126), xr01Var), new nk01(new um01(up60Var), as01Var, ck01Var, false), new q111(null, null, false, str, 7));
    }

    @Override // p204p.qr01
    /* JADX INFO: renamed from: a */
    public final boolean mo51501a(v9w v9wVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [p.wwu] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p204p.qr01
    /* JADX INFO: renamed from: b */
    public final Object mo51502b(v9w v9wVar, String str, fbk fbkVar) throws Throwable {
        p9w p9wVar;
        String str2;
        Object objM77596d;
        s9w s9wVar;
        v9w v9wVar2;
        String str3;
        s9w s9wVar2;
        String string;
        Long l;
        String strM42747d;
        mwu mwuVar;
        ?? r9;
        v9w v9wVar3 = v9wVar;
        if (fbkVar instanceof p9w) {
            p9wVar = (p9w) fbkVar;
            int i = p9wVar.f175316i;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9wVar.f175316i = i - Integer.MIN_VALUE;
            } else {
                p9wVar = new p9w(this, (ibk) fbkVar);
            }
        } else {
            p9wVar = new p9w(this, (ibk) fbkVar);
        }
        Object objM77597e = p9wVar.f175314g;
        int i2 = p9wVar.f175316i;
        fus0 fus0Var = this.f207076b;
        Context context = this.f207075a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM77597e);
            ume umeVar = v9wVar3.f239051d;
            e0w e0wVar = v9wVar3.f239049b;
            if (umeVar == null || !this.f207079e) {
                String string2 = context.getString(R.string.episode_share_full_episode_tab_title);
                Long l2 = e0wVar.f55052g;
                String string3 = l2 != null ? context.getString(R.string.episode_share_full_episode_card_label_with_duration, fus0Var.m42747d(l2.longValue())) : context.getString(R.string.episode_share_full_episode_card_label_without_duration);
                wj50.m88279p(string3);
                return m77594c(v9wVar3, string2, new om01(string3, e0wVar.m37505c() ? mwu.f147884c : null));
            }
            String str4 = umeVar.f231838a;
            p9wVar.f175308a = v9wVar3;
            p9wVar.f175316i = 1;
            objM77597e = m77597e(str4, p9wVar);
            if (objM77597e != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            v9wVar3 = p9wVar.f175308a;
            bga.m29073P(objM77597e);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v9wVar3 = p9wVar.f175313f;
            s9w s9wVar3 = p9wVar.f175312e;
            String str5 = p9wVar.f175311d;
            v9w v9wVar4 = p9wVar.f175310c;
            s9w s9wVar4 = p9wVar.f175309b;
            bga.m29073P(objM77597e);
            v9wVar2 = v9wVar4;
            str3 = str5;
            s9wVar2 = s9wVar3;
            s9wVar = s9wVar4;
            objM77596d = objM77597e;
            str2 = null;
        }
        string = (String) objM77596d;
        s9wVar2.getClass();
        l = v9wVar3.f239049b.f55052g;
        if (l != null) {
            strM42747d = s9wVar2.f207076b.m42747d(l.longValue());
        } else {
            strM42747d = str2;
        }
        if (string.length() == 0) {
            if (strM42747d == null) {
                string = "";
            } else {
                string = strM42747d;
            }
        } else if (strM42747d != null) {
            string = s9wVar2.f207075a.getString(R.string.episode_share_card_type_with_duration, string, strM42747d);
        }
        mwuVar = mwu.f147884c;
        if (v9wVar3.f239049b.m37505c()) {
            r9 = mwuVar;
        } else {
            r9 = str2;
        }
        om01 om01Var = new om01(string, r9);
        s9wVar.getClass();
        return m77594c(v9wVar2, str3, om01Var);
        o9w o9wVar = (o9w) objM77597e;
        if (o9wVar != null) {
            String str6 = o9wVar.f163145a;
            Set set = dd41.f47702f;
            if (!r46.m74708A(str6, gn80.SHOW_SHOW)) {
                String str7 = o9wVar.f163146b;
                str2 = null;
                p9wVar.f175308a = null;
                p9wVar.f175309b = this;
                p9wVar.f175310c = v9wVar3;
                p9wVar.f175311d = str7;
                p9wVar.f175312e = this;
                p9wVar.f175313f = v9wVar3;
                p9wVar.f175316i = 2;
                objM77596d = m77596d(str6, p9wVar);
                if (objM77596d != yukVar) {
                    s9wVar = this;
                    v9wVar2 = v9wVar3;
                    str3 = str7;
                    s9wVar2 = s9wVar;
                    string = (String) objM77596d;
                    s9wVar2.getClass();
                    l = v9wVar3.f239049b.f55052g;
                    if (l != null) {
                        strM42747d = s9wVar2.f207076b.m42747d(l.longValue());
                    } else {
                        strM42747d = str2;
                    }
                    if (string.length() == 0) {
                        if (strM42747d == null) {
                            string = "";
                        } else {
                            string = strM42747d;
                        }
                    } else if (strM42747d != null) {
                        string = s9wVar2.f207075a.getString(R.string.episode_share_card_type_with_duration, string, strM42747d);
                    }
                    mwuVar = mwu.f147884c;
                    if (v9wVar3.f239049b.m37505c()) {
                        r9 = mwuVar;
                    } else {
                        r9 = str2;
                    }
                    om01 om01Var2 = new om01(string, r9);
                    s9wVar.getClass();
                    return m77594c(v9wVar2, str3, om01Var2);
                }
                return yukVar;
            }
            yj11 yj11Var = v9wVar3.f239048a;
            if (yj11Var != null) {
                gcr0 gcr0Var = yj11Var.f273267c;
                if (gcr0Var == null) {
                    gcr0Var = v9wVar3.f239049b.f55048c;
                }
                gcr0 gcr0Var2 = gcr0Var;
                t611 t611Var = v9wVar3.f239053f;
                int i3 = t611Var.f217417a;
                int i4 = t611Var.f217419c;
                String str8 = yj11Var.f273266b;
                String str9 = yj11Var.f273268d;
                Long l3 = yj11Var.f273269e;
                String string4 = l3 != null ? context.getString(R.string.audiobook_share_full_episode_card_label_with_duration, fus0Var.m42747d(l3.longValue())) : context.getString(R.string.audiobook_share_full_episode_card_label_without_duration);
                wj50.m88279p(string4);
                return m77595f(new fw6(gcr0Var2, i3, i4, str8, str9, new om01(string4, null)), qpv0.f191387a.mo54112b(rv6.class), yj01.f273239a, vsg1.m86352l(gn80.SHARE_FORMAT_AUDIOBOOK, new String[0]), o9wVar.f163146b, str6);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m77596d(String str, ibk ibkVar) throws Throwable {
        q9w q9wVar;
        Object c6x0Var;
        if (ibkVar instanceof q9w) {
            q9wVar = (q9w) ibkVar;
            int i = q9wVar.f186676c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9wVar.f186676c = i - Integer.MIN_VALUE;
            } else {
                q9wVar = new q9w(this, ibkVar);
            }
        } else {
            q9wVar = new q9w(this, ibkVar);
        }
        Object objM88728d = q9wVar.f186674a;
        int i2 = q9wVar.f186676c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM88728d);
                wpx wpxVar = this.f207078d;
                q9wVar.f186676c = 1;
                objM88728d = wpxVar.m88728d(str, q9wVar);
                yuk yukVar = yuk.f276404a;
                if (objM88728d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM88728d);
            }
            c6x0Var = ((v140) objM88728d).f236244b;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
            throw thM77348a;
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        String str2 = (String) c6x0Var;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m77597e(String str, ibk ibkVar) throws Throwable {
        r9w r9wVar;
        Object c6x0Var;
        String str2;
        if (ibkVar instanceof r9w) {
            r9wVar = (r9w) ibkVar;
            int i = r9wVar.f197131c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9wVar.f197131c = i - Integer.MIN_VALUE;
            } else {
                r9wVar = new r9w(this, ibkVar);
            }
        } else {
            r9wVar = new r9w(this, ibkVar);
        }
        Object objM97079b = r9wVar.f197129a;
        int i2 = r9wVar.f197131c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM97079b);
                zuv zuvVar = this.f207077c;
                r9wVar.f197131c = 1;
                objM97079b = zuvVar.m97079b(str, r9wVar);
                yuk yukVar = yuk.f276404a;
                if (objM97079b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM97079b);
            }
            c6x0Var = (suv) objM97079b;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
            throw thM77348a;
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        suv suvVar = (suv) c6x0Var;
        if (suvVar == null || (str2 = suvVar.f214224a) == null) {
            return null;
        }
        if (str2.length() <= 0) {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return new o9w(str2, suvVar.f214225b);
    }
}
