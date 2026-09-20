package p204p;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class r4p {

    /* JADX INFO: renamed from: a */
    public final MediaCodec.BufferInfo f195815a;

    /* JADX INFO: renamed from: b */
    public final MediaFormat f195816b;

    /* JADX INFO: renamed from: c */
    public final r300 f195817c;

    /* JADX INFO: renamed from: d */
    public final MediaCodec f195818d;

    /* JADX INFO: renamed from: e */
    public final Surface f195819e;

    /* JADX INFO: renamed from: f */
    public final int f195820f;

    /* JADX INFO: renamed from: g */
    public final boolean f195821g;

    /* JADX INFO: renamed from: h */
    public final boolean f195822h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f195823i;

    /* JADX INFO: renamed from: j */
    public r300 f195824j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f195825k;

    /* JADX INFO: renamed from: l */
    public int f195826l;

    /* JADX INFO: renamed from: m */
    public int f195827m;

    /* JADX INFO: renamed from: n */
    public boolean f195828n;

    /* JADX INFO: renamed from: o */
    public boolean f195829o;

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:16:0x004a, B:18:0x0059, B:20:0x005f, B:23:0x0068, B:28:0x0074, B:29:0x0078), top: B:63:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Multi-variable type inference failed */
    public r4p(Context context, r300 r300Var, MediaFormat mediaFormat, String str, boolean z, Surface surface) throws ExportException {
        int i;
        boolean z2;
        Object[] objArr;
        Surface surfaceCreateInputSurface;
        MediaCodec mediaCodecCreateByCodecName;
        this.f195817c = r300Var;
        this.f195816b = mediaFormat;
        this.f195821g = z;
        String str2 = r300Var.f195387p;
        str2.getClass();
        boolean zM35798o = def0.m35798o(str2);
        this.f195822h = zM35798o;
        this.f195815a = new MediaCodec.BufferInfo();
        this.f195826l = -1;
        this.f195827m = -1;
        this.f195823i = new AtomicBoolean();
        LinkedHashMap linkedHashMap = qpo.f191349a;
        try {
            try {
                synchronized (qpo.class) {
                    synchronized (qpo.class) {
                    }
                    i = Build.VERSION.SDK_INT;
                    z2 = false;
                    if (i >= 31 || lzj.m60327E(mediaFormat, "color-transfer-request", 0) != 3) {
                        objArr = false;
                    } else {
                        objArr = true;
                    }
                    surfaceCreateInputSurface = null;
                    mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                    Trace.beginSection("configureCodec");
                    mediaCodecCreateByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                    Trace.endSection();
                    if (objArr != false) {
                        MediaFormat inputFormat = mediaCodecCreateByCodecName.getInputFormat();
                        if (i >= 31 && lzj.m60327E(inputFormat, "color-transfer-request", 0) == 3) {
                            z2 = true;
                        }
                        c95.m31844j(z2, "Tone-mapping requested but not supported by the decoder.");
                    }
                    if (zM35798o && !z) {
                        surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                    }
                    Trace.beginSection("startCodec");
                    mediaCodecCreateByCodecName.start();
                    Trace.endSection();
                    this.f195818d = mediaCodecCreateByCodecName;
                    this.f195819e = surfaceCreateInputSurface;
                    this.f195820f = h0b1.m46289Q(context) ? 1 : 5;
                    return;
                }
                Trace.beginSection("configureCodec");
                mediaCodecCreateByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                Trace.endSection();
                if (objArr != false) {
                    MediaFormat inputFormat2 = mediaCodecCreateByCodecName.getInputFormat();
                    if (i >= 31) {
                        z2 = true;
                    }
                    c95.m31844j(z2, "Tone-mapping requested but not supported by the decoder.");
                }
                if (zM35798o) {
                    surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                }
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                this.f195818d = mediaCodecCreateByCodecName;
                this.f195819e = surfaceCreateInputSurface;
                this.f195820f = h0b1.m46289Q(context) ? 1 : 5;
                return;
            } catch (Exception e) {
                e = e;
                yif1.m93804p(e, "MediaCodec error");
                if (surfaceCreateInputSurface != null) {
                    surfaceCreateInputSurface.release();
                }
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw ExportException.m870c(e, ((e instanceof IOException) || (e instanceof MediaCodec.CodecException)) ? z ? 3001 : 4001 : e instanceof IllegalArgumentException ? z ? 3003 : 4003 : 1001, new via(mediaFormat.toString(), this.f195822h, str, z));
            }
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        }
        i = Build.VERSION.SDK_INT;
        z2 = false;
        if (i >= 31) {
            objArr = false;
        } else {
            objArr = false;
        }
        surfaceCreateInputSurface = null;
    }

    /* JADX INFO: renamed from: a */
    public static r300 m74762a(MediaFormat mediaFormat, boolean z, j6f0 j6f0Var) {
        String string;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        p300 p300Var = new p300();
        p300Var.f173527o = def0.m35799p(mediaFormat.getString("mime"));
        p300Var.f173516d = mediaFormat.getString("language");
        p300Var.f173522j = lzj.m60327E(mediaFormat, "max-bitrate", -1);
        p300Var.f173521i = lzj.m60327E(mediaFormat, "bitrate", -1);
        if (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("profile");
            byte[] bArr2 = mwe.f147772a;
            if (integer == 1) {
                i5 = 0;
            } else if (integer == 2) {
                i5 = 1;
            } else if (integer == 4) {
                i5 = 2;
            } else if (integer == 8) {
                i5 = 3;
            } else if (integer == 16) {
                i5 = 4;
            } else if (integer == 32) {
                i5 = 5;
            } else if (integer == 64) {
                i5 = 6;
            } else if (integer != 128) {
                i5 = integer != 256 ? -1 : 8;
            } else {
                i5 = 7;
            }
            int integer2 = mediaFormat.getInteger("level");
            if (integer2 == 1) {
                i6 = 10;
            } else if (integer2 == 2) {
                i6 = 20;
            } else if (integer2 == 4) {
                i6 = 30;
            } else if (integer2 == 8) {
                i6 = 40;
            } else if (integer2 == 16) {
                i6 = 45;
            } else if (integer2 == 32) {
                i6 = 50;
            } else if (integer2 != 64) {
                i6 = integer2 != 128 ? -1 : 70;
            } else {
                i6 = 60;
            }
            String str = h0b1.f86200a;
            Locale locale = Locale.US;
            string = s571.m77247f(i5, "s263.", i6, ".");
        } else if (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile")) {
            int iM60327E = lzj.m60327E(mediaFormat, "level", -1);
            if (iM60327E == -1) {
                int iM60327E2 = lzj.m60327E(mediaFormat, "width", -1);
                int iM60327E3 = lzj.m60327E(mediaFormat, "height", -1);
                float fM60324B = lzj.m60324B(mediaFormat);
                byte[] bArr3 = mwe.f147772a;
                int iMax = Math.max(iM60327E2, iM60327E3);
                c95.m31855u(iMax <= 7680);
                float f = iM60327E2 * iM60327E3 * fM60324B;
                if (iMax <= 1280) {
                    i3 = f <= 2.21184E7f ? 1 : 2;
                } else if (iMax <= 1920 && f <= 4.97664E7f) {
                    i3 = 4;
                } else if (iMax <= 2560 && f <= 6.2208E7f) {
                    i3 = 8;
                } else if (iMax <= 3840) {
                    if (f <= 1.24416E8f) {
                        i3 = 16;
                    } else if (f <= 1.990656E8f) {
                        i3 = 32;
                    } else if (f <= 2.48832E8f) {
                        i3 = 64;
                    } else if (f <= 3.981312E8f) {
                        i3 = 128;
                    } else {
                        i3 = f <= 4.97664E8f ? 256 : 512;
                    }
                } else if (iMax <= 7680) {
                    i3 = f <= 9.95328E8f ? 1024 : 2048;
                } else {
                    i3 = -1;
                }
                iM60327E = i3;
            }
            int integer3 = mediaFormat.getInteger("profile");
            byte[] bArr4 = mwe.f147772a;
            if (integer3 == 1) {
                i = 0;
            } else if (integer3 == 2) {
                i = 1;
            } else if (integer3 == 4) {
                i = 2;
            } else if (integer3 == 8) {
                i = 3;
            } else if (integer3 == 16) {
                i = 4;
            } else if (integer3 == 32) {
                i = 5;
            } else if (integer3 == 64) {
                i = 6;
            } else if (integer3 == 128) {
                i = 7;
            } else if (integer3 == 256) {
                i = 8;
            } else if (integer3 == 512) {
                i = 9;
            } else {
                if (integer3 != 1024) {
                    throw new IllegalArgumentException(s571.m77246e(integer3, "Unknown Dolby Vision profile: "));
                }
                i = 10;
            }
            if (iM60327E == 1) {
                i2 = 1;
            } else if (iM60327E != 2) {
                switch (iM60327E) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case 64:
                        i2 = 7;
                        break;
                    case 128:
                        i2 = 8;
                        break;
                    case 256:
                        i2 = 9;
                        break;
                    case 512:
                        i2 = 10;
                        break;
                    case 1024:
                        i2 = 11;
                        break;
                    case 2048:
                        i2 = 12;
                        break;
                    case 4096:
                        i2 = 13;
                        break;
                    default:
                        throw new IllegalArgumentException(s571.m77246e(iM60327E, "Unknown Dolby Vision level: "));
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = h0b1.f86200a;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = h0b1.f86200a;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = h0b1.f86200a;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.getString("codecs-string");
        }
        p300Var.f173523k = string;
        p300Var.m68976c(lzj.m60324B(mediaFormat));
        p300Var.f173534v = lzj.m60327E(mediaFormat, "width", -1);
        p300Var.f173535w = lzj.m60327E(mediaFormat, "height", -1);
        p300Var.f173497D = (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f;
        p300Var.f173528p = lzj.m60327E(mediaFormat, "max-input-size", -1);
        int i7 = 0;
        p300Var.f173495B = lzj.m60327E(mediaFormat, "rotation-degrees", 0);
        int iM60327E4 = lzj.m60327E(mediaFormat, "color-standard", -1);
        int iM60327E5 = lzj.m60327E(mediaFormat, "color-range", -1);
        int iM60327E6 = lzj.m60327E(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            byte[] bArr5 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr5);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        if (iM60327E4 == 2 || iM60327E4 == 1 || iM60327E4 == 6) {
            i4 = -1;
        } else {
            i4 = -1;
            if (iM60327E4 != -1) {
                iM60327E4 = -1;
            }
        }
        if (iM60327E5 != 2 && iM60327E5 != 1 && iM60327E5 != i4) {
            iM60327E5 = i4;
        }
        if (iM60327E6 != 1 && iM60327E6 != 3 && iM60327E6 != 2 && iM60327E6 != 6 && iM60327E6 != 7 && iM60327E6 != i4) {
            iM60327E6 = i4;
        }
        p300Var.f173500G = (iM60327E4 == i4 && iM60327E5 == i4 && iM60327E6 == i4 && bArr == null) ? null : new p7f(iM60327E4, iM60327E5, iM60327E6, bArr, -1, -1);
        p300Var.f173504K = lzj.m60327E(mediaFormat, "sample-rate", -1);
        int iM60327E7 = lzj.m60327E(mediaFormat, "exo-pcm-encoding-int", -1);
        if (iM60327E7 == -1) {
            iM60327E7 = lzj.m60327E(mediaFormat, "pcm-encoding", -1);
        }
        p300Var.f173505L = iM60327E7;
        int iM60327E8 = lzj.m60327E(mediaFormat, "channel-count", -1);
        int iM60327E9 = lzj.m60327E(mediaFormat, "channel-mask", -1);
        if (iM60327E8 != -1 && iM60327E9 != -1 && Integer.bitCount(iM60327E9) != iM60327E8) {
            iM60327E9 = -1;
        }
        p300Var.f173502I = iM60327E8;
        p300Var.f173503J = iM60327E9;
        ddg1.m35736g(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i8 = 0;
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i7);
            if (byteBuffer2 == null) {
                p300Var.f173530r = pf40.m69787l(i8, objArrCopyOf);
                if (mediaFormat.containsKey("track-id")) {
                    p300Var.f173513a = Integer.toString(mediaFormat.getInteger("track-id"));
                }
                r300 r300Var = new r300(p300Var);
                p300 p300VarM74564a = r300Var.m74564a();
                p300VarM74564a.f173524l = j6f0Var;
                if (z && r300Var.f195363M == -1 && Objects.equals(r300Var.f195387p, "audio/raw")) {
                    p300VarM74564a.f173505L = 2;
                }
                return new r300(p300VarM74564a);
            }
            byte[] bArr6 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr6);
            byteBuffer2.rewind();
            int i9 = i8 + 1;
            int iM32617b = cf40.m32617b(objArrCopyOf.length, i9);
            if (iM32617b > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM32617b);
            }
            objArrCopyOf[i8] = bArr6;
            i7++;
            i8 = i9;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ExportException m74763b(RuntimeException runtimeException) {
        boolean z = this.f195821g;
        return ExportException.m870c(runtimeException, z ? 3002 : 4002, new via(this.f195816b.toString(), this.f195822h, m74764c(), z));
    }

    /* JADX INFO: renamed from: c */
    public final String m74764c() {
        int i = Build.VERSION.SDK_INT;
        MediaCodec mediaCodec = this.f195818d;
        return i >= 29 ? lzj.m60385u(mediaCodec) : mediaCodec.getName();
    }

    /* JADX INFO: renamed from: d */
    public final ByteBuffer m74765d() {
        if (!m74768g(true)) {
            return null;
        }
        long j = this.f195815a.presentationTimeUs;
        LinkedHashMap linkedHashMap = qpo.f191349a;
        synchronized (qpo.class) {
            synchronized (qpo.class) {
            }
            return this.f195825k;
        }
        return this.f195825k;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m74766e() {
        return this.f195829o && this.f195827m == -1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m74767f(iro iroVar) throws ExportException {
        MediaCodec mediaCodec = this.f195818d;
        if (this.f195828n) {
            return false;
        }
        if (this.f195826l < 0) {
            try {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                this.f195826l = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    iroVar.f105018d = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    iroVar.mo51465g();
                } catch (RuntimeException e) {
                    yif1.m93804p(e, "MediaCodec error");
                    throw m74763b(e);
                }
            } catch (RuntimeException e2) {
                yif1.m93804p(e2, "MediaCodec error");
                throw m74763b(e2);
            }
        }
        iroVar.f105018d.getClass();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX INFO: renamed from: g */
    public final boolean m74768g(boolean z) throws ExportException {
        boolean z2 = this.f195821g;
        r300 r300Var = this.f195817c;
        MediaCodec mediaCodec = this.f195818d;
        MediaCodec.BufferInfo bufferInfo = this.f195815a;
        if (this.f195827m < 0) {
            if (!this.f195829o) {
                try {
                    int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                    this.f195827m = iDequeueOutputBuffer;
                    if (iDequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.f195829o = true;
                            LinkedHashMap linkedHashMap = qpo.f191349a;
                            synchronized (qpo.class) {
                                synchronized (qpo.class) {
                                }
                                if (bufferInfo.size == 0) {
                                    m74771j();
                                    return false;
                                }
                                bufferInfo.flags &= -5;
                            }
                            if (bufferInfo.size == 0) {
                                m74771j();
                                return false;
                            }
                            bufferInfo.flags &= -5;
                        }
                        if ((bufferInfo.flags & 2) != 0) {
                            m74771j();
                            return false;
                        }
                        if (z) {
                            try {
                                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(this.f195827m);
                                outputBuffer.getClass();
                                this.f195825k = outputBuffer;
                                outputBuffer.position(bufferInfo.offset);
                                this.f195825k.limit(bufferInfo.offset + bufferInfo.size);
                                return true;
                            } catch (RuntimeException e) {
                                yif1.m93804p(e, "MediaCodec error");
                                throw m74763b(e);
                            }
                        }
                    } else if (iDequeueOutputBuffer == -2) {
                        this.f195824j = m74762a(mediaCodec.getOutputFormat(), z2, r300Var.f195384m);
                        if (z2) {
                            if (Objects.equals(r300Var.f195387p, "audio/raw")) {
                                p300 p300VarM74564a = this.f195824j.m74564a();
                                p300VarM74564a.f173502I = r300Var.f195360J;
                                p300VarM74564a.f173505L = r300Var.f195363M;
                                this.f195824j = new r300(p300VarM74564a);
                            }
                        } else if (this.f195822h) {
                            this.f195823i.set(true);
                        } else if (Objects.equals(m74764c(), "c2.android.aac.encoder")) {
                            p300 p300VarM74564a2 = this.f195824j.m74564a();
                            p300VarM74564a2.f173506M = 1600;
                            this.f195824j = new r300(p300VarM74564a2);
                        }
                        long j = bufferInfo.presentationTimeUs;
                        LinkedHashMap linkedHashMap2 = qpo.f191349a;
                        synchronized (qpo.class) {
                            synchronized (qpo.class) {
                            }
                            return false;
                        }
                        return false;
                    }
                } catch (RuntimeException e2) {
                    yif1.m93804p(e2, "MediaCodec error");
                    throw m74763b(e2);
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067 A[Catch: all -> 0x0072, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {, blocks: (B:35:0x0066, B:36:0x0067), top: B:49:0x0066 }] */
    /* JADX INFO: renamed from: h */
    public final void m74769h(iro iroVar) throws ExportException {
        int iPosition;
        int iRemaining;
        ByteBuffer byteBuffer;
        boolean z = true;
        c95.m31856v(!this.f195828n, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer2 = iroVar.f105018d;
        int i = 0;
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = iroVar.f105018d.position();
            iRemaining = iroVar.f105018d.remaining();
        }
        long j = iroVar.f105020f;
        int i2 = 4;
        try {
            if (iroVar.m67519d(4)) {
                this.f195828n = true;
                LinkedHashMap linkedHashMap = qpo.f191349a;
                synchronized (qpo.class) {
                    synchronized (qpo.class) {
                    }
                    if (this.f195821g) {
                        byteBuffer = iroVar.f105018d;
                        if (byteBuffer != null && byteBuffer.hasRemaining()) {
                            z = false;
                        }
                        c95.m31855u(z);
                        j = 0;
                        iRemaining = 0;
                    }
                    this.f195818d.queueInputBuffer(this.f195826l, i, iRemaining, j, i2);
                    LinkedHashMap linkedHashMap2 = qpo.f191349a;
                    synchronized (qpo.class) {
                        synchronized (qpo.class) {
                        }
                        this.f195826l = -1;
                        iroVar.f105018d = null;
                        return;
                    }
                    this.f195826l = -1;
                    iroVar.f105018d = null;
                    return;
                }
                if (this.f195821g) {
                    byteBuffer = iroVar.f105018d;
                    if (byteBuffer != null) {
                        z = false;
                    }
                    c95.m31855u(z);
                    j = 0;
                    iRemaining = 0;
                }
                this.f195818d.queueInputBuffer(this.f195826l, i, iRemaining, j, i2);
                LinkedHashMap linkedHashMap3 = qpo.f191349a;
                synchronized (qpo.class) {
                    synchronized (qpo.class) {
                        this.f195826l = -1;
                        iroVar.f105018d = null;
                        return;
                    }
                }
            }
            i2 = 0;
            this.f195818d.queueInputBuffer(this.f195826l, i, iRemaining, j, i2);
            LinkedHashMap linkedHashMap4 = qpo.f191349a;
            synchronized (qpo.class) {
                synchronized (qpo.class) {
                    this.f195826l = -1;
                    iroVar.f105018d = null;
                    return;
                }
            }
        } catch (RuntimeException e) {
            yif1.m93804p(e, "MediaCodec error");
            throw m74763b(e);
        }
        i = iPosition;
    }

    /* JADX INFO: renamed from: i */
    public final void m74770i() {
        this.f195825k = null;
        Surface surface = this.f195819e;
        if (surface != null) {
            surface.release();
        }
        this.f195818d.release();
    }

    /* JADX INFO: renamed from: j */
    public final void m74771j() throws ExportException {
        MediaCodec.BufferInfo bufferInfo = this.f195815a;
        bufferInfo.getClass();
        m74772k(bufferInfo.presentationTimeUs, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m74772k(long j, boolean z) throws ExportException {
        MediaCodec mediaCodec = this.f195818d;
        this.f195825k = null;
        try {
            if (z) {
                mediaCodec.releaseOutputBuffer(this.f195827m, j * 1000);
                LinkedHashMap linkedHashMap = qpo.f191349a;
                synchronized (qpo.class) {
                    try {
                        synchronized (qpo.class) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                mediaCodec.releaseOutputBuffer(this.f195827m, false);
            }
            this.f195827m = -1;
        } catch (RuntimeException e) {
            yif1.m93804p(e, "MediaCodec error");
            throw m74763b(e);
        }
    }
}
