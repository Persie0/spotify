package com.spotify.performancesdk.observationplatform.integrations.cpp;

import kotlin.Metadata;
import p204p.b9k;
import p204p.eh00;
import p204p.hgm;
import p204p.qe70;
import p204p.t050;
import p204p.z8k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lp/z8k;", "contextRuntime", "Lp/t050;", "installCppOopsForwarderDaemon", "(Lp/z8k;)Lp/t050;", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NucleusCppOopsForwarderDaemonInstallerKt {

    /* JADX INFO: renamed from: com.spotify.performancesdk.observationplatform.integrations.cpp.NucleusCppOopsForwarderDaemonInstallerKt$installCppOopsForwarderDaemon$1 */
    @Metadata(m24211d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m24212d2 = {"Lp/hgm;", "invoke", "()Lp/hgm;", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
    public static final class C11571 extends qe70 implements eh00 {
        public static final C11571 INSTANCE = new C11571();

        public C11571() {
            super(0);
        }

        @Override // p204p.eh00
        public final hgm invoke() {
            return new CppOopsForwarderDaemon();
        }
    }

    public static final t050 installCppOopsForwarderDaemon(z8k z8kVar) {
        return ((b9k) z8kVar).m28489g("CppOopsForwarderDaemon", C11571.INSTANCE);
    }
}
