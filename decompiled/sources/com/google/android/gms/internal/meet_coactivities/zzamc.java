package com.google.android.gms.internal.meet_coactivities;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.j561;
import p204p.pka1;

/* JADX INFO: loaded from: classes4.dex */
final class zzamc implements zzaau {
    private final j561 zzc;
    private final InetSocketAddress zzd;
    private static final Logger zza = Logger.getLogger(zzamc.class.getName());
    private static final zzama zze = new zzama();
    private static final j561 zzb = new zzamb();

    public zzamc() {
        j561 j561Var = zzb;
        zzama zzamaVar = zze;
        String str = System.getenv("GRPC_PROXY_EXP");
        j561Var.getClass();
        this.zzc = j561Var;
        zzamaVar.getClass();
        if (str == null) {
            this.zzd = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.zzd = new InetSocketAddress(strArrSplit[0], i);
    }

    private final zzaat zzc(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI(pka1.f178421b, null, zzahx.zzc(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.zzc.get();
                if (proxySelector == null) {
                    zza.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationZza = zzama.zza(zzahx.zzc(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), pka1.f178421b, "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                zzxt zzxtVarZza = zzxv.zza();
                zzxtVarZza.zzc(inetSocketAddress);
                zzxtVarZza.zzb(inetSocketAddress2);
                if (passwordAuthenticationZza == null) {
                    return zzxtVarZza.zze();
                }
                zzxtVarZza.zzd(passwordAuthenticationZza.getUserName());
                zzxtVarZza.zza(passwordAuthenticationZza.getPassword() != null ? new String(passwordAuthenticationZza.getPassword()) : null);
                return zzxtVarZza.zze();
            } catch (URISyntaxException e) {
                zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                return null;
            }
        } catch (Throwable th) {
            zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaau
    public final zzaat zza(SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.zzd;
        if (inetSocketAddress == null) {
            return zzc((InetSocketAddress) socketAddress);
        }
        zzxt zzxtVarZza = zzxv.zza();
        zzxtVarZza.zzb(inetSocketAddress);
        zzxtVarZza.zzc((InetSocketAddress) socketAddress);
        return zzxtVarZza.zze();
    }
}
