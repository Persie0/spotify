package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class muc extends k450 {
    @Override // p204p.i5j
    /* JADX INFO: renamed from: a */
    public final gd70 mo26195a(mxh0 mxh0Var) {
        ib70 ib70VarMo53211g = mxh0Var.mo53211g();
        ib70VarMo53211g.getClass();
        return ib70VarMo53211g.m50166t(her0.CHAR);
    }

    @Override // p204p.i5j
    public final String toString() {
        String strValueOf;
        Object obj = this.f98976a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case '\t':
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : "?";
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
