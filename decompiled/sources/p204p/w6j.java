package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w6j {

    /* JADX INFO: renamed from: a */
    public int[] f248390a = new int[10];

    /* JADX INFO: renamed from: b */
    public int[] f248391b = new int[10];

    /* JADX INFO: renamed from: c */
    public int f248392c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f248393d = new int[10];

    /* JADX INFO: renamed from: e */
    public float[] f248394e = new float[10];

    /* JADX INFO: renamed from: f */
    public int f248395f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f248396g = new int[5];

    /* JADX INFO: renamed from: h */
    public String[] f248397h = new String[5];

    /* JADX INFO: renamed from: i */
    public int f248398i = 0;

    /* JADX INFO: renamed from: j */
    public int[] f248399j = new int[4];

    /* JADX INFO: renamed from: k */
    public boolean[] f248400k = new boolean[4];

    /* JADX INFO: renamed from: l */
    public int f248401l = 0;

    /* JADX INFO: renamed from: a */
    public final void m87288a(float f, int i) {
        int i2 = this.f248395f;
        int[] iArr = this.f248393d;
        if (i2 >= iArr.length) {
            this.f248393d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f248394e;
            this.f248394e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f248393d;
        int i3 = this.f248395f;
        iArr2[i3] = i;
        float[] fArr2 = this.f248394e;
        this.f248395f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m87289b(int i, int i2) {
        int i3 = this.f248392c;
        int[] iArr = this.f248390a;
        if (i3 >= iArr.length) {
            this.f248390a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f248391b;
            this.f248391b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f248390a;
        int i4 = this.f248392c;
        iArr3[i4] = i;
        int[] iArr4 = this.f248391b;
        this.f248392c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m87290c(int i, String str) {
        int i2 = this.f248398i;
        int[] iArr = this.f248396g;
        if (i2 >= iArr.length) {
            this.f248396g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f248397h;
            this.f248397h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f248396g;
        int i3 = this.f248398i;
        iArr2[i3] = i;
        String[] strArr2 = this.f248397h;
        this.f248398i = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m87291d(int i, boolean z) {
        int i2 = this.f248401l;
        int[] iArr = this.f248399j;
        if (i2 >= iArr.length) {
            this.f248399j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f248400k;
            this.f248400k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f248399j;
        int i3 = this.f248401l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f248400k;
        this.f248401l = i3 + 1;
        zArr2[i3] = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m87292e(x6j x6jVar) {
        for (int i = 0; i < this.f248392c; i++) {
            int i2 = this.f248390a[i];
            int i3 = this.f248391b[i];
            if (i2 == 6) {
                x6jVar.f258686e.f269798D = i3;
            } else if (i2 == 7) {
                x6jVar.f258686e.f269799E = i3;
            } else if (i2 == 8) {
                x6jVar.f258686e.f269805K = i3;
            } else if (i2 == 27) {
                x6jVar.f258686e.f269800F = i3;
            } else if (i2 == 28) {
                x6jVar.f258686e.f269802H = i3;
            } else if (i2 == 41) {
                x6jVar.f258686e.f269817W = i3;
            } else if (i2 == 42) {
                x6jVar.f258686e.f269818X = i3;
            } else if (i2 == 61) {
                x6jVar.f258686e.f269795A = i3;
            } else if (i2 == 62) {
                x6jVar.f258686e.f269796B = i3;
            } else if (i2 == 72) {
                x6jVar.f258686e.f269834g0 = i3;
            } else if (i2 == 73) {
                x6jVar.f258686e.f269836h0 = i3;
            } else if (i2 == 88) {
                x6jVar.f258685d.f279937l = i3;
            } else if (i2 == 89) {
                x6jVar.f258685d.f279938m = i3;
            } else if (i2 == 2) {
                x6jVar.f258686e.f269804J = i3;
            } else if (i2 == 31) {
                x6jVar.f258686e.f269806L = i3;
            } else if (i2 == 34) {
                x6jVar.f258686e.f269803I = i3;
            } else if (i2 == 38) {
                x6jVar.f258682a = i3;
            } else if (i2 == 64) {
                x6jVar.f258685d.f279927b = i3;
            } else if (i2 == 66) {
                x6jVar.f258685d.f279931f = i3;
            } else if (i2 == 76) {
                x6jVar.f258685d.f279930e = i3;
            } else if (i2 == 78) {
                x6jVar.f258684c.f13062c = i3;
            } else if (i2 == 97) {
                x6jVar.f258686e.f269852p0 = i3;
            } else if (i2 == 93) {
                x6jVar.f258686e.f269807M = i3;
            } else if (i2 != 94) {
                switch (i2) {
                    case 11:
                        x6jVar.f258686e.f269811Q = i3;
                        break;
                    case 12:
                        x6jVar.f258686e.f269812R = i3;
                        break;
                    case 13:
                        x6jVar.f258686e.f269808N = i3;
                        break;
                    case 14:
                        x6jVar.f258686e.f269810P = i3;
                        break;
                    case 15:
                        x6jVar.f258686e.f269813S = i3;
                        break;
                    case 16:
                        x6jVar.f258686e.f269809O = i3;
                        break;
                    case 17:
                        x6jVar.f258686e.f269829e = i3;
                        break;
                    case 18:
                        x6jVar.f258686e.f269831f = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                x6jVar.f258686e.f269827d = i3;
                                break;
                            case 22:
                                x6jVar.f258684c.f13061b = i3;
                                break;
                            case 23:
                                x6jVar.f258686e.f269825c = i3;
                                break;
                            case 24:
                                x6jVar.f258686e.f269801G = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 54:
                                        x6jVar.f258686e.f269819Y = i3;
                                        break;
                                    case 55:
                                        x6jVar.f258686e.f269820Z = i3;
                                        break;
                                    case 56:
                                        x6jVar.f258686e.f269822a0 = i3;
                                        break;
                                    case 57:
                                        x6jVar.f258686e.f269824b0 = i3;
                                        break;
                                    case 58:
                                        x6jVar.f258686e.f269826c0 = i3;
                                        break;
                                    case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                        x6jVar.f258686e.f269828d0 = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                x6jVar.f258685d.f279928c = i3;
                                                break;
                                            case 83:
                                                x6jVar.f258687f.f24293i = i3;
                                                break;
                                            case 84:
                                                x6jVar.f258685d.f279935j = i3;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                x6jVar.f258686e.f269814T = i3;
            }
        }
        for (int i4 = 0; i4 < this.f248395f; i4++) {
            int i5 = this.f248393d[i4];
            float f = this.f248394e[i4];
            if (i5 == 19) {
                x6jVar.f258686e.f269833g = f;
            } else if (i5 == 20) {
                x6jVar.f258686e.f269860x = f;
            } else if (i5 == 37) {
                x6jVar.f258686e.f269861y = f;
            } else if (i5 == 60) {
                x6jVar.f258687f.f24286b = f;
            } else if (i5 == 63) {
                x6jVar.f258686e.f269797C = f;
            } else if (i5 == 79) {
                x6jVar.f258685d.f279932g = f;
            } else if (i5 == 85) {
                x6jVar.f258685d.f279934i = f;
            } else if (i5 == 39) {
                x6jVar.f258686e.f269816V = f;
            } else if (i5 != 40) {
                switch (i5) {
                    case 43:
                        x6jVar.f258684c.f13063d = f;
                        break;
                    case 44:
                        b7j b7jVar = x6jVar.f258687f;
                        b7jVar.f24298n = f;
                        b7jVar.f24297m = true;
                        break;
                    case 45:
                        x6jVar.f258687f.f24287c = f;
                        break;
                    case 46:
                        x6jVar.f258687f.f24288d = f;
                        break;
                    case 47:
                        x6jVar.f258687f.f24289e = f;
                        break;
                    case 48:
                        x6jVar.f258687f.f24290f = f;
                        break;
                    case 49:
                        x6jVar.f258687f.f24291g = f;
                        break;
                    case 50:
                        x6jVar.f258687f.f24292h = f;
                        break;
                    case 51:
                        x6jVar.f258687f.f24294j = f;
                        break;
                    case 52:
                        x6jVar.f258687f.f24295k = f;
                        break;
                    case 53:
                        x6jVar.f258687f.f24296l = f;
                        break;
                    default:
                        switch (i5) {
                            case 67:
                                x6jVar.f258685d.f279933h = f;
                                break;
                            case 68:
                                x6jVar.f258684c.f13064e = f;
                                break;
                            case 69:
                                x6jVar.f258686e.f269830e0 = f;
                                break;
                            case 70:
                                x6jVar.f258686e.f269832f0 = f;
                                break;
                        }
                        break;
                }
            } else {
                x6jVar.f258686e.f269815U = f;
            }
        }
        for (int i6 = 0; i6 < this.f248398i; i6++) {
            int i7 = this.f248396g[i6];
            String str = this.f248397h[i6];
            if (i7 == 5) {
                x6jVar.f258686e.f269862z = str;
            } else if (i7 == 65) {
                x6jVar.f258685d.f279929d = str;
            } else if (i7 == 74) {
                y6j y6jVar = x6jVar.f258686e;
                y6jVar.f269842k0 = str;
                y6jVar.f269840j0 = null;
            } else if (i7 == 77) {
                x6jVar.f258686e.f269844l0 = str;
            } else if (i7 == 90) {
                x6jVar.f258685d.f279936k = str;
            }
        }
        for (int i8 = 0; i8 < this.f248401l; i8++) {
            int i9 = this.f248399j[i8];
            boolean z = this.f248400k[i8];
            if (i9 == 44) {
                x6jVar.f258687f.f24297m = z;
            } else if (i9 == 75) {
                x6jVar.f258686e.f269850o0 = z;
            } else if (i9 == 80) {
                x6jVar.f258686e.f269846m0 = z;
            } else if (i9 == 81) {
                x6jVar.f258686e.f269848n0 = z;
            }
        }
    }
}
