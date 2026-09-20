package p204p;

import android.graphics.Path;
import com.comscore.streaming.ContentType;
import com.spotify.metadata.proto.Metadata$Episode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4b1 extends u4b1 {

    /* JADX INFO: renamed from: a */
    public vcn0[] f237110a;

    /* JADX INFO: renamed from: b */
    public String f237111b;

    /* JADX INFO: renamed from: c */
    public int f237112c;

    public v4b1() {
        this.f237110a = null;
        this.f237112c = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m84649c() {
        return this instanceof r4b1;
    }

    /* JADX INFO: renamed from: d */
    public final void m84650d(Path path) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Path path2 = path;
        path2.reset();
        vcn0[] vcn0VarArr = this.f237110a;
        if (vcn0VarArr != null) {
            float[] fArr = new float[6];
            int length = vcn0VarArr.length;
            int i3 = 0;
            char c = 'm';
            while (i3 < length) {
                vcn0 vcn0Var = vcn0VarArr[i3];
                char c2 = vcn0Var.f240168a;
                float[] fArr2 = vcn0Var.f240169b;
                float f11 = fArr[0];
                float f12 = fArr[1];
                float f13 = fArr[2];
                float f14 = fArr[3];
                float f15 = fArr[4];
                float f16 = fArr[5];
                switch (c2) {
                    case 'A':
                    case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case com.spotify.metadata.classic.proto.Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case ContentType.LIVE /* 113 */:
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                        path2.close();
                        path2.moveTo(f15, f16);
                        f11 = f15;
                        f13 = f11;
                        f12 = f16;
                        f14 = f12;
                    default:
                        i = 2;
                        break;
                }
                float f17 = f15;
                float f18 = f16;
                float f19 = f11;
                float f20 = f12;
                int i4 = 0;
                while (i4 < fArr2.length) {
                    float[] fArr3 = fArr2;
                    if (c2 == 'A') {
                        i2 = i4;
                        vcn0Var = vcn0Var;
                        float f21 = f20;
                        i3 = i3;
                        int i5 = i2 + 5;
                        int i6 = i2 + 6;
                        vcn0.m85196c(path, f19, f21, fArr3[i5], fArr3[i6], fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                        f13 = fArr3[i5];
                        f = fArr3[i6];
                        f14 = f;
                        f2 = f13;
                    } else if (c2 == 'C') {
                        i2 = i4;
                        i3 = i3;
                        vcn0Var = vcn0Var;
                        int i7 = i2 + 2;
                        int i8 = i2 + 3;
                        int i9 = i2 + 4;
                        int i10 = i2 + 5;
                        path2.cubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i7], fArr3[i8], fArr3[i9], fArr3[i10]);
                        float f22 = fArr3[i9];
                        float f23 = fArr3[i10];
                        f13 = fArr3[i7];
                        f14 = fArr3[i8];
                        f = f23;
                        f2 = f22;
                    } else if (c2 == 'H') {
                        i2 = i4;
                        vcn0Var = vcn0Var;
                        f = f20;
                        i3 = i3;
                        path2.lineTo(fArr3[i2], f);
                        f2 = fArr3[i2];
                    } else if (c2 == 'Q') {
                        i2 = i4;
                        i3 = i3;
                        vcn0Var = vcn0Var;
                        int i11 = i2 + 1;
                        int i12 = i2 + 2;
                        int i13 = i2 + 3;
                        path2.quadTo(fArr3[i2], fArr3[i11], fArr3[i12], fArr3[i13]);
                        float f24 = fArr3[i2];
                        float f25 = fArr3[i11];
                        float f26 = fArr3[i12];
                        float f27 = fArr3[i13];
                        f13 = f24;
                        f14 = f25;
                        f2 = f26;
                        f = f27;
                    } else if (c2 == 'V') {
                        i2 = i4;
                        i3 = i3;
                        vcn0Var = vcn0Var;
                        f2 = f19;
                        path2.lineTo(f2, fArr3[i2]);
                        f = fArr3[i2];
                    } else if (c2 != 'a') {
                        if (c2 == 'c') {
                            i2 = i4;
                            int i14 = i2 + 2;
                            int i15 = i2 + 3;
                            int i16 = i2 + 4;
                            int i17 = i2 + 5;
                            path2.rCubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i14], fArr3[i15], fArr3[i16], fArr3[i17]);
                            float f28 = fArr3[i14] + f19;
                            float f29 = fArr3[i15] + f20;
                            f19 += fArr3[i16];
                            f20 += fArr3[i17];
                            f13 = f28;
                            f14 = f29;
                        } else if (c2 != 'h') {
                            if (c2 != 'q') {
                                if (c2 != 'v') {
                                    if (c2 == 'L') {
                                        i2 = i4;
                                        int i18 = i2 + 1;
                                        path2.lineTo(fArr3[i2], fArr3[i18]);
                                        f2 = fArr3[i2];
                                        f = fArr3[i18];
                                    } else if (c2 == 'M') {
                                        i2 = i4;
                                        f2 = fArr3[i2];
                                        f = fArr3[i2 + 1];
                                        if (i2 > 0) {
                                            path2.lineTo(f2, f);
                                        } else {
                                            path2.moveTo(f2, f);
                                            f17 = f2;
                                            f18 = f;
                                        }
                                    } else if (c2 == 'S') {
                                        i2 = i4;
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        float f30 = f19;
                                        float f31 = f20;
                                        int i19 = i2 + 1;
                                        int i20 = i2 + 2;
                                        int i21 = i2 + 3;
                                        path2.cubicTo(f30, f31, fArr3[i2], fArr3[i19], fArr3[i20], fArr3[i21]);
                                        f13 = fArr3[i2];
                                        f14 = fArr3[i19];
                                        f2 = fArr3[i20];
                                        f = fArr3[i21];
                                    } else if (c2 == 'T') {
                                        i2 = i4;
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i22 = i2 + 1;
                                        path2.quadTo(f19, f20, fArr3[i2], fArr3[i22]);
                                        f2 = fArr3[i2];
                                        f = fArr3[i22];
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c2 == 'l') {
                                        i2 = i4;
                                        int i23 = i2 + 1;
                                        path2.rLineTo(fArr3[i2], fArr3[i23]);
                                        f19 += fArr3[i2];
                                        f6 = fArr3[i23];
                                    } else if (c2 == 'm') {
                                        i2 = i4;
                                        float f32 = fArr3[i2];
                                        f19 += f32;
                                        float f33 = fArr3[i2 + 1];
                                        f20 += f33;
                                        if (i2 > 0) {
                                            path2.rLineTo(f32, f33);
                                        } else {
                                            path2.rMoveTo(f32, f33);
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c2 != 's') {
                                        if (c2 == 't') {
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f9 = f19 - f13;
                                                f10 = f20 - f14;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i24 = i4 + 1;
                                            path2.rQuadTo(f9, f10, fArr3[i4], fArr3[i24]);
                                            float f34 = f9 + f19;
                                            float f35 = f10 + f20;
                                            f19 += fArr3[i4];
                                            f20 += fArr3[i24];
                                            f14 = f35;
                                            f13 = f34;
                                        }
                                        i2 = i4;
                                        f2 = f19;
                                        f = f20;
                                    } else {
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i25 = i4;
                                        int i26 = i25 + 1;
                                        int i27 = i25 + 2;
                                        int i28 = i25 + 3;
                                        i2 = i25;
                                        path2.rCubicTo(f8, f7, fArr3[i25], fArr3[i26], fArr3[i27], fArr3[i28]);
                                        f3 = fArr3[i2] + f19;
                                        f4 = fArr3[i26] + f20;
                                        f19 += fArr3[i27];
                                        f5 = fArr3[i28];
                                    }
                                    vcn0Var = vcn0Var;
                                } else {
                                    i2 = i4;
                                    path2.rLineTo(0.0f, fArr3[i2]);
                                    f6 = fArr3[i2];
                                }
                                f20 += f6;
                            } else {
                                i2 = i4;
                                int i29 = i2 + 1;
                                int i30 = i2 + 2;
                                int i31 = i2 + 3;
                                path2.rQuadTo(fArr3[i2], fArr3[i29], fArr3[i30], fArr3[i31]);
                                f3 = fArr3[i2] + f19;
                                f4 = fArr3[i29] + f20;
                                f19 += fArr3[i30];
                                f5 = fArr3[i31];
                            }
                            f20 += f5;
                            f13 = f3;
                            f14 = f4;
                        } else {
                            i2 = i4;
                            path2.rLineTo(fArr3[i2], 0.0f);
                            f19 += fArr3[i2];
                        }
                        f2 = f19;
                        f = f20;
                    } else {
                        i2 = i4;
                        int i32 = i2 + 5;
                        float f36 = fArr3[i32] + f19;
                        int i33 = i2 + 6;
                        float f37 = fArr3[i33] + f20;
                        vcn0Var = vcn0Var;
                        float f38 = f19;
                        float f39 = f20;
                        i3 = i3;
                        vcn0.m85196c(path, f38, f39, f36, f37, fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                        f2 = f38 + fArr3[i32];
                        f = f39 + fArr3[i33];
                        f13 = f2;
                        f14 = f;
                    }
                    i4 = i2 + i;
                    path2 = path;
                    vcn0Var = vcn0Var;
                    c2 = c2;
                    i3 = i3;
                    f19 = f2;
                    f20 = f;
                    c = c2;
                    fArr2 = fArr3;
                }
                fArr[0] = f19;
                fArr[1] = f20;
                fArr[2] = f13;
                fArr[3] = f14;
                fArr[4] = f17;
                fArr[5] = f18;
                c = vcn0Var.f240168a;
                i3++;
                path2 = path;
            }
        }
    }

    public vcn0[] getPathData() {
        return this.f237110a;
    }

    public String getPathName() {
        return this.f237111b;
    }

    public void setPathData(vcn0[] vcn0VarArr) {
        if (!n0e1.m63429f(this.f237110a, vcn0VarArr)) {
            this.f237110a = n0e1.m63447x(vcn0VarArr);
            return;
        }
        vcn0[] vcn0VarArr2 = this.f237110a;
        for (int i = 0; i < vcn0VarArr.length; i++) {
            vcn0VarArr2[i].f240168a = vcn0VarArr[i].f240168a;
            int i2 = 0;
            while (true) {
                float[] fArr = vcn0VarArr[i].f240169b;
                if (i2 < fArr.length) {
                    vcn0VarArr2[i].f240169b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public v4b1(v4b1 v4b1Var) {
        this.f237110a = null;
        this.f237112c = 0;
        this.f237111b = v4b1Var.f237111b;
        this.f237110a = n0e1.m63447x(v4b1Var.f237110a);
    }
}
