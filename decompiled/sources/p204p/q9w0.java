package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes6.dex */
public final class q9w0 extends lg01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186677a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f186678b;

    /* JADX INFO: renamed from: c */
    public final Object f186679c;

    /* JADX INFO: renamed from: d */
    public final fiz f186680d;

    public q9w0(ywo ywoVar, bx91 bx91Var) {
        this.f186678b = ywoVar;
        this.f186679c = bx91Var;
        this.f186680d = xtm0.m92074U(ywoVar.m94803b(), new nto0((fbk) null, this, 20));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r9 == r6) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m72409a(int i, ibk ibkVar) {
        p9w0 p9w0Var;
        String str;
        if (ibkVar instanceof p9w0) {
            p9w0Var = (p9w0) ibkVar;
            int i2 = p9w0Var.f175320d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p9w0Var.f175320d = i2 - Integer.MIN_VALUE;
            } else {
                p9w0Var = new p9w0(this, ibkVar);
            }
        } else {
            p9w0Var = new p9w0(this, ibkVar);
        }
        Object objM86757v = p9w0Var.f175318b;
        int i3 = p9w0Var.f175320d;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM86757v);
            fiz fizVarM94803b = ((ywo) this.f186678b).m94803b();
            p9w0Var.f175317a = i;
            p9w0Var.f175320d = 1;
            objM86757v = vyf1.m86757v(fizVarM94803b, p9w0Var);
            if (objM86757v != yukVar) {
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = p9w0Var.f175317a;
            bga.m29073P(objM86757v);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = p9w0Var.f175317a;
            bga.m29073P(objM86757v);
        }
        return ((Boolean) objM86757v).booleanValue() ? new ed01(new Integer(i)) : new dd01(0, new Integer(R.string.f5992x6dc620));
        qui quiVar = (qui) objM86757v;
        if (quiVar instanceof pui) {
            str = ((pui) quiVar).f181457a;
        } else if (quiVar instanceof oui) {
            oui ouiVar = (oui) quiVar;
            if (ouiVar.f170297b) {
                str = ouiVar.f170296a;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str == null) {
            return new dd01(0, new Integer(R.string.f5992x6dc620));
        }
        bx91 bx91Var = (bx91) this.f186679c;
        p9w0Var.f175317a = i;
        p9w0Var.f175320d = 2;
        objM86757v = bx91Var.m30767c(i, str, p9w0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (p204p.zn91.m96565n(r10, r2) == r8) goto L31;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m72410b(String str, String str2, ibk ibkVar) {
        ilr0 ilr0Var;
        twx0 twx0Var = (twx0) this.f186678b;
        String str3 = (String) this.f186679c;
        if (ibkVar instanceof ilr0) {
            ilr0Var = (ilr0) ibkVar;
            int i = ilr0Var.f103465e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilr0Var.f103465e = i - Integer.MIN_VALUE;
            } else {
                ilr0Var = new ilr0(this, ibkVar);
            }
        } else {
            ilr0Var = new ilr0(this, ibkVar);
        }
        Object obj = ilr0Var.f103463c;
        int i2 = ilr0Var.f103465e;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(obj);
                    Completable completableM81762b = twx0Var.m81762b(str3, str2);
                    ilr0Var.f103461a = str;
                    ilr0Var.f103462b = str2;
                    ilr0Var.f103465e = 1;
                    if (zn91.m96565n(completableM81762b, ilr0Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                        return new dd01(0, null);
                    }
                    str2 = ilr0Var.f103462b;
                    str = ilr0Var.f103461a;
                    bga.m29073P(obj);
                }
                return new ed01(str2);
            } catch (Exception e) {
                qlg1.m73220y(ilr0Var.getContext());
                Logger.m3967c(e, "Failed to update product state setting for key " + str3, new Object[0]);
                if (str != null) {
                    Completable completableM81762b2 = twx0Var.m81762b(str3, str);
                    ilr0Var.f103461a = null;
                    ilr0Var.f103462b = null;
                    ilr0Var.f103465e = 2;
                }
            }
        } catch (Exception unused) {
            qlg1.m73220y(ilr0Var.getContext());
        }
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        switch (this.f186677a) {
            case 0:
                return (nnc) this.f186680d;
            default:
                return (vjz) this.f186680d;
        }
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        switch (this.f186677a) {
            case 0:
                return m72409a(((Number) obj2).intValue(), (ibk) fbkVar);
            default:
                return m72410b((String) obj, (String) obj2, (ibk) fbkVar);
        }
    }

    public q9w0(vmz vmzVar, twx0 twx0Var, String str) {
        this.f186678b = twx0Var;
        this.f186679c = str;
        this.f186680d = new vjz(new lcw0(vmzVar.m86026c(str, ""), 21), new far0(3, 6, null), 2);
    }
}
