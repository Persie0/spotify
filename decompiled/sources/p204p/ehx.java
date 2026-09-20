package p204p;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.comscore.streaming.ContentFeedType;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.msgpack.core.MessagePack;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class ehx {

    /* JADX INFO: renamed from: R */
    public static final String[] f59707R;

    /* JADX INFO: renamed from: S */
    public static final int[] f59708S;

    /* JADX INFO: renamed from: T */
    public static final byte[] f59709T;

    /* JADX INFO: renamed from: U */
    public static final chx f59710U;

    /* JADX INFO: renamed from: V */
    public static final chx[][] f59711V;

    /* JADX INFO: renamed from: W */
    public static final chx[] f59712W;

    /* JADX INFO: renamed from: X */
    public static final chx f59713X;

    /* JADX INFO: renamed from: Y */
    public static final chx f59714Y;

    /* JADX INFO: renamed from: Z */
    public static final HashMap[] f59715Z;

    /* JADX INFO: renamed from: a0 */
    public static final HashMap[] f59716a0;

    /* JADX INFO: renamed from: b0 */
    public static final HashSet f59717b0;

    /* JADX INFO: renamed from: c0 */
    public static final HashMap f59718c0;

    /* JADX INFO: renamed from: d0 */
    public static final Charset f59719d0;

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f59720e0;

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f59721f0;

    /* JADX INFO: renamed from: g0 */
    public static final Pattern f59722g0;

    /* JADX INFO: renamed from: a */
    public String f59729a;

    /* JADX INFO: renamed from: b */
    public FileDescriptor f59730b;

    /* JADX INFO: renamed from: c */
    public AssetManager.AssetInputStream f59731c;

    /* JADX INFO: renamed from: d */
    public int f59732d;

    /* JADX INFO: renamed from: e */
    public final HashMap[] f59733e;

    /* JADX INFO: renamed from: f */
    public final HashSet f59734f;

    /* JADX INFO: renamed from: g */
    public ByteOrder f59735g;

    /* JADX INFO: renamed from: h */
    public boolean f59736h;

    /* JADX INFO: renamed from: i */
    public boolean f59737i;

    /* JADX INFO: renamed from: j */
    public int f59738j;

    /* JADX INFO: renamed from: k */
    public int f59739k;

    /* JADX INFO: renamed from: l */
    public byte[] f59740l;

    /* JADX INFO: renamed from: m */
    public int f59741m;

    /* JADX INFO: renamed from: n */
    public int f59742n;

    /* JADX INFO: renamed from: o */
    public int f59743o;

    /* JADX INFO: renamed from: p */
    public int f59744p;

    /* JADX INFO: renamed from: q */
    public int f59745q;

    /* JADX INFO: renamed from: r */
    public int f59746r;

    /* JADX INFO: renamed from: s */
    public boolean f59747s;

    /* JADX INFO: renamed from: t */
    public boolean f59748t;

    /* JADX INFO: renamed from: u */
    public static final boolean f59723u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v */
    public static final List f59724v = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: w */
    public static final List f59725w = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: x */
    public static final int[] f59726x = {8, 8, 8};

    /* JADX INFO: renamed from: y */
    public static final int[] f59727y = {8};

    /* JADX INFO: renamed from: z */
    public static final byte[] f59728z = {-1, MessagePack.Code.FIXEXT16, -1};

    /* JADX INFO: renamed from: A */
    public static final byte[] f59690A = {102, 116, 121, 112};

    /* JADX INFO: renamed from: B */
    public static final byte[] f59691B = {109, 105, 102, 49};

    /* JADX INFO: renamed from: C */
    public static final byte[] f59692C = {104, 101, 105, 99};

    /* JADX INFO: renamed from: D */
    public static final byte[] f59693D = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: E */
    public static final byte[] f59694E = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: F */
    public static final byte[] f59695F = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: G */
    public static final byte[] f59696G = {101, 88, 73, 102};

    /* JADX INFO: renamed from: H */
    public static final byte[] f59697H = {73, 72, 68, 82};

    /* JADX INFO: renamed from: I */
    public static final byte[] f59698I = {73, 69, 78, 68};

    /* JADX INFO: renamed from: J */
    public static final byte[] f59699J = {82, 73, 70, 70};

    /* JADX INFO: renamed from: K */
    public static final byte[] f59700K = {87, 69, 66, 80};

    /* JADX INFO: renamed from: L */
    public static final byte[] f59701L = {69, 88, 73, 70};

    /* JADX INFO: renamed from: M */
    public static final byte[] f59702M = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: N */
    public static final byte[] f59703N = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: O */
    public static final byte[] f59704O = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: P */
    public static final byte[] f59705P = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q */
    public static final byte[] f59706Q = "ANMF".getBytes(Charset.defaultCharset());

    static {
        "XMP ".getBytes(Charset.defaultCharset());
        f59707R = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f59708S = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f59709T = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        chx[] chxVarArr = {new chx("NewSubfileType", 254, 4), new chx("SubfileType", 255, 4), new chx("ImageWidth", 256), new chx("ImageLength", 257), new chx("BitsPerSample", 258, 3), new chx("Compression", 259, 3), new chx("PhotometricInterpretation", 262, 3), new chx("ImageDescription", 270, 2), new chx("Make", 271, 2), new chx("Model", 272, 2), new chx("StripOffsets", 273), new chx("Orientation", 274, 3), new chx("SamplesPerPixel", 277, 3), new chx("RowsPerStrip", 278), new chx("StripByteCounts", 279), new chx("XResolution", 282, 5), new chx("YResolution", 283, 5), new chx("PlanarConfiguration", 284, 3), new chx("ResolutionUnit", 296, 3), new chx("TransferFunction", ContentFeedType.EAST_HD, 3), new chx("Software", 305, 2), new chx("DateTime", 306, 2), new chx("Artist", 315, 2), new chx("WhitePoint", 318, 5), new chx("PrimaryChromaticities", 319, 5), new chx("SubIFDPointer", 330, 4), new chx("JPEGInterchangeFormat", 513, 4), new chx("JPEGInterchangeFormatLength", 514, 4), new chx("YCbCrCoefficients", 529, 5), new chx("YCbCrSubSampling", 530, 3), new chx("YCbCrPositioning", 531, 3), new chx("ReferenceBlackWhite", 532, 5), new chx("Copyright", 33432, 2), new chx("ExifIFDPointer", 34665, 4), new chx("GPSInfoIFDPointer", 34853, 4), new chx("SensorTopBorder", 4, 4), new chx("SensorLeftBorder", 5, 4), new chx("SensorBottomBorder", 6, 4), new chx("SensorRightBorder", 7, 4), new chx("ISO", 23, 3), new chx("JpgFromRaw", 46, 7), new chx("Xmp", CtaType.SEE_ALL_SHOWS_FIELD_NUMBER, 1)};
        chx[] chxVarArr2 = {new chx("ExposureTime", 33434, 5), new chx("FNumber", 33437, 5), new chx("ExposureProgram", 34850, 3), new chx("SpectralSensitivity", 34852, 2), new chx("PhotographicSensitivity", 34855, 3), new chx("OECF", 34856, 7), new chx("SensitivityType", 34864, 3), new chx("StandardOutputSensitivity", 34865, 4), new chx("RecommendedExposureIndex", 34866, 4), new chx("ISOSpeed", 34867, 4), new chx("ISOSpeedLatitudeyyy", 34868, 4), new chx("ISOSpeedLatitudezzz", 34869, 4), new chx("ExifVersion", 36864, 2), new chx("DateTimeOriginal", 36867, 2), new chx("DateTimeDigitized", 36868, 2), new chx("OffsetTime", 36880, 2), new chx("OffsetTimeOriginal", 36881, 2), new chx("OffsetTimeDigitized", 36882, 2), new chx("ComponentsConfiguration", 37121, 7), new chx("CompressedBitsPerPixel", 37122, 5), new chx("ShutterSpeedValue", 37377, 10), new chx("ApertureValue", 37378, 5), new chx("BrightnessValue", 37379, 10), new chx("ExposureBiasValue", 37380, 10), new chx("MaxApertureValue", 37381, 5), new chx("SubjectDistance", 37382, 5), new chx("MeteringMode", 37383, 3), new chx("LightSource", 37384, 3), new chx("Flash", 37385, 3), new chx("FocalLength", 37386, 5), new chx("SubjectArea", 37396, 3), new chx("MakerNote", 37500, 7), new chx("UserComment", 37510, 7), new chx("SubSecTime", 37520, 2), new chx("SubSecTimeOriginal", 37521, 2), new chx("SubSecTimeDigitized", 37522, 2), new chx("FlashpixVersion", 40960, 7), new chx("ColorSpace", 40961, 3), new chx("PixelXDimension", 40962), new chx("PixelYDimension", 40963), new chx("RelatedSoundFile", 40964, 2), new chx("InteroperabilityIFDPointer", 40965, 4), new chx("FlashEnergy", 41483, 5), new chx("SpatialFrequencyResponse", 41484, 7), new chx("FocalPlaneXResolution", 41486, 5), new chx("FocalPlaneYResolution", 41487, 5), new chx("FocalPlaneResolutionUnit", 41488, 3), new chx("SubjectLocation", 41492, 3), new chx("ExposureIndex", 41493, 5), new chx("SensingMethod", 41495, 3), new chx("FileSource", 41728, 7), new chx("SceneType", 41729, 7), new chx("CFAPattern", 41730, 7), new chx("CustomRendered", 41985, 3), new chx("ExposureMode", 41986, 3), new chx("WhiteBalance", 41987, 3), new chx("DigitalZoomRatio", 41988, 5), new chx("FocalLengthIn35mmFilm", 41989, 3), new chx("SceneCaptureType", 41990, 3), new chx("GainControl", 41991, 3), new chx("Contrast", 41992, 3), new chx("Saturation", 41993, 3), new chx("Sharpness", 41994, 3), new chx("DeviceSettingDescription", 41995, 7), new chx("SubjectDistanceRange", 41996, 3), new chx("ImageUniqueID", 42016, 2), new chx("CameraOwnerName", 42032, 2), new chx("BodySerialNumber", 42033, 2), new chx("LensSpecification", 42034, 5), new chx("LensMake", 42035, 2), new chx("LensModel", 42036, 2), new chx("Gamma", 42240, 5), new chx("DNGVersion", 50706, 1), new chx("DefaultCropSize", 50720)};
        chx[] chxVarArr3 = {new chx("GPSVersionID", 0, 1), new chx("GPSLatitudeRef", 1, 2), new chx("GPSLatitude", 2, 5), new chx("GPSLongitudeRef", 3, 2), new chx("GPSLongitude", 4, 5), new chx("GPSAltitudeRef", 5, 1), new chx("GPSAltitude", 6, 5), new chx("GPSTimeStamp", 7, 5), new chx("GPSSatellites", 8, 2), new chx("GPSStatus", 9, 2), new chx("GPSMeasureMode", 10, 2), new chx("GPSDOP", 11, 5), new chx("GPSSpeedRef", 12, 2), new chx("GPSSpeed", 13, 5), new chx("GPSTrackRef", 14, 2), new chx("GPSTrack", 15, 5), new chx("GPSImgDirectionRef", 16, 2), new chx("GPSImgDirection", 17, 5), new chx("GPSMapDatum", 18, 2), new chx("GPSDestLatitudeRef", 19, 2), new chx("GPSDestLatitude", 20, 5), new chx("GPSDestLongitudeRef", 21, 2), new chx("GPSDestLongitude", 22, 5), new chx("GPSDestBearingRef", 23, 2), new chx("GPSDestBearing", 24, 5), new chx("GPSDestDistanceRef", 25, 2), new chx("GPSDestDistance", 26, 5), new chx("GPSProcessingMethod", 27, 7), new chx("GPSAreaInformation", 28, 7), new chx("GPSDateStamp", 29, 2), new chx("GPSDifferential", 30, 3), new chx("GPSHPositioningError", 31, 5)};
        chx[] chxVarArr4 = {new chx("InteroperabilityIndex", 1, 2)};
        chx[] chxVarArr5 = {new chx("NewSubfileType", 254, 4), new chx("SubfileType", 255, 4), new chx("ThumbnailImageWidth", 256), new chx("ThumbnailImageLength", 257), new chx("BitsPerSample", 258, 3), new chx("Compression", 259, 3), new chx("PhotometricInterpretation", 262, 3), new chx("ImageDescription", 270, 2), new chx("Make", 271, 2), new chx("Model", 272, 2), new chx("StripOffsets", 273), new chx("ThumbnailOrientation", 274, 3), new chx("SamplesPerPixel", 277, 3), new chx("RowsPerStrip", 278), new chx("StripByteCounts", 279), new chx("XResolution", 282, 5), new chx("YResolution", 283, 5), new chx("PlanarConfiguration", 284, 3), new chx("ResolutionUnit", 296, 3), new chx("TransferFunction", ContentFeedType.EAST_HD, 3), new chx("Software", 305, 2), new chx("DateTime", 306, 2), new chx("Artist", 315, 2), new chx("WhitePoint", 318, 5), new chx("PrimaryChromaticities", 319, 5), new chx("SubIFDPointer", 330, 4), new chx("JPEGInterchangeFormat", 513, 4), new chx("JPEGInterchangeFormatLength", 514, 4), new chx("YCbCrCoefficients", 529, 5), new chx("YCbCrSubSampling", 530, 3), new chx("YCbCrPositioning", 531, 3), new chx("ReferenceBlackWhite", 532, 5), new chx("Copyright", 33432, 2), new chx("ExifIFDPointer", 34665, 4), new chx("GPSInfoIFDPointer", 34853, 4), new chx("DNGVersion", 50706, 1), new chx("DefaultCropSize", 50720)};
        f59710U = new chx("StripOffsets", 273, 3);
        f59711V = new chx[][]{chxVarArr, chxVarArr2, chxVarArr3, chxVarArr4, chxVarArr5, chxVarArr, new chx[]{new chx("ThumbnailImage", 256, 7), new chx("CameraSettingsIFDPointer", 8224, 4), new chx("ImageProcessingIFDPointer", 8256, 4)}, new chx[]{new chx("PreviewImageStart", 257, 4), new chx("PreviewImageLength", 258, 4)}, new chx[]{new chx("AspectFrame", 4371, 3)}, new chx[]{new chx("ColorSpace", 55, 3)}};
        f59712W = new chx[]{new chx("SubIFDPointer", 330, 4), new chx("ExifIFDPointer", 34665, 4), new chx("GPSInfoIFDPointer", 34853, 4), new chx("InteroperabilityIFDPointer", 40965, 4), new chx("CameraSettingsIFDPointer", 8224, 1), new chx("ImageProcessingIFDPointer", 8256, 1)};
        f59713X = new chx("JPEGInterchangeFormat", 513, 4);
        f59714Y = new chx("JPEGInterchangeFormatLength", 514, 4);
        f59715Z = new HashMap[10];
        f59716a0 = new HashMap[10];
        f59717b0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f59718c0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f59719d0 = charsetForName;
        f59720e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f59721f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            chx[][] chxVarArr6 = f59711V;
            if (i >= chxVarArr6.length) {
                HashMap map = f59718c0;
                chx[] chxVarArr7 = f59712W;
                map.put(Integer.valueOf(chxVarArr7[0].f38130a), 5);
                map.put(Integer.valueOf(chxVarArr7[1].f38130a), 1);
                map.put(Integer.valueOf(chxVarArr7[2].f38130a), 2);
                map.put(Integer.valueOf(chxVarArr7[3].f38130a), 3);
                map.put(Integer.valueOf(chxVarArr7[4].f38130a), 7);
                map.put(Integer.valueOf(chxVarArr7[5].f38130a), 8);
                Pattern.compile(".*[1-9].*");
                f59722g0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f59715Z[i] = new HashMap();
            f59716a0[i] = new HashMap();
            for (chx chxVar : chxVarArr6[i]) {
                f59715Z[i].put(Integer.valueOf(chxVar.f38130a), chxVar);
                f59716a0[i].put(chxVar.f38131b, chxVar);
            }
            i++;
        }
    }

    public ehx(File file) throws Throwable {
        boolean z;
        chx[][] chxVarArr = f59711V;
        this.f59733e = new HashMap[chxVarArr.length];
        this.f59734f = new HashSet(chxVarArr.length);
        this.f59735g = ByteOrder.BIG_ENDIAN;
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f59731c = null;
        this.f59729a = absolutePath;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(absolutePath);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    this.f59730b = fileInputStream2.getFD();
                } else {
                    this.f59730b = null;
                }
                m39046x(fileInputStream2);
                m39012c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                m39012c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: A */
    public static ByteOrder m39010A(zgx zgxVar) throws IOException {
        short s = zgxVar.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* JADX INFO: renamed from: b */
    public static String m39011b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m39012c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static long[] m39013d(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: e */
    public static void m39014e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m39015f(InputStream inputStream, ahx ahxVar, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            ahxVar.write(bArr, 0, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m39016g(zgx zgxVar, ahx ahxVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (zgxVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f59719d0;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i = zgxVar.readInt();
            ahxVar.write(bArr3);
            ahxVar.m26003e(i);
            if (i % 2 == 1) {
                i++;
            }
            m39015f(zgxVar, ahxVar, i);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static Pair m39017u(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairM39017u = m39017u(strArrSplit[0]);
            if (((Integer) pairM39017u.first).intValue() == 2) {
                return pairM39017u;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairM39017u2 = m39017u(strArrSplit[i]);
                int iIntValue = (((Integer) pairM39017u2.first).equals(pairM39017u.first) || ((Integer) pairM39017u2.second).equals(pairM39017u.first)) ? ((Integer) pairM39017u.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM39017u.second).intValue() == -1 || !(((Integer) pairM39017u2.first).equals(pairM39017u.second) || ((Integer) pairM39017u2.second).equals(pairM39017u.second))) ? -1 : ((Integer) pairM39017u.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairM39017u = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM39017u = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM39017u;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* JADX INFO: renamed from: B */
    public final void m39018B(byte[] bArr, int i) throws IOException {
        zgx zgxVar = new zgx(bArr);
        m39047y(zgxVar, bArr.length);
        m39019C(zgxVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX INFO: renamed from: C */
    public final void m39019C(zgx zgxVar, int i) throws IOException {
        boolean z;
        HashMap[] mapArr;
        long j;
        long j2;
        int i2;
        boolean z2;
        long j3;
        int i3;
        int unsignedShort;
        long j4;
        Integer numValueOf = Integer.valueOf(zgxVar.f282731d);
        HashSet hashSet = this.f59734f;
        hashSet.add(numValueOf);
        int i4 = zgxVar.f282731d + 2;
        int i5 = zgxVar.f282730c;
        if (i4 > i5) {
            return;
        }
        short s = zgxVar.readShort();
        if ((s * 12) + zgxVar.f282731d > i5 || s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            z = f59723u;
            mapArr = this.f59733e;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = zgxVar.readUnsignedShort();
            int unsignedShort3 = zgxVar.readUnsignedShort();
            int i6 = zgxVar.readInt();
            long j5 = ((long) zgxVar.f282731d) + 4;
            chx chxVar = (chx) f59715Z[i].get(Integer.valueOf(unsignedShort2));
            if (z) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), chxVar != null ? chxVar.f38131b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6));
            }
            if (chxVar != null && unsignedShort3 > 0) {
                int[] iArr = f59708S;
                if (unsignedShort3 < iArr.length) {
                    int i7 = chxVar.f38132c;
                    if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = chxVar.f38133d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i7;
                        }
                        j = j5;
                        j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                        z2 = j2 >= 0 && j2 <= 2147483647L;
                    } else {
                        if (z != 0) {
                            String str = f59707R[unsignedShort3];
                        }
                        j = j5;
                        j2 = 0;
                    }
                } else {
                    j = j5;
                    j2 = 0;
                }
            } else {
                j = j5;
                j2 = 0;
            }
            if (z2) {
                long j6 = j;
                if (j2 > 4) {
                    int i8 = zgxVar.readInt();
                    int i9 = this.f59732d;
                    if (i9 == 7) {
                        if ("MakerNote".equals(chxVar.f38131b)) {
                            this.f59743o = i8;
                        } else if (i == 6 && "ThumbnailImage".equals(chxVar.f38131b)) {
                            this.f59744p = i8;
                            this.f59745q = i6;
                            bhx bhxVarM29272e = bhx.m29272e(6, this.f59735g);
                            j3 = j2;
                            bhx bhxVarM29269b = bhx.m29269b(this.f59744p, this.f59735g);
                            i3 = unsignedShort3;
                            bhx bhxVarM29269b2 = bhx.m29269b(this.f59745q, this.f59735g);
                            mapArr[4].put("Compression", bhxVarM29272e);
                            mapArr[4].put("JPEGInterchangeFormat", bhxVarM29269b);
                            mapArr[4].put("JPEGInterchangeFormatLength", bhxVarM29269b2);
                        }
                        j3 = j2;
                        i3 = unsignedShort3;
                    } else {
                        j3 = j2;
                        i3 = unsignedShort3;
                        if (i9 == 10 && "JpgFromRaw".equals(chxVar.f38131b)) {
                            this.f59746r = i8;
                        }
                    }
                    long j7 = i8;
                    if (j7 + j3 <= i5) {
                        zgxVar.m96109a(j7);
                    } else {
                        zgxVar.m96109a(j6);
                    }
                } else {
                    j3 = j2;
                    i3 = unsignedShort3;
                }
                Integer num = (Integer) f59718c0.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    int i10 = i3;
                    if (i10 != 3) {
                        if (i10 == 4) {
                            j4 = ((long) zgxVar.readInt()) & 4294967295L;
                        } else if (i10 == 8) {
                            unsignedShort = zgxVar.readShort();
                        } else if (i10 == 9 || i10 == 13) {
                            unsignedShort = zgxVar.readInt();
                        } else {
                            j4 = -1;
                        }
                        if (z) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j4), chxVar.f38131b);
                        }
                        if (j4 > 0 && j4 < i5 && !hashSet.contains(Integer.valueOf((int) j4))) {
                            zgxVar.m96109a(j4);
                            m39019C(zgxVar, num.intValue());
                        }
                        zgxVar.m96109a(j6);
                    } else {
                        unsignedShort = zgxVar.readUnsignedShort();
                    }
                    j4 = unsignedShort;
                    if (z) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j4), chxVar.f38131b);
                    }
                    if (j4 > 0) {
                        zgxVar.m96109a(j4);
                        m39019C(zgxVar, num.intValue());
                    }
                    zgxVar.m96109a(j6);
                } else {
                    byte[] bArr = new byte[(int) j3];
                    zgxVar.readFully(bArr);
                    bhx bhxVar = new bhx(i3, bArr, i6, 0);
                    HashMap map = mapArr[i];
                    String str2 = chxVar.f38131b;
                    map.put(str2, bhxVar);
                    if ("DNGVersion".equals(str2)) {
                        this.f59732d = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && bhxVar.m29276i(this.f59735g).contains("PENTAX")) || ("Compression".equals(str2) && bhxVar.m29275h(this.f59735g) == 65535)) {
                        this.f59732d = 8;
                    }
                    if (zgxVar.f282731d != j6) {
                        zgxVar.m96109a(j6);
                    }
                }
                s2 = (short) (s2 + 1);
                s = s;
            } else {
                zgxVar.m96109a(j);
            }
            s2 = (short) (s2 + 1);
            s = s;
        }
        if (zgxVar.f282731d + 4 <= i5) {
            int i11 = zgxVar.readInt();
            if (z) {
                String.format("nextIfdOffset: %d", Integer.valueOf(i11));
            }
            long j8 = i11;
            if (j8 <= 0 || i11 >= i5 || hashSet.contains(Integer.valueOf(i11))) {
                return;
            }
            zgxVar.m96109a(j8);
            if (mapArr[4].isEmpty()) {
                m39019C(zgxVar, 4);
            } else if (mapArr[5].isEmpty()) {
                m39019C(zgxVar, 5);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m39020D(String str) {
        for (int i = 0; i < f59711V.length; i++) {
            this.f59733e[i].remove(str);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m39021E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f59723u) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        ahx ahxVar = new ahx(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        ahxVar.m26002c(-1);
        if (dataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        ahxVar.m26002c(-40);
        String strM39031h = m39031h("Xmp");
        HashMap[] mapArr = this.f59733e;
        bhx bhxVar = (strM39031h == null || !this.f59748t) ? null : (bhx) mapArr[0].remove("Xmp");
        ahxVar.m26002c(-1);
        ahxVar.m26002c(-31);
        m39029M(ahxVar);
        if (bhxVar != null) {
            mapArr[0].put("Xmp", bhxVar);
        }
        byte[] bArr = new byte[4096];
        while (dataInputStream.readByte() == -1) {
            byte b = dataInputStream.readByte();
            if (b == -39 || b == -38) {
                ahxVar.m26002c(-1);
                ahxVar.m26002c(b);
                m39014e(dataInputStream, ahxVar);
                return;
            }
            if (b != -31) {
                ahxVar.m26002c(-1);
                ahxVar.m26002c(b);
                int unsignedShort = dataInputStream.readUnsignedShort();
                ahxVar.m26006h(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = dataInputStream.read(bArr, 0, Math.min(i, 4096));
                    if (i2 < 0) {
                        break;
                    }
                    ahxVar.write(bArr, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f59720e0)) {
                        int i4 = unsignedShort2 - 8;
                        if (dataInputStream.skipBytes(i4) != i4) {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                ahxVar.m26002c(-1);
                ahxVar.m26002c(b);
                ahxVar.m26006h(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    ahxVar.write(bArr2);
                }
                while (i3 > 0) {
                    int i5 = dataInputStream.read(bArr, 0, Math.min(i3, 4096));
                    if (i5 < 0) {
                        break;
                    }
                    ahxVar.write(bArr, 0, i5);
                    i3 -= i5;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX INFO: renamed from: F */
    public final void m39022F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f59723u) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ahx ahxVar = new ahx(bufferedOutputStream, byteOrder);
        byte[] bArr = f59695F;
        m39015f(dataInputStream, ahxVar, bArr.length);
        int i = this.f59742n;
        if (i == 0) {
            int i2 = dataInputStream.readInt();
            ahxVar.m26003e(i2);
            m39015f(dataInputStream, ahxVar, i2 + 8);
        } else {
            m39015f(dataInputStream, ahxVar, (i - bArr.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ahx ahxVar2 = new ahx(byteArrayOutputStream2, byteOrder);
                m39029M(ahxVar2);
                byte[] byteArray = ((ByteArrayOutputStream) ahxVar2.f15814a).toByteArray();
                ahxVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                ahxVar.m26003e((int) crc32.getValue());
                m39012c(byteArrayOutputStream2);
                m39014e(dataInputStream, ahxVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                m39012c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m39023G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f59723u) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        zgx zgxVar = new zgx(bufferedInputStream, byteOrder);
        ahx ahxVar = new ahx(bufferedOutputStream, byteOrder);
        byte[] bArr = f59699J;
        m39015f(zgxVar, ahxVar, bArr.length);
        byte[] bArr2 = f59700K;
        zgxVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    ahx ahxVar2 = new ahx(byteArrayOutputStream2, byteOrder);
                    int i = this.f59742n;
                    if (i != 0) {
                        m39015f(zgxVar, ahxVar2, (i - ((bArr.length + 4) + bArr2.length)) - 8);
                        zgxVar.skipBytes(4);
                        zgxVar.skipBytes(zgxVar.readInt());
                        m39029M(ahxVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (zgxVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = f59702M;
                        boolean zEquals = Arrays.equals(bArr3, bArr4);
                        byte[] bArr5 = f59703N;
                        byte[] bArr6 = f59704O;
                        if (zEquals) {
                            int i2 = zgxVar.readInt();
                            byte[] bArr7 = new byte[i2 % 2 == 1 ? i2 + 1 : i2];
                            zgxVar.read(bArr7);
                            byte b = (byte) (bArr7[0] | 8);
                            bArr7[0] = b;
                            boolean z = ((b >> 1) & 1) == 1;
                            ahxVar2.write(bArr4);
                            ahxVar2.m26003e(i2);
                            ahxVar2.write(bArr7);
                            if (z) {
                                m39016g(zgxVar, ahxVar2, f59705P, null);
                                while (true) {
                                    byte[] bArr8 = new byte[4];
                                    bufferedInputStream.read(bArr8);
                                    if (!Arrays.equals(bArr8, f59706Q)) {
                                        break;
                                    }
                                    int i3 = zgxVar.readInt();
                                    ahxVar2.write(bArr8);
                                    ahxVar2.m26003e(i3);
                                    if (i3 % 2 == 1) {
                                        i3++;
                                    }
                                    m39015f(zgxVar, ahxVar2, i3);
                                }
                                m39029M(ahxVar2);
                            } else {
                                m39016g(zgxVar, ahxVar2, bArr6, bArr5);
                                m39029M(ahxVar2);
                            }
                        } else if (Arrays.equals(bArr3, bArr6) || Arrays.equals(bArr3, bArr5)) {
                            throw new IOException("WebP files with only VP8 or VP8L chunks are currently not supported");
                        }
                    }
                    m39014e(zgxVar, ahxVar2);
                    ahxVar.m26003e(byteArrayOutputStream2.size() + bArr2.length);
                    ahxVar.write(bArr2);
                    byteArrayOutputStream2.writeTo(ahxVar);
                    m39012c(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    m39012c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0296  */
    /* JADX WARN: Code duplicated, block: B:101:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124 A[LOOP:1: B:61:0x0121->B:63:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0144 A[LOOP:2: B:65:0x0142->B:66:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165 A[LOOP:3: B:69:0x0162->B:71:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7 A[LOOP:4: B:73:0x01a5->B:74:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d8 A[LOOP:5: B:78:0x01d5->B:80:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8 A[LOOP:6: B:82:0x01f6->B:83:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x020e  */
    /* JADX WARN: Code duplicated, block: B:88:0x021c A[LOOP:7: B:86:0x0219->B:88:0x021c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x024a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0258 A[LOOP:8: B:91:0x0255->B:93:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0270  */
    /* JADX WARN: Code duplicated, block: B:98:0x027e A[LOOP:9: B:96:0x027b->B:98:0x027e, LOOP_END] */
    /* JADX INFO: renamed from: H */
    public final void m39024H(String str, String str2) {
        chx chxVar;
        int[] iArr;
        int i;
        int i2;
        bhx bhxVar;
        int i3;
        String[] strArrSplit;
        int[] iArr2;
        int i4;
        String[] strArrSplit2;
        long[] jArr;
        int i5;
        int i6;
        String[] strArrSplit3;
        dhx[] dhxVarArr;
        int i7;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i8;
        ByteBuffer byteBufferWrap;
        int i9;
        String[] strArrSplit5;
        int length2;
        dhx[] dhxVarArr2;
        int i10;
        dhx[] dhxVarArr3;
        ByteBuffer byteBufferWrap2;
        int i11;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i12;
        ByteBuffer byteBufferWrap3;
        int i13;
        String string = str2;
        String str3 = "ISOSpeedRatings".equals(str) ? "PhotographicSensitivity" : str;
        int i14 = 2;
        int i15 = 1;
        if (string != null && f59717b0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f59722g0.matcher(string);
                if (!matcher.find()) {
                    return;
                }
                string = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    string = new dhx(Double.parseDouble(string)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i17 < f59711V.length) {
            if ((i17 != 4 || this.f59736h) && (chxVar = (chx) f59716a0[i17].get(str3)) != null) {
                int i18 = chxVar.f38133d;
                int i19 = chxVar.f38132c;
                HashMap[] mapArr = this.f59733e;
                if (string != null) {
                    Pair pairM39017u = m39017u(string);
                    int i20 = -1;
                    if (i19 == ((Integer) pairM39017u.first).intValue() || i19 == ((Integer) pairM39017u.second).intValue()) {
                        i18 = i19;
                        iArr = f59708S;
                        switch (i18) {
                            case 1:
                                HashMap map = mapArr[i17];
                                i = i15;
                                i2 = 0;
                                if (string.length() == i || string.charAt(0) < '0' || string.charAt(0) > '1') {
                                    byte[] bytes = string.getBytes(f59719d0);
                                    bhxVar = new bhx(i, bytes, bytes.length, 0);
                                } else {
                                    byte[] bArr = new byte[i];
                                    bArr[0] = (byte) (string.charAt(0) - '0');
                                    bhxVar = new bhx(i, bArr, i, 0);
                                }
                                map.put(str3, bhxVar);
                                break;
                            case 2:
                            case 7:
                                i3 = i15;
                                mapArr[i17].put(str3, bhx.m29268a(string));
                                i = i3;
                                i2 = 0;
                                break;
                            case 3:
                                i3 = i15;
                                strArrSplit = string.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i4 < strArrSplit.length) {
                                    iArr2[i4] = Integer.parseInt(strArrSplit[i4]);
                                }
                                mapArr[i17].put(str3, bhx.m29273f(iArr2, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 4:
                                i3 = i15;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i5 < strArrSplit2.length) {
                                    jArr[i5] = Long.parseLong(strArrSplit2[i5]);
                                }
                                mapArr[i17].put(str3, bhx.m29270c(jArr, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 5:
                                i3 = i15;
                                i6 = -1;
                                strArrSplit3 = string.split(",", -1);
                                dhxVarArr = new dhx[strArrSplit3.length];
                                i7 = 0;
                                while (i7 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i7].split("/", i6);
                                    dhxVarArr[i7] = new dhx((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i3]));
                                    i7++;
                                    i6 = -1;
                                }
                                mapArr[i17].put(str3, bhx.m29271d(dhxVarArr, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 9:
                                i3 = i15;
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i8 < strArrSplit4.length) {
                                    iArr3[i8] = Integer.parseInt(strArrSplit4[i8]);
                                }
                                HashMap map2 = mapArr[i17];
                                ByteOrder byteOrder = this.f59735g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i9 < length) {
                                    byteBufferWrap.putInt(iArr3[i9]);
                                }
                                map2.put(str3, new bhx(9, byteBufferWrap.array(), length, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                dhxVarArr2 = new dhx[length2];
                                i10 = i16;
                                while (i10 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i10].split("/", i20);
                                    dhx[] dhxVarArr4 = dhxVarArr2;
                                    dhxVarArr4[i10] = new dhx((long) Double.parseDouble(strArrSplit8[i16]), (long) Double.parseDouble(strArrSplit8[i15]));
                                    i10++;
                                    i15 = i15;
                                    dhxVarArr2 = dhxVarArr4;
                                    i16 = 0;
                                    i20 = -1;
                                }
                                i3 = i15;
                                dhxVarArr3 = dhxVarArr2;
                                HashMap map3 = mapArr[i17];
                                ByteOrder byteOrder2 = this.f59735g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i11 < length2) {
                                    dhx dhxVar = dhxVarArr3[i11];
                                    byteBufferWrap2.putInt((int) dhxVar.f49185a);
                                    byteBufferWrap2.putInt((int) dhxVar.f49186b);
                                }
                                map3.put(str3, new bhx(10, byteBufferWrap2.array(), length2, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 12:
                                strArrSplit6 = string.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i12 < strArrSplit6.length) {
                                    dArr[i12] = Double.parseDouble(strArrSplit6[i12]);
                                }
                                HashMap map4 = mapArr[i17];
                                ByteOrder byteOrder3 = this.f59735g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                while (i13 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i13]);
                                }
                                map4.put(str3, new bhx(12, byteBufferWrap3.array(), length3, i16));
                                break;
                        }
                    } else if (i18 != -1 && (i18 == ((Integer) pairM39017u.first).intValue() || i18 == ((Integer) pairM39017u.second).intValue())) {
                        iArr = f59708S;
                        switch (i18) {
                            case 1:
                                HashMap map5 = mapArr[i17];
                                i = i15;
                                i2 = 0;
                                if (string.length() == i) {
                                    byte[] bytes2 = string.getBytes(f59719d0);
                                    bhxVar = new bhx(i, bytes2, bytes2.length, 0);
                                } else {
                                    byte[] bytes3 = string.getBytes(f59719d0);
                                    bhxVar = new bhx(i, bytes3, bytes3.length, 0);
                                }
                                map5.put(str3, bhxVar);
                                break;
                            case 2:
                            case 7:
                                i3 = i15;
                                mapArr[i17].put(str3, bhx.m29268a(string));
                                i = i3;
                                i2 = 0;
                                break;
                            case 3:
                                i3 = i15;
                                strArrSplit = string.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i4 = 0; i4 < strArrSplit.length; i4++) {
                                    iArr2[i4] = Integer.parseInt(strArrSplit[i4]);
                                }
                                mapArr[i17].put(str3, bhx.m29273f(iArr2, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 4:
                                i3 = i15;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i5 = 0; i5 < strArrSplit2.length; i5++) {
                                    jArr[i5] = Long.parseLong(strArrSplit2[i5]);
                                }
                                mapArr[i17].put(str3, bhx.m29270c(jArr, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 5:
                                i3 = i15;
                                i6 = -1;
                                strArrSplit3 = string.split(",", -1);
                                dhxVarArr = new dhx[strArrSplit3.length];
                                i7 = 0;
                                while (i7 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i7].split("/", i6);
                                    dhxVarArr[i7] = new dhx((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[i3]));
                                    i7++;
                                    i6 = -1;
                                }
                                mapArr[i17].put(str3, bhx.m29271d(dhxVarArr, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 9:
                                i3 = i15;
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i8 = 0; i8 < strArrSplit4.length; i8++) {
                                    iArr3[i8] = Integer.parseInt(strArrSplit4[i8]);
                                }
                                HashMap map6 = mapArr[i17];
                                ByteOrder byteOrder4 = this.f59735g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder4);
                                for (i9 = 0; i9 < length; i9++) {
                                    byteBufferWrap.putInt(iArr3[i9]);
                                }
                                map6.put(str3, new bhx(9, byteBufferWrap.array(), length, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                dhxVarArr2 = new dhx[length2];
                                i10 = i16;
                                while (i10 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i10].split("/", i20);
                                    dhx[] dhxVarArr5 = dhxVarArr2;
                                    dhxVarArr5[i10] = new dhx((long) Double.parseDouble(strArrSplit10[i16]), (long) Double.parseDouble(strArrSplit10[i15]));
                                    i10++;
                                    i15 = i15;
                                    dhxVarArr2 = dhxVarArr5;
                                    i16 = 0;
                                    i20 = -1;
                                }
                                i3 = i15;
                                dhxVarArr3 = dhxVarArr2;
                                HashMap map7 = mapArr[i17];
                                ByteOrder byteOrder5 = this.f59735g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                for (i11 = 0; i11 < length2; i11++) {
                                    dhx dhxVar2 = dhxVarArr3[i11];
                                    byteBufferWrap2.putInt((int) dhxVar2.f49185a);
                                    byteBufferWrap2.putInt((int) dhxVar2.f49186b);
                                }
                                map7.put(str3, new bhx(10, byteBufferWrap2.array(), length2, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 12:
                                strArrSplit6 = string.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i12 = i16; i12 < strArrSplit6.length; i12++) {
                                    dArr[i12] = Double.parseDouble(strArrSplit6[i12]);
                                }
                                HashMap map8 = mapArr[i17];
                                ByteOrder byteOrder6 = this.f59735g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                for (i13 = i16; i13 < length3; i13++) {
                                    byteBufferWrap3.putDouble(dArr[i13]);
                                }
                                map8.put(str3, new bhx(12, byteBufferWrap3.array(), length3, i16));
                                break;
                        }
                    } else if (i19 == i15 || i19 == 7 || i19 == i14) {
                        i18 = i19;
                        iArr = f59708S;
                        switch (i18) {
                            case 1:
                                HashMap map9 = mapArr[i17];
                                i = i15;
                                i2 = 0;
                                if (string.length() == i) {
                                    byte[] bytes4 = string.getBytes(f59719d0);
                                    bhxVar = new bhx(i, bytes4, bytes4.length, 0);
                                } else {
                                    byte[] bytes5 = string.getBytes(f59719d0);
                                    bhxVar = new bhx(i, bytes5, bytes5.length, 0);
                                }
                                map9.put(str3, bhxVar);
                                break;
                            case 2:
                            case 7:
                                i3 = i15;
                                mapArr[i17].put(str3, bhx.m29268a(string));
                                i = i3;
                                i2 = 0;
                                break;
                            case 3:
                                i3 = i15;
                                strArrSplit = string.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i4 < strArrSplit.length) {
                                    iArr2[i4] = Integer.parseInt(strArrSplit[i4]);
                                }
                                mapArr[i17].put(str3, bhx.m29273f(iArr2, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 4:
                                i3 = i15;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i5 < strArrSplit2.length) {
                                    jArr[i5] = Long.parseLong(strArrSplit2[i5]);
                                }
                                mapArr[i17].put(str3, bhx.m29270c(jArr, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 5:
                                i3 = i15;
                                i6 = -1;
                                strArrSplit3 = string.split(",", -1);
                                dhxVarArr = new dhx[strArrSplit3.length];
                                i7 = 0;
                                while (i7 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i7].split("/", i6);
                                    dhxVarArr[i7] = new dhx((long) Double.parseDouble(strArrSplit11[0]), (long) Double.parseDouble(strArrSplit11[i3]));
                                    i7++;
                                    i6 = -1;
                                }
                                mapArr[i17].put(str3, bhx.m29271d(dhxVarArr, this.f59735g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 9:
                                i3 = i15;
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i8 < strArrSplit4.length) {
                                    iArr3[i8] = Integer.parseInt(strArrSplit4[i8]);
                                }
                                HashMap map10 = mapArr[i17];
                                ByteOrder byteOrder7 = this.f59735g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i9 < length) {
                                    byteBufferWrap.putInt(iArr3[i9]);
                                }
                                map10.put(str3, new bhx(9, byteBufferWrap.array(), length, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                dhxVarArr2 = new dhx[length2];
                                i10 = i16;
                                while (i10 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i10].split("/", i20);
                                    dhx[] dhxVarArr6 = dhxVarArr2;
                                    dhxVarArr6[i10] = new dhx((long) Double.parseDouble(strArrSplit12[i16]), (long) Double.parseDouble(strArrSplit12[i15]));
                                    i10++;
                                    i15 = i15;
                                    dhxVarArr2 = dhxVarArr6;
                                    i16 = 0;
                                    i20 = -1;
                                }
                                i3 = i15;
                                dhxVarArr3 = dhxVarArr2;
                                HashMap map11 = mapArr[i17];
                                ByteOrder byteOrder8 = this.f59735g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i11 < length2) {
                                    dhx dhxVar3 = dhxVarArr3[i11];
                                    byteBufferWrap2.putInt((int) dhxVar3.f49185a);
                                    byteBufferWrap2.putInt((int) dhxVar3.f49186b);
                                }
                                map11.put(str3, new bhx(10, byteBufferWrap2.array(), length2, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 12:
                                strArrSplit6 = string.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i12 < strArrSplit6.length) {
                                    dArr[i12] = Double.parseDouble(strArrSplit6[i12]);
                                }
                                HashMap map12 = mapArr[i17];
                                ByteOrder byteOrder9 = this.f59735g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                while (i13 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i13]);
                                }
                                map12.put(str3, new bhx(12, byteBufferWrap3.array(), length3, i16));
                                break;
                        }
                    } else if (f59723u) {
                        String[] strArr = f59707R;
                        String str4 = strArr[i19];
                        if (i18 != -1) {
                            String str5 = strArr[i18];
                        }
                        String str6 = strArr[((Integer) pairM39017u.first).intValue()];
                        if (((Integer) pairM39017u.second).intValue() != -1) {
                            String str7 = strArr[((Integer) pairM39017u.second).intValue()];
                        }
                    }
                } else {
                    mapArr[i17].remove(str3);
                }
                i2 = i16;
                i = i15;
            } else {
                i2 = i16;
                i = i15;
            }
            i17++;
            i15 = i;
            i16 = i2;
            i14 = 2;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m39025I(zgx zgxVar) throws IOException {
        bhx bhxVar;
        HashMap map = this.f59733e[4];
        bhx bhxVar2 = (bhx) map.get("Compression");
        if (bhxVar2 == null) {
            this.f59741m = 6;
            m39044v(zgxVar, map);
            return;
        }
        int iM29275h = bhxVar2.m29275h(this.f59735g);
        this.f59741m = iM29275h;
        if (iM29275h != 1) {
            if (iM29275h == 6) {
                m39044v(zgxVar, map);
                return;
            } else if (iM29275h != 7) {
                return;
            }
        }
        bhx bhxVar3 = (bhx) map.get("BitsPerSample");
        if (bhxVar3 != null) {
            int[] iArr = (int[]) bhxVar3.m29277j(this.f59735g);
            int[] iArr2 = f59726x;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f59732d != 3 || (bhxVar = (bhx) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iM29275h2 = bhxVar.m29275h(this.f59735g);
                if ((iM29275h2 != 1 || !Arrays.equals(iArr, f59727y)) && (iM29275h2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            bhx bhxVar4 = (bhx) map.get("StripOffsets");
            bhx bhxVar5 = (bhx) map.get("StripByteCounts");
            if (bhxVar4 == null || bhxVar5 == null) {
                return;
            }
            long[] jArrM39013d = m39013d(bhxVar4.m29277j(this.f59735g));
            long[] jArrM39013d2 = m39013d(bhxVar5.m29277j(this.f59735g));
            if (jArrM39013d == null || jArrM39013d.length == 0 || jArrM39013d2 == null || jArrM39013d2.length == 0 || jArrM39013d.length != jArrM39013d2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrM39013d2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.f59737i = true;
            this.f59736h = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrM39013d.length; i4++) {
                int i5 = (int) jArrM39013d[i4];
                int i6 = (int) jArrM39013d2[i4];
                if (i4 < jArrM39013d.length - 1 && i5 + i6 != jArrM39013d[i4 + 1]) {
                    this.f59737i = false;
                }
                int i7 = i5 - i2;
                zgxVar.m96109a(i7);
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                zgxVar.read(bArr2);
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.f59740l = bArr;
            if (this.f59737i) {
                this.f59738j = ((int) jArrM39013d[0]) + this.f59742n;
                this.f59739k = i;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m39026J(int i, int i2) {
        HashMap[] mapArr = this.f59733e;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        bhx bhxVar = (bhx) mapArr[i].get("ImageLength");
        bhx bhxVar2 = (bhx) mapArr[i].get("ImageWidth");
        bhx bhxVar3 = (bhx) mapArr[i2].get("ImageLength");
        bhx bhxVar4 = (bhx) mapArr[i2].get("ImageWidth");
        if (bhxVar == null || bhxVar2 == null || bhxVar3 == null || bhxVar4 == null) {
            return;
        }
        int iM29275h = bhxVar.m29275h(this.f59735g);
        int iM29275h2 = bhxVar2.m29275h(this.f59735g);
        int iM29275h3 = bhxVar3.m29275h(this.f59735g);
        int iM29275h4 = bhxVar4.m29275h(this.f59735g);
        if (iM29275h >= iM29275h3 || iM29275h2 >= iM29275h4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: K */
    public final void m39027K(zgx zgxVar, int i) throws IOException {
        bhx bhxVar;
        bhx bhxVarM29272e;
        bhx bhxVarM29272e2;
        HashMap[] mapArr = this.f59733e;
        bhx bhxVar2 = (bhx) mapArr[i].get("DefaultCropSize");
        bhx bhxVar3 = (bhx) mapArr[i].get("SensorTopBorder");
        bhx bhxVar4 = (bhx) mapArr[i].get("SensorLeftBorder");
        bhx bhxVar5 = (bhx) mapArr[i].get("SensorBottomBorder");
        bhx bhxVar6 = (bhx) mapArr[i].get("SensorRightBorder");
        if (bhxVar2 != null) {
            if (bhxVar2.f27254a == 5) {
                dhx[] dhxVarArr = (dhx[]) bhxVar2.m29277j(this.f59735g);
                if (dhxVarArr == null || dhxVarArr.length != 2) {
                    Arrays.toString(dhxVarArr);
                    return;
                } else {
                    bhxVarM29272e = bhx.m29271d(new dhx[]{dhxVarArr[0]}, this.f59735g);
                    bhxVarM29272e2 = bhx.m29271d(new dhx[]{dhxVarArr[1]}, this.f59735g);
                }
            } else {
                int[] iArr = (int[]) bhxVar2.m29277j(this.f59735g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    bhxVarM29272e = bhx.m29272e(iArr[0], this.f59735g);
                    bhxVarM29272e2 = bhx.m29272e(iArr[1], this.f59735g);
                }
            }
            mapArr[i].put("ImageWidth", bhxVarM29272e);
            mapArr[i].put("ImageLength", bhxVarM29272e2);
            return;
        }
        if (bhxVar3 == null || bhxVar4 == null || bhxVar5 == null || bhxVar6 == null) {
            bhx bhxVar7 = (bhx) mapArr[i].get("ImageLength");
            bhx bhxVar8 = (bhx) mapArr[i].get("ImageWidth");
            if ((bhxVar7 == null || bhxVar8 == null) && (bhxVar = (bhx) mapArr[i].get("JPEGInterchangeFormat")) != null) {
                m39035l(zgxVar, bhxVar.m29275h(this.f59735g), i);
                return;
            }
            return;
        }
        int iM29275h = bhxVar3.m29275h(this.f59735g);
        int iM29275h2 = bhxVar5.m29275h(this.f59735g);
        int iM29275h3 = bhxVar6.m29275h(this.f59735g);
        int iM29275h4 = bhxVar4.m29275h(this.f59735g);
        if (iM29275h2 <= iM29275h || iM29275h3 <= iM29275h4) {
            return;
        }
        bhx bhxVarM29272e3 = bhx.m29272e(iM29275h2 - iM29275h, this.f59735g);
        bhx bhxVarM29272e4 = bhx.m29272e(iM29275h3 - iM29275h4, this.f59735g);
        mapArr[i].put("ImageLength", bhxVarM29272e3);
        mapArr[i].put("ImageWidth", bhxVarM29272e4);
    }

    /* JADX INFO: renamed from: L */
    public final void m39028L() {
        m39026J(0, 5);
        m39026J(0, 4);
        m39026J(5, 4);
        HashMap[] mapArr = this.f59733e;
        bhx bhxVar = (bhx) mapArr[1].get("PixelXDimension");
        bhx bhxVar2 = (bhx) mapArr[1].get("PixelYDimension");
        if (bhxVar != null && bhxVar2 != null) {
            mapArr[0].put("ImageWidth", bhxVar);
            mapArr[0].put("ImageLength", bhxVar2);
        }
        if (mapArr[4].isEmpty() && m39045w(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m39045w(mapArr[4]);
    }

    /* JADX INFO: renamed from: M */
    public final void m39029M(ahx ahxVar) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        chx[][] chxVarArr = f59711V;
        int[] iArr2 = new int[chxVarArr.length];
        int[] iArr3 = new int[chxVarArr.length];
        chx[] chxVarArr2 = f59712W;
        for (chx chxVar : chxVarArr2) {
            m39020D(chxVar.f38131b);
        }
        chx chxVar2 = f59713X;
        String str = chxVar2.f38131b;
        String str2 = chxVar2.f38131b;
        m39020D(str);
        chx chxVar3 = f59714Y;
        m39020D(chxVar3.f38131b);
        int i = 0;
        while (true) {
            int length = chxVarArr.length;
            mapArr = this.f59733e;
            if (i >= length) {
                break;
            }
            for (Object obj : mapArr[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    mapArr[i].remove(entry.getKey());
                }
            }
            i++;
        }
        int i2 = 1;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(chxVarArr2[1].f38131b, bhx.m29269b(0L, this.f59735g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(chxVarArr2[2].f38131b, bhx.m29269b(0L, this.f59735g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(chxVarArr2[3].f38131b, bhx.m29269b(0L, this.f59735g));
        }
        if (this.f59736h) {
            mapArr[4].put(str2, bhx.m29269b(0L, this.f59735g));
            mapArr[4].put(chxVar3.f38131b, bhx.m29269b(this.f59739k, this.f59735g));
        }
        int i3 = 0;
        while (true) {
            int length2 = chxVarArr.length;
            iArr = f59708S;
            if (i3 >= length2) {
                break;
            }
            Iterator it = mapArr[i3].entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                bhx bhxVar = (bhx) ((Map.Entry) it.next()).getValue();
                bhxVar.getClass();
                int i5 = i2;
                int i6 = iArr[bhxVar.f27254a] * bhxVar.f27255b;
                if (i6 > 4) {
                    i4 += i6;
                }
                i2 = i5;
            }
            iArr3[i3] = iArr3[i3] + i4;
            i3++;
            i2 = i2;
        }
        int i7 = i2;
        int size = 8;
        for (int i8 = 0; i8 < chxVarArr.length; i8++) {
            if (!mapArr[i8].isEmpty()) {
                iArr2[i8] = size;
                size = (mapArr[i8].size() * 12) + 6 + iArr3[i8] + size;
            }
        }
        if (this.f59736h) {
            mapArr[4].put(str2, bhx.m29269b(size, this.f59735g));
            this.f59738j = this.f59742n + size;
            size += this.f59739k;
        }
        if (this.f59732d == 4) {
            size += 8;
        }
        if (f59723u) {
            for (int i9 = 0; i9 < chxVarArr.length; i9++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i9), Integer.valueOf(iArr2[i9]), Integer.valueOf(mapArr[i9].size()), Integer.valueOf(iArr3[i9]), Integer.valueOf(size));
            }
        }
        if (!mapArr[i7].isEmpty()) {
            mapArr[0].put(chxVarArr2[i7].f38131b, bhx.m29269b(iArr2[i7], this.f59735g));
        }
        if (!mapArr[r10].isEmpty()) {
            mapArr[0].put(chxVarArr2[r10].f38131b, bhx.m29269b(iArr2[2], this.f59735g));
        }
        if (!mapArr[r10].isEmpty()) {
            mapArr[i7].put(chxVarArr2[r10].f38131b, bhx.m29269b(iArr2[3], this.f59735g));
        }
        int i10 = this.f59732d;
        if (i10 == 4) {
            ahxVar.m26006h(size);
            ahxVar.write(f59720e0);
        } else if (i10 == 13) {
            ahxVar.m26003e(size);
            ahxVar.write(f59696G);
        } else if (i10 == 14) {
            ahxVar.write(f59701L);
            ahxVar.m26003e(size);
        }
        ahxVar.m26004f(this.f59735g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        ahxVar.m26001a(this.f59735g);
        ahxVar.m26006h(42);
        ahxVar.m26005g(8L);
        for (int i11 = 0; i11 < chxVarArr.length; i11++) {
            if (!mapArr[i11].isEmpty()) {
                ahxVar.m26006h(mapArr[i11].size());
                int size2 = (mapArr[i11].size() * 12) + iArr2[i11] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i11].entrySet()) {
                    int i12 = ((chx) f59716a0[i11].get(entry2.getKey())).f38130a;
                    bhx bhxVar2 = (bhx) entry2.getValue();
                    bhxVar2.getClass();
                    int i13 = bhxVar2.f27255b;
                    int i14 = bhxVar2.f27254a;
                    int i15 = iArr[i14] * i13;
                    ahxVar.m26006h(i12);
                    ahxVar.m26006h(i14);
                    ahxVar.m26003e(i13);
                    if (i15 > 4) {
                        ahxVar.m26005g(size2);
                        size2 += i15;
                    } else {
                        ahxVar.write(bhxVar2.f27256c);
                        if (i15 < 4) {
                            while (i15 < 4) {
                                ahxVar.m26002c(0);
                                i15++;
                            }
                        }
                    }
                }
                if (i11 != 0 || mapArr[4].isEmpty()) {
                    ahxVar.m26005g(0L);
                } else {
                    ahxVar.m26005g(iArr2[4]);
                }
                Iterator it2 = mapArr[i11].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((bhx) ((Map.Entry) it2.next()).getValue()).f27256c;
                    if (bArr.length > 4) {
                        ahxVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f59736h) {
            ahxVar.write(m39042s());
        }
        if (this.f59732d == 14 && size % 2 == i7) {
            ahxVar.m26002c(0);
        }
        ahxVar.m26001a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: renamed from: a */
    public final void m39030a() {
        String strM39031h = m39031h("DateTimeOriginal");
        HashMap[] mapArr = this.f59733e;
        if (strM39031h != null && m39031h("DateTime") == null) {
            mapArr[0].put("DateTime", bhx.m29268a(strM39031h));
        }
        if (m39031h("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", bhx.m29269b(0L, this.f59735g));
        }
        if (m39031h("ImageLength") == null) {
            mapArr[0].put("ImageLength", bhx.m29269b(0L, this.f59735g));
        }
        if (m39031h("Orientation") == null) {
            mapArr[0].put("Orientation", bhx.m29269b(0L, this.f59735g));
        }
        if (m39031h("LightSource") == null) {
            mapArr[1].put("LightSource", bhx.m29269b(0L, this.f59735g));
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m39031h(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        bhx bhxVarM39033j = m39033j(str);
        if (bhxVarM39033j != null) {
            if (!f59717b0.contains(str)) {
                return bhxVarM39033j.m29276i(this.f59735g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = bhxVarM39033j.f27254a;
                if (i == 5 || i == 10) {
                    dhx[] dhxVarArr = (dhx[]) bhxVarM39033j.m29277j(this.f59735g);
                    if (dhxVarArr == null || dhxVarArr.length != 3) {
                        Arrays.toString(dhxVarArr);
                        return null;
                    }
                    dhx dhxVar = dhxVarArr[0];
                    Integer numValueOf = Integer.valueOf((int) (dhxVar.f49185a / dhxVar.f49186b));
                    dhx dhxVar2 = dhxVarArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (dhxVar2.f49185a / dhxVar2.f49186b));
                    dhx dhxVar3 = dhxVarArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (dhxVar3.f49185a / dhxVar3.f49186b)));
                }
            } else {
                try {
                    return Double.toString(bhxVarM39033j.m29274g(this.f59735g));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final int m39032i(int i, String str) {
        bhx bhxVarM39033j = m39033j(str);
        if (bhxVarM39033j == null) {
            return i;
        }
        try {
            return bhxVarM39033j.m29275h(this.f59735g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: j */
    public final bhx m39033j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f59711V.length; i++) {
            bhx bhxVar = (bhx) this.f59733e[i].get(str);
            if (bhxVar != null) {
                return bhxVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m39034k(zgx zgxVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new ygx(zgxVar));
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(strExtractMetadata6)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(strExtractMetadata7)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
                strExtractMetadata3 = null;
            }
            HashMap[] mapArr = this.f59733e;
            if (strExtractMetadata != null) {
                mapArr[0].put("ImageWidth", bhx.m29272e(Integer.parseInt(strExtractMetadata), this.f59735g));
            }
            if (strExtractMetadata2 != null) {
                mapArr[0].put("ImageLength", bhx.m29272e(Integer.parseInt(strExtractMetadata2), this.f59735g));
            }
            if (strExtractMetadata3 != null) {
                int i2 = Integer.parseInt(strExtractMetadata3);
                if (i2 == 90) {
                    i = 6;
                } else if (i2 != 180) {
                    i = i2 != 270 ? 1 : 8;
                } else {
                    i = 3;
                }
                mapArr[0].put("Orientation", bhx.m29272e(i, this.f59735g));
            }
            if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                int i3 = Integer.parseInt(strExtractMetadata4);
                int i4 = Integer.parseInt(strExtractMetadata5);
                if (i4 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                zgxVar.m96109a(i3);
                byte[] bArr = new byte[6];
                if (zgxVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i5 = i3 + 6;
                int i6 = i4 - 6;
                if (!Arrays.equals(bArr, f59720e0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i6];
                if (zgxVar.read(bArr2) != i6) {
                    throw new IOException("Can't read exif");
                }
                this.f59742n = i5;
                m39018B(bArr2, 0);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100 A[LOOP:2: B:65:0x00f6->B:70:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:80:0x0139 A[LOOP:0: B:10:0x002a->B:80:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x009f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: l */
    public final void m39035l(p204p.zgx r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ehx.m39035l(p.zgx, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137 A[LOOP:2: B:105:0x012a->B:110:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0140  */
    /* JADX WARN: Code duplicated, block: B:118:0x0146  */
    /* JADX WARN: Code duplicated, block: B:121:0x014e A[LOOP:3: B:116:0x0141->B:121:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0157  */
    /* JADX WARN: Code duplicated, block: B:128:0x0161 A[LOOP:4: B:123:0x0152->B:128:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0167 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x014c A[EDGE_INSN: B:158:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x014c A[EDGE_INSN: B:160:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX INFO: renamed from: m */
    public final int m39036m(BufferedInputStream bufferedInputStream) throws Throwable {
        zgx zgxVar;
        zgx zgxVar2;
        zgx zgxVar3;
        zgx zgxVar4;
        boolean z;
        zgx zgxVar5;
        zgx zgxVar6;
        boolean z2;
        int i;
        byte[] bArr;
        boolean z3;
        int i2;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        boolean z4;
        zgx zgxVar7;
        short s;
        long j;
        bufferedInputStream.mark(CrashReportManager.TIME_WINDOW);
        byte[] bArr4 = new byte[CrashReportManager.TIME_WINDOW];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr5 = f59728z;
            if (i4 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i4] != bArr5[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    if (bArr4[i5] != bytes[i5]) {
                        try {
                            zgxVar2 = new zgx(bArr4);
                            try {
                                long j2 = zgxVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                zgxVar2.read(bArr6);
                                if (Arrays.equals(bArr6, f59690A)) {
                                    if (j2 == 1) {
                                        j2 = zgxVar2.readLong();
                                        j = 16;
                                        if (j2 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j3 = CrashReportManager.TIME_WINDOW;
                                    if (j2 > j3) {
                                        j2 = j3;
                                    }
                                    long j4 = j2 - j;
                                    if (j4 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        boolean z5 = false;
                                        boolean z6 = false;
                                        for (long j5 = 0; j5 < j4 / 4 && zgxVar2.read(bArr7) == 4; j5++) {
                                            if (j5 != 1) {
                                                if (Arrays.equals(bArr7, f59691B)) {
                                                    z5 = true;
                                                } else if (Arrays.equals(bArr7, f59692C)) {
                                                    z6 = true;
                                                }
                                                if (z5 && z6) {
                                                    zgxVar2.close();
                                                    return 12;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                if (zgxVar2 != null) {
                                }
                                zgxVar4 = new zgx(bArr4);
                                ByteOrder byteOrderM39010A = m39010A(zgxVar4);
                                this.f59735g = byteOrderM39010A;
                                zgxVar4.f282729b = byteOrderM39010A;
                                s = zgxVar4.readShort();
                                if (s != 20306) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                zgxVar4.close();
                                if (z) {
                                    return 7;
                                }
                                try {
                                    zgxVar7 = new zgx(bArr4);
                                    try {
                                        ByteOrder byteOrderM39010A2 = m39010A(zgxVar7);
                                        this.f59735g = byteOrderM39010A2;
                                        zgxVar7.f282729b = byteOrderM39010A2;
                                        if (zgxVar7.readShort() == 85) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        zgxVar7.close();
                                    } catch (Exception unused2) {
                                        zgxVar6 = zgxVar7;
                                        if (zgxVar6 != null) {
                                            zgxVar6.close();
                                        }
                                        z2 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        zgxVar5 = zgxVar7;
                                        if (zgxVar5 != null) {
                                            zgxVar5.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    zgxVar6 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zgxVar5 = null;
                                }
                                if (z2) {
                                    return 10;
                                }
                                i = 0;
                                while (true) {
                                    bArr = f59695F;
                                    if (i < bArr.length) {
                                        z3 = true;
                                        break;
                                    }
                                    if (bArr4[i] != bArr[i]) {
                                        z3 = false;
                                        break;
                                    }
                                    i++;
                                }
                                if (z3) {
                                    return 13;
                                }
                                i2 = 0;
                                while (true) {
                                    bArr2 = f59699J;
                                    if (i2 < bArr2.length) {
                                        i3 = 0;
                                        while (true) {
                                            bArr3 = f59700K;
                                            if (i3 < bArr3.length) {
                                                z4 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (z4) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i2] != bArr2[i2]) {
                                        break;
                                    }
                                    i2++;
                                }
                                z4 = false;
                                if (z4) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th3) {
                                th = th3;
                                zgxVar = zgxVar2;
                                if (zgxVar != null) {
                                    zgxVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            zgxVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            zgxVar = null;
                        }
                        zgxVar2.close();
                        try {
                            zgxVar4 = new zgx(bArr4);
                            try {
                                ByteOrder byteOrderM39010A3 = m39010A(zgxVar4);
                                this.f59735g = byteOrderM39010A3;
                                zgxVar4.f282729b = byteOrderM39010A3;
                                s = zgxVar4.readShort();
                                if (s != 20306 || s == 21330) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                zgxVar4.close();
                            } catch (Exception unused5) {
                                if (zgxVar4 != null) {
                                    zgxVar4.close();
                                }
                                z = false;
                            } catch (Throwable th5) {
                                th = th5;
                                zgxVar3 = zgxVar4;
                                if (zgxVar3 != null) {
                                    zgxVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            zgxVar4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            zgxVar3 = null;
                        }
                        if (z) {
                            return 7;
                        }
                        zgxVar7 = new zgx(bArr4);
                        ByteOrder byteOrderM39010A4 = m39010A(zgxVar7);
                        this.f59735g = byteOrderM39010A4;
                        zgxVar7.f282729b = byteOrderM39010A4;
                        if (zgxVar7.readShort() == 85) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zgxVar7.close();
                        if (z2) {
                            return 10;
                        }
                        i = 0;
                        while (true) {
                            bArr = f59695F;
                            if (i < bArr.length) {
                                z3 = true;
                                break;
                            }
                            if (bArr4[i] != bArr[i]) {
                                z3 = false;
                                break;
                            }
                            i++;
                        }
                        if (z3) {
                            return 13;
                        }
                        i2 = 0;
                        while (true) {
                            bArr2 = f59699J;
                            if (i2 < bArr2.length) {
                                i3 = 0;
                                while (true) {
                                    bArr3 = f59700K;
                                    if (i3 < bArr3.length) {
                                        z4 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                        break;
                                        break;
                                    }
                                    i3++;
                                }
                                if (z4) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i2] != bArr2[i2]) {
                                break;
                                break;
                            }
                            i2++;
                        }
                        z4 = false;
                        if (z4) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m39037n(zgx zgxVar) throws IOException {
        int i;
        int i2;
        m39040q(zgxVar);
        HashMap[] mapArr = this.f59733e;
        bhx bhxVar = (bhx) mapArr[1].get("MakerNote");
        if (bhxVar != null) {
            zgx zgxVar2 = new zgx(bhxVar.f27256c);
            zgxVar2.f282729b = this.f59735g;
            byte[] bArr = f59693D;
            byte[] bArr2 = new byte[bArr.length];
            zgxVar2.readFully(bArr2);
            zgxVar2.m96109a(0L);
            byte[] bArr3 = f59694E;
            byte[] bArr4 = new byte[bArr3.length];
            zgxVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                zgxVar2.m96109a(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                zgxVar2.m96109a(12L);
            }
            m39019C(zgxVar2, 6);
            bhx bhxVar2 = (bhx) mapArr[7].get("PreviewImageStart");
            bhx bhxVar3 = (bhx) mapArr[7].get("PreviewImageLength");
            if (bhxVar2 != null && bhxVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", bhxVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", bhxVar3);
            }
            bhx bhxVar4 = (bhx) mapArr[8].get("AspectFrame");
            if (bhxVar4 != null) {
                int[] iArr = (int[]) bhxVar4.m29277j(this.f59735g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                bhx bhxVarM29272e = bhx.m29272e(i5, this.f59735g);
                bhx bhxVarM29272e2 = bhx.m29272e(i6, this.f59735g);
                mapArr[0].put("ImageWidth", bhxVarM29272e);
                mapArr[0].put("ImageLength", bhxVarM29272e2);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m39038o(zgx zgxVar) throws IOException {
        if (f59723u) {
            Objects.toString(zgxVar);
        }
        zgxVar.f282729b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f59695F;
        zgxVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = zgxVar.readInt();
                byte[] bArr2 = new byte[4];
                if (zgxVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f59697H)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f59698I)) {
                    return;
                }
                if (Arrays.equals(bArr2, f59696G)) {
                    byte[] bArr3 = new byte[i];
                    if (zgxVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m39011b(bArr2));
                    }
                    int i3 = zgxVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f59742n = i2;
                        m39018B(bArr3, 0);
                        m39028L();
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                int i4 = i + 4;
                zgxVar.skipBytes(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m39039p(zgx zgxVar) throws IOException {
        zgxVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        zgxVar.read(bArr);
        zgxVar.skipBytes(4);
        zgxVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m39035l(zgxVar, i, 5);
        zgxVar.m96109a(i2);
        zgxVar.f282729b = ByteOrder.BIG_ENDIAN;
        int i3 = zgxVar.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            int unsignedShort = zgxVar.readUnsignedShort();
            int unsignedShort2 = zgxVar.readUnsignedShort();
            if (unsignedShort == f59710U.f38130a) {
                short s = zgxVar.readShort();
                short s2 = zgxVar.readShort();
                bhx bhxVarM29272e = bhx.m29272e(s, this.f59735g);
                bhx bhxVarM29272e2 = bhx.m29272e(s2, this.f59735g);
                HashMap[] mapArr = this.f59733e;
                mapArr[0].put("ImageLength", bhxVarM29272e);
                mapArr[0].put("ImageWidth", bhxVarM29272e2);
                return;
            }
            zgxVar.skipBytes(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m39040q(zgx zgxVar) throws IOException {
        m39047y(zgxVar, zgxVar.f282728a.available());
        m39019C(zgxVar, 0);
        m39027K(zgxVar, 0);
        m39027K(zgxVar, 5);
        m39027K(zgxVar, 4);
        m39028L();
        if (this.f59732d == 8) {
            HashMap[] mapArr = this.f59733e;
            bhx bhxVar = (bhx) mapArr[1].get("MakerNote");
            if (bhxVar != null) {
                zgx zgxVar2 = new zgx(bhxVar.f27256c);
                zgxVar2.f282729b = this.f59735g;
                zgxVar2.m96109a(6L);
                m39019C(zgxVar2, 9);
                bhx bhxVar2 = (bhx) mapArr[9].get("ColorSpace");
                if (bhxVar2 != null) {
                    mapArr[1].put("ColorSpace", bhxVar2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m39041r(zgx zgxVar) throws IOException {
        m39040q(zgxVar);
        HashMap[] mapArr = this.f59733e;
        if (((bhx) mapArr[0].get("JpgFromRaw")) != null) {
            m39035l(zgxVar, this.f59746r, 5);
        }
        bhx bhxVar = (bhx) mapArr[0].get("ISO");
        bhx bhxVar2 = (bhx) mapArr[1].get("PhotographicSensitivity");
        if (bhxVar == null || bhxVar2 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", bhxVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062 A[Catch: all -> 0x0089, Exception -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a8, all -> 0x0089, blocks: (B:36:0x0062, B:39:0x0072, B:41:0x007e, B:48:0x008d, B:49:0x0092, B:50:0x0093, B:51:0x0098, B:52:0x0099, B:53:0x009e), top: B:75:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[Catch: all -> 0x0089, Exception -> 0x00a8, TRY_ENTER, TryCatch #9 {Exception -> 0x00a8, all -> 0x0089, blocks: (B:36:0x0062, B:39:0x0072, B:41:0x007e, B:48:0x008d, B:49:0x0092, B:50:0x0093, B:51:0x0098, B:52:0x0099, B:53:0x009e), top: B:75:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[Catch: all -> 0x0089, Exception -> 0x00a8, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a8, all -> 0x0089, blocks: (B:36:0x0062, B:39:0x0072, B:41:0x007e, B:48:0x008d, B:49:0x0092, B:50:0x0093, B:51:0x0098, B:52:0x0099, B:53:0x009e), top: B:75:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d A[Catch: all -> 0x0089, Exception -> 0x00a8, TRY_ENTER, TryCatch #9 {Exception -> 0x00a8, all -> 0x0089, blocks: (B:36:0x0062, B:39:0x0072, B:41:0x007e, B:48:0x008d, B:49:0x0092, B:50:0x0093, B:51:0x0098, B:52:0x0099, B:53:0x009e), top: B:75:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[Catch: all -> 0x0089, Exception -> 0x00a8, TryCatch #9 {Exception -> 0x00a8, all -> 0x0089, blocks: (B:36:0x0062, B:39:0x0072, B:41:0x007e, B:48:0x008d, B:49:0x0092, B:50:0x0093, B:51:0x0098, B:52:0x0099, B:53:0x009e), top: B:75:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0099 A[Catch: all -> 0x0089, Exception -> 0x00a8, TryCatch #9 {Exception -> 0x00a8, all -> 0x0089, blocks: (B:36:0x0062, B:39:0x0072, B:41:0x007e, B:48:0x008d, B:49:0x0092, B:50:0x0093, B:51:0x0098, B:52:0x0099, B:53:0x009e), top: B:75:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public final byte[] m39042s() throws Throwable {
        Throwable th;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th2;
        byte[] bArr;
        InputStream inputStream = null;
        if (this.f59736h) {
            byte[] bArr2 = this.f59740l;
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                fileInputStream = this.f59731c;
                if (fileInputStream == null) {
                    if (this.f59729a != null) {
                        fileInputStream = new FileInputStream(this.f59729a);
                        fileDescriptor = null;
                        if (fileInputStream == null) {
                            throw new FileNotFoundException();
                        }
                        if (fileInputStream.skip(this.f59738j) != this.f59738j) {
                            throw new IOException("Corrupted image");
                        }
                        bArr = new byte[this.f59739k];
                        if (fileInputStream.read(bArr) != this.f59739k) {
                            throw new IOException("Corrupted image");
                        }
                        this.f59740l = bArr;
                        m39012c(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        return bArr;
                    }
                    FileDescriptor fileDescriptor2 = this.f59730b;
                    if (fileDescriptor2 != null) {
                        FileDescriptor fileDescriptorDup = Os.dup(fileDescriptor2);
                        try {
                            Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream = new FileInputStream(fileDescriptorDup);
                        } catch (Exception unused) {
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th2 = th3;
                            fileDescriptor = fileDescriptorDup;
                            th = th2;
                            m39012c(inputStream);
                            if (fileDescriptor == null) {
                                throw th;
                            }
                            Os.close(fileDescriptor);
                            throw th;
                        }
                    } else {
                        fileInputStream = null;
                        fileDescriptor = null;
                    }
                    if (fileInputStream == null) {
                        throw new FileNotFoundException();
                    }
                    if (fileInputStream.skip(this.f59738j) != this.f59738j) {
                        throw new IOException("Corrupted image");
                    }
                    bArr = new byte[this.f59739k];
                    if (fileInputStream.read(bArr) != this.f59739k) {
                        throw new IOException("Corrupted image");
                    }
                    this.f59740l = bArr;
                    m39012c(fileInputStream);
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    return bArr;
                }
                try {
                    if (!fileInputStream.markSupported()) {
                        m39012c(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                    try {
                        if (fileInputStream == null) {
                            throw new FileNotFoundException();
                        }
                        if (fileInputStream.skip(this.f59738j) != this.f59738j) {
                            throw new IOException("Corrupted image");
                        }
                        bArr = new byte[this.f59739k];
                        if (fileInputStream.read(bArr) != this.f59739k) {
                            throw new IOException("Corrupted image");
                        }
                        this.f59740l = bArr;
                        m39012c(fileInputStream);
                        if (fileDescriptor != null) {
                            try {
                                Os.close(fileDescriptor);
                            } catch (Exception unused2) {
                            }
                        }
                        return bArr;
                    } catch (Exception unused3) {
                    } catch (Throwable th4) {
                        th2 = th4;
                        inputStream = fileInputStream;
                        th = th2;
                        m39012c(inputStream);
                        if (fileDescriptor == null) {
                            throw th;
                        }
                        try {
                            Os.close(fileDescriptor);
                            throw th;
                        } catch (Exception unused4) {
                            throw th;
                        }
                    }
                } catch (Exception unused5) {
                    fileDescriptor = null;
                } catch (Throwable th5) {
                    inputStream = fileInputStream;
                    th = th5;
                    fileDescriptor = null;
                    m39012c(inputStream);
                    if (fileDescriptor == null) {
                        throw th;
                    }
                    Os.close(fileDescriptor);
                    throw th;
                }
                m39012c(fileInputStream);
                if (fileDescriptor != null) {
                    try {
                        Os.close(fileDescriptor);
                    } catch (Exception unused6) {
                    }
                }
            } catch (Exception unused7) {
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th6) {
                th = th6;
                fileDescriptor = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final void m39043t(zgx zgxVar) throws IOException {
        if (f59723u) {
            Objects.toString(zgxVar);
        }
        zgxVar.f282729b = ByteOrder.LITTLE_ENDIAN;
        zgxVar.skipBytes(f59699J.length);
        int i = zgxVar.readInt() + 8;
        int iSkipBytes = zgxVar.skipBytes(f59700K.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (zgxVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = zgxVar.readInt();
                int i3 = iSkipBytes + 8;
                if (Arrays.equals(f59701L, bArr)) {
                    byte[] bArr2 = new byte[i2];
                    if (zgxVar.read(bArr2) == i2) {
                        this.f59742n = i3;
                        m39018B(bArr2, 0);
                        this.f59742n = i3;
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m39011b(bArr));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                int i4 = i3 + i2;
                if (i4 == i) {
                    return;
                }
                if (i4 > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = zgxVar.skipBytes(i2);
                if (iSkipBytes2 != i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i3 + iSkipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m39044v(zgx zgxVar, HashMap map) throws IOException {
        bhx bhxVar = (bhx) map.get("JPEGInterchangeFormat");
        bhx bhxVar2 = (bhx) map.get("JPEGInterchangeFormatLength");
        if (bhxVar == null || bhxVar2 == null) {
            return;
        }
        int iM29275h = bhxVar.m29275h(this.f59735g);
        int iM29275h2 = bhxVar2.m29275h(this.f59735g);
        if (this.f59732d == 7) {
            iM29275h += this.f59743o;
        }
        int iMin = Math.min(iM29275h2, zgxVar.f282730c - iM29275h);
        if (iM29275h <= 0 || iMin <= 0) {
            return;
        }
        this.f59736h = true;
        int i = iM29275h + this.f59742n;
        this.f59738j = i;
        this.f59739k = iMin;
        if (this.f59729a == null && this.f59731c == null && this.f59730b == null) {
            byte[] bArr = new byte[iMin];
            zgxVar.m96109a(i);
            zgxVar.readFully(bArr);
            this.f59740l = bArr;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m39045w(HashMap map) {
        bhx bhxVar = (bhx) map.get("ImageLength");
        bhx bhxVar2 = (bhx) map.get("ImageWidth");
        if (bhxVar == null || bhxVar2 == null) {
            return false;
        }
        return bhxVar.m29275h(this.f59735g) <= 512 && bhxVar2.m29275h(this.f59735g) <= 512;
    }

    /* JADX INFO: renamed from: x */
    public final void m39046x(InputStream inputStream) {
        boolean z = f59723u;
        for (int i = 0; i < f59711V.length; i++) {
            try {
                try {
                    this.f59733e[i] = new HashMap();
                } catch (IOException unused) {
                    this.f59747s = false;
                    m39030a();
                    if (z) {
                        m39048z();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                m39030a();
                if (z) {
                    m39048z();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, CrashReportManager.TIME_WINDOW);
        this.f59732d = m39036m(bufferedInputStream);
        zgx zgxVar = new zgx(bufferedInputStream);
        switch (this.f59732d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m39040q(zgxVar);
                break;
            case 4:
                m39035l(zgxVar, 0, 0);
                break;
            case 7:
                m39037n(zgxVar);
                break;
            case 9:
                m39039p(zgxVar);
                break;
            case 10:
                m39041r(zgxVar);
                break;
            case 12:
                m39034k(zgxVar);
                break;
            case 13:
                m39038o(zgxVar);
                break;
            case 14:
                m39043t(zgxVar);
                break;
        }
        m39025I(zgxVar);
        this.f59747s = true;
        m39030a();
        if (z) {
            m39048z();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m39047y(zgx zgxVar, int i) throws IOException {
        ByteOrder byteOrderM39010A = m39010A(zgxVar);
        this.f59735g = byteOrderM39010A;
        zgxVar.f282729b = byteOrderM39010A;
        int unsignedShort = zgxVar.readUnsignedShort();
        int i2 = this.f59732d;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i3 = zgxVar.readInt();
        if (i3 < 8 || i3 >= i) {
            throw new IOException(s571.m77246e(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0 && zgxVar.skipBytes(i4) != i4) {
            throw new IOException(s571.m77246e(i4, "Couldn't jump to first Ifd: "));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m39048z() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f59733e;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                bhx bhxVar = (bhx) entry.getValue();
                bhxVar.toString();
                bhxVar.m29276i(this.f59735g);
            }
            i++;
        }
    }

    public ehx(InputStream inputStream) throws IOException {
        chx[][] chxVarArr = f59711V;
        this.f59733e = new HashMap[chxVarArr.length];
        this.f59734f = new HashSet(chxVarArr.length);
        this.f59735g = ByteOrder.BIG_ENDIAN;
        this.f59729a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f59731c = (AssetManager.AssetInputStream) inputStream;
            this.f59730b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f59731c = null;
                this.f59730b = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f59731c = null;
                this.f59730b = null;
            }
        } else {
            this.f59731c = null;
            this.f59730b = null;
        }
        m39046x(inputStream);
    }
}
