package p204p;

import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class cul extends mhf1 {

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f42148c;

    /* JADX INFO: renamed from: d */
    public final gj5 f42149d;

    public cul() {
        gj5 gj5Var = new gj5();
        gj5Var.f80370a = new Object();
        gj5Var.f80372c = Long.MIN_VALUE;
        this.f42148c = new AtomicInteger();
        this.f42149d = gj5Var;
    }

    @Override // p204p.mhf1
    /* JADX INFO: renamed from: o */
    public final long mo33930o() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[PHI: r4
      0x0032: PHI (r4v7 int) = (r4v0 int), (r4v8 int), (r4v9 int) binds: [B:11:0x0028, B:13:0x002b, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p204p.mhf1
    /* JADX INFO: renamed from: r */
    public final void mo33931r(ytl ytlVar) {
        int i;
        int i2;
        why0.m88178a("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            long j = ytlVar.f276138a;
            int iM38547C = edb.m38547C(ytlVar.f276139b);
            int i3 = 2;
            int i4 = 1;
            if (iM38547C == 0) {
                i = 0;
                i2 = 1;
            } else if (iM38547C != 1) {
                i2 = 0;
                i = 0;
            } else {
                i2 = 2;
                i = 0;
            }
            int i5 = ytlVar.f276140c;
            int iOrdinal = ytlVar.f276141d.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i3 = 3;
                    if (iOrdinal != 3) {
                        i3 = 4;
                        if (iOrdinal != 4) {
                            i4 = i;
                        } else {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                } else {
                    i4 = i3;
                }
            }
            int iM38547C2 = edb.m38547C(z0k0.m95065b(ytlVar.f276142e));
            x8c x8cVar = ytlVar.f276143f;
            int i6 = x8cVar.f259109b;
            int i7 = x8cVar.f259110c;
            int i8 = x8cVar.f259111d;
            int i9 = x8cVar.f259112e;
            x8c x8cVar2 = ytlVar.f276144g;
            int i10 = -1;
            int i11 = x8cVar2 == null ? -1 : x8cVar2.f259109b;
            int i12 = x8cVar2 == null ? -1 : x8cVar2.f259110c;
            int i13 = x8cVar2 == null ? -1 : x8cVar2.f259111d;
            if (x8cVar2 != null) {
                i10 = x8cVar2.f259112e;
            }
            jul.m54342a(j, i2, i5, i4, iM38547C2, i6, i7, i8, i9, i11, i12, i13, i10, ytlVar.f276145h);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // p204p.mhf1
    /* JADX INFO: renamed from: s */
    public final void mo33932s(long j, xtl xtlVar, x8c x8cVar) {
        int i;
        try {
            why0.m88178a("CronetLoggerImpl#writeCronetEngineCreation");
            try {
                nlx nlxVar = new nlx(xtlVar.f265887f);
                int i2 = x8cVar.f259109b;
                int i3 = x8cVar.f259110c;
                int i4 = x8cVar.f259111d;
                int i5 = x8cVar.f259112e;
                boolean z = xtlVar.f265885d;
                boolean z2 = xtlVar.f265884c;
                int i6 = xtlVar.f265886e;
                int i7 = 1;
                if (i6 == 0) {
                    i = i7;
                } else if (i6 == 1) {
                    i = 2;
                } else if (i6 == 2) {
                    i = 3;
                } else {
                    if (i6 != 3) {
                        throw new IllegalArgumentException("Expected httpCacheMode to range from 0 to 3");
                    }
                    i7 = 4;
                    i = i7;
                }
                boolean z3 = xtlVar.f265882a;
                boolean z4 = xtlVar.f265883b;
                boolean z5 = xtlVar.f265888g;
                String strM64751a = nlxVar.m64751a();
                Object objCast = null;
                int iM38547C = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "store_server_configs_in_properties", null, Boolean.class)));
                int iIntValue = ((Integer) nlxVar.m64752b("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
                int iIntValue2 = ((Integer) nlxVar.m64752b("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
                int iM38547C2 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)));
                int iM38547C3 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "close_sessions_on_ip_change", null, Boolean.class)));
                int iM38547C4 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class)));
                int iM38547C5 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "migrate_sessions_early_v2", null, Boolean.class)));
                int iM38547C6 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "disable_bidirectional_streams", null, Boolean.class)));
                int iIntValue3 = ((Integer) nlxVar.m64752b("QUIC", "max_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                int iIntValue4 = ((Integer) nlxVar.m64752b("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                int iM38547C7 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "enable_socket_recv_optimization", null, Boolean.class)));
                int iM38547C8 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("AsyncDNS", "enable", null, Boolean.class)));
                int iM38547C9 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "enable", null, Boolean.class)));
                int iIntValue5 = ((Integer) nlxVar.m64752b("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
                int iIntValue6 = ((Integer) nlxVar.m64752b("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
                int iIntValue7 = ((Integer) nlxVar.m64752b("StaleDNS", "max_stale_uses", -1, Integer.class)).intValue();
                int iM38547C10 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "allow_other_network", null, Boolean.class)));
                int iM38547C11 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "persist_to_disk", null, Boolean.class)));
                int iIntValue8 = ((Integer) nlxVar.m64752b("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
                int iM38547C12 = edb.m38547C(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class)));
                JSONObject jSONObject = nlxVar.f155180a;
                if (jSONObject.length() != 0) {
                    try {
                        objCast = Boolean.class.cast(jSONObject.get("disable_ipv6_on_wifi"));
                    } catch (ClassCastException | JSONException e) {
                        if (Log.isLoggable("nlx", 2)) {
                            e.getMessage();
                        }
                    }
                }
                jul.m54344c(j, i2, i3, i4, i5, 3, z, z2, i, z3, z4, z5, strM64751a, iM38547C, iIntValue, iIntValue2, iM38547C2, iM38547C3, iM38547C4, iM38547C5, iM38547C6, iIntValue3, iIntValue4, iM38547C7, iM38547C8, iM38547C9, iIntValue5, iIntValue6, iIntValue7, iM38547C10, iM38547C11, iIntValue8, iM38547C12, edb.m38547C(z0k0.m95065b((Boolean) objCast)), xtlVar.f265889h, Process.myUid());
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            if (Log.isLoggable("cul", 3)) {
                e2.getMessage();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0218  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.atomic.AtomicInteger] */
    @Override // p204p.mhf1
    /* JADX INFO: renamed from: t */
    public final void mo33933t(long j, aul aulVar) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bytes;
        gj5 gj5Var = this.f42149d;
        synchronized (gj5Var.f80370a) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (gj5Var.f80372c + 1000 <= jElapsedRealtime) {
                    gj5Var.f80371b = 1;
                    gj5Var.f80372c = jElapsedRealtime;
                } else {
                    int i8 = gj5Var.f80371b;
                    if (i8 >= 1) {
                        this.f42148c.incrementAndGet();
                        return;
                    }
                    gj5Var.f80371b = i8 + 1;
                }
                ?? r2 = this.f42148c;
                int andSet = r2.getAndSet(0);
                try {
                    try {
                        why0.m88178a("CronetLoggerImpl#writeCronetTrafficReported");
                        try {
                            long j2 = aulVar.f19953a;
                            hc1.m47079h(j2, "Request header size is negative");
                            double d = j2 / 1024.0d;
                            if (hc1.m47084m(d, 0, 1)) {
                                i = 1;
                            } else if (hc1.m47084m(d, 1, 10)) {
                                i = 2;
                            } else if (hc1.m47084m(d, 10, 25)) {
                                i = 3;
                            } else if (hc1.m47084m(d, 25, 50)) {
                                i = 4;
                            } else {
                                i = hc1.m47084m(d, 50, 100) ? 5 : 6;
                            }
                            long j3 = aulVar.f19954b;
                            hc1.m47079h(j3, "Request body size is negative");
                            double d2 = j3 / 1024.0d;
                            if (d2 == 0.0d) {
                                i2 = 1;
                            } else if (d2 > 0.0d && d2 < 10.0d) {
                                i2 = 2;
                            } else if (hc1.m47084m(d2, 10, 50)) {
                                i2 = 3;
                            } else if (hc1.m47084m(d2, 50, 200)) {
                                i2 = 4;
                            } else if (hc1.m47084m(d2, 200, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER)) {
                                i2 = 5;
                            } else if (hc1.m47084m(d2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 1000)) {
                                i2 = 6;
                            } else {
                                i2 = hc1.m47084m(d2, 1000, CrashReportManager.TIME_WINDOW) ? 7 : 8;
                            }
                            long j4 = aulVar.f19955c;
                            hc1.m47079h(j4, "Response header size is negative");
                            double d3 = j4 / 1024.0d;
                            if (hc1.m47084m(d3, 0, 1)) {
                                i4 = 1;
                                i3 = 200;
                            } else if (hc1.m47084m(d3, 1, 10)) {
                                i3 = 200;
                                i4 = 2;
                            } else if (hc1.m47084m(d3, 10, 25)) {
                                i3 = 200;
                                i4 = 3;
                            } else if (hc1.m47084m(d3, 25, 50)) {
                                i3 = 200;
                                i4 = 4;
                            } else if (hc1.m47084m(d3, 50, 100)) {
                                i3 = 200;
                                i4 = 5;
                            } else {
                                i3 = 200;
                                i4 = 6;
                            }
                            long j5 = aulVar.f19956d;
                            hc1.m47079h(j5, "Response body size is negative");
                            double d4 = j5 / 1024.0d;
                            if (d4 == 0.0d) {
                                i5 = 1;
                            } else if (d4 > 0.0d && d4 < 10.0d) {
                                i5 = 2;
                            } else if (hc1.m47084m(d4, 10, 50)) {
                                i5 = 3;
                            } else if (hc1.m47084m(d4, 50, i3)) {
                                i5 = 4;
                            } else if (hc1.m47084m(d4, i3, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER)) {
                                i5 = 5;
                            } else if (hc1.m47084m(d4, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 1000)) {
                                i5 = 6;
                            } else {
                                i5 = hc1.m47084m(d4, 1000, CrashReportManager.TIME_WINDOW) ? 7 : 8;
                            }
                            int i9 = aulVar.f19957e;
                            String str = aulVar.f19960h;
                            try {
                                MessageDigest messageDigest = jd20.f111225b;
                                long j6 = 0;
                                if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                                    j6 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                                }
                                long j7 = j6;
                                int millis = (int) aulVar.f19958f.toMillis();
                                int millis2 = (int) aulVar.f19959g.toMillis();
                                int iM38547C = edb.m38547C(aulVar.f19961i);
                                if (iM38547C == 0) {
                                    i6 = 1;
                                } else if (iM38547C != 1) {
                                    i6 = iM38547C != 2 ? 0 : 3;
                                } else {
                                    i6 = 2;
                                }
                                int i10 = aulVar.f19962j;
                                int i11 = aulVar.f19963k;
                                int i12 = aulVar.f19964l;
                                Boolean bool = Boolean.FALSE;
                                int iM38547C2 = edb.m38547C(z0k0.m95065b(bool));
                                int iM38547C3 = edb.m38547C(z0k0.m95065b(Boolean.valueOf(aulVar.f19965m)));
                                int i13 = aulVar.f19966n;
                                int iM38547C4 = edb.m38547C(1);
                                if (iM38547C4 != 1) {
                                    i7 = iM38547C4 != 2 ? 0 : 100;
                                } else {
                                    i7 = 1;
                                }
                                jul.m54343b(j, i, i2, i4, i5, i9, j7, millis, millis2, andSet, i6, i10, i11, i12, iM38547C2, iM38547C3, i13, 0, i7, edb.m38547C(z0k0.m95065b(bool)), aulVar.f19967o, 3);
                                Trace.endSection();
                            } catch (Throwable th) {
                                th = th;
                                r2 = andSet;
                                Throwable th2 = th;
                                try {
                                    Trace.endSection();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e) {
                        e = e;
                        r2 = andSet;
                        this.f42148c.addAndGet(r2);
                        if (Log.isLoggable("cul", 3)) {
                            e.getMessage();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    this.f42148c.addAndGet(r2);
                    if (Log.isLoggable("cul", 3)) {
                        e.getMessage();
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
