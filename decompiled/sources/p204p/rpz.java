package p204p;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rpz implements ppz {

    /* JADX INFO: renamed from: a */
    public final oz3 f201662a;

    /* JADX INFO: renamed from: b */
    public final oz3 f201663b;

    /* JADX INFO: renamed from: d */
    public final kpz f201665d;

    /* JADX INFO: renamed from: f */
    public api0 f201667f;

    /* JADX INFO: renamed from: h */
    public pqz f201669h;

    /* JADX INFO: renamed from: c */
    public final pqz f201664c = new pqz(2, 14, null);

    /* JADX INFO: renamed from: e */
    public final qpz f201666e = new qpz(this);

    /* JADX INFO: renamed from: g */
    public final jpi0 f201668g = new jpi0(1);

    public rpz(oz3 oz3Var, oz3 oz3Var2) {
        this.f201662a = oz3Var;
        this.f201663b = oz3Var2;
        this.f201665d = new kpz(this, oz3Var2);
    }

    /* JADX INFO: renamed from: b */
    public final void m76196b(boolean z) {
        m76198d(8, z, true);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m76197c(boolean z) {
        xmj0 xmj0Var;
        if (m76202h() != null) {
            pqz pqzVarM76202h = m76202h();
            m76205k(null);
            if (pqzVarM76202h != null) {
                kqz kqzVar = kqz.f125474a;
                kqz kqzVar2 = kqz.f125476c;
                pqzVarM76202h.m70692I1(kqzVar, kqzVar2);
                if (!pqzVarM76202h.f63770a.f63766L0) {
                    mt40.m62791c("visitAncestors called on an unattached node");
                }
                exh0 exh0Var = pqzVarM76202h.f63770a.f63774e;
                lp70 lp70VarM88319I = wjg1.m88319I(pqzVarM76202h);
                while (lp70VarM88319I != null) {
                    if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 1024) != 0) {
                        while (exh0Var != null) {
                            if ((exh0Var.f63772c & 1024) != 0) {
                                qqi0 qqi0Var = null;
                                exh0 exh0VarM88331j = exh0Var;
                                while (exh0VarM88331j != null) {
                                    if (exh0VarM88331j instanceof pqz) {
                                        ((pqz) exh0VarM88331j).m70692I1(kqz.f125475b, kqzVar2);
                                    } else if ((exh0VarM88331j.f63772c & 1024) != 0 && (exh0VarM88331j instanceof xlq)) {
                                        int i = 0;
                                        for (exh0 exh0Var2 = ((xlq) exh0VarM88331j).f263224N0; exh0Var2 != null; exh0Var2 = exh0Var2.f63775f) {
                                            if ((exh0Var2.f63772c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    exh0VarM88331j = exh0Var2;
                                                } else {
                                                    if (qqi0Var == null) {
                                                        qqi0Var = new qqi0(0, new exh0[16]);
                                                    }
                                                    if (exh0VarM88331j != null) {
                                                        qqi0Var.m73556b(exh0VarM88331j);
                                                        exh0VarM88331j = null;
                                                    }
                                                    qqi0Var.m73556b(exh0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    exh0VarM88331j = wjg1.m88331j(qqi0Var);
                                }
                            }
                            exh0Var = exh0Var.f63774e;
                        }
                    }
                    lp70VarM88319I = lp70VarM88319I.m59645v();
                    exh0Var = (lp70VarM88319I == null || (xmj0Var = lp70VarM88319I.f135674c1) == null) ? null : xmj0Var.f263387e;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m76198d(int i, boolean z, boolean z2) {
        int iM38547C;
        boolean z3 = true;
        if (z || (iM38547C = edb.m38547C(fag1.m41168q(i, this.f201664c))) == 0) {
            m76197c(z);
        } else {
            if (iM38547C != 1 && iM38547C != 2 && iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        }
        if (z3 && z2) {
            m76199e();
        }
        return z3;
    }

    /* JADX INFO: renamed from: e */
    public final void m76199e() {
        oz3 oz3Var = this.f201662a;
        if (oz3Var.isFocused() || oz3Var.hasFocus()) {
            oz3Var.clearFocus();
        } else if (oz3Var.hasFocus()) {
            View viewFindFocus = oz3Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            oz3Var.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130 A[ADDED_TO_REGION, LOOP:16: B:101:0x0130->B:129:0x017c, LOOP_START, PHI: r1
      0x0130: PHI (r1v18 p.exh0) = (r1v13 p.exh0), (r1v19 p.exh0) binds: [B:100:0x012e, B:129:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0132 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0141 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0147 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0185 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0193 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0198  */
    /* JADX WARN: Code duplicated, block: B:331:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x018c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0177 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa A[ADDED_TO_REGION, LOOP:12: B:55:0x00aa->B:83:0x00f6, LOOP_START, PHI: r7
      0x00aa: PHI (r7v27 p.exh0) = (r7v22 p.exh0), (r7v28 p.exh0) binds: [B:54:0x00a8, B:83:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x010d A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0113 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0119 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0126 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:161:0x01d8, B:163:0x01de, B:165:0x01e2, B:167:0x01ea, B:169:0x01f0, B:173:0x01f8, B:175:0x0201, B:176:0x0205, B:177:0x0208, B:180:0x020e, B:181:0x0213, B:182:0x0216, B:184:0x021c, B:186:0x0220, B:189:0x0227, B:191:0x022f, B:198:0x0246, B:200:0x024b, B:202:0x024f, B:225:0x0291, B:206:0x025b, B:208:0x0261, B:210:0x0265, B:212:0x026d, B:214:0x0273, B:218:0x027b, B:220:0x0284, B:221:0x0288, B:222:0x028b, B:226:0x0296, B:230:0x02a6, B:232:0x02ab, B:234:0x02af, B:257:0x02f1, B:238:0x02bb, B:240:0x02c1, B:242:0x02c5, B:244:0x02cd, B:246:0x02d3, B:250:0x02db, B:252:0x02e4, B:253:0x02e8, B:254:0x02eb, B:259:0x02f8, B:261:0x02ff, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:270:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r0v24, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r15v5, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r15v9, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v39, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX INFO: renamed from: f */
    public final boolean m76200f(KeyEvent keyEvent, eh00 eh00Var) {
        exh0 exh0Var;
        lp70 lp70VarM88319I;
        jlq jlqVar;
        jlq jlqVar2;
        exh0 exh0Var2;
        xmj0 xmj0Var;
        exh0 exh0VarM88331j;
        qqi0 qqi0Var;
        exh0 exh0Var3;
        lp70 lp70VarM88319I2;
        jlq jlqVar3;
        jlq jlqVar4;
        xmj0 xmj0Var2;
        qqi0 qqi0Var2;
        exh0 exh0VarM88331j2;
        int size;
        xmj0 xmj0Var3;
        boolean z;
        pqz pqzVar = this.f201664c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f201665d.f125169e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            long jM39797o = erg1.m39797o(keyEvent);
            int iM39801t = erg1.m39801t(keyEvent);
            if (drg1.m36727o(iM39801t, 2)) {
                api0 api0Var = this.f201667f;
                if (api0Var == null) {
                    api0Var = new api0(3);
                    this.f201667f = api0Var;
                }
                api0Var.m26714d(jM39797o);
            } else if (drg1.m36727o(iM39801t, 1)) {
                api0 api0Var2 = this.f201667f;
                if (api0Var2 == null || !api0Var2.m26711a(jM39797o)) {
                    Trace.endSection();
                    return false;
                }
                api0 api0Var3 = this.f201667f;
                if (api0Var3 != null) {
                    api0Var3.m26715e(jM39797o);
                }
            }
            pqz pqzVarM70532m = pp91.m70532m(pqzVar);
            if (pqzVarM70532m != null) {
                if (!pqzVarM70532m.f63770a.f63766L0) {
                    mt40.m62791c("visitLocalDescendants called on an unattached node");
                }
                exh0 exh0Var4 = pqzVarM70532m.f63770a;
                if ((exh0Var4.f63773d & 9216) != 0) {
                    exh0Var2 = null;
                    for (exh0 exh0Var5 = exh0Var4.f63775f; exh0Var5 != null; exh0Var5 = exh0Var5.f63775f) {
                        int i = exh0Var5.f63772c;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            exh0Var2 = exh0Var5;
                        }
                    }
                } else {
                    exh0Var2 = null;
                }
                if (exh0Var2 == null) {
                    if (pqzVarM70532m == null) {
                        if (!pqzVar.f63770a.f63766L0) {
                            mt40.m62791c("visitAncestors called on an unattached node");
                        }
                        exh0Var = pqzVar.f63770a.f63774e;
                        lp70VarM88319I = wjg1.m88319I(pqzVar);
                        loop15: while (true) {
                            if (lp70VarM88319I != null) {
                                jlqVar = null;
                                break;
                            }
                            if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 8192) != 0) {
                                while (exh0Var != null) {
                                    if ((exh0Var.f63772c & 8192) != 0) {
                                        exh0VarM88331j = exh0Var;
                                        qqi0Var = null;
                                        while (exh0VarM88331j != null) {
                                            if (exh0VarM88331j instanceof ju60) {
                                                jlqVar = exh0VarM88331j;
                                                break loop15;
                                            }
                                            if ((exh0VarM88331j.f63772c & 8192) == 0) {
                                            }
                                            exh0VarM88331j = wjg1.m88331j(qqi0Var);
                                        }
                                    }
                                    exh0Var = exh0Var.f63774e;
                                }
                            }
                            lp70VarM88319I = lp70VarM88319I.m59645v();
                            if (lp70VarM88319I != null) {
                            }
                        }
                        jlqVar2 = (ju60) jlqVar;
                        if (jlqVar2 != null) {
                            exh0Var2 = ((exh0) jlqVar2).f63770a;
                        } else {
                            exh0Var2 = null;
                        }
                    } else {
                        if (!pqzVarM70532m.f63770a.f63766L0) {
                            mt40.m62791c("visitAncestors called on an unattached node");
                        }
                        exh0Var3 = pqzVarM70532m.f63770a;
                        lp70VarM88319I2 = wjg1.m88319I(pqzVarM70532m);
                        loop11: while (true) {
                            if (lp70VarM88319I2 != null) {
                                jlqVar3 = null;
                                break;
                            }
                            if ((lp70VarM88319I2.f135674c1.f263388f.f63773d & 8192) != 0) {
                                while (exh0Var3 != null) {
                                    if ((exh0Var3.f63772c & 8192) != 0) {
                                        qqi0Var2 = null;
                                        exh0VarM88331j2 = exh0Var3;
                                        while (exh0VarM88331j2 != null) {
                                            if (exh0VarM88331j2 instanceof ju60) {
                                                jlqVar3 = exh0VarM88331j2;
                                                break loop11;
                                            }
                                            if ((exh0VarM88331j2.f63772c & 8192) == 0) {
                                            }
                                            exh0VarM88331j2 = wjg1.m88331j(qqi0Var2);
                                        }
                                    }
                                    exh0Var3 = exh0Var3.f63774e;
                                }
                            }
                            lp70VarM88319I2 = lp70VarM88319I2.m59645v();
                            if (lp70VarM88319I2 != null) {
                            }
                        }
                        jlqVar4 = (ju60) jlqVar3;
                        if (jlqVar4 != null) {
                            exh0Var2 = ((exh0) jlqVar4).f63770a;
                        } else {
                            if (!pqzVar.f63770a.f63766L0) {
                                mt40.m62791c("visitAncestors called on an unattached node");
                            }
                            exh0Var = pqzVar.f63770a.f63774e;
                            lp70VarM88319I = wjg1.m88319I(pqzVar);
                            loop15: while (true) {
                                if (lp70VarM88319I != null) {
                                    jlqVar = null;
                                    break;
                                }
                                if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 8192) != 0) {
                                    while (exh0Var != null) {
                                        if ((exh0Var.f63772c & 8192) != 0) {
                                            exh0VarM88331j = exh0Var;
                                            qqi0Var = null;
                                            while (exh0VarM88331j != null) {
                                                if (exh0VarM88331j instanceof ju60) {
                                                    jlqVar = exh0VarM88331j;
                                                    break loop15;
                                                }
                                                if ((exh0VarM88331j.f63772c & 8192) == 0) {
                                                }
                                                exh0VarM88331j = wjg1.m88331j(qqi0Var);
                                            }
                                        }
                                        exh0Var = exh0Var.f63774e;
                                    }
                                }
                                lp70VarM88319I = lp70VarM88319I.m59645v();
                                if (lp70VarM88319I != null) {
                                }
                            }
                            jlqVar2 = (ju60) jlqVar;
                            if (jlqVar2 != null) {
                                exh0Var2 = ((exh0) jlqVar2).f63770a;
                            } else {
                                exh0Var2 = null;
                            }
                        }
                    }
                }
            } else if (pqzVarM70532m == null) {
                if (!pqzVar.f63770a.f63766L0) {
                    mt40.m62791c("visitAncestors called on an unattached node");
                }
                exh0Var = pqzVar.f63770a.f63774e;
                lp70VarM88319I = wjg1.m88319I(pqzVar);
                loop15: while (true) {
                    if (lp70VarM88319I != null) {
                        jlqVar = null;
                        break;
                    }
                    if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 8192) != 0) {
                        while (exh0Var != null) {
                            if ((exh0Var.f63772c & 8192) != 0) {
                                exh0VarM88331j = exh0Var;
                                qqi0Var = null;
                                while (exh0VarM88331j != null) {
                                    if (exh0VarM88331j instanceof ju60) {
                                        jlqVar = exh0VarM88331j;
                                        break loop15;
                                    }
                                    if ((exh0VarM88331j.f63772c & 8192) == 0 && (exh0VarM88331j instanceof xlq)) {
                                        exh0 exh0Var6 = ((xlq) exh0VarM88331j).f263224N0;
                                        int i2 = 0;
                                        while (exh0Var6 != null) {
                                            if ((exh0Var6.f63772c & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    exh0VarM88331j = exh0VarM88331j;
                                                    qqi0Var = qqi0Var;
                                                    qqi0Var = qqi0Var;
                                                    exh0VarM88331j = exh0Var6;
                                                } else {
                                                    if (qqi0Var == null) {
                                                        qqi0Var = new qqi0(0, new exh0[16]);
                                                    }
                                                    if (exh0VarM88331j != null) {
                                                        qqi0Var.m73556b(exh0VarM88331j);
                                                        exh0VarM88331j = null;
                                                    }
                                                    qqi0Var.m73556b(exh0Var6);
                                                }
                                            } else {
                                                exh0VarM88331j = exh0VarM88331j;
                                                qqi0Var = qqi0Var;
                                            }
                                            exh0Var6 = exh0Var6.f63775f;
                                            exh0VarM88331j = exh0VarM88331j;
                                            qqi0Var = qqi0Var;
                                        }
                                        if (i2 == 1) {
                                            exh0VarM88331j = exh0VarM88331j;
                                            qqi0Var = qqi0Var;
                                        } else {
                                            exh0VarM88331j = exh0VarM88331j;
                                            qqi0Var = qqi0Var;
                                        }
                                    }
                                    exh0VarM88331j = wjg1.m88331j(qqi0Var);
                                }
                            }
                            exh0Var = exh0Var.f63774e;
                        }
                    }
                    lp70VarM88319I = lp70VarM88319I.m59645v();
                    exh0Var = (lp70VarM88319I != null || (xmj0Var = lp70VarM88319I.f135674c1) == null) ? null : xmj0Var.f263387e;
                }
                jlqVar2 = (ju60) jlqVar;
                if (jlqVar2 != null) {
                    exh0Var2 = ((exh0) jlqVar2).f63770a;
                } else {
                    exh0Var2 = null;
                }
            } else {
                if (!pqzVarM70532m.f63770a.f63766L0) {
                    mt40.m62791c("visitAncestors called on an unattached node");
                }
                exh0Var3 = pqzVarM70532m.f63770a;
                lp70VarM88319I2 = wjg1.m88319I(pqzVarM70532m);
                loop11: while (true) {
                    if (lp70VarM88319I2 != null) {
                        jlqVar3 = null;
                        break;
                    }
                    if ((lp70VarM88319I2.f135674c1.f263388f.f63773d & 8192) != 0) {
                        while (exh0Var3 != null) {
                            if ((exh0Var3.f63772c & 8192) != 0) {
                                qqi0Var2 = null;
                                exh0VarM88331j2 = exh0Var3;
                                while (exh0VarM88331j2 != null) {
                                    if (exh0VarM88331j2 instanceof ju60) {
                                        jlqVar3 = exh0VarM88331j2;
                                        break loop11;
                                    }
                                    if ((exh0VarM88331j2.f63772c & 8192) == 0 && (exh0VarM88331j2 instanceof xlq)) {
                                        exh0 exh0Var7 = ((xlq) exh0VarM88331j2).f263224N0;
                                        int i3 = 0;
                                        while (exh0Var7 != null) {
                                            if ((exh0Var7.f63772c & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    exh0VarM88331j2 = exh0VarM88331j2;
                                                    qqi0Var2 = qqi0Var2;
                                                    qqi0Var2 = qqi0Var2;
                                                    exh0VarM88331j2 = exh0Var7;
                                                } else {
                                                    if (qqi0Var2 == null) {
                                                        qqi0Var2 = new qqi0(0, new exh0[16]);
                                                    }
                                                    if (exh0VarM88331j2 != null) {
                                                        qqi0Var2.m73556b(exh0VarM88331j2);
                                                        exh0VarM88331j2 = null;
                                                    }
                                                    qqi0Var2.m73556b(exh0Var7);
                                                }
                                            } else {
                                                exh0VarM88331j2 = exh0VarM88331j2;
                                                qqi0Var2 = qqi0Var2;
                                            }
                                            exh0Var7 = exh0Var7.f63775f;
                                            exh0VarM88331j2 = exh0VarM88331j2;
                                            qqi0Var2 = qqi0Var2;
                                        }
                                        if (i3 == 1) {
                                            exh0VarM88331j2 = exh0VarM88331j2;
                                            qqi0Var2 = qqi0Var2;
                                        } else {
                                            exh0VarM88331j2 = exh0VarM88331j2;
                                            qqi0Var2 = qqi0Var2;
                                        }
                                    }
                                    exh0VarM88331j2 = wjg1.m88331j(qqi0Var2);
                                }
                            }
                            exh0Var3 = exh0Var3.f63774e;
                        }
                    }
                    lp70VarM88319I2 = lp70VarM88319I2.m59645v();
                    exh0Var3 = (lp70VarM88319I2 != null || (xmj0Var2 = lp70VarM88319I2.f135674c1) == null) ? null : xmj0Var2.f263387e;
                }
                jlqVar4 = (ju60) jlqVar3;
                if (jlqVar4 != null) {
                    exh0Var2 = ((exh0) jlqVar4).f63770a;
                } else {
                    if (!pqzVar.f63770a.f63766L0) {
                        mt40.m62791c("visitAncestors called on an unattached node");
                    }
                    exh0Var = pqzVar.f63770a.f63774e;
                    lp70VarM88319I = wjg1.m88319I(pqzVar);
                    loop15: while (true) {
                        if (lp70VarM88319I != null) {
                            jlqVar = null;
                            break;
                        }
                        if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 8192) != 0) {
                            while (exh0Var != null) {
                                if ((exh0Var.f63772c & 8192) != 0) {
                                    exh0VarM88331j = exh0Var;
                                    qqi0Var = null;
                                    while (exh0VarM88331j != null) {
                                        if (exh0VarM88331j instanceof ju60) {
                                            jlqVar = exh0VarM88331j;
                                            break loop15;
                                        }
                                        if ((exh0VarM88331j.f63772c & 8192) == 0) {
                                        }
                                        exh0VarM88331j = wjg1.m88331j(qqi0Var);
                                    }
                                }
                                exh0Var = exh0Var.f63774e;
                            }
                        }
                        lp70VarM88319I = lp70VarM88319I.m59645v();
                        if (lp70VarM88319I != null) {
                        }
                    }
                    jlqVar2 = (ju60) jlqVar;
                    if (jlqVar2 != null) {
                        exh0Var2 = ((exh0) jlqVar2).f63770a;
                    } else {
                        exh0Var2 = null;
                    }
                }
            }
            if (exh0Var2 != null) {
                if (!exh0Var2.f63770a.f63766L0) {
                    mt40.m62791c("visitAncestors called on an unattached node");
                }
                exh0 exh0Var8 = exh0Var2.f63770a.f63774e;
                lp70 lp70VarM88319I3 = wjg1.m88319I(exh0Var2);
                ArrayList arrayList = null;
                while (lp70VarM88319I3 != null) {
                    if ((lp70VarM88319I3.f135674c1.f263388f.f63773d & 8192) != 0) {
                        while (exh0Var8 != null) {
                            if ((exh0Var8.f63772c & 8192) != 0) {
                                exh0 exh0VarM88331j3 = exh0Var8;
                                qqi0 qqi0Var3 = null;
                                while (exh0VarM88331j3 != null) {
                                    if (exh0VarM88331j3 instanceof ju60) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(exh0VarM88331j3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (exh0VarM88331j3.f63772c & 8192) != 0 && (exh0VarM88331j3 instanceof xlq)) {
                                        int i4 = 0;
                                        for (exh0 exh0Var9 = ((xlq) exh0VarM88331j3).f263224N0; exh0Var9 != null; exh0Var9 = exh0Var9.f63775f) {
                                            if ((exh0Var9.f63772c & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    exh0VarM88331j3 = exh0Var9;
                                                } else {
                                                    if (qqi0Var3 == null) {
                                                        qqi0Var3 = new qqi0(0, new exh0[16]);
                                                    }
                                                    if (exh0VarM88331j3 != null) {
                                                        qqi0Var3.m73556b(exh0VarM88331j3);
                                                        exh0VarM88331j3 = null;
                                                    }
                                                    qqi0Var3.m73556b(exh0Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    exh0VarM88331j3 = wjg1.m88331j(qqi0Var3);
                                }
                            }
                            exh0Var8 = exh0Var8.f63774e;
                        }
                    }
                    lp70VarM88319I3 = lp70VarM88319I3.m59645v();
                    exh0Var8 = (lp70VarM88319I3 == null || (xmj0Var3 = lp70VarM88319I3.f135674c1) == null) ? null : xmj0Var3.f263387e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((ju60) arrayList.get(size)).mo46184y0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? M88331j = exh0Var2.f63770a;
                ?? qqi0Var4 = 0;
                while (M88331j != 0) {
                    if (M88331j instanceof ju60) {
                        if (((ju60) M88331j).mo46184y0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M88331j.f63772c & 8192) != 0 && (M88331j instanceof xlq)) {
                        exh0 exh0Var10 = ((xlq) M88331j).f263224N0;
                        int i6 = 0;
                        while (exh0Var10 != null) {
                            if ((exh0Var10.f63772c & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    M88331j = M88331j;
                                    qqi0Var4 = qqi0Var4;
                                    qqi0Var4 = qqi0Var4;
                                    M88331j = exh0Var10;
                                } else {
                                    if (qqi0Var4 == 0) {
                                        qqi0Var4 = new qqi0(0, new exh0[16]);
                                    }
                                    if (M88331j != 0) {
                                        qqi0Var4.m73556b(M88331j);
                                        M88331j = 0;
                                    }
                                    qqi0Var4.m73556b(exh0Var10);
                                }
                            } else {
                                M88331j = M88331j;
                                qqi0Var4 = qqi0Var4;
                            }
                            exh0Var10 = exh0Var10.f63775f;
                            M88331j = M88331j;
                            qqi0Var4 = qqi0Var4;
                        }
                        if (i6 == 1) {
                            M88331j = M88331j;
                            qqi0Var4 = qqi0Var4;
                        } else {
                            M88331j = M88331j;
                            qqi0Var4 = qqi0Var4;
                        }
                    }
                    M88331j = wjg1.m88331j(qqi0Var4);
                }
                if (((Boolean) eh00Var.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? M88331j2 = exh0Var2.f63770a;
                ?? qqi0Var5 = 0;
                while (M88331j2 != 0) {
                    if (M88331j2 instanceof ju60) {
                        if (((ju60) M88331j2).mo46182I0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M88331j2.f63772c & 8192) != 0 && (M88331j2 instanceof xlq)) {
                        exh0 exh0Var11 = ((xlq) M88331j2).f263224N0;
                        int i7 = 0;
                        while (exh0Var11 != null) {
                            if ((exh0Var11.f63772c & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    qqi0Var5 = qqi0Var5;
                                    M88331j2 = M88331j2;
                                    qqi0Var5 = qqi0Var5;
                                    M88331j2 = exh0Var11;
                                } else {
                                    if (qqi0Var5 == 0) {
                                        qqi0Var5 = new qqi0(0, new exh0[16]);
                                    }
                                    if (M88331j2 != 0) {
                                        qqi0Var5.m73556b(M88331j2);
                                        M88331j2 = 0;
                                    }
                                    qqi0Var5.m73556b(exh0Var11);
                                }
                            } else {
                                qqi0Var5 = qqi0Var5;
                                M88331j2 = M88331j2;
                            }
                            exh0Var11 = exh0Var11.f63775f;
                            qqi0Var5 = qqi0Var5;
                            M88331j2 = M88331j2;
                        }
                        if (i7 == 1) {
                            qqi0Var5 = qqi0Var5;
                            M88331j2 = M88331j2;
                        } else {
                            qqi0Var5 = qqi0Var5;
                            M88331j2 = M88331j2;
                        }
                    }
                    M88331j2 = wjg1.m88331j(qqi0Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((ju60) arrayList.get(i8)).mo46182I0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x020c A[LOOP:2: B:97:0x01af->B:127:0x020c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0219  */
    /* JADX WARN: Code duplicated, block: B:134:0x021f  */
    /* JADX WARN: Code duplicated, block: B:234:0x020f A[EDGE_INSN: B:234:0x020f->B:128:0x020f BREAK  A[LOOP:1: B:92:0x0199->B:240:0x0199], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x0130  */
    /* JADX WARN: Code duplicated, block: B:72:0x0136  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    /* JADX WARN: Code duplicated, block: B:82:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0167  */
    /* JADX WARN: Code duplicated, block: B:85:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x017f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x0196  */
    /* JADX WARN: Code duplicated, block: B:94:0x019d  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b1  */
    /* JADX INFO: renamed from: g */
    public final Boolean m76201g(int i, tiv0 tiv0Var, gh00 gh00Var) {
        boolean z;
        pqz pqzVar;
        xmj0 xmj0Var;
        aqz aqzVarM95663m;
        aqz aqzVarM83733g;
        aqz aqzVarM83740n;
        aqz aqzVarM83741o;
        Object[] objArr;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        exh0 exh0Var;
        qqi0 qqi0Var;
        exh0 exh0Var2;
        exh0 exh0Var3;
        int i4;
        exh0 exh0VarM88331j;
        qqi0 qqi0Var2;
        pqz pqzVarM70532m;
        pqz pqzVar2 = this.f201664c;
        pqz pqzVarM70532m2 = pp91.m70532m(pqzVar2);
        int i5 = 4;
        oz3 oz3Var = this.f201663b;
        if (pqzVarM70532m2 != null) {
            ko70 layoutDirection = oz3Var.getLayoutDirection();
            upz upzVarM70693J1 = pqzVarM70532m2.m70693J1();
            if (roz.m76092b(i, 1)) {
                aqzVarM83740n = upzVarM70693J1.m83736j();
            } else if (roz.m76092b(i, 2)) {
                aqzVarM83740n = upzVarM70693J1.m83739m();
            } else if (roz.m76092b(i, 5)) {
                aqzVarM83740n = upzVarM70693J1.m83742p();
            } else if (roz.m76092b(i, 6)) {
                aqzVarM83740n = upzVarM70693J1.m83732f();
            } else {
                if (!roz.m76092b(i, 3)) {
                    if (roz.m76092b(i, 4)) {
                        int iOrdinal = layoutDirection.ordinal();
                        if (iOrdinal == 0) {
                            aqzVarM83733g = upzVarM70693J1.m83733g();
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aqzVarM83733g = upzVarM70693J1.m83741o();
                        }
                        aqz aqzVar = aqz.f18873b;
                        aqzVarM83740n = aqzVarM83733g == z9g1.m95663m() ? null : aqzVarM83733g;
                        if (aqzVarM83740n == null) {
                            aqzVarM83740n = upzVarM70693J1.m83740n();
                        }
                    } else {
                        if (!roz.m76092b(i, 7) && !roz.m76092b(i, 8)) {
                            throw new IllegalStateException("invalid FocusDirection");
                        }
                        zob zobVar = new zob(i);
                        rpz rpzVar = (rpz) ((oz3) wjg1.m88320J(pqzVarM70532m2)).getFocusOwner();
                        pqz pqzVarM76202h = rpzVar.m76202h();
                        if (roz.m76092b(i, 7)) {
                            upzVarM70693J1.m83737k().invoke(zobVar);
                        } else {
                            upzVarM70693J1.m83738l().invoke(zobVar);
                        }
                        if (zobVar.m96617a()) {
                            aqz aqzVar2 = aqz.f18873b;
                            aqzVarM95663m = z9g1.m95662l();
                        } else if (pqzVarM76202h != rpzVar.m76202h()) {
                            aqz aqzVar3 = aqz.f18873b;
                            aqzVarM95663m = z9g1.m95664n();
                        } else {
                            aqz aqzVar4 = aqz.f18873b;
                            aqzVarM95663m = z9g1.m95663m();
                        }
                    }
                    aqz aqzVar5 = aqz.f18873b;
                    if (!wj50.m88271j(aqzVarM95663m, z9g1.m95662l())) {
                        if (wj50.m88271j(aqzVarM95663m, z9g1.m95664n())) {
                            pqzVarM70532m = pp91.m70532m(pqzVar2);
                            if (pqzVarM70532m != null) {
                                return (Boolean) gh00Var.invoke(pqzVarM70532m);
                            }
                        } else if (!wj50.m88271j(aqzVarM95663m, z9g1.m95663m())) {
                            if (aqzVarM95663m != z9g1.m95663m()) {
                                throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            }
                            if (aqzVarM95663m != z9g1.m95662l()) {
                                throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            }
                            if (aqzVarM95663m.m26908a().f191610c == 0) {
                                System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                                z3 = false;
                            } else {
                                qqi0 qqi0VarM26908a = aqzVarM95663m.m26908a();
                                objArr = qqi0VarM26908a.f191608a;
                                i2 = qqi0VarM26908a.f191610c;
                                z2 = false;
                                for (i3 = 0; i3 < i2; i3++) {
                                    exh0Var = (exh0) ((cqz) objArr[i3]);
                                    if (!exh0Var.f63770a.f63766L0) {
                                        mt40.m62791c("visitChildren called on an unattached node");
                                    }
                                    qqi0Var = new qqi0(0, new exh0[16]);
                                    exh0Var2 = exh0Var.f63770a;
                                    exh0Var3 = exh0Var2.f63775f;
                                    if (exh0Var3 == null) {
                                        wjg1.m88329h(qqi0Var, exh0Var2);
                                    } else {
                                        qqi0Var.m73556b(exh0Var3);
                                    }
                                    while (true) {
                                        i4 = qqi0Var.f191610c;
                                        if (i4 != 0) {
                                            break;
                                        }
                                        exh0VarM88331j = (exh0) qqi0Var.m73565l(i4 - 1);
                                        if ((exh0VarM88331j.f63773d & 1024) == 0) {
                                            wjg1.m88329h(qqi0Var, exh0VarM88331j);
                                        } else {
                                            while (exh0VarM88331j != null) {
                                                if ((exh0VarM88331j.f63772c & 1024) != 0) {
                                                    qqi0Var2 = null;
                                                    while (exh0VarM88331j != null) {
                                                        if (exh0VarM88331j instanceof pqz) {
                                                            if (((Boolean) gh00Var.invoke((pqz) exh0VarM88331j)).booleanValue()) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        } else if ((exh0VarM88331j.f63772c & 1024) == 0 && (exh0VarM88331j instanceof xlq)) {
                                                            int i6 = 0;
                                                            for (exh0 exh0Var4 = ((xlq) exh0VarM88331j).f263224N0; exh0Var4 != null; exh0Var4 = exh0Var4.f63775f) {
                                                                if ((exh0Var4.f63772c & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        exh0VarM88331j = exh0Var4;
                                                                    } else {
                                                                        if (qqi0Var2 == null) {
                                                                            qqi0Var2 = new qqi0(0, new exh0[16]);
                                                                        }
                                                                        if (exh0VarM88331j != null) {
                                                                            qqi0Var2.m73556b(exh0VarM88331j);
                                                                            exh0VarM88331j = null;
                                                                        }
                                                                        qqi0Var2.m73556b(exh0Var4);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                            }
                                                        }
                                                        exh0VarM88331j = wjg1.m88331j(qqi0Var2);
                                                    }
                                                    break;
                                                }
                                                exh0VarM88331j = exh0VarM88331j.f63775f;
                                            }
                                        }
                                    }
                                }
                                z3 = z2;
                            }
                            return Boolean.valueOf(z3);
                        }
                    }
                    return null;
                }
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    aqzVarM83741o = upzVarM70693J1.m83741o();
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aqzVarM83741o = upzVarM70693J1.m83733g();
                }
                aqz aqzVar6 = aqz.f18873b;
                aqzVarM83740n = aqzVarM83741o == z9g1.m95663m() ? null : aqzVarM83741o;
                if (aqzVarM83740n == null) {
                    aqzVarM83740n = upzVarM70693J1.m83735i();
                }
            }
            aqzVarM95663m = aqzVarM83740n;
            aqz aqzVar7 = aqz.f18873b;
            if (!wj50.m88271j(aqzVarM95663m, z9g1.m95662l())) {
                if (wj50.m88271j(aqzVarM95663m, z9g1.m95664n())) {
                    pqzVarM70532m = pp91.m70532m(pqzVar2);
                    if (pqzVarM70532m != null) {
                        return (Boolean) gh00Var.invoke(pqzVarM70532m);
                    }
                } else if (!wj50.m88271j(aqzVarM95663m, z9g1.m95663m())) {
                    if (aqzVarM95663m != z9g1.m95663m()) {
                        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    }
                    if (aqzVarM95663m != z9g1.m95662l()) {
                        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    }
                    if (aqzVarM95663m.m26908a().f191610c == 0) {
                        System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        z3 = false;
                    } else {
                        qqi0 qqi0VarM26908a2 = aqzVarM95663m.m26908a();
                        objArr = qqi0VarM26908a2.f191608a;
                        i2 = qqi0VarM26908a2.f191610c;
                        z2 = false;
                        while (i3 < i2) {
                            exh0Var = (exh0) ((cqz) objArr[i3]);
                            if (!exh0Var.f63770a.f63766L0) {
                                mt40.m62791c("visitChildren called on an unattached node");
                            }
                            qqi0Var = new qqi0(0, new exh0[16]);
                            exh0Var2 = exh0Var.f63770a;
                            exh0Var3 = exh0Var2.f63775f;
                            if (exh0Var3 == null) {
                                wjg1.m88329h(qqi0Var, exh0Var2);
                            } else {
                                qqi0Var.m73556b(exh0Var3);
                            }
                            while (true) {
                                i4 = qqi0Var.f191610c;
                                if (i4 != 0) {
                                    break;
                                    break;
                                }
                                exh0VarM88331j = (exh0) qqi0Var.m73565l(i4 - 1);
                                if ((exh0VarM88331j.f63773d & 1024) == 0) {
                                    wjg1.m88329h(qqi0Var, exh0VarM88331j);
                                } else {
                                    while (exh0VarM88331j != null) {
                                        if ((exh0VarM88331j.f63772c & 1024) != 0) {
                                            qqi0Var2 = null;
                                            while (exh0VarM88331j != null) {
                                                if (exh0VarM88331j instanceof pqz) {
                                                    if (((Boolean) gh00Var.invoke((pqz) exh0VarM88331j)).booleanValue()) {
                                                        z2 = true;
                                                        break;
                                                        break;
                                                    }
                                                } else if ((exh0VarM88331j.f63772c & 1024) == 0) {
                                                }
                                                exh0VarM88331j = wjg1.m88331j(qqi0Var2);
                                            }
                                            break;
                                            break;
                                        }
                                        exh0VarM88331j = exh0VarM88331j.f63775f;
                                    }
                                }
                            }
                        }
                        z3 = z2;
                    }
                    return Boolean.valueOf(z3);
                }
            }
            return null;
        }
        pqzVarM70532m2 = null;
        ko70 layoutDirection2 = oz3Var.getLayoutDirection();
        k0w k0wVar = new k0w(pqzVarM70532m2, this, gh00Var);
        if (roz.m76092b(i, 1) || roz.m76092b(i, 2)) {
            return Boolean.valueOf(q9g1.m72373E(pqzVar2, i, k0wVar));
        }
        if (roz.m76092b(i, 3) || roz.m76092b(i, 4) || roz.m76092b(i, 5) || roz.m76092b(i, 6)) {
            return x4w0.m89930U(i, k0wVar, pqzVar2, tiv0Var);
        }
        if (roz.m76092b(i, 7)) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 3;
            }
            pqz pqzVarM70532m3 = pp91.m70532m(pqzVar2);
            if (pqzVarM70532m3 != null) {
                return x4w0.m89930U(i5, k0wVar, pqzVarM70532m3, tiv0Var);
            }
            return null;
        }
        if (!roz.m76092b(i, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) roz.m76093c(i))).toString());
        }
        pqz pqzVarM70532m4 = pp91.m70532m(pqzVar2);
        if (pqzVarM70532m4 != null) {
            if (!pqzVarM70532m4.f63770a.f63766L0) {
                mt40.m62791c("visitAncestors called on an unattached node");
            }
            exh0 exh0Var5 = pqzVarM70532m4.f63770a.f63774e;
            lp70 lp70VarM88319I = wjg1.m88319I(pqzVarM70532m4);
            loop5: while (true) {
                if (lp70VarM88319I == null) {
                    pqzVar = null;
                    break;
                }
                if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 1024) != 0) {
                    while (exh0Var5 != null) {
                        if ((exh0Var5.f63772c & 1024) != 0) {
                            exh0 exh0VarM88331j2 = exh0Var5;
                            qqi0 qqi0Var3 = null;
                            while (exh0VarM88331j2 != null) {
                                if (exh0VarM88331j2 instanceof pqz) {
                                    pqz pqzVar3 = (pqz) exh0VarM88331j2;
                                    if (pqzVar3.m70693J1().mo67472d()) {
                                        pqzVar = pqzVar3;
                                        break loop5;
                                    }
                                } else if ((exh0VarM88331j2.f63772c & 1024) != 0 && (exh0VarM88331j2 instanceof xlq)) {
                                    int i7 = 0;
                                    for (exh0 exh0Var6 = ((xlq) exh0VarM88331j2).f263224N0; exh0Var6 != null; exh0Var6 = exh0Var6.f63775f) {
                                        if ((exh0Var6.f63772c & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                exh0VarM88331j2 = exh0Var6;
                                            } else {
                                                if (qqi0Var3 == null) {
                                                    qqi0Var3 = new qqi0(0, new exh0[16]);
                                                }
                                                if (exh0VarM88331j2 != null) {
                                                    qqi0Var3.m73556b(exh0VarM88331j2);
                                                    exh0VarM88331j2 = null;
                                                }
                                                qqi0Var3.m73556b(exh0Var6);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        exh0VarM88331j2 = wjg1.m88331j(qqi0Var3);
                                    }
                                }
                                exh0VarM88331j2 = wjg1.m88331j(qqi0Var3);
                            }
                        }
                        exh0Var5 = exh0Var5.f63774e;
                    }
                }
                lp70VarM88319I = lp70VarM88319I.m59645v();
                exh0Var5 = (lp70VarM88319I == null || (xmj0Var = lp70VarM88319I.f135674c1) == null) ? null : xmj0Var.f263387e;
            }
            z = false;
        } else {
            z = false;
            pqzVar = null;
        }
        return Boolean.valueOf((pqzVar == null || pqzVar.equals(pqzVar2)) ? z : ((Boolean) k0wVar.invoke(pqzVar)).booleanValue());
    }

    /* JADX INFO: renamed from: h */
    public final pqz m76202h() {
        pqz pqzVar = this.f201669h;
        if (pqzVar == null || !pqzVar.f63766L0) {
            return null;
        }
        return pqzVar;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m76203i(int i, boolean z) {
        pqz pqzVarM76202h = m76202h();
        oz3 oz3Var = this.f201662a;
        if (pqzVarM76202h == null || !pqzVarM76202h.f180448M0 || !oz3Var.m68608w(i)) {
            rlv0 rlv0Var = new rlv0();
            rlv0Var.f200373a = Boolean.FALSE;
            pqz pqzVarM76202h2 = m76202h();
            Boolean boolM76201g = m76201g(i, oz3Var.getEmbeddedViewFocusRect(), new C2580xm(rlv0Var, i, 9));
            if (!wj50.m88271j(boolM76201g, Boolean.TRUE) || pqzVarM76202h2 == m76202h()) {
                if (boolM76201g != null && rlv0Var.f200373a != null) {
                    if (!boolM76201g.booleanValue() || !((Boolean) rlv0Var.f200373a).booleanValue()) {
                        if (r9g1.m75072t(i) && z && m76198d(i, false, false)) {
                            Boolean boolM76201g2 = m76201g(i, null, new tsl(i, 1));
                            if (boolM76201g2 != null ? boolM76201g2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m76204j(int i) {
        if (!m76198d(i, false, false)) {
            return false;
        }
        Boolean boolM76201g = m76201g(i, null, new le0(i, 27));
        boolean zBooleanValue = boolM76201g != null ? boolM76201g.booleanValue() : false;
        if (!zBooleanValue) {
            m76199e();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: k */
    public final void m76205k(pqz pqzVar) {
        pqz pqzVar2 = this.f201669h;
        this.f201669h = pqzVar;
        jpi0 jpi0Var = this.f201668g;
        Object[] objArr = jpi0Var.f114675a;
        int i = jpi0Var.f114676b;
        for (int i2 = 0; i2 < i; i2++) {
            ((lpz) objArr[i2]).mo46000a(pqzVar2, pqzVar);
        }
    }
}
