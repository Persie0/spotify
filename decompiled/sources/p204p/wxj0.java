package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wxj0 implements jxj0 {

    /* JADX INFO: renamed from: f */
    public static final fv31 f256048f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f256049g;

    /* JADX INFO: renamed from: h */
    public static final fv31 f256050h;

    /* JADX INFO: renamed from: a */
    public final xre f256051a;

    /* JADX INFO: renamed from: b */
    public final Single f256052b;

    /* JADX INFO: renamed from: c */
    public final fv31 f256053c;

    /* JADX INFO: renamed from: d */
    public final fv31 f256054d;

    /* JADX INFO: renamed from: e */
    public final fv31 f256055e;

    static {
        new si5(18);
        si5 si5Var = fv31.f73628b;
        f256048f = si5Var.m78183U("notification_opt_in_nudge_interaction_timestamp");
        f256049g = si5Var.m78183U("notification_opt_in_nudge_interaction_chat_id");
        f256050h = si5Var.m78183U("notification_opt_in_nudge_alert_interaction_page_uri");
    }

    public wxj0(xre xreVar, Single single, k44 k44Var) {
        this.f256051a = xreVar;
        this.f256052b = single;
        int iM55340k = k44Var.m55340k();
        this.f256053c = si5.m78176z(iM55340k);
        this.f256054d = si5.m78160A(iM55340k, "notification_opt_in_nudge_dismiss_count");
        this.f256055e = si5.m78160A(iM55340k, "notification_opt_in_nudge_interaction_count");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m89305a(ibk ibkVar) {
        kxj0 kxj0Var;
        List list;
        if (ibkVar instanceof kxj0) {
            kxj0Var = (kxj0) ibkVar;
            int i = kxj0Var.f127515d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kxj0Var.f127515d = i - Integer.MIN_VALUE;
            } else {
                kxj0Var = new kxj0(this, ibkVar);
            }
        } else {
            kxj0Var = new kxj0(this, ibkVar);
        }
        Object obj = kxj0Var.f127513b;
        int i2 = kxj0Var.f127515d;
        if (i2 == 0) {
            bga.m29073P(obj);
            List listM46715L = h6f.m46715L(this.f256053c, f256048f, f256049g, f256050h, this.f256054d, this.f256055e);
            kxj0Var.f127512a = listM46715L;
            kxj0Var.f127515d = 1;
            Object objM96567o = zn91.m96567o(this.f256052b, kxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
            list = listM46715L;
            obj = objM96567o;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = kxj0Var.f127512a;
            bga.m29073P(obj);
        }
        lv31 lv31VarEdit = ((hv31) obj).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lv31VarEdit.m60053f((fv31) it.next());
        }
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m89306b(ibk ibkVar) {
        lxj0 lxj0Var;
        if (ibkVar instanceof lxj0) {
            lxj0Var = (lxj0) ibkVar;
            int i = lxj0Var.f137833c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxj0Var.f137833c = i - Integer.MIN_VALUE;
            } else {
                lxj0Var = new lxj0(this, ibkVar);
            }
        } else {
            lxj0Var = new lxj0(this, ibkVar);
        }
        Object objM96567o = lxj0Var.f137831a;
        int i2 = lxj0Var.f137833c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            lxj0Var.f137833c = 1;
            objM96567o = zn91.m96567o(this.f256052b, lxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60053f(f256050h);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m89307c(ibk ibkVar) {
        mxj0 mxj0Var;
        if (ibkVar instanceof mxj0) {
            mxj0Var = (mxj0) ibkVar;
            int i = mxj0Var.f148065c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mxj0Var.f148065c = i - Integer.MIN_VALUE;
            } else {
                mxj0Var = new mxj0(this, ibkVar);
            }
        } else {
            mxj0Var = new mxj0(this, ibkVar);
        }
        Object objM96567o = mxj0Var.f148063a;
        int i2 = mxj0Var.f148065c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            mxj0Var.f148065c = 1;
            objM96567o = zn91.m96567o(this.f256052b, mxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60053f(f256048f);
        lv31VarEdit.m60053f(f256049g);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m89308d(ibk ibkVar) {
        nxj0 nxj0Var;
        if (ibkVar instanceof nxj0) {
            nxj0Var = (nxj0) ibkVar;
            int i = nxj0Var.f159507c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxj0Var.f159507c = i - Integer.MIN_VALUE;
            } else {
                nxj0Var = new nxj0(this, ibkVar);
            }
        } else {
            nxj0Var = new nxj0(this, ibkVar);
        }
        Object objM96567o = nxj0Var.f159505a;
        int i2 = nxj0Var.f159507c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            nxj0Var.f159507c = 1;
            objM96567o = zn91.m96567o(this.f256052b, nxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        String strMo48710e = ((hv31) objM96567o).mo48710e(f256050h, "");
        if (strMo48710e == null || strMo48710e.length() == 0) {
            return null;
        }
        return strMo48710e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m89309e(ibk ibkVar) {
        oxj0 oxj0Var;
        if (ibkVar instanceof oxj0) {
            oxj0Var = (oxj0) ibkVar;
            int i = oxj0Var.f171005c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxj0Var.f171005c = i - Integer.MIN_VALUE;
            } else {
                oxj0Var = new oxj0(this, ibkVar);
            }
        } else {
            oxj0Var = new oxj0(this, ibkVar);
        }
        Object objM96567o = oxj0Var.f171003a;
        int i2 = oxj0Var.f171005c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            oxj0Var.f171005c = 1;
            objM96567o = zn91.m96567o(this.f256052b, oxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return qyg1.m74180J(((hv31) objM96567o).mo48717l(this.f256054d, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m89310f(ibk ibkVar) {
        pxj0 pxj0Var;
        if (ibkVar instanceof pxj0) {
            pxj0Var = (pxj0) ibkVar;
            int i = pxj0Var.f182323c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pxj0Var.f182323c = i - Integer.MIN_VALUE;
            } else {
                pxj0Var = new pxj0(this, ibkVar);
            }
        } else {
            pxj0Var = new pxj0(this, ibkVar);
        }
        Object objM96567o = pxj0Var.f182321a;
        int i2 = pxj0Var.f182323c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            pxj0Var.f182323c = 1;
            objM96567o = zn91.m96567o(this.f256052b, pxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        String strMo48710e = ((hv31) objM96567o).mo48710e(f256049g, "");
        if (strMo48710e == null || strMo48710e.length() == 0) {
            return null;
        }
        return strMo48710e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m89311g(ibk ibkVar) {
        qxj0 qxj0Var;
        if (ibkVar instanceof qxj0) {
            qxj0Var = (qxj0) ibkVar;
            int i = qxj0Var.f193694c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qxj0Var.f193694c = i - Integer.MIN_VALUE;
            } else {
                qxj0Var = new qxj0(this, ibkVar);
            }
        } else {
            qxj0Var = new qxj0(this, ibkVar);
        }
        Object objM96567o = qxj0Var.f193692a;
        int i2 = qxj0Var.f193694c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            qxj0Var.f193694c = 1;
            objM96567o = zn91.m96567o(this.f256052b, qxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return qyg1.m74180J(((hv31) objM96567o).mo48717l(this.f256055e, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m89312h(ibk ibkVar) {
        rxj0 rxj0Var;
        if (ibkVar instanceof rxj0) {
            rxj0Var = (rxj0) ibkVar;
            int i = rxj0Var.f203617c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxj0Var.f203617c = i - Integer.MIN_VALUE;
            } else {
                rxj0Var = new rxj0(this, ibkVar);
            }
        } else {
            rxj0Var = new rxj0(this, ibkVar);
        }
        Object objM96567o = rxj0Var.f203615a;
        int i2 = rxj0Var.f203617c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            rxj0Var.f203617c = 1;
            objM96567o = zn91.m96567o(this.f256052b, rxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return qyg1.m74181K(((hv31) objM96567o).mo48712g(f256048f, 0L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m89313i(ibk ibkVar) {
        sxj0 sxj0Var;
        if (ibkVar instanceof sxj0) {
            sxj0Var = (sxj0) ibkVar;
            int i = sxj0Var.f214906c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxj0Var.f214906c = i - Integer.MIN_VALUE;
            } else {
                sxj0Var = new sxj0(this, ibkVar);
            }
        } else {
            sxj0Var = new sxj0(this, ibkVar);
        }
        Object objM96567o = sxj0Var.f214904a;
        int i2 = sxj0Var.f214906c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            sxj0Var.f214906c = 1;
            objM96567o = zn91.m96567o(this.f256052b, sxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        hv31 hv31Var = (hv31) objM96567o;
        fv31 fv31Var = this.f256054d;
        int iMo48717l = hv31Var.mo48717l(fv31Var, 0);
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60049b(fv31Var, iMo48717l + 1);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m89314j(ibk ibkVar) {
        txj0 txj0Var;
        if (ibkVar instanceof txj0) {
            txj0Var = (txj0) ibkVar;
            int i = txj0Var.f224717c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txj0Var.f224717c = i - Integer.MIN_VALUE;
            } else {
                txj0Var = new txj0(this, ibkVar);
            }
        } else {
            txj0Var = new txj0(this, ibkVar);
        }
        Object objM96567o = txj0Var.f224715a;
        int i2 = txj0Var.f224717c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            txj0Var.f224717c = 1;
            objM96567o = zn91.m96567o(this.f256052b, txj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        hv31 hv31Var = (hv31) objM96567o;
        fv31 fv31Var = this.f256055e;
        int iMo48717l = hv31Var.mo48717l(fv31Var, 0);
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60049b(fv31Var, iMo48717l + 1);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m89315k(String str, ibk ibkVar) {
        uxj0 uxj0Var;
        if (ibkVar instanceof uxj0) {
            uxj0Var = (uxj0) ibkVar;
            int i = uxj0Var.f234949d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxj0Var.f234949d = i - Integer.MIN_VALUE;
            } else {
                uxj0Var = new uxj0(this, ibkVar);
            }
        } else {
            uxj0Var = new uxj0(this, ibkVar);
        }
        Object objM96567o = uxj0Var.f234947b;
        int i2 = uxj0Var.f234949d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            uxj0Var.f234946a = str;
            uxj0Var.f234949d = 1;
            objM96567o = zn91.m96567o(this.f256052b, uxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = uxj0Var.f234946a;
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60051d(f256050h, str);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m89316l(String str, ibk ibkVar) {
        vxj0 vxj0Var;
        if (ibkVar instanceof vxj0) {
            vxj0Var = (vxj0) ibkVar;
            int i = vxj0Var.f245772d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vxj0Var.f245772d = i - Integer.MIN_VALUE;
            } else {
                vxj0Var = new vxj0(this, ibkVar);
            }
        } else {
            vxj0Var = new vxj0(this, ibkVar);
        }
        Object objM96567o = vxj0Var.f245770b;
        int i2 = vxj0Var.f245772d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            vxj0Var.f245769a = str;
            vxj0Var.f245772d = 1;
            objM96567o = zn91.m96567o(this.f256052b, vxj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = vxj0Var.f245769a;
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        ((wy3) this.f256051a).getClass();
        lv31VarEdit.m60050c(f256048f, System.currentTimeMillis());
        if (str == null) {
            str = "";
        }
        lv31VarEdit.m60051d(f256049g, str);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }
}
