package p204p;

import android.graphics.Path;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes2.dex */
public final class ajp0 implements vd50, fz61 {
    /* JADX INFO: renamed from: a */
    public static Path m26171a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static boolean m26172b(int i, byte[] bArr, int i2) {
        int iM89451a;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iM89451a = 0;
            break;
        }
        while (true) {
            if (i >= i2) {
                iM89451a = 0;
                break;
            }
            int i3 = i + 1;
            iM89451a = bArr[i];
            if (iM89451a < 0) {
                if (iM89451a >= -32) {
                    if (iM89451a >= -16) {
                        if (i3 < i2 - 2) {
                            int i4 = i + 2;
                            int i5 = bArr[i3];
                            if (i5 <= -65) {
                                if ((((i5 + ContentType.LONG_FORM_ON_DEMAND) + (iM89451a << 28)) >> 30) == 0) {
                                    int i6 = i + 3;
                                    if (bArr[i4] <= -65) {
                                        i += 4;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                            }
                            iM89451a = -1;
                            break;
                        }
                        iM89451a = wzf1.m89451a(bArr, i3, i2);
                        break;
                    }
                    if (i3 < i2 - 1) {
                        int i7 = i + 2;
                        char c = bArr[i3];
                        if (c <= -65 && ((iM89451a != -32 || c >= -96) && (iM89451a != -19 || c < -96))) {
                            i += 3;
                            if (bArr[i7] > -65) {
                            }
                        }
                        iM89451a = -1;
                        break;
                    }
                    iM89451a = wzf1.m89451a(bArr, i3, i2);
                    break;
                }
                if (i3 < i2) {
                    if (iM89451a >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iM89451a = -1;
                    break;
                }
                break;
            }
            i = i3;
        }
        return iM89451a == 0;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        ntx ntxVarM65644b = ntx.m65644b(i);
        return ntxVarM65644b == null ? ntx.UNRECOGNIZED : ntxVarM65644b;
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        return (gze1) bz61Var.mo26518k(this);
    }
}
