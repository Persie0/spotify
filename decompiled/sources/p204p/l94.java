package p204p;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import p196j$.time.Duration;
import p196j$.time.TimeConversions;
import p196j$.util.DateRetargetClass;

/* JADX INFO: loaded from: classes11.dex */
public final class l94 extends ICronetEngineBuilder {

    /* JADX INFO: renamed from: b */
    public static boolean f130995b;

    /* JADX INFO: renamed from: c */
    public static boolean f130996c;

    /* JADX INFO: renamed from: a */
    public final HttpEngine.Builder f130997a;

    public l94(HttpEngine.Builder builder) {
        this.f130997a = builder;
    }

    /* JADX INFO: renamed from: a */
    public static int m58493a(int i) {
        String str;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 0;
        }
        if (iM38547C == 1) {
            return 1;
        }
        if (iM38547C == 2) {
            return 2;
        }
        if (i == 1) {
            str = "UNSET";
        } else if (i != 2) {
            str = i != 3 ? "null" : "FALSE";
        } else {
            str = "TRUE";
        }
        throw new AssertionError("Invalid OptionalBoolean value: ".concat(str));
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        this.f130997a.addPublicKeyPins(str, set, z, TimeConversions.convert(DateRetargetClass.toInstant(date)));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.f130997a.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        return new n94(this.f130997a.build());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.f130997a.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.f130997a.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.f130997a.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!f130996c) {
            f130996c = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.f130997a.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.f130997a.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.f130997a.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        nlx nlxVar = new nlx(str);
        HttpEngine.Builder builder = this.f130997a;
        ConnectionMigrationOptions.Builder builder2 = new ConnectionMigrationOptions.Builder();
        builder2.setDefaultNetworkMigration(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class))));
        builder2.setPathDegradationMigration(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "allow_port_migration", null, Boolean.class))));
        int iM95065b = z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "migrate_sessions_early_v2", null, Boolean.class));
        builder2.setAllowNonDefaultNetworkUsage(m58493a(iM95065b));
        if (iM95065b == 2) {
            builder2.setPathDegradationMigration(m58493a(2));
        }
        builder.setConnectionMigrationOptions(builder2.build());
        HttpEngine.Builder builder3 = this.f130997a;
        DnsOptions.StaleDnsOptions.Builder builder4 = new DnsOptions.StaleDnsOptions.Builder();
        int iIntValue = ((Integer) nlxVar.m64752b("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
        if (iIntValue != -1) {
            builder4.setFreshLookupTimeout(TimeConversions.convert(Duration.ofMillis(iIntValue)));
        }
        int iIntValue2 = ((Integer) nlxVar.m64752b("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
        if (iIntValue2 != -1) {
            builder4.setMaxExpiredDelay(TimeConversions.convert(Duration.ofMillis(iIntValue2)));
        }
        builder4.setAllowCrossNetworkUsage(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "allow_other_network", null, Boolean.class)))).setUseStaleOnNameNotResolved(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class))));
        DnsOptions.Builder builder5 = new DnsOptions.Builder();
        builder5.setUseHttpStackDnsResolver(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("AsyncDNS", "enable", null, Boolean.class)))).setStaleDns(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "enable", null, Boolean.class)))).setStaleDnsOptions(builder4.build()).setPreestablishConnectionsToStaleDnsResults(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(m58493a(z0k0.m95065b((Boolean) nlxVar.m64752b("StaleDNS", "persist_to_disk", null, Boolean.class))));
        int iIntValue3 = ((Integer) nlxVar.m64752b("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
        if (iIntValue3 != -1) {
            builder5.setPersistHostCachePeriod(TimeConversions.convert(Duration.ofMillis(iIntValue3)));
        }
        builder3.setDnsOptions(builder5.build());
        HttpEngine.Builder builder6 = this.f130997a;
        QuicOptions.Builder builder7 = new QuicOptions.Builder();
        if (((String) nlxVar.m64752b("QUIC", "host_whitelist", null, String.class)) != null) {
            for (String str2 : ((String) nlxVar.m64752b("QUIC", "host_whitelist", null, String.class)).split(",")) {
                builder7.addAllowedQuicHost(str2);
            }
        }
        int iIntValue4 = ((Integer) nlxVar.m64752b("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
        if (iIntValue4 != -1) {
            builder7.setInMemoryServerConfigsCacheSize(iIntValue4);
        }
        String str3 = (String) nlxVar.m64752b("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder7.setHandshakeUserAgent(str3);
        }
        int iIntValue5 = ((Integer) nlxVar.m64752b("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
        if (iIntValue5 != -1) {
            builder7.setIdleConnectionTimeout(TimeConversions.convert(Duration.ofSeconds(iIntValue5)));
        }
        builder6.setQuicOptions(builder7.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!f130995b) {
            f130995b = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.f130997a.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f130997a.setUserAgent(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
