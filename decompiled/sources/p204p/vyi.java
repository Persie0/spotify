package p204p;

import com.comscore.android.ConnectivityType;
import com.comscore.streaming.WindowState;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.cosmos.cosmos.Request;
import io.ably.lib.transport.WebSocketTransport$Factory;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ChannelMode;
import io.ably.lib.types.ChannelProperties;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ConnectionDetails;
import io.ably.lib.types.DeltaExtras;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageDecodeException;
import io.ably.lib.types.MessageExtras;
import io.ably.lib.types.ProtocolMessage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes16.dex */
public final class vyi implements iy30 {

    /* JADX INFO: renamed from: b */
    public final C2596y0 f246124b;

    /* JADX INFO: renamed from: c */
    public final C2632z f246125c;

    /* JADX INFO: renamed from: d */
    public final txi f246126d;

    /* JADX INFO: renamed from: e */
    public final WebSocketTransport$Factory f246127e;

    /* JADX INFO: renamed from: g */
    public final pyi f246129g;

    /* JADX INFO: renamed from: h */
    public final HashSet f246130h;

    /* JADX INFO: renamed from: i */
    public final jyi f246131i;

    /* JADX INFO: renamed from: j */
    public final cc30 f246132j;

    /* JADX INFO: renamed from: k */
    public final C1761d0 f246133k;

    /* JADX INFO: renamed from: l */
    public Thread f246134l;

    /* JADX INFO: renamed from: m */
    public final HashMap f246135m;

    /* JADX INFO: renamed from: n */
    public syi f246136n;

    /* JADX INFO: renamed from: o */
    public ErrorInfo f246137o;

    /* JADX INFO: renamed from: p */
    public nyi f246138p;

    /* JADX INFO: renamed from: q */
    public ky30 f246139q;

    /* JADX INFO: renamed from: r */
    public long f246140r;

    /* JADX INFO: renamed from: s */
    public long f246141s;

    /* JADX INFO: renamed from: t */
    public long f246142t;

    /* JADX INFO: renamed from: u */
    public C1761d0 f246143u;

    /* JADX INFO: renamed from: v */
    public long f246144v;

    /* JADX INFO: renamed from: w */
    public long f246145w;

    /* JADX INFO: renamed from: x */
    public int f246146x;

    /* JADX INFO: renamed from: y */
    public static final ErrorInfo f246121y = new ErrorInfo("Can't attach when not in an active state", 200, 10000);

    /* JADX INFO: renamed from: z */
    public static final ErrorInfo f246122z = new ErrorInfo("Connection temporarily unavailable", 503, 80003);

    /* JADX INFO: renamed from: A */
    public static final ErrorInfo f246117A = new ErrorInfo("Connection unavailable", 503, 80002);

    /* JADX INFO: renamed from: B */
    public static final ErrorInfo f246118B = new ErrorInfo("Connection failed", 400, 80000);

    /* JADX INFO: renamed from: C */
    public static final ErrorInfo f246119C = new ErrorInfo("Access refused", WindowState.FULL_SCREEN, ConnectivityType.ETHERNET);

    /* JADX INFO: renamed from: D */
    public static final ErrorInfo f246120D = new ErrorInfo("Connection closed; message too large", 400, ConnectivityType.UNKNOWN);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f246123a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: f */
    public final ArrayList f246128f = new ArrayList();

