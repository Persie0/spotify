package p204p;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class cw40 {

    /* JADX INFO: renamed from: a */
    public volatile Bitmap f42634a;

    /* JADX INFO: renamed from: b */
    public volatile ByteBuffer f42635b;

    /* JADX INFO: renamed from: c */
    public volatile jhc1 f42636c;

    /* JADX INFO: renamed from: d */
    public final int f42637d;

    /* JADX INFO: renamed from: e */
    public final int f42638e;

    /* JADX INFO: renamed from: f */
    public final int f42639f;

    /* JADX INFO: renamed from: g */
    public final int f42640g;

    public cw40(Bitmap bitmap) {
        ig31.m50506x(bitmap);
        this.f42634a = bitmap;
        this.f42637d = bitmap.getWidth();
        this.f42638e = bitmap.getHeight();
        m34083f(0);
        this.f42639f = 0;
        this.f42640g = -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m34083f(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        ig31.m50497o("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX INFO: renamed from: g */
    public static void m34084g(int i, int i2, long j, int i3, int i4, int i5, int i6) throws Throwable {
        qog1 qog1Var;
        jeg1 jeg1Var;
        y7h1 y7h1Var;
        HashMap map;
        ycg1 ycg1Var;
        rdg1 rdg1Var;
        String strM52806a;
        synchronized (ipg1.class) {
            byte b = (byte) (((byte) 1) | 2);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            yng1 yng1Var = new yng1();
            synchronized (ipg1.class) {
                try {
                    if (ipg1.f104501a == null) {
                        ipg1.f104501a = new epg1(0);
                    }
                    qog1Var = (qog1) ipg1.f104501a.m38156V0(yng1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            jeg1Var = jeg1.INPUT_IMAGE_CONSTRUCTION;
            y7h1Var = qog1Var.f190948e;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            map = qog1Var.f190952i;
            if (map.get(jeg1Var) != null && jElapsedRealtime2 - ((Long) map.get(jeg1Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return;
            }
            map.put(jeg1Var, Long.valueOf(jElapsedRealtime2));
            hsb1 hsb1Var = new hsb1(7);
            if (i != -1) {
                ycg1Var = ycg1.BITMAP;
            } else if (i != 35) {
                ycg1Var = ycg1.YUV_420_888;
            } else if (i != 842094169) {
                ycg1Var = ycg1.YV12;
            } else if (i != 16) {
                ycg1Var = ycg1.NV16;
            } else if (i != 17) {
                ycg1Var = ycg1.UNKNOWN_FORMAT;
            } else {
                ycg1Var = ycg1.NV21;
            }
            hsb1Var.f94656d = ycg1Var;
            if (i2 != 1) {
                rdg1Var = rdg1.BITMAP;
            } else if (i2 != 2) {
                rdg1Var = rdg1.BYTEARRAY;
            } else if (i2 != 3) {
                rdg1Var = rdg1.BYTEBUFFER;
            } else if (i2 != 4) {
                rdg1Var = rdg1.ANDROID_MEDIA_IMAGE;
            } else {
                rdg1Var = rdg1.FILEPATH;
            }
            hsb1Var.f94655c = rdg1Var;
            hsb1Var.f94657e = Integer.valueOf(i5 & Alert.DURATION_SHOW_INDEFINITELY);
            hsb1Var.f94659g = Integer.valueOf(i3 & Alert.DURATION_SHOW_INDEFINITELY);
            hsb1Var.f94658f = Integer.valueOf(i4 & Alert.DURATION_SHOW_INDEFINITELY);
            hsb1Var.f94654b = Long.valueOf(jElapsedRealtime & Long.MAX_VALUE);
            hsb1Var.f94660h = Integer.valueOf(i6 & Alert.DURATION_SHOW_INDEFINITELY);
            udg1 udg1Var = new udg1(hsb1Var);
            f7d1 f7d1Var = new f7d1(15);
            f7d1Var.f66660d = udg1Var;
            red1 red1Var = new red1(f7d1Var);
            if (y7h1Var.mo1518j()) {
                strM52806a = (String) y7h1Var.mo1515g();
            } else {
                strM52806a = ja80.f110403c.m52806a(qog1Var.f190950g);
            }
            f8g1.f66988a.execute(new nhy0(qog1Var, red1Var, strM52806a));
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j;
        jeg1Var = jeg1.INPUT_IMAGE_CONSTRUCTION;
        y7h1Var = qog1Var.f190948e;
        long jElapsedRealtime4 = SystemClock.elapsedRealtime();
        map = qog1Var.f190952i;
        if (map.get(jeg1Var) != null) {
            return;
        }
        map.put(jeg1Var, Long.valueOf(jElapsedRealtime4));
        hsb1 hsb1Var2 = new hsb1(7);
        if (i != -1) {
            ycg1Var = ycg1.BITMAP;
        } else if (i != 35) {
            ycg1Var = ycg1.YUV_420_888;
        } else if (i != 842094169) {
            ycg1Var = ycg1.YV12;
        } else if (i != 16) {
            ycg1Var = ycg1.NV16;
        } else if (i != 17) {
            ycg1Var = ycg1.UNKNOWN_FORMAT;
        } else {
            ycg1Var = ycg1.NV21;
        }
        hsb1Var2.f94656d = ycg1Var;
        if (i2 != 1) {
            rdg1Var = rdg1.BITMAP;
        } else if (i2 != 2) {
            rdg1Var = rdg1.BYTEARRAY;
        } else if (i2 != 3) {
            rdg1Var = rdg1.BYTEBUFFER;
        } else if (i2 != 4) {
            rdg1Var = rdg1.ANDROID_MEDIA_IMAGE;
        } else {
            rdg1Var = rdg1.FILEPATH;
        }
        hsb1Var2.f94655c = rdg1Var;
        hsb1Var2.f94657e = Integer.valueOf(i5 & Alert.DURATION_SHOW_INDEFINITELY);
        hsb1Var2.f94659g = Integer.valueOf(i3 & Alert.DURATION_SHOW_INDEFINITELY);
        hsb1Var2.f94658f = Integer.valueOf(i4 & Alert.DURATION_SHOW_INDEFINITELY);
        hsb1Var2.f94654b = Long.valueOf(jElapsedRealtime3 & Long.MAX_VALUE);
        hsb1Var2.f94660h = Integer.valueOf(i6 & Alert.DURATION_SHOW_INDEFINITELY);
        udg1 udg1Var2 = new udg1(hsb1Var2);
        f7d1 f7d1Var2 = new f7d1(15);
        f7d1Var2.f66660d = udg1Var2;
        red1 red1Var2 = new red1(f7d1Var2);
        if (y7h1Var.mo1518j()) {
            strM52806a = (String) y7h1Var.mo1515g();
        } else {
            strM52806a = ja80.f110403c.m52806a(qog1Var.f190950g);
        }
        f8g1.f66988a.execute(new nhy0(qog1Var, red1Var2, strM52806a));
    }

    /* JADX INFO: renamed from: a */
    public final int m34085a() {
        return this.f42640g;
    }

    /* JADX INFO: renamed from: b */
    public final int m34086b() {
        return this.f42638e;
    }

    /* JADX INFO: renamed from: c */
    public final Image.Plane[] m34087c() {
        if (this.f42636c == null) {
            return null;
        }
        return ((Image) this.f42636c.f112391b).getPlanes();
    }

    /* JADX INFO: renamed from: d */
    public final int m34088d() {
        return this.f42639f;
    }

    /* JADX INFO: renamed from: e */
    public final int m34089e() {
        return this.f42637d;
    }

    public cw40(Image image, int i, int i2, int i3) {
        this.f42636c = new jhc1(image, 10);
        this.f42637d = i;
        this.f42638e = i2;
        m34083f(i3);
        this.f42639f = i3;
        this.f42640g = 35;
    }

    public cw40(ByteBuffer byteBuffer, int i, int i2, int i3) {
        ig31.m50506x(byteBuffer);
        this.f42635b = byteBuffer;
        ig31.m50497o("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.f42637d = i;
        this.f42638e = i2;
        m34083f(i3);
        this.f42639f = i3;
        this.f42640g = 17;
    }
}
