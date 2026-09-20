package p204p;

import android.os.SystemClock;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class ing1 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final HashMap f103977f = new HashMap();

    /* JADX INFO: renamed from: a */
    public int f103978a;

    /* JADX INFO: renamed from: b */
    public long f103979b;

    /* JADX INFO: renamed from: c */
    public long f103980c;

    /* JADX INFO: renamed from: d */
    public long f103981d = 2147483647L;

    /* JADX INFO: renamed from: e */
    public long f103982e = -2147483648L;

    public ing1(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void mo42223a() {
        this.f103979b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    /* JADX INFO: renamed from: c */
    public void mo42224c(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f103980c;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.f103978a = 0;
            this.f103979b = 0L;
            this.f103981d = 2147483647L;
            this.f103982e = -2147483648L;
        }
        this.f103980c = jElapsedRealtimeNanos;
        this.f103978a++;
        this.f103981d = Math.min(this.f103981d, j);
        this.f103982e = Math.max(this.f103982e, j);
        if (this.f103978a % 50 == 0) {
            Locale locale = Locale.US;
            opg1.m67527a();
        }
        if (this.f103978a % CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER == 0) {
            this.f103978a = 0;
            this.f103979b = 0L;
            this.f103981d = 2147483647L;
            this.f103982e = -2147483648L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f103979b;
        if (j == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        mo42225e(j);
    }

    /* JADX INFO: renamed from: e */
    public void mo42225e(long j) {
        mo42224c((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
