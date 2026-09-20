package p204p;

import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class jze1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final eyh0 f117710a;

    /* JADX INFO: renamed from: b */
    public final byte f117711b;

    /* JADX INFO: renamed from: c */
    public final ioo f117712c;

    /* JADX INFO: renamed from: d */
    public final dfa0 f117713d;

    /* JADX INFO: renamed from: e */
    public final int f117714e;

    /* JADX INFO: renamed from: f */
    public final int f117715f;

    /* JADX INFO: renamed from: g */
    public final hze1 f117716g;

    /* JADX INFO: renamed from: h */
    public final hze1 f117717h;

    /* JADX INFO: renamed from: i */
    public final hze1 f117718i;

    public jze1(eyh0 eyh0Var, int i, ioo iooVar, dfa0 dfa0Var, int i2, int i3, hze1 hze1Var, hze1 hze1Var2, hze1 hze1Var3) {
        this.f117710a = eyh0Var;
        this.f117711b = (byte) i;
        this.f117712c = iooVar;
        this.f117713d = dfa0Var;
        this.f117714e = i2;
        this.f117715f = i3;
        this.f117716g = hze1Var;
        this.f117717h = hze1Var2;
        this.f117718i = hze1Var3;
    }

    /* JADX INFO: renamed from: a */
    public static jze1 m54881a(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        eyh0 eyh0VarM40311q = eyh0.m40311q(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        ioo iooVarM51213n = i3 == 0 ? null : ioo.m51213n(i3);
        int i4 = (507904 & i) >>> 14;
        int i5 = edb.m38551G(3)[(i & 12288) >>> 12];
        int i6 = (i & 4080) >>> 4;
        int i7 = (i & 12) >>> 2;
        int i8 = i & 3;
        int i9 = i4 == 31 ? dataInput.readInt() : i4 * 3600;
        hze1 hze1VarM49269u = hze1.m49269u(i6 == 255 ? dataInput.readInt() : (i6 - 128) * 900);
        int i10 = hze1VarM49269u.f96910b;
        hze1 hze1VarM49269u2 = hze1.m49269u(i7 == 3 ? dataInput.readInt() : (i7 * 1800) + i10);
        hze1 hze1VarM49269u3 = i8 == 3 ? hze1.m49269u(dataInput.readInt()) : hze1.m49269u((i8 * 1800) + i10);
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new jze1(eyh0VarM40311q, i2, iooVarM51213n, dfa0.m35865s6(jlg1.m53708r(i9, 86400)), jlg1.m53706p(i9), i5, hze1VarM49269u, hze1VarM49269u2, hze1VarM49269u3);
    }

    private Object writeReplace() {
        return new itz0((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jze1)) {
            return false;
        }
        jze1 jze1Var = (jze1) obj;
        return this.f117710a == jze1Var.f117710a && this.f117711b == jze1Var.f117711b && this.f117712c == jze1Var.f117712c && this.f117715f == jze1Var.f117715f && this.f117714e == jze1Var.f117714e && this.f117713d.equals(jze1Var.f117713d) && this.f117716g.equals(jze1Var.f117716g) && this.f117717h.equals(jze1Var.f117717h) && this.f117718i.equals(jze1Var.f117718i);
    }

    public final int hashCode() {
        int iM35867A6 = ((this.f117713d.m35867A6() + this.f117714e) << 15) + (this.f117710a.ordinal() << 11) + ((this.f117711b + 32) << 5);
        ioo iooVar = this.f117712c;
        return ((this.f117716g.f96910b ^ (edb.m38547C(this.f117715f) + (iM35867A6 + ((iooVar == null ? 7 : iooVar.ordinal()) << 2)))) ^ this.f117717h.f96910b) ^ this.f117718i.f96910b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        hze1 hze1Var = this.f117718i;
        int i = hze1Var.f96910b;
        hze1 hze1Var2 = this.f117717h;
        sb.append(i - hze1Var2.f96910b > 0 ? "Gap " : "Overlap ");
        sb.append(hze1Var2);
        sb.append(" to ");
        sb.append(hze1Var);
        sb.append(", ");
        eyh0 eyh0Var = this.f117710a;
        byte b = this.f117711b;
        ioo iooVar = this.f117712c;
        if (iooVar == null) {
            sb.append(eyh0Var.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(iooVar.name());
            sb.append(" on or before last day of ");
            sb.append(eyh0Var.name());
        } else if (b < 0) {
            sb.append(iooVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(eyh0Var.name());
        } else {
            sb.append(iooVar.name());
            sb.append(" on or after ");
            sb.append(eyh0Var.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        dfa0 dfa0Var = this.f117713d;
        int i2 = this.f117714e;
        if (i2 == 0) {
            sb.append(dfa0Var);
        } else {
            long jM35867A6 = (i2 * 1440) + (dfa0Var.m35867A6() / 60);
            long jM53707q = jlg1.m53707q(jM35867A6, 60L);
            if (jM53707q < 10) {
                sb.append(0);
            }
            sb.append(jM53707q);
            sb.append(':');
            long jM53709s = jlg1.m53709s(60, jM35867A6);
            if (jM53709s < 10) {
                sb.append(0);
            }
            sb.append(jM53709s);
        }
        sb.append(" ");
        sb.append(t3d1.m80011z(this.f117715f));
        sb.append(", standard offset ");
        sb.append(this.f117716g);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b;
        dfa0 dfa0Var = this.f117713d;
        int iM35867A6 = (this.f117714e * 86400) + dfa0Var.m35867A6();
        int i = this.f117716g.f96910b;
        int i2 = this.f117717h.f96910b;
        int i3 = i2 - i;
        int i4 = this.f117718i.f96910b;
        int i5 = i4 - i;
        if (iM35867A6 % 3600 != 0 || iM35867A6 > 86400) {
            b = 31;
        } else {
            b = iM35867A6 == 86400 ? (byte) 24 : dfa0Var.f48555d;
        }
        int i6 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i7 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        int i8 = (i5 == 0 || i5 == 1800 || i5 == 3600) ? i5 / 1800 : 3;
        ioo iooVar = this.f117712c;
        objectOutput.writeInt((this.f117710a.m40314n() << 28) + ((this.f117711b + 32) << 22) + ((iooVar == null ? 0 : iooVar.m51215f()) << 19) + (b << 14) + (edb.m38547C(this.f117715f) << 12) + (i6 << 4) + (i7 << 2) + i8);
        if (b == 31) {
            objectOutput.writeInt(iM35867A6);
        }
        if (i6 == 255) {
            objectOutput.writeInt(i);
        }
        if (i7 == 3) {
            objectOutput.writeInt(i2);
        }
        if (i8 == 3) {
            objectOutput.writeInt(i4);
        }
    }
}
