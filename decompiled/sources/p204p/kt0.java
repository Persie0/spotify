package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class kt0 {

    /* JADX INFO: renamed from: f */
    public static final kt0 f126088f = new kt0(new ht0[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: g */
    public static final ht0 f126089g;

    /* JADX INFO: renamed from: h */
    public static final String f126090h;

    /* JADX INFO: renamed from: i */
    public static final String f126091i;

    /* JADX INFO: renamed from: j */
    public static final String f126092j;

    /* JADX INFO: renamed from: k */
    public static final String f126093k;

    /* JADX INFO: renamed from: a */
    public final int f126094a;

    /* JADX INFO: renamed from: b */
    public final long f126095b;

    /* JADX INFO: renamed from: c */
    public final long f126096c;

    /* JADX INFO: renamed from: d */
    public final int f126097d;

    /* JADX INFO: renamed from: e */
    public final ht0[] f126098e;

    static {
        ht0 ht0Var = new ht0(0L, -1, -1, new int[0], new ufd0[0], new long[0], 0L, false, new String[0], new it0[0], false);
        int[] iArr = ht0Var.f94883f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = ht0Var.f94884g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        ufd0[] ufd0VarArr = (ufd0[]) Arrays.copyOf(ht0Var.f94882e, 0);
        String[] strArr = (String[]) Arrays.copyOf(ht0Var.f94885h, 0);
        it0[] it0VarArr = ht0Var.f94886i;
        f126089g = new ht0(ht0Var.f94878a, 0, ht0Var.f94880c, iArrCopyOf, ufd0VarArr, jArrCopyOf, ht0Var.f94887j, ht0Var.f94888k, strArr, (it0[]) Arrays.copyOf(it0VarArr, Math.max(0, it0VarArr.length)), ht0Var.f94889l);
        String str = h0b1.f86200a;
        f126090h = Integer.toString(1, 36);
        f126091i = Integer.toString(2, 36);
        f126092j = Integer.toString(3, 36);
        f126093k = Integer.toString(4, 36);
    }

    public kt0(ht0[] ht0VarArr, long j, long j2, int i) {
        this.f126095b = j;
        this.f126096c = j2;
        this.f126094a = ht0VarArr.length + i;
        this.f126098e = ht0VarArr;
        this.f126097d = i;
    }

    /* JADX INFO: renamed from: a */
    public final ht0 m57289a(int i) {
        int i2 = this.f126097d;
        return i < i2 ? f126089g : this.f126098e[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kt0.class != obj.getClass()) {
            return false;
        }
        kt0 kt0Var = (kt0) obj;
        return this.f126094a == kt0Var.f126094a && this.f126095b == kt0Var.f126095b && this.f126096c == kt0Var.f126096c && this.f126097d == kt0Var.f126097d && Arrays.equals(this.f126098e, kt0Var.f126098e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f126098e) + (((((((this.f126094a * 961) + ((int) this.f126095b)) * 31) + ((int) this.f126096c)) * 31) + this.f126097d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f126095b);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            ht0[] ht0VarArr = this.f126098e;
            if (i >= ht0VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(ht0VarArr[i].f94878a);
            sb.append(", contentResumeOffsetUs=");
            sb.append(ht0VarArr[i].f94887j);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < ht0VarArr[i].f94883f.length; i2++) {
                sb.append("ad(state=");
                int i3 = ht0VarArr[i].f94883f[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(ht0VarArr[i].f94884g[i2]);
                sb.append(')');
                if (i2 < ht0VarArr[i].f94883f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < ht0VarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
