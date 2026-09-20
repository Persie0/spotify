package p204p;

import androidx.datastore.preferences.protobuf.C0045b;
import androidx.datastore.preferences.protobuf.C0046c;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ptc {

    /* JADX INFO: renamed from: a */
    public int f181099a;

    /* JADX INFO: renamed from: b */
    public Object f181100b;

    public ptc(String str, int i) {
        this.f181100b = str;
        this.f181099a = i;
    }

    /* JADX INFO: renamed from: q0 */
    public static C0045b m70920q0(byte[] bArr) {
        int length = bArr.length;
        C0045b c0045b = new C0045b(bArr, length);
        try {
            c0045b.mo459z0(length);
            return c0045b;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static ptc m70921r0(FileInputStream fileInputStream) {
        return new C0046c(fileInputStream);
    }

    /* JADX INFO: renamed from: A0 */
    public void m70922A0(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.f181099a + 1;
        this.f181099a = i;
        long[] jArr = (long[]) this.f181100b;
        if (i >= jArr.length) {
            this.f181100b = Arrays.copyOf(jArr, jArr.length * 2);
        }
        ((long[]) this.f181100b)[i] = j;
    }

    /* JADX INFO: renamed from: B0 */
    public abstract boolean mo429B0();

    /* JADX INFO: renamed from: C0 */
    public abstract dva mo430C0();

    /* JADX INFO: renamed from: D0 */
    public abstract double mo431D0();

    /* JADX INFO: renamed from: E0 */
    public abstract int mo432E0();

    /* JADX INFO: renamed from: F0 */
    public abstract int mo433F0();

    /* JADX INFO: renamed from: G0 */
    public abstract long mo434G0();

    /* JADX INFO: renamed from: H0 */
    public abstract float mo435H0();

    /* JADX INFO: renamed from: I0 */
    public abstract int mo436I0();

    /* JADX INFO: renamed from: J0 */
    public abstract long mo437J0();

    /* JADX INFO: renamed from: K0 */
    public abstract int mo438K0();

    /* JADX INFO: renamed from: L0 */
    public abstract long mo439L0();

    /* JADX INFO: renamed from: M0 */
    public abstract int mo440M0();

    /* JADX INFO: renamed from: N0 */
    public abstract long mo441N0();

    /* JADX INFO: renamed from: O0 */
    public abstract String mo442O0();

    /* JADX INFO: renamed from: P0 */
    public abstract String mo443P0();

    /* JADX INFO: renamed from: Q0 */
    public abstract int mo444Q0();

    /* JADX INFO: renamed from: R0 */
    public abstract int mo445R0();

    /* JADX INFO: renamed from: S0 */
    public abstract long mo446S0();

    /* JADX INFO: renamed from: T0 */
    public void m70923T0(char[] cArr) {
        synchronized (this) {
            int i = this.f181099a;
            if (cArr.length + i < xj5.f262048a) {
                this.f181099a = i + cArr.length;
                ((hj5) this.f181100b).addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public abstract boolean mo447U0(int i);

    /* JADX INFO: renamed from: V0 */
    public char[] m70924V0(int i) {
        char[] cArr;
        synchronized (this) {
            hj5 hj5Var = (hj5) this.f181100b;
            cArr = null;
            char[] cArr2 = (char[]) (hj5Var.isEmpty() ? null : hj5Var.removeLast());
            if (cArr2 != null) {
                this.f181099a -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo455k0(int i);

    /* JADX INFO: renamed from: l0 */
    public long m70925l0() {
        return ((long[]) this.f181100b)[this.f181099a];
    }

    /* JADX INFO: renamed from: m0 */
    public long m70926m0() {
        int i = this.f181099a;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.f181100b)[i];
    }

    /* JADX INFO: renamed from: n0 */
    public int m70927n0() {
        return this.f181099a;
    }

    /* JADX INFO: renamed from: o0 */
    public abstract int mo456o0();

    /* JADX INFO: renamed from: p0 */
    public abstract boolean mo457p0();

    /* JADX INFO: renamed from: u0 */
    public abstract swd1 mo30501u0(swd1 swd1Var, List list);

    /* JADX INFO: renamed from: v0 */
    public abstract yya1 mo30502v0(awd1 awd1Var, yya1 yya1Var);

    /* JADX INFO: renamed from: w0 */
    public abstract void mo458w0(int i);

    /* JADX INFO: renamed from: x0 */
    public long m70928x0() {
        int i = this.f181099a;
        if (i < 0) {
            throw new SerializationException("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f181100b;
        this.f181099a = i - 1;
        return jArr[i];
    }

    /* JADX INFO: renamed from: y0 */
    public long m70929y0() {
        int i = this.f181099a;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.f181100b;
        this.f181099a = i - 1;
        return jArr[i];
    }

    /* JADX INFO: renamed from: z0 */
    public abstract int mo459z0(int i);

    public ptc(int i, boolean z) {
        switch (i) {
            case 2:
                this.f181100b = new long[8];
                this.f181099a = -1;
                break;
            default:
                this.f181100b = new hj5();
                break;
        }
    }

    public ptc(int i) {
        this.f181099a = i;
    }

    /* JADX INFO: renamed from: t0 */
    public void mo46014t0() {
    }

    /* JADX INFO: renamed from: s0 */
    public void mo46013s0(awd1 awd1Var) {
    }
}