    public vyi(C2596y0 c2596y0, txi txiVar, C2632z c2632z, C1761d0 c1761d0) {
        pyi pyiVar = new pyi();
        pyiVar.f183409a = 0L;
        pyiVar.f183410b = new ArrayList();
        this.f246129g = pyiVar;
        this.f246130h = new HashSet();
        this.f246131i = new jyi();
        HashMap map = new HashMap();
        this.f246135m = map;
        String[] strArr = ejq.f60272a;
        this.f246144v = 120000L;
        this.f246145w = 20000L;
        this.f246146x = 0;
        this.f246124b = c2596y0;
        this.f246126d = txiVar;
        this.f246125c = c2632z;
        this.f246133k = c1761d0;
        ClientOptions clientOptions = c2596y0.f7157a;
        this.f246132j = new cc30(clientOptions.realtimeHost, "realtime.ably.io", clientOptions);
        this.f246127e = ejq.f60273b;
        wzi wziVar = wzi.initialized;
        boolean z = false;
        boolean z2 = false;
        map.put(wziVar, new lyi(this, wziVar, true, z, z2, 0L, null, 1));
        map.put(wzi.connecting, new myi(this, 2));
        map.put(wzi.connected, new myi(this, 1));
        map.put(wzi.disconnected, new myi(this, 3));
        wzi wziVar2 = wzi.suspended;
        boolean z3 = false;
        map.put(wziVar2, new lyi(this, wziVar2, z3, z, z2, clientOptions.suspendedRetryTimeout, f246117A, 2));
        map.put(wzi.closing, new myi(this, 0));
        wzi wziVar3 = wzi.closed;
        map.put(wziVar3, new lyi(this, wziVar3, z3, z, true, 0L, f246121y, 0));
        map.put(wzi.failed, new myi(this, 4));
        this.f246136n = (syi) map.get(wziVar);
        m86802v();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m86781h(ErrorInfo errorInfo) {
        if (errorInfo.code != 0) {
            if (m86782i(errorInfo)) {
                return false;
            }
            int i = errorInfo.code;
            if (i >= 40000 && i < 50000) {
                return true;
            }
        }
        int i2 = errorInfo.statusCode;
        return i2 != 0 && i2 < 500;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m86782i(ErrorInfo errorInfo) {
        int i = errorInfo.code;
        if (i < 40140 || i >= 40150) {
            return i == 80019 && errorInfo.statusCode == 401;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m86783a(hyi hyiVar) {
        this.f246131i.add(hyiVar);
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public final void m86784b(boolean z) {
        synchronized (this) {
            try {
                this.f246128f.addAll(0, (ArrayList) this.f246129g.f183410b);
                if (z) {
                    this.f246141s = 0L;
                    this.f246129g.f183409a = 0;
                } else if (!((ArrayList) this.f246129g.f183410b).isEmpty()) {
                    long jLongValue = ((qyi) ((ArrayList) this.f246129g.f183410b).get(0)).f193906a.msgSerial.longValue();
                    this.f246141s = jLongValue;
                    this.f246129g.f183409a = (int) jLongValue;
                }
                ((ArrayList) this.f246129g.f183410b).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final tyi m86785c(ErrorInfo errorInfo) {
        boolean zContains;
        if (this.f246138p != null && (errorInfo == null || errorInfo.statusCode >= 500)) {
            try {
                try {
                    zContains = new String((byte[]) this.f246124b.f7159c.m93584b(new URL("https://internet-up.ably-realtime.com/is-the-internet-up.txt"), Request.GET, null, null, new C1761d0())).contains("yes");
                } catch (IOException e) {
                    throw AblyException.fromThrowable(e);
                }
            } catch (AblyException e2) {
                tx8.m81896k(3, "p.vyi", "Exception whilst checking connectivity", e2);
                zContains = false;
            }
            if (zContains) {
                String strM32202a = this.f246132j.m32202a(this.f246138p.f117279b);
                if (strM32202a != null) {
                    tx8.m81897l("p.vyi", "checkFallback: fallback to ".concat(strM32202a));
                    String str = this.f246138p.f117279b;
                    return new tyi(wzi.connecting, null, strM32202a);
                }
            }
        }
        this.f246138p = null;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized tyi m86786d(ErrorInfo errorInfo) {
        boolean z;
        try {
            long jCurrentTimeMillis = this.f246140r - System.currentTimeMillis();
            z = jCurrentTimeMillis <= 0;
            tx8.m81897l("p.vyi", "checkSuspended: timeToSuspend = " + jCurrentTimeMillis + "ms; suspendMode = " + z);
        } catch (Throwable th) {
            throw th;
        }
        return new tyi(z ? wzi.suspended : wzi.disconnected, errorInfo, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m86787e() {
        ky30 ky30Var = this.f246139q;
        if (ky30Var != null) {
            ((yld1) ky30Var).m94159d();
            this.f246139q = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m86788f() {
        try {
            syi syiVar = this.f246136n;
            if (syiVar.f215257e || syiVar.f215253a == wzi.initialized) {
                synchronized (this) {
                    if (this.f246134l == null) {
                        Thread thread = new Thread(new iyi(this));
                        this.f246134l = thread;
                        thread.start();
                        C1761d0 c1761d0 = new C1761d0();
                        this.f246143u = c1761d0;
                        C1880g0 c1880g0 = (C1880g0) this.f246124b.f7162f.f75226a;
                        synchronized (c1880g0) {
                            ((HashSet) c1880g0.f75226a).isEmpty();
                            ((HashSet) c1880g0.f75226a).add(c1761d0);
                        }
                    }
                }
            }
            m86797q(null, new tyi(wzi.connecting, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized ArrayList m86789g() {
        ArrayList arrayList;
        Iterator it = this.f246128f.iterator();
        arrayList = new ArrayList();
        while (it.hasNext()) {
            qyi qyiVar = (qyi) it.next();
            if (qyiVar.f193906a.presence != null) {
                arrayList.add(qyiVar);
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final void m86790j(ProtocolMessage protocolMessage) {
        int i;
        qyi[] qyiVarArr;
        qyi[] qyiVarArr2;
        pyi pyiVar = this.f246129g;
        long jLongValue = protocolMessage.msgSerial.longValue();
        int i2 = protocolMessage.count;
        ErrorInfo errorInfo = protocolMessage.error;
        synchronized (pyiVar) {
            try {
                long j = pyiVar.f183409a;
                if (jLongValue < j) {
                    i2 -= (int) (j - jLongValue);
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    jLongValue = j;
                }
                qyiVarArr = null;
                if (jLongValue > j) {
                    int i3 = (int) (jLongValue - j);
                    List listSubList = ((ArrayList) pyiVar.f183410b).subList(0, i3);
                    qyiVarArr2 = (qyi[]) listSubList.toArray(new qyi[i3]);
                    listSubList.clear();
                    pyiVar.f183409a = jLongValue;
                } else {
                    qyiVarArr2 = null;
                }
                if (jLongValue == pyiVar.f183409a) {
                    List listSubList2 = ((ArrayList) pyiVar.f183410b).subList(0, i2);
                    qyiVarArr = (qyi[]) listSubList2.toArray(new qyi[i2]);
                    listSubList2.clear();
                    pyiVar.f183409a += (long) i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qyiVarArr2 != null) {
            if (errorInfo == null) {
                errorInfo = new ErrorInfo("Unknown error", CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 50000);
            }
            for (qyi qyiVar : qyiVarArr2) {
                try {
                    uuf uufVar = qyiVar.f193907b;
                    if (uufVar != null) {
                        uufVar.onError(errorInfo);
                    }
                } catch (Throwable th2) {
                    tx8.m81890e("p.vyi", "ack(): listener exception", th2);
                }
            }
        }
        if (qyiVarArr != null) {
            for (qyi qyiVar2 : qyiVarArr) {
                try {
                    uuf uufVar2 = qyiVar2.f193907b;
                    if (uufVar2 != null) {
                        uufVar2.onSuccess();
                    }
                } catch (Throwable th3) {
                    tx8.m81890e("p.vyi", "ack(): listener exception", th3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02db  */
    /* JADX INFO: renamed from: k */
    public final void m86791k(ProtocolMessage protocolMessage) {
        mmc mmcVar;
        ErrorInfo errorInfo;
        int i;
        String str;
        ProtocolMessage.Action action;
        mmc mmcVarM94998a;
        C2632z c2632z = this.f246125c;
        c2632z.getClass();
        String str2 = protocolMessage.channel;
        synchronized (c2632z) {
            if (((C2596y0) c2632z.f277923b).f267828t.f188382a.containsKey(str2)) {
                C2632z c2632z2 = ((C2596y0) c2632z.f277923b).f267828t;
                c2632z2.getClass();
                try {
                    mmcVarM94998a = c2632z2.m94998a(str2, null);
                } catch (AblyException unused) {
                    mmcVarM94998a = null;
                }
                mmcVar = mmcVarM94998a;
            } else {
                mmcVar = null;
            }
        }
        if (mmcVar != null) {
            ErrorInfo errorInfo2 = bnc.f28782w;
            znc zncVar = znc.attached;
            xyq0 xyq0Var = mmcVar.f28785d;
            ChannelProperties channelProperties = mmcVar.f28788g;
            String str3 = mmcVar.f28784c;
            String str4 = bnc.f28783x;
            if (!tx8.m81895j(protocolMessage.channelSerial) && ((action = protocolMessage.action) == ProtocolMessage.Action.message || action == ProtocolMessage.Action.presence || action == ProtocolMessage.Action.attached)) {
                Locale locale = Locale.ROOT;
                tx8.m81897l(str4, "Setting channel serial for channelName - " + str3 + ", previous - " + channelProperties.channelSerial + ", current - " + protocolMessage.channelSerial);
                channelProperties.channelSerial = protocolMessage.channelSerial;
            }
            switch (vmc.f242756b[protocolMessage.action.ordinal()]) {
                case 1:
                    mmcVar.m29945j();
                    channelProperties.attachSerial = protocolMessage.channelSerial;
                    mmcVar.f28799r = protocolMessage.params;
                    ChannelMode.toSet(protocolMessage.flags);
                    mmcVar.f28792k = true;
                    znc zncVar2 = mmcVar.f28786e;
                    if (zncVar2 == znc.detaching || zncVar2 == znc.detached) {
                        tx8.m81897l(str4, "setAttached(): channel is in detaching state, as per RTL5k sending detach message!");
                        try {
                            mmcVar.m29950o(null);
                        } catch (AblyException e) {
                            tx8.m81890e(str4, e.getMessage(), e);
                        }
                    } else if (zncVar2 == zncVar) {
                        Locale locale2 = Locale.ROOT;
                        tx8.m81897l(str4, "Server initiated attach for channel " + str3);
                        if (!protocolMessage.hasFlag(ProtocolMessage.Flag.resumed)) {
                            xyq0Var.m92427e(protocolMessage.hasFlag(ProtocolMessage.Flag.has_presence));
                            mmcVar.m29948m(protocolMessage.error);
                        }
                    } else {
                        xyq0Var.m92427e(protocolMessage.hasFlag(ProtocolMessage.Flag.has_presence));
                        ErrorInfo errorInfo3 = protocolMessage.error;
                        protocolMessage.hasFlag(ProtocolMessage.Flag.resumed);
                        mmcVar.m29954s(zncVar, errorInfo3);
                    }
                    break;
                case 2:
                case 3:
                    int iOrdinal = mmcVar.f28786e.ordinal();
                    if (iOrdinal == 1) {
                        Locale locale3 = Locale.ROOT;
                        tx8.m81897l(str4, "Server initiated detach for channel " + str3 + " whilst attaching; moving to suspended");
                        mmcVar.m29955t(protocolMessage.error);
                        mmcVar.m29949n();
                    } else if (iOrdinal == 2) {
                        errorInfo = protocolMessage.error;
                        if (errorInfo != null) {
                            errorInfo2 = errorInfo;
                        }
                        mmcVar.m29951p(errorInfo2);
                        Locale locale4 = Locale.ROOT;
                        tx8.m81897l(str4, "Server initiated detach for channel " + str3 + "; attempting reattach");
                        try {
                            mmcVar.m29944g(false, null);
                        } catch (AblyException e2) {
                            tx8.m81890e(str4, "Attempting reattach threw exception", e2);
                            mmcVar.m29951p(e2.errorInfo);
                        }
                    } else if (iOrdinal == 3) {
                        ErrorInfo errorInfo4 = protocolMessage.error;
                        if (errorInfo4 != null) {
                            errorInfo2 = errorInfo4;
                        }
                        mmcVar.m29951p(errorInfo2);
                    } else if (iOrdinal == 6) {
                        errorInfo = protocolMessage.error;
                        if (errorInfo != null) {
                            errorInfo2 = errorInfo;
                        }
                        mmcVar.m29951p(errorInfo2);
                        Locale locale5 = Locale.ROOT;
                        tx8.m81897l(str4, "Server initiated detach for channel " + str3 + "; attempting reattach");
                        mmcVar.m29944g(false, null);
                    }
                    break;
                case 4:
                    if (mmcVar.f28786e == zncVar) {
                        tx8.m81897l(str4, "onMessage(); channel = " + str3);
                        Message[] messageArr = protocolMessage.messages;
                        Message message = messageArr[0];
                        Message message2 = messageArr[messageArr.length - 1];
                        MessageExtras messageExtras = message.extras;
                        DeltaExtras delta = messageExtras == null ? null : messageExtras.getDelta();
                        int i2 = 5;
                        if (delta == null || delta.getFrom().equals(mmcVar.f28800s)) {
                            int i3 = 0;
                            while (i3 < messageArr.length) {
                                Message message3 = messageArr[i3];
                                if (message3.connectionId == null) {
                                    message3.connectionId = protocolMessage.connectionId;
                                }
                                if (message3.timestamp == 0) {
                                    message3.timestamp = protocolMessage.timestamp;
                                }
                                if (message3.f7166id == null) {
                                    message3.f7166id = protocolMessage.f7167id + ':' + i3;
                                }
                                try {
                                    message3.decode(mmcVar.f28798q, mmcVar.f28803v);
                                } catch (MessageDecodeException e3) {
                                    ErrorInfo errorInfo5 = e3.errorInfo;
                                    if (errorInfo5.code == 40018) {
                                        Locale locale6 = Locale.ROOT;
                                        tx8.m81889d(str4, "Delta message decode failure - " + errorInfo5.message + ". Message id = " + message3.f7166id + ", channel = " + str3);
                                        if (mmcVar.f28802u) {
                                            i = 1;
                                        } else {
                                            tx8.m81896k(i2, bnc.f28783x, "Starting delta decode failure recovery process", null);
                                            i = 1;
                                            mmcVar.f28802u = true;
                                            mmcVar.m29942e(true, new umc(mmcVar));
                                        }
                                        for (int i4 = i3 + i; i4 < messageArr.length; i4++) {
                                            String str5 = messageArr[i4].f7166id;
                                            if (str5 == null) {
                                                str5 = protocolMessage.f7167id + ':' + i4;
                                            }
                                            Locale locale7 = Locale.ROOT;
                                            tx8.m81897l(str4, "Delta recovery in progress - message skipped. Message id = " + str5 + ", channel = " + str3);
                                        }
                                        this.f246126d.m81921e();
                                    }
                                    Locale locale8 = Locale.ROOT;
                                    tx8.m81889d(str4, "Message decode failure - " + errorInfo5.message + ". Message id = " + message3.f7166id + ", channel = " + str3);
                                }
                                anc ancVar = (anc) mmcVar.f28796o.get(message3.name);
                                if (ancVar != null) {
                                    ancVar.mo26486a(message3);
                                }
                                i3++;
                                i2 = 5;
                                break;
                            }
                            mmcVar.f28800s = message2.f7166id;
                            mmcVar.f28801t = protocolMessage.channelSerial;
                            for (Message message4 : messageArr) {
                                mmcVar.f28795n.mo26486a(message4);
                            }
                        } else {
                            Locale locale9 = Locale.ROOT;
                            tx8.m81889d(str4, "Delta message decode failure - previous message not available. Message id = " + message.f7166id + ", channel = " + str3);
                            if (!mmcVar.f28802u) {
                                tx8.m81896k(5, str4, "Starting delta decode failure recovery process", null);
                                mmcVar.f28802u = true;
                                mmcVar.m29942e(true, new umc(mmcVar));
                            }
                        }
                    } else {
                        String str6 = mmcVar.f28802u ? "Delta recovery in progress - message skipped." : "Message skipped on a channel that is not ATTACHED.";
                        for (Message message5 : protocolMessage.messages) {
                            tx8.m81897l(str4, String.format(str6.concat(" Message id = %s, channel = %s"), message5.f7166id, str3));
                        }
                    }
                    break;
                case 5:
                    vyq0 vyq0Var = xyq0Var.f267402d;
                    String str7 = protocolMessage.channelSerial;
                    if (tx8.m81895j(str7)) {
                        str = null;
                    } else {
                        String[] strArrSplit = str7.split(":");
                        String str8 = strArrSplit[0];
                        str = strArrSplit.length > 1 ? strArrSplit[1] : "";
                        if (vyq0Var.f246305a && !tx8.m81895j(xyq0Var.f267405g) && !xyq0Var.f267405g.equals(str8)) {
                            xyq0Var.m92424b();
                        }
                        vyq0Var.m86838e();
                        if (!tx8.m81895j(str)) {
                            xyq0Var.f267405g = str8;
                        }
                    }
                    xyq0Var.m92429g(protocolMessage);
                    if (tx8.m81895j(str7) || tx8.m81895j(str)) {
                        xyq0Var.m92424b();
                        xyq0Var.f267405g = null;
                    }
                    break;
                case 6:
                    xyq0Var.m92429g(protocolMessage);
                    break;
                case 7:
                    mmcVar.m29952q(protocolMessage.error);
                    break;
                default:
                    tx8.m81889d(str4, "onChannelMessage(): Unexpected message action (" + protocolMessage.action + ")");
                    break;
            }
        } else {
            tx8.m81889d("p.y0", "Received channel message for non-existent channel");
        }
        this.f246126d.m81921e();
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m86792l(ProtocolMessage protocolMessage) {
        try {
            this.f246124b.f7157a.recover = null;
            txi txiVar = this.f246126d;
            ErrorInfo errorInfo = protocolMessage.error;
            txiVar.getClass();
            if (this.f246126d.f224709e != null) {
                tx8.m81888c("p.vyi", "There was a connection resume");
                if (protocolMessage.connectionId.equals(this.f246126d.f224709e)) {
                    if (protocolMessage.error == null) {
                        tx8.m81888c("p.vyi", "connection has reconnected and resumed successfully");
                    } else {
                        tx8.m81888c("p.vyi", "connection resume success with non-fatal error: " + protocolMessage.error.message);
                    }
                    m86784b(false);
                } else {
                    if (protocolMessage.error != null) {
                        tx8.m81888c("p.vyi", "connection resume failed with error: " + protocolMessage.error.message);
                    } else {
                        tx8.m81888c("p.vyi", "connection resume failed without error");
                    }
                    m86784b(true);
                    this.f246125c.m94999b(m86789g());
                }
            }
            txi txiVar2 = this.f246126d;
            txiVar2.f224709e = protocolMessage.connectionId;
            ConnectionDetails connectionDetails = protocolMessage.connectionDetails;
            txiVar2.f224708d = connectionDetails.connectionKey;
            this.f246145w = connectionDetails.maxIdleInterval.longValue();
            this.f246144v = connectionDetails.connectionStateTtl.longValue();
            try {
                this.f246124b.f7160d.setClientId(connectionDetails.clientId);
                this.f246126d.m81921e();
                m86797q(null, new tyi(wzi.connected, protocolMessage.error, null));
            } catch (AblyException e) {
                m86797q(this.f246139q, new tyi(wzi.failed, e.errorInfo, null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m86793m(ProtocolMessage protocolMessage) {
        try {
            this.f246126d.f224708d = null;
            ErrorInfo errorInfo = protocolMessage.error;
            if (m86782i(errorInfo)) {
                this.f246124b.f7160d.onAuthError(errorInfo);
            }
            m86797q(this.f246139q, new tyi(m86781h(errorInfo) ? wzi.failed : wzi.disconnected, errorInfo, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m86794n(ProtocolMessage protocolMessage) {
        int i;
        qyi[] qyiVarArr;
        pyi pyiVar = this.f246129g;
        long jLongValue = protocolMessage.msgSerial.longValue();
        int i2 = protocolMessage.count;
        ErrorInfo errorInfo = protocolMessage.error;
        synchronized (pyiVar) {
            try {
                synchronized (pyiVar) {
                    long j = pyiVar.f183409a;
                    if (jLongValue != j) {
                        i2 -= (int) (j - jLongValue);
                    }
                    List listSubList = ((ArrayList) pyiVar.f183410b).subList(0, i2);
                    qyiVarArr = (qyi[]) listSubList.toArray(new qyi[i2]);
                    listSubList.clear();
                    pyiVar.f183409a += (long) i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qyiVarArr != null) {
            if (errorInfo == null) {
                errorInfo = new ErrorInfo("Unknown error", CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 50000);
            }
            for (qyi qyiVar : qyiVarArr) {
                try {
                    uuf uufVar = qyiVar.f193907b;
                    if (uufVar != null) {
                        uufVar.onError(errorInfo);
                    }
                } catch (Throwable th2) {
                    tx8.m81890e("p.vyi", "nack(): listener exception", th2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m86795o(ky30 ky30Var) {
        if (this.f246139q != ky30Var) {
            tx8.m81897l("p.vyi", "onTransportAvailable: ignoring connection event from superseded transport");
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m86796p(ky30 ky30Var, ErrorInfo errorInfo) {
        tx8.m81897l("p.vyi", "onTransportUnavailable()");
        if (this.f246139q != ky30Var) {
            tx8.m81897l("p.vyi", "onTransportUnavailable: ignoring disconnection event from superseded transport");
            return;
        }
        if (this.f246136n.f215253a == wzi.connected) {
            m86802v();
        }
        tyi tyiVarM86785c = m86785c(errorInfo);
        tyi tyiVarM86786d = null;
        if (tyiVarM86785c != null) {
            m86797q(null, tyiVarM86785c);
            return;
        }
        if (errorInfo != null) {
            if (m86781h(errorInfo)) {
                tx8.m81889d("p.vyi", "onTransportUnavailable: unexpected transport error: " + errorInfo.message);
                tyiVarM86786d = new tyi(wzi.failed, errorInfo, null);
            } else if (m86782i(errorInfo)) {
                this.f246124b.f7160d.onAuthError(errorInfo);
            }
        }
        if (tyiVarM86786d == null) {
            tyiVarM86786d = m86786d(errorInfo);
        }
        kyi kyiVar = new kyi(this, ky30Var, tyiVarM86786d, 1);
        kyiVar.m57719c();
        m86783a(kyiVar);
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m86797q(ky30 ky30Var, tyi tyiVar) {
        tx8.m81897l("p.vyi", "requestState(): requesting " + tyiVar.f224976a + "; id = " + this.f246126d.f224709e);
        m86783a(new kyi(this, ky30Var, tyiVar, 0));
    }

    /* JADX INFO: renamed from: r */
    public final void m86798r(ProtocolMessage protocolMessage, boolean z, uuf uufVar) throws AblyException {
        synchronized (this) {
            try {
                syi syiVar = this.f246136n;
                if (syiVar.f215256d) {
                    m86799s(protocolMessage, uufVar);
                } else {
                    if (!syiVar.f215255c || !z) {
                        throw AblyException.fromErrorInfo(syiVar.f215254b);
                    }
                    this.f246128f.add(new qyi(protocolMessage, uufVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m86799s(ProtocolMessage protocolMessage, uuf uufVar) {
        if (this.f246139q == null) {
            tx8.m81897l("p.vyi", "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        if (ProtocolMessage.ackRequired(protocolMessage)) {
            long j = this.f246141s;
            this.f246141s = 1 + j;
            protocolMessage.msgSerial = Long.valueOf(j);
            pyi pyiVar = this.f246129g;
            qyi qyiVar = new qyi(protocolMessage, uufVar);
            synchronized (pyiVar) {
                ((ArrayList) pyiVar.f183410b).add(qyiVar);
            }
        }
        ((yld1) this.f246139q).m94160e(protocolMessage);
    }

    /* JADX INFO: renamed from: t */
    public final void m86800t(qyi qyiVar) {
        if (this.f246139q == null) {
            tx8.m81897l("p.vyi", "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        ProtocolMessage protocolMessage = qyiVar.f193906a;
        if (ProtocolMessage.ackRequired(protocolMessage)) {
            long j = this.f246141s;
            this.f246141s = 1 + j;
            protocolMessage.msgSerial = Long.valueOf(j);
            pyi pyiVar = this.f246129g;
            synchronized (pyiVar) {
                ((ArrayList) pyiVar.f183410b).add(qyiVar);
            }
        }
        ((yld1) this.f246139q).m94160e(protocolMessage);
    }

    /* JADX INFO: renamed from: u */
    public final void m86801u(long j) {
        this.f246142t = j;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m86802v() {
        this.f246140r = System.currentTimeMillis() + this.f246144v;
    }
}
