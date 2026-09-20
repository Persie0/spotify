package p204p;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class ig30 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final Logger f101871d = Logger.getLogger(uf30.class.getName());

    /* JADX INFO: renamed from: a */
    public final gqa f101872a;

    /* JADX INFO: renamed from: b */
    public final hg30 f101873b;

    /* JADX INFO: renamed from: c */
    public final ad30 f101874c;

    public ig30(vuu0 vuu0Var) {
        this.f101872a = vuu0Var;
        hg30 hg30Var = new hg30(vuu0Var);
        this.f101873b = hg30Var;
        this.f101874c = new ad30(hg30Var);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m50466a(boolean z, eg30 eg30Var) throws Exception {
        int i;
        int i2;
        Object[] array;
        int i3 = 0;
        try {
            this.f101872a.mo45414A0(9L);
            int iM24353n = a0f1.m24353n(this.f101872a);
            if (iM24353n > 16384) {
                throw new IOException(s571.m77246e(iM24353n, "FRAME_SIZE_ERROR: "));
            }
            int i4 = this.f101872a.readByte() & 255;
            byte b = this.f101872a.readByte();
            int i5 = b & 255;
            int i6 = this.f101872a.readInt();
            int i7 = Integer.MAX_VALUE & i6;
            if (i4 != 8) {
                Logger logger = f101871d;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(uf30.m82949b(true, i7, iM24353n, i4, i5));
                }
            }
            if (z && i4 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + uf30.m82948a(i4));
            }
            switch (i4) {
                case 0:
                    m50467c(eg30Var, iM24353n, i5, i7);
                    return true;
                case 1:
                    m50469f(eg30Var, iM24353n, i5, i7);
                    return true;
                case 2:
                    if (iM24353n != 5) {
                        throw new IOException(edb.m38563l("TYPE_PRIORITY length: ", iM24353n, " != 5"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    gqa gqaVar = this.f101872a;
                    gqaVar.readInt();
                    gqaVar.readByte();
                    return true;
                case 3:
                    if (iM24353n != 4) {
                        throw new IOException(edb.m38563l("TYPE_RST_STREAM length: ", iM24353n, " != 4"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i8 = this.f101872a.readInt();
                    int[] iArrM38551G = edb.m38551G(14);
                    int length = iArrM38551G.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            i = iArrM38551G[i9];
                            if (edb.m38547C(i) != i8) {
                                i9++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(s571.m77246e(i8, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    fg30 fg30Var = (fg30) eg30Var.f59207c;
                    if (i7 != 0 && (i6 & 1) == 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        kv61.m57439c(fg30Var.f69210i, fg30Var.f69204c + '[' + i7 + "] onReset", 0L, new yf30(fg30Var, i7, i), 6);
                        return true;
                    }
                    mg30 mg30VarM41566e = fg30Var.m41566e(i7);
                    if (mg30VarM41566e != null) {
                        synchronized (mg30VarM41566e) {
                            if (mg30VarM41566e.m61684f() == 0) {
                                mg30VarM41566e.f143291Y = i;
                                mg30VarM41566e.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case 4:
                    gqa gqaVar2 = this.f101872a;
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) != 0) {
                        if (iM24353n != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iM24353n % 6 != 0) {
                        throw new IOException(s571.m77246e(iM24353n, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    x601 x601Var = new x601();
                    z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, iM24353n), 6);
                    int i10 = z350VarM63411S.f278778a;
                    int i11 = z350VarM63411S.f278779b;
                    int i12 = z350VarM63411S.f278780c;
                    if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                        while (true) {
                            short s = gqaVar2.readShort();
                            byte[] bArr = a0f1.f11072a;
                            int i13 = s & 65535;
                            int i14 = gqaVar2.readInt();
                            if (i13 != 2) {
                                if (i13 != 4) {
                                    if (i13 == 5 && (i14 < 16384 || i14 > 16777215)) {
                                        throw new IOException(s571.m77246e(i14, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    }
                                } else if (i14 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (i14 != 0 && i14 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            x601Var.m90053b(i13, i14);
                            if (i10 != i11) {
                                i10 += i12;
                            }
                        }
                    }
                    fg30 fg30Var2 = (fg30) eg30Var.f59207c;
                    kv61.m57439c(fg30Var2.f69209h, dq60.m36616p(fg30Var2.f69204c, " applyAndAckSettings", new StringBuilder()), 0L, new C2570xf(16, eg30Var, x601Var), 6);
                    return true;
                case 5:
                    m50470g(eg30Var, iM24353n, i5, i7);
                    return true;
                case 6:
                    if (iM24353n != 8) {
                        throw new IOException(s571.m77246e(iM24353n, "TYPE_PING length != 8: "));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i15 = this.f101872a.readInt();
                    int i16 = this.f101872a.readInt();
                    if (((b & 1) != 0 ? 1 : 0) == 0) {
                        kv61.m57439c(((fg30) eg30Var.f59207c).f69209h, dq60.m36616p(((fg30) eg30Var.f59207c).f69204c, " ping", new StringBuilder()), 0L, new vf30((fg30) eg30Var.f59207c, i15, i16, 1), 6);
                        return true;
                    }
                    fg30 fg30Var3 = (fg30) eg30Var.f59207c;
                    synchronized (fg30Var3) {
                        try {
                            if (i15 == 1) {
                                fg30Var3.f69201Z++;
                            } else if (i15 == 2) {
                                fg30Var3.f69187M0++;
                            } else if (i15 == 3) {
                                fg30Var3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iM24353n < 8) {
                        throw new IOException(s571.m77246e(iM24353n, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i17 = this.f101872a.readInt();
                    int i18 = this.f101872a.readInt();
                    int i19 = iM24353n - 8;
                    int[] iArrM38551G2 = edb.m38551G(14);
                    int length2 = iArrM38551G2.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length2) {
                            i2 = iArrM38551G2[i20];
                            if (edb.m38547C(i2) != i18) {
                                i20++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(s571.m77246e(i18, "TYPE_GOAWAY unexpected error code: "));
                    }
                    iva ivaVarMo45417J0 = iva.f106177d;
                    if (i19 > 0) {
                        ivaVarMo45417J0 = this.f101872a.mo45417J0(i19);
                    }
                    ivaVarMo45417J0.mo51747d();
                    fg30 fg30Var4 = (fg30) eg30Var.f59207c;
                    synchronized (fg30Var4) {
                        array = fg30Var4.f69203b.values().toArray(new mg30[0]);
                        fg30Var4.f69207f = true;
                    }
                    mg30[] mg30VarArr = (mg30[]) array;
                    int length3 = mg30VarArr.length;
                    while (i3 < length3) {
                        mg30 mg30Var = mg30VarArr[i3];
                        if (mg30Var.f143293a > i17 && mg30Var.m61685g()) {
                            synchronized (mg30Var) {
                                if (mg30Var.m61684f() == 0) {
                                    mg30Var.f143291Y = 8;
                                    mg30Var.notifyAll();
                                }
                                break;
                            }
                            ((fg30) eg30Var.f59207c).m41566e(mg30Var.f143293a);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    try {
                        if (iM24353n != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM24353n);
                        }
                        long j = 2147483647L & ((long) this.f101872a.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f101871d;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(uf30.m82950c(i7, iM24353n, j, true));
                        }
                        if (i7 == 0) {
                            fg30 fg30Var5 = (fg30) eg30Var.f59207c;
                            synchronized (fg30Var5) {
                                fg30Var5.f69194T0 += j;
                                fg30Var5.notifyAll();
                            }
                            return true;
                        }
                        mg30 mg30VarM41565c = ((fg30) eg30Var.f59207c).m41565c(i7);
                        if (mg30VarM41565c != null) {
                            synchronized (mg30VarM41565c) {
                                mg30VarM41565c.f143297e += j;
                                if (j > 0) {
                                    mg30VarM41565c.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        f101871d.fine(uf30.m82949b(true, i7, iM24353n, 8, i5));
                        throw e;
                    }
                default:
                    this.f101872a.skip(iM24353n);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m50467c(eg30 eg30Var, int i, int i2, final int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte b = this.f101872a.readByte();
            byte[] bArr = a0f1.f11072a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        final int iM85637s = vie1.m85637s(i, i2, i4);
        gqa gqaVar = this.f101872a;
        final fg30 fg30Var = (fg30) eg30Var.f59207c;
        if (i3 == 0 || (i3 & 1) != 0) {
            mg30 mg30VarM41565c = fg30Var.m41565c(i3);
            if (mg30VarM41565c == null) {
                ((fg30) eg30Var.f59207c).m41570i(i3, 2);
                long j = iM85637s;
                ((fg30) eg30Var.f59207c).m41568g(j);
                gqaVar.skip(j);
            } else {
                TimeZone timeZone = c0f1.f32774a;
                kg30 kg30Var = mg30VarM41565c.f143300h;
                long j2 = iM85637s;
                kg30Var.getClass();
                long j3 = j2;
                while (true) {
                    if (j3 <= 0) {
                        z = z4;
                        mg30 mg30Var = kg30Var.f122292f;
                        TimeZone timeZone2 = c0f1.f32774a;
                        mg30Var.f143294b.m41568g(j2);
                        kg30Var.f122292f.f143294b.f69189O0.getClass();
                        break;
                    }
                    synchronized (kg30Var.f122292f) {
                        z2 = kg30Var.f122288b;
                        z = z4;
                        z3 = kg30Var.f122290d.f156904b + j3 > kg30Var.f122287a;
                    }
                    if (z3) {
                        gqaVar.skip(j3);
                        kg30Var.f122292f.m61683e(4);
                        break;
                    }
                    if (z2) {
                        gqaVar.skip(j3);
                        break;
                    }
                    long jMo27348g1 = gqaVar.mo27348g1(kg30Var.f122289c, j3);
                    if (jMo27348g1 == -1) {
                        throw new EOFException();
                    }
                    j3 -= jMo27348g1;
                    mg30 mg30Var2 = kg30Var.f122292f;
                    synchronized (mg30Var2) {
                        try {
                            if (kg30Var.f122291e) {
                                kg30Var.f122289c.m65306c();
                            } else {
                                npa npaVar = kg30Var.f122290d;
                                boolean z5 = npaVar.f156904b == 0;
                                npaVar.mo42404H(kg30Var.f122289c);
                                if (z5) {
                                    mg30Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z4 = z;
                }
                if (z) {
                    mg30VarM41565c.m61687i(sn20.f210780b, true);
                }
            }
        } else {
            final npa npaVar2 = new npa();
            long j4 = iM85637s;
            gqaVar.mo45414A0(j4);
            gqaVar.mo27348g1(npaVar2, j4);
            kv61.m57439c(fg30Var.f69210i, fg30Var.f69204c + '[' + i3 + "] onData", 0L, new eh00(i3, npaVar2, iM85637s, z4) { // from class: p.wf30

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f250691b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ npa f250692c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f250693d;

                @Override // p204p.eh00
                public final Object invoke() {
                    fg30 fg30Var2 = this.f250690a;
                    int i5 = this.f250691b;
                    npa npaVar3 = this.f250692c;
                    int i6 = this.f250693d;
                    try {
                        fg30Var2.f69198X.getClass();
                        npaVar3.skip(i6);
                        fg30Var2.f69196V0.m64375i(i5, 9);
                        synchronized (fg30Var2) {
                            fg30Var2.f69199X0.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return w2a1.f247311a;
                }
            }, 6);
        }
        this.f101872a.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f101872a.close();
    }

    /* JADX INFO: renamed from: e */
    public final List m50468e(int i, int i2, int i3, int i4) throws IOException {
        hg30 hg30Var = this.f101873b;
        hg30Var.f91012e = i;
        hg30Var.f91009b = i;
        hg30Var.f91013f = i2;
        hg30Var.f91010c = i3;
        hg30Var.f91011d = i4;
        ad30 ad30Var = this.f101874c;
        vuu0 vuu0Var = ad30Var.f14506c;
        ArrayList arrayList = ad30Var.f14505b;
        while (!vuu0Var.mo45420R0()) {
            byte b = vuu0Var.readByte();
            byte[] bArr = a0f1.f11072a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iM25516e = ad30Var.m25516e(i5, 127);
                int i6 = iM25516e - 1;
                if (i6 >= 0) {
                    we20[] we20VarArr = cd30.f36723a;
                    if (i6 <= we20VarArr.length - 1) {
                        arrayList.add(we20VarArr[i6]);
                    }
                }
                int length = ad30Var.f14508e + 1 + (i6 - cd30.f36723a.length);
                if (length >= 0) {
                    we20[] we20VarArr2 = ad30Var.f14507d;
                    if (length < we20VarArr2.length) {
                        we20 we20Var = we20VarArr2[length];
                        wj50.m88279p(we20Var);
                        arrayList.add(we20Var);
                    }
                }
                throw new IOException(s571.m77246e(iM25516e, "Header index too large "));
            }
            if (i5 == 64) {
                we20[] we20VarArr3 = cd30.f36723a;
                iva ivaVarM25515d = ad30Var.m25515d();
                cd30.m32340a(ivaVarM25515d);
                ad30Var.m25514c(new we20(ivaVarM25515d, ad30Var.m25515d()));
            } else if ((b & 64) == 64) {
                ad30Var.m25514c(new we20(ad30Var.m25513b(ad30Var.m25516e(i5, 63) - 1), ad30Var.m25515d()));
            } else if ((b & 32) == 32) {
                int iM25516e2 = ad30Var.m25516e(i5, 31);
                ad30Var.f14504a = iM25516e2;
                if (iM25516e2 < 0 || iM25516e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + ad30Var.f14504a);
                }
                int i7 = ad30Var.f14510g;
                if (iM25516e2 < i7) {
                    if (iM25516e2 == 0) {
                        bk5.m29581D0(ad30Var.f14507d, null);
                        ad30Var.f14508e = ad30Var.f14507d.length - 1;
                        ad30Var.f14509f = 0;
                        ad30Var.f14510g = 0;
                    } else {
                        ad30Var.m25512a(i7 - iM25516e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                we20[] we20VarArr4 = cd30.f36723a;
                iva ivaVarM25515d2 = ad30Var.m25515d();
                cd30.m32340a(ivaVarM25515d2);
                arrayList.add(new we20(ivaVarM25515d2, ad30Var.m25515d()));
            } else {
                arrayList.add(new we20(ad30Var.m25513b(ad30Var.m25516e(i5, 15) - 1), ad30Var.m25515d()));
            }
        }
        List listM43728j1 = g6f.m43728j1(arrayList);
        arrayList.clear();
        return listM43728j1;
    }

    /* JADX INFO: renamed from: f */
    public final void m50469f(eg30 eg30Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i5 = 0;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f101872a.readByte();
            byte[] bArr = a0f1.f11072a;
            i5 = b & 255;
        }
        if ((i2 & 32) != 0) {
            gqa gqaVar = this.f101872a;
            gqaVar.readInt();
            gqaVar.readByte();
            byte[] bArr2 = a0f1.f11072a;
            i4 = i - 5;
        } else {
            i4 = i;
        }
        List listM50468e = m50468e(vie1.m85637s(i4, i2, i5), i5, i2, i3);
        fg30 fg30Var = (fg30) eg30Var.f59207c;
        if (i3 != 0 && (i3 & 1) == 0) {
            kv61.m57439c(fg30Var.f69210i, fg30Var.f69204c + '[' + i3 + "] onHeaders", 0L, new xf30(fg30Var, i3, listM50468e, z), 6);
            return;
        }
        synchronized (fg30Var) {
            mg30 mg30VarM41565c = fg30Var.m41565c(i3);
            if (mg30VarM41565c != null) {
                mg30VarM41565c.m61687i(c0f1.m31137h(listM50468e), z);
                return;
            }
            if (fg30Var.f69207f) {
                return;
            }
            if (i3 <= fg30Var.f69205d) {
                return;
            }
            if (i3 % 2 == fg30Var.f69206e % 2) {
                return;
            }
            mg30 mg30Var = new mg30(i3, fg30Var, false, z, c0f1.m31137h(listM50468e));
            fg30Var.f69205d = i3;
            fg30Var.f69203b.put(Integer.valueOf(i3), mg30Var);
            kv61.m57439c(fg30Var.f69208g.m60068d(), fg30Var.f69204c + '[' + i3 + "] onStream", 0L, new C2570xf(15, fg30Var, mg30Var), 6);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m50470g(eg30 eg30Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.f101872a.readByte();
            byte[] bArr = a0f1.f11072a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.f101872a.readInt() & Alert.DURATION_SHOW_INDEFINITELY;
        List listM50468e = m50468e(vie1.m85637s(i - 4, i2, i4), i4, i2, i3);
        fg30 fg30Var = (fg30) eg30Var.f59207c;
        synchronized (fg30Var) {
            if (fg30Var.f69199X0.contains(Integer.valueOf(i5))) {
                fg30Var.m41570i(i5, 2);
                return;
            }
            fg30Var.f69199X0.add(Integer.valueOf(i5));
            kv61.m57439c(fg30Var.f69210i, fg30Var.f69204c + '[' + i5 + "] onRequest", 0L, new xf30(fg30Var, i5, listM50468e), 6);
        }
    }
}
