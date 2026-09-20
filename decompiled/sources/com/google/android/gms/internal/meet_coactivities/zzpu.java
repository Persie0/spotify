package com.google.android.gms.internal.meet_coactivities;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p204p.edb;
import p204p.klh;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpu implements Closeable {
    private final Reader zzb;
    private long zzh;
    private int zzi;
    private String zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private final char[] zzc = new char[1024];
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzps.zza = new zzpt();
    }

    public zzpu(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final int zzo(boolean z) throws IOException {
        int i = this.zzd;
        int i2 = this.zze;
        while (true) {
            if (i == i2) {
                this.zzd = i;
                if (!zzv(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(zzd()));
                    }
                    return -1;
                }
                i = this.zzd;
                i2 = this.zze;
            }
            int i3 = i + 1;
            char c = this.zzc[i];
            if (c == '\n') {
                this.zzf++;
                this.zzg = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.zzd = i3;
                        return c;
                    }
                    this.zzd = i3;
                    throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                }
                this.zzd = i3;
                if (i3 == i2) {
                    this.zzd = i;
                    boolean zZzv = zzv(2);
                    this.zzd++;
                    if (!zZzv) {
                        return 47;
                    }
                }
                throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
            }
            i = i3;
        }
    }

    private final zzpv zzp(String str) throws zzpv {
        throw new zzpv(klh.m56834f(str, zzd(), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    private final IllegalStateException zzq(String str) throws IOException {
        String str2;
        int iZzn = zzn();
        switch (zzn()) {
            case 1:
                str2 = "BEGIN_ARRAY";
                break;
            case 2:
                str2 = "END_ARRAY";
                break;
            case 3:
                str2 = "BEGIN_OBJECT";
                break;
            case 4:
                str2 = "END_OBJECT";
                break;
            case 5:
                str2 = "NAME";
                break;
            case 6:
                str2 = "STRING";
                break;
            case 7:
                str2 = "NUMBER";
                break;
            case 8:
                str2 = "BOOLEAN";
                break;
            case 9:
                str2 = "NULL";
                break;
            default:
                str2 = "END_DOCUMENT";
                break;
        }
        StringBuilder sbM38573v = edb.m38573v("Expected ", str, " but was ", str2, zzd());
        sbM38573v.append("\nSee ");
        sbM38573v.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iZzn == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sbM38573v.toString());
    }

    private final String zzr(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.zzl; i++) {
            int i2 = this.zzk[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.zzn[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(s571.m77246e(i2, "Unknown scope value: "));
            }
        }
        return sb.toString();
    }

    private final String zzs(char c) throws zzpv {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.zzd;
            int i3 = this.zze;
            int i4 = i2;
            while (true) {
                cArr = this.zzc;
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        int i6 = (i5 - i4) - 1;
                        this.zzd = i5;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    }
                    char c3 = '\n';
                    if (c2 == '\\') {
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        this.zzd = i5;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 + i7, 16));
                        }
                        sb.append(cArr, i4, i8);
                        if (this.zzd == this.zze && !zzv(1)) {
                            throw zzp("Unterminated escape sequence");
                        }
                        char[] cArr2 = this.zzc;
                        int i9 = this.zzd;
                        int i10 = i9 + 1;
                        this.zzd = i10;
                        char c4 = cArr2[i9];
                        if (c4 != '\n') {
                            if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                if (c4 == 'b') {
                                    c3 = '\b';
                                } else if (c4 == 'f') {
                                    c3 = '\f';
                                } else if (c4 != 'n') {
                                    if (c4 == 'r') {
                                        c3 = '\r';
                                    } else if (c4 == 't') {
                                        c3 = '\t';
                                    } else {
                                        if (c4 != 'u') {
                                            throw zzp("Invalid escape sequence");
                                        }
                                        if (i9 + 5 > this.zze && !zzv(4)) {
                                            throw zzp("Unterminated escape sequence");
                                        }
                                        int i11 = this.zzd;
                                        int i12 = i11 + 4;
                                        int i13 = 0;
                                        while (i11 < i12) {
                                            char[] cArr3 = this.zzc;
                                            int i14 = i13 << 4;
                                            char c5 = cArr3[i11];
                                            if (c5 >= '0' && c5 <= '9') {
                                                i = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i = c5 - 'W';
                                            } else {
                                                if (c5 < 'A' || c5 > 'F') {
                                                    throw zzp("Malformed Unicode escape \\u".concat(new String(cArr3, this.zzd, 4)));
                                                }
                                                i = c5 - '7';
                                            }
                                            i13 = i + i14;
                                            i11++;
                                        }
                                        this.zzd += 4;
                                        c3 = (char) i13;
                                    }
                                }
                            }
                            sb.append(c3);
                            i4 = this.zzd;
                            i3 = this.zze;
                            i2 = i4;
                        } else {
                            this.zzf++;
                            this.zzg = i10;
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.zzd;
                        i3 = this.zze;
                        i2 = i4;
                    } else {
                        if (c2 == '\n') {
                            this.zzf++;
                            this.zzg = i5;
                        }
                        i2 = i5;
                    }
                }
            }
            int i15 = i2 - i4;
            if (sb == null) {
                sb = new StringBuilder(Math.max(i15 + i15, 16));
            }
            sb.append(cArr, i4, i15);
            this.zzd = i2;
        } while (zzv(1));
        throw zzp("Unterminated string");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    private final String zzt() throws zzpv {
        String string;
        int i = 0;
        StringBuilder sb = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.zzd + i2;
                if (i3 < this.zze) {
                    char c = this.zzc[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                    }
                    i = i2;
                } else if (i2 >= 1024) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.zzc, this.zzd, i2);
                    this.zzd += i2;
                } else if (!zzv(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(this.zzc, this.zzd, i);
                } else {
                    sb.append(this.zzc, this.zzd, i);
                    string = sb.toString();
                }
                this.zzd += i;
                return string;
            }
        } while (zzv(1));
        if (sb == null) {
            string = new String(this.zzc, this.zzd, i);
        } else {
            sb.append(this.zzc, this.zzd, i);
            string = sb.toString();
        }
        this.zzd += i;
        return string;
    }

    private final void zzu(int i) {
        int i2 = this.zzl;
        int[] iArr = this.zzk;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.zzk = Arrays.copyOf(iArr, i3);
            this.zzn = Arrays.copyOf(this.zzn, i3);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i3);
        }
        int[] iArr2 = this.zzk;
        int i4 = this.zzl;
        this.zzl = i4 + 1;
        iArr2[i4] = i;
    }

    private final boolean zzv(int i) throws IOException {
        int i2;
        int i3 = this.zzg;
        int i4 = this.zzd;
        this.zzg = i3 - i4;
        char[] cArr = this.zzc;
        int i5 = this.zze;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.zze = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.zze = 0;
        }
        this.zzd = 0;
        do {
            Reader reader = this.zzb;
            int i7 = this.zze;
            int i8 = reader.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.zze + i8;
            this.zze = i2;
            if (this.zzf == 0 && this.zzg == 0 && i2 > 0 && cArr[0] == 65279) {
                this.zzd++;
                this.zzg = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean zzw(char c) throws zzpv {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzpu".concat(zzd());
    }

    public final double zza() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb == 15) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i = this.zzl - 1;
            iArr[i] = iArr[i] + 1;
            return this.zzh;
        }
        if (iZzb == 16) {
            char[] cArr = this.zzc;
            int i2 = this.zzd;
            int i3 = this.zzi;
            this.zzj = new String(cArr, i2, i3);
            this.zzd = i2 + i3;
        } else if (iZzb == 8 || iZzb == 9) {
            this.zzj = zzs(iZzb == 8 ? '\'' : '\"');
        } else if (iZzb == 10) {
            this.zzj = zzt();
        } else if (iZzb != 11) {
            throw zzq("a double");
        }
        this.zza = 11;
        double d = Double.parseDouble(this.zzj);
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw zzp("JSON forbids NaN and infinities: " + d);
        }
        this.zzj = null;
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i4 = this.zzl - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return d;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:0x0155  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3 A[DONT_INVERT, PHI: r8
      0x01e3: PHI (r8v19 char) = (r8v9 char), (r8v20 char) binds: [B:140:0x01ba, B:146:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x0204  */
    /* JADX WARN: Code duplicated, block: B:173:0x0209  */
    /* JADX WARN: Code duplicated, block: B:176:0x020e  */
    /* JADX WARN: Code duplicated, block: B:181:0x021e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:182:0x021f  */
    /* JADX WARN: Code duplicated, block: B:184:0x022b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0232  */
    /* JADX WARN: Code duplicated, block: B:188:0x0237 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:236:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0145  */
    /* JADX WARN: Code duplicated, block: B:99:0x0149 A[PHI: r2 r4
      0x0149: PHI (r2v22 int) = (r2v21 int), (r2v27 int) binds: [B:91:0x0132, B:98:0x0145] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r4v6 int) = (r4v5 int), (r4v9 int) binds: [B:91:0x0132, B:98:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d0, code lost:
    
        if (r3 == false) goto L154;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb() throws IOException {
        int iZzo;
        int i;
        String str;
        String str2;
        int i2;
        char c;
        char[] cArr;
        int i3;
        int i4;
        boolean z;
        char c2;
        int i5;
        boolean z2;
        long j;
        char c3;
        int i6;
        int i7;
        boolean z3;
        int[] iArr = this.zzk;
        int i8 = this.zzl - 1;
        int i9 = iArr[i8];
        int i10 = 3;
        boolean z4 = true;
        if (i9 != 1) {
            if (i9 == 2) {
                int iZzo2 = zzo(true);
                if (iZzo2 != 44) {
                    if (iZzo2 == 59) {
                        throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                    }
                    if (iZzo2 != 93) {
                        throw zzp("Unterminated array");
                    }
                    i10 = 4;
                }
            } else if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 != 5 || (iZzo = zzo(true)) == 44) {
                    int iZzo3 = zzo(true);
                    if (iZzo3 == 34) {
                        i10 = 13;
                    } else {
                        if (iZzo3 == 39) {
                            throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                        }
                        if (iZzo3 != 125) {
                            throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                        }
                        if (i9 == 5) {
                            throw zzp("Expected name");
                        }
                    }
                } else {
                    if (iZzo == 59) {
                        throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                    }
                    if (iZzo != 125) {
                        throw zzp("Unterminated object");
                    }
                }
                i10 = 2;
            } else if (i9 == 4) {
                iArr[i8] = 5;
                int iZzo4 = zzo(true);
                if (iZzo4 != 58) {
                    if (iZzo4 != 61) {
                        throw zzp("Expected ':'");
                    }
                    throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                }
            } else if (i9 == 6) {
                iArr[i8] = 7;
            } else if (i9 == 7) {
                if (zzo(false) != -1) {
                    throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                }
                i10 = 17;
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.zza = i10;
            return i10;
        }
        iArr[i8] = 2;
        int iZzo5 = zzo(true);
        if (iZzo5 != 34) {
            if (iZzo5 == 39) {
                throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
            }
            if (iZzo5 == 44 || iZzo5 == 59) {
                i = 1;
            } else if (iZzo5 != 91) {
                if (iZzo5 == 93) {
                    i = 1;
                    if (i9 == 1) {
                        i10 = 4;
                    }
                } else {
                    if (iZzo5 != 123) {
                        int i11 = this.zzd - 1;
                        this.zzd = i11;
                        char c4 = this.zzc[i11];
                        if (c4 == 't' || c4 == 'T') {
                            str = "TRUE";
                            str2 = "true";
                            i2 = 5;
                        } else {
                            if (c4 != 'f' && c4 != 'F') {
                                if (c4 != 'n' && c4 != 'N') {
                                    i2 = 0;
                                    break;
                                }
                                str = "NULL";
                                str2 = "null";
                                i2 = 7;
                                if (i2 == 0) {
                                    return i2;
                                }
                                cArr = this.zzc;
                                i3 = this.zzd;
                                i4 = this.zze;
                                z = true;
                                c2 = 0;
                                i5 = 0;
                                z2 = false;
                                j = 0;
                                while (true) {
                                    if (i3 + i5 != i4) {
                                        c3 = cArr[i3 + i5];
                                        if (c3 != '+') {
                                            if (c3 != 'E' || c3 == 'e') {
                                                i6 = i4;
                                                if (c2 != 2 || c2 == 4) {
                                                    c2 = 5;
                                                    i5++;
                                                    i4 = i6;
                                                    z4 = true;
                                                }
                                            } else if (c3 == '-') {
                                                i6 = i4;
                                                if (c2 == 0) {
                                                    c2 = 1;
                                                    z2 = true;
                                                } else {
                                                    if (c2 != 5) {
                                                    }
                                                    c2 = 6;
                                                }
                                                i5++;
                                                i4 = i6;
                                                z4 = true;
                                            } else if (c3 == '.') {
                                                i6 = i4;
                                                if (c2 == 2) {
                                                    c2 = 3;
                                                    i5++;
                                                    i4 = i6;
                                                    z4 = true;
                                                }
                                            } else if (c3 >= '0' && c3 <= '9') {
                                                if (c2 == z4 || c2 == 0) {
                                                    i6 = i4;
                                                    j = -(c3 - '0');
                                                    c2 = 2;
                                                } else if (c2 != 2) {
                                                    i6 = i4;
                                                    if (c2 == 3) {
                                                        c2 = 4;
                                                    } else if (c2 == 5 || c2 == 6) {
                                                        c2 = 7;
                                                    }
                                                    i5++;
                                                    i4 = i6;
                                                    z4 = true;
                                                } else if (j != 0) {
                                                    i6 = i4;
                                                    long j2 = (10 * j) - ((long) (c3 - '0'));
                                                    z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                    j = j2;
                                                }
                                                i5++;
                                                i4 = i6;
                                                z4 = true;
                                            } else if (!zzw(c3)) {
                                                if (c2 == 2) {
                                                    if (z) {
                                                        if (j != Long.MIN_VALUE) {
                                                            z3 = z2;
                                                        } else if (z2) {
                                                            z3 = true;
                                                        }
                                                        if (j != 0) {
                                                            if (!z3) {
                                                            }
                                                            this.zzh = j;
                                                            this.zzd += i5;
                                                            i7 = 15;
                                                        }
                                                        j = -j;
                                                        this.zzh = j;
                                                        this.zzd += i5;
                                                        i7 = 15;
                                                    }
                                                    c2 = 2;
                                                    if (c2 != 2) {
                                                    }
                                                    this.zzi = i5;
                                                    i7 = 16;
                                                } else if (c2 != 2 || c2 == 4 || c2 == 7) {
                                                    this.zzi = i5;
                                                    i7 = 16;
                                                }
                                                this.zza = i7;
                                            }
                                            if (i7 != 0) {
                                                return i7;
                                            }
                                            if (zzw(this.zzc[this.zzd])) {
                                                throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                            }
                                            throw zzp("Expected value");
                                        }
                                        i6 = i4;
                                        if (c2 != 5) {
                                        }
                                        c2 = 6;
                                        i5++;
                                        i4 = i6;
                                        z4 = true;
                                    } else if (i5 != 1024) {
                                        if (!zzv(i5 + 1)) {
                                            i3 = this.zzd;
                                            i4 = this.zze;
                                            c3 = cArr[i3 + i5];
                                            if (c3 != '+') {
                                                if (c3 != 'E') {
                                                    i6 = i4;
                                                    if (c2 != 2) {
                                                    }
                                                    c2 = 5;
                                                    i5++;
                                                    i4 = i6;
                                                    z4 = true;
                                                } else {
                                                    i6 = i4;
                                                    if (c2 != 2) {
                                                    }
                                                    c2 = 5;
                                                    i5++;
                                                    i4 = i6;
                                                    z4 = true;
                                                }
                                                if (i7 != 0) {
                                                    return i7;
                                                }
                                                if (zzw(this.zzc[this.zzd])) {
                                                    throw zzp("Expected value");
                                                }
                                                throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                            }
                                            i6 = i4;
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                            i5++;
                                            i4 = i6;
                                            z4 = true;
                                        }
                                        if (c2 == 2) {
                                            if (c2 != 2) {
                                            }
                                            this.zzi = i5;
                                            i7 = 16;
                                        } else {
                                            if (z) {
                                                if (j != Long.MIN_VALUE) {
                                                    z3 = z2;
                                                } else if (z2) {
                                                    z3 = true;
                                                }
                                                if (j != 0) {
                                                    if (!z3) {
                                                    }
                                                    this.zzh = j;
                                                    this.zzd += i5;
                                                    i7 = 15;
                                                }
                                                j = -j;
                                                this.zzh = j;
                                                this.zzd += i5;
                                                i7 = 15;
                                            }
                                            c2 = 2;
                                            if (c2 != 2) {
                                            }
                                            this.zzi = i5;
                                            i7 = 16;
                                        }
                                        this.zza = i7;
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (zzw(this.zzc[this.zzd])) {
                                            throw zzp("Expected value");
                                        }
                                        throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                    }
                                    i7 = 0;
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (zzw(this.zzc[this.zzd])) {
                                        throw zzp("Expected value");
                                    }
                                    throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                }
                            }
                            str = "FALSE";
                            str2 = "false";
                            i2 = 6;
                        }
                        int i12 = 0;
                        while (true) {
                            int length = str2.length();
                            if (i12 >= length) {
                                if ((this.zzd + length >= this.zze && !zzv(length + 1)) || !zzw(this.zzc[this.zzd + length])) {
                                    this.zzd += length;
                                    this.zza = i2;
                                    break;
                                }
                                break;
                            }
                            if ((this.zzd + i12 < this.zze || zzv(i12 + 1)) && ((c = this.zzc[this.zzd + i12]) == str2.charAt(i12) || c == str.charAt(i12))) {
                                i12++;
                            }
                            i2 = 0;
                            break;
                        }
                        if (i2 == 0) {
                            return i2;
                        }
                        cArr = this.zzc;
                        i3 = this.zzd;
                        i4 = this.zze;
                        z = true;
                        c2 = 0;
                        i5 = 0;
                        z2 = false;
                        j = 0;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c3 = cArr[i3 + i5];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        i6 = i4;
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i5++;
                                        i4 = i6;
                                        z4 = true;
                                    } else {
                                        i6 = i4;
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i5++;
                                        i4 = i6;
                                        z4 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (zzw(this.zzc[this.zzd])) {
                                        throw zzp("Expected value");
                                    }
                                    throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                }
                                i6 = i4;
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i5++;
                                i4 = i6;
                                z4 = true;
                            } else if (i5 != 1024) {
                                if (!zzv(i5 + 1)) {
                                    i3 = this.zzd;
                                    i4 = this.zze;
                                    c3 = cArr[i3 + i5];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            i6 = i4;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            i4 = i6;
                                            z4 = true;
                                        } else {
                                            i6 = i4;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            i4 = i6;
                                            z4 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (zzw(this.zzc[this.zzd])) {
                                            throw zzp("Expected value");
                                        }
                                        throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                    }
                                    i6 = i4;
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i5++;
                                    i4 = i6;
                                    z4 = true;
                                }
                                if (c2 == 2) {
                                    if (c2 != 2) {
                                    }
                                    this.zzi = i5;
                                    i7 = 16;
                                } else {
                                    if (z) {
                                        if (j != Long.MIN_VALUE) {
                                            z3 = z2;
                                        } else if (z2) {
                                            z3 = true;
                                        }
                                        if (j != 0) {
                                            if (!z3) {
                                            }
                                            this.zzh = j;
                                            this.zzd += i5;
                                            i7 = 15;
                                        }
                                        j = -j;
                                        this.zzh = j;
                                        this.zzd += i5;
                                        i7 = 15;
                                    }
                                    c2 = 2;
                                    if (c2 != 2) {
                                    }
                                    this.zzi = i5;
                                    i7 = 16;
                                }
                                this.zza = i7;
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (zzw(this.zzc[this.zzd])) {
                                    throw zzp("Expected value");
                                }
                                throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (zzw(this.zzc[this.zzd])) {
                                throw zzp("Expected value");
                            }
                            throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                        }
                    }
                    i10 = 1;
                }
            }
            if (i9 == i || i9 == 2) {
                throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
            }
            throw zzp("Unexpected value");
        }
        i10 = 9;
        this.zza = i10;
        return i10;
    }

    public final String zzc() {
        return zzr(false);
    }

    public final String zzd() {
        int i = this.zzf + 1;
        int i2 = this.zzd - this.zzg;
        String strZzr = zzr(false);
        StringBuilder sbM56838j = klh.m56838j(i, " at line ", " column ");
        sbM56838j.append(i2 + 1);
        sbM56838j.append(" path ");
        sbM56838j.append(strZzr);
        return sbM56838j.toString();
    }

    public final String zze() throws IOException {
        String strZzs;
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb == 14) {
            strZzs = zzt();
        } else if (iZzb == 12) {
            strZzs = zzs('\'');
        } else {
            if (iZzb != 13) {
                throw zzq("a name");
            }
            strZzs = zzs('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = strZzs;
        return strZzs;
    }

    public final String zzf() throws IOException {
        String string;
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb == 10) {
            string = zzt();
        } else if (iZzb == 8) {
            string = zzs('\'');
        } else if (iZzb == 9) {
            string = zzs('\"');
        } else if (iZzb == 11) {
            string = this.zzj;
            this.zzj = null;
        } else if (iZzb == 15) {
            string = Long.toString(this.zzh);
        } else {
            if (iZzb != 16) {
                throw zzq("a string");
            }
            String str = new String(this.zzc, this.zzd, this.zzi);
            this.zzd += this.zzi;
            string = str;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i = this.zzl - 1;
        iArr[i] = iArr[i] + 1;
        return string;
    }

    public final void zzg() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb != 3) {
            throw zzq("BEGIN_ARRAY");
        }
        zzu(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzh() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb != 1) {
            throw zzq("BEGIN_OBJECT");
        }
        zzu(3);
        this.zza = 0;
    }

    public final void zzi() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb != 4) {
            throw zzq("END_ARRAY");
        }
        int i = this.zzl;
        this.zzl = i - 1;
        int[] iArr = this.zzn;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.zza = 0;
    }

    public final void zzj() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb != 2) {
            throw zzq("END_OBJECT");
        }
        int i = this.zzl;
        int i2 = i - 1;
        this.zzl = i2;
        this.zzm[i2] = null;
        int[] iArr = this.zzn;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzk() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb != 7) {
            throw zzq("null");
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i = this.zzl - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final boolean zzl() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        return (iZzb == 2 || iZzb == 4 || iZzb == 17) ? false : true;
    }

    public final boolean zzm() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        if (iZzb == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i = this.zzl - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iZzb != 6) {
            throw zzq("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i2 = this.zzl - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final int zzn() throws IOException {
        int iZzb = this.zza;
        if (iZzb == 0) {
            iZzb = zzb();
        }
        switch (iZzb) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
