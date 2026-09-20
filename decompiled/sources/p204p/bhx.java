package p204p;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class bhx {

    /* JADX INFO: renamed from: a */
    public final int f27254a;

    /* JADX INFO: renamed from: b */
    public final int f27255b;

    /* JADX INFO: renamed from: c */
    public final byte[] f27256c;

    public bhx(int i, byte[] bArr, int i2, int i3) {
        this.f27254a = i;
        this.f27255b = i2;
        this.f27256c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static bhx m29268a(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(ehx.f59719d0);
        return new bhx(2, bytes, bytes.length, 0);
    }

    /* JADX INFO: renamed from: b */
    public static bhx m29269b(long j, ByteOrder byteOrder) {
        return m29270c(new long[]{j}, byteOrder);
    }

    /* JADX INFO: renamed from: c */
    public static bhx m29270c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ehx.f59708S[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new bhx(4, byteBufferWrap.array(), jArr.length, 0);
    }

    /* JADX INFO: renamed from: d */
    public static bhx m29271d(dhx[] dhxVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ehx.f59708S[5] * dhxVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (dhx dhxVar : dhxVarArr) {
            byteBufferWrap.putInt((int) dhxVar.f49185a);
            byteBufferWrap.putInt((int) dhxVar.f49186b);
        }
        return new bhx(5, byteBufferWrap.array(), dhxVarArr.length, 0);
    }

    /* JADX INFO: renamed from: e */
    public static bhx m29272e(int i, ByteOrder byteOrder) {
        return m29273f(new int[]{i}, byteOrder);
    }

    /* JADX INFO: renamed from: f */
    public static bhx m29273f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ehx.f59708S[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new bhx(3, byteBufferWrap.array(), iArr.length, 0);
    }

    /* JADX INFO: renamed from: g */
    public final double m29274g(ByteOrder byteOrder) throws Throwable {
        Object objM29277j = m29277j(byteOrder);
        if (objM29277j == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM29277j instanceof String) {
            return Double.parseDouble((String) objM29277j);
        }
        if (objM29277j instanceof long[]) {
            long[] jArr = (long[]) objM29277j;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM29277j instanceof int[]) {
            int[] iArr = (int[]) objM29277j;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM29277j instanceof double[]) {
            double[] dArr = (double[]) objM29277j;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM29277j instanceof dhx[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        dhx[] dhxVarArr = (dhx[]) objM29277j;
        if (dhxVarArr.length == 1) {
            return dhxVarArr[0].m36060a();
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: h */
    public final int m29275h(ByteOrder byteOrder) {
        Object objM29277j = m29277j(byteOrder);
        if (objM29277j == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM29277j instanceof String) {
            return Integer.parseInt((String) objM29277j);
        }
        if (objM29277j instanceof long[]) {
            long[] jArr = (long[]) objM29277j;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM29277j instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM29277j;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: i */
    public final String m29276i(ByteOrder byteOrder) {
        Object objM29277j = m29277j(byteOrder);
        if (objM29277j == null) {
            return null;
        }
        if (objM29277j instanceof String) {
            return (String) objM29277j;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM29277j instanceof long[]) {
            long[] jArr = (long[]) objM29277j;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM29277j instanceof int[]) {
            int[] iArr = (int[]) objM29277j;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM29277j instanceof double[]) {
            double[] dArr = (double[]) objM29277j;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM29277j instanceof dhx[])) {
            return null;
        }
        dhx[] dhxVarArr = (dhx[]) objM29277j;
        while (i < dhxVarArr.length) {
            sb.append(dhxVarArr[i].f49185a);
            sb.append('/');
            sb.append(dhxVarArr[i].f49186b);
            i++;
            if (i != dhxVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, p.dhx[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.io.Serializable, p.dhx[]] */
    /* JADX WARN: Type inference failed for: r12v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: j */
    public final Serializable m29277j(ByteOrder byteOrder) throws Throwable {
        zgx zgxVar;
        byte b;
        byte[] bArr = this.f27256c;
        zgx zgxVar2 = null;
        try {
            zgxVar = new zgx(bArr);
            try {
                zgxVar.f282729b = byteOrder;
                int i = this.f27254a;
                int length = 0;
                int i2 = this.f27255b;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, ehx.f59719d0);
                            try {
                                zgxVar.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + 48)});
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= ehx.f59709T.length) {
                            int i3 = 0;
                            while (true) {
                                byte[] bArr2 = ehx.f59709T;
                                if (i3 >= bArr2.length) {
                                    length = bArr2.length;
                                } else if (bArr[i3] == bArr2[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        try {
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    String string = sb.toString();
                                    zgxVar.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            zgxVar.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r12 = new int[i2];
                        while (length < i2) {
                            r12[length] = zgxVar.readUnsignedShort();
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r12;
                    case 4:
                        ?? r13 = new long[i2];
                        while (length < i2) {
                            r13[length] = ((long) zgxVar.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r13;
                    case 5:
                        ?? r14 = new dhx[i2];
                        while (length < i2) {
                            r14[length] = new dhx(((long) zgxVar.readInt()) & 4294967295L, ((long) zgxVar.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r14;
                    case 8:
                        ?? r15 = new int[i2];
                        while (length < i2) {
                            r15[length] = zgxVar.readShort();
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r15;
                    case 9:
                        ?? r16 = new int[i2];
                        while (length < i2) {
                            r16[length] = zgxVar.readInt();
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r16;
                    case 10:
                        ?? r17 = new dhx[i2];
                        while (length < i2) {
                            r17[length] = new dhx(zgxVar.readInt(), zgxVar.readInt());
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r17;
                    case 11:
                        ?? r18 = new double[i2];
                        while (length < i2) {
                            r18[length] = zgxVar.readFloat();
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r18;
                    case 12:
                        ?? r19 = new double[i2];
                        while (length < i2) {
                            r19[length] = zgxVar.readDouble();
                            length++;
                        }
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r19;
                    default:
                        try {
                            zgxVar.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (zgxVar != null) {
                    try {
                        zgxVar.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                zgxVar2 = zgxVar;
                if (zgxVar2 != null) {
                    try {
                        zgxVar2.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            zgxVar = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(ehx.f59707R[this.f27254a]);
        sb.append(", data length:");
        return klh.m56832d(this.f27256c.length, ")", sb);
    }
}
