package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class emo0 implements bmo0 {

    /* JADX INFO: renamed from: a */
    public final zmh f60951a;

    /* JADX INFO: renamed from: b */
    public final wek0 f60952b;

    /* JADX INFO: renamed from: c */
    public final ycc f60953c;

    /* JADX INFO: renamed from: d */
    public final da80 f60954d;

    /* JADX INFO: renamed from: e */
    public final u190 f60955e;

    public emo0(zmh zmhVar, wek0 wek0Var, ycc yccVar, da80 da80Var, u190 u190Var) {
        this.f60951a = zmhVar;
        this.f60952b = wek0Var;
        this.f60953c = yccVar;
        this.f60954d = da80Var;
        this.f60955e = u190Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    @Override // p204p.bmo0
    /* JADX INFO: renamed from: a */
    public final Object mo29884a(vlo0 vlo0Var, bso0 bso0Var, pv00 pv00Var, ctj ctjVar, d850 d850Var, r3g0 r3g0Var, boolean z, ibk ibkVar) throws Throwable {
        cmo0 cmo0Var;
        cmo0 cmo0Var2;
        d850 d850Var2;
        boolean z2;
        String str;
        r3g0 r3g0Var2;
        d850 d850Var3;
        String str2;
        xv00 xv00Var;
        xv00 xv00Var2;
        boolean z3;
        vlo0 vlo0Var2 = vlo0Var;
        bso0 bso0Var2 = bso0Var;
        boolean z4 = z;
        if (ibkVar instanceof cmo0) {
            cmo0Var = (cmo0) ibkVar;
            int i = cmo0Var.f39743i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cmo0Var.f39743i = i - Integer.MIN_VALUE;
            } else {
                cmo0Var = new cmo0(this, ibkVar);
            }
        } else {
            cmo0Var = new cmo0(this, ibkVar);
        }
        Object objM96463j = cmo0Var.f39741g;
        int i2 = cmo0Var.f39743i;
        wek0 wek0Var = this.f60952b;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96463j);
            if (!(ctjVar instanceof atj)) {
                if (!(pv00Var instanceof lv00)) {
                    cmo0Var2 = cmo0Var;
                    if (pv00Var instanceof mv00) {
                        if (vlo0Var2 instanceof tlo0) {
                            str = ((tlo0) vlo0Var2).f221497a;
                        } else {
                            if (vlo0Var2 instanceof ulo0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = ((ulo0) vlo0Var2).f231600b;
                        }
                        cmo0Var2.f39735a = vlo0Var2;
                        cmo0Var2.f39736b = bso0Var2;
                        cmo0Var2.f39737c = d850Var;
                        r3g0Var2 = r3g0Var;
                        cmo0Var2.f39738d = r3g0Var2;
                        cmo0Var2.f39740f = z4;
                        cmo0Var2.f39743i = 3;
                        objM96463j = this.f60951a.m96463j(str, (mv00) pv00Var, d850Var, cmo0Var2);
                        if (objM96463j != obj) {
                            d850Var3 = d850Var;
                            xv00Var = (xv00) objM96463j;
                            if (xv00Var instanceof wv00) {
                                cmo0Var2.f39735a = null;
                                cmo0Var2.f39736b = null;
                                cmo0Var2.f39737c = d850Var3;
                                cmo0Var2.f39738d = null;
                                cmo0Var2.f39739e = (wv00) xv00Var;
                                cmo0Var2.f39740f = z4;
                                cmo0Var2.f39743i = 4;
                                if (m39462c(vlo0Var2, bso0Var2, r3g0Var2, d850Var3, cmo0Var2) != obj) {
                                    xv00Var2 = xv00Var;
                                    z3 = z4;
                                    if (!((wv00) xv00Var2).f255309a) {
                                    }
                                    wek0.m87885d(wek0Var, d850Var3.f46380a);
                                    return w2a1Var;
                                }
                            }
                        }
                    } else {
                        cmo0Var2.f39735a = null;
                        cmo0Var2.f39736b = null;
                        cmo0Var2.f39737c = d850Var;
                        cmo0Var2.f39738d = null;
                        cmo0Var2.f39740f = z4;
                        cmo0Var2.f39743i = 5;
                        if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var2) != obj) {
                            d850Var2 = d850Var;
                            z2 = z4;
                            if (z2) {
                                wek0.m87885d(wek0Var, d850Var2.f46380a);
                            }
                        }
                    }
                    return obj;
                }
                if (vlo0Var2 instanceof tlo0) {
                    if (bso0Var2 == bso0.f30364c) {
                        cmo0Var2 = cmo0Var;
                        if (pv00Var instanceof mv00) {
                            if (vlo0Var2 instanceof tlo0) {
                                str = ((tlo0) vlo0Var2).f221497a;
                            } else {
                                if (vlo0Var2 instanceof ulo0) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = ((ulo0) vlo0Var2).f231600b;
                            }
                            cmo0Var2.f39735a = vlo0Var2;
                            cmo0Var2.f39736b = bso0Var2;
                            cmo0Var2.f39737c = d850Var;
                            r3g0Var2 = r3g0Var;
                            cmo0Var2.f39738d = r3g0Var2;
                            cmo0Var2.f39740f = z4;
                            cmo0Var2.f39743i = 3;
                            objM96463j = this.f60951a.m96463j(str, (mv00) pv00Var, d850Var, cmo0Var2);
                            if (objM96463j != obj) {
                                d850Var3 = d850Var;
                                xv00Var = (xv00) objM96463j;
                                if (xv00Var instanceof wv00) {
                                    cmo0Var2.f39735a = null;
                                    cmo0Var2.f39736b = null;
                                    cmo0Var2.f39737c = d850Var3;
                                    cmo0Var2.f39738d = null;
                                    cmo0Var2.f39739e = (wv00) xv00Var;
                                    cmo0Var2.f39740f = z4;
                                    cmo0Var2.f39743i = 4;
                                    if (m39462c(vlo0Var2, bso0Var2, r3g0Var2, d850Var3, cmo0Var2) != obj) {
                                        xv00Var2 = xv00Var;
                                        z3 = z4;
                                        if (!((wv00) xv00Var2).f255309a) {
                                        }
                                        wek0.m87885d(wek0Var, d850Var3.f46380a);
                                        return w2a1Var;
                                    }
                                }
                            }
                        } else {
                            cmo0Var2.f39735a = null;
                            cmo0Var2.f39736b = null;
                            cmo0Var2.f39737c = d850Var;
                            cmo0Var2.f39738d = null;
                            cmo0Var2.f39740f = z4;
                            cmo0Var2.f39743i = 5;
                            if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var2) != obj) {
                                d850Var2 = d850Var;
                                z2 = z4;
                                if (z2) {
                                    wek0.m87885d(wek0Var, d850Var2.f46380a);
                                }
                            }
                        }
                    } else {
                        cmo0Var.f39735a = null;
                        cmo0Var.f39736b = null;
                        cmo0Var.f39737c = null;
                        cmo0Var.f39738d = null;
                        cmo0Var.f39740f = z4;
                        cmo0Var.f39743i = 2;
                        if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var) == obj) {
                        }
                    }
                    return obj;
                }
                if (vlo0Var2 instanceof ulo0) {
                    throw new NoWhenBranchMatchedException();
                }
                if (bso0Var2 != bso0.f30362a) {
                    cmo0Var2 = cmo0Var;
                    if (pv00Var instanceof mv00) {
                        if (vlo0Var2 instanceof tlo0) {
                            str = ((tlo0) vlo0Var2).f221497a;
                        } else {
                            if (vlo0Var2 instanceof ulo0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = ((ulo0) vlo0Var2).f231600b;
                        }
                        cmo0Var2.f39735a = vlo0Var2;
                        cmo0Var2.f39736b = bso0Var2;
                        cmo0Var2.f39737c = d850Var;
                        r3g0Var2 = r3g0Var;
                        cmo0Var2.f39738d = r3g0Var2;
                        cmo0Var2.f39740f = z4;
                        cmo0Var2.f39743i = 3;
                        objM96463j = this.f60951a.m96463j(str, (mv00) pv00Var, d850Var, cmo0Var2);
                        if (objM96463j != obj) {
                            d850Var3 = d850Var;
                            xv00Var = (xv00) objM96463j;
                            if (xv00Var instanceof wv00) {
                                cmo0Var2.f39735a = null;
                                cmo0Var2.f39736b = null;
                                cmo0Var2.f39737c = d850Var3;
                                cmo0Var2.f39738d = null;
                                cmo0Var2.f39739e = (wv00) xv00Var;
                                cmo0Var2.f39740f = z4;
                                cmo0Var2.f39743i = 4;
                                if (m39462c(vlo0Var2, bso0Var2, r3g0Var2, d850Var3, cmo0Var2) != obj) {
                                    xv00Var2 = xv00Var;
                                    z3 = z4;
                                    if (!((wv00) xv00Var2).f255309a) {
                                    }
                                    wek0.m87885d(wek0Var, d850Var3.f46380a);
                                    return w2a1Var;
                                }
                            }
                        }
                    } else {
                        cmo0Var2.f39735a = null;
                        cmo0Var2.f39736b = null;
                        cmo0Var2.f39737c = d850Var;
                        cmo0Var2.f39738d = null;
                        cmo0Var2.f39740f = z4;
                        cmo0Var2.f39743i = 5;
                        if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var2) != obj) {
                            d850Var2 = d850Var;
                            z2 = z4;
                            if (z2) {
                                wek0.m87885d(wek0Var, d850Var2.f46380a);
                            }
                        }
                    }
                } else {
                    cmo0Var.f39735a = null;
                    cmo0Var.f39736b = null;
                    cmo0Var.f39737c = null;
                    cmo0Var.f39738d = null;
                    cmo0Var.f39740f = z4;
                    cmo0Var.f39743i = 2;
                    if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var) == obj) {
                    }
                }
                return obj;
            }
            atj atjVar = (atj) ctjVar;
            if (!atjVar.f19699b) {
                if (vlo0Var2 instanceof tlo0) {
                    str2 = ((tlo0) vlo0Var2).f221497a;
                } else {
                    if (!(vlo0Var2 instanceof ulo0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = ((ulo0) vlo0Var2).f231600b;
                }
                ysj ysjVar = atjVar.f19698a;
                cmo0Var.f39735a = null;
                cmo0Var.f39736b = null;
                cmo0Var.f39737c = null;
                cmo0Var.f39738d = null;
                cmo0Var.f39740f = z4;
                cmo0Var.f39743i = 1;
                if (this.f60953c.m93346i(str2, ysjVar, d850Var, cmo0Var) == obj) {
                    return obj;
                }
            }
            if (!(pv00Var instanceof lv00)) {
                cmo0Var2 = cmo0Var;
                if (pv00Var instanceof mv00) {
                    if (vlo0Var2 instanceof tlo0) {
                        str = ((tlo0) vlo0Var2).f221497a;
                    } else {
                        if (vlo0Var2 instanceof ulo0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((ulo0) vlo0Var2).f231600b;
                    }
                    cmo0Var2.f39735a = vlo0Var2;
                    cmo0Var2.f39736b = bso0Var2;
                    cmo0Var2.f39737c = d850Var;
                    r3g0Var2 = r3g0Var;
                    cmo0Var2.f39738d = r3g0Var2;
                    cmo0Var2.f39740f = z4;
                    cmo0Var2.f39743i = 3;
                    objM96463j = this.f60951a.m96463j(str, (mv00) pv00Var, d850Var, cmo0Var2);
                    if (objM96463j != obj) {
                        d850Var3 = d850Var;
                        xv00Var = (xv00) objM96463j;
                        if (xv00Var instanceof wv00) {
                            cmo0Var2.f39735a = null;
                            cmo0Var2.f39736b = null;
                            cmo0Var2.f39737c = d850Var3;
                            cmo0Var2.f39738d = null;
                            cmo0Var2.f39739e = (wv00) xv00Var;
                            cmo0Var2.f39740f = z4;
                            cmo0Var2.f39743i = 4;
                            if (m39462c(vlo0Var2, bso0Var2, r3g0Var2, d850Var3, cmo0Var2) != obj) {
                                xv00Var2 = xv00Var;
                                z3 = z4;
                                if (!((wv00) xv00Var2).f255309a) {
                                }
                                wek0.m87885d(wek0Var, d850Var3.f46380a);
                                return w2a1Var;
                            }
                        }
                    }
                } else {
                    cmo0Var2.f39735a = null;
                    cmo0Var2.f39736b = null;
                    cmo0Var2.f39737c = d850Var;
                    cmo0Var2.f39738d = null;
                    cmo0Var2.f39740f = z4;
                    cmo0Var2.f39743i = 5;
                    if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var2) != obj) {
                        d850Var2 = d850Var;
                        z2 = z4;
                        if (z2) {
                            wek0.m87885d(wek0Var, d850Var2.f46380a);
                        }
                    }
                }
                return obj;
            }
            if (vlo0Var2 instanceof tlo0) {
                if (bso0Var2 == bso0.f30364c) {
                    cmo0Var2 = cmo0Var;
                    if (pv00Var instanceof mv00) {
                        if (vlo0Var2 instanceof tlo0) {
                            str = ((tlo0) vlo0Var2).f221497a;
                        } else {
                            if (vlo0Var2 instanceof ulo0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = ((ulo0) vlo0Var2).f231600b;
                        }
                        cmo0Var2.f39735a = vlo0Var2;
                        cmo0Var2.f39736b = bso0Var2;
                        cmo0Var2.f39737c = d850Var;
                        r3g0Var2 = r3g0Var;
                        cmo0Var2.f39738d = r3g0Var2;
                        cmo0Var2.f39740f = z4;
                        cmo0Var2.f39743i = 3;
                        objM96463j = this.f60951a.m96463j(str, (mv00) pv00Var, d850Var, cmo0Var2);
                        if (objM96463j != obj) {
                            d850Var3 = d850Var;
                            xv00Var = (xv00) objM96463j;
                            if (xv00Var instanceof wv00) {
                                cmo0Var2.f39735a = null;
                                cmo0Var2.f39736b = null;
                                cmo0Var2.f39737c = d850Var3;
                                cmo0Var2.f39738d = null;
                                cmo0Var2.f39739e = (wv00) xv00Var;
                                cmo0Var2.f39740f = z4;
                                cmo0Var2.f39743i = 4;
                                if (m39462c(vlo0Var2, bso0Var2, r3g0Var2, d850Var3, cmo0Var2) != obj) {
                                    xv00Var2 = xv00Var;
                                    z3 = z4;
                                    if (!((wv00) xv00Var2).f255309a) {
                                    }
                                    wek0.m87885d(wek0Var, d850Var3.f46380a);
                                    return w2a1Var;
                                }
                            }
                        }
                    } else {
                        cmo0Var2.f39735a = null;
                        cmo0Var2.f39736b = null;
                        cmo0Var2.f39737c = d850Var;
                        cmo0Var2.f39738d = null;
                        cmo0Var2.f39740f = z4;
                        cmo0Var2.f39743i = 5;
                        if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var2) != obj) {
                            d850Var2 = d850Var;
                            z2 = z4;
                            if (z2) {
                                wek0.m87885d(wek0Var, d850Var2.f46380a);
                            }
                        }
                    }
                } else {
                    cmo0Var.f39735a = null;
                    cmo0Var.f39736b = null;
                    cmo0Var.f39737c = null;
                    cmo0Var.f39738d = null;
                    cmo0Var.f39740f = z4;
                    cmo0Var.f39743i = 2;
                    if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var) == obj) {
                    }
                }
                return obj;
            }
            if (vlo0Var2 instanceof ulo0) {
                throw new NoWhenBranchMatchedException();
            }
            if (bso0Var2 != bso0.f30362a) {
                cmo0Var2 = cmo0Var;
                if (pv00Var instanceof mv00) {
                    if (vlo0Var2 instanceof tlo0) {
                        str = ((tlo0) vlo0Var2).f221497a;
                    } else {
                        if (vlo0Var2 instanceof ulo0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((ulo0) vlo0Var2).f231600b;
                    }
                    cmo0Var2.f39735a = vlo0Var2;
                    cmo0Var2.f39736b = bso0Var2;
                    cmo0Var2.f39737c = d850Var;
                    r3g0Var2 = r3g0Var;
                    cmo0Var2.f39738d = r3g0Var2;
                    cmo0Var2.f39740f = z4;
                    cmo0Var2.f39743i = 3;
                    objM96463j = this.f60951a.m96463j(str, (mv00) pv00Var, d850Var, cmo0Var2);
                    if (objM96463j != obj) {
                        d850Var3 = d850Var;
                        xv00Var = (xv00) objM96463j;
                        if (xv00Var instanceof wv00) {
                            cmo0Var2.f39735a = null;
                            cmo0Var2.f39736b = null;
                            cmo0Var2.f39737c = d850Var3;
                            cmo0Var2.f39738d = null;
                            cmo0Var2.f39739e = (wv00) xv00Var;
                            cmo0Var2.f39740f = z4;
                            cmo0Var2.f39743i = 4;
                            if (m39462c(vlo0Var2, bso0Var2, r3g0Var2, d850Var3, cmo0Var2) != obj) {
                                xv00Var2 = xv00Var;
                                z3 = z4;
                                if (!((wv00) xv00Var2).f255309a) {
                                }
                                wek0.m87885d(wek0Var, d850Var3.f46380a);
                                return w2a1Var;
                            }
                        }
                    }
                } else {
                    cmo0Var2.f39735a = null;
                    cmo0Var2.f39736b = null;
                    cmo0Var2.f39737c = d850Var;
                    cmo0Var2.f39738d = null;
                    cmo0Var2.f39740f = z4;
                    cmo0Var2.f39743i = 5;
                    if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var2) != obj) {
                        d850Var2 = d850Var;
                        z2 = z4;
                        if (z2) {
                            wek0.m87885d(wek0Var, d850Var2.f46380a);
                        }
                    }
                }
            } else {
                cmo0Var.f39735a = null;
                cmo0Var.f39736b = null;
                cmo0Var.f39737c = null;
                cmo0Var.f39738d = null;
                cmo0Var.f39740f = z4;
                cmo0Var.f39743i = 2;
                if (m39462c(vlo0Var2, bso0Var2, r3g0Var, d850Var, cmo0Var) == obj) {
                }
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM96463j);
            return w2a1Var;
        }
        if (i2 == 2) {
            bga.m29073P(objM96463j);
            return w2a1Var;
        }
        if (i2 == 3) {
            boolean z5 = cmo0Var.f39740f;
            r3g0 r3g0Var3 = cmo0Var.f39738d;
            d850Var3 = cmo0Var.f39737c;
            bso0 bso0Var3 = cmo0Var.f39736b;
            vlo0 vlo0Var3 = cmo0Var.f39735a;
            bga.m29073P(objM96463j);
            z4 = z5;
            vlo0Var2 = vlo0Var3;
            cmo0Var2 = cmo0Var;
            r3g0Var2 = r3g0Var3;
            bso0Var2 = bso0Var3;
            xv00Var = (xv00) objM96463j;
            if (xv00Var instanceof wv00) {
                cmo0Var2.f39735a = null;
                cmo0Var2.f39736b = null;
                cmo0Var2.f39737c = d850Var3;
                cmo0Var2.f39738d = null;
                cmo0Var2.f39739e = (wv00) xv00Var;
                cmo0Var2.f39740f = z4;
                cmo0Var2.f39743i = 4;
                if (m39462c(vlo0Var2, bso0Var2, r3g0Var2, d850Var3, cmo0Var2) != obj) {
                    xv00Var2 = xv00Var;
                    z3 = z4;
                }
                return obj;
            }
        } else if (i2 == 4) {
            z3 = cmo0Var.f39740f;
            xv00Var2 = cmo0Var.f39739e;
            d850Var3 = cmo0Var.f39737c;
            bga.m29073P(objM96463j);
        } else {
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = cmo0Var.f39740f;
            d850Var2 = cmo0Var.f39737c;
            bga.m29073P(objM96463j);
            if (z2) {
                wek0.m87885d(wek0Var, d850Var2.f46380a);
            }
        }
        if (!((wv00) xv00Var2).f255309a || z3) {
            wek0.m87885d(wek0Var, d850Var3.f46380a);
            return w2a1Var;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX INFO: renamed from: c */
    public final Object m39462c(vlo0 vlo0Var, bso0 bso0Var, r3g0 r3g0Var, d850 d850Var, ibk ibkVar) {
        dmo0 dmo0Var;
        bso0 bso0Var2;
        d850 d850Var2;
        vlo0 vlo0Var2;
        r3g0 r3g0Var2;
        ?? BooleanValue;
        i190 i190Var;
        int iOrdinal;
        Object objM82200f;
        d850 d850Var3;
        ?? r1;
        r3g0 r3g0Var3;
        String str;
        String str2;
        boolean z;
        int i;
        if (ibkVar instanceof dmo0) {
            dmo0Var = (dmo0) ibkVar;
            int i2 = dmo0Var.f50587h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dmo0Var.f50587h = i2 - Integer.MIN_VALUE;
            } else {
                dmo0Var = new dmo0(this, ibkVar);
            }
        } else {
            dmo0Var = new dmo0(this, ibkVar);
        }
        dmo0 dmo0Var2 = dmo0Var;
        Object objM86757v = dmo0Var2.f50585f;
        int i3 = dmo0Var2.f50587h;
        u190 u190Var = this.f60955e;
        bso0 bso0Var3 = bso0.f30364c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                d850Var2 = dmo0Var2.f50583d;
                r3g0Var2 = dmo0Var2.f50582c;
                bso0Var2 = dmo0Var2.f50581b;
                vlo0Var2 = dmo0Var2.f50580a;
                bga.m29073P(objM86757v);
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM86757v);
                    return w2a1Var;
                }
                i = dmo0Var2.f50584e;
                d850 d850Var4 = dmo0Var2.f50583d;
                r3g0 r3g0Var4 = dmo0Var2.f50582c;
                bso0 bso0Var4 = dmo0Var2.f50581b;
                vlo0 vlo0Var3 = dmo0Var2.f50580a;
                bga.m29073P(objM86757v);
                r3g0Var3 = r3g0Var4;
                vlo0Var2 = vlo0Var3;
                bso0Var2 = bso0Var4;
                d850Var3 = d850Var4;
            }
            if (bso0Var2 == bso0Var3) {
                if (vlo0Var2 instanceof tlo0) {
                    r1 = i;
                    str = ((tlo0) vlo0Var2).f221497a;
                } else {
                    if (!(vlo0Var2 instanceof ulo0)) {
                        r1 = i;
                        throw new NoWhenBranchMatchedException();
                    }
                    r1 = i;
                    str = ((ulo0) vlo0Var2).f231599a;
                }
                str2 = str;
                z = r1 != 0;
                dmo0Var2.f50580a = null;
                dmo0Var2.f50581b = null;
                dmo0Var2.f50582c = null;
                dmo0Var2.f50583d = null;
                dmo0Var2.f50584e = r1;
                dmo0Var2.f50587h = 3;
                if (this.f60954d.m35427y(str2, z, r3g0Var3, d850Var3, dmo0Var2) == yukVar) {
                    return yukVar;
                }
            }
            r1 = i;
            return w2a1Var;
        }
        bga.m29073P(objM86757v);
        if (bso0Var == bso0Var3) {
            ou8 ou8Var = u190Var.f225727h;
            dmo0Var2.f50580a = vlo0Var;
            dmo0Var2.f50581b = bso0Var;
            dmo0Var2.f50582c = r3g0Var;
            dmo0Var2.f50583d = d850Var;
            dmo0Var2.f50587h = 1;
            objM86757v = vyf1.m86757v(ou8Var, dmo0Var2);
            if (objM86757v != yukVar) {
                bso0Var2 = bso0Var;
                d850Var2 = d850Var;
                vlo0Var2 = vlo0Var;
                r3g0Var2 = r3g0Var;
            }
        } else {
            bso0Var2 = bso0Var;
            d850Var2 = d850Var;
            vlo0Var2 = vlo0Var;
            r3g0Var2 = r3g0Var;
            dmo0Var2.f50580a = vlo0Var2;
            dmo0Var2.f50581b = bso0Var2;
            dmo0Var2.f50582c = r3g0Var2;
            dmo0Var2.f50583d = d850Var2;
            dmo0Var2.f50584e = BooleanValue;
            dmo0Var2.f50587h = 2;
            if (vlo0Var2 instanceof tlo0) {
                objM82200f = u190Var.m82200f(d850Var2, dmo0Var2);
                if (objM82200f != yukVar) {
                    objM82200f = w2a1Var;
                }
            } else {
                if (vlo0Var2 instanceof ulo0) {
                    throw new NoWhenBranchMatchedException();
                }
                i190Var = new i190(((ulo0) vlo0Var2).f231601c);
                iOrdinal = bso0Var2.ordinal();
                if (iOrdinal != 0) {
                    objM82200f = u190Var.m82200f(d850Var2, dmo0Var2);
                    if (objM82200f != yukVar) {
                        objM82200f = w2a1Var;
                    }
                } else if (iOrdinal != 1) {
                    objM82200f = u190Var.m82200f(d850Var2, dmo0Var2);
                    if (objM82200f != yukVar) {
                        objM82200f = w2a1Var;
                    }
                } else {
                    if (iOrdinal == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objM82200f = u190Var.m82198d(i190Var, d850Var2, dmo0Var2);
                    if (objM82200f != yukVar) {
                        objM82200f = w2a1Var;
                    }
                }
                if (objM82200f != yukVar) {
                    objM82200f = w2a1Var;
                }
            }
            if (objM82200f != yukVar) {
                d850Var3 = d850Var2;
                r1 = BooleanValue;
                r3g0Var3 = r3g0Var2;
                if (bso0Var2 == bso0Var3) {
                    if (vlo0Var2 instanceof tlo0) {
                        r1 = i;
                        str = ((tlo0) vlo0Var2).f221497a;
                    } else {
                        if (!(vlo0Var2 instanceof ulo0)) {
                            r1 = i;
                            throw new NoWhenBranchMatchedException();
                        }
                        r1 = i;
                        str = ((ulo0) vlo0Var2).f231599a;
                    }
                    str2 = str;
                    if (r1 != 0) {
                    }
                    dmo0Var2.f50580a = null;
                    dmo0Var2.f50581b = null;
                    dmo0Var2.f50582c = null;
                    dmo0Var2.f50583d = null;
                    dmo0Var2.f50584e = r1;
                    dmo0Var2.f50587h = 3;
                    if (this.f60954d.m35427y(str2, z, r3g0Var3, d850Var3, dmo0Var2) == yukVar) {
                    }
                }
                r1 = i;
                return w2a1Var;
            }
        }
        return yukVar;
        Boolean bool = (Boolean) objM86757v;
        BooleanValue = bool != null ? bool.booleanValue() : 0;
        dmo0Var2.f50580a = vlo0Var2;
        dmo0Var2.f50581b = bso0Var2;
        dmo0Var2.f50582c = r3g0Var2;
        dmo0Var2.f50583d = d850Var2;
        dmo0Var2.f50584e = BooleanValue;
        dmo0Var2.f50587h = 2;
        if (vlo0Var2 instanceof tlo0) {
            objM82200f = u190Var.m82200f(d850Var2, dmo0Var2);
            if (objM82200f != yukVar) {
                objM82200f = w2a1Var;
            }
        } else {
            if (vlo0Var2 instanceof ulo0) {
                throw new NoWhenBranchMatchedException();
            }
            i190Var = new i190(((ulo0) vlo0Var2).f231601c);
            iOrdinal = bso0Var2.ordinal();
            if (iOrdinal != 0) {
                objM82200f = u190Var.m82200f(d850Var2, dmo0Var2);
                if (objM82200f != yukVar) {
                    objM82200f = w2a1Var;
                }
            } else if (iOrdinal != 1) {
                objM82200f = u190Var.m82200f(d850Var2, dmo0Var2);
                if (objM82200f != yukVar) {
                    objM82200f = w2a1Var;
                }
            } else {
                if (iOrdinal == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                objM82200f = u190Var.m82198d(i190Var, d850Var2, dmo0Var2);
                if (objM82200f != yukVar) {
                    objM82200f = w2a1Var;
                }
            }
            if (objM82200f != yukVar) {
                objM82200f = w2a1Var;
            }
        }
        if (objM82200f != yukVar) {
            d850Var3 = d850Var2;
            r1 = BooleanValue;
            r3g0Var3 = r3g0Var2;
            if (bso0Var2 == bso0Var3) {
                if (vlo0Var2 instanceof tlo0) {
                    r1 = i;
                    str = ((tlo0) vlo0Var2).f221497a;
                } else {
                    if (!(vlo0Var2 instanceof ulo0)) {
                        r1 = i;
                        throw new NoWhenBranchMatchedException();
                    }
                    r1 = i;
                    str = ((ulo0) vlo0Var2).f231599a;
                }
                str2 = str;
                if (r1 != 0) {
                }
                dmo0Var2.f50580a = null;
                dmo0Var2.f50581b = null;
                dmo0Var2.f50582c = null;
                dmo0Var2.f50583d = null;
                dmo0Var2.f50584e = r1;
                dmo0Var2.f50587h = 3;
                if (this.f60954d.m35427y(str2, z, r3g0Var3, d850Var3, dmo0Var2) == yukVar) {
                }
            }
            r1 = i;
            return w2a1Var;
        }
        return yukVar;
    }
}
