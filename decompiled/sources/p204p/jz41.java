package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class jz41 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f117593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mz41 f117594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz41(mz41 mz41Var, int i) {
        super(4);
        this.f117593a = i;
        this.f117594b = mz41Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.f117593a) {
            case 0:
                gz41 gz41Var = (gz41) obj;
                hz41 hz41Var = (hz41) obj2;
                ((Number) obj3).intValue();
                g4h0 g4h0Var = new g4h0(new vch0((st91) obj4, 23), (byte) 0);
                tz41 tz41Var = gz41Var.f85835b;
                int i2 = 2;
                switch (tz41Var.ordinal()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 6;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 2;
                        break;
                    case 5:
                        i = 3;
                        break;
                    case 6:
                        i = 4;
                        break;
                    default:
                        na6.m63971s("Unable to determine the stats tile id, defaulting to Identifier.TOP_TRACKS");
                        i = 6;
                        break;
                }
                Integer numValueOf = Integer.valueOf(gz41Var.f85836c.mo33391c());
                int iOrdinal = tz41Var.ordinal();
                if (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) {
                    boolean zM97106a = this.f117594b.f148610d.m97106a();
                    xz41 xz41Var = gz41Var.f85834a;
                    wz41 wz41Var = xz41Var instanceof wz41 ? (wz41) xz41Var : null;
                    boolean z = false;
                    boolean z2 = wz41Var != null && wz41Var.f256484k;
                    Integer num = hz41Var.f96791b;
                    if (num != null && num.intValue() > 0) {
                        z = true;
                    }
                    if (!zM97106a) {
                        i2 = 1;
                    } else if (z2 && z) {
                        i2 = 4;
                    } else if (z2) {
                        i2 = 5;
                    } else if (!z) {
                        i2 = 3;
                    }
                } else {
                    i2 = 6;
                }
                return new tlh0(g4h0Var, i, numValueOf, i2);
            default:
                tlh0 tlh0Var = (tlh0) obj;
                gz41 gz41Var2 = (gz41) obj2;
                if (!(((ez41) obj4) instanceof ez41)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM63232e = mz41.m63232e(this.f117594b, gz41Var2.f85835b.f225150a, gz41Var2.f85836c);
                dv91 dv91Var = new dv91("hit", 1);
                String string = strM63232e != null ? strM63232e.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), tlh0Var.f221474a, ((vch0) tlh0Var.f221475b.f76422c).f240134b, System.currentTimeMillis());
        }
    }
}
