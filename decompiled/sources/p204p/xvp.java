package p204p;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class xvp implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ za7 f266445b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f266446c;

    public /* synthetic */ xvp(int i, za7 za7Var, gh00 gh00Var) {
        this.f266444a = i;
        this.f266445b = za7Var;
        this.f266446c = gh00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object jfl0Var;
        String strMo66853b;
        Object kfl0Var;
        rfl0 rfl0Var;
        Boolean bool;
        qfl0 qfl0Var;
        Boolean bool2;
        switch (this.f266444a) {
            case 0:
                sfl0 sfl0Var = (sfl0) this.f266445b.f280995d;
                if (sfl0Var != null) {
                    if (sfl0Var instanceof ofl0) {
                        jfl0Var = new hfl0(((ofl0) sfl0Var).f164820d);
                    } else if (sfl0Var instanceof pfl0) {
                        pfl0 pfl0Var = (pfl0) sfl0Var;
                        jfl0Var = new jfl0(pfl0Var.f177107h, pfl0Var.f177108i);
                    } else {
                        jfl0Var = null;
                    }
                    if (jfl0Var != null) {
                        this.f266446c.invoke(jfl0Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sfl0 sfl0Var2 = (sfl0) this.f266445b.f280995d;
                if (sfl0Var2 == null || (strMo66853b = sfl0Var2.mo66853b()) == null) {
                    return;
                }
                this.f266446c.invoke(new lfl0(strMo66853b));
                return;
            case 2:
                sfl0 sfl0Var3 = (sfl0) this.f266445b.f280995d;
                if (sfl0Var3 != null) {
                    if ((sfl0Var3 instanceof qfl0) && (bool2 = (qfl0Var = (qfl0) sfl0Var3).f188261h) != null) {
                        String str = qfl0Var.f188260g;
                        if (str == null) {
                            str = "";
                        }
                        kfl0Var = bool2.booleanValue() ? new kfl0(str, false) : new efl0(str, false);
                    } else if (!(sfl0Var3 instanceof rfl0) || (bool = (rfl0Var = (rfl0) sfl0Var3).f198689i) == null) {
                        kfl0Var = null;
                    } else {
                        String str2 = rfl0Var.f198688h;
                        kfl0Var = bool.booleanValue() ? new kfl0(str2, true) : new efl0(str2, true);
                    }
                    if (kfl0Var != null) {
                        this.f266446c.invoke(kfl0Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                sfl0 sfl0Var4 = (sfl0) this.f266445b.f280995d;
                if (sfl0Var4 != null) {
                    boolean z = sfl0Var4 instanceof qfl0;
                    gh00 gh00Var = this.f266446c;
                    if (z) {
                        qfl0 qfl0Var2 = (qfl0) sfl0Var4;
                        String str3 = qfl0Var2.f188260g;
                        if (str3 == null) {
                            str3 = qfl0Var2.f188257d;
                        }
                        gh00Var.invoke(new ffl0(str3, false));
                        return;
                    }
                    if (sfl0Var4 instanceof rfl0) {
                        gh00Var.invoke(new ffl0(((rfl0) sfl0Var4).f198688h, true));
                        return;
                    }
                    if (sfl0Var4 instanceof ofl0) {
                        gh00Var.invoke(new gfl0(((ofl0) sfl0Var4).f164820d));
                        return;
                    } else {
                        if (!(sfl0Var4 instanceof pfl0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pfl0 pfl0Var2 = (pfl0) sfl0Var4;
                        gh00Var.invoke(new ifl0(pfl0Var2.f177107h, pfl0Var2.f177108i));
                        return;
                    }
                }
                return;
        }
    }
}
