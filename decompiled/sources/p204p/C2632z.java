package p204p;

import com.comscore.android.ConnectivityType;
import io.ably.lib.rest.AbstractC1406a;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ErrorInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: p.z */
/* JADX INFO: loaded from: classes16.dex */
public final class C2632z extends qg50 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1406a f277923b;

    public /* synthetic */ C2632z(AbstractC1406a abstractC1406a) {
        this.f277923b = abstractC1406a;
    }

    /* JADX INFO: renamed from: a */
    public mmc m94998a(String str, ChannelOptions channelOptions) {
        C2596y0 c2596y0 = (C2596y0) this.f277923b;
        mmc mmcVar = new mmc(c2596y0, str, channelOptions);
        C2632z c2632z = c2596y0.f7161e;
        ConcurrentHashMap concurrentHashMap = c2632z.f188382a;
        if (((nmc) concurrentHashMap.get(str)) == null) {
            AbstractC1406a abstractC1406a = c2632z.f277923b;
            nmc nmcVar = new nmc();
            th30.m80824d(str);
            concurrentHashMap.put(str, nmcVar);
        }
        mmc mmcVar2 = (mmc) this.f188382a.putIfAbsent(str, mmcVar);
        if (mmcVar2 == null) {
            return mmcVar;
        }
        if (channelOptions != null) {
            znc zncVar = mmcVar2.f28786e;
            znc zncVar2 = znc.attaching;
            znc zncVar3 = znc.attached;
            if ((zncVar == zncVar3 || zncVar == zncVar2) && (channelOptions.hasModes() || channelOptions.hasParams())) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Channels.get() cannot be used to set channel options that would cause the channel to reattach. Please, use Channel.setOptions() instead.", ConnectivityType.UNKNOWN, 400));
            }
            mmcVar2.f28798q = channelOptions;
            znc zncVar4 = mmcVar2.f28786e;
            if ((zncVar4 == zncVar3 || zncVar4 == zncVar2) && (channelOptions.hasModes() || channelOptions.hasParams())) {
                mmcVar2.m29942e(true, null);
                return mmcVar2;
            }
        }
        return mmcVar2;
    }

    /* JADX INFO: renamed from: b */
    public void m94999b(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qyi qyiVar = (qyi) it.next();
            String str = qyiVar.f193906a.channel;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            ((List) map.get(str)).add(qyiVar);
        }
        for (mmc mmcVar : this.f188382a.values()) {
            znc zncVar = mmcVar.f28786e;
            String str2 = mmcVar.f28784c;
            zncVar.getClass();
            if (zncVar == znc.attaching || zncVar == znc.attached || zncVar == znc.suspended) {
                tx8.m81888c("p.y0", "reAttach(); channel = " + str2);
                if (map.containsKey(str2)) {
                    mmcVar.m29956u((List) map.get(str2));
                } else {
                    mmcVar.m29956u(null);
                }
            }
        }
    }
}
