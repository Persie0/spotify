package p204p;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class dqa0 {

    /* JADX INFO: renamed from: g */
    public static final SimpleDateFormat f51930g = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);

    /* JADX INFO: renamed from: h */
    public static final Date f51931h = new Date();

    /* JADX INFO: renamed from: a */
    public char f51932a;

    /* JADX INFO: renamed from: b */
    public String f51933b;

    /* JADX INFO: renamed from: c */
    public String f51934c;

    /* JADX INFO: renamed from: d */
    public Throwable f51935d;

    /* JADX INFO: renamed from: e */
    public long f51936e;

    /* JADX INFO: renamed from: f */
    public long f51937f;

    /* JADX INFO: renamed from: a */
    public final void m36636a(StringBuilder sb) {
        sb.append(this.f51932a);
        sb.append('\t');
        Date date = f51931h;
        date.setTime(this.f51936e);
        SimpleDateFormat simpleDateFormat = f51930g;
        synchronized (simpleDateFormat) {
            sb.append(simpleDateFormat.format(date));
        }
        sb.append('\t');
        sb.append(this.f51933b);
        sb.append('\t');
        sb.append(this.f51934c);
        if (this.f51935d != null) {
            sb.append(' ');
            sb.append(Log.getStackTraceString(this.f51935d));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        m36636a(sb);
        return sb.toString();
    }
}
