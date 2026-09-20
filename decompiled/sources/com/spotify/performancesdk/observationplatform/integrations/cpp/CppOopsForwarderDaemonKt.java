package com.spotify.performancesdk.observationplatform.integrations.cpp;

import kotlin.Metadata;
import p204p.acf0;
import p204p.bm51;
import p204p.dq60;
import p204p.rcf0;
import p204p.scf0;
import p204p.tcf0;
import p204p.ucf0;
import p204p.vcf0;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m24212d2 = {"", "unit", "Lp/vcf0;", "parseUnit", "(Ljava/lang/String;)Lp/vcf0;", "instrument", "Lp/acf0;", "parseInstrument", "(Ljava/lang/String;)Lp/acf0;", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CppOopsForwarderDaemonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final acf0 parseInstrument(String str) {
        int iHashCode = str.hashCode();
        acf0 acf0Var = acf0.Gauge;
        if (iHashCode != -22049149) {
            if (iHashCode == 98128121) {
                str.equals("gauge");
            } else if (iHashCode == 957830652 && str.equals("counter")) {
                return acf0.Counter;
            }
        } else if (str.equals("up_down_counter")) {
            return acf0.UpDownCounter;
        }
        return acf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vcf0 parseUnit(String str) {
        if (wj50.m88271j(str, "By")) {
            return rcf0.f197861a;
        }
        if (wj50.m88271j(str, "s")) {
            return ucf0.f229029a;
        }
        if (wj50.m88271j(str, "1")) {
            return tcf0.f219080a;
        }
        return (bm51.m29803n0(str, "{", false) && bm51.m29796g0(str, "}", false)) ? new scf0(dq60.m36609i(1, 1, str)) : new scf0(str);
    }
}
