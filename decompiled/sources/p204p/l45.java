package p204p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Function;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public final class l45 implements Function, wua, io.reactivex.rxjava3.functions.Function, fha1, hab, Init, a6c, vd50, BiFunction, fz61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129571a;

    public /* synthetic */ l45(int i) {
        this.f129571a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final float[] m58104b(z8f z8fVar, z8f z8fVar2, int i) {
        float[] fArrM96829a = q0f1.f184002f;
        if (i != 3) {
            return null;
        }
        long j = z8fVar.f280462b;
        long j2 = v7f.f238171a;
        boolean zM84848a = v7f.m84848a(j, j2);
        boolean zM84848a2 = v7f.m84848a(z8fVar2.f280462b, j2);
        if (zM84848a && zM84848a2) {
            return null;
        }
        if (!zM84848a && !zM84848a2) {
            return null;
        }
        if (!zM84848a) {
            z8fVar = z8fVar2;
        }
        zsd1 zsd1Var = ((wdx0) z8fVar).f250363d;
        float[] fArrM96829a2 = zM84848a ? zsd1Var.m96829a() : fArrM96829a;
        if (zM84848a2) {
            fArrM96829a = zsd1Var.m96829a();
        }
        return new float[]{fArrM96829a2[0] / fArrM96829a[0], fArrM96829a2[1] / fArrM96829a[1], fArrM96829a2[2] / fArrM96829a[2]};
    }

    /* JADX INFO: renamed from: f */
    public static final ArrayList m58105f(List list) {
        int i = dte0.f52804k;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0r0 d0r0Var = (d0r0) it.next();
            arrayList.add(new kse0(d0r0Var.f44027a, d0r0Var.f44028b));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static void m58106g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static r0e1 m58107i(Context context, String[] strArr, String str, w9r0 w9r0Var) {
        String[] strArrM58111o = m58111o(context);
        int length = strArrM58111o.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrM58111o[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str3);
                            sb.append(c);
                            sb.append(str);
                            String string = sb.toString();
                            w9r0Var.m87545M("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                r0e1 r0e1Var = new r0e1();
                                r0e1Var.f194478b = zipFile;
                                r0e1Var.f194479c = entry;
                                return r0e1Var;
                            }
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String[] m58108j(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m58111o(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX INFO: renamed from: k */
    public static u1j m58109k(z8f z8fVar) {
        return new u1j(z8fVar, z8fVar, 1);
    }

    /* JADX INFO: renamed from: m */
    public static List m58110m(MediaExtractor mediaExtractor, int i, ByteBuffer byteBuffer) {
        if (i == -1) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        mediaExtractor.selectTrack(i);
        mediaExtractor.seekTo(0L, 2);
        while (true) {
            int sampleData = mediaExtractor.readSampleData(byteBuffer, 0);
            if (sampleData < 0) {
                mediaExtractor.unselectTrack(i);
                return arrayList;
            }
            byte[] bArr = new byte[sampleData];
            byteBuffer.position(0);
            byteBuffer.get(bArr, 0, sampleData);
            arrayList.add(new ge51(mediaExtractor.getSampleTime(), bArr, mediaExtractor.getSampleFlags(), sampleData));
            mediaExtractor.advance();
        }
    }

    /* JADX INFO: renamed from: o */
    public static String[] m58111o(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* JADX INFO: renamed from: p */
    public static void m58112p(List list, int i, MediaMuxer mediaMuxer, MediaCodec.BufferInfo bufferInfo, long j, long j2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ge51 ge51Var = (ge51) it.next();
            bufferInfo.offset = 0;
            bufferInfo.size = ge51Var.f79028d;
            bufferInfo.flags = ge51Var.f79027c;
            long j3 = ge51Var.f79026b + j;
            bufferInfo.presentationTimeUs = j3;
            if (j3 > j2) {
                return;
            } else {
                mediaMuxer.writeSampleData(i, ByteBuffer.wrap(ge51Var.f79025a), bufferInfo);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m58113q(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8388608);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        Iterator it = h6f.m46715L(Integer.valueOf(i), Integer.valueOf(i2)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != -1) {
                mediaExtractor.selectTrack(iIntValue);
                mediaExtractor.seekTo(0L, 2);
                while (true) {
                    bufferInfo.offset = 0;
                    bufferInfo.size = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                    bufferInfo.flags = mediaExtractor.getSampleFlags();
                    long sampleTime = mediaExtractor.getSampleTime();
                    bufferInfo.presentationTimeUs = sampleTime;
                    if (bufferInfo.size < 0 || sampleTime > j) {
                        break;
                    }
                    mediaMuxer.writeSampleData(iIntValue == i ? i3 : i4, byteBufferAllocate, bufferInfo);
                    mediaExtractor.advance();
                }
                mediaExtractor.unselectTrack(iIntValue);
            }
        }
    }

    @Override // p204p.wua
    /* JADX INFO: renamed from: a */
    public byte[] mo58114a(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    @Override // com.spotify.mobius.functions.Function
    public Object apply(Object obj) {
        switch (this.f129571a) {
            case 1:
                return sn91.m78549e((g58) obj);
            case 5:
                nbm nbmVarM58671d = ((lbm) obj).m58671d(null, null);
                return nbmVarM58671d != null ? Maybe.m23363f(nbmVarM58671d) : MaybeEmpty.f8264a;
            case 13:
                dz90 dz90Var = (dz90) obj;
                return new wy10(dz90Var.f54587d, dz90Var.f54586c);
            default:
                List listSubList = ((fxx) obj).f74479a;
                if (listSubList.size() > 160) {
                    listSubList = listSubList.subList(0, 160);
                }
                return new fxx(listSubList, null, null, null);
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        n70 n70VarM63788a = n70.m63788a(i);
        return n70VarM63788a == null ? n70.UNRECOGNIZED : n70VarM63788a;
    }

    @Override // p204p.a6c
    /* JADX INFO: renamed from: d */
    public Object mo24863d(st91 st91Var) {
        return new s8g0(new zm8(st91Var, 14), (char) 0);
    }

    @Override // p204p.a6c
    /* JADX INFO: renamed from: e */
    public av91 mo24864e(k5c k5cVar) {
        return null;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15575c((tbo0) obj, Collections.singleton(s9o0.f206990a));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX INFO: renamed from: h */
    public void m58115h(ovy ovyVar, ovy ovyVar2, Integer num) throws Throwable {
        Throwable th;
        String absolutePath = ((ewy) ovyVar).f63623b.getAbsolutePath();
        String absolutePath2 = ((ewy) ovyVar2).f63623b.getAbsolutePath();
        if (num == null) {
            FileInputStream fileInputStream = new FileInputStream(absolutePath);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(absolutePath2);
                try {
                    fileInputStream.getChannel().transferTo(0L, fileInputStream.getChannel().size(), fileOutputStream.getChannel());
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        n0e1.m63430g(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    n0e1.m63430g(fileInputStream, th4);
                    throw th5;
                }
            }
        }
        int iIntValue = num.intValue();
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaMuxer mediaMuxer = null;
        try {
            mediaExtractor.setDataSource(absolutePath);
            MediaMuxer mediaMuxer2 = new MediaMuxer(absolutePath2, 0);
            try {
                int trackCount = mediaExtractor.getTrackCount();
                int iAddTrack = -1;
                int i = -1;
                int i2 = -1;
                int iAddTrack2 = -1;
                for (int i3 = 0; i3 < trackCount; i3++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                    String string = trackFormat.getString("mime");
                    if (string != null) {
                        if (bm51.m29803n0(string, "video/", false) && i == -1) {
                            iAddTrack = mediaMuxer2.addTrack(trackFormat);
                            i = i3;
                        } else if (bm51.m29803n0(string, "audio/", false) && i2 == -1) {
                            iAddTrack2 = mediaMuxer2.addTrack(trackFormat);
                            i2 = i3;
                        }
                    }
                }
                if (iAddTrack == -1 && iAddTrack2 == -1) {
                    throw new IllegalStateException("No valid video/audio tracks found.");
                }
                mediaMuxer2.start();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(absolutePath);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    long j = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L;
                    mediaMetadataRetriever.release();
                    hvi0 hvi0Var = cks.f39079b;
                    long jM54450E = jwg1.m54450E(j, ils.MILLISECONDS);
                    ils ilsVar = ils.MICROSECONDS;
                    long jM33199r = cks.m33199r(jM54450E, ilsVar);
                    long jM33199r2 = cks.m33199r(jwg1.m54449D(iIntValue, ils.SECONDS), ilsVar);
                    if (jM33199r2 > jM33199r) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8388608);
                        wj50.m88279p(byteBufferAllocate);
                        List listM58110m = m58110m(mediaExtractor, i, byteBufferAllocate);
                        List listM58110m2 = m58110m(mediaExtractor, i2, byteBufferAllocate);
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        long j2 = 0;
                        while (j2 < jM33199r2) {
                            m58112p(listM58110m, iAddTrack, mediaMuxer2, bufferInfo, j2, jM33199r2);
                            int i4 = iAddTrack;
                            List list = listM58110m2;
                            int i5 = iAddTrack2;
                            m58112p(list, i5, mediaMuxer2, bufferInfo, j2, jM33199r2);
                            j2 += jM33199r;
                            listM58110m2 = list;
                            iAddTrack2 = i5;
                            iAddTrack = i4;
                        }
                    } else {
                        mediaMuxer = mediaMuxer2;
                        try {
                            m58113q(mediaExtractor, mediaMuxer, i, i2, iAddTrack, iAddTrack2, jM33199r2);
                            mediaMuxer2 = mediaMuxer;
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            if (mediaMuxer != null) {
                                mediaMuxer.release();
                            }
                            mediaExtractor.release();
                            throw th;
                        }
                    }
                    mediaMuxer2.release();
                    mediaExtractor.release();
                } catch (Throwable th7) {
                    mediaMetadataRetriever.release();
                    throw th7;
                }
            } catch (Throwable th8) {
                th = th8;
                mediaMuxer = mediaMuxer2;
                if (mediaMuxer != null) {
                    mediaMuxer.release();
                }
                mediaExtractor.release();
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    @Override // p204p.fha1
    /* JADX INFO: renamed from: n */
    public Object mo35625n(fbk fbkVar) {
        return new po41(null, null, null);
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        return (gz61) bz61Var.mo26518k(this);
    }

    public /* synthetic */ l45(Object obj, int i) {
        this.f129571a = i;
    }

    public l45(son sonVar, otn otnVar) {
        this.f129571a = 6;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        ubp0 ubp0Var = (ubp0) obj2;
        List list = ubp0Var.f228870r;
        Set set = ubp0Var.f228871s;
        return new o221(list.contains("plus") && !set.contains("plus"), false, ubp0Var.f228870r.contains("minus") && !set.contains("minus"), bool.booleanValue());
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: c */
    public void mo25640c(x8b x8bVar, o2x0 o2x0Var) {
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: l */
    public void mo25646l(x8b x8bVar, Throwable th) {
    }
}
