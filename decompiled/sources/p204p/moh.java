package p204p;

import android.graphics.Bitmap;
import android.media.Image;
import android.text.SpannableStringBuilder;
import io.reactivex.rxjava3.functions.Function;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class moh implements xb71, Function, w4h1 {

    /* JADX INFO: renamed from: a */
    public final long f145675a;

    /* JADX INFO: renamed from: b */
    public final Object f145676b;

    /* JADX INFO: renamed from: c */
    public final Object f145677c;

    /* JADX INFO: renamed from: d */
    public Object f145678d;

    public moh(xap0 xap0Var, String str, String str2, long j) {
        this.f145676b = xap0Var;
        this.f145677c = str;
        this.f145678d = str2;
        this.f145675a = j;
    }

    @Override // p204p.xb71
    /* JADX INFO: renamed from: a */
    public int mo62400a(String str) {
        return pp91.m70521b(str, (if71) this.f145676b, this.f145675a, (yqq) this.f145677c, (hzz) this.f145678d, 0, 480).f166267d.f25460g;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return xap0.m90290a((xap0) this.f145676b, (String) this.f145677c, (String) this.f145678d, (lea0) obj, this.f145675a, false);
    }

    /* JADX INFO: renamed from: b */
    public void m62401b(SpannableStringBuilder spannableStringBuilder, Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        long j = -1;
        if (strGroup != null) {
            String[] strArrSplit = strGroup.split(":");
            long j2 = 0;
            for (int length = strArrSplit.length - 1; length >= 0; length--) {
                try {
                    j2 = (long) ((Long.parseLong(strArrSplit[length]) * Math.pow(60.0d, (strArrSplit.length - 1) - length) * 1000.0d) + j2);
                } catch (NumberFormatException unused) {
                }
            }
            j = j2;
        }
        if (j < 0 || j > this.f145675a) {
            return;
        }
        spannableStringBuilder.setSpan(new xn71(this, j), matcher.start(i), matcher.end(i), 33);
    }

    @Override // p204p.w4h1
    public ob31 zza() {
        int iLimit;
        fsg1 fsg1Var;
        gd71 gd71Var = (gd71) this.f145676b;
        long j = this.f145675a;
        atg1 atg1Var = (atg1) this.f145677c;
        cw40 cw40Var = (cw40) this.f145678d;
        g7d1 g7d1Var = new g7d1(14);
        iqp0 iqp0Var = new iqp0();
        iqp0Var.f104821b = Long.valueOf(j & Long.MAX_VALUE);
        iqp0Var.f104822c = atg1Var;
        iqp0Var.f104823d = Boolean.valueOf(gd71.f78753t);
        Boolean bool = Boolean.TRUE;
        iqp0Var.f104824e = bool;
        iqp0Var.f104825f = bool;
        g7d1Var.f77247b = new lsg1(iqp0Var);
        int i = cw40Var.f42640g;
        if (i == -1) {
            Bitmap bitmap = cw40Var.f42634a;
            ig31.m50506x(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else if (i == 17 || i == 842094169) {
            ByteBuffer byteBuffer = cw40Var.f42635b;
            ig31.m50506x(byteBuffer);
            iLimit = byteBuffer.limit();
        } else if (i != 35) {
            iLimit = 0;
        } else {
            Image.Plane[] planeArrM34087c = cw40Var.m34087c();
            ig31.m50506x(planeArrM34087c);
            iLimit = (planeArrM34087c[0].getBuffer().limit() * 3) / 2;
        }
        yya1 yya1Var = new yya1(24);
        if (i == -1) {
            fsg1Var = fsg1.BITMAP;
        } else if (i == 35) {
            fsg1Var = fsg1.YUV_420_888;
        } else if (i == 842094169) {
            fsg1Var = fsg1.YV12;
        } else if (i != 16) {
            fsg1Var = i != 17 ? fsg1.UNKNOWN_FORMAT : fsg1.NV21;
        } else {
            fsg1Var = fsg1.NV16;
        }
        yya1Var.f277453b = fsg1Var;
        yya1Var.f277454c = Integer.valueOf(Integer.MAX_VALUE & iLimit);
        g7d1Var.f77248c = new gsg1(yya1Var);
        use1 use1Var = new use1();
        gd71Var.f78757h.getClass();
        use1Var.f233622a = v0h1.LATIN;
        g7d1Var.f77249d = new w0h1(use1Var);
        k0h1 k0h1Var = new k0h1(g7d1Var);
        sef0 sef0Var = new sef0();
        sef0Var.f208286c = ((ed71) gd71Var.f78757h).m38517b() ? zsg1.TYPE_THICK : zsg1.TYPE_THIN;
        sef0Var.f208287d = k0h1Var;
        return new ob31(sef0Var, 0);
    }

    public /* synthetic */ moh(gd71 gd71Var, long j, atg1 atg1Var, cw40 cw40Var) {
        this.f145676b = gd71Var;
        this.f145675a = j;
        this.f145677c = atg1Var;
        this.f145678d = cw40Var;
    }

    public moh(if71 if71Var, yqq yqqVar, long j, hzz hzzVar) {
        this.f145676b = if71Var;
        this.f145677c = yqqVar;
        this.f145675a = j;
        this.f145678d = hzzVar;
    }

    public moh(long j, ruq ruqVar) {
        this.f145675a = j;
        this.f145676b = ruqVar;
        this.f145677c = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");
        this.f145678d = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\s?-\\s?((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");
    }

    public moh(long j, f151 f151Var) {
        this.f145675a = j;
        this.f145676b = f151Var;
        String str = h0b1.f86200a;
        this.f145677c = Executors.newSingleThreadScheduledExecutor(new ygi("WatchdogTimer", 2));
    }
}
