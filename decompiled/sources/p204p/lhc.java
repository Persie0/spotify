package p204p;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class lhc extends shc {

    /* JADX INFO: renamed from: i */
    public final int f133478i;

    /* JADX INFO: renamed from: j */
    public final int f133479j;

    /* JADX INFO: renamed from: k */
    public final int f133480k;

    /* JADX INFO: renamed from: o */
    public List f133484o;

    /* JADX INFO: renamed from: p */
    public List f133485p;

    /* JADX INFO: renamed from: q */
    public int f133486q;

    /* JADX INFO: renamed from: r */
    public int f133487r;

    /* JADX INFO: renamed from: s */
    public boolean f133488s;

    /* JADX INFO: renamed from: t */
    public boolean f133489t;

    /* JADX INFO: renamed from: u */
    public byte f133490u;

    /* JADX INFO: renamed from: v */
    public byte f133491v;

    /* JADX INFO: renamed from: x */
    public boolean f133493x;

    /* JADX INFO: renamed from: y */
    public long f133494y;

    /* JADX INFO: renamed from: z */
    public static final int[] f133476z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A */
    public static final int[] f133469A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B */
    public static final int[] f133470B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C */
    public static final int[] f133471C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, Error.INVALID_COUNTRY_FIELD_NUMBER, Error.TOO_YOUNG_FIELD_NUMBER, 108, 109, 110, ContentType.SHORT_FORM_ON_DEMAND, ContentType.LONG_FORM_ON_DEMAND, ContentType.LIVE, 114, 115, 116, 117, 118, 119, 120, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D */
    public static final int[] f133472D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 226, AdvertisementType.BRANDED_AS_CONTENT, 238, 244, 251};

    /* JADX INFO: renamed from: E */
    public static final int[] f133473E = {193, 201, AdvertisementType.ON_DEMAND_PRE_ROLL, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, ContentType.BUMPER, 200, 202, 203, AdvertisementType.BRANDED_DURING_LIVE, 206, 207, 239, AdvertisementType.ON_DEMAND_MID_ROLL, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F */
    public static final int[] f133474F = {195, 227, 205, 204, 236, 210, 242, AdvertisementType.ON_DEMAND_POST_ROLL, 245, ContentType.USER_GENERATED_LIVE, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G */
    public static final boolean[] f133475G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h */
    public final l2n0 f133477h = new l2n0();

    /* JADX INFO: renamed from: m */
    public final ArrayList f133482m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public khc f133483n = new khc(0, 4);

    /* JADX INFO: renamed from: w */
    public int f133492w = 0;

    /* JADX INFO: renamed from: l */
    public final long f133481l = 16000000;

    public lhc(String str, int i) {
        this.f133478i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f133480k = 0;
            this.f133479j = 0;
        } else if (i == 2) {
            this.f133480k = 1;
            this.f133479j = 0;
        } else if (i == 3) {
            this.f133480k = 0;
            this.f133479j = 1;
        } else if (i != 4) {
            yif1.m93819w0("Invalid channel. Defaulting to CC1.");
            this.f133480k = 0;
            this.f133479j = 0;
        } else {
            this.f133480k = 1;
            this.f133479j = 1;
        }
        m58966l(0);
        m58965k();
        this.f133493x = true;
        this.f133494y = -9223372036854775807L;
    }

    @Override // p204p.shc
    /* JADX INFO: renamed from: f */
    public final uo80 mo58960f() {
        List list = this.f133484o;
        this.f133485p = list;
        list.getClass();
        return new uo80(list, false);
    }

    @Override // p204p.shc, p204p.gro
    public final void flush() {
        super.flush();
        this.f133484o = null;
        this.f133485p = null;
        m58966l(0);
        this.f133487r = 4;
        this.f133483n.f122606h = 4;
        m58965k();
        this.f133488s = false;
        this.f133489t = false;
        this.f133490u = (byte) 0;
        this.f133491v = (byte) 0;
        this.f133492w = 0;
        this.f133493x = true;
        this.f133494y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p204p.shc
    /* JADX INFO: renamed from: g */
    public final void mo58961g(qhc qhcVar) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = qhcVar.f105018d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        l2n0 l2n0Var = this.f133477h;
        l2n0Var.m57928P(bArrArray, iLimit);
        boolean z2 = false;
        while (true) {
            int iM57932a = l2n0Var.m57932a();
            int i5 = this.f133478i;
            if (iM57932a < i5) {
                if (z2) {
                    int i6 = this.f133486q;
                    if (i6 == 1 || i6 == 3) {
                        this.f133484o = m58964j();
                        this.f133494y = this.f209166e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM57917E = i5 == 2 ? -4 : l2n0Var.m57917E();
            int iM57917E2 = l2n0Var.m57917E();
            int iM57917E3 = l2n0Var.m57917E();
            if ((iM57917E & 2) == 0 && (iM57917E & 1) == this.f133479j) {
                byte b = (byte) (iM57917E2 & 127);
                byte b2 = (byte) (iM57917E3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.f133488s;
                    if ((iM57917E & 4) == 4) {
                        boolean[] zArr = f133475G;
                        if (zArr[iM57917E2] && zArr[iM57917E3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f133488s = z;
                    if (!z || (b & 240) != 16) {
                        this.f133489t = false;
                        if (!z) {
                            if (1 > b && b <= 15) {
                                this.f133493x = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.f133493x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f133493x = true;
                                            break;
                                    }
                                } else {
                                    this.f133493x = true;
                                }
                            }
                            if (this.f133493x) {
                                i = b & MessagePack.Code.NEGFIXINT_PREFIX;
                                if (i == 0) {
                                    this.f133492w = (b >> 3) & 1;
                                }
                                if (this.f133492w != this.f133480k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & MessagePack.Code.NEGFIXINT_PREFIX) == 32) {
                                                this.f133483n.m56422b();
                                                this.f133483n.m56421a((char) ((b & 1) == 0 ? f133473E[b2 & 31] : f133474F[b2 & 31]));
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.f133483n.m56421a(' ');
                                                boolean z4 = (b2 & 1) == 1;
                                                khc khcVar = this.f133483n;
                                                khcVar.f122599a.add(new jhc((b2 >> 1) & 7, z4, khcVar.f122601c.length()));
                                            } else if ((b & 240) != 16 && (b2 & MessagePack.Code.NIL) == 64) {
                                                int i7 = f133476z[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i7++;
                                                }
                                                khc khcVar2 = this.f133483n;
                                                if (i7 != khcVar2.f122602d) {
                                                    if (this.f133486q != 1 && !khcVar2.m56425e()) {
                                                        khc khcVar3 = new khc(this.f133486q, this.f133487r);
                                                        this.f133483n = khcVar3;
                                                        this.f133482m.add(khcVar3);
                                                    }
                                                    this.f133483n.f122602d = i7;
                                                }
                                                boolean z5 = (b2 & 16) == 16;
                                                boolean z6 = (b2 & 1) == 1;
                                                int i8 = (b2 >> 1) & 7;
                                                khc khcVar4 = this.f133483n;
                                                khcVar4.f122599a.add(new jhc(z5 ? 8 : i8, z6, khcVar4.f122601c.length()));
                                                if (z5) {
                                                    this.f133483n.f122603e = f133469A[i8];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.f133483n.f122604f = b2 + MessagePack.Code.NEGFIXINT_PREFIX;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    m58966l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            m58966l(1);
                                                            this.f133487r = 2;
                                                            this.f133483n.f122606h = 2;
                                                            break;
                                                        case 38:
                                                            m58966l(1);
                                                            this.f133487r = 3;
                                                            this.f133483n.f122606h = 3;
                                                            break;
                                                        case 39:
                                                            m58966l(1);
                                                            this.f133487r = 4;
                                                            this.f133483n.f122606h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f133486q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f133484o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1 || i4 == 3) {
                                                                                m58965k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1 && !this.f133483n.m56425e()) {
                                                                                khc khcVar5 = this.f133483n;
                                                                                arrayList = khcVar5.f122600b;
                                                                                arrayList.add(khcVar5.m56424d());
                                                                                khcVar5.f122601c.setLength(0);
                                                                                khcVar5.f122599a.clear();
                                                                                iMin = Math.min(khcVar5.f122606h, khcVar5.f122602d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m58965k();
                                                                            break;
                                                                        case 47:
                                                                            this.f133484o = m58964j();
                                                                            m58965k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f133483n.m56422b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m58966l(3);
                                                }
                                            }
                                        } else {
                                            this.f133483n.m56421a((char) f133472D[b2 & 15]);
                                        }
                                    } else {
                                        khc khcVar6 = this.f133483n;
                                        iArr = f133471C;
                                        khcVar6.m56421a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & MessagePack.Code.NEGFIXINT_PREFIX) != 0) {
                                            this.f133483n.m56421a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m58965k();
                            z2 = true;
                        }
                    } else if (this.f133489t && this.f133490u == b && this.f133491v == b2) {
                        this.f133489t = false;
                    } else {
                        this.f133489t = true;
                        this.f133490u = b;
                        this.f133491v = b2;
                        if (!z) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.f133493x = true;
                                    } else {
                                        this.f133493x = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b2 == 32) {
                                    this.f133493x = true;
                                } else {
                                    this.f133493x = true;
                                }
                            }
                            if (this.f133493x) {
                                i = b & MessagePack.Code.NEGFIXINT_PREFIX;
                                if (i == 0) {
                                    this.f133492w = (b >> 3) & 1;
                                }
                                if (this.f133492w != this.f133480k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17) {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m58966l(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m58966l(1);
                                                                            this.f133487r = 2;
                                                                            this.f133483n.f122606h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m58966l(1);
                                                                            this.f133487r = 3;
                                                                            this.f133483n.f122606h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m58966l(1);
                                                                            this.f133487r = 4;
                                                                            this.f133483n.f122606h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.f133486q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f133484o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m58965k();
                                                                                            } else {
                                                                                                m58965k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                khc khcVar7 = this.f133483n;
                                                                                                arrayList = khcVar7.f122600b;
                                                                                                arrayList.add(khcVar7.m56424d());
                                                                                                khcVar7.f122601c.setLength(0);
                                                                                                khcVar7.f122599a.clear();
                                                                                                iMin = Math.min(khcVar7.f122606h, khcVar7.f122602d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m58965k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f133484o = m58964j();
                                                                                            m58965k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f133483n.m56422b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m58966l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar8 = this.f133483n;
                                                                                            arrayList = khcVar8.f122600b;
                                                                                            arrayList.add(khcVar8.m56424d());
                                                                                            khcVar8.f122601c.setLength(0);
                                                                                            khcVar8.f122599a.clear();
                                                                                            iMin = Math.min(khcVar8.f122606h, khcVar8.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar9 = this.f133483n;
                                                                                            arrayList = khcVar9.f122600b;
                                                                                            arrayList.add(khcVar9.m56424d());
                                                                                            khcVar9.f122601c.setLength(0);
                                                                                            khcVar9.f122599a.clear();
                                                                                            iMin = Math.min(khcVar9.f122606h, khcVar9.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar10 = this.f133483n;
                                                                                        arrayList = khcVar10.f122600b;
                                                                                        arrayList.add(khcVar10.m56424d());
                                                                                        khcVar10.f122601c.setLength(0);
                                                                                        khcVar10.f122599a.clear();
                                                                                        iMin = Math.min(khcVar10.f122606h, khcVar10.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar11 = this.f133483n;
                                                                                            arrayList = khcVar11.f122600b;
                                                                                            arrayList.add(khcVar11.m56424d());
                                                                                            khcVar11.f122601c.setLength(0);
                                                                                            khcVar11.f122599a.clear();
                                                                                            iMin = Math.min(khcVar11.f122606h, khcVar11.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar12 = this.f133483n;
                                                                                        arrayList = khcVar12.f122600b;
                                                                                        arrayList.add(khcVar12.m56424d());
                                                                                        khcVar12.f122601c.setLength(0);
                                                                                        khcVar12.f122599a.clear();
                                                                                        iMin = Math.min(khcVar12.f122606h, khcVar12.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar13 = this.f133483n;
                                                                                        arrayList = khcVar13.f122600b;
                                                                                        arrayList.add(khcVar13.m56424d());
                                                                                        khcVar13.f122601c.setLength(0);
                                                                                        khcVar13.f122599a.clear();
                                                                                        iMin = Math.min(khcVar13.f122606h, khcVar13.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar14 = this.f133483n;
                                                                                    arrayList = khcVar14.f122600b;
                                                                                    arrayList.add(khcVar14.m56424d());
                                                                                    khcVar14.f122601c.setLength(0);
                                                                                    khcVar14.f122599a.clear();
                                                                                    iMin = Math.min(khcVar14.f122606h, khcVar14.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar15 = this.f133483n;
                                                                                            arrayList = khcVar15.f122600b;
                                                                                            arrayList.add(khcVar15.m56424d());
                                                                                            khcVar15.f122601c.setLength(0);
                                                                                            khcVar15.f122599a.clear();
                                                                                            iMin = Math.min(khcVar15.f122606h, khcVar15.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar16 = this.f133483n;
                                                                                        arrayList = khcVar16.f122600b;
                                                                                        arrayList.add(khcVar16.m56424d());
                                                                                        khcVar16.f122601c.setLength(0);
                                                                                        khcVar16.f122599a.clear();
                                                                                        iMin = Math.min(khcVar16.f122606h, khcVar16.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar17 = this.f133483n;
                                                                                        arrayList = khcVar17.f122600b;
                                                                                        arrayList.add(khcVar17.m56424d());
                                                                                        khcVar17.f122601c.setLength(0);
                                                                                        khcVar17.f122599a.clear();
                                                                                        iMin = Math.min(khcVar17.f122606h, khcVar17.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar18 = this.f133483n;
                                                                                    arrayList = khcVar18.f122600b;
                                                                                    arrayList.add(khcVar18.m56424d());
                                                                                    khcVar18.f122601c.setLength(0);
                                                                                    khcVar18.f122599a.clear();
                                                                                    iMin = Math.min(khcVar18.f122606h, khcVar18.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar19 = this.f133483n;
                                                                                        arrayList = khcVar19.f122600b;
                                                                                        arrayList.add(khcVar19.m56424d());
                                                                                        khcVar19.f122601c.setLength(0);
                                                                                        khcVar19.f122599a.clear();
                                                                                        iMin = Math.min(khcVar19.f122606h, khcVar19.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar110 = this.f133483n;
                                                                                    arrayList = khcVar110.f122600b;
                                                                                    arrayList.add(khcVar110.m56424d());
                                                                                    khcVar110.f122601c.setLength(0);
                                                                                    khcVar110.f122599a.clear();
                                                                                    iMin = Math.min(khcVar110.f122606h, khcVar110.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar111 = this.f133483n;
                                                                                    arrayList = khcVar111.f122600b;
                                                                                    arrayList.add(khcVar111.m56424d());
                                                                                    khcVar111.f122601c.setLength(0);
                                                                                    khcVar111.f122599a.clear();
                                                                                    iMin = Math.min(khcVar111.f122606h, khcVar111.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    m58966l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            m58966l(1);
                                                            this.f133487r = 2;
                                                            this.f133483n.f122606h = 2;
                                                            break;
                                                        case 38:
                                                            m58966l(1);
                                                            this.f133487r = 3;
                                                            this.f133483n.f122606h = 3;
                                                            break;
                                                        case 39:
                                                            m58966l(1);
                                                            this.f133487r = 4;
                                                            this.f133483n.f122606h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f133486q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f133484o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                m58965k();
                                                                            } else {
                                                                                m58965k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                khc khcVar112 = this.f133483n;
                                                                                arrayList = khcVar112.f122600b;
                                                                                arrayList.add(khcVar112.m56424d());
                                                                                khcVar112.f122601c.setLength(0);
                                                                                khcVar112.f122599a.clear();
                                                                                iMin = Math.min(khcVar112.f122606h, khcVar112.f122602d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m58965k();
                                                                            break;
                                                                        case 47:
                                                                            this.f133484o = m58964j();
                                                                            m58965k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f133483n.m56422b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m58966l(3);
                                                }
                                            }
                                        } else {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m58966l(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m58966l(1);
                                                                            this.f133487r = 2;
                                                                            this.f133483n.f122606h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m58966l(1);
                                                                            this.f133487r = 3;
                                                                            this.f133483n.f122606h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m58966l(1);
                                                                            this.f133487r = 4;
                                                                            this.f133483n.f122606h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.f133486q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f133484o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m58965k();
                                                                                            } else {
                                                                                                m58965k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                khc khcVar113 = this.f133483n;
                                                                                                arrayList = khcVar113.f122600b;
                                                                                                arrayList.add(khcVar113.m56424d());
                                                                                                khcVar113.f122601c.setLength(0);
                                                                                                khcVar113.f122599a.clear();
                                                                                                iMin = Math.min(khcVar113.f122606h, khcVar113.f122602d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m58965k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f133484o = m58964j();
                                                                                            m58965k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f133483n.m56422b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m58966l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar114 = this.f133483n;
                                                                                            arrayList = khcVar114.f122600b;
                                                                                            arrayList.add(khcVar114.m56424d());
                                                                                            khcVar114.f122601c.setLength(0);
                                                                                            khcVar114.f122599a.clear();
                                                                                            iMin = Math.min(khcVar114.f122606h, khcVar114.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar115 = this.f133483n;
                                                                                            arrayList = khcVar115.f122600b;
                                                                                            arrayList.add(khcVar115.m56424d());
                                                                                            khcVar115.f122601c.setLength(0);
                                                                                            khcVar115.f122599a.clear();
                                                                                            iMin = Math.min(khcVar115.f122606h, khcVar115.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar116 = this.f133483n;
                                                                                        arrayList = khcVar116.f122600b;
                                                                                        arrayList.add(khcVar116.m56424d());
                                                                                        khcVar116.f122601c.setLength(0);
                                                                                        khcVar116.f122599a.clear();
                                                                                        iMin = Math.min(khcVar116.f122606h, khcVar116.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar117 = this.f133483n;
                                                                                            arrayList = khcVar117.f122600b;
                                                                                            arrayList.add(khcVar117.m56424d());
                                                                                            khcVar117.f122601c.setLength(0);
                                                                                            khcVar117.f122599a.clear();
                                                                                            iMin = Math.min(khcVar117.f122606h, khcVar117.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar118 = this.f133483n;
                                                                                        arrayList = khcVar118.f122600b;
                                                                                        arrayList.add(khcVar118.m56424d());
                                                                                        khcVar118.f122601c.setLength(0);
                                                                                        khcVar118.f122599a.clear();
                                                                                        iMin = Math.min(khcVar118.f122606h, khcVar118.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar119 = this.f133483n;
                                                                                        arrayList = khcVar119.f122600b;
                                                                                        arrayList.add(khcVar119.m56424d());
                                                                                        khcVar119.f122601c.setLength(0);
                                                                                        khcVar119.f122599a.clear();
                                                                                        iMin = Math.min(khcVar119.f122606h, khcVar119.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar1110 = this.f133483n;
                                                                                    arrayList = khcVar1110.f122600b;
                                                                                    arrayList.add(khcVar1110.m56424d());
                                                                                    khcVar1110.f122601c.setLength(0);
                                                                                    khcVar1110.f122599a.clear();
                                                                                    iMin = Math.min(khcVar1110.f122606h, khcVar1110.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m58966l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m58966l(1);
                                                                        this.f133487r = 2;
                                                                        this.f133483n.f122606h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m58966l(1);
                                                                        this.f133487r = 3;
                                                                        this.f133483n.f122606h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m58966l(1);
                                                                        this.f133487r = 4;
                                                                        this.f133483n.f122606h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f133486q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f133484o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m58965k();
                                                                                        } else {
                                                                                            m58965k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            khc khcVar1111 = this.f133483n;
                                                                                            arrayList = khcVar1111.f122600b;
                                                                                            arrayList.add(khcVar1111.m56424d());
                                                                                            khcVar1111.f122601c.setLength(0);
                                                                                            khcVar1111.f122599a.clear();
                                                                                            iMin = Math.min(khcVar1111.f122606h, khcVar1111.f122602d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m58965k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f133484o = m58964j();
                                                                                        m58965k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f133483n.m56422b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m58966l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar1112 = this.f133483n;
                                                                                        arrayList = khcVar1112.f122600b;
                                                                                        arrayList.add(khcVar1112.m56424d());
                                                                                        khcVar1112.f122601c.setLength(0);
                                                                                        khcVar1112.f122599a.clear();
                                                                                        iMin = Math.min(khcVar1112.f122606h, khcVar1112.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar1113 = this.f133483n;
                                                                                        arrayList = khcVar1113.f122600b;
                                                                                        arrayList.add(khcVar1113.m56424d());
                                                                                        khcVar1113.f122601c.setLength(0);
                                                                                        khcVar1113.f122599a.clear();
                                                                                        iMin = Math.min(khcVar1113.f122606h, khcVar1113.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar1114 = this.f133483n;
                                                                                    arrayList = khcVar1114.f122600b;
                                                                                    arrayList.add(khcVar1114.m56424d());
                                                                                    khcVar1114.f122601c.setLength(0);
                                                                                    khcVar1114.f122599a.clear();
                                                                                    iMin = Math.min(khcVar1114.f122606h, khcVar1114.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m58966l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m58966l(1);
                                                                    this.f133487r = 2;
                                                                    this.f133483n.f122606h = 2;
                                                                    break;
                                                                case 38:
                                                                    m58966l(1);
                                                                    this.f133487r = 3;
                                                                    this.f133483n.f122606h = 3;
                                                                    break;
                                                                case 39:
                                                                    m58966l(1);
                                                                    this.f133487r = 4;
                                                                    this.f133483n.f122606h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f133486q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f133484o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m58965k();
                                                                                    } else {
                                                                                        m58965k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        khc khcVar1115 = this.f133483n;
                                                                                        arrayList = khcVar1115.f122600b;
                                                                                        arrayList.add(khcVar1115.m56424d());
                                                                                        khcVar1115.f122601c.setLength(0);
                                                                                        khcVar1115.f122599a.clear();
                                                                                        iMin = Math.min(khcVar1115.f122606h, khcVar1115.f122602d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m58965k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f133484o = m58964j();
                                                                                    m58965k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f133483n.m56422b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m58966l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar1116 = this.f133483n;
                                                                                    arrayList = khcVar1116.f122600b;
                                                                                    arrayList.add(khcVar1116.m56424d());
                                                                                    khcVar1116.f122601c.setLength(0);
                                                                                    khcVar1116.f122599a.clear();
                                                                                    iMin = Math.min(khcVar1116.f122606h, khcVar1116.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m58966l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m58966l(1);
                                                                this.f133487r = 2;
                                                                this.f133483n.f122606h = 2;
                                                                break;
                                                            case 38:
                                                                m58966l(1);
                                                                this.f133487r = 3;
                                                                this.f133483n.f122606h = 3;
                                                                break;
                                                            case 39:
                                                                m58966l(1);
                                                                this.f133487r = 4;
                                                                this.f133483n.f122606h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f133486q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f133484o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m58965k();
                                                                                } else {
                                                                                    m58965k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    khc khcVar1117 = this.f133483n;
                                                                                    arrayList = khcVar1117.f122600b;
                                                                                    arrayList.add(khcVar1117.m56424d());
                                                                                    khcVar1117.f122601c.setLength(0);
                                                                                    khcVar1117.f122599a.clear();
                                                                                    iMin = Math.min(khcVar1117.f122606h, khcVar1117.f122602d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m58965k();
                                                                                break;
                                                                            case 47:
                                                                                this.f133484o = m58964j();
                                                                                m58965k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f133483n.m56422b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m58966l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    m58966l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            m58966l(1);
                                                            this.f133487r = 2;
                                                            this.f133483n.f122606h = 2;
                                                            break;
                                                        case 38:
                                                            m58966l(1);
                                                            this.f133487r = 3;
                                                            this.f133483n.f122606h = 3;
                                                            break;
                                                        case 39:
                                                            m58966l(1);
                                                            this.f133487r = 4;
                                                            this.f133483n.f122606h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f133486q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f133484o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                m58965k();
                                                                            } else {
                                                                                m58965k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                khc khcVar1118 = this.f133483n;
                                                                                arrayList = khcVar1118.f122600b;
                                                                                arrayList.add(khcVar1118.m56424d());
                                                                                khcVar1118.f122601c.setLength(0);
                                                                                khcVar1118.f122599a.clear();
                                                                                iMin = Math.min(khcVar1118.f122606h, khcVar1118.f122602d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m58965k();
                                                                            break;
                                                                        case 47:
                                                                            this.f133484o = m58964j();
                                                                            m58965k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f133483n.m56422b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m58966l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        khc khcVar20 = this.f133483n;
                                        iArr = f133471C;
                                        khcVar20.m56421a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & MessagePack.Code.NEGFIXINT_PREFIX) != 0) {
                                            this.f133483n.m56421a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m58965k();
                            z2 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p204p.shc, p204p.gro
    /* JADX INFO: renamed from: h */
    public final rhc mo44272b() {
        rhc rhcVar;
        rhc rhcVarMo44272b = super.mo44272b();
        if (rhcVarMo44272b != null) {
            return rhcVarMo44272b;
        }
        long j = this.f133481l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.f133494y;
        if (j2 == -9223372036854775807L || this.f209166e - j2 < j || (rhcVar = (rhc) this.f209163b.pollFirst()) == null) {
            return null;
        }
        this.f133484o = Collections.EMPTY_LIST;
        this.f133494y = -9223372036854775807L;
        uo80 uo80VarMo58960f = mo58960f();
        long j3 = this.f209166e;
        rhcVar.f115242b = j3;
        rhcVar.f199186d = uo80VarMo58960f;
        rhcVar.f199187e = j3;
        return rhcVar;
    }

    @Override // p204p.shc
    /* JADX INFO: renamed from: i */
    public final boolean mo58963i() {
        return this.f133484o != this.f133485p;
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m58964j() {
        ArrayList arrayList = this.f133482m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            b0m b0mVarM56423c = ((khc) arrayList.get(i)).m56423c(Integer.MIN_VALUE);
            arrayList2.add(b0mVarM56423c);
            if (b0mVarM56423c != null) {
                iMin = Math.min(iMin, b0mVarM56423c.f21975i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            b0m b0mVarM56423c2 = (b0m) arrayList2.get(i2);
            if (b0mVarM56423c2 != null) {
                if (b0mVarM56423c2.f21975i != iMin) {
                    b0mVarM56423c2 = ((khc) arrayList.get(i2)).m56423c(iMin);
                    b0mVarM56423c2.getClass();
                }
                arrayList3.add(b0mVarM56423c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m58965k() {
        khc khcVar = this.f133483n;
        khcVar.f122605g = this.f133486q;
        khcVar.f122599a.clear();
        khcVar.f122600b.clear();
        khcVar.f122601c.setLength(0);
        khcVar.f122602d = 15;
        khcVar.f122603e = 0;
        khcVar.f122604f = 0;
        ArrayList arrayList = this.f133482m;
        arrayList.clear();
        arrayList.add(this.f133483n);
    }

    /* JADX INFO: renamed from: l */
    public final void m58966l(int i) {
        int i2 = this.f133486q;
        if (i2 == i) {
            return;
        }
        this.f133486q = i;
        if (i != 3) {
            m58965k();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f133484o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f133482m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((khc) arrayList.get(i3)).f122605g = i;
            i3++;
        }
    }

    @Override // p204p.shc, p204p.gro
    public final void release() {
    }
}
